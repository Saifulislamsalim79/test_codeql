package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.InterfaceC1664a0;
import androidx.recyclerview.widget.InterfaceC1687d0;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p227h.p237k.C7675h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedAdapterWrapper.java */
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes2.dex */
public class C1739s {

    /* renamed from: a */
    private final InterfaceC1687d0.InterfaceC1692c f5364a;

    /* renamed from: b */
    private final InterfaceC1664a0.InterfaceC1671d f5365b;

    /* renamed from: c */
    public final RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> f5366c;

    /* renamed from: d */
    final InterfaceC1741b f5367d;

    /* renamed from: e */
    int f5368e;

    /* renamed from: f */
    private RecyclerView.AbstractC1626j f5369f = new C1740a();

    /* compiled from: NestedAdapterWrapper.java */
    /* renamed from: androidx.recyclerview.widget.s$a */
    /* loaded from: classes2.dex */
    class C1740a extends RecyclerView.AbstractC1626j {
        C1740a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: a */
        public void mo26471a() {
            C1739s c1739s = C1739s.this;
            c1739s.f5368e = c1739s.f5366c.getItemCount();
            C1739s c1739s2 = C1739s.this;
            c1739s2.f5367d.mo34630e(c1739s2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: b */
        public void mo26470b(int i, int i2) {
            C1739s c1739s = C1739s.this;
            c1739s.f5367d.mo34633b(c1739s, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: c */
        public void mo26469c(int i, int i2, Object obj) {
            C1739s c1739s = C1739s.this;
            c1739s.f5367d.mo34633b(c1739s, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: d */
        public void mo16890d(int i, int i2) {
            C1739s c1739s = C1739s.this;
            c1739s.f5368e += i2;
            c1739s.f5367d.mo34632c(c1739s, i, i2);
            C1739s c1739s2 = C1739s.this;
            if (c1739s2.f5368e <= 0 || c1739s2.f5366c.getStateRestorationPolicy() != RecyclerView.AbstractC1623h.EnumC1624a.PREVENT_WHEN_EMPTY) {
                return;
            }
            C1739s c1739s3 = C1739s.this;
            c1739s3.f5367d.mo34634a(c1739s3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: e */
        public void mo26468e(int i, int i2, int i3) {
            C7675h.m17870b(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            C1739s c1739s = C1739s.this;
            c1739s.f5367d.mo34631d(c1739s, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: f */
        public void mo26467f(int i, int i2) {
            C1739s c1739s = C1739s.this;
            c1739s.f5368e -= i2;
            c1739s.f5367d.mo34629f(c1739s, i, i2);
            C1739s c1739s2 = C1739s.this;
            if (c1739s2.f5368e >= 1 || c1739s2.f5366c.getStateRestorationPolicy() != RecyclerView.AbstractC1623h.EnumC1624a.PREVENT_WHEN_EMPTY) {
                return;
            }
            C1739s c1739s3 = C1739s.this;
            c1739s3.f5367d.mo34634a(c1739s3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: g */
        public void mo34635g() {
            C1739s c1739s = C1739s.this;
            c1739s.f5367d.mo34634a(c1739s);
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    /* renamed from: androidx.recyclerview.widget.s$b */
    /* loaded from: classes2.dex */
    interface InterfaceC1741b {
        /* renamed from: a */
        void mo34634a(C1739s c1739s);

        /* renamed from: b */
        void mo34633b(C1739s c1739s, int i, int i2, Object obj);

        /* renamed from: c */
        void mo34632c(C1739s c1739s, int i, int i2);

        /* renamed from: d */
        void mo34631d(C1739s c1739s, int i, int i2);

        /* renamed from: e */
        void mo34630e(C1739s c1739s);

        /* renamed from: f */
        void mo34629f(C1739s c1739s, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1739s(RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> abstractC1623h, InterfaceC1741b interfaceC1741b, InterfaceC1687d0 interfaceC1687d0, InterfaceC1664a0.InterfaceC1671d interfaceC1671d) {
        this.f5366c = abstractC1623h;
        this.f5367d = interfaceC1741b;
        this.f5364a = interfaceC1687d0.mo34814b(this);
        this.f5365b = interfaceC1671d;
        this.f5368e = this.f5366c.getItemCount();
        this.f5366c.registerAdapterDataObserver(this.f5369f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m34640a() {
        return this.f5368e;
    }

    /* renamed from: b */
    public long m34639b(int i) {
        return this.f5365b.mo34863a(this.f5366c.getItemId(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m34638c(int i) {
        return this.f5364a.mo34812b(this.f5366c.getItemViewType(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34637d(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        this.f5366c.bindViewHolder(abstractC1620e0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public RecyclerView.AbstractC1620e0 m34636e(ViewGroup viewGroup, int i) {
        return this.f5366c.onCreateViewHolder(viewGroup, this.f5364a.mo34813a(i));
    }
}
