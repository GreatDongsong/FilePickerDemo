package com.dawson.filepickerdemo.diy;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dawson.library.R;
import com.dawson.library.listener.ZFileListener;

import java.io.File;

public class MyFileImageListener extends ZFileListener.ZFileImageListener {

    /**
     * 图片类型加载
     */
    @Override
    public void loadImage(ImageView imageView, File file) {
        Glide.with(imageView.getContext())
                .load(file)
                .apply(new RequestOptions().placeholder(R.drawable.ic_zfile_other).error(R.drawable.ic_zfile_other))
            .into(imageView);
    }
}