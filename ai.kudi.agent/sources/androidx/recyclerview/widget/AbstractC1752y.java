package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: SimpleItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes2.dex */
public abstract class AbstractC1752y extends RecyclerView.AbstractC1629m {

    /* renamed from: g */
    boolean f5382g = true;

    /* renamed from: A */
    public final void m34586A(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34578I(abstractC1620e0);
        m35192h(abstractC1620e0);
    }

    /* renamed from: B */
    public final void m34585B(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34577J(abstractC1620e0);
    }

    /* renamed from: C */
    public final void m34584C(RecyclerView.AbstractC1620e0 abstractC1620e0, boolean z) {
        m34576K(abstractC1620e0, z);
        m35192h(abstractC1620e0);
    }

    /* renamed from: D */
    public final void m34583D(RecyclerView.AbstractC1620e0 abstractC1620e0, boolean z) {
        m34575L(abstractC1620e0, z);
    }

    /* renamed from: E */
    public final void m34582E(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34574M(abstractC1620e0);
        m35192h(abstractC1620e0);
    }

    /* renamed from: F */
    public final void m34581F(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34573N(abstractC1620e0);
    }

    /* renamed from: G */
    public final void m34580G(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34572O(abstractC1620e0);
        m35192h(abstractC1620e0);
    }

    /* renamed from: H */
    public final void m34579H(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        m34571P(abstractC1620e0);
    }

    /* renamed from: I */
    public void m34578I(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: J */
    public void m34577J(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: K */
    public void m34576K(RecyclerView.AbstractC1620e0 abstractC1620e0, boolean z) {
    }

    /* renamed from: L */
    public void m34575L(RecyclerView.AbstractC1620e0 abstractC1620e0, boolean z) {
    }

    /* renamed from: M */
    public void m34574M(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: N */
    public void m34573N(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: O */
    public void m34572O(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: P */
    public void m34571P(RecyclerView.AbstractC1620e0 abstractC1620e0) {
    }

    /* renamed from: Q */
    public void m34570Q(boolean z) {
        this.f5382g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: a */
    public boolean mo34569a(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2) {
        if (c1632c != null && (c1632c.f5015a != c1632c2.f5015a || c1632c.f5016b != c1632c2.f5016b)) {
            return mo34562y(abstractC1620e0, c1632c.f5015a, c1632c.f5016b, c1632c2.f5015a, c1632c2.f5016b);
        }
        return mo34564w(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: b */
    public boolean mo34568b(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1620e0 abstractC1620e02, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2) {
        int i;
        int i2;
        int i3 = c1632c.f5015a;
        int i4 = c1632c.f5016b;
        if (abstractC1620e02.shouldIgnore()) {
            int i5 = c1632c.f5015a;
            i2 = c1632c.f5016b;
            i = i5;
        } else {
            i = c1632c2.f5015a;
            i2 = c1632c2.f5016b;
        }
        return mo34563x(abstractC1620e0, abstractC1620e02, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: c */
    public boolean mo34567c(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2) {
        int i = c1632c.f5015a;
        int i2 = c1632c.f5016b;
        View view = abstractC1620e0.itemView;
        int left = c1632c2 == null ? view.getLeft() : c1632c2.f5015a;
        int top = c1632c2 == null ? view.getTop() : c1632c2.f5016b;
        if (!abstractC1620e0.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return mo34562y(abstractC1620e0, i, i2, left, top);
        }
        return mo34561z(abstractC1620e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: d */
    public boolean mo34566d(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1629m.C1632c c1632c, RecyclerView.AbstractC1629m.C1632c c1632c2) {
        if (c1632c.f5015a == c1632c2.f5015a && c1632c.f5016b == c1632c2.f5016b) {
            m34582E(abstractC1620e0);
            return false;
        }
        return mo34562y(abstractC1620e0, c1632c.f5015a, c1632c.f5016b, c1632c2.f5015a, c1632c2.f5016b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1629m
    /* renamed from: f */
    public boolean mo34565f(RecyclerView.AbstractC1620e0 abstractC1620e0) {
        return !this.f5382g || abstractC1620e0.isInvalid();
    }

    /* renamed from: w */
    public abstract boolean mo34564w(RecyclerView.AbstractC1620e0 abstractC1620e0);

    /* renamed from: x */
    public abstract boolean mo34563x(RecyclerView.AbstractC1620e0 abstractC1620e0, RecyclerView.AbstractC1620e0 abstractC1620e02, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo34562y(RecyclerView.AbstractC1620e0 abstractC1620e0, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo34561z(RecyclerView.AbstractC1620e0 abstractC1620e0);
}
