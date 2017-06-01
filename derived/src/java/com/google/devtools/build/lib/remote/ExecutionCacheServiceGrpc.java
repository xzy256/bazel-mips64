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
public class ExecutionCacheServiceGrpc {

  private ExecutionCacheServiceGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.remote_execution.ExecutionCacheService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> METHOD_GET_CACHED_RESULT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.remote_execution.ExecutionCacheService", "GetCachedResult"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> METHOD_SET_CACHED_RESULT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.remote_execution.ExecutionCacheService", "SetCachedResult"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecutionCacheServiceStub newStub(io.grpc.Channel channel) {
    return new ExecutionCacheServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutionCacheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExecutionCacheServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutionCacheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExecutionCacheServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecutionCacheService {

    /**
     * <pre>
     * Gets results of a cached action.
     * </pre>
     */
    public void getCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> responseObserver);

    /**
     * <pre>
     * Set results of a cached action. This requires reproducible builds on
     * connected machines!
     * </pre>
     */
    public void setCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ExecutionCacheServiceImplBase implements ExecutionCacheService, io.grpc.BindableService {

    @java.lang.Override
    public void getCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CACHED_RESULT, responseObserver);
    }

    @java.lang.Override
    public void setCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_CACHED_RESULT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ExecutionCacheServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecutionCacheServiceBlockingClient {

    /**
     * <pre>
     * Gets results of a cached action.
     * </pre>
     */
    public com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply getCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request);

    /**
     * <pre>
     * Set results of a cached action. This requires reproducible builds on
     * connected machines!
     * </pre>
     */
    public com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply setCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecutionCacheServiceFutureClient {

    /**
     * <pre>
     * Gets results of a cached action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> getCachedResult(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request);

    /**
     * <pre>
     * Set results of a cached action. This requires reproducible builds on
     * connected machines!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> setCachedResult(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request);
  }

  public static class ExecutionCacheServiceStub extends io.grpc.stub.AbstractStub<ExecutionCacheServiceStub>
      implements ExecutionCacheService {
    private ExecutionCacheServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecutionCacheServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionCacheServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecutionCacheServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CACHED_RESULT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void setCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_CACHED_RESULT, getCallOptions()), request, responseObserver);
    }
  }

  public static class ExecutionCacheServiceBlockingStub extends io.grpc.stub.AbstractStub<ExecutionCacheServiceBlockingStub>
      implements ExecutionCacheServiceBlockingClient {
    private ExecutionCacheServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecutionCacheServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionCacheServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecutionCacheServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply getCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CACHED_RESULT, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply setCachedResult(com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_CACHED_RESULT, getCallOptions(), request);
    }
  }

  public static class ExecutionCacheServiceFutureStub extends io.grpc.stub.AbstractStub<ExecutionCacheServiceFutureStub>
      implements ExecutionCacheServiceFutureClient {
    private ExecutionCacheServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecutionCacheServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutionCacheServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecutionCacheServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply> getCachedResult(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CACHED_RESULT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply> setCachedResult(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_CACHED_RESULT, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractExecutionCacheService extends ExecutionCacheServiceImplBase {}

  private static final int METHODID_GET_CACHED_RESULT = 0;
  private static final int METHODID_SET_CACHED_RESULT = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExecutionCacheService serviceImpl;
    private final int methodId;

    public MethodHandlers(ExecutionCacheService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CACHED_RESULT:
          serviceImpl.getCachedResult((com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply>) responseObserver);
          break;
        case METHODID_SET_CACHED_RESULT:
          serviceImpl.setCachedResult((com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_CACHED_RESULT,
        METHOD_SET_CACHED_RESULT);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ExecutionCacheService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_CACHED_RESULT,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheReply>(
                serviceImpl, METHODID_GET_CACHED_RESULT)))
        .addMethod(
          METHOD_SET_CACHED_RESULT,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecutionCacheSetReply>(
                serviceImpl, METHODID_SET_CACHED_RESULT)))
        .build();
  }
}
