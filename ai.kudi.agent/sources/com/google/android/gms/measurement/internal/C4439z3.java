package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes2.dex */
public final class C4439z3 {

    /* renamed from: a */
    private final String f10848a;

    /* renamed from: b */
    private final boolean f10849b;

    /* renamed from: c */
    private boolean f10850c;

    /* renamed from: d */
    private boolean f10851d;

    /* renamed from: e */
    final /* synthetic */ g4 f10852e;

    public C4439z3(g4 g4Var, String str, boolean z) {
        this.f10852e = g4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f10848a = str;
        this.f10849b = z;
    }

    /* renamed from: a */
    public final void m27806a(boolean z) {
        SharedPreferences.Editor edit = this.f10852e.o().edit();
        edit.putBoolean(this.f10848a, z);
        edit.apply();
        this.f10851d = z;
    }

    /* renamed from: b */
    public final boolean m27805b() {
        if (!this.f10850c) {
            this.f10850c = true;
            this.f10851d = this.f10852e.o().getBoolean(this.f10848a, this.f10849b);
        }
        return this.f10851d;
    }
}
