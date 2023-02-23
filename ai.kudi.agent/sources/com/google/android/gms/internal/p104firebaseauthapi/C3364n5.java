package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Build;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n5 */
/* loaded from: classes2.dex */
public final class C3364n5 {

    /* renamed from: a */
    KeyStore f8751a;

    public C3364n5() {
        this.f8751a = null;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f8751a = keyStore;
                keyStore.load(null);
                return;
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        throw new IllegalStateException("need Android Keystore on Android M or newer");
    }
}
