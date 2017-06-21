package com.example.minhl.androidfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by minhl on 18/06/2017.
 */

public class TopFragment extends Fragment {
    private Button btnPicture;
    private MainActivity mainActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_top, container, false);
        btnPicture = (Button) view.findViewById(R.id.btn_picture);
        btnPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyText();
            }
        });
        this.mainActivity = (MainActivity)getActivity();
        return view;
    }

    private void applyText() {
        this.mainActivity.changePicture();
    }

}