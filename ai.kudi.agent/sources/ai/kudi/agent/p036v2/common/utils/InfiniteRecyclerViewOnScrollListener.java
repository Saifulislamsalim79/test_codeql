package ai.kudi.agent.p036v2.common.utils;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
/* compiled from: InfiniteRecyclerViewScrollListener.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\"\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/v2/common/utils/InfiniteRecyclerViewOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "currentPage", "", "lastPage", "visibleItemThreshold", "(III)V", "isLastPage", "", "mLoading", "mPreviousTotal", "onLoadMore", "", "nextPage", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "setCurrentPage", "setIsLastPage", "setLastPage", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.InfiniteRecyclerViewOnScrollListener */
/* loaded from: classes.dex */
public abstract class InfiniteRecyclerViewOnScrollListener extends RecyclerView.AbstractC1644u {
    private int currentPage;
    private boolean isLastPage;
    private int lastPage;
    private boolean mLoading;
    private int mPreviousTotal;
    private final int visibleItemThreshold;

    public InfiniteRecyclerViewOnScrollListener() {
        this(0, 0, 0, 7, null);
    }

    public InfiniteRecyclerViewOnScrollListener(int i, int i2, int i3) {
        this.currentPage = i;
        this.lastPage = i2;
        this.visibleItemThreshold = i3;
        this.mLoading = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InfiniteRecyclerViewOnScrollListener(int r2, int r3, int r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L5
            r2 = 1
        L5:
            r0 = r5 & 2
            if (r0 == 0) goto La
            r3 = -1
        La:
            r5 = r5 & 4
            if (r5 == 0) goto Lf
            r4 = 3
        Lf:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.utils.InfiniteRecyclerViewOnScrollListener.<init>(int, int, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    public abstract void onLoadMore(int i);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r11 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r15 < r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        r12 = true;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r18, int r19, int r20) {
        /*
            r17 = this;
            java.lang.String r4 = "recyclerView"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r4)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            super.onScrolled(r1, r2, r3)
            r6 = r18
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r5 = r6
            int r20 = r5.getChildCount()
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$p r7 = r0.getLayoutManager()
            kotlin.p483e0.p485d.Log_OC.append(r7)
            int r8 = r7.m35120i0()
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$p r7 = r0.getLayoutManager()
            if (r7 == 0) goto L97
            r10 = r7
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            r9 = r10
            int r19 = r9.m35402i2()
            r0 = r17
            boolean r11 = r0.mLoading
            r12 = 0
            if (r11 == 0) goto L4e
            r0 = r17
            int r13 = r0.mPreviousTotal
            if (r8 <= r13) goto L4e
            r14 = 0
            r0 = r17
            r0.mLoading = r14
            r0 = r17
            r0.mPreviousTotal = r8
        L4e:
            r0 = r17
            int r13 = r0.lastPage
            r14 = -1
            if (r13 != r14) goto L5c
            r0 = r17
            boolean r11 = r0.isLastPage
            if (r11 != 0) goto L63
            goto L62
        L5c:
            r0 = r17
            int r15 = r0.currentPage
            if (r15 >= r13) goto L63
        L62:
            r12 = 1
        L63:
            r0 = r17
            boolean r11 = r0.mLoading
            if (r11 != 0) goto La1
            int r20 = r8 - r20
            r0 = r17
            int r8 = r0.visibleItemThreshold
            r0 = r19
            int r0 = r0 + r8
            r19 = r0
            r0 = r20
            r1 = r19
            if (r0 > r1) goto La1
            if (r12 == 0) goto La1
            r0 = r17
            int r0 = r0.currentPage
            r19 = r0
            int r19 = r19 + 1
            r0 = r19
            r1 = r17
            r1.currentPage = r0
            r0 = r17
            r1 = r19
            r0.onLoadMore(r1)
            r14 = 1
            r0 = r17
            r0.mLoading = r14
            return
        L97:
            java.lang.NullPointerException r16 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            r0 = r16
            r0.<init>(r4)
            throw r16
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.utils.InfiniteRecyclerViewOnScrollListener.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void setCurrentPage(int i) {
        this.currentPage = i;
        this.mPreviousTotal = 0;
    }

    public final void setIsLastPage(boolean z) {
        this.isLastPage = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setLastPage(int i) {
        this.lastPage = i;
        int $i0 = this.currentPage;
        boolean $z0 = $i0 < i;
        this.isLastPage = $z0;
    }
}
