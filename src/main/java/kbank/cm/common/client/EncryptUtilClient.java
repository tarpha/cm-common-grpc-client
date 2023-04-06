package kbank.cm.common.client;

import cm.common.grpc.lib.EncryptUtil;

public class EncryptUtilClient {
    public static void main(String[] args) throws InterruptedException {
        String encStr = EncryptUtil.encrypt("test");

        System.out.println("encrypt: " + encStr);

        String decStr = EncryptUtil.decrypt(encStr);

        System.out.println("decrypt: " + decStr);
    }
}
