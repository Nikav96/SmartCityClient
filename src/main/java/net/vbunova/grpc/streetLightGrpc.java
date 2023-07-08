package net.vbunova.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: streetLight.proto")
public final class streetLightGrpc {

  private streetLightGrpc() {}

  public static final String SERVICE_NAME = "streetLight";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ActivateLightsRequest,
      net.vbunova.grpc.StreetLight.ActivateLightsResponse> getActivateLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateLights",
      requestType = net.vbunova.grpc.StreetLight.ActivateLightsRequest.class,
      responseType = net.vbunova.grpc.StreetLight.ActivateLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ActivateLightsRequest,
      net.vbunova.grpc.StreetLight.ActivateLightsResponse> getActivateLightsMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ActivateLightsRequest, net.vbunova.grpc.StreetLight.ActivateLightsResponse> getActivateLightsMethod;
    if ((getActivateLightsMethod = streetLightGrpc.getActivateLightsMethod) == null) {
      synchronized (streetLightGrpc.class) {
        if ((getActivateLightsMethod = streetLightGrpc.getActivateLightsMethod) == null) {
          streetLightGrpc.getActivateLightsMethod = getActivateLightsMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.StreetLight.ActivateLightsRequest, net.vbunova.grpc.StreetLight.ActivateLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "streetLight", "activateLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.ActivateLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.ActivateLightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new streetLightMethodDescriptorSupplier("activateLights"))
                  .build();
          }
        }
     }
     return getActivateLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest,
      net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> getGetLightsRealtimeMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLightsRealtimeMap",
      requestType = net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest.class,
      responseType = net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest,
      net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> getGetLightsRealtimeMapMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest, net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> getGetLightsRealtimeMapMethod;
    if ((getGetLightsRealtimeMapMethod = streetLightGrpc.getGetLightsRealtimeMapMethod) == null) {
      synchronized (streetLightGrpc.class) {
        if ((getGetLightsRealtimeMapMethod = streetLightGrpc.getGetLightsRealtimeMapMethod) == null) {
          streetLightGrpc.getGetLightsRealtimeMapMethod = getGetLightsRealtimeMapMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest, net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "streetLight", "getLightsRealtimeMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new streetLightMethodDescriptorSupplier("getLightsRealtimeMap"))
                  .build();
          }
        }
     }
     return getGetLightsRealtimeMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shareSpeedAndRoute",
      requestType = net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest.class,
      responseType = net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest, net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;
    if ((getShareSpeedAndRouteMethod = streetLightGrpc.getShareSpeedAndRouteMethod) == null) {
      synchronized (streetLightGrpc.class) {
        if ((getShareSpeedAndRouteMethod = streetLightGrpc.getShareSpeedAndRouteMethod) == null) {
          streetLightGrpc.getShareSpeedAndRouteMethod = getShareSpeedAndRouteMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest, net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "streetLight", "shareSpeedAndRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new streetLightMethodDescriptorSupplier("shareSpeedAndRoute"))
                  .build();
          }
        }
     }
     return getShareSpeedAndRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.SendChatMessageRequest,
      net.vbunova.grpc.StreetLight.SendChatMessageResponse> getSendChatMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendChatMessage",
      requestType = net.vbunova.grpc.StreetLight.SendChatMessageRequest.class,
      responseType = net.vbunova.grpc.StreetLight.SendChatMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.SendChatMessageRequest,
      net.vbunova.grpc.StreetLight.SendChatMessageResponse> getSendChatMessageMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.StreetLight.SendChatMessageRequest, net.vbunova.grpc.StreetLight.SendChatMessageResponse> getSendChatMessageMethod;
    if ((getSendChatMessageMethod = streetLightGrpc.getSendChatMessageMethod) == null) {
      synchronized (streetLightGrpc.class) {
        if ((getSendChatMessageMethod = streetLightGrpc.getSendChatMessageMethod) == null) {
          streetLightGrpc.getSendChatMessageMethod = getSendChatMessageMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.StreetLight.SendChatMessageRequest, net.vbunova.grpc.StreetLight.SendChatMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "streetLight", "sendChatMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.SendChatMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.StreetLight.SendChatMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new streetLightMethodDescriptorSupplier("sendChatMessage"))
                  .build();
          }
        }
     }
     return getSendChatMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static streetLightStub newStub(io.grpc.Channel channel) {
    return new streetLightStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static streetLightBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new streetLightBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static streetLightFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new streetLightFutureStub(channel);
  }

