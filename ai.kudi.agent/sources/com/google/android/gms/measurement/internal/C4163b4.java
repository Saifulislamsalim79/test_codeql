package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* loaded from: classes2.dex */
public final class C4163b4 {

    /* renamed from: a */
    private final String f10029a;

    /* renamed from: b */
    private final long f10030b;

    /* renamed from: c */
    private boolean f10031c;

    /* renamed from: d */
    private long f10032d;

    /* renamed from: e */
    final /* synthetic */ g4 f10033e;

    public C4163b4(g4 g4Var, String str, long j) {
        this.f10033e = g4Var;
        com.google.android.gms.common.internal.s.f(str);
        this.f10029a = str;
        this.f10030b = j;
    }

    /* renamed from: a */
    public final long m28404a() {
        if (!this.f10031c) {
            this.f10031c = true;
            this.f10032d = this.f10033e.o().getLong(this.f10029a, this.f10030b);
        }
        return this.f10032d;
    }

    /* renamed from: b */
    public final void m28403b(long j) {
        SharedPreferences.Editor edit = this.f10033e.o().edit();
        edit.putLong(this.f10029a, j);
        edit.apply();
        this.f10032d = j;
    }
}
