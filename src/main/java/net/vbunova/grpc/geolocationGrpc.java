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
    comments = "Source: geolocation.proto")
public final class geolocationGrpc {

  private geolocationGrpc() {}

  public static final String SERVICE_NAME = "geolocation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.LocationRequest,
      net.vbunova.grpc.Geolocation.LocationRequestResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocation",
      requestType = net.vbunova.grpc.Geolocation.LocationRequest.class,
      responseType = net.vbunova.grpc.Geolocation.LocationRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.LocationRequest,
      net.vbunova.grpc.Geolocation.LocationRequestResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.LocationRequest, net.vbunova.grpc.Geolocation.LocationRequestResponse> getGetLocationMethod;
    if ((getGetLocationMethod = geolocationGrpc.getGetLocationMethod) == null) {
      synchronized (geolocationGrpc.class) {
        if ((getGetLocationMethod = geolocationGrpc.getGetLocationMethod) == null) {
          geolocationGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Geolocation.LocationRequest, net.vbunova.grpc.Geolocation.LocationRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "geolocation", "getLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.LocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.LocationRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationMethodDescriptorSupplier("getLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.NearbyVehiclesRequest,
      net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNearbyVehicles",
      requestType = net.vbunova.grpc.Geolocation.NearbyVehiclesRequest.class,
      responseType = net.vbunova.grpc.Geolocation.NearbyVehiclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.NearbyVehiclesRequest,
      net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> getGetNearbyVehiclesMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.NearbyVehiclesRequest, net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;
    if ((getGetNearbyVehiclesMethod = geolocationGrpc.getGetNearbyVehiclesMethod) == null) {
      synchronized (geolocationGrpc.class) {
        if ((getGetNearbyVehiclesMethod = geolocationGrpc.getGetNearbyVehiclesMethod) == null) {
          geolocationGrpc.getGetNearbyVehiclesMethod = getGetNearbyVehiclesMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Geolocation.NearbyVehiclesRequest, net.vbunova.grpc.Geolocation.NearbyVehiclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocation", "getNearbyVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.NearbyVehiclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.NearbyVehiclesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationMethodDescriptorSupplier("getNearbyVehicles"))
                  .build();
          }
        }
     }
     return getGetNearbyVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shareSpeedAndRoute",
      requestType = net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest.class,
      responseType = net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest, net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;
    if ((getShareSpeedAndRouteMethod = geolocationGrpc.getShareSpeedAndRouteMethod) == null) {
      synchronized (geolocationGrpc.class) {
        if ((getShareSpeedAndRouteMethod = geolocationGrpc.getShareSpeedAndRouteMethod) == null) {
          geolocationGrpc.getShareSpeedAndRouteMethod = getShareSpeedAndRouteMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest, net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocation", "shareSpeedAndRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationMethodDescriptorSupplier("shareSpeedAndRoute"))
                  .build();
          }
        }
     }
     return getShareSpeedAndRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.SendChatMessageRequest,
      net.vbunova.grpc.Geolocation.SendChatMessageResponse> getSendChatMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendChatMessage",
      requestType = net.vbunova.grpc.Geolocation.SendChatMessageRequest.class,
      responseType = net.vbunova.grpc.Geolocation.SendChatMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.SendChatMessageRequest,
      net.vbunova.grpc.Geolocation.SendChatMessageResponse> getSendChatMessageMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Geolocation.SendChatMessageRequest, net.vbunova.grpc.Geolocation.SendChatMessageResponse> getSendChatMessageMethod;
    if ((getSendChatMessageMethod = geolocationGrpc.getSendChatMessageMethod) == null) {
      synchronized (geolocationGrpc.class) {
        if ((getSendChatMessageMethod = geolocationGrpc.getSendChatMessageMethod) == null) {
          geolocationGrpc.getSendChatMessageMethod = getSendChatMessageMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Geolocation.SendChatMessageRequest, net.vbunova.grpc.Geolocation.SendChatMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "geolocation", "sendChatMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.SendChatMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Geolocation.SendChatMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new geolocationMethodDescriptorSupplier("sendChatMessage"))
                  .build();
          }
        }
     }
     return getSendChatMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static geolocationStub newStub(io.grpc.Channel channel) {
    return new geolocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static geolocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new geolocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static geolocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new geolocationFutureStub(channel);
  }

  /**
   */
  public static abstract class geolocationImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLocation(net.vbunova.grpc.Geolocation.LocationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.LocationRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void getNearbyVehicles(net.vbunova.grpc.Geolocation.NearbyVehiclesRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNearbyVehiclesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getShareSpeedAndRouteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.SendChatMessageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendChatMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.Geolocation.LocationRequest,
                net.vbunova.grpc.Geolocation.LocationRequestResponse>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getGetNearbyVehiclesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Geolocation.NearbyVehiclesRequest,
                net.vbunova.grpc.Geolocation.NearbyVehiclesResponse>(
                  this, METHODID_GET_NEARBY_VEHICLES)))
          .addMethod(
            getShareSpeedAndRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest,
                net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse>(
                  this, METHODID_SHARE_SPEED_AND_ROUTE)))
          .addMethod(
            getSendChatMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Geolocation.SendChatMessageRequest,
                net.vbunova.grpc.Geolocation.SendChatMessageResponse>(
                  this, METHODID_SEND_CHAT_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class geolocationStub extends io.grpc.stub.AbstractStub<geolocationStub> {
    private geolocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationStub(channel, callOptions);
    }

    /**
     */
    public void getLocation(net.vbunova.grpc.Geolocation.LocationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.LocationRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNearbyVehicles(net.vbunova.grpc.Geolocation.NearbyVehiclesRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetNearbyVehiclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteRequest> shareSpeedAndRoute(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getShareSpeedAndRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.SendChatMessageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class geolocationBlockingStub extends io.grpc.stub.AbstractStub<geolocationBlockingStub> {
    private geolocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.Geolocation.LocationRequestResponse getLocation(net.vbunova.grpc.Geolocation.LocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.vbunova.grpc.Geolocation.NearbyVehiclesResponse> getNearbyVehicles(
        net.vbunova.grpc.Geolocation.NearbyVehiclesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetNearbyVehiclesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class geolocationFutureStub extends io.grpc.stub.AbstractStub<geolocationFutureStub> {
    private geolocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private geolocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected geolocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new geolocationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.Geolocation.LocationRequestResponse> getLocation(
        net.vbunova.grpc.Geolocation.LocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION = 0;
  private static final int METHODID_GET_NEARBY_VEHICLES = 1;
  private static final int METHODID_SHARE_SPEED_AND_ROUTE = 2;
  private static final int METHODID_SEND_CHAT_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final geolocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(geolocationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((net.vbunova.grpc.Geolocation.LocationRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.LocationRequestResponse>) responseObserver);
          break;
        case METHODID_GET_NEARBY_VEHICLES:
          serviceImpl.getNearbyVehicles((net.vbunova.grpc.Geolocation.NearbyVehiclesRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.NearbyVehiclesResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.ShareSpeedAndRouteResponse>) responseObserver);
        case METHODID_SEND_CHAT_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendChatMessage(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Geolocation.SendChatMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class geolocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    geolocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.Geolocation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("geolocation");
    }
  }

  private static final class geolocationFileDescriptorSupplier
      extends geolocationBaseDescriptorSupplier {
    geolocationFileDescriptorSupplier() {}
  }

  private static final class geolocationMethodDescriptorSupplier
      extends geolocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    geolocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (geolocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new geolocationFileDescriptorSupplier())
              .addMethod(getGetLocationMethod())
              .addMethod(getGetNearbyVehiclesMethod())
              .addMethod(getShareSpeedAndRouteMethod())
              .addMethod(getSendChatMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
