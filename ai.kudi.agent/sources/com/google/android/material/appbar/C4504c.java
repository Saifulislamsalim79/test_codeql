package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes2.dex */
public class C4504c<V extends View> extends CoordinatorLayout.AbstractC1280c<V> {

    /* renamed from: a */
    private C4505d f11016a;

    /* renamed from: b */
    private int f11017b;

    /* renamed from: c */
    private int f11018c;

    public C4504c() {
        this.f11017b = 0;
        this.f11018c = 0;
    }

    /* renamed from: E */
    public int m27611E() {
        C4505d c4505d = this.f11016a;
        if (c4505d != null) {
            return c4505d.m27606c();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo27610F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m36564C(v, i);
    }

    /* renamed from: G */
    public boolean m27609G(int i) {
        C4505d c4505d = this.f11016a;
        if (c4505d != null) {
            return c4505d.m27603f(i);
        }
        this.f11017b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1280c
    /* renamed from: l */
    public boolean mo26206l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo27610F(coordinatorLayout, v, i);
        if (this.f11016a == null) {
            this.f11016a = new C4505d(v);
        }
        this.f11016a.m27605d();
        this.f11016a.m27608a();
        int i2 = this.f11017b;
        if (i2 != 0) {
            this.f11016a.m27603f(i2);
            this.f11017b = 0;
        }
        int i3 = this.f11018c;
        if (i3 != 0) {
            this.f11016a.m27604e(i3);
            this.f11018c = 0;
            return true;
        }
        return true;
    }

    public C4504c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11017b = 0;
        this.f11018c = 0;
    }
}
