package com.loftschool.loftcoin.data.api;

import com.loftschool.loftcoin.data.api.model.RateResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {

    String CONVERT = "USD";

    @GET("cryptocurrency/listings/latest")
    @Headers("X-CMC_PRO_API_KEY: 2581ad97-a64e-42f4-aa0a-362c7520977e")
    Observable<RateResponse> rates(@Query("convert") String convert);


}
