package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.SecureRandom;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wc */
/* loaded from: classes2.dex */
public final class C3605wc {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f9048a = new C3579vc();

    /* renamed from: a */
    public static byte[] m30084a(int i) {
        byte[] bArr = new byte[i];
        f9048a.get().nextBytes(bArr);
        return bArr;
    }
}
