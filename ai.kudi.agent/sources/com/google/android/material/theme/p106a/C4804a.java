package com.google.android.material.theme.p106a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p201g.p202a.p209o.C7488d;
import p272h.p286c.p287a.p323c.C9233b;
/* compiled from: MaterialThemeOverlay.java */
/* renamed from: com.google.android.material.theme.a.a */
/* loaded from: classes2.dex */
public class C4804a {

    /* renamed from: a */
    private static final int[] f12163a = {16842752, C9233b.theme};

    /* renamed from: b */
    private static final int[] f12164b = {C9233b.materialThemeOverlay};

    /* renamed from: a */
    private static int m26260a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12163a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m26259b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12164b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m26258c(Context context, AttributeSet attributeSet, int i, int i2) {
        int m26259b = m26259b(context, attributeSet, i, i2);
        boolean z = (context instanceof C7488d) && ((C7488d) context).m18595c() == m26259b;
        if (m26259b == 0 || z) {
            return context;
        }
        C7488d c7488d = new C7488d(context, m26259b);
        int m26260a = m26260a(context, attributeSet);
        if (m26260a != 0) {
            c7488d.getTheme().applyStyle(m26260a, true);
        }
        return c7488d;
    }
}
