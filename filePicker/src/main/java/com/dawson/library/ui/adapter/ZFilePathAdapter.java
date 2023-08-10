package com.dawson.library.ui.adapter;

import android.content.Context;

import com.dawson.library.R;
import com.dawson.library.common.ZFileAdapter;
import com.dawson.library.common.ZFileViewHolder;
import com.dawson.library.content.ZFilePathBean;

public final class ZFilePathAdapter extends ZFileAdapter {

    public ZFilePathAdapter(Context context) {
        super(context, R.layout.item_zfile_path);
    }

    protected void bindView(ZFileViewHolder holder, ZFilePathBean item, int position) {
        holder.setText(R.id.item_zfile_path_title, item.getFileName());
    }

    public void bindView(ZFileViewHolder var1, Object var2, int var3) {
        this.bindView(var1, (ZFilePathBean) var2, var3);
    }

    public void addItem(int position, ZFilePathBean t) {
        super.addItem(position, t);
    }

    public final void back() {
        this.remove(this.getItemCount() - 1, true);
    }
}
