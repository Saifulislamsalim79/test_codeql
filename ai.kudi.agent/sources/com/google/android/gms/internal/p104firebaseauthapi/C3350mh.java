package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.C5192a;
import com.google.firebase.auth.C5199d;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.C5275w;
import com.google.firebase.auth.internal.C5227i;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mh */
/* loaded from: classes2.dex */
public final class C3350mh {

    /* renamed from: a */
    private final AbstractC3457qk f8728a;

    public C3350mh(AbstractC3457qk abstractC3457qk) {
        s.j(abstractC3457qk);
        this.f8728a = abstractC3457qk;
    }

    /* renamed from: m */
    private final void m30672m(String str, InterfaceC3431pk<C3140em> interfaceC3431pk) {
        s.j(interfaceC3431pk);
        s.f(str);
        C3140em m31174k = C3140em.m31174k(str);
        if (m31174k.m31177e0()) {
            interfaceC3431pk.mo29886b(m31174k);
            return;
        }
        this.f8728a.mo30418f(new C3536tl(m31174k.m31172s()), new C3324lh(this, interfaceC3431pk));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m30671n(C3354ml c3354ml, C3056bj c3056bj) {
        s.j(c3354ml);
        s.j(c3056bj);
        this.f8728a.mo30421c(c3354ml, new C3634xf(this, c3056bj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m30670o(C3140em c3140em, String str, String str2, Boolean bool, C5206g0 c5206g0, C3056bj c3056bj, InterfaceC3405ok interfaceC3405ok) {
        s.j(c3140em);
        s.j(interfaceC3405ok);
        s.j(c3056bj);
        this.f8728a.mo30417g(new C3562ul(c3140em.m31173l()), new C3026ag(this, interfaceC3405ok, str2, str, bool, c5206g0, c3056bj, c3140em));
    }

    /* renamed from: p */
    private final void m30669p(C3059bm c3059bm, C3056bj c3056bj) {
        s.j(c3059bm);
        s.j(c3056bj);
        this.f8728a.mo30416h(c3059bm, new C3135eh(this, c3056bj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static /* synthetic */ void m30666s(C3350mh c3350mh, C3222hn c3222hn, C3056bj c3056bj, InterfaceC3405ok interfaceC3405ok) {
        Status m25323a;
        if (c3222hn.m31026p()) {
            C5206g0 m31039b = c3222hn.m31039b();
            String m31038c = c3222hn.m31038c();
            String m31031k = c3222hn.m31031k();
            if (c3222hn.m31028n()) {
                m25323a = new Status(17012);
            } else {
                m25323a = C5227i.m25323a(c3222hn.m31037d());
            }
            c3056bj.m31390e(new C3426pf(m25323a, m31039b, m31038c, m31031k));
            return;
        }
        c3350mh.m30670o(new C3140em(c3222hn.m31032j(), c3222hn.m31036f(), Long.valueOf(c3222hn.m31040a()), "Bearer"), c3222hn.m31033i(), c3222hn.m31034h(), Boolean.valueOf(c3222hn.m31027o()), c3222hn.m31039b(), c3056bj, interfaceC3405ok);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static /* synthetic */ void m30665t(C3350mh c3350mh, C3056bj c3056bj, C3140em c3140em, C3589vm c3589vm, InterfaceC3405ok interfaceC3405ok) {
        s.j(c3056bj);
        s.j(c3140em);
        s.j(c3589vm);
        s.j(interfaceC3405ok);
        c3350mh.f8728a.mo30417g(new C3562ul(c3140em.m31173l()), new C3660yf(c3350mh, interfaceC3405ok, c3056bj, c3140em, c3589vm));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static /* synthetic */ void m30663v(C3350mh c3350mh, C3056bj c3056bj, C3140em c3140em, C3640xl c3640xl, C3589vm c3589vm, InterfaceC3405ok interfaceC3405ok) {
        s.j(c3056bj);
        s.j(c3140em);
        s.j(c3640xl);
        s.j(c3589vm);
        s.j(interfaceC3405ok);
        c3350mh.f8728a.mo30413k(c3589vm, new C3686zf(c3350mh, c3589vm, c3640xl, c3056bj, c3140em, interfaceC3405ok));
    }

    /* renamed from: A */
    public final void m30700A(String str, String str2, String str3, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        this.f8728a.mo30415i(new C3433pm(str, str2, str3), new C3161fg(this, c3056bj));
    }

    /* renamed from: B */
    public final void m30699B(String str, String str2, String str3, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        this.f8728a.mo30411m(new C3641xm(str, str2, null, str3), new C3556uf(this, c3056bj));
    }

    /* renamed from: C */
    public final void m30698C(String str, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        m30672m(str, new C3081ch(this, c3056bj));
    }

    /* renamed from: D */
    public final void m30697D(Context context, C3406ol c3406ol, String str, C3056bj c3056bj) {
        s.j(c3406ol);
        s.j(c3056bj);
        m30672m(str, new C3609wg(this, c3406ol, null, c3056bj));
    }

    /* renamed from: E */
    public final void m30696E(Context context, C3458ql c3458ql, C3056bj c3056bj) {
        s.j(c3458ql);
        s.j(c3056bj);
        this.f8728a.mo30419e(null, c3458ql, new C3635xg(this, c3056bj));
    }

    /* renamed from: F */
    public final void m30695F(String str, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        this.f8728a.mo30418f(new C3536tl(str), new C3134eg(this, c3056bj));
    }

    /* renamed from: G */
    public final void m30694G(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        this.f8728a.mo30423a(new C3247il(str, str2), new C3053bg(this, c3056bj));
    }

    /* renamed from: H */
    public final void m30693H(String str, String str2, String str3, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.f(str3);
        s.j(c3056bj);
        m30672m(str3, new C3242ig(this, str, str2, c3056bj));
    }

    /* renamed from: I */
    public final void m30692I(String str, C3168fn c3168fn, C3056bj c3056bj) {
        s.f(str);
        s.j(c3168fn);
        s.j(c3056bj);
        m30672m(str, new C3349mg(this, c3168fn, c3056bj));
    }

    /* renamed from: J */
    public final void m30691J(Context context, String str, C3382nn c3382nn, C3056bj c3056bj) {
        s.f(str);
        s.j(c3382nn);
        s.j(c3056bj);
        m30672m(str, new C3296kg(this, c3382nn, null, c3056bj));
    }

    /* renamed from: K */
    public final void m30690K(String str, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        m30672m(str, new C3027ah(this, c3056bj));
    }

    /* renamed from: L */
    public final void m30689L(String str, C5192a c5192a, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        C3059bm c3059bm = new C3059bm(4);
        c3059bm.m31357f(str);
        if (c5192a != null) {
            c3059bm.m31360c(c5192a);
        }
        m30669p(c3059bm, c3056bj);
    }

    /* renamed from: M */
    public final void m30688M(String str, C5192a c5192a, String str2, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        C3059bm c3059bm = new C3059bm(c5192a.m25388E());
        c3059bm.m31359d(str);
        c3059bm.m31360c(c5192a);
        c3059bm.m31358e(str2);
        this.f8728a.mo30416h(c3059bm, new C3080cg(this, c3056bj));
    }

    /* renamed from: N */
    public final void m30687N(C3511sm c3511sm, C3056bj c3056bj) {
        s.f(c3511sm.m30269k());
        s.j(c3056bj);
        this.f8728a.mo30414j(c3511sm, new C3188gg(this, c3056bj));
    }

    /* renamed from: O */
    public final void m30686O(String str, C3056bj c3056bj) {
        s.j(c3056bj);
        this.f8728a.mo30412l(str, new C3108dh(this, c3056bj));
    }

    /* renamed from: P */
    public final void m30685P(String str, C3056bj c3056bj) {
        s.j(c3056bj);
        this.f8728a.mo30411m(new C3641xm(str), new C3189gh(this, c3056bj));
    }

    /* renamed from: a */
    public final void m30684a(Context context, C3168fn c3168fn, C3056bj c3056bj) {
        s.j(c3168fn);
        s.j(c3056bj);
        c3168fn.m31131k(true);
        this.f8728a.mo30408p(null, c3168fn, new C3162fh(this, c3056bj));
    }

    /* renamed from: b */
    public final void m30683b(C3249in c3249in, C3056bj c3056bj) {
        s.j(c3249in);
        s.j(c3056bj);
        this.f8728a.mo30407q(c3249in, new C3557ug(this, c3056bj));
    }

    /* renamed from: c */
    public final void m30682c(Context context, String str, String str2, String str3, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        this.f8728a.mo30406r(null, new C3330ln(str, str2, str3), new C3582vf(this, c3056bj));
    }

    /* renamed from: d */
    public final void m30681d(C5199d c5199d, C3056bj c3056bj) {
        s.j(c5199d);
        s.j(c3056bj);
        if (c5199d.m25370h0()) {
            m30672m(c5199d.m25367s(), new C3608wf(this, c5199d, c3056bj));
        } else {
            m30671n(new C3354ml(c5199d, null), c3056bj);
        }
    }

    /* renamed from: e */
    public final void m30680e(Context context, C3382nn c3382nn, C3056bj c3056bj) {
        s.j(c3382nn);
        s.j(c3056bj);
        this.f8728a.mo30405s(null, c3382nn, new C3215hg(this, c3056bj));
    }

    /* renamed from: f */
    public final void m30679f(C3693zm c3693zm, C3056bj c3056bj) {
        s.j(c3693zm);
        s.j(c3056bj);
        this.f8728a.mo30410n(c3693zm, new C3531tg(this, c3056bj));
    }

    /* renamed from: g */
    public final void m30678g(C3060bn c3060bn, C3056bj c3056bj) {
        s.j(c3060bn);
        s.j(c3056bj);
        this.f8728a.mo30409o(c3060bn, new C3661yg(this, c3056bj));
    }

    /* renamed from: h */
    public final void m30677h(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        m30672m(str, new C3479rg(this, str2, c3056bj));
    }

    /* renamed from: i */
    public final void m30676i(String str, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        m30672m(str, new C3375ng(this, c3056bj));
    }

    /* renamed from: j */
    public final void m30675j(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        m30672m(str2, new C3427pg(this, str, c3056bj));
    }

    /* renamed from: k */
    public final void m30674k(String str, C5275w c5275w, C3056bj c3056bj) {
        s.f(str);
        s.j(c5275w);
        s.j(c3056bj);
        m30672m(str, new C3216hh(this, c5275w, c3056bj));
    }

    /* renamed from: l */
    public final void m30673l(C3059bm c3059bm, C3056bj c3056bj) {
        m30669p(c3059bm, c3056bj);
    }

    /* renamed from: w */
    public final void m30662w(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        C3589vm c3589vm = new C3589vm();
        c3589vm.m30116e(str);
        c3589vm.m30113h(str2);
        this.f8728a.mo30413k(c3589vm, new C3297kh(this, c3056bj));
    }

    /* renamed from: x */
    public final void m30661x(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        m30672m(str, new C3243ih(this, str2, c3056bj));
    }

    /* renamed from: y */
    public final void m30660y(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.f(str2);
        s.j(c3056bj);
        m30672m(str, new C3270jh(this, str2, c3056bj));
    }

    /* renamed from: z */
    public final void m30659z(String str, String str2, C3056bj c3056bj) {
        s.f(str);
        s.j(c3056bj);
        this.f8728a.mo30415i(new C3433pm(str, null, str2), new C3107dg(this, c3056bj));
    }
}
