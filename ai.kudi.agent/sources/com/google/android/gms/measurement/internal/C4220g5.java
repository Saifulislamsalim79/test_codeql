package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* loaded from: classes2.dex */
final class C4220g5 {

    /* renamed from: A */
    private long f10276A;

    /* renamed from: B */
    private long f10277B;

    /* renamed from: C */
    private String f10278C;

    /* renamed from: D */
    private boolean f10279D;

    /* renamed from: E */
    private long f10280E;

    /* renamed from: F */
    private long f10281F;

    /* renamed from: a */
    private final b5 f10282a;

    /* renamed from: b */
    private final String f10283b;

    /* renamed from: c */
    private String f10284c;

    /* renamed from: d */
    private String f10285d;

    /* renamed from: e */
    private String f10286e;

    /* renamed from: f */
    private String f10287f;

    /* renamed from: g */
    private long f10288g;

    /* renamed from: h */
    private long f10289h;

    /* renamed from: i */
    private long f10290i;

    /* renamed from: j */
    private String f10291j;

    /* renamed from: k */
    private long f10292k;

    /* renamed from: l */
    private String f10293l;

    /* renamed from: m */
    private long f10294m;

    /* renamed from: n */
    private long f10295n;

    /* renamed from: o */
    private boolean f10296o;

    /* renamed from: p */
    private long f10297p;

    /* renamed from: q */
    private boolean f10298q;

    /* renamed from: r */
    private String f10299r;

    /* renamed from: s */
    private Boolean f10300s;

    /* renamed from: t */
    private long f10301t;

    /* renamed from: u */
    private List<String> f10302u;

    /* renamed from: v */
    private String f10303v;

    /* renamed from: w */
    private long f10304w;

    /* renamed from: x */
    private long f10305x;

    /* renamed from: y */
    private long f10306y;

    /* renamed from: z */
    private long f10307z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4220g5(b5 b5Var, String str) {
        com.google.android.gms.common.internal.s.j(b5Var);
        com.google.android.gms.common.internal.s.f(str);
        this.f10282a = b5Var;
        this.f10283b = str;
        b5Var.a().m27823h();
    }

    /* renamed from: A */
    public final long m28255A() {
        this.f10282a.a().m27823h();
        return this.f10297p;
    }

