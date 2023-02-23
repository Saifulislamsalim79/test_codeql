package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C3731c1;
import com.google.android.gms.internal.measurement.C3766e5;
import com.google.android.gms.internal.measurement.C3796g5;
import com.google.android.gms.internal.measurement.C3897mb;
import com.google.android.gms.internal.measurement.C3899md;
import com.google.android.gms.internal.measurement.C3936p3;
import com.google.android.gms.internal.measurement.C3983s3;
import com.google.android.gms.internal.measurement.C3999t3;
import com.google.android.gms.internal.measurement.C4009td;
import com.google.android.gms.internal.measurement.C4026ue;
import com.google.android.gms.internal.measurement.C4031v3;
import com.google.android.gms.internal.measurement.C4042ve;
import com.google.android.gms.internal.measurement.C4087yb;
import com.google.android.gms.internal.measurement.InterfaceC3994se;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p201g.p218e.C7521a;
import p201g.p218e.C7527e;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes2.dex */
public final class C4372t4 extends AbstractC4353r9 implements InterfaceC4204f {

    /* renamed from: d */
    private final Map<String, Map<String, String>> f10672d;

    /* renamed from: e */
    final Map<String, Map<String, Boolean>> f10673e;

    /* renamed from: f */
    final Map<String, Map<String, Boolean>> f10674f;

    /* renamed from: g */
    private final Map<String, C3999t3> f10675g;

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f10676h;

    /* renamed from: i */
    final C7527e<String, C3731c1> f10677i;

    /* renamed from: j */
    final InterfaceC3994se f10678j;

    /* renamed from: k */
    private final Map<String, String> f10679k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4372t4(C4168ba c4168ba) {
        super(c4168ba);
        this.f10672d = new C7521a();
        this.f10673e = new C7521a();
        this.f10674f = new C7521a();
        this.f10675g = new C7521a();
        this.f10679k = new C7521a();
        this.f10676h = new C7521a();
        this.f10677i = new C4336q4(this, 20);
        this.f10678j = new C4348r4(this);
    }

    /* renamed from: A */
    private final C3999t3 m27972A(String str, byte[] bArr) {
        if (bArr == null) {
            return C3999t3.m28928C();
        }
        try {
            C3983s3 m28930A = C3999t3.m28930A();
            C4192da.m28300D(m28930A, bArr);
            C3999t3 m29456k = m28930A.m29456k();
            ((v5) this).a.b().v().m28012c("Parsed config. version, gmp_app_id", m29456k.m28919L() ? Long.valueOf(m29456k.m28916y()) : null, m29456k.m28920K() ? m29456k.m28927D() : null);
            return m29456k;
        } catch (zzkh e) {
            ((v5) this).a.b().w().m28012c("Unable to merge remote config. appId", q3.z(str), e);
            return C3999t3.m28928C();
        } catch (RuntimeException e2) {
            ((v5) this).a.b().w().m28012c("Unable to merge remote config. appId", q3.z(str), e2);
            return C3999t3.m28928C();
        }
    }

    /* renamed from: B */
    private final void m27971B(String str, C3983s3 c3983s3) {
        C7521a c7521a = new C7521a();
        C7521a c7521a2 = new C7521a();
        C7521a c7521a3 = new C7521a();
        if (c3983s3 != null) {
            for (int i = 0; i < c3983s3.m28985r(); i++) {
                C3936p3 m29387q = c3983s3.m28984s(i).m29387q();
                if (TextUtils.isEmpty(m29387q.m29226t())) {
                    ((v5) this).a.b().w().m28014a("EventConfig contained null event name");
                } else {
                    String m29226t = m29387q.m29226t();
                    String m27803b = C4441z5.m27803b(m29387q.m29226t());
                    if (!TextUtils.isEmpty(m27803b)) {
                        m29387q.m29227s(m27803b);
                        c3983s3.m28982u(i, m29387q);
                    }
                    C4087yb.m28590b();
                    if (!((v5) this).a.z().B(null, C4173c3.f10166z0)) {
                        c7521a.put(m29226t, Boolean.valueOf(m29387q.m29225u()));
                    } else if (m29387q.m29223w() && m29387q.m29225u()) {
                        c7521a.put(m29226t, Boolean.TRUE);
                    }
                    C4087yb.m28590b();
                    if (!((v5) this).a.z().B(null, C4173c3.f10166z0)) {
                        c7521a2.put(m29387q.m29226t(), Boolean.valueOf(m29387q.m29224v()));
                    } else if (m29387q.m29222x() && m29387q.m29224v()) {
                        c7521a2.put(m29387q.m29226t(), Boolean.TRUE);
                    }
                    if (m29387q.m29221y()) {
                        if (m29387q.m29228r() >= 2 && m29387q.m29228r() <= 65535) {
                            c7521a3.put(m29387q.m29226t(), Integer.valueOf(m29387q.m29228r()));
                        } else {
                            ((v5) this).a.b().w().m28012c("Invalid sampling rate. Event name, sample rate", m29387q.m29226t(), Integer.valueOf(m29387q.m29228r()));
                        }
                    }
                }
            }
        }
        this.f10673e.put(str, c7521a);
        this.f10674f.put(str, c7521a2);
        this.f10676h.put(str, c7521a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0121: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x0121 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m27970C(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4372t4.m27970C(java.lang.String):void");
    }

    /* renamed from: D */
    private final void m27969D(final String str, C3999t3 c3999t3) {
        if (c3999t3.m28918w() != 0) {
            ((v5) this).a.b().v().m28013b("EES programs found", Integer.valueOf(c3999t3.m28918w()));
            C3796g5 c3796g5 = c3999t3.m28925F().get(0);
            try {
                C3731c1 c3731c1 = new C3731c1();
                c3731c1.m29727d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.n4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C3897mb("internal.remoteConfig", new C4360s4(C4372t4.this, str));
                    }
                });
                c3731c1.m29727d("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.p4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C4372t4 c4372t4 = C4372t4.this;
                        final String str2 = str;
                        return new C4042ve("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.o4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C4372t4 c4372t42 = C4372t4.this;
                                String str3 = str2;
                                C4220g5 m28087T = c4372t42.f10625b.m28379U().m28087T(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                ((v5) c4372t42).a.z().q();
                                hashMap.put("gmp_version", 46000L);
                                if (m28087T != null) {
                                    String m28214h0 = m28087T.m28214h0();
                                    if (m28214h0 != null) {
                                        hashMap.put("app_version", m28214h0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m28087T.m28243M()));
                                    hashMap.put("dynamite_version", Long.valueOf(m28087T.m28234V()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c3731c1.m29727d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.m4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C4026ue(C4372t4.this.f10678j);
                    }
                });
                c3731c1.m29728c(c3796g5);
                this.f10677i.m18486d(str, c3731c1);
                ((v5) this).a.b().v().m28012c("EES program loaded for appId, activities", str, Integer.valueOf(c3796g5.m29589w().m29720w()));
                for (C3766e5 c3766e5 : c3796g5.m29589w().m29717z()) {
                    ((v5) this).a.b().v().m28013b("EES program activity", c3766e5.m29655x());
                }
                return;
            } catch (zzd unused) {
                ((v5) this).a.b().r().m28013b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f10677i.m18485e(str);
    }

    /* renamed from: E */
    private static final Map<String, String> m27968E(C3999t3 c3999t3) {
        C7521a c7521a = new C7521a();
        if (c3999t3 != null) {
            for (C4031v3 c4031v3 : c3999t3.m28924G()) {
                c7521a.put(c4031v3.m28801x(), c4031v3.m28800y());
            }
        }
        return c7521a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* bridge */ /* synthetic */ C3731c1 m27965n(C4372t4 c4372t4, String str) {
        c4372t4.m27986i();
        com.google.android.gms.common.internal.s.f(str);
        C4009td.m28898b();
        if (((v5) c4372t4).a.z().B(null, C4173c3.f10150r0) && c4372t4.m27958u(str)) {
            if (c4372t4.f10675g.containsKey(str) && c4372t4.f10675g.get(str) != null) {
                c4372t4.m27969D(str, c4372t4.f10675g.get(str));
            } else {
                c4372t4.m27970C(str);
            }
            return c4372t4.f10677i.m18482h().get(str);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4204f
    /* renamed from: e */
    public final String mo27967e(String str, String str2) {
        h();
        m27970C(str);
        Map<String, String> map = this.f10672d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4353r9
    /* renamed from: l */
    protected final boolean mo27835l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final int m27966m(String str, String str2) {
        Integer num;
        h();
        m27970C(str);
        Map<String, Integer> map = this.f10676h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C3999t3 m27964o(String str) {
        m27986i();
        h();
        com.google.android.gms.common.internal.s.f(str);
        m27970C(str);
        return this.f10675g.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final String m27963p(String str) {
        h();
        return this.f10679k.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m27961r(String str) {
        h();
        this.f10679k.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m27960s(String str) {
        h();
        this.f10675g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m27959t(String str) {
        h();
        C3999t3 m27964o = m27964o(str);
        if (m27964o == null) {
            return false;
        }
        return m27964o.m28921J();
    }

    /* renamed from: u */
    public final boolean m27958u(String str) {
        C3999t3 c3999t3;
        C4009td.m28898b();
        return (!((v5) this).a.z().B(null, C4173c3.f10150r0) || TextUtils.isEmpty(str) || (c3999t3 = this.f10675g.get(str)) == null || c3999t3.m28918w() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m27957v(String str) {
        return "1".equals(mo27967e(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m27956w(String str, String str2) {
        Boolean bool;
        h();
        m27970C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10674f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean m27955x(String str, String str2) {
        Boolean bool;
        h();
        m27970C(str);
        if (m27957v(str) && ia.V(str2)) {
            return true;
        }
        if (m27954y(str) && ia.W(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10673e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean m27954y(String str) {
        return "1".equals(mo27967e(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m27953z(String str, byte[] bArr, String str2) {
        m27986i();
        h();
        com.google.android.gms.common.internal.s.f(str);
        C3983s3 m29387q = m27972A(str, bArr).m29387q();
        if (m29387q == null) {
            return false;
        }
        m27971B(str, m29387q);
        C4009td.m28898b();
        if (((v5) this).a.z().B(null, C4173c3.f10150r0)) {
            m27969D(str, m29387q.m29456k());
        }
        this.f10675g.put(str, m29387q.m29456k());
        this.f10679k.put(str, str2);
        this.f10672d.put(str, m27968E(m29387q.m29456k()));
        this.f10625b.m28379U().m28068o(str, new ArrayList(m29387q.m28981v()));
        try {
            m29387q.m28983t();
            bArr = m29387q.m29456k().m29845j();
        } catch (RuntimeException e) {
            ((v5) this).a.b().w().m28012c("Unable to serialize reduced-size config. Storing full config instead. appId", q3.z(str), e);
        }
        C3899md.m29378b();
        if (((v5) this).a.z().B(null, C4173c3.f10144o0)) {
            this.f10625b.m28379U().m28064s(str, bArr, str2);
        } else {
            this.f10625b.m28379U().m28064s(str, bArr, null);
        }
        this.f10675g.put(str, m29387q.m29456k());
        return true;
    }
}
