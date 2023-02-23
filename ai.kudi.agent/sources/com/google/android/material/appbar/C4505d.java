package com.google.android.material.appbar;

import android.view.View;
import p201g.p227h.p238l.C7759x;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetHelper.java */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes2.dex */
public class C4505d {

    /* renamed from: a */
    private final View f11019a;

    /* renamed from: b */
    private int f11020b;

    /* renamed from: c */
    private int f11021c;

    /* renamed from: d */
    private int f11022d;

    /* renamed from: e */
    private int f11023e;

    /* renamed from: f */
    private boolean f11024f = true;

    /* renamed from: g */
    private boolean f11025g = true;

    public C4505d(View view) {
        this.f11019a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m27608a() {
        View view = this.f11019a;
        C7759x.m17528a0(view, this.f11022d - (view.getTop() - this.f11020b));
        View view2 = this.f11019a;
        C7759x.m17530Z(view2, this.f11023e - (view2.getLeft() - this.f11021c));
    }

    /* renamed from: b */
    public int m27607b() {
        return this.f11020b;
    }

    /* renamed from: c */
    public int m27606c() {
        return this.f11022d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m27605d() {
        this.f11020b = this.f11019a.getTop();
        this.f11021c = this.f11019a.getLeft();
    }

    /* renamed from: e */
    public boolean m27604e(int i) {
        if (!this.f11025g || this.f11023e == i) {
            return false;
        }
        this.f11023e = i;
        m27608a();
        return true;
    }

    /* renamed from: f */
    public boolean m27603f(int i) {
        if (!this.f11024f || this.f11022d == i) {
            return false;
        }
        this.f11022d = i;
        m27608a();
        return true;
    }
}
