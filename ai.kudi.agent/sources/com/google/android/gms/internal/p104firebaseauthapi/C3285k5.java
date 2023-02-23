package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k5 */
/* loaded from: classes2.dex */
public final class C3285k5 {

    /* renamed from: e */
    private C3309l2 f8668e;

    /* renamed from: f */
    private C3416p5 f8669f = null;

    /* renamed from: a */
    private InterfaceC3335m2 f8664a = null;

    /* renamed from: b */
    private String f8665b = null;

    /* renamed from: c */
    private InterfaceC3542u1 f8666c = null;

    /* renamed from: d */
    private C3120e2 f8667d = null;

    /* renamed from: h */
    private final InterfaceC3542u1 m30858h() throws GeneralSecurityException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 23) {
            C3390o5 c3390o5 = new C3390o5();
            boolean m30518a = c3390o5.m30518a(this.f8665b);
            if (!m30518a) {
                try {
                    String str4 = this.f8665b;
                    if (!new C3390o5().m30518a(str4)) {
                        String m29962a = C3657yc.m29962a("android-keystore://", str4);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(new KeyGenParameterSpec.Builder(m29962a, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                        keyGenerator.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str4));
                    }
                } catch (GeneralSecurityException | ProviderException e) {
                    str2 = C3312l5.f8696b;
                    Log.w(str2, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return c3390o5.mo30517e(this.f8665b);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!m30518a) {
                    str3 = C3312l5.f8696b;
                    Log.w(str3, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f8665b), e2);
            }
        }
        str = C3312l5.f8696b;
        Log.w(str, "Android Keystore requires at least Android M");
        return null;
    }

    /* renamed from: i */
    private final C3309l2 m30857i() throws GeneralSecurityException, IOException {
        String str;
        InterfaceC3542u1 interfaceC3542u1 = this.f8666c;
        if (interfaceC3542u1 != null) {
            try {
                return C3309l2.m30800f(C3282k2.m30866i(this.f8669f, interfaceC3542u1));
            } catch (zzaae | GeneralSecurityException e) {
                str = C3312l5.f8696b;
                Log.w(str, "cannot decrypt keyset: ", e);
            }
        }
        return C3309l2.m30800f(C3594w1.m30101b(this.f8669f));
    }

    @Deprecated
    /* renamed from: d */
    public final C3285k5 m30862d(C3020aa c3020aa) {
        String m31430E = c3020aa.m31430E();
        byte[] m31017Z = c3020aa.m31431D().m31017Z();
        EnumC3048bb m31432C = c3020aa.m31432C();
        int i = C3312l5.f8697c;
        EnumC3048bb enumC3048bb = EnumC3048bb.UNKNOWN_PREFIX;
        int ordinal = m31432C.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f8667d = C3120e2.m31211e(m31430E, m31017Z, i2);
        return this;
    }

    /* renamed from: e */
    public final C3285k5 m30861e(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f8665b = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* renamed from: f */
    public final C3285k5 m30860f(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.f8669f = new C3416p5(context, "GenericIdpKeyset", str2);
            this.f8664a = new C3442q5(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* renamed from: g */
    public final synchronized C3312l5 m30859g() throws GeneralSecurityException, IOException {
        String str;
        C3309l2 m30801e;
        if (this.f8665b != null) {
            this.f8666c = m30858h();
        }
        try {
            m30801e = m30857i();
        } catch (FileNotFoundException e) {
            str = C3312l5.f8696b;
            Log.i(str, "keyset not found, will generate a new one", e);
            if (this.f8667d != null) {
                m30801e = C3309l2.m30801e();
                m30801e.m30803c(this.f8667d);
                m30801e.m30802d(m30801e.m30804b().m30871d().m30571A(0).m30702z());
                if (this.f8666c != null) {
                    m30801e.m30804b().m30868g(this.f8664a, this.f8666c);
                } else {
                    C3594w1.m30102a(m30801e.m30804b(), this.f8664a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f8668e = m30801e;
        return new C3312l5(this, null);
    }
}
