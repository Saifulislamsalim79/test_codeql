package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lc */
/* loaded from: classes2.dex */
public final class C3319lc implements InterfaceC3345mc<Mac> {
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Mac mo30701a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
