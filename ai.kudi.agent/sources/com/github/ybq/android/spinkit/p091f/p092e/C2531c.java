package com.github.ybq.android.spinkit.p091f.p092e;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: PathInterpolatorCompat.java */
/* renamed from: com.github.ybq.android.spinkit.f.e.c */
/* loaded from: classes2.dex */
public class C2531c {
    /* renamed from: a */
    public static Interpolator m32662a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C2532d.m32661a(f, f2, f3, f4);
        }
        return C2533e.m32660a(f, f2, f3, f4);
    }
}
