package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C2970h;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.a0 */
/* loaded from: classes2.dex */
public final class C5212a0 {

    /* renamed from: b */
    private static final C5212a0 f12985b = new C5212a0();

    /* renamed from: a */
    private final C5247t f12986a;

    private C5212a0() {
        C5247t m25281a = C5247t.m25281a();
        C5237n.m25315a();
        this.f12986a = m25281a;
    }

    /* renamed from: a */
    public static C5212a0 m25347a() {
        return f12985b;
    }

    /* renamed from: b */
    public final void m25346b(Context context) {
        this.f12986a.m25280b(context);
    }

    /* renamed from: c */
    public final void m25345c(FirebaseAuth firebaseAuth) {
        this.f12986a.m25279c(firebaseAuth);
    }

    /* renamed from: d */
    public final void m25344d(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.m32097h());
        edit.putString("statusMessage", status.m32096k());
        edit.putLong("timestamp", C2970h.m31533c().currentTimeMillis());
        edit.commit();
    }
}
