package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.common.util.InterfaceC2967e;
import p272h.p286c.p287a.p300b.p301a.p302a.C8383a;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes.dex */
public final class C4181d extends Label {

    /* renamed from: c */
    static final Pair<String, Long> f10179c;

    /* renamed from: A */
    public final C4439z3 f10180A;

    /* renamed from: B */
    public final C4439z3 f10181B;

    /* renamed from: J */
    public final C4151a4 f10182J;

    /* renamed from: K */
    public final C4163b4 f10183K;

    /* renamed from: a */
    private String f10184a;

    /* renamed from: b */
    public final C4163b4 f10185b;

    /* renamed from: d */
    public final C4197e4 f10186d;

    /* renamed from: e */
    public final C4163b4 f10187e;

    /* renamed from: g */
    public final C4439z3 f10188g;

    /* renamed from: h */
    public boolean f10189h;

    /* renamed from: i */
    public final C4163b4 f10190i;

    /* renamed from: l */
    private long f10191l;

    /* renamed from: m */
    public final C4163b4 f10192m;

    /* renamed from: n */
    public final C4163b4 f10193n;

    /* renamed from: o */
    public final C4197e4 f10194o;

    /* renamed from: p */
    private SharedPreferences f10195p;

    /* renamed from: q */
    public final C4197e4 f10196q;

    /* renamed from: r */
    public final C4197e4 f10197r;

    /* renamed from: s */
    public final C4439z3 f10198s;

    /* renamed from: x */
    private boolean f10199x;