    /* renamed from: B */
    public final void m28254B(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10278C, str);
        this.f10278C = str;
    }

    /* renamed from: C */
    public final void m28253C(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10290i != j;
        this.f10290i = j;
    }

    /* renamed from: D */
    public final void m28252D(long j) {
        com.google.android.gms.common.internal.s.a(j >= 0);
        this.f10282a.a().m27823h();
        this.f10279D = (this.f10288g != j) | this.f10279D;
        this.f10288g = j;
    }

    /* renamed from: E */
    public final void m28251E(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10289h != j;
        this.f10289h = j;
    }

    /* renamed from: F */
    public final void m28250F(boolean z) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10296o != z;
        this.f10296o = z;
    }

    /* renamed from: G */
    public final void m28249G(Boolean bool) {
        boolean equals;
        this.f10282a.a().m27823h();
        boolean z = this.f10279D;
        Boolean bool2 = this.f10300s;
        int i = ia.i;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.f10279D = z | (!equals);
        this.f10300s = bool;
    }

    /* renamed from: H */
    public final void m28248H(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10286e, str);
        this.f10286e = str;
    }

    /* renamed from: I */
    public final void m28247I(List<String> list) {
        this.f10282a.a().m27823h();
        List<String> list2 = this.f10302u;
        int i = ia.i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.f10279D = true;
        this.f10302u = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: J */
    public final boolean m28246J() {
        this.f10282a.a().m27823h();
        return this.f10298q;
    }

    /* renamed from: K */
    public final boolean m28245K() {
        this.f10282a.a().m27823h();
        return this.f10296o;
    }

    /* renamed from: L */
    public final boolean m28244L() {
        this.f10282a.a().m27823h();
        return this.f10279D;
    }

    /* renamed from: M */
    public final long m28243M() {
        this.f10282a.a().m27823h();
        return this.f10292k;
    }

    /* renamed from: N */
    public final long m28242N() {
        this.f10282a.a().m27823h();
        return this.f10280E;
    }

    /* renamed from: O */
    public final long m28241O() {
        this.f10282a.a().m27823h();
        return this.f10307z;
    }

    /* renamed from: P */
    public final long m28240P() {
        this.f10282a.a().m27823h();
        return this.f10276A;
    }

    /* renamed from: Q */
    public final long m28239Q() {
        this.f10282a.a().m27823h();
        return this.f10306y;
    }

    /* renamed from: R */
    public final long m28238R() {
        this.f10282a.a().m27823h();
        return this.f10305x;
    }

    /* renamed from: S */
    public final long m28237S() {
        this.f10282a.a().m27823h();
        return this.f10277B;
    }

    /* renamed from: T */
    public final long m28236T() {
        this.f10282a.a().m27823h();
        return this.f10304w;
    }

    /* renamed from: U */
    public final long m28235U() {
        this.f10282a.a().m27823h();
        return this.f10295n;
    }

    /* renamed from: V */
    public final long m28234V() {
        this.f10282a.a().m27823h();
        return this.f10301t;
    }

    /* renamed from: W */
    public final long m28233W() {
        this.f10282a.a().m27823h();
        return this.f10281F;
    }

    /* renamed from: X */
    public final long m28232X() {
        this.f10282a.a().m27823h();
        return this.f10294m;
    }

    /* renamed from: Y */
    public final long m28231Y() {
        this.f10282a.a().m27823h();
        return this.f10290i;
    }

    /* renamed from: Z */
    public final long m28230Z() {
        this.f10282a.a().m27823h();
        return this.f10288g;
    }

    /* renamed from: a */
    public final String m28229a() {
        this.f10282a.a().m27823h();
        return this.f10278C;
    }

    /* renamed from: a0 */
    public final long m28228a0() {
        this.f10282a.a().m27823h();
        return this.f10289h;
    }

    /* renamed from: b */
    public final String m28227b() {
        this.f10282a.a().m27823h();
        return this.f10286e;
    }

    /* renamed from: b0 */
    public final Boolean m28226b0() {
        this.f10282a.a().m27823h();
        return this.f10300s;
    }

    /* renamed from: c */
    public final List<String> m28225c() {
        this.f10282a.a().m27823h();
        return this.f10302u;
    }

    /* renamed from: c0 */
    public final String m28224c0() {
        this.f10282a.a().m27823h();
        return this.f10299r;
    }

    /* renamed from: d */
    public final void m28223d() {
        this.f10282a.a().m27823h();
        this.f10279D = false;
    }

    /* renamed from: d0 */
    public final String m28222d0() {
        this.f10282a.a().m27823h();
        String str = this.f10278C;
        m28254B(null);
        return str;
    }

    /* renamed from: e */
    public final void m28221e() {
        this.f10282a.a().m27823h();
        long j = this.f10288g + 1;
        if (j > 2147483647L) {
            this.f10282a.b().w().m28013b("Bundle index overflow. appId", q3.z(this.f10283b));
            j = 0;
        }
        this.f10279D = true;
        this.f10288g = j;
    }

    /* renamed from: e0 */
    public final String m28220e0() {
        this.f10282a.a().m27823h();
        return this.f10283b;
    }

    /* renamed from: f */
    public final void m28219f(String str) {
        this.f10282a.a().m27823h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10279D |= true ^ ia.Z(this.f10299r, str);
        this.f10299r = str;
    }

    /* renamed from: f0 */
    public final String m28218f0() {
        this.f10282a.a().m27823h();
        return this.f10284c;
    }

    /* renamed from: g */
    public final void m28217g(boolean z) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10298q != z;
        this.f10298q = z;
    }

    /* renamed from: g0 */
    public final String m28216g0() {
        this.f10282a.a().m27823h();
        return this.f10293l;
    }

    /* renamed from: h */
    public final void m28215h(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10297p != j;
        this.f10297p = j;
    }

    /* renamed from: h0 */
    public final String m28214h0() {
        this.f10282a.a().m27823h();
        return this.f10291j;
    }

    /* renamed from: i */
    public final void m28213i(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10284c, str);
        this.f10284c = str;
    }

    /* renamed from: i0 */
    public final String m28212i0() {
        this.f10282a.a().m27823h();
        return this.f10287f;
    }

    /* renamed from: j */
    public final void m28211j(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10293l, str);
        this.f10293l = str;
    }

    /* renamed from: j0 */
    public final String m28210j0() {
        this.f10282a.a().m27823h();
        return this.f10303v;
    }

    /* renamed from: k */
    public final void m28209k(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10291j, str);
        this.f10291j = str;
    }

    /* renamed from: k0 */
    public final String m28208k0() {
        this.f10282a.a().m27823h();
        return this.f10285d;
    }

    /* renamed from: l */
    public final void m28207l(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10292k != j;
        this.f10292k = j;
    }

    /* renamed from: m */
    public final void m28206m(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10280E != j;
        this.f10280E = j;
    }

    /* renamed from: n */
    public final void m28205n(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10307z != j;
        this.f10307z = j;
    }

    /* renamed from: o */
    public final void m28204o(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10276A != j;
        this.f10276A = j;
    }

    /* renamed from: p */
    public final void m28203p(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10306y != j;
        this.f10306y = j;
    }

    /* renamed from: q */
    public final void m28202q(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10305x != j;
        this.f10305x = j;
    }

    /* renamed from: r */
    public final void m28201r(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10277B != j;
        this.f10277B = j;
    }

    /* renamed from: s */
    public final void m28200s(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10304w != j;
        this.f10304w = j;
    }

    /* renamed from: t */
    public final void m28199t(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10295n != j;
        this.f10295n = j;
    }

    /* renamed from: u */
    public final void m28198u(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10301t != j;
        this.f10301t = j;
    }

    /* renamed from: v */
    public final void m28197v(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10281F != j;
        this.f10281F = j;
    }

    /* renamed from: w */
    public final void m28196w(String str) {
        this.f10282a.a().m27823h();
        this.f10279D |= !ia.Z(this.f10287f, str);
        this.f10287f = str;
    }

    /* renamed from: x */
    public final void m28195x(String str) {
        this.f10282a.a().m27823h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10279D |= true ^ ia.Z(this.f10303v, str);
        this.f10303v = str;
    }

    /* renamed from: y */
    public final void m28194y(String str) {
        this.f10282a.a().m27823h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10279D |= true ^ ia.Z(this.f10285d, str);
        this.f10285d = str;
    }

    /* renamed from: z */
    public final void m28193z(long j) {
        this.f10282a.a().m27823h();
        this.f10279D |= this.f10294m != j;
        this.f10294m = j;
    }
}
