package com.example.project;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
  @GET
    Call<NewsModel>getAllNews(@Url String url);
  @GET
    Call<NewsModel>getByCategory(@Url String url);
}
