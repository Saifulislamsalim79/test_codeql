package io.intercom.android.sdk.views;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class EndlessRecyclerScrollListener extends RecyclerView.AbstractC1644u {
    final EndlessScrollListener endlessScrollListener;
    private final LinearLayoutManager layoutManager;
    private boolean morePagesAvailable = true;

    public EndlessRecyclerScrollListener(LinearLayoutManager linearLayoutManager, EndlessScrollListener endlessScrollListener) {
        this.layoutManager = linearLayoutManager;
        this.endlessScrollListener = endlessScrollListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        this.endlessScrollListener.setOverScrollColour();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int childCount = recyclerView.getChildCount();
        if (this.layoutManager.m35120i0() - childCount > this.layoutManager.m35402i2() || !this.morePagesAvailable) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: io.intercom.android.sdk.views.EndlessRecyclerScrollListener.1
            @Override // java.lang.Runnable
            public void run() {
                EndlessRecyclerScrollListener.this.endlessScrollListener.onLoadMore();
            }
        });
    }

    public void setMorePagesAvailable(boolean z) {
        this.morePagesAvailable = z;
    }
}
