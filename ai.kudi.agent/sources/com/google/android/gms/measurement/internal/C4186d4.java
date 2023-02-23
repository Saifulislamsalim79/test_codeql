package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* loaded from: classes2.dex */
public final class C4186d4 {

    /* renamed from: a */
    final String f10206a;

    /* renamed from: b */
    private final String f10207b;

    /* renamed from: c */
    private final String f10208c;

    /* renamed from: d */
    private final long f10209d;

    /* renamed from: e */
    final /* synthetic */ g4 f10210e;

    /* synthetic */ C4186d4(g4 g4Var, String str, long j, C4174c4 c4174c4) {
        this.f10210e = g4Var;
        com.google.android.gms.common.internal.s.f("health_monitor");
        com.google.android.gms.common.internal.s.a(j > 0);
        this.f10206a = "health_monitor:start";
        this.f10207b = "health_monitor:count";
        this.f10208c = "health_monitor:value";
        this.f10209d = j;
    }

    /* renamed from: c */
    private final long m28305c() {
        return this.f10210e.o().getLong(this.f10206a, 0L);
    }

    /* renamed from: d */
    private final void m28304d() {
        this.f10210e.h();
        long currentTimeMillis = ((v5) this.f10210e).a.c().currentTimeMillis();
        SharedPreferences.Editor edit = this.f10210e.o().edit();
        edit.remove(this.f10207b);
        edit.remove(this.f10208c);
        edit.putLong(this.f10206a, currentTimeMillis);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> m28307a() {
        long abs;
        this.f10210e.h();
        this.f10210e.h();
        long m28305c = m28305c();
        if (m28305c == 0) {
            m28304d();
            abs = 0;
        } else {
            abs = Math.abs(m28305c - ((v5) this.f10210e).a.c().currentTimeMillis());
        }
        long j = this.f10209d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            m28304d();
            return null;
        }
        String string = this.f10210e.o().getString(this.f10208c, null);
        long j2 = this.f10210e.o().getLong(this.f10207b, 0L);
        m28304d();
        if (string != null && j2 > 0) {
            return new Pair<>(string, Long.valueOf(j2));
        }
        return g4.x;
    }

    /* renamed from: b */
    public final void m28306b(String str, long j) {
        this.f10210e.h();
        if (m28305c() == 0) {
            m28304d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f10210e.o().getLong(this.f10207b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f10210e.o().edit();
            edit.putString(this.f10208c, str);
            edit.putLong(this.f10207b, 1L);
            edit.apply();
            return;
        }
        long nextLong = ((v5) this.f10210e).a.N().t().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f10210e.o().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f10208c, str);
        }
        edit2.putLong(this.f10207b, j3);
        edit2.apply();
    }
}
