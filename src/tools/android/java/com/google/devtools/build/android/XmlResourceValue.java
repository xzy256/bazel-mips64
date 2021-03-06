// Copyright 2016 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.android;

import com.google.devtools.build.android.xml.Namespaces;
import java.io.IOException;
import java.io.OutputStream;

/**
 * An {@link XmlResourceValue} is extracted from xml files in the resource 'values' directory.
 */
public interface XmlResourceValue {
  /**
   * Each XmlValue is expected to write a valid representation in xml to the writer.
   *
   * @param key The FullyQualified name for the xml resource being written.
   * @param source The source of the value to allow for proper comment annotation.
   * @param mergedDataWriter The target writer.
   */
  void write(FullyQualifiedName key, DataSource source, AndroidDataWritingVisitor mergedDataWriter);

  /** Serializes the resource value to the OutputStream and returns the bytes written. */
  int serializeTo(int sourceId, Namespaces namespaces, OutputStream out) throws IOException;

  /**
   * Combines these xml values together and returns a single value.
   * 
   * @param value Another resource to be combined with this one.
   * @return A union of the values of these two values.
   * @throws IllegalArgumentException if either value cannot combine with the other.
   */
  XmlResourceValue combineWith(XmlResourceValue value);

  /**
   * Queue up writing the resource to the given {@link AndroidResourceClassWriter}.
   * Each resource can generate one or more (in the case of styleable) fields and inner classes
   * in the R class.
   *
   * @param key The FullyQualifiedName of the resource
   * @param resourceClassWriter the R java class writer
   */
  void writeResourceToClass(
      FullyQualifiedName key,
      AndroidResourceClassWriter resourceClassWriter);

  /** Returns a representation of the xml value as a string suitable for conflict messages. */
  String asConflictStringWith(DataSource source);
}
