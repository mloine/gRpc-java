package com.mloine;

import com.mloine.sms.proto.SmsProto;
import com.mloine.sms.proto.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SmsClient3 {

    SmsServiceGrpc.SmsServiceStub stub;
    private static final String host = "localhost";

    private static final int port = 8080;

    public static void main(String[] args) {
        SmsClient3 smsClient2 = new SmsClient3();

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        try {

            smsClient2.stub = SmsServiceGrpc.newStub(channel);
            smsClient2.createPhone();

        } catch (Exception e) {

        } finally {
            channel.shutdown();
        }

    }


    public void createPhone() throws InterruptedException {

        StreamObserver<SmsProto.PhoneNumberResponse> responseStreamObserver = new StreamObserver<SmsProto.PhoneNumberResponse>() {

            @Override
            public void onNext(SmsProto.PhoneNumberResponse phoneNumberResponse) {
                System.out.println(phoneNumberResponse.getResult());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("处理完毕");
            }
        };


        StreamObserver<SmsProto.PhoneRequest> phone = stub.createAndSendSms(responseStreamObserver);

        for (int i = 0; i < 10; i++) {
            SmsProto.PhoneRequest build = SmsProto.PhoneRequest.newBuilder().setPhoneNumber("156123123" + i).build();
            phone.onNext(build);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        phone.onCompleted();
        Thread.sleep(1000);
    }


}
