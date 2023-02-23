package com.intercom.input.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class HeadingMarginDecoration extends RecyclerView.AbstractC1634o {
    private final int heightRes;

    public HeadingMarginDecoration(int i) {
        this.heightRes = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        int integer = recyclerView.getResources().getInteger(C7177R.integer.intercom_composer_expanded_column_count);
        int m35302e0 = recyclerView.m35302e0(view);
        if (m35302e0 < 0 || m35302e0 >= integer) {
            return;
        }
        rect.set(0, recyclerView.getResources().getDimensionPixelOffset(this.heightRes), 0, 0);
    }
}
