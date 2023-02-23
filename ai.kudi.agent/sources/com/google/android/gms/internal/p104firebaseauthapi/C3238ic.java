package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ic */
/* loaded from: classes2.dex */
public final class C3238ic implements InterfaceC3345mc<KeyAgreement> {
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ KeyAgreement mo30701a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
