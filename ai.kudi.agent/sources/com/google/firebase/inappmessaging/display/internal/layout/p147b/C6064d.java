package com.google.firebase.inappmessaging.display.internal.layout.p147b;

import android.view.View;
import android.widget.ScrollView;
/* compiled from: ViewMeasure.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.b.d */
/* loaded from: classes2.dex */
public class C6064d {

    /* renamed from: a */
    private View f14814a;

    /* renamed from: b */
    private boolean f14815b;

    /* renamed from: c */
    private int f14816c;

    public C6064d(View view, boolean z) {
        this.f14814a = view;
        this.f14815b = z;
    }

    /* renamed from: a */
    public int m22827a() {
        if (this.f14814a.getVisibility() == 8) {
            return 0;
        }
        View view = this.f14814a;
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            return scrollView.getPaddingBottom() + scrollView.getPaddingTop() + scrollView.getChildAt(0).getMeasuredHeight();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    public int m22826b() {
        return this.f14816c;
    }

    /* renamed from: c */
    public View m22825c() {
        return this.f14814a;
    }

    /* renamed from: d */
    public boolean m22824d() {
        return this.f14815b;
    }

    /* renamed from: e */
    public void m22823e(int i, int i2) {
        C6061b.m22837b(this.f14814a, i, i2);
    }

    /* renamed from: f */
    public void m22822f(int i, int i2) {
        this.f14816c = i2;
    }
}
