package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1697g;
import androidx.recyclerview.widget.C1739s;
import androidx.recyclerview.widget.InterfaceC1664a0;
import androidx.recyclerview.widget.InterfaceC1687d0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p201g.p227h.p237k.C7675h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConcatAdapterController.java */
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes2.dex */
public class C1700h implements C1739s.InterfaceC1741b {

    /* renamed from: a */
    private final C1697g f5202a;

    /* renamed from: b */
    private final InterfaceC1687d0 f5203b;

    /* renamed from: c */
    private List<WeakReference<RecyclerView>> f5204c = new ArrayList();

    /* renamed from: d */
    private final IdentityHashMap<RecyclerView.AbstractC1620e0, C1739s> f5205d = new IdentityHashMap<>();

    /* renamed from: e */
    private List<C1739s> f5206e = new ArrayList();

    /* renamed from: f */
    private C1701a f5207f = new C1701a();

    /* renamed from: g */
    private final C1697g.C1698a.EnumC1699a f5208g;

    /* renamed from: h */
    private final InterfaceC1664a0 f5209h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConcatAdapterController.java */
    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes2.dex */
    public static class C1701a {

        /* renamed from: a */
        C1739s f5210a;

        /* renamed from: b */
        int f5211b;

        /* renamed from: c */
        boolean f5212c;

