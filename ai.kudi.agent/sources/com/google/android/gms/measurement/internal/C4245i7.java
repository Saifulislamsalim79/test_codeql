package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.util.C2968f;
import com.google.android.gms.internal.measurement.C3744ce;
import com.google.android.gms.internal.measurement.C3819hc;
import com.google.android.gms.internal.measurement.C3867kc;
import com.google.android.gms.internal.measurement.C3976rc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes2.dex */
public final class C4245i7 extends f4 {

    /* renamed from: c */
    protected C4222g7 f10371c;

    /* renamed from: d */
    private InterfaceC4176c6 f10372d;

    /* renamed from: e */
    private final Set<InterfaceC4188d6> f10373e;

    /* renamed from: f */
    private boolean f10374f;

    /* renamed from: g */
    private final AtomicReference<String> f10375g;

    /* renamed from: h */
    private final Object f10376h;

    /* renamed from: i */
    private C4226h f10377i;

    /* renamed from: j */
    private int f10378j;

    /* renamed from: k */
    private final AtomicLong f10379k;

    /* renamed from: l */
    private long f10380l;

    /* renamed from: m */
    private int f10381m;

    /* renamed from: n */
    final C4331pa f10382n;

    /* renamed from: o */
    protected boolean f10383o;

    /* renamed from: p */
    private final InterfaceC4236ha f10384p;

