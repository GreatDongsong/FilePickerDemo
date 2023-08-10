package com.dawson.library.type;

import android.view.View;
import android.widget.ImageView;

import com.dawson.library.R;
import com.dawson.library.common.ZFileType;
import com.dawson.library.content.ZFileContent;

/**
 * PPT文件
 */
public class PptType extends ZFileType {
    public void openFile(String filePath, View view) {
        ZFileContent.getZFileHelp().getFileOpenListener().openPPT(filePath, view);
    }

    public void loadingFile(String filePath, ImageView pic) {
        pic.setImageResource(this.getRes(ZFileContent.getZFileConfig().getResources().getPptRes(), R.drawable.ic_zfile_ppt));
    }
}
