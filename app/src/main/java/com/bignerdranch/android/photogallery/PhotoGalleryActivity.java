package com.bignerdranch.android.photogallery;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class PhotoGalleryActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_photo_gallery);
//    }

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}