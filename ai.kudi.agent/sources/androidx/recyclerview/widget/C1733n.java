package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LayoutState.java */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes2.dex */
class C1733n {

    /* renamed from: b */
    int f5345b;

    /* renamed from: c */
    int f5346c;

    /* renamed from: d */
    int f5347d;

    /* renamed from: e */
    int f5348e;

    /* renamed from: h */
    boolean f5351h;

    /* renamed from: i */
    boolean f5352i;

    /* renamed from: a */
    boolean f5344a = true;

    /* renamed from: f */
    int f5349f = 0;

    /* renamed from: g */
    int f5350g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m34661a(RecyclerView.C1614b0 c1614b0) {
        int i = this.f5346c;
        return i >= 0 && i < c1614b0.m35217b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m34660b(RecyclerView.C1647w c1647w) {
        View m35035o = c1647w.m35035o(this.f5346c);
        this.f5346c += this.f5347d;
        return m35035o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5345b + ", mCurrentPosition=" + this.f5346c + ", mItemDirection=" + this.f5347d + ", mLayoutDirection=" + this.f5348e + ", mStartLine=" + this.f5349f + ", mEndLine=" + this.f5350g + '}';
    }
}
