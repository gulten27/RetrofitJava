package com.gultendogan.retrofitjava.service;

import com.gultendogan.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=d447c0befa0c8978c5b45a29d46f896a")
    Observable<List<CryptoModel>> getData();
}
