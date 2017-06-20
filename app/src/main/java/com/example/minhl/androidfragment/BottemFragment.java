package com.example.minhl.androidfragment;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by minhl on 18/06/2017.
 */

public class BottemFragment extends Fragment {
    private ImageView imgView;
    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acitivity_bottom,container,false);
        imgView = (ImageView) view.findViewById(R.id.img_pic);

        return view;

    }
    public void changePicture() {
        imgView.setImageResource(R.drawable.hotgirl);
        Toast.makeText(context, "Dep trai co gi sai", Toast.LENGTH_SHORT).show();
    }
}
