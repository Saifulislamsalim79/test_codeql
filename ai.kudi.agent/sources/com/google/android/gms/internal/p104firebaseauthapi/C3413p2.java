package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2 */
/* loaded from: classes2.dex */
public final class C3413p2 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<InterfaceC3361n2> f8840a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static InterfaceC3361n2 m30479a(String str) throws GeneralSecurityException {
        Iterator<InterfaceC3361n2> it = f8840a.iterator();
        while (it.hasNext()) {
            InterfaceC3361n2 next = it.next();
            if (next.mo30516f(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
