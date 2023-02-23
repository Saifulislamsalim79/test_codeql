package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t */
/* loaded from: classes2.dex */
final class C3514t {
    /* renamed from: a */
    public static final int m30226a(int i, Object obj, Object obj2) {
        C3488s c3488s = (C3488s) obj;
        C3462r c3462r = (C3462r) obj2;
        if (c3488s.isEmpty()) {
            return 0;
        }
        Iterator it = c3488s.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final boolean m30225b(Object obj) {
        return !((C3488s) obj).m30299g();
    }

    /* renamed from: c */
    public static final Object m30224c(Object obj, Object obj2) {
        C3488s c3488s = (C3488s) obj;
        C3488s c3488s2 = (C3488s) obj2;
        if (!c3488s2.isEmpty()) {
            if (!c3488s.m30299g()) {
                c3488s = c3488s.m30302b();
            }
            c3488s.m30300e(c3488s2);
        }
        return c3488s;
    }
}
