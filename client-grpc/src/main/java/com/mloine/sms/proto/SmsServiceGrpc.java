package com.mloine.sms.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: sms.proto")
public final class SmsServiceGrpc {

  private SmsServiceGrpc() {}

  public static final String SERVICE_NAME = "sms.SmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.SmsRequest,
      com.mloine.sms.proto.SmsProto.SmsResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.mloine.sms.proto.SmsProto.SmsRequest.class,
      responseType = com.mloine.sms.proto.SmsProto.SmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.SmsRequest,
      com.mloine.sms.proto.SmsProto.SmsResponse> getSendMethod() {
    io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.SmsRequest, com.mloine.sms.proto.SmsProto.SmsResponse> getSendMethod;
    if ((getSendMethod = SmsServiceGrpc.getSendMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getSendMethod = SmsServiceGrpc.getSendMethod) == null) {
          SmsServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.mloine.sms.proto.SmsProto.SmsRequest, com.mloine.sms.proto.SmsProto.SmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mloine.sms.proto.SmsProto.SmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mloine.sms.proto.SmsProto.SmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.PhoneRequest,
      com.mloine.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPhone",
      requestType = com.mloine.sms.proto.SmsProto.PhoneRequest.class,
      responseType = com.mloine.sms.proto.SmsProto.PhoneNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.PhoneRequest,
      com.mloine.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod() {
    io.grpc.MethodDescriptor<com.mloine.sms.proto.SmsProto.PhoneRequest, com.mloine.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod;
    if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
          SmsServiceGrpc.getCreatePhoneMethod = getCreatePhoneMethod =
              io.grpc.MethodDescriptor.<com.mloine.sms.proto.SmsProto.PhoneRequest, com.mloine.sms.proto.SmsProto.PhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mloine.sms.proto.SmsProto.PhoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mloine.sms.proto.SmsProto.PhoneNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("createPhone"))
              .build();
        }
      }
    }
    return getCreatePhoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub>() {
        @java.lang.Override
        public SmsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceStub(channel, callOptions);
        }
      };
    return SmsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub>() {
        @java.lang.Override
        public SmsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceBlockingStub(channel, callOptions);
        }
      };
    return SmsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub>() {
        @java.lang.Override
        public SmsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceFutureStub(channel, callOptions);
        }
      };
    return SmsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(com.mloine.sms.proto.SmsProto.SmsRequest request,
        io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.SmsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.PhoneRequest> createPhone(
        io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreatePhoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mloine.sms.proto.SmsProto.SmsRequest,
                com.mloine.sms.proto.SmsProto.SmsResponse>(
                  this, METHODID_SEND)))
          .addMethod(
            getCreatePhoneMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.mloine.sms.proto.SmsProto.PhoneRequest,
                com.mloine.sms.proto.SmsProto.PhoneNumberResponse>(
                  this, METHODID_CREATE_PHONE)))
          .build();
    }
  }

  /**
   */
  public static final class SmsServiceStub extends io.grpc.stub.AbstractAsyncStub<SmsServiceStub> {
    private SmsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void send(com.mloine.sms.proto.SmsProto.SmsRequest request,
        io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.SmsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.PhoneRequest> createPhone(
        io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCreatePhoneMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmsServiceBlockingStub> {
    private SmsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.mloine.sms.proto.SmsProto.SmsResponse> send(
        com.mloine.sms.proto.SmsProto.SmsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmsServiceFutureStub> {
    private SmsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CREATE_PHONE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.mloine.sms.proto.SmsProto.SmsRequest) request,
              (io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.SmsResponse>) responseObserver);
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
        case METHODID_CREATE_PHONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPhone(
              (io.grpc.stub.StreamObserver<com.mloine.sms.proto.SmsProto.PhoneNumberResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mloine.sms.proto.SmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmsService");
    }
  }

  private static final class SmsServiceFileDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier {
    SmsServiceFileDescriptorSupplier() {}
  }

  private static final class SmsServiceMethodDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmsServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCreatePhoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
