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
public class ExecuteServiceGrpc {

  private ExecuteServiceGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.remote_execution.ExecuteService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest,
      com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> METHOD_EXECUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.devtools.remote_execution.ExecuteService", "Execute"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecuteServiceStub newStub(io.grpc.Channel channel) {
    return new ExecuteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecuteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExecuteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ExecuteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExecuteServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecuteService {

    /**
     * <pre>
     * Executes an action remotely.
     * </pre>
     */
    public void execute(com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ExecuteServiceImplBase implements ExecuteService, io.grpc.BindableService {

    @java.lang.Override
    public void execute(com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ExecuteServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecuteServiceBlockingClient {

    /**
     * <pre>
     * Executes an action remotely.
     * </pre>
     */
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> execute(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface ExecuteServiceFutureClient {
  }

  public static class ExecuteServiceStub extends io.grpc.stub.AbstractStub<ExecuteServiceStub>
      implements ExecuteService {
    private ExecuteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecuteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecuteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecuteServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void execute(com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request, responseObserver);
    }
  }

  public static class ExecuteServiceBlockingStub extends io.grpc.stub.AbstractStub<ExecuteServiceBlockingStub>
      implements ExecuteServiceBlockingClient {
    private ExecuteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecuteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecuteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecuteServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply> execute(
        com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_EXECUTE, getCallOptions(), request);
    }
  }

  public static class ExecuteServiceFutureStub extends io.grpc.stub.AbstractStub<ExecuteServiceFutureStub>
      implements ExecuteServiceFutureClient {
    private ExecuteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExecuteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecuteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExecuteServiceFutureStub(channel, callOptions);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractExecuteService extends ExecuteServiceImplBase {}

  private static final int METHODID_EXECUTE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExecuteService serviceImpl;
    private final int methodId;

    public MethodHandlers(ExecuteService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply>) responseObserver);
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
        METHOD_EXECUTE);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ExecuteService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_EXECUTE,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteRequest,
              com.google.devtools.build.lib.remote.RemoteProtocol.ExecuteReply>(
                serviceImpl, METHODID_EXECUTE)))
        .build();
  }
}
