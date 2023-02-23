package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f2 */
/* loaded from: classes2.dex */
public final class C3147f2 {
    /* renamed from: a */
    public static C3120e2 m31165a(String str) throws GeneralSecurityException {
        if (!C3067c3.m31298k().containsKey(str)) {
            throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
        }
        return C3067c3.m31298k().get(str);
    }
}
