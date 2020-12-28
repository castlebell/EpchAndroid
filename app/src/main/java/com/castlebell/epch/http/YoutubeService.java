package com.castlebell.epch.http;

import com.castlebell.epch.vo.data.YoutubeList;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface YoutubeService {

    @GET("/msg/setting.han")
    Observable<YoutubeList> getYoutubeList();

}
