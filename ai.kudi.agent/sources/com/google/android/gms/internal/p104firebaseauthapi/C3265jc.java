package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jc */
/* loaded from: classes2.dex */
public final class C3265jc implements InterfaceC3345mc<KeyFactory> {
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ KeyFactory mo30701a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
