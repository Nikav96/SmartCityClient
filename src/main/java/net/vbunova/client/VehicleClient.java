package net.vbunova.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.vbunova.grpc.Vehicle;
import net.vbunova.grpc.vehicleGrpc;

public class VehicleClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();

        vehicleGrpc.vehicleBlockingStub stub = vehicleGrpc.newBlockingStub(channel);

        Vehicle.VehicleInformationRequest request = Vehicle.VehicleInformationRequest.newBuilder().build();

        Vehicle.VehicleInformationResponse response = stub.getVehicleInformation(request);

        System.out.println("Response: VehicleId " + response.getVehicleId());
        System.out.println("Response: Metadata " + response.getMetadata());
    }
}