        C1701a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1700h(C1697g c1697g, C1697g.C1698a c1698a) {
        this.f5202a = c1697g;
        if (c1698a.f5196a) {
            this.f5203b = new InterfaceC1687d0.C1688a();
        } else {
            this.f5203b = new InterfaceC1687d0.C1690b();
        }
        C1697g.C1698a.EnumC1699a enumC1699a = c1698a.f5197b;
        this.f5208g = enumC1699a;
        if (enumC1699a == C1697g.C1698a.EnumC1699a.NO_STABLE_IDS) {
            this.f5209h = new InterfaceC1664a0.C1667b();
        } else if (enumC1699a == C1697g.C1698a.EnumC1699a.ISOLATED_STABLE_IDS) {
            this.f5209h = new InterfaceC1664a0.C1665a();
        } else if (enumC1699a == C1697g.C1698a.EnumC1699a.SHARED_STABLE_IDS) {
            this.f5209h = new InterfaceC1664a0.C1669c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    /* renamed from: D */
    private void m34766D(C1701a c1701a) {
        c1701a.f5212c = false;
        c1701a.f5210a = null;
        c1701a.f5211b = -1;
        this.f5207f = c1701a;
    }

    /* renamed from: i */
    private void m34763i() {
        RecyclerView.AbstractC1623h.EnumC1624a m34762j = m34762j();
        if (m34762j != this.f5202a.getStateRestorationPolicy()) {
            this.f5202a.m34770b(m34762j);
        }
    }

    /* renamed from: j */
    private RecyclerView.AbstractC1623h.EnumC1624a m34762j() {
        for (C1739s c1739s : this.f5206e) {
            RecyclerView.AbstractC1623h.EnumC1624a stateRestorationPolicy = c1739s.f5366c.getStateRestorationPolicy();
            RecyclerView.AbstractC1623h.EnumC1624a enumC1624a = RecyclerView.AbstractC1623h.EnumC1624a.PREVENT;
            if (stateRestorationPolicy == enumC1624a) {
                return enumC1624a;
            }
            if (stateRestorationPolicy == RecyclerView.AbstractC1623h.EnumC1624a.PREVENT_WHEN_EMPTY && c1739s.m34640a() == 0) {
                return RecyclerView.AbstractC1623h.EnumC1624a.PREVENT;
            }
        }
        return RecyclerView.AbstractC1623h.EnumC1624a.ALLOW;
    }

    /* renamed from: k */
    private int m34761k(C1739s c1739s) {
        C1739s next;
        Iterator<C1739s> it = this.f5206e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != c1739s) {
            i += next.m34640a();
        }
        return i;
    }

    /* renamed from: l */
    private C1701a m34760l(int i) {
        C1701a c1701a = this.f5207f;
        if (c1701a.f5212c) {
            c1701a = new C1701a();
        } else {
            c1701a.f5212c = true;
        }
        Iterator<C1739s> it = this.f5206e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1739s next = it.next();
            if (next.m34640a() > i2) {
                c1701a.f5210a = next;
                c1701a.f5211b = i2;
                break;
            }
            i2 -= next.m34640a();
        }
        if (c1701a.f5210a != null) {
            return c1701a;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    /* renamed from: m */
    private C1739s m34759m(RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> abstractC1623h) {
        int m34752t = m34752t(abstractC1623h);
        if (m34752t == -1) {
            return null;
        }
        return this.f5206e.get(m34752t);
    }

    /* renamed from: r */
    private C1739s m34754r(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1739s c1739s = this.f5205d.get(abstractC1620e0);
        if (c1739s != null) {
            return c1739s;
        }
        throw new IllegalStateException("Cannot find wrapper for " + abstractC1620e0 + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: t */
    private int m34752t(RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> abstractC1623h) {
        int size = this.f5206e.size();
        for (int i = 0; i < size; i++) {
            if (this.f5206e.get(i).f5366c == abstractC1623h) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: u */
    private boolean m34751u(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.f5204c) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public void m34769A(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34754r(abstractC1620e0).f5366c.onViewAttachedToWindow(abstractC1620e0);
    }

    /* renamed from: B */
    public void m34768B(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34754r(abstractC1620e0).f5366c.onViewDetachedFromWindow(abstractC1620e0);
    }

    /* renamed from: C */
    public void m34767C(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1739s remove = this.f5205d.remove(abstractC1620e0);
        if (remove != null) {
            remove.f5366c.onViewRecycled(abstractC1620e0);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + abstractC1620e0 + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: a */
    public void mo34634a(C1739s c1739s) {
        m34763i();
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: b */
    public void mo34633b(C1739s c1739s, int i, int i2, Object obj) {
        this.f5202a.notifyItemRangeChanged(i + m34761k(c1739s), i2, obj);
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: c */
    public void mo34632c(C1739s c1739s, int i, int i2) {
        this.f5202a.notifyItemRangeInserted(i + m34761k(c1739s), i2);
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: d */
    public void mo34631d(C1739s c1739s, int i, int i2) {
        int m34761k = m34761k(c1739s);
        this.f5202a.notifyItemMoved(i + m34761k, i2 + m34761k);
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: e */
    public void mo34630e(C1739s c1739s) {
        this.f5202a.notifyDataSetChanged();
        m34763i();
    }

    @Override // androidx.recyclerview.widget.C1739s.InterfaceC1741b
    /* renamed from: f */
    public void mo34629f(C1739s c1739s, int i, int i2) {
        this.f5202a.notifyItemRangeRemoved(i + m34761k(c1739s), i2);
    }

    /* renamed from: g */
    boolean m34765g(int i, RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> abstractC1623h) {
        if (i >= 0 && i <= this.f5206e.size()) {
            if (m34753s()) {
                C7675h.m17870b(abstractC1623h.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (abstractC1623h.hasStableIds()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (m34759m(abstractC1623h) != null) {
                return false;
            }
            C1739s c1739s = new C1739s(abstractC1623h, this, this.f5203b, this.f5209h.mo34864a());
            this.f5206e.add(i, c1739s);
            for (WeakReference<RecyclerView> weakReference : this.f5204c) {
                RecyclerView recyclerView = weakReference.get();
                if (recyclerView != null) {
                    abstractC1623h.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (c1739s.m34640a() > 0) {
                this.f5202a.notifyItemRangeInserted(m34761k(c1739s), c1739s.m34640a());
            }
            m34763i();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f5206e.size() + ". Given:" + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m34764h(RecyclerView.AbstractC1623h<RecyclerView.AbstractC1620e0> abstractC1623h) {
        return m34765g(this.f5206e.size(), abstractC1623h);
    }

    /* renamed from: n */
    public long m34758n(int i) {
        C1701a m34760l = m34760l(i);
        long m34639b = m34760l.f5210a.m34639b(m34760l.f5211b);
        m34766D(m34760l);
        return m34639b;
    }

    /* renamed from: o */
    public int m34757o(int i) {
        C1701a m34760l = m34760l(i);
        int m34638c = m34760l.f5210a.m34638c(m34760l.f5211b);
        m34766D(m34760l);
        return m34638c;
    }

    /* renamed from: p */
    public int m34756p(RecyclerView.AbstractC1623h<? extends RecyclerView.AbstractC1620e0> abstractC1623h, RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        C1739s c1739s = this.f5205d.get(abstractC1620e0);
        if (c1739s == null) {
            return -1;
        }
        int m34761k = i - m34761k(c1739s);
        int itemCount = c1739s.f5366c.getItemCount();
        if (m34761k >= 0 && m34761k < itemCount) {
            return c1739s.f5366c.findRelativeAdapterPositionIn(abstractC1623h, abstractC1620e0, m34761k);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m34761k + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + abstractC1620e0 + "adapter:" + abstractC1623h);
    }

    /* renamed from: q */
    public int m34755q() {
        int i = 0;
        for (C1739s c1739s : this.f5206e) {
            i += c1739s.m34640a();
        }
        return i;
    }

    /* renamed from: s */
    public boolean m34753s() {
        return this.f5208g != C1697g.C1698a.EnumC1699a.NO_STABLE_IDS;
    }

    /* renamed from: v */
    public void m34750v(RecyclerView recyclerView) {
        if (m34751u(recyclerView)) {
            return;
        }
        this.f5204c.add(new WeakReference<>(recyclerView));
        for (C1739s c1739s : this.f5206e) {
            c1739s.f5366c.onAttachedToRecyclerView(recyclerView);
        }
    }

    /* renamed from: w */
    public void m34749w(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        C1701a m34760l = m34760l(i);
        this.f5205d.put(abstractC1620e0, m34760l.f5210a);
        m34760l.f5210a.m34637d(abstractC1620e0, m34760l.f5211b);
        m34766D(m34760l);
    }

    /* renamed from: x */
    public RecyclerView.AbstractC1620e0 m34748x(ViewGroup viewGroup, int i) {
        return this.f5203b.mo34815a(i).m34636e(viewGroup, i);
    }

    /* renamed from: y */
    public void m34747y(RecyclerView recyclerView) {
        int size = this.f5204c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f5204c.get(size);
            if (weakReference.get() == null) {
                this.f5204c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f5204c.remove(size);
                break;
            }
            size--;
        }
        for (C1739s c1739s : this.f5206e) {
            c1739s.f5366c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    /* renamed from: z */
    public boolean m34746z(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        C1739s remove = this.f5205d.remove(abstractC1620e0);
        if (remove != null) {
            return remove.f5366c.onFailedToRecycleView(abstractC1620e0);
        }
        throw new IllegalStateException("Cannot find wrapper for " + abstractC1620e0 + ", seems like it is not bound by this adapter: " + this);
    }
}