  /**
   */
  public static abstract class streetLightImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateLights(net.vbunova.grpc.StreetLight.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ActivateLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateLightsMethod(), responseObserver);
    }

    /**
     */
    public void getLightsRealtimeMap(net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLightsRealtimeMapMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getShareSpeedAndRouteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.SendChatMessageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendChatMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.StreetLight.ActivateLightsRequest,
                net.vbunova.grpc.StreetLight.ActivateLightsResponse>(
                  this, METHODID_ACTIVATE_LIGHTS)))
          .addMethod(
            getGetLightsRealtimeMapMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest,
                net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse>(
                  this, METHODID_GET_LIGHTS_REALTIME_MAP)))
          .addMethod(
            getShareSpeedAndRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest,
                net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse>(
                  this, METHODID_SHARE_SPEED_AND_ROUTE)))
          .addMethod(
            getSendChatMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.StreetLight.SendChatMessageRequest,
                net.vbunova.grpc.StreetLight.SendChatMessageResponse>(
                  this, METHODID_SEND_CHAT_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class streetLightStub extends io.grpc.stub.AbstractStub<streetLightStub> {
    private streetLightStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightStub(channel, callOptions);
    }

    /**
     */
    public void activateLights(net.vbunova.grpc.StreetLight.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ActivateLightsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLightsRealtimeMap(net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetLightsRealtimeMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getShareSpeedAndRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.SendChatMessageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class streetLightBlockingStub extends io.grpc.stub.AbstractStub<streetLightBlockingStub> {
    private streetLightBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.StreetLight.ActivateLightsResponse activateLights(net.vbunova.grpc.StreetLight.ActivateLightsRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse> getLightsRealtimeMap(
        net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetLightsRealtimeMapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class streetLightFutureStub extends io.grpc.stub.AbstractStub<streetLightFutureStub> {
    private streetLightFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private streetLightFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected streetLightFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new streetLightFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.StreetLight.ActivateLightsResponse> activateLights(
        net.vbunova.grpc.StreetLight.ActivateLightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_LIGHTS = 0;
  private static final int METHODID_GET_LIGHTS_REALTIME_MAP = 1;
  private static final int METHODID_SHARE_SPEED_AND_ROUTE = 2;
  private static final int METHODID_SEND_CHAT_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final streetLightImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(streetLightImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_LIGHTS:
          serviceImpl.activateLights((net.vbunova.grpc.StreetLight.ActivateLightsRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ActivateLightsResponse>) responseObserver);
          break;
        case METHODID_GET_LIGHTS_REALTIME_MAP:
          serviceImpl.getLightsRealtimeMap((net.vbunova.grpc.StreetLight.LightsRealtimeMapRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.LightsRealtimeMapResponse>) responseObserver);
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
        case METHODID_SHARE_SPEED_AND_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.shareSpeedAndRoute(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.ShareSpeedAndRouteResponse>) responseObserver);
        case METHODID_SEND_CHAT_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendChatMessage(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.StreetLight.SendChatMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class streetLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    streetLightBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.StreetLight.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("streetLight");
    }
  }

  private static final class streetLightFileDescriptorSupplier
      extends streetLightBaseDescriptorSupplier {
    streetLightFileDescriptorSupplier() {}
  }

  private static final class streetLightMethodDescriptorSupplier
      extends streetLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    streetLightMethodDescriptorSupplier(String methodName) {
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
      synchronized (streetLightGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new streetLightFileDescriptorSupplier())
              .addMethod(getActivateLightsMethod())
              .addMethod(getGetLightsRealtimeMapMethod())
              .addMethod(getShareSpeedAndRouteMethod())
              .addMethod(getSendChatMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
