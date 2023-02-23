package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hc */
/* loaded from: classes2.dex */
public final class C3211hc implements InterfaceC3345mc<Cipher> {
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Cipher mo30701a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
