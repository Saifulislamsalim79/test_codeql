package com.google.android.gms.internal.p104firebaseauthapi;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o5 */
/* loaded from: classes2.dex */
public final class C3390o5 implements InterfaceC3361n2 {

    /* renamed from: b */
    private static final String f8795b = "o5";

    /* renamed from: a */
    private KeyStore f8796a = new C3364n5().f8751a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean m30518a(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(f8795b, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f8796a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f8796a.containsAlias(str2);
        }
        return this.f8796a.containsAlias(C3657yc.m29962a("android-keystore://", str));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3361n2
    /* renamed from: e */
    public final synchronized InterfaceC3542u1 mo30517e(String str) throws GeneralSecurityException {
        C3338m5 c3338m5;
        c3338m5 = new C3338m5(C3657yc.m29962a("android-keystore://", str), this.f8796a);
        byte[] m30084a = C3605wc.m30084a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(m30084a, c3338m5.mo29893a(c3338m5.mo29892b(m30084a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c3338m5;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3361n2
    /* renamed from: f */
    public final synchronized boolean mo30516f(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
