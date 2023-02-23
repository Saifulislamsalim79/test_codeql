package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t8 */
/* loaded from: classes2.dex */
public final class C4004t8 {

    /* renamed from: a */
    static final Charset f9713a;

    /* renamed from: b */
    public static final byte[] f9714b;

    static {
        Charset.forName("US-ASCII");
        f9713a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9714b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f9714b;
        int i = C3971r7.f9650a;
        int length = bArr2.length;
        try {
            new C3940p7(bArr2, 0, 0, false, null).m29103c(0);
        } catch (zzkh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m28909a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m28908b(byte[] bArr) {
        int length = bArr.length;
        int m28906d = m28906d(length, bArr, 0, length);
        if (m28906d == 0) {
            return 1;
        }
        return m28906d;
    }

    /* renamed from: c */
    public static int m28907c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m28906d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> T m28905e(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> T m28904f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Object m28903g(Object obj, Object obj2) {
        InterfaceC3911n9 mo29248c = ((InterfaceC3927o9) obj).mo29248c();
        mo29248c.mo28539k0((InterfaceC3927o9) obj2);
        return mo29248c.mo29328Z();
    }

    /* renamed from: h */
    public static String m28902h(byte[] bArr) {
        return new String(bArr, f9713a);
    }

    /* renamed from: i */
    public static boolean m28901i(byte[] bArr) {
        return C3741cb.m29704e(bArr);
    }
}
