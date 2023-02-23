package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* loaded from: classes2.dex */
public final class C4197e4 {

    /* renamed from: a */
    private final String f10227a;

    /* renamed from: b */
    private boolean f10228b;

    /* renamed from: c */
    private String f10229c;

    /* renamed from: d */
    final /* synthetic */ g4 f10230d;

    public C4197e4(g4 g4Var, String str, String str2) {
        this.f10230d = g4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f10227a = str;
    }

    /* renamed from: a */
    public final String m28272a() {
        if (!this.f10228b) {
            this.f10228b = true;
            this.f10229c = this.f10230d.o().getString(this.f10227a, null);
        }
        return this.f10229c;
    }

    /* renamed from: b */
    public final void m28271b(String str) {
        SharedPreferences.Editor edit = this.f10230d.o().edit();
        edit.putString(this.f10227a, str);
        edit.apply();
        this.f10229c = str;
    }
}
