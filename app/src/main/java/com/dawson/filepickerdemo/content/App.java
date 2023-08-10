package com.dawson.filepickerdemo.content;

import android.app.Application;

import com.dawson.filepickerdemo.diy.MyFileImageListener;
import com.dawson.filepickerdemo.diy.MyFileTypeListener;
import com.dawson.library.content.ZFileContent;

public final class App extends Application {
    public void onCreate() {
        super.onCreate();
        ZFileContent.getZFileHelp().init(new MyFileImageListener()).setFileTypeListener(new MyFileTypeListener());
    }
}