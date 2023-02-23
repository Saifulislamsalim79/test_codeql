package androidx.core.widget;

import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: EdgeEffectCompat.java */
/* renamed from: androidx.core.widget.d */
/* loaded from: classes2.dex */
public final class C1393d {
    /* renamed from: a */
    public static void m36118a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
