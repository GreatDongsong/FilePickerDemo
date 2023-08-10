package com.dawson.filepickerdemo.diy;

import com.dawson.library.common.ZFileType;
import com.dawson.library.content.ZFileContent;
import com.dawson.library.listener.ZFileListener;
import com.dawson.library.util.ZFileHelp;

public class MyFileTypeListener extends ZFileListener.ZFileTypeListener {

    @Override
    public ZFileType getFileType(String filePath) {
        switch (ZFileHelp.getFileTypeBySuffix(filePath)) {
            case ZFileContent.TXT:
            case ZFileContent.XML:
            case ZFileContent.JSON:
                return new MyTxtType();
            default:
                return super.getFileType(filePath);
        }
    }
}