package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes2.dex */
public final class C4409w7 extends f4 {

    /* renamed from: c */
    private volatile C4328p7 f10760c;

    /* renamed from: d */
    private volatile C4328p7 f10761d;

    /* renamed from: e */
    protected C4328p7 f10762e;

    /* renamed from: f */
    private final Map<Activity, C4328p7> f10763f;

    /* renamed from: g */
    private Activity f10764g;

    /* renamed from: h */
    private volatile boolean f10765h;

    /* renamed from: i */
    private volatile C4328p7 f10766i;

    /* renamed from: j */
    private C4328p7 f10767j;

    /* renamed from: k */
    private boolean f10768k;

    /* renamed from: l */
    private final Object f10769l;

    /* renamed from: m */
    private String f10770m;

    public C4409w7(b5 b5Var) {
        super(b5Var);
        this.f10769l = new Object();
        this.f10763f = new ConcurrentHashMap();
    }

    /* renamed from: H */
    private final C4328p7 m27897H(Activity activity) {
        com.google.android.gms.common.internal.s.j(activity);
        C4328p7 c4328p7 = this.f10763f.get(activity);
        if (c4328p7 == null) {
            C4328p7 c4328p72 = new C4328p7(null, m27889u(activity.getClass(), "Activity"), ((v5) this).a.N().r0());
            this.f10763f.put(activity, c4328p72);
            c4328p7 = c4328p72;
        }
        return this.f10766i != null ? this.f10766i : c4328p7;
    }

