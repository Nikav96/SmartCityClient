package net.vbunova.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.vbunova.grpc.StreetLight;
import net.vbunova.grpc.streetLightGrpc;

public class StreetLightClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();

        streetLightGrpc.streetLightBlockingStub stub = streetLightGrpc.newBlockingStub(channel);

        StreetLight.ActivateLightsRequest request = StreetLight.ActivateLightsRequest.newBuilder().setLat("1").setLon("1").build();

        StreetLight.ActivateLightsResponse response = stub.activateLights(request);

        System.out.println("Response: Lights activated " + response.getStatus());
    }
}
