package com.castlebell.epch.http;


import com.castlebell.epch.vo.data.VersionResponse;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

public interface RetrofitExService {

    String YoutubeURL = "https://hanae.choichorosoft.com";
    String YoutubeChannel = "UCgurvFK8PpZtF2fRyLBV3ww";
    String VideoList = "PLAnlfQnlOg13LZ3yxmDJf8snCGXiCzJkK";

    @POST("/msg/setting.han")
    Call<VersionResponse> setting(@HeaderMap Map<String, String> map, @Body HashMap<String, Object> param);


}
