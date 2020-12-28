package com.castlebell.epch.http.Handler;

import com.castlebell.epch.vo.data.YoutubeList;

public interface YoutubeHandler {

    void goYoutubeList();

    interface View {

        void showList(YoutubeList userList);
    }
}
