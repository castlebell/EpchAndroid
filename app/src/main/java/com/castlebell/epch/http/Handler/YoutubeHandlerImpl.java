package com.castlebell.epch.http.Handler;


import com.castlebell.epch.http.NetworkManager;
import com.castlebell.epch.vo.data.YoutubeList;

/**
 * Created by Rell on 2017. 11. 13..
 */

public class YoutubeHandlerImpl implements YoutubeHandler {
    private YoutubeHandler.View view;

    public YoutubeHandlerImpl(View view) {
        this.view = view;
    }

    @Override
    public void goYoutubeList() {
//        NetworkManager.getInstance().getUserList().subscribe(new Action1<YoutubeList>() {
//            @Override
//            public void call(YoutubeList userList) {
//                //view.showText(userList);
//            }
//        });
    }
}
