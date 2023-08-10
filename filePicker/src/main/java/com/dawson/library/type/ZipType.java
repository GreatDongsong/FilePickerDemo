package com.dawson.library.type;

import android.view.View;
import android.widget.ImageView;

import com.dawson.library.R;
import com.dawson.library.common.ZFileType;
import com.dawson.library.content.ZFileContent;

/**
 * zip压缩包文件
 */
public class ZipType extends ZFileType {
    public void openFile(String filePath, View view) {
        ZFileContent.getZFileHelp().getFileOpenListener().openZIP(filePath, view);
    }

    public void loadingFile(String filePath, ImageView pic) {
        pic.setImageResource(this.getRes(ZFileContent.getZFileConfig().getResources().getZipRes(), R.drawable.ic_zfile_zip));
    }
}
