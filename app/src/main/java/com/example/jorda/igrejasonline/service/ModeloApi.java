package com.example.jorda.igrejasonline.service;

import com.example.jorda.igrejasonline.domain.ModeloEvento;
import com.example.jorda.igrejasonline.domain.ModeloIgreja;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ModeloApi {
    @GET("/igrejas/{id}")
    Call<ModeloIgreja> consulta(@Path("titulo")  String titulo);


    @GET("/eventos/{id}")
    Call<ModeloEvento> consulta(@Path("id") Integer id);
}