    /* renamed from: z */
    public C4186d4 f10200z;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Pair $r0 = new Pair("", 0L);
        f10179c = $r0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C4181d(ClassWriter classWriter) {
        super(classWriter);
        C4163b4 $r2 = new C4163b4(this, "session_timeout", 1800000L);
        this.f10192m = $r2;
        C4439z3 $r3 = new C4439z3(this, "start_new_session", true);
        this.f10198s = $r3;
        C4163b4 $r22 = new C4163b4(this, "last_pause_time", 0L);
        this.f10193n = $r22;
        C4197e4 $r4 = new C4197e4(this, "non_personalized_ads", (String) null);
        this.f10194o = $r4;
        C4439z3 $r32 = new C4439z3(this, "allow_remote_dynamite", false);
        this.f10188g = $r32;
        C4163b4 $r23 = new C4163b4(this, "first_open_time", 0L);
        this.f10185b = $r23;
        C4163b4 $r24 = new C4163b4(this, "app_install_time", 0L);
        this.f10187e = $r24;
        C4197e4 $r42 = new C4197e4(this, "app_instance_id", (String) null);
        this.f10186d = $r42;
        C4439z3 $r33 = new C4439z3(this, "app_backgrounded", false);
        this.f10181B = $r33;
        C4439z3 $r34 = new C4439z3(this, "deep_link_retrieval_complete", false);
        this.f10180A = $r34;
        C4163b4 $r25 = new C4163b4(this, "deep_link_retrieval_attempts", 0L);
        this.f10190i = $r25;
        C4197e4 $r43 = new C4197e4(this, "firebase_feature_rollouts", (String) null);
        this.f10197r = $r43;
        C4197e4 $r44 = new C4197e4(this, "deferred_attribution_cache", (String) null);
        this.f10196q = $r44;
        C4163b4 $r26 = new C4163b4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f10183K = $r26;
        C4151a4 $r5 = new C4151a4(this, "default_event_parameters", (Bundle) null);
        this.f10182J = $r5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Pair m28321a(String str) {
        putShort();
        ClassWriter $r2 = ((MethodWriter) this).f9987b;
        InterfaceC2967e $r3 = $r2.mo28412c();
        long $l1 = $r3.mo31535a();
        String $r4 = this.f10184a;
        if ($r4 != null) {
            long $l2 = this.f10191l;
            if ($l1 < $l2) {
                boolean $z0 = this.f10199x;
                Boolean $r6 = Boolean.valueOf($z0);
                Pair $r5 = new Pair($r4, $r6);
                return $r5;
            }
        }
        ClassWriter $r22 = ((MethodWriter) this).f9987b;
        C4215g $r7 = $r22.getValue();
        C4162b3 $r8 = C4173c3.f10117b;
        long $l22 = $r7.write(str, $r8);
        this.f10191l = $l1 + $l22;
        C8383a.m16155d(true);
        ClassWriter $r23 = ((MethodWriter) this).f9987b;
        try {
            Context $r9 = $r23.getContext();
            C8383a.C8384a $r10 = C8383a.m16157b($r9);
            this.f10184a = "";
            String $r1 = $r10.m16149a();
            if ($r1 != null) {
                this.f10184a = $r1;
            }
            boolean $z02 = $r10.m16148b();
            this.f10199x = $z02;
        } catch (Exception $r11) {
            ClassWriter $r24 = ((MethodWriter) this).f9987b;
            Item $r12 = $r24.get();
            C4312o3 $r13 = $r12.save();
            $r13.m28013b("Unable to get advertising id", $r11);
            this.f10184a = "";
        }
        C8383a.m16155d(false);
        String $r14 = this.f10184a;
        boolean $z03 = this.f10199x;
        Boolean $r62 = Boolean.valueOf($z03);
        Pair $r52 = new Pair($r14, $r62);
        return $r52;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.Label
    /* renamed from: a */
    protected final void mo28323a() {
        ClassWriter $r1 = ((MethodWriter) this).f9987b;
        Context $r2 = $r1.getContext();
        SharedPreferences $r3 = $r2.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10195p = $r3;
        boolean $z0 = $r3.getBoolean("has_been_opened", false);
        this.f10189h = $z0;
        if (!$z0) {
            SharedPreferences.Editor $r4 = this.f10195p.edit();
            $r4.putBoolean("has_been_opened", true);
            $r4.apply();
        }
        ClassWriter $r12 = ((MethodWriter) this).f9987b;
        $r12.getValue();
        C4162b3 $r6 = C4173c3.f10119c;
        Object $r7 = $r6.m28406a(null);
        long $l0 = ((Long) $r7).longValue();
        C4186d4 $r5 = new C4186d4(this, "health_monitor", Math.max(0L, $l0), (C4174c4) null);
        this.f10200z = $r5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m28320a(boolean z) {
        putShort();
        ClassWriter $r1 = ((MethodWriter) this).f9987b;
        Item $r2 = $r1.get();
        C4312o3 $r3 = $r2.getTitle();
        Boolean $r4 = Boolean.valueOf(z);
        $r3.m28013b("App measurement setting deferred collection", $r4);
        SharedPreferences $r5 = m28317d();
        SharedPreferences.Editor $r6 = $r5.edit();
        $r6.putBoolean("deferred_analytics_collection", z);
        $r6.apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final boolean m28322a(long j) {
        C4163b4 $r1 = this.f10192m;
        long $l2 = $r1.m28404a();
        long $l1 = j - $l2;
        C4163b4 $r12 = this.f10193n;
        long $l22 = $r12.m28404a();
        return $l1 > $l22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final C4226h m28319b() {
        putShort();
        SharedPreferences $r1 = m28317d();
        String $r2 = $r1.getString("consent_settings", "G1");
        C4226h $r3 = C4226h.m28191b($r2);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final boolean m28318b(int i) {
        SharedPreferences $r1 = m28317d();
        int $i1 = $r1.getInt("consent_source", 100);
        boolean $z0 = C4226h.m28181l(i, $i1);
        return $z0;
    }

    @Override // com.google.android.gms.measurement.internal.Label
    protected final boolean copy() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final SharedPreferences m28317d() {
        putShort();
        copyTo();
        SharedPreferences $r1 = this.f10195p;
        List.m31820a($r1);
        SharedPreferences $r12 = this.f10195p;
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getBoolean() {
        putShort();
        SharedPreferences $r1 = m28317d();
        boolean $z0 = $r1.contains("measurement_enabled");
        if ($z0) {
            SharedPreferences $r12 = m28317d();
            boolean $z02 = $r12.getBoolean("measurement_enabled", true);
            Boolean $r2 = Boolean.valueOf($z02);
            return $r2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isEnabled() {
        SharedPreferences $r1 = this.f10195p;
        if ($r1 == null) {
            return false;
        }
        boolean $z0 = $r1.contains("deferred_analytics_collection");
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void send(Boolean bool) {
        putShort();
        SharedPreferences $r2 = m28317d();
        SharedPreferences.Editor $r3 = $r2.edit();
        if (bool != null) {
            boolean $z0 = bool.booleanValue();
            $r3.putBoolean("measurement_enabled", $z0);
        } else {
            $r3.remove("measurement_enabled");
        }
        $r3.apply();
    }
}
