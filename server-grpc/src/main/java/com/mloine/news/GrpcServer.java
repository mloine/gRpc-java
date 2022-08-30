package com.mloine.news;

import com.mloine.news.service.NewsService;
import com.mloine.sms.service.SmsService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server start = ServerBuilder.forPort(8080).addService(
                new NewsService()
        ).addService(new SmsService()).build().start();
        System.out.println(String.format("GRPC PORT %d", start.getPort()));
        start.awaitTermination();

    }

}
