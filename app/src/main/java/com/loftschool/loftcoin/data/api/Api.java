package com.loftschool.loftcoin.data.api;

import com.loftschool.loftcoin.data.api.model.RateResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {

    String CONVERT = "USD,EUR,RUB";

    @GET("cryptocurrency/listings/latest")
    @Headers("X-CMC_PRO_API_KEY: 87a4a6cc-7c2b-4074-8ac0-046cfe25d2ff")
    Observable<RateResponse> rates(@Query("convert") String convert);

}
