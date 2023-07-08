package net.vbunova.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.vbunova.grpc.Geolocation;
import net.vbunova.grpc.geolocationGrpc;

public class GeolocationClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9093).usePlaintext().build();

        geolocationGrpc.geolocationBlockingStub stub = geolocationGrpc.newBlockingStub(channel);

        Geolocation.LocationRequest request = Geolocation.LocationRequest.newBuilder().setLat("1").setLon("1").build();

        Geolocation.LocationRequestResponse response = stub.getLocation(request);

        System.out.println("Response: LocationId " + response.getLocationId());
    }
}
