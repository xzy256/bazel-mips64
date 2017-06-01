package com.google.devtools.build.lib.remote;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: bazel-out/local-fastbuild/bin/src/main/protobuf/libremote_protocol_java_proto_srcjar.srcjar.preprocessed/remote_protocol.proto")
public class CasServiceGrpc {

  private CasServiceGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.remote_execution.CasService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> METHOD_LOOKUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "Lookup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> METHOD_UPLOAD_TREE_METADATA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "UploadTreeMetadata"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply> METHOD_UPLOAD_BLOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "UploadBlob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> METHOD_DOWNLOAD_TREE_METADATA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "DownloadTreeMetadata"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> METHOD_DOWNLOAD_TREE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "DownloadTree"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> METHOD_DOWNLOAD_BLOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.devtools.remote_execution.CasService", "DownloadBlob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CasServiceStub newStub(io.grpc.Channel channel) {
    return new CasServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CasServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CasServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CasServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CasServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface CasService {

    /**
     * <pre>
     * Looks up given content keys in CAS, and returns success when found.
     * The single returned status will have the potentially missing digests,
     * which need to be re-uploaded.
     * </pre>
     */
    public void lookup(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> responseObserver);

    /**
     * <pre>
     * Uploads a directory tree into CAS. Not streamed, because it is only tree
     * metadata.
     * </pre>
     */
    public void uploadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> responseObserver);

    /**
     * <pre>
     * Uploads data blob(s) into CAS.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest> uploadBlob(
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply> responseObserver);

    /**
     * <pre>
     * Downoads a directory tree metadata from CAS.
     * </pre>
     */
    public void downloadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> responseObserver);

    /**
     * <pre>
     * Downoads a directory tree from CAS. Returns the entire root directory.
     * </pre>
     */
    public void downloadTree(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver);

    /**
     * <pre>
     * Downoads data blob(s) from CAS, returns them.
     * </pre>
     */
    public void downloadBlob(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class CasServiceImplBase implements CasService, io.grpc.BindableService {

    @java.lang.Override
    public void lookup(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOOKUP, responseObserver);
    }

    @java.lang.Override
    public void uploadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD_TREE_METADATA, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest> uploadBlob(
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_UPLOAD_BLOB, responseObserver);
    }

