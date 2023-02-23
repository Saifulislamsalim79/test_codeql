package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p201g.p227h.p233h.C7628a;
import p201g.p227h.p238l.C7693e;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderScrollingViewBehavior.java */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4503b extends C4504c<View> {

    /* renamed from: d */
    final Rect f11012d;

    /* renamed from: e */
    final Rect f11013e;

    /* renamed from: f */
    private int f11014f;

    /* renamed from: g */
    private int f11015g;

    public AbstractC4503b() {
        this.f11012d = new Rect();
        this.f11013e = new Rect();
        this.f11014f = 0;
    }

    /* renamed from: N */
    private static int m27615N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C4504c
    /* renamed from: F */
    public void mo27610F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View mo27621H = mo27621H(coordinatorLayout.m36537l(view));
        if (mo27621H != null) {
            CoordinatorLayout.C1283f c1283f = (CoordinatorLayout.C1283f) view.getLayoutParams();
            Rect rect = this.f11012d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1283f).leftMargin, mo27621H.getBottom() + ((ViewGroup.MarginLayoutParams) c1283f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1283f).rightMargin, ((coordinatorLayout.getHeight() + mo27621H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1283f).bottomMargin);
            C7698g0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C7759x.m17479z(coordinatorLayout) && !C7759x.m17479z(view)) {
                rect.left += lastWindowInsets.m17784j();
                rect.right -= lastWindowInsets.m17783k();
            }
            Rect rect2 = this.f11013e;
            C7693e.m17806a(m27615N(c1283f.f4026c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m27620I = m27620I(mo27621H);
            view.layout(rect2.left, rect2.top - m27620I, rect2.right, rect2.bottom - m27620I);
            this.f11014f = rect2.top - mo27621H.getBottom();
            return;
        }
        super.mo27610F(coordinatorLayout, view, i);
        this.f11014f = 0;
    }

    /* renamed from: H */
    abstract View mo27621H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m27620I(View view) {
        if (this.f11015g == 0) {
            return 0;
        }
        float mo27619J = mo27619J(view);
        int i = this.f11015g;
        return C7628a.m17971b((int) (mo27619J * i), 0, i);
    }

    /* renamed from: J */
    abstract float mo27619J(View view);

    /* renamed from: K */
    public final int m27618K() {
        return this.f11015g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo27617L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m27616M() {
        return this.f11014f;
    }

    /* renamed from: O */
    public final void m27614O(int i) {
        this.f11015g = i;
    }

    /* renamed from: P */
    protected boolean m27613P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: m */
    public boolean mo27612m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo27621H;
        C7698g0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo27621H = mo27621H(coordinatorLayout.m36537l(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (C7759x.m17479z(mo27621H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m17782l() + lastWindowInsets.m17785i();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo27617L = size + mo27617L(mo27621H);
            int measuredHeight = mo27621H.getMeasuredHeight();
            if (m27613P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo27617L -= measuredHeight;
            }
            coordinatorLayout.m36563D(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo27617L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public AbstractC4503b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11012d = new Rect();
        this.f11013e = new Rect();
        this.f11014f = 0;
    }
}
