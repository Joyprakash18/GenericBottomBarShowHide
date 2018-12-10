package com.example.admin.genericbottombarshowhide;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/bins/tl7y6")
    Call<ListResponse> getList();
}
