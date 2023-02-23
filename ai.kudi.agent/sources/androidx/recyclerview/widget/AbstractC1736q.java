package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1676c;
import androidx.recyclerview.widget.C1681d;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import java.util.List;
/* compiled from: ListAdapter.java */
/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes2.dex */
public abstract class AbstractC1736q<T, VH extends RecyclerView.AbstractC1620e0> extends RecyclerView.AbstractC1623h<VH> {
    final C1681d<T> mDiffer;
    private final C1681d.InterfaceC1685b<T> mListener = new C1737a();

    /* compiled from: ListAdapter.java */
    /* renamed from: androidx.recyclerview.widget.q$a */
    /* loaded from: classes2.dex */
    class C1737a implements C1681d.InterfaceC1685b<T> {
        C1737a() {
        }

        @Override // androidx.recyclerview.widget.C1681d.InterfaceC1685b
        /* renamed from: a */
        public void mo34641a(List<T> list, List<T> list2) {
            AbstractC1736q.this.onCurrentListChanged(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1736q(C1713j.AbstractC1719f<T> abstractC1719f) {
        C1681d<T> c1681d = new C1681d<>(new C1672b(this), new C1676c.C1677a(abstractC1719f).m34847a());
        this.mDiffer = c1681d;
        c1681d.m34822a(this.mListener);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.m34821b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getItem(int i) {
        return this.mDiffer.m34821b().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.mDiffer.m34821b().size();
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.m34818e(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.m34817f(list, runnable);
    }

    protected AbstractC1736q(C1676c<T> c1676c) {
        C1681d<T> c1681d = new C1681d<>(new C1672b(this), c1676c);
        this.mDiffer = c1681d;
        c1681d.m34822a(this.mListener);
    }
}
