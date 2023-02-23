package com.google.android.gms.internal.p104firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e */
/* loaded from: classes2.dex */
public final class C3117e {

    /* renamed from: a */
    static final Charset f8412a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f8413b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8413b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f8413b;
        int length = bArr2.length;
        AbstractC3304ko.m30817m(bArr2, 0, 0, false);
    }

    /* renamed from: a */
    public static int m31225a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m31224b(byte[] bArr) {
        int length = bArr.length;
        int m31222d = m31222d(length, bArr, 0, length);
        if (m31222d == 0) {
            return 1;
        }
        return m31222d;
    }

    /* renamed from: c */
    public static int m31223c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m31222d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <T> T m31221e(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> T m31220f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Object m31219g(Object obj, Object obj2) {
        InterfaceC3618x mo29998s = ((InterfaceC3644y) obj).mo29998s();
        mo29998s.mo30070E0((InterfaceC3644y) obj2);
        return mo29998s.mo30069m();
    }

    /* renamed from: h */
    public static String m31218h(byte[] bArr) {
        return new String(bArr, f8412a);
    }

    /* renamed from: i */
    public static boolean m31217i(byte[] bArr) {
        return C3386o1.m30523e(bArr);
    }
}
