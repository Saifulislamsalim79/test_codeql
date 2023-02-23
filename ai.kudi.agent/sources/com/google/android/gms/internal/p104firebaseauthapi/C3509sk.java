package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2963a;
import com.google.android.gms.common.util.C2972j;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sk */
/* loaded from: classes2.dex */
public final class C3509sk {

    /* renamed from: a */
    private final String f8949a;

    /* renamed from: b */
    private final String f8950b;

    public C3509sk(Context context, String str) {
        s.j(context);
        s.f(str);
        this.f8949a = str;
        try {
            byte[] m31546a = C2963a.m31546a(context, str);
            if (m31546a == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() != 0 ? "single cert required: ".concat(valueOf) : new String("single cert required: "));
                this.f8950b = null;
                return;
            }
            this.f8950b = C2972j.m31524c(m31546a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() != 0 ? "no pkg: ".concat(valueOf2) : new String("no pkg: "));
            this.f8950b = null;
        }
    }

    /* renamed from: a */
    public final String m30273a() {
        return this.f8950b;
    }

    /* renamed from: b */
    public final String m30272b() {
        return this.f8949a;
    }
}
