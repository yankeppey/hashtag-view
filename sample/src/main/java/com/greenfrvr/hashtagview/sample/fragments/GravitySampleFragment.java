package com.greenfrvr.hashtagview.sample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenfrvr.hashtagview.HashtagView;
import com.greenfrvr.hashtagview.sample.R;
import com.greenfrvr.hashtagview.sample.utils.Transformers;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by greenfrvr
 */
public class GravitySampleFragment extends BaseFragment {

    private static final String data = "Android library collection hashtags min14SDK UI view github opensource project";

    protected @Bind(R.id.hashtags1) HashtagView hashtagView1;
    protected @Bind(R.id.hashtags2) HashtagView hashtagView2;
    protected @Bind(R.id.hashtags3) HashtagView hashtagView3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gravity_sample, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hashtagView1.setData(Arrays.asList(data.split("\\s")), Transformers.HASH);
        hashtagView2.setData(Arrays.asList(data.split("\\s")), Transformers.HASH);
        hashtagView3.setData(Arrays.asList(data.split("\\s")), Transformers.HASH);
    }

}
