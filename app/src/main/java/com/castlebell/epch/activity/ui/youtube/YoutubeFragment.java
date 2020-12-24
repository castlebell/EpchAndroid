package com.castlebell.epch.activity.ui.youtube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.castlebell.epch.R;
import butterknife.ButterKnife;

public class YoutubeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_youtube, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

}