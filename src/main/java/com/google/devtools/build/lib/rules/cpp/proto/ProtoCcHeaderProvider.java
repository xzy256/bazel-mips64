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

package com.google.devtools.build.lib.rules.cpp.proto;

import com.google.devtools.build.lib.actions.Artifact;
import com.google.devtools.build.lib.analysis.TransitiveInfoProvider;
import com.google.devtools.build.lib.collect.nestedset.NestedSet;

/** Provides information about generated C++ headers of dependencies. */
public final class ProtoCcHeaderProvider implements TransitiveInfoProvider {
  private final NestedSet<Artifact> headers;

  public ProtoCcHeaderProvider(NestedSet<Artifact> headers) {
    this.headers = headers;
  }

  /**
   * @return the headers of the proto library for C++.
   *     <p>Normally these are the headers generated by the proto compiler for C++; only in case of
   *     a proto_library with blacklisted srcs will these be files from the source tree.
   */
  public NestedSet<Artifact> getHeaders() {
    return headers;
  }
}