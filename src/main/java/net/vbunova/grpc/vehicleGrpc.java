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
    comments = "Source: vehicle.proto")
public final class vehicleGrpc {

  private vehicleGrpc() {}

  public static final String SERVICE_NAME = "vehicle";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.VehicleInformationRequest,
      net.vbunova.grpc.Vehicle.VehicleInformationResponse> getGetVehicleInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicleInformation",
      requestType = net.vbunova.grpc.Vehicle.VehicleInformationRequest.class,
      responseType = net.vbunova.grpc.Vehicle.VehicleInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.VehicleInformationRequest,
      net.vbunova.grpc.Vehicle.VehicleInformationResponse> getGetVehicleInformationMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.VehicleInformationRequest, net.vbunova.grpc.Vehicle.VehicleInformationResponse> getGetVehicleInformationMethod;
    if ((getGetVehicleInformationMethod = vehicleGrpc.getGetVehicleInformationMethod) == null) {
      synchronized (vehicleGrpc.class) {
        if ((getGetVehicleInformationMethod = vehicleGrpc.getGetVehicleInformationMethod) == null) {
          vehicleGrpc.getGetVehicleInformationMethod = getGetVehicleInformationMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Vehicle.VehicleInformationRequest, net.vbunova.grpc.Vehicle.VehicleInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "vehicle", "getVehicleInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.VehicleInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.VehicleInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new vehicleMethodDescriptorSupplier("getVehicleInformation"))
                  .build();
          }
        }
     }
     return getGetVehicleInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shareSpeedAndRoute",
      requestType = net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest.class,
      responseType = net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest,
      net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest, net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> getShareSpeedAndRouteMethod;
    if ((getShareSpeedAndRouteMethod = vehicleGrpc.getShareSpeedAndRouteMethod) == null) {
      synchronized (vehicleGrpc.class) {
        if ((getShareSpeedAndRouteMethod = vehicleGrpc.getShareSpeedAndRouteMethod) == null) {
          vehicleGrpc.getShareSpeedAndRouteMethod = getShareSpeedAndRouteMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest, net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vehicle", "shareSpeedAndRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new vehicleMethodDescriptorSupplier("shareSpeedAndRoute"))
                  .build();
          }
        }
     }
     return getShareSpeedAndRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest,
      net.vbunova.grpc.Vehicle.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNearbyVehicles",
      requestType = net.vbunova.grpc.Vehicle.NearbyVehiclesRequest.class,
      responseType = net.vbunova.grpc.Vehicle.NearbyVehiclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest,
      net.vbunova.grpc.Vehicle.NearbyVehiclesResponse> getGetNearbyVehiclesMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest, net.vbunova.grpc.Vehicle.NearbyVehiclesResponse> getGetNearbyVehiclesMethod;
    if ((getGetNearbyVehiclesMethod = vehicleGrpc.getGetNearbyVehiclesMethod) == null) {
      synchronized (vehicleGrpc.class) {
        if ((getGetNearbyVehiclesMethod = vehicleGrpc.getGetNearbyVehiclesMethod) == null) {
          vehicleGrpc.getGetNearbyVehiclesMethod = getGetNearbyVehiclesMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest, net.vbunova.grpc.Vehicle.NearbyVehiclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vehicle", "getNearbyVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.NearbyVehiclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.NearbyVehiclesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new vehicleMethodDescriptorSupplier("getNearbyVehicles"))
                  .build();
          }
        }
     }
     return getGetNearbyVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.SendChatMessageRequest,
      net.vbunova.grpc.Vehicle.SendChatMessageResponse> getSendChatMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendChatMessage",
      requestType = net.vbunova.grpc.Vehicle.SendChatMessageRequest.class,
      responseType = net.vbunova.grpc.Vehicle.SendChatMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.SendChatMessageRequest,
      net.vbunova.grpc.Vehicle.SendChatMessageResponse> getSendChatMessageMethod() {
    io.grpc.MethodDescriptor<net.vbunova.grpc.Vehicle.SendChatMessageRequest, net.vbunova.grpc.Vehicle.SendChatMessageResponse> getSendChatMessageMethod;
    if ((getSendChatMessageMethod = vehicleGrpc.getSendChatMessageMethod) == null) {
      synchronized (vehicleGrpc.class) {
        if ((getSendChatMessageMethod = vehicleGrpc.getSendChatMessageMethod) == null) {
          vehicleGrpc.getSendChatMessageMethod = getSendChatMessageMethod = 
              io.grpc.MethodDescriptor.<net.vbunova.grpc.Vehicle.SendChatMessageRequest, net.vbunova.grpc.Vehicle.SendChatMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "vehicle", "sendChatMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.SendChatMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.vbunova.grpc.Vehicle.SendChatMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new vehicleMethodDescriptorSupplier("sendChatMessage"))
                  .build();
          }
        }
     }
     return getSendChatMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static vehicleStub newStub(io.grpc.Channel channel) {
    return new vehicleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static vehicleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new vehicleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static vehicleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new vehicleFutureStub(channel);
  }

  /**
   */
  public static abstract class vehicleImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicleInformation(net.vbunova.grpc.Vehicle.VehicleInformationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.VehicleInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleInformationMethod(), responseObserver);
    }

    /**
     */
    public void shareSpeedAndRoute(net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShareSpeedAndRouteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest> getNearbyVehicles(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.NearbyVehiclesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetNearbyVehiclesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.SendChatMessageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendChatMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.vbunova.grpc.Vehicle.VehicleInformationRequest,
                net.vbunova.grpc.Vehicle.VehicleInformationResponse>(
                  this, METHODID_GET_VEHICLE_INFORMATION)))
          .addMethod(
            getShareSpeedAndRouteMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest,
                net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse>(
                  this, METHODID_SHARE_SPEED_AND_ROUTE)))
          .addMethod(
            getGetNearbyVehiclesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Vehicle.NearbyVehiclesRequest,
                net.vbunova.grpc.Vehicle.NearbyVehiclesResponse>(
                  this, METHODID_GET_NEARBY_VEHICLES)))
          .addMethod(
            getSendChatMessageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.vbunova.grpc.Vehicle.SendChatMessageRequest,
                net.vbunova.grpc.Vehicle.SendChatMessageResponse>(
                  this, METHODID_SEND_CHAT_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class vehicleStub extends io.grpc.stub.AbstractStub<vehicleStub> {
    private vehicleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleStub(channel, callOptions);
    }

    /**
     */
    public void getVehicleInformation(net.vbunova.grpc.Vehicle.VehicleInformationRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.VehicleInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shareSpeedAndRoute(net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest request,
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getShareSpeedAndRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.NearbyVehiclesRequest> getNearbyVehicles(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.NearbyVehiclesResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetNearbyVehiclesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.SendChatMessageRequest> sendChatMessage(
        io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.SendChatMessageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendChatMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class vehicleBlockingStub extends io.grpc.stub.AbstractStub<vehicleBlockingStub> {
    private vehicleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.vbunova.grpc.Vehicle.VehicleInformationResponse getVehicleInformation(net.vbunova.grpc.Vehicle.VehicleInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse> shareSpeedAndRoute(
        net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getShareSpeedAndRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class vehicleFutureStub extends io.grpc.stub.AbstractStub<vehicleFutureStub> {
    private vehicleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private vehicleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected vehicleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new vehicleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.vbunova.grpc.Vehicle.VehicleInformationResponse> getVehicleInformation(
        net.vbunova.grpc.Vehicle.VehicleInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE_INFORMATION = 0;
  private static final int METHODID_SHARE_SPEED_AND_ROUTE = 1;
  private static final int METHODID_GET_NEARBY_VEHICLES = 2;
  private static final int METHODID_SEND_CHAT_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final vehicleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(vehicleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE_INFORMATION:
          serviceImpl.getVehicleInformation((net.vbunova.grpc.Vehicle.VehicleInformationRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.VehicleInformationResponse>) responseObserver);
          break;
        case METHODID_SHARE_SPEED_AND_ROUTE:
          serviceImpl.shareSpeedAndRoute((net.vbunova.grpc.Vehicle.ShareSpeedAndRouteRequest) request,
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.ShareSpeedAndRouteResponse>) responseObserver);
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
        case METHODID_GET_NEARBY_VEHICLES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getNearbyVehicles(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.NearbyVehiclesResponse>) responseObserver);
        case METHODID_SEND_CHAT_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendChatMessage(
              (io.grpc.stub.StreamObserver<net.vbunova.grpc.Vehicle.SendChatMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class vehicleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    vehicleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.vbunova.grpc.Vehicle.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("vehicle");
    }
  }

  private static final class vehicleFileDescriptorSupplier
      extends vehicleBaseDescriptorSupplier {
    vehicleFileDescriptorSupplier() {}
  }

  private static final class vehicleMethodDescriptorSupplier
      extends vehicleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    vehicleMethodDescriptorSupplier(String methodName) {
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
      synchronized (vehicleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new vehicleFileDescriptorSupplier())
              .addMethod(getGetVehicleInformationMethod())
              .addMethod(getShareSpeedAndRouteMethod())
              .addMethod(getGetNearbyVehiclesMethod())
              .addMethod(getSendChatMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
