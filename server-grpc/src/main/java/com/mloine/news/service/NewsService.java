package com.mloine.news.service;

import com.mloine.news.proto.NewsProto;
import com.mloine.news.proto.NewsServiceGrpc;
import io.grpc.stub.StreamObserver;

public class NewsService extends NewsServiceGrpc.NewsServiceImplBase {

    @Override
    public void list(NewsProto.NewsRequest request, StreamObserver<NewsProto.NewsResponse> responseObserver) {
        String date = request.getDate();

        NewsProto.NewsResponse newList = null;


        try {
            NewsProto.NewsResponse.Builder newListBuilder = NewsProto.NewsResponse.newBuilder();
            for (int i = 0; i < 100; i++) {
                newListBuilder.addNews(
                        NewsProto.News.newBuilder()
                                .setId(i)
                                .setTitle(date + "news" + i)
                                .setContent("content" + i)
                                .setCreateTime(System.currentTimeMillis())
                                .build());
            }
            newList = newListBuilder.build();

        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onNext(newList);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void hello(NewsProto.StringRequest request, StreamObserver<NewsProto.StringResponse> responseObserver) {
        String name = request.getName();
        NewsProto.StringResponse build = NewsProto.StringResponse.newBuilder().setResult(String.format("hi! %s", name)).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
