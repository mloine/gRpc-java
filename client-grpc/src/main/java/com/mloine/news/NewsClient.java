package com.mloine.news;

import com.mloine.news.proto.NewsProto;
import com.mloine.news.proto.NewsServiceGrpc;
import com.mloine.sms.proto.SmsProto;
import com.mloine.sms.proto.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewsClient {

    private static final String host = "localhost";

    private static final int port = 9090;

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        try {
            NewsServiceGrpc.NewsServiceBlockingStub blockingStub = NewsServiceGrpc.newBlockingStub(channel);

            // NewsProto.NewsRequest request = NewsProto.NewsRequest.newBuilder().setDate("2022-08-291").build();
            //
            // NewsProto.NewsResponse list = blockingStub.list(request);
            //
            // System.out.println(list);


            NewsProto.StringResponse hello = blockingStub.hello(NewsProto.StringRequest.newBuilder().setName("xue yong kang").build());
            System.out.println(hello.getResult());

            // SmsServiceGrpc.SmsServiceBlockingStub smsServiceBlockingStub = SmsServiceGrpc.newBlockingStub(channel);
            // SmsProto.SmsRequest.newBuilder().setContent("this is a content").addPhoneNumber()
            // smsServiceBlockingStub.send()

        } catch (Exception e) {

        } finally {
            channel.shutdown();
        }

    }
}
