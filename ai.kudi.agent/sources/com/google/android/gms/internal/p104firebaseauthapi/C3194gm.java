package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2965c;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gm */
/* loaded from: classes2.dex */
public final class C3194gm {
    /* renamed from: a */
    public static long m31091a(String str) {
        s.f(str);
        List<String> m30291d = C3490s1.m30293b('.').m30291d(str);
        if (m30291d.size() < 2) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "));
        }
        try {
            C3221hm m31043a = C3221hm.m31043a(new String(C2965c.m31540b(m30291d.get(1)), "UTF-8"));
            return m31043a.m31042b().longValue() - m31043a.m31041c().longValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
