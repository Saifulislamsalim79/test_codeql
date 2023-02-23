package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ko */
/* loaded from: classes2.dex */
public abstract class AbstractC3304ko {

    /* renamed from: a */
    int f8693a;

    /* renamed from: b */
    C3331lo f8694b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC3304ko(C3250io c3250io) {
    }

    /* renamed from: k */
    public static int m30819k(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: l */
    public static long m30818l(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static AbstractC3304ko m30817m(byte[] bArr, int i, int i2, boolean z) {
        C3277jo c3277jo = new C3277jo(bArr, 0, i2, z, null);
        try {
            c3277jo.mo30828b(i2);
            return c3277jo;
        } catch (zzaae e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo30829a();

    /* renamed from: b */
    public abstract int mo30828b(int i) throws zzaae;

    /* renamed from: c */
    public abstract int mo30827c() throws IOException;

    /* renamed from: d */
    public abstract AbstractC3223ho mo30826d() throws IOException;

    /* renamed from: e */
    public abstract String mo30825e() throws IOException;

    /* renamed from: f */
    public abstract String mo30824f() throws IOException;

    /* renamed from: g */
    public abstract void mo30823g(int i) throws zzaae;

    /* renamed from: h */
    public abstract void mo30822h(int i);

    /* renamed from: i */
    public abstract boolean mo30821i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo30820j() throws IOException;
}
