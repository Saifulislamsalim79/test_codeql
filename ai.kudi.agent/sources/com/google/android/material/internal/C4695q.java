package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C1138r0;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: ThemeEnforcement.java */
/* renamed from: com.google.android.material.internal.q */
/* loaded from: classes2.dex */
public final class C4695q {

    /* renamed from: a */
    private static final int[] f11776a = {C9233b.colorPrimary};

    /* renamed from: b */
    private static final int[] f11777b = {C9233b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m26697a(Context context) {
        m26693e(context, f11776a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m26696b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C9277l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C9233b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m26695c(context);
            }
        }
        m26697a(context);
    }

    /* renamed from: c */
    public static void m26695c(Context context) {
        m26693e(context, f11777b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m26694d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C9277l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m26692f(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            z = obtainStyledAttributes.getResourceId(C9277l.ThemeEnforcement_android_textAppearance, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m26693e(Context context, int[] iArr, String str) {
        if (m26691g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    private static boolean m26692f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m26691g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m26690h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m26696b(context, attributeSet, i, i2);
        m26694d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C1138r0 m26689i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m26696b(context, attributeSet, i, i2);
        m26694d(context, attributeSet, iArr, i, i2, iArr2);
        return C1138r0.m37026v(context, attributeSet, iArr, i, i2);
    }
}
