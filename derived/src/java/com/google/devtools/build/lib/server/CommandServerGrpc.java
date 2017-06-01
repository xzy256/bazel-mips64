package com.google.devtools.build.lib.server;

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
    comments = "Source: bazel-out/local-fastbuild/bin/src/main/protobuf/libcommand_server_java_proto_srcjar.srcjar.preprocessed/command_server.proto")
public class CommandServerGrpc {

  private CommandServerGrpc() {}

  public static final String SERVICE_NAME = "command_server.CommandServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.RunRequest,
      com.google.devtools.build.lib.server.CommandProtos.RunResponse> METHOD_RUN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "command_server.CommandServer", "Run"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.RunRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.RunResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.CancelRequest,
      com.google.devtools.build.lib.server.CommandProtos.CancelResponse> METHOD_CANCEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "command_server.CommandServer", "Cancel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.CancelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.CancelResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.build.lib.server.CommandProtos.PingRequest,
      com.google.devtools.build.lib.server.CommandProtos.PingResponse> METHOD_PING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "command_server.CommandServer", "Ping"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.PingRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.build.lib.server.CommandProtos.PingResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommandServerStub newStub(io.grpc.Channel channel) {
    return new CommandServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommandServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CommandServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommandServerFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface CommandServer {

    /**
     * <pre>
     * Run a Bazel command. See documentation of argument/return messages for
     * details.
     * </pre>
     */
    public void run(com.google.devtools.build.lib.server.CommandProtos.RunRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse> responseObserver);

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public void cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> responseObserver);

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public void ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class CommandServerImplBase implements CommandServer, io.grpc.BindableService {

    @java.lang.Override
    public void run(com.google.devtools.build.lib.server.CommandProtos.RunRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN, responseObserver);
    }

    @java.lang.Override
    public void cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL, responseObserver);
    }

    @java.lang.Override
    public void ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return CommandServerGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface CommandServerBlockingClient {

    /**
     * <pre>
     * Run a Bazel command. See documentation of argument/return messages for
     * details.
     * </pre>
     */
    public java.util.Iterator<com.google.devtools.build.lib.server.CommandProtos.RunResponse> run(
        com.google.devtools.build.lib.server.CommandProtos.RunRequest request);

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public com.google.devtools.build.lib.server.CommandProtos.CancelResponse cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request);

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public com.google.devtools.build.lib.server.CommandProtos.PingResponse ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface CommandServerFutureClient {

    /**
     * <pre>
     * Cancel a currently running Bazel command. May return before the run command
     * actually terminates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> cancel(
        com.google.devtools.build.lib.server.CommandProtos.CancelRequest request);

    /**
     * <pre>
     * Does not do anything. Used for liveness check.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.PingResponse> ping(
        com.google.devtools.build.lib.server.CommandProtos.PingRequest request);
  }

  public static class CommandServerStub extends io.grpc.stub.AbstractStub<CommandServerStub>
      implements CommandServer {
    private CommandServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServerStub(channel, callOptions);
    }

    @java.lang.Override
    public void run(com.google.devtools.build.lib.server.CommandProtos.RunRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_RUN, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }
  }

  public static class CommandServerBlockingStub extends io.grpc.stub.AbstractStub<CommandServerBlockingStub>
      implements CommandServerBlockingClient {
    private CommandServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<com.google.devtools.build.lib.server.CommandProtos.RunResponse> run(
        com.google.devtools.build.lib.server.CommandProtos.RunRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_RUN, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.server.CommandProtos.CancelResponse cancel(com.google.devtools.build.lib.server.CommandProtos.CancelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.devtools.build.lib.server.CommandProtos.PingResponse ping(com.google.devtools.build.lib.server.CommandProtos.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }
  }

  public static class CommandServerFutureStub extends io.grpc.stub.AbstractStub<CommandServerFutureStub>
      implements CommandServerFutureClient {
    private CommandServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommandServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommandServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommandServerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.CancelResponse> cancel(
        com.google.devtools.build.lib.server.CommandProtos.CancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.build.lib.server.CommandProtos.PingResponse> ping(
        com.google.devtools.build.lib.server.CommandProtos.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractCommandServer extends CommandServerImplBase {}

  private static final int METHODID_RUN = 0;
  private static final int METHODID_CANCEL = 1;
  private static final int METHODID_PING = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommandServer serviceImpl;
    private final int methodId;

    public MethodHandlers(CommandServer serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN:
          serviceImpl.run((com.google.devtools.build.lib.server.CommandProtos.RunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.RunResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.google.devtools.build.lib.server.CommandProtos.CancelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.CancelResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.google.devtools.build.lib.server.CommandProtos.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.build.lib.server.CommandProtos.PingResponse>) responseObserver);
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
        METHOD_RUN,
        METHOD_CANCEL,
        METHOD_PING);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final CommandServer serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_RUN,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.google.devtools.build.lib.server.CommandProtos.RunRequest,
              com.google.devtools.build.lib.server.CommandProtos.RunResponse>(
                serviceImpl, METHODID_RUN)))
        .addMethod(
          METHOD_CANCEL,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.server.CommandProtos.CancelRequest,
              com.google.devtools.build.lib.server.CommandProtos.CancelResponse>(
                serviceImpl, METHODID_CANCEL)))
        .addMethod(
          METHOD_PING,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.devtools.build.lib.server.CommandProtos.PingRequest,
              com.google.devtools.build.lib.server.CommandProtos.PingResponse>(
                serviceImpl, METHODID_PING)))
        .build();
  }
}
