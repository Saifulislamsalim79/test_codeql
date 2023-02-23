package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kc */
/* loaded from: classes2.dex */
public final class C3292kc implements InterfaceC3345mc<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ KeyPairGenerator mo30701a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
