package com.intercom.composer.input.iconbar;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.C7163R;
/* loaded from: classes2.dex */
public class InputIconRecyclerDecoration extends RecyclerView.AbstractC1634o {
    final int startSpacing;

    public InputIconRecyclerDecoration(Context context) {
        this.startSpacing = context.getResources().getDimensionPixelSize(C7163R.dimen.intercom_composer_icon_bar_left_spacing);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        if (recyclerView.m35299f0(view) == 0) {
            rect.set(this.startSpacing, 0, 0, 0);
        }
    }
}
