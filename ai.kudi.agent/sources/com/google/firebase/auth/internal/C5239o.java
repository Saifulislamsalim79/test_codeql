package com.google.firebase.auth.internal;

import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.internal.p104firebaseauthapi.zzll;
import com.google.firebase.auth.C5207h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.o */
/* loaded from: classes2.dex */
public final class C5239o {

    /* renamed from: a */
    private static final C2946a f13033a = new C2946a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C5207h m25314a(String str) {
        Map hashMap;
        try {
            hashMap = C5241p.m25288b(str);
        } catch (zzll e) {
            f13033a.m31584b("Error parsing token claims", e, new Object[0]);
            hashMap = new HashMap();
        }
        return new C5207h(str, hashMap);
    }
}
