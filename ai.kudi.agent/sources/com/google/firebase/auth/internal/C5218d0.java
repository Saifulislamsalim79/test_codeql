package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
import com.google.firebase.auth.AbstractC5197c;
import com.google.firebase.auth.C5201e;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.C5209i;
import com.google.firebase.auth.C5254j;
import com.google.firebase.auth.C5272t;
import com.google.firebase.auth.C5273u;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.d0 */
/* loaded from: classes2.dex */
public final class C5218d0 {
    /* renamed from: a */
    public static C3168fn m25340a(AbstractC5197c abstractC5197c, String str) {
        com.google.android.gms.common.internal.s.j(abstractC5197c);
        if (C5254j.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5254j.m25261k((C5254j) abstractC5197c, str);
        }
        if (C5201e.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5201e.m25365k((C5201e) abstractC5197c, str);
        }
        if (C5273u.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5273u.m25235k((C5273u) abstractC5197c, str);
        }
        if (C5209i.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5209i.m25358k((C5209i) abstractC5197c, str);
        }
        if (C5272t.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5272t.m25238k((C5272t) abstractC5197c, str);
        }
        if (C5206g0.class.isAssignableFrom(abstractC5197c.getClass())) {
            return C5206g0.m25362s((C5206g0) abstractC5197c, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
