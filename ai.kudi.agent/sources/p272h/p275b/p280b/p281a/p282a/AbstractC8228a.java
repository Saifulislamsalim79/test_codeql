package p272h.p275b.p280b.p281a.p282a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: InfiniteScrollListener.java */
/* renamed from: h.b.b.a.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC8228a extends RecyclerView.AbstractC1644u {
    private final LinearLayoutManager layoutManager;
    private final int maxItemsPerRequest;

    public AbstractC8228a(int i, LinearLayoutManager linearLayoutManager) {
        C8229b.m16459a(i, "maxItemsPerRequest <= 0");
        C8229b.m16458b(linearLayoutManager, "layoutManager == null");
        this.maxItemsPerRequest = i;
        this.layoutManager = linearLayoutManager;
    }

    protected boolean canLoadMoreItems() {
        int m35142T = this.layoutManager.m35142T();
        int m35120i0 = this.layoutManager.m35120i0();
        return (m35142T + this.layoutManager.m35402i2() >= m35120i0) && m35120i0 >= this.maxItemsPerRequest;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        if (canLoadMoreItems()) {
            onScrolledToEnd(this.layoutManager.m35402i2());
        }
    }

    public abstract void onScrolledToEnd(int i);

    protected void refreshView(RecyclerView recyclerView, RecyclerView.AbstractC1623h abstractC1623h, int i) {
        recyclerView.setAdapter(abstractC1623h);
        recyclerView.invalidate();
        recyclerView.m35277m1(i);
    }
}
