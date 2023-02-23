package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.firebase.C5988g;
import java.lang.ref.WeakReference;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fl */
/* loaded from: classes2.dex */
public final class C3166fl {

    /* renamed from: a */
    private static final Map<String, C3112dl> f8476a = new C7521a();

    /* renamed from: b */
    private static final Map<String, WeakReference<InterfaceC3139el>> f8477b = new C7521a();

    /* renamed from: a */
    public static String m31140a(String str) {
        C3112dl c3112dl;
        synchronized (f8476a) {
            c3112dl = f8476a.get(str);
        }
        if (c3112dl != null) {
            return String.valueOf(m31134g(c3112dl.m31233b(), c3112dl.m31234a(), c3112dl.m31233b().contains(":"))).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    /* renamed from: b */
    public static String m31139b(String str) {
        C3112dl c3112dl;
        String str2;
        synchronized (f8476a) {
            c3112dl = f8476a.get(str);
        }
        if (c3112dl != null) {
            String valueOf = String.valueOf(m31134g(c3112dl.m31233b(), c3112dl.m31234a(), c3112dl.m31233b().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    /* renamed from: c */
    public static String m31138c(String str) {
        C3112dl c3112dl;
        String str2;
        synchronized (f8476a) {
            c3112dl = f8476a.get(str);
        }
        if (c3112dl != null) {
            String valueOf = String.valueOf(m31134g(c3112dl.m31233b(), c3112dl.m31234a(), c3112dl.m31233b().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    /* renamed from: d */
    public static String m31137d(String str) {
        C3112dl c3112dl;
        String str2;
        synchronized (f8476a) {
            c3112dl = f8476a.get(str);
        }
        if (c3112dl != null) {
            String valueOf = String.valueOf(m31134g(c3112dl.m31233b(), c3112dl.m31234a(), c3112dl.m31233b().contains(":")));
            str2 = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        } else {
            str2 = "https://";
        }
        return String.valueOf(str2).concat("securetoken.googleapis.com/v1");
    }

    /* renamed from: e */
    public static void m31136e(String str, InterfaceC3139el interfaceC3139el) {
        synchronized (f8477b) {
            f8477b.put(str, new WeakReference<>(interfaceC3139el));
        }
    }

    /* renamed from: f */
    public static boolean m31135f(C5988g c5988g) {
        return f8476a.containsKey(c5988g.m23089m().m23069b());
    }

    /* renamed from: g */
    private static String m31134g(String str, int i, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("http://[");
            sb.append(str);
            sb.append("]:");
            sb.append(i);
            sb.append("/");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20);
        sb2.append("http://");
        sb2.append(str);
        sb2.append(":");
        sb2.append(i);
        sb2.append("/");
        return sb2.toString();
    }
}
