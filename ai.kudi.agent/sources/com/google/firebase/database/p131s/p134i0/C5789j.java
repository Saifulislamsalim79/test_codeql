package com.google.firebase.database.p131s.p134i0;

import java.util.Random;
/* compiled from: PushIdGenerator.java */
/* renamed from: com.google.firebase.database.s.i0.j */
/* loaded from: classes2.dex */
public class C5789j {

    /* renamed from: a */
    private static final Random f14220a = new Random();

    /* renamed from: b */
    private static long f14221b = 0;

    /* renamed from: c */
    private static final int[] f14222c = new int[12];

    /* renamed from: a */
    public static synchronized String m23767a(long j) {
        String sb;
        synchronized (C5789j.class) {
            boolean z = true;
            boolean z2 = j == f14221b;
            f14221b = j;
            char[] cArr = new char[8];
            StringBuilder sb2 = new StringBuilder(20);
            for (int i = 7; i >= 0; i--) {
                cArr[i] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            C5795m.m23745f(j == 0);
            sb2.append(cArr);
            if (z2) {
                m23766b();
            } else {
                for (int i2 = 0; i2 < 12; i2++) {
                    f14222c[i2] = f14220a.nextInt(64);
                }
            }
            for (int i3 = 0; i3 < 12; i3++) {
                sb2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(f14222c[i3]));
            }
            if (sb2.length() != 20) {
                z = false;
            }
            C5795m.m23745f(z);
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: b */
    private static void m23766b() {
        for (int i = 11; i >= 0; i--) {
            int[] iArr = f14222c;
            if (iArr[i] != 63) {
                iArr[i] = iArr[i] + 1;
                return;
            }
            iArr[i] = 0;
        }
    }
}
