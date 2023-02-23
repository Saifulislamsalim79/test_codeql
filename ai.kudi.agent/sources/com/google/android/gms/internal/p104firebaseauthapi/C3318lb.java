package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lb */
/* loaded from: classes2.dex */
final class C3318lb extends ThreadLocal<Cipher> {
    /* renamed from: a */
    protected static final Cipher m30772a() {
        try {
            return C3184gc.f8504e.m31099a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Cipher initialValue() {
        return m30772a();
    }
}