    protected C4245i7(b5 b5Var) {
        super(b5Var);
        this.f10373e = new CopyOnWriteArraySet();
        this.f10376h = new Object();
        this.f10383o = true;
        this.f10384p = new C4397v6(this);
        this.f10375g = new AtomicReference<>();
        this.f10377i = new C4226h(null, null);
        this.f10378j = 100;
        this.f10380l = -1L;
        this.f10381m = 100;
        this.f10379k = new AtomicLong(0L);
        this.f10382n = new C4331pa(b5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m28129p(Bundle bundle, long j) {
        C3867kc.m29418b();
        if (((v5) this).a.z().B(null, C4173c3.f10146p0) && !TextUtils.isEmpty(((v5) this).a.B().u())) {
            ((v5) this).a.b().x().m28014a("Using developer consent only; google app id found");
        } else {
            m28160F(bundle, 0, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final void m28149Q(Boolean bool, boolean z) {
        h();
        i();
        ((v5) this).a.b().q().m28013b("Setting app measurement enabled (FE)", bool);
        ((v5) this).a.F().s(bool);
        if (z) {
            g4 F = ((v5) this).a.F();
            b5 b5Var = ((v5) F).a;
            F.h();
            SharedPreferences.Editor edit = F.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (((v5) this).a.p() || !(bool == null || bool.booleanValue())) {
            m28148R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m28148R() {
        h();
        String m28272a = ((v5) this).a.F().m.m28272a();
        if (m28272a != null) {
            if ("unset".equals(m28272a)) {
                m28152N("app", "_npa", null, ((v5) this).a.c().currentTimeMillis());
            } else {
                m28152N("app", "_npa", Long.valueOf(true != "true".equals(m28272a) ? 0L : 1L), ((v5) this).a.c().currentTimeMillis());
            }
        }
        if (((v5) this).a.o() && this.f10383o) {
            ((v5) this).a.b().q().m28014a("Recording app launch after enabling measurement for the first time (FE)");
            m28133g0();
            C3976rc.m28988b();
            if (((v5) this).a.z().B(null, C4173c3.f10134j0)) {
                ((v5) this).a.M().f10476d.m28039a();
            }
            ((v5) this).a.a().m27810z(new RunnableC4279l6(this));
            return;
        }
        ((v5) this).a.b().q().m28014a("Updating Scion state (FE)");
        ((v5) this).a.L().m27851w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* synthetic */ void m28136d0(C4245i7 c4245i7, C4226h c4226h, int i, long j, boolean z, boolean z2) {
        c4245i7.h();
        c4245i7.i();
        if (j <= c4245i7.f10380l && C4226h.m28181l(c4245i7.f10381m, i)) {
            ((v5) c4245i7).a.b().u().m28013b("Dropped out-of-date consent setting, proposed settings", c4226h);
            return;
        }
        g4 F = ((v5) c4245i7).a.F();
        b5 b5Var = ((v5) F).a;
        F.h();
        if (F.w(i)) {
            SharedPreferences.Editor edit = F.o().edit();
            edit.putString("consent_settings", c4226h.m28184i());
            edit.putInt("consent_source", i);
            edit.apply();
            c4245i7.f10380l = j;
            c4245i7.f10381m = i;
            ((v5) c4245i7).a.L().m27854t(z);
            if (z2) {
                ((v5) c4245i7).a.L().m27865S(new AtomicReference<>());
                return;
            }
            return;
        }
        ((v5) c4245i7).a.b().u().m28013b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
    }

    /* renamed from: A */
    protected final void m28165A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        ((v5) this).a.a().m27810z(new RunnableC4303n6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    final void m28164B(String str, String str2, long j, Object obj) {
        ((v5) this).a.a().m27810z(new RunnableC4315o6(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final void m28163C(String str) {
        this.f10375g.set(str);
    }

    /* renamed from: D */
    public final void m28162D(Bundle bundle) {
        m28161E(bundle, ((v5) this).a.c().currentTimeMillis());
    }

    /* renamed from: E */
    public final void m28161E(Bundle bundle, long j) {
        com.google.android.gms.common.internal.s.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ((v5) this).a.b().w().m28014a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.s.j(bundle2);
        C4430y5.m27809a(bundle2, "app_id", String.class, null);
        C4430y5.m27809a(bundle2, "origin", String.class, null);
        C4430y5.m27809a(bundle2, "name", String.class, null);
        C4430y5.m27809a(bundle2, "value", Object.class, null);
        C4430y5.m27809a(bundle2, "trigger_event_name", String.class, null);
        C4430y5.m27809a(bundle2, "trigger_timeout", Long.class, 0L);
        C4430y5.m27809a(bundle2, "timed_out_event_name", String.class, null);
        C4430y5.m27809a(bundle2, "timed_out_event_params", Bundle.class, null);
        C4430y5.m27809a(bundle2, "triggered_event_name", String.class, null);
        C4430y5.m27809a(bundle2, "triggered_event_params", Bundle.class, null);
        C4430y5.m27809a(bundle2, "time_to_live", Long.class, 0L);
        C4430y5.m27809a(bundle2, "expired_event_name", String.class, null);
        C4430y5.m27809a(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.s.f(bundle2.getString("name"));
        com.google.android.gms.common.internal.s.f(bundle2.getString("origin"));
        com.google.android.gms.common.internal.s.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (((v5) this).a.N().n0(string) == 0) {
            if (((v5) this).a.N().j0(string, obj) == 0) {
                Object p = ((v5) this).a.N().p(string, obj);
                if (p == null) {
                    ((v5) this).a.b().r().m28012c("Unable to normalize conditional user property value", ((v5) this).a.D().m28044f(string), obj);
                    return;
                }
                C4430y5.m27808b(bundle2, p);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    ((v5) this).a.z();
                    if (j2 > 15552000000L || j2 < 1) {
                        ((v5) this).a.b().r().m28012c("Invalid conditional user property timeout", ((v5) this).a.D().m28044f(string), Long.valueOf(j2));
                        return;
                    }
                }
                long j3 = bundle2.getLong("time_to_live");
                ((v5) this).a.z();
                if (j3 <= 15552000000L && j3 >= 1) {
                    ((v5) this).a.a().m27810z(new RunnableC4338q6(this, bundle2));
                    return;
                } else {
                    ((v5) this).a.b().r().m28012c("Invalid conditional user property time to live", ((v5) this).a.D().m28044f(string), Long.valueOf(j3));
                    return;
                }
            }
            ((v5) this).a.b().r().m28012c("Invalid conditional user property value", ((v5) this).a.D().m28044f(string), obj);
            return;
        }
        ((v5) this).a.b().r().m28013b("Invalid conditional user property name", ((v5) this).a.D().m28044f(string));
    }

    /* renamed from: F */
    public final void m28160F(Bundle bundle, int i, long j) {
        i();
        String m28185h = C4226h.m28185h(bundle);
        if (m28185h != null) {
            ((v5) this).a.b().x().m28013b("Ignoring invalid consent setting", m28185h);
            ((v5) this).a.b().x().m28014a("Valid consent values are 'granted', 'denied'");
        }
        m28159G(C4226h.m28192a(bundle), i, j);
    }

    /* renamed from: G */
    public final void m28159G(C4226h c4226h, int i, long j) {
        boolean z;
        boolean z2;
        C4226h c4226h2;
        boolean z3;
        i();
        if (i != -10 && c4226h.m28188e() == null && c4226h.m28187f() == null) {
            ((v5) this).a.b().x().m28014a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f10376h) {
            z = true;
            z2 = false;
            if (C4226h.m28181l(i, this.f10378j)) {
                boolean m28180m = c4226h.m28180m(this.f10377i);
                if (c4226h.m28182k() && !this.f10377i.m28182k()) {
                    z2 = true;
                }
                C4226h m28189d = c4226h.m28189d(this.f10377i);
                this.f10377i = m28189d;
                this.f10378j = i;
                c4226h2 = m28189d;
                z3 = z2;
                z2 = m28180m;
            } else {
                c4226h2 = c4226h;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            ((v5) this).a.b().u().m28013b("Ignoring lower-priority consent settings, proposed settings", c4226h2);
            return;
        }
        long andIncrement = this.f10379k.getAndIncrement();
        if (z2) {
            this.f10375g.set(null);
            ((v5) this).a.a().m27828A(new RunnableC4165b7(this, c4226h2, j, i, andIncrement, z3));
        } else if (i != 30 && i != -10) {
            ((v5) this).a.a().m27810z(new RunnableC4189d7(this, c4226h2, i, andIncrement, z3));
        } else {
            ((v5) this).a.a().m27828A(new RunnableC4177c7(this, c4226h2, i, andIncrement, z3));
        }
    }

    /* renamed from: H */
    public final void m28158H(final Bundle bundle, final long j) {
        C3867kc.m29418b();
        if (((v5) this).a.z().B(null, C4173c3.f10148q0)) {
            ((v5) this).a.a().m27828A(new Runnable() { // from class: com.google.android.gms.measurement.internal.j6
                @Override // java.lang.Runnable
                public final void run() {
                    C4245i7.this.m28129p(bundle, j);
                }
            });
        } else {
            m28129p(bundle, j);
        }
    }

    /* renamed from: I */
    public final void m28157I(InterfaceC4176c6 interfaceC4176c6) {
        InterfaceC4176c6 interfaceC4176c62;
        h();
        i();
        if (interfaceC4176c6 != null && interfaceC4176c6 != (interfaceC4176c62 = this.f10372d)) {
            com.google.android.gms.common.internal.s.n(interfaceC4176c62 == null, "EventInterceptor already set.");
        }
        this.f10372d = interfaceC4176c6;
    }

    /* renamed from: J */
    public final void m28156J(Boolean bool) {
        i();
        ((v5) this).a.a().m27810z(new RunnableC4154a7(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m28155K(C4226h c4226h) {
        h();
        boolean z = (c4226h.m28182k() && c4226h.m28183j()) || ((v5) this).a.L().m27883A();
        if (z != ((v5) this).a.p()) {
            ((v5) this).a.l(z);
            g4 F = ((v5) this).a.F();
            b5 b5Var = ((v5) F).a;
            F.h();
            Boolean valueOf = F.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m28149Q(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: L */
    public final void m28154L(String str, String str2, Object obj, boolean z) {
        m28153M("auto", "_ldl", obj, true, ((v5) this).a.c().currentTimeMillis());
    }

    /* renamed from: M */
    public final void m28153M(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str == null ? "app" : str;
        if (z) {
            i = ((v5) this).a.N().n0(str2);
        } else {
            ia N = ((v5) this).a.N();
            if (N.Q("user property", str2)) {
                if (N.M("user property", C4164b6.f10034a, (String[]) null, str2)) {
                    ((v5) N).a.z();
                    if (N.L("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            ia N2 = ((v5) this).a.N();
            ((v5) this).a.z();
            ((v5) this).a.N().A(this.f10384p, (String) null, i, "_ev", N2.q(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj != null) {
            int j0 = ((v5) this).a.N().j0(str2, obj);
            if (j0 != 0) {
                ia N3 = ((v5) this).a.N();
                ((v5) this).a.z();
                ((v5) this).a.N().A(this.f10384p, (String) null, j0, "_ev", N3.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object p = ((v5) this).a.N().p(str2, obj);
            if (p != null) {
                m28164B(str3, str2, j, p);
            }
        } else {
            m28164B(str3, str2, j, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28152N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.s.f(r9)
            com.google.android.gms.common.internal.s.f(r10)
            r8.h()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.b5 r10 = r8.a
            com.google.android.gms.measurement.internal.g4 r10 = r10.F()
            com.google.android.gms.measurement.internal.e4 r10 = r10.m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.m28271b(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.b5 r10 = r8.a
            com.google.android.gms.measurement.internal.g4 r10 = r10.F()
            com.google.android.gms.measurement.internal.e4 r10 = r10.m
            java.lang.String r0 = "unset"
            r10.m28271b(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.b5 r10 = r8.a
            boolean r10 = r10.o()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.b5 r9 = r8.a
            com.google.android.gms.measurement.internal.q3 r9 = r9.b()
            com.google.android.gms.measurement.internal.o3 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m28014a(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.b5 r10 = r8.a
            boolean r10 = r10.r()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.ea r10 = new com.google.android.gms.measurement.internal.ea
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.b5 r9 = r8.a
            com.google.android.gms.measurement.internal.w8 r9 = r9.L()
            r9.m27849y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4245i7.m28152N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: O */
    public final void m28151O(InterfaceC4188d6 interfaceC4188d6) {
        i();
        com.google.android.gms.common.internal.s.j(interfaceC4188d6);
        if (this.f10373e.remove(interfaceC4188d6)) {
            return;
        }
        ((v5) this).a.b().w().m28014a("OnEventListener had not been registered");
    }

    /* renamed from: S */
    public final int m28147S(String str) {
        com.google.android.gms.common.internal.s.f(str);
        ((v5) this).a.z();
        return 25;
    }

    /* renamed from: T */
    public final Boolean m28146T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) ((v5) this).a.a().m27818r(atomicReference, 15000L, "boolean test flag value", new RunnableC4362s6(this, atomicReference));
    }

    /* renamed from: U */
    public final Double m28145U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) ((v5) this).a.a().m27818r(atomicReference, 15000L, "double test flag value", new RunnableC4442z6(this, atomicReference));
    }

    /* renamed from: V */
    public final Integer m28144V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) ((v5) this).a.a().m27818r(atomicReference, 15000L, "int test flag value", new RunnableC4431y6(this, atomicReference));
    }

    /* renamed from: W */
    public final Long m28143W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) ((v5) this).a.a().m27818r(atomicReference, 15000L, "long test flag value", new RunnableC4419x6(this, atomicReference));
    }

    /* renamed from: X */
    public final String m28142X() {
        return this.f10375g.get();
    }

    /* renamed from: Y */
    public final String m28141Y() {
        C4328p7 m27891s = ((v5) this).a.K().m27891s();
        if (m27891s != null) {
            return m27891s.f10583b;
        }
        return null;
    }

    /* renamed from: Z */
    public final String m28140Z() {
        C4328p7 m27891s = ((v5) this).a.K().m27891s();
        if (m27891s != null) {
            return m27891s.f10582a;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String m28139a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) ((v5) this).a.a().m27818r(atomicReference, 15000L, "String test flag value", new RunnableC4408w6(this, atomicReference));
    }

    /* renamed from: b0 */
    public final ArrayList<Bundle> m28138b0(String str, String str2) {
        if (((v5) this).a.a().m27826C()) {
            ((v5) this).a.b().r().m28014a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        ((v5) this).a.d();
        if (C4158b.m28407a()) {
            ((v5) this).a.b().r().m28014a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ((v5) this).a.a().m27818r(atomicReference, 5000L, "get conditional user properties", new RunnableC4374t6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            ((v5) this).a.b().r().m28013b("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return ia.u(list);
    }

    /* renamed from: c0 */
    public final Map<String, Object> m28137c0(String str, String str2, boolean z) {
        if (((v5) this).a.a().m27826C()) {
            ((v5) this).a.b().r().m28014a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        ((v5) this).a.d();
        if (C4158b.m28407a()) {
            ((v5) this).a.b().r().m28014a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        ((v5) this).a.a().m27818r(atomicReference, 5000L, "get user properties", new RunnableC4386u6(this, atomicReference, null, str, str2, z));
        List<C4203ea> list = (List) atomicReference.get();
        if (list == null) {
            ((v5) this).a.b().r().m28013b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C7521a c7521a = new C7521a(list.size());
        for (C4203ea c4203ea : list) {
            Object m28270f = c4203ea.m28270f();
            if (m28270f != null) {
                c7521a.put(c4203ea.f10245d, m28270f);
            }
        }
        return c7521a;
    }

    /* renamed from: g0 */
    public final void m28133g0() {
        h();
        i();
        if (((v5) this).a.r()) {
            if (((v5) this).a.z().B(null, C4173c3.f10116a0)) {
                C4215g z = ((v5) this).a.z();
                ((v5) z).a.d();
                Boolean t = z.t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    ((v5) this).a.b().q().m28014a("Deferred Deep Link feature enabled.");
                    ((v5) this).a.a().m27810z(new Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4245i7 c4245i7 = C4245i7.this;
                            c4245i7.h();
                            if (!((v5) c4245i7).a.F().r.m27805b()) {
                                long m28404a = ((v5) c4245i7).a.F().s.m28404a();
                                ((v5) c4245i7).a.F().s.m28403b(1 + m28404a);
                                ((v5) c4245i7).a.z();
                                if (m28404a >= 5) {
                                    ((v5) c4245i7).a.b().w().m28014a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    ((v5) c4245i7).a.F().r.m27806a(true);
                                    return;
                                }
                                ((v5) c4245i7).a.j();
                                return;
                            }
                            ((v5) c4245i7).a.b().q().m28014a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            ((v5) this).a.L().m27869O();
            this.f10383o = false;
            g4 F = ((v5) this).a.F();
            F.h();
            String string = F.o().getString("previous_os_version", null);
            ((v5) F).a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((v5) this).a.A().k();
            if (string.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m28124u("auto", "_ou", bundle);
        }
    }

    /* renamed from: h0 */
    public final void m28132h0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = ((v5) this).a.c().currentTimeMillis();
        com.google.android.gms.common.internal.s.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ((v5) this).a.a().m27810z(new RunnableC4350r6(this, bundle2));
    }

    /* renamed from: n */
    protected final boolean m28131n() {
        return false;
    }

    /* renamed from: o */
    public final void m28130o() {
        if (!(((v5) this).a.f().getApplicationContext() instanceof Application) || this.f10371c == null) {
            return;
        }
        ((Application) ((v5) this).a.f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10371c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m28128q(Bundle bundle) {
        if (bundle == null) {
            ((v5) this).a.F().w.m28410b(new Bundle());
            return;
        }
        Bundle m28411a = ((v5) this).a.F().w.m28411a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (((v5) this).a.N().T(obj)) {
                    ((v5) this).a.N().A(this.f10384p, (String) null, 27, (String) null, (String) null, 0);
                }
                ((v5) this).a.b().x().m28012c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ia.V(str)) {
                ((v5) this).a.b().x().m28013b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m28411a.remove(str);
            } else {
                ia N = ((v5) this).a.N();
                ((v5) this).a.z();
                if (N.N("param", str, 100, obj)) {
                    ((v5) this).a.N().B(m28411a, str, obj);
                }
            }
        }
        ((v5) this).a.N();
        int m = ((v5) this).a.z().m();
        if (m28411a.size() > m) {
            int i = 0;
            for (String str2 : new TreeSet(m28411a.keySet())) {
                i++;
                if (i > m) {
                    m28411a.remove(str2);
                }
            }
            ((v5) this).a.N().A(this.f10384p, (String) null, 26, (String) null, (String) null, 0);
            ((v5) this).a.b().x().m28014a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        ((v5) this).a.F().w.m28410b(m28411a);
        ((v5) this).a.L().m27852v(m28411a);
    }

    /* renamed from: r */
    public final void m28127r(String str, String str2, Bundle bundle) {
        m28126s(str, str2, bundle, true, true, ((v5) this).a.c().currentTimeMillis());
    }

    /* renamed from: s */
    public final void m28126s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (ia.Z(str2, "screen_view")) {
            ((v5) this).a.K().m27899F(bundle2, j);
        } else {
            m28165A(str3, str2, j, bundle2, z2, !z2 || this.f10372d == null || ia.V(str2), z, null);
        }
    }

    /* renamed from: t */
    public final void m28125t(String str, String str2, Bundle bundle, String str3) {
        b5.t();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m28124u(String str, String str2, Bundle bundle) {
        h();
        m28123v(str, str2, ((v5) this).a.c().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m28123v(String str, String str2, long j, Bundle bundle) {
        h();
        m28122w(str, str2, j, bundle, true, this.f10372d == null || ia.V(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m28122w(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        long j2;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(bundle);
        h();
        i();
        if (((v5) this).a.o()) {
            List v = ((v5) this).a.B().v();
            if (v != null && !v.contains(str2)) {
                ((v5) this).a.b().q().m28012c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f10374f) {
                this.f10374f = true;
                try {
                    if (!((v5) this).a.s()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, ((v5) this).a.f().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, ((v5) this).a.f());
                    } catch (Exception e) {
                        ((v5) this).a.b().w().m28013b("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    ((v5) this).a.b().u().m28014a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                ((v5) this).a.d();
                m28152N("auto", "_lgclid", bundle.getString("gclid"), ((v5) this).a.c().currentTimeMillis());
            }
            ((v5) this).a.d();
            if (z && ia.a0(str2)) {
                ((v5) this).a.N().y(bundle, ((v5) this).a.F().w.m28411a());
            }
            if (!z3) {
                ((v5) this).a.d();
                if (!"_iap".equals(str2)) {
                    ia N = ((v5) this).a.N();
                    int i = 2;
                    if (N.Q("event", str2)) {
                        if (N.M("event", C4441z5.f10854a, C4441z5.f10855b, str2)) {
                            ((v5) N).a.z();
                            if (N.L("event", 40, str2)) {
                                i = 0;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    if (i != 0) {
                        ((v5) this).a.b().s().m28013b("Invalid public event name. Event will not be logged (FE)", ((v5) this).a.D().m28046d(str2));
                        ia N2 = ((v5) this).a.N();
                        ((v5) this).a.z();
                        ((v5) this).a.N().A(this.f10384p, (String) null, i, "_ev", N2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            C3744ce.m29701b();
            if (((v5) this).a.z().B(null, C4173c3.f10162x0)) {
                ((v5) this).a.d();
                C4328p7 m27890t = ((v5) this).a.K().m27890t(false);
                if (m27890t != null && !bundle.containsKey("_sc")) {
                    m27890t.f10585d = true;
                }
                ia.x(m27890t, bundle, z && !z3);
            } else {
                ((v5) this).a.d();
                C4328p7 m27890t2 = ((v5) this).a.K().m27890t(false);
                if (m27890t2 != null && !bundle.containsKey("_sc")) {
                    m27890t2.f10585d = true;
                }
                ia.x(m27890t2, bundle, z && !z3);
            }
            boolean equals = "am".equals(str);
            boolean V = ia.V(str2);
            if (!z || this.f10372d == null || V) {
                z4 = equals;
            } else if (!equals) {
                ((v5) this).a.b().q().m28012c("Passing event to registered event handler (FE)", ((v5) this).a.D().m28046d(str2), ((v5) this).a.D().m28048b(bundle));
                com.google.android.gms.common.internal.s.j(this.f10372d);
                this.f10372d.mo28036a(str, str2, bundle, j);
                return;
            } else {
                z4 = true;
            }
            if (((v5) this).a.r()) {
                int k0 = ((v5) this).a.N().k0(str2);
                if (k0 != 0) {
                    ((v5) this).a.b().s().m28013b("Invalid event name. Event will not be logged (FE)", ((v5) this).a.D().m28046d(str2));
                    ia N3 = ((v5) this).a.N();
                    ((v5) this).a.z();
                    ((v5) this).a.N().A(this.f10384p, str3, k0, "_ev", N3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle v0 = ((v5) this).a.N().v0(str3, str2, bundle, C2968f.m31537c("_o", "_sn", "_sc", "_si"), z3);
                com.google.android.gms.common.internal.s.j(v0);
                ((v5) this).a.d();
                if (((v5) this).a.K().m27890t(false) != null && "_ae".equals(str2)) {
                    C4270k9 c4270k9 = ((v5) this).a.M().f10477e;
                    long mo31535a = ((v5) c4270k9.f10436d).a.c().mo31535a();
                    long j3 = mo31535a - c4270k9.f10434b;
                    c4270k9.f10434b = mo31535a;
                    if (j3 > 0) {
                        ((v5) this).a.N().v(v0, j3);
                    }
                }
                C3819hc.m29541b();
                if (((v5) this).a.z().B(null, C4173c3.f10132i0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        ia N4 = ((v5) this).a.N();
                        String string = v0.getString("_ffr");
                        if (com.google.android.gms.common.util.n.b(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!ia.Z(string, ((v5) N4).a.F().t.m28272a())) {
                            ((v5) N4).a.F().t.m28271b(string);
                        } else {
                            ((v5) N4).a.b().q().m28014a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m28272a = ((v5) ((v5) this).a.N()).a.F().t.m28272a();
                        if (!TextUtils.isEmpty(m28272a)) {
                            v0.putString("_ffr", m28272a);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(v0);
                if (((v5) this).a.F().o.m28404a() > 0 && ((v5) this).a.F().v(j) && ((v5) this).a.F().q.m27805b()) {
                    ((v5) this).a.b().v().m28014a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j2 = 0;
                    m28152N("auto", "_sid", null, ((v5) this).a.c().currentTimeMillis());
                    m28152N("auto", "_sno", null, ((v5) this).a.c().currentTimeMillis());
                    m28152N("auto", "_se", null, ((v5) this).a.c().currentTimeMillis());
                } else {
                    str4 = "_ae";
                    j2 = 0;
                }
                if (v0.getLong("extend_session", j2) == 1) {
                    ((v5) this).a.b().v().m28014a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    ((v5) this).a.M().f10476d.m28038b(j, true);
                }
                ArrayList arrayList2 = new ArrayList(v0.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str7 = (String) arrayList2.get(i2);
                    if (str7 != null) {
                        ((v5) this).a.N();
                        Object obj = v0.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            v0.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i3);
                    if (i3 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z2) {
                        bundle2 = ((v5) this).a.N().u0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    ((v5) this).a.L().m27859o(new C4379u(str6, new C4355s(bundle3), str, j), str3);
                    if (!z4) {
                        for (InterfaceC4188d6 interfaceC4188d6 : this.f10373e) {
                            interfaceC4188d6.mo25417a(str, str2, new Bundle(bundle3), j);
                        }
                    }
                }
                ((v5) this).a.d();
                if (((v5) this).a.K().m27890t(false) == null || !str4.equals(str2)) {
                    return;
                }
                ((v5) this).a.M().f10477e.m28052d(true, true, ((v5) this).a.c().mo31535a());
                return;
            }
            return;
        }
        ((v5) this).a.b().q().m28014a("Event not sent since app measurement is disabled");
    }

    /* renamed from: x */
    public final void m28121x(InterfaceC4188d6 interfaceC4188d6) {
        i();
        com.google.android.gms.common.internal.s.j(interfaceC4188d6);
        if (this.f10373e.add(interfaceC4188d6)) {
            return;
        }
        ((v5) this).a.b().w().m28014a("OnEventListener already registered");
    }

    /* renamed from: y */
    public final void m28120y(long j) {
        this.f10375g.set(null);
        ((v5) this).a.a().m27810z(new RunnableC4327p6(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m28119z(long j, boolean z) {
        h();
        i();
        ((v5) this).a.b().q().m28014a("Resetting analytics data (FE)");
        C4294m9 M = ((v5) this).a.M();
        M.h();
        C4282l9 c4282l9 = M.f10476d;
        M.f10477e.m28055a();
        boolean o = ((v5) this).a.o();
        g4 F = ((v5) this).a.F();
        F.e.m28403b(j);
        if (!TextUtils.isEmpty(((v5) F).a.F().t.m28272a())) {
            F.t.m28271b(null);
        }
        C3976rc.m28988b();
        if (((v5) F).a.z().B(null, C4173c3.f10134j0)) {
            F.o.m28403b(0L);
        }
        if (!((v5) F).a.z().E()) {
            F.t(!o);
        }
        F.u.m28271b(null);
        F.v.m28403b(0L);
        F.w.m28410b(null);
        if (z) {
            ((v5) this).a.L().m27857q();
        }
        C3976rc.m28988b();
        if (((v5) this).a.z().B(null, C4173c3.f10134j0)) {
            ((v5) this).a.M().f10476d.m28039a();
        }
        this.f10383o = !o;
    }
}
