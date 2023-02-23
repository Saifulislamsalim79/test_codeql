package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.p339w.InterfaceC9314a;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC1280c<View> {

    /* renamed from: a */
    private int f12220a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes2.dex */
    class ViewTreeObserver$OnPreDrawListenerC4824a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        final /* synthetic */ View f12221c;

        /* renamed from: d */
        final /* synthetic */ int f12222d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC9314a f12223e;

        ViewTreeObserver$OnPreDrawListenerC4824a(View view, int i, InterfaceC9314a interfaceC9314a) {
            this.f12221c = view;
            this.f12222d = i;
            this.f12223e = interfaceC9314a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f12221c.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f12220a == this.f12222d) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC9314a interfaceC9314a = this.f12223e;
                expandableBehavior.mo26178H((View) interfaceC9314a, this.f12221c, interfaceC9314a.mo15071a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f12220a = 0;
    }

    /* renamed from: F */
    private boolean m26209F(boolean z) {
        if (!z) {
            return this.f12220a == 1;
        }
        int i = this.f12220a;
        return i == 0 || i == 2;
    }

    /* renamed from: G */
    protected InterfaceC9314a m26208G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m36537l = coordinatorLayout.m36537l(view);
        int size = m36537l.size();
        for (int i = 0; i < size; i++) {
            View view2 = m36537l.get(i);
            if (mo26179e(coordinatorLayout, view, view2)) {
                return (InterfaceC9314a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo26178H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: h */
    public boolean mo26207h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC9314a interfaceC9314a = (InterfaceC9314a) view2;
        if (m26209F(interfaceC9314a.mo15071a())) {
            this.f12220a = interfaceC9314a.mo15071a() ? 1 : 2;
            return mo26178H((View) interfaceC9314a, view, interfaceC9314a.mo15071a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: l */
    public boolean mo26206l(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC9314a m26208G;
        if (C7759x.m17535U(view) || (m26208G = m26208G(coordinatorLayout, view)) == null || !m26209F(m26208G.mo15071a())) {
            return false;
        }
        int i2 = m26208G.mo15071a() ? 1 : 2;
        this.f12220a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC4824a(view, i2, m26208G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12220a = 0;
    }
}
