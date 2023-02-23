package com.intercom.input.gallery.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class EndlessRecyclerScrollListener extends RecyclerView.AbstractC1644u {
    private final EndlessScrollListener endlessScrollListener;
    private final LinearLayoutManager layoutManager;
    private int maxCount = Integer.MIN_VALUE;

    public EndlessRecyclerScrollListener(LinearLayoutManager linearLayoutManager, EndlessScrollListener endlessScrollListener) {
        this.layoutManager = linearLayoutManager;
        this.endlessScrollListener = endlessScrollListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int childCount = recyclerView.getChildCount();
        int m35120i0 = this.layoutManager.m35120i0();
        if (m35120i0 - childCount > this.layoutManager.m35402i2() || m35120i0 >= this.maxCount) {
            return;
        }
        this.endlessScrollListener.onLoadMore();
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }
}
