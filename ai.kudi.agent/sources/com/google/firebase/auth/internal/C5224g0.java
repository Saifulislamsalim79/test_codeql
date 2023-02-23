package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p104firebaseauthapi.C3015a5;
import com.google.android.gms.internal.p104firebaseauthapi.C3150f5;
import com.google.android.gms.internal.p104firebaseauthapi.C3285k5;
import com.google.android.gms.internal.p104firebaseauthapi.C3312l5;
import com.google.android.gms.internal.p104firebaseauthapi.C3568v1;
import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2;
import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3672z1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.g0 */
/* loaded from: classes2.dex */
public final class C5224g0 {

    /* renamed from: c */
    private static C5224g0 f13003c;

    /* renamed from: a */
    private final String f13004a;

    /* renamed from: b */
    private final C3312l5 f13005b;

    private C5224g0(Context context, String str, boolean z) {
        C3312l5 c3312l5;
        this.f13004a = str;
        try {
            C3015a5.m31455a();
            C3285k5 c3285k5 = new C3285k5();
            c3285k5.m30860f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            c3285k5.m30862d(C3150f5.f8460b);
            c3285k5.m30861e(String.format("android-keystore://firebear_master_key_id.%s", str));
            c3312l5 = c3285k5.m30859g();
        } catch (IOException | GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered during crypto setup:\n".concat(valueOf) : new String("Exception encountered during crypto setup:\n"));
            c3312l5 = null;
        }
        this.f13005b = c3312l5;
    }

    /* renamed from: a */
    public static C5224g0 m25326a(Context context, String str) {
        String str2;
        C5224g0 c5224g0 = f13003c;
        if (c5224g0 == null || ((str2 = c5224g0.f13004a) != str && (str2 == null || !str2.equals(str)))) {
            f13003c = new C5224g0(context, str, true);
        }
        return f13003c;
    }

    /* renamed from: b */
    public final String m25325b(String str) {
        String str2;
        C3312l5 c3312l5 = this.f13005b;
        if (c3312l5 != null) {
            try {
                synchronized (c3312l5) {
                    str2 = new String(((InterfaceC3672z1) this.f13005b.m30793a().m30870e(InterfaceC3672z1.class)).mo29912a(Base64.decode(str, 8), null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered while decrypting bytes:\n".concat(valueOf) : new String("Exception encountered while decrypting bytes:\n"));
                return null;
            }
        }
        Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
        return null;
    }

    /* renamed from: c */
    public final String m25324c() {
        if (this.f13005b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InterfaceC3335m2 m30144c = C3568v1.m30144c(byteArrayOutputStream);
        try {
            synchronized (this.f13005b) {
                this.f13005b.m30793a().m30873b().m30867h(m30144c);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered when attempting to get Public Key:\n".concat(valueOf) : new String("Exception encountered when attempting to get Public Key:\n"));
            return null;
        }
    }
}
