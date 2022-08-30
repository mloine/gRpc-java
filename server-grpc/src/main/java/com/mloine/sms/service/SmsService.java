package com.mloine.sms.service;

import com.google.protobuf.ProtocolStringList;
import com.mloine.sms.proto.SmsProto;
import com.mloine.sms.proto.SmsServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SmsService extends SmsServiceGrpc.SmsServiceImplBase {

    @Override
    public void send(SmsProto.SmsRequest request, StreamObserver<SmsProto.SmsResponse> responseObserver) {
        ProtocolStringList phoneNumberList = request.getPhoneNumberList();
        phoneNumberList.forEach((phoneNumber) -> {
            SmsProto.SmsResponse reponse = SmsProto.SmsResponse.newBuilder().setResult(request.getContent() + "," + phoneNumber).build();
            responseObserver.onNext(reponse);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SmsProto.PhoneRequest> createPhone(StreamObserver<SmsProto.PhoneNumberResponse> responseObserver) {


        return new StreamObserver<SmsProto.PhoneRequest>() {

            int i = 0;

            @Override
            public void onNext(SmsProto.PhoneRequest phoneRequest) {
                System.out.println(phoneRequest.getPhoneNumber() + "手机号已登记");
                i++;
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(SmsProto.PhoneNumberResponse.newBuilder().setResult("您本次导入" + i + "条手机号").build());
                responseObserver.onCompleted();
            }
        };
    }
}
