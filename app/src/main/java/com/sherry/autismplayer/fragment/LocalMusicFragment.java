package com.sherry.autismplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sherry.autismplayer.R;

/**
 * Author:Sherry
 * Date:2018/10/1
 * 作用：viewpager之本地音乐
 */

public class LocalMusicFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.local_music_fragment,container,false);
    }

    @Override
    protected void init(){

    }
}
