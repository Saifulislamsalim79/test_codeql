package com.google.firebase.inappmessaging.display.internal.layout.p147b;

import android.view.View;
import com.google.firebase.inappmessaging.display.internal.C6065m;
/* compiled from: MeasureUtils.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.layout.b.b */
/* loaded from: classes2.dex */
public class C6061b {
    /* renamed from: a */
    private static void m22838a(View view, int i, int i2, int i3, int i4) {
        C6065m.m22818d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i = 0;
            i2 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i4));
        C6065m.m22818d("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: b */
    public static void m22837b(View view, int i, int i2) {
        m22838a(view, i, i2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public static void m22836c(View view, int i, int i2) {
        m22838a(view, i, i2, Integer.MIN_VALUE, 1073741824);
    }

    /* renamed from: d */
    public static void m22835d(View view, int i, int i2) {
        m22838a(view, i, i2, 1073741824, Integer.MIN_VALUE);
    }
}