    @java.lang.Override
    public void downloadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLOAD_TREE_METADATA, responseObserver);
    }

    @java.lang.Override
    public void downloadTree(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLOAD_TREE, responseObserver);
    }

    @java.lang.Override
    public void downloadBlob(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLOAD_BLOB, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return CasServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface CasServiceBlockingClient {

    /**
     * <pre>
     * Looks up given content keys in CAS, and returns success when found.
     * The single returned status will have the potentially missing digests,
     * which need to be re-uploaded.
     * </pre>
     */
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply lookup(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request);

    /**
     * <pre>
     * Uploads a directory tree into CAS. Not streamed, because it is only tree
     * metadata.
     * </pre>
     */
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply uploadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request);

    /**
     * <pre>
     * Downoads a directory tree metadata from CAS.
     * </pre>
     */
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply downloadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request);

    /**
     * <pre>
     * Downoads a directory tree from CAS. Returns the entire root directory.
     * </pre>
     */
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> downloadTree(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest request);

    /**
     * <pre>
     * Downoads data blob(s) from CAS, returns them.
     * </pre>
     */
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> downloadBlob(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface CasServiceFutureClient {

    /**
     * <pre>
     * Looks up given content keys in CAS, and returns success when found.
     * The single returned status will have the potentially missing digests,
     * which need to be re-uploaded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> lookup(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request);

    /**
     * <pre>
     * Uploads a directory tree into CAS. Not streamed, because it is only tree
     * metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> uploadTreeMetadata(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request);

    /**
     * <pre>
     * Downoads a directory tree metadata from CAS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> downloadTreeMetadata(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request);
  }

  public static class CasServiceStub extends io.grpc.stub.AbstractStub<CasServiceStub>
      implements CasService {
    private CasServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CasServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CasServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CasServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void lookup(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void uploadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_TREE_METADATA, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest> uploadBlob(
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_UPLOAD_BLOB, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void downloadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DOWNLOAD_TREE_METADATA, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void downloadTree(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_DOWNLOAD_TREE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void downloadBlob(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_DOWNLOAD_BLOB, getCallOptions()), request, responseObserver);
    }
  }

  public static class CasServiceBlockingStub extends io.grpc.stub.AbstractStub<CasServiceBlockingStub>
      implements CasServiceBlockingClient {
    private CasServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CasServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CasServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CasServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply lookup(com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOOKUP, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply uploadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLOAD_TREE_METADATA, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply downloadTreeMetadata(com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DOWNLOAD_TREE_METADATA, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> downloadTree(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_DOWNLOAD_TREE, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply> downloadBlob(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_DOWNLOAD_BLOB, getCallOptions(), request);
    }
  }

  public static class CasServiceFutureStub extends io.grpc.stub.AbstractStub<CasServiceFutureStub>
      implements CasServiceFutureClient {
    private CasServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CasServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CasServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CasServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply> lookup(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply> uploadTreeMetadata(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_TREE_METADATA, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply> downloadTreeMetadata(
        com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DOWNLOAD_TREE_METADATA, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractCasService extends CasServiceImplBase {}

  private static final int METHODID_LOOKUP = 0;
  private static final int METHODID_UPLOAD_TREE_METADATA = 1;
  private static final int METHODID_DOWNLOAD_TREE_METADATA = 2;
  private static final int METHODID_DOWNLOAD_TREE = 3;
  private static final int METHODID_DOWNLOAD_BLOB = 4;
  private static final int METHODID_UPLOAD_BLOB = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CasService serviceImpl;
    private final int methodId;

    public MethodHandlers(CasService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOOKUP:
          serviceImpl.lookup((com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply>) responseObserver);
          break;
        case METHODID_UPLOAD_TREE_METADATA:
          serviceImpl.uploadTreeMetadata((com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply>) responseObserver);
          break;
        case METHODID_DOWNLOAD_TREE_METADATA:
          serviceImpl.downloadTreeMetadata((com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply>) responseObserver);
          break;
        case METHODID_DOWNLOAD_TREE:
          serviceImpl.downloadTree((com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply>) responseObserver);
          break;
        case METHODID_DOWNLOAD_BLOB:
          serviceImpl.downloadBlob((com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_BLOB:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadBlob(
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_LOOKUP,
        METHOD_UPLOAD_TREE_METADATA,
        METHOD_UPLOAD_BLOB,
        METHOD_DOWNLOAD_TREE_METADATA,
        METHOD_DOWNLOAD_TREE,
        METHOD_DOWNLOAD_BLOB);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final CasService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_LOOKUP,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasLookupReply>(
                serviceImpl, METHODID_LOOKUP)))
        .addMethod(
          METHOD_UPLOAD_TREE_METADATA,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadTreeMetadataReply>(
                serviceImpl, METHODID_UPLOAD_TREE_METADATA)))
        .addMethod(
          METHOD_UPLOAD_BLOB,
          asyncClientStreamingCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasUploadBlobReply>(
                serviceImpl, METHODID_UPLOAD_BLOB)))
        .addMethod(
          METHOD_DOWNLOAD_TREE_METADATA,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeMetadataReply>(
                serviceImpl, METHODID_DOWNLOAD_TREE_METADATA)))
        .addMethod(
          METHOD_DOWNLOAD_TREE,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadTreeRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply>(
                serviceImpl, METHODID_DOWNLOAD_TREE)))
        .addMethod(
          METHOD_DOWNLOAD_BLOB,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadBlobRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.CasDownloadReply>(
                serviceImpl, METHODID_DOWNLOAD_BLOB)))
        .build();
  }
}
