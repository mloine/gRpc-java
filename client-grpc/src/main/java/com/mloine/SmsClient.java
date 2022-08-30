package com.mloine;

import com.mloine.news.proto.NewsProto;
import com.mloine.news.proto.NewsServiceGrpc;
import com.mloine.sms.proto.SmsProto;
import com.mloine.sms.proto.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class SmsClient {

    private static final String host = "localhost";

    private static final int port = 8080;

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        try {

            SmsServiceGrpc.SmsServiceBlockingStub smsServiceBlockingStub = SmsServiceGrpc.newBlockingStub(channel);
            SmsProto.SmsRequest this_is_a_content = SmsProto.SmsRequest.newBuilder().setContent("this is a content")
                    .addPhoneNumber("1231232131221")
                    .addPhoneNumber("1231232131222")
                    .addPhoneNumber("1231232131223")
                    .addPhoneNumber("1231232131224")
                    .addPhoneNumber("1231232131225")
                    .addPhoneNumber("1231232131226")
                    .addPhoneNumber("1231232131227")
                    .build();
            Iterator<SmsProto.SmsResponse> send =
                    smsServiceBlockingStub.send(this_is_a_content);

            while (send.hasNext()) {
                SmsProto.SmsResponse next = send.next();
                System.out.println(next.getResult());
            }


        } catch (Exception e) {

        } finally {
            channel.shutdown();
        }

    }
}
