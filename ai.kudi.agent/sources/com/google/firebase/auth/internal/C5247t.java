package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.t */
/* loaded from: classes2.dex */
public final class C5247t {

    /* renamed from: a */
    private static final List<String> f13050a = new ArrayList(Arrays.asList("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"));

    /* renamed from: b */
    private static final C5247t f13051b = new C5247t();

    private C5247t() {
    }

    /* renamed from: a */
    public static C5247t m25281a() {
        return f13051b;
    }

    /* renamed from: d */
    private static final void m25278d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : f13050a) {
            edit.remove(str);
        }
        edit.commit();
    }

    /* renamed from: b */
    public final void m25280b(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        m25278d(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L30;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25279c(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.C5247t.m25279c(com.google.firebase.auth.FirebaseAuth):void");
    }
}
