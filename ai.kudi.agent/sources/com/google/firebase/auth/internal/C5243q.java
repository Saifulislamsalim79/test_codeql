package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.p104firebaseauthapi.C3248im;
import com.google.firebase.auth.AbstractC5258l;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.q */
/* loaded from: classes2.dex */
public final class C5243q {
    /* renamed from: a */
    public static AbstractC5258l m25285a(C3248im c3248im) {
        if (c3248im == null || TextUtils.isEmpty(c3248im.m30956s())) {
            return null;
        }
        String m30957l = c3248im.m30957l();
        String m30958k = c3248im.m30958k();
        long m30960f = c3248im.m30960f();
        String m30956s = c3248im.m30956s();
        com.google.android.gms.common.internal.s.f(m30956s);
        return new C5271s(m30957l, m30958k, m30960f, m30956s);
    }

    /* renamed from: b */
    public static List<AbstractC5258l> m25284b(List<C3248im> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C3248im c3248im : list) {
                AbstractC5258l m25285a = m25285a(c3248im);
                if (m25285a != null) {
                    arrayList.add(m25285a);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
