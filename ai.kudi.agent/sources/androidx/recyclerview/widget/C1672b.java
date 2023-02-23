package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: AdapterListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes2.dex */
public final class C1672b implements InterfaceC1738r {

    /* renamed from: a */
    private final RecyclerView.AbstractC1623h f5136a;

    public C1672b(RecyclerView.AbstractC1623h abstractC1623h) {
        this.f5136a = abstractC1623h;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: a */
    public void mo17098a(int i, int i2) {
        this.f5136a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: b */
    public void mo17097b(int i, int i2) {
        this.f5136a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: c */
    public void mo17096c(int i, int i2) {
        this.f5136a.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1738r
    /* renamed from: d */
    public void mo17095d(int i, int i2, Object obj) {
        this.f5136a.notifyItemRangeChanged(i, i2, obj);
    }
}
