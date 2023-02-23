package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wo */
/* loaded from: classes2.dex */
public final class C3617wo {

    /* renamed from: b */
    private static volatile C3617wo f9069b;

    /* renamed from: c */
    static final C3617wo f9070c = new C3617wo(true);

    /* renamed from: a */
    private final Map<C3591vo, C3224hp<?, ?>> f9071a;

    C3617wo() {
        this.f9071a = new HashMap();
    }

    /* renamed from: a */
    public static C3617wo m30072a() {
        C3617wo c3617wo = f9069b;
        if (c3617wo == null) {
            synchronized (C3617wo.class) {
                c3617wo = f9069b;
                if (c3617wo == null) {
                    c3617wo = f9070c;
                    f9069b = c3617wo;
                }
            }
        }
        return c3617wo;
    }

    /* renamed from: b */
    public final <ContainingType extends InterfaceC3644y> C3224hp<ContainingType, ?> m30071b(ContainingType containingtype, int i) {
        return (C3224hp<ContainingType, ?>) this.f9071a.get(new C3591vo(containingtype, i));
    }

    C3617wo(boolean z) {
        this.f9071a = Collections.emptyMap();
    }
}
