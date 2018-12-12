package com.example.jorda.igrejasonline.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

    public class RetrofitService {

        private String baseUrl = "http://url/";
        private ModeloApi api;
        private static RetrofitService instancia;

        private RetrofitService() {
            api = criaRetrofit().create(ModeloApi.class);
        }

        private Retrofit criaRetrofit() {
            Gson gson = new GsonBuilder().create();
            return new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        public static ModeloApi getServico() {
            if (instancia == null)
                instancia = new RetrofitService();
            return instancia.api;
        }
    }
