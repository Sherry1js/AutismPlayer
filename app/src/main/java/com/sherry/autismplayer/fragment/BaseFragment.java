package com.sherry.autismplayer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Author:Sherry
 * Date:2018/10/1
 * 作用：基类Fragment
 */

public abstract class BaseFragment extends Fragment{
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        init();
        super.onViewCreated(view, savedInstanceState);
    }

    protected abstract void init();
}
