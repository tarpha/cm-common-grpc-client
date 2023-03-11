package kbank.cm.common.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.logging.Logger;

import kbank.cm.common.EncryptUtilGrpc;
import kbank.cm.common.EncryptUtilGrpc.EncryptUtilBlockingStub;
import kbank.cm.common.EncryptUtilOuterClass.Encrypt;
import kbank.cm.common.EncryptUtilOuterClass.Plain;

public class EncryptUtilClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("localhost", 50051)
            .usePlaintext()
            .build();
        
        EncryptUtilBlockingStub stub = EncryptUtilGrpc.newBlockingStub(channel);

        Encrypt encrypt = stub.encrypt(
            Plain.newBuilder()
            .setValue("test")
            .build());

        System.out.println("encrypt: " + encrypt.getValue());

        Plain plain = stub.decrypt(encrypt);

        System.out.println("decrypt: " + plain.getValue());

        channel.shutdown();
    }
}
