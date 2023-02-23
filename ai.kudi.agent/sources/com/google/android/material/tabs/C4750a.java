package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p272h.p286c.p287a.p323c.p328m.C9278a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ElasticTabIndicatorInterpolator.java */
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes2.dex */
public class C4750a extends C4751b {
    /* renamed from: e */
    private static float m26479e(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m26478f(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.C4751b
    /* renamed from: c */
    public void mo26475c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m26478f;
        float m26479e;
        RectF m26477a = C4751b.m26477a(tabLayout, view);
        RectF m26477a2 = C4751b.m26477a(tabLayout, view2);
        if (m26477a.left < m26477a2.left) {
            m26478f = m26479e(f);
            m26479e = m26478f(f);
        } else {
            m26478f = m26478f(f);
            m26479e = m26479e(f);
        }
        drawable.setBounds(C9278a.m15236b((int) m26477a.left, (int) m26477a2.left, m26478f), drawable.getBounds().top, C9278a.m15236b((int) m26477a.right, (int) m26477a2.right, m26479e), drawable.getBounds().bottom);
    }
}
