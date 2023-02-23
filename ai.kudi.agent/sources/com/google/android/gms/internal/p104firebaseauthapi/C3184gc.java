package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3345mc;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gc */
/* loaded from: classes2.dex */
public final class C3184gc<T_WRAPPER extends InterfaceC3345mc<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    private static final Logger f8501b = Logger.getLogger(C3184gc.class.getName());

    /* renamed from: c */
    private static final List<Provider> f8502c;

    /* renamed from: d */
    private static final boolean f8503d;

    /* renamed from: e */
    public static final C3184gc<C3211hc, Cipher> f8504e;

    /* renamed from: f */
    public static final C3184gc<C3319lc, Mac> f8505f;

    /* renamed from: g */
    public static final C3184gc<C3238ic, KeyAgreement> f8506g;

    /* renamed from: h */
    public static final C3184gc<C3292kc, KeyPairGenerator> f8507h;

    /* renamed from: i */
    public static final C3184gc<C3265jc, KeyFactory> f8508i;

    /* renamed from: a */
    private final T_WRAPPER f8509a;

    static {
        if (C3631xc.m30024b()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f8501b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f8502c = arrayList;
            f8503d = true;
        } else {
            f8502c = new ArrayList();
            f8503d = true;
        }
        f8504e = new C3184gc<>(new C3211hc());
        f8505f = new C3184gc<>(new C3319lc());
        f8506g = new C3184gc<>(new C3238ic());
        f8507h = new C3184gc<>(new C3292kc());
        f8508i = new C3184gc<>(new C3265jc());
    }

    public C3184gc(T_WRAPPER t_wrapper) {
        this.f8509a = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE m31099a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : f8502c) {
            try {
                return (T_ENGINE) this.f8509a.mo30701a(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f8503d) {
            return (T_ENGINE) this.f8509a.mo30701a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