    /* renamed from: o */
    private final void m27895o(Activity activity, C4328p7 c4328p7, boolean z) {
        C4328p7 c4328p72;
        C4328p7 c4328p73 = this.f10760c == null ? this.f10761d : this.f10760c;
        if (c4328p7.f10583b == null) {
            c4328p72 = new C4328p7(c4328p7.f10582a, activity != null ? m27889u(activity.getClass(), "Activity") : null, c4328p7.f10584c, c4328p7.f10586e, c4328p7.f10587f);
        } else {
            c4328p72 = c4328p7;
        }
        this.f10761d = this.f10760c;
        this.f10760c = c4328p72;
        ((v5) this).a.a().m27810z(new RunnableC4351r7(this, c4328p72, c4328p73, ((v5) this).a.c().mo31535a(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m27894p(C4328p7 c4328p7, C4328p7 c4328p72, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        h();
        boolean z2 = false;
        boolean z3 = (c4328p72 != null && c4328p72.f10584c == c4328p7.f10584c && ia.Z(c4328p72.f10583b, c4328p7.f10583b) && ia.Z(c4328p72.f10582a, c4328p7.f10582a)) ? false : true;
        if (z && this.f10762e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            ia.x(c4328p7, bundle3, true);
            if (c4328p72 != null) {
                String str = c4328p72.f10582a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c4328p72.f10583b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c4328p72.f10584c);
            }
            if (z2) {
                C4270k9 c4270k9 = ((v5) this).a.M().f10477e;
                long j4 = j - c4270k9.f10434b;
                c4270k9.f10434b = j;
                if (j4 > 0) {
                    ((v5) this).a.N().v(bundle3, j4);
                }
            }
            if (!((v5) this).a.z().D()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != c4328p7.f10586e ? "auto" : "app";
            long currentTimeMillis = ((v5) this).a.c().currentTimeMillis();
            if (c4328p7.f10586e) {
                j2 = currentTimeMillis;
                long j5 = c4328p7.f10587f;
                if (j5 != 0) {
                    j3 = j5;
                    ((v5) this).a.I().m28123v(str3, "_vs", j3, bundle3);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            ((v5) this).a.I().m28123v(str3, "_vs", j3, bundle3);
        }
        if (z2) {
            m27893q(this.f10762e, true, j);
        }
        this.f10762e = c4328p7;
        if (c4328p7.f10586e) {
            this.f10767j = c4328p7;
        }
        ((v5) this).a.L().m27853u(c4328p7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m27893q(C4328p7 c4328p7, boolean z, long j) {
        ((v5) this).a.y().m28311n(((v5) this).a.c().mo31535a());
        if (!((v5) this).a.M().f10477e.m28052d(c4328p7 != null && c4328p7.f10585d, z, j) || c4328p7 == null) {
            return;
        }
        c4328p7.f10585d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m27886x(C4409w7 c4409w7, Bundle bundle, C4328p7 c4328p7, C4328p7 c4328p72, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c4409w7.m27894p(c4328p7, c4328p72, j, true, ((v5) c4409w7).a.N().v0((String) null, "screen_view", bundle, (List) null, false));
    }

    /* renamed from: A */
    public final void m27904A(Activity activity) {
        synchronized (this.f10769l) {
            if (activity == this.f10764g) {
                this.f10764g = null;
            }
        }
        if (((v5) this).a.z().D()) {
            this.f10763f.remove(activity);
        }
    }

    /* renamed from: B */
    public final void m27903B(Activity activity) {
        synchronized (this.f10769l) {
            this.f10768k = false;
            this.f10765h = true;
        }
        long mo31535a = ((v5) this).a.c().mo31535a();
        if (!((v5) this).a.z().D()) {
            this.f10760c = null;
            ((v5) this).a.a().m27810z(new RunnableC4375t7(this, mo31535a));
            return;
        }
        C4328p7 m27897H = m27897H(activity);
        this.f10761d = this.f10760c;
        this.f10760c = null;
        ((v5) this).a.a().m27810z(new RunnableC4387u7(this, m27897H, mo31535a));
    }

    /* renamed from: C */
    public final void m27902C(Activity activity) {
        synchronized (this.f10769l) {
            this.f10768k = true;
            if (activity != this.f10764g) {
                synchronized (this.f10769l) {
                    this.f10764g = activity;
                    this.f10765h = false;
                }
                if (((v5) this).a.z().D()) {
                    this.f10766i = null;
                    ((v5) this).a.a().m27810z(new RunnableC4398v7(this));
                }
            }
        }
        if (!((v5) this).a.z().D()) {
            this.f10760c = this.f10766i;
            ((v5) this).a.a().m27810z(new RunnableC4363s7(this));
            return;
        }
        m27895o(activity, m27897H(activity), false);
        C4184d2 y = ((v5) this).a.y();
        ((v5) y).a.a().m27810z(new RunnableC4171c1(y, ((v5) y).a.c().mo31535a()));
    }

    /* renamed from: D */
    public final void m27901D(Activity activity, Bundle bundle) {
        C4328p7 c4328p7;
        if (!((v5) this).a.z().D() || bundle == null || (c4328p7 = this.f10763f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c4328p7.f10584c);
        bundle2.putString("name", c4328p7.f10582a);
        bundle2.putString("referrer_name", c4328p7.f10583b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27900E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.b5 r0 = r3.a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            boolean r0 = r0.D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.m28014a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.p7 r0 = r3.f10760c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.m28014a(r5)
            return
        L30:
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.p7> r1 = r3.f10763f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.m28014a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.m27889u(r6, r1)
        L54:
            java.lang.String r1 = r0.f10583b
            boolean r1 = com.google.android.gms.measurement.internal.ia.Z(r1, r6)
            java.lang.String r0 = r0.f10582a
            boolean r0 = com.google.android.gms.measurement.internal.ia.Z(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.m28014a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.b5 r1 = r3.a
            r1.z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.m28013b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.b5 r1 = r3.a
            r1.z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.b5 r4 = r3.a
            com.google.android.gms.measurement.internal.q3 r4 = r4.b()
            com.google.android.gms.measurement.internal.o3 r4 = r4.x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.m28013b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.b5 r0 = r3.a
            com.google.android.gms.measurement.internal.q3 r0 = r0.b()
            com.google.android.gms.measurement.internal.o3 r0 = r0.v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.m28012c(r2, r1, r6)
            com.google.android.gms.measurement.internal.p7 r0 = new com.google.android.gms.measurement.internal.p7
            com.google.android.gms.measurement.internal.b5 r1 = r3.a
            com.google.android.gms.measurement.internal.ia r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.p7> r5 = r3.f10763f
            r5.put(r4, r0)
            r5 = 1
            r3.m27895o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4409w7.m27900E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27899F(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4409w7.m27899F(android.os.Bundle, long):void");
    }

    /* renamed from: G */
    public final void m27898G(String str, C4328p7 c4328p7) {
        h();
        synchronized (this) {
            String str2 = this.f10770m;
            if (str2 == null || str2.equals(str) || c4328p7 != null) {
                this.f10770m = str;
            }
        }
    }

    /* renamed from: n */
    protected final boolean m27896n() {
        return false;
    }

    /* renamed from: s */
    public final C4328p7 m27891s() {
        return this.f10760c;
    }

    /* renamed from: t */
    public final C4328p7 m27890t(boolean z) {
        i();
        h();
        if (z) {
            C4328p7 c4328p7 = this.f10762e;
            return c4328p7 != null ? c4328p7 : this.f10767j;
        }
        return this.f10762e;
    }

    /* renamed from: u */
    final String m27889u(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        ((v5) this).a.z();
        if (length2 > 100) {
            ((v5) this).a.z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: z */
    public final void m27884z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((v5) this).a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f10763f.put(activity, new C4328p7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
