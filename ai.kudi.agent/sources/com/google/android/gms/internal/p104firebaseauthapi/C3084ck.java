package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ck */
/* loaded from: classes2.dex */
public final class C3084ck extends AbstractC3457qk implements InterfaceC3139el {

    /* renamed from: a */
    private C3508sj f8309a;

    /* renamed from: b */
    private C3534tj f8310b;

    /* renamed from: c */
    private C3561uk f8311c;

    /* renamed from: d */
    private final C3057bk f8312d;

    /* renamed from: e */
    private final Context f8313e;

    /* renamed from: f */
    private final String f8314f;

    /* renamed from: g */
    C3111dk f8315g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3084ck(Context context, String str, C3057bk c3057bk, C3561uk c3561uk, C3508sj c3508sj, C3534tj c3534tj) {
        s.j(context);
        this.f8313e = context.getApplicationContext();
        s.f(str);
        this.f8314f = str;
        s.j(c3057bk);
        this.f8312d = c3057bk;
        m31280v(null, null, null);
        C3166fl.m31136e(str, this);
    }

    /* renamed from: u */
    private final C3111dk m31281u() {
        if (this.f8315g == null) {
            this.f8315g = new C3111dk(this.f8313e, this.f8312d.m31379b());
        }
        return this.f8315g;
    }

    /* renamed from: v */
    private final void m31280v(C3561uk c3561uk, C3508sj c3508sj, C3534tj c3534tj) {
        this.f8311c = null;
        this.f8309a = null;
        this.f8310b = null;
        String m31279a = C3085cl.m31279a("firebear.secureToken");
        if (TextUtils.isEmpty(m31279a)) {
            m31279a = C3166fl.m31137d(this.f8314f);
        } else {
            String valueOf = String.valueOf(m31279a);
            Log.e("LocalClient", valueOf.length() != 0 ? "Found hermetic configuration for secureToken URL: ".concat(valueOf) : new String("Found hermetic configuration for secureToken URL: "));
        }
        if (this.f8311c == null) {
            this.f8311c = new C3561uk(m31279a, m31281u());
        }
        String m31279a2 = C3085cl.m31279a("firebear.identityToolkit");
        if (TextUtils.isEmpty(m31279a2)) {
            m31279a2 = C3166fl.m31139b(this.f8314f);
        } else {
            String valueOf2 = String.valueOf(m31279a2);
            Log.e("LocalClient", valueOf2.length() != 0 ? "Found hermetic configuration for identityToolkit URL: ".concat(valueOf2) : new String("Found hermetic configuration for identityToolkit URL: "));
        }
        if (this.f8309a == null) {
            this.f8309a = new C3508sj(m31279a2, m31281u());
        }
        String m31279a3 = C3085cl.m31279a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(m31279a3)) {
            m31279a3 = C3166fl.m31138c(this.f8314f);
        } else {
            String valueOf3 = String.valueOf(m31279a3);
            Log.e("LocalClient", valueOf3.length() != 0 ? "Found hermetic configuration for identityToolkitV2 URL: ".concat(valueOf3) : new String("Found hermetic configuration for identityToolkitV2 URL: "));
        }
        if (this.f8310b == null) {
            this.f8310b = new C3534tj(m31279a3, m31281u());
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: a */
    public final void mo30423a(C3247il c3247il, InterfaceC3431pk<C3274jl> interfaceC3431pk) {
        s.j(c3247il);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/createAuthUri", this.f8314f), c3247il, interfaceC3431pk, C3274jl.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: b */
    public final void mo30422b(C3328ll c3328ll, InterfaceC3431pk<Void> interfaceC3431pk) {
        s.j(c3328ll);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/deleteAccount", this.f8314f), c3328ll, interfaceC3431pk, Void.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: c */
    public final void mo30421c(C3354ml c3354ml, InterfaceC3431pk<C3380nl> interfaceC3431pk) {
        s.j(c3354ml);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/emailLinkSignin", this.f8314f), c3354ml, interfaceC3431pk, C3380nl.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: d */
    public final void mo30420d(Context context, C3406ol c3406ol, InterfaceC3431pk<C3432pl> interfaceC3431pk) {
        s.j(c3406ol);
        s.j(interfaceC3431pk);
        C3534tj c3534tj = this.f8310b;
        C3483rk.m30342a(c3534tj.m30840a("/mfaEnrollment:finalize", this.f8314f), c3406ol, interfaceC3431pk, C3432pl.class, c3534tj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: e */
    public final void mo30419e(Context context, C3458ql c3458ql, InterfaceC3431pk<C3484rl> interfaceC3431pk) {
        s.j(c3458ql);
        s.j(interfaceC3431pk);
        C3534tj c3534tj = this.f8310b;
        C3483rk.m30342a(c3534tj.m30840a("/mfaSignIn:finalize", this.f8314f), c3458ql, interfaceC3431pk, C3484rl.class, c3534tj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: f */
    public final void mo30418f(C3536tl c3536tl, InterfaceC3431pk<C3140em> interfaceC3431pk) {
        s.j(c3536tl);
        s.j(interfaceC3431pk);
        C3561uk c3561uk = this.f8311c;
        C3483rk.m30342a(c3561uk.m30840a("/token", this.f8314f), c3536tl, interfaceC3431pk, C3140em.class, c3561uk.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: g */
    public final void mo30417g(C3562ul c3562ul, InterfaceC3431pk<C3588vl> interfaceC3431pk) {
        s.j(c3562ul);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/getAccountInfo", this.f8314f), c3562ul, interfaceC3431pk, C3588vl.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: h */
    public final void mo30416h(C3059bm c3059bm, InterfaceC3431pk<C3086cm> interfaceC3431pk) {
        s.j(c3059bm);
        s.j(interfaceC3431pk);
        if (c3059bm.m31362a() != null) {
            m31281u().m31235c(c3059bm.m31362a().m25383h0());
        }
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/getOobConfirmationCode", this.f8314f), c3059bm, interfaceC3431pk, C3086cm.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: i */
    public final void mo30415i(C3433pm c3433pm, InterfaceC3431pk<C3459qm> interfaceC3431pk) {
        s.j(c3433pm);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/resetPassword", this.f8314f), c3433pm, interfaceC3431pk, C3459qm.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: j */
    public final void mo30414j(C3511sm c3511sm, InterfaceC3431pk<C3563um> interfaceC3431pk) {
        s.j(c3511sm);
        s.j(interfaceC3431pk);
        if (!TextUtils.isEmpty(c3511sm.m30270h())) {
            m31281u().m31235c(c3511sm.m30270h());
        }
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/sendVerificationCode", this.f8314f), c3511sm, interfaceC3431pk, C3563um.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: k */
    public final void mo30413k(C3589vm c3589vm, InterfaceC3431pk<C3615wm> interfaceC3431pk) {
        s.j(c3589vm);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/setAccountInfo", this.f8314f), c3589vm, interfaceC3431pk, C3615wm.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: l */
    public final void mo30412l(String str, InterfaceC3431pk<Void> interfaceC3431pk) {
        s.j(interfaceC3431pk);
        m31281u().m31236b(str);
        ((C3108dh) interfaceC3431pk).f8393a.m31383m();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: m */
    public final void mo30411m(C3641xm c3641xm, InterfaceC3431pk<C3667ym> interfaceC3431pk) {
        s.j(c3641xm);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/signupNewUser", this.f8314f), c3641xm, interfaceC3431pk, C3667ym.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: n */
    public final void mo30410n(C3693zm c3693zm, InterfaceC3431pk<C3033an> interfaceC3431pk) {
        s.j(c3693zm);
        s.j(interfaceC3431pk);
        if (!TextUtils.isEmpty(c3693zm.m29881b())) {
            m31281u().m31235c(c3693zm.m29881b());
        }
        C3534tj c3534tj = this.f8310b;
        C3483rk.m30342a(c3534tj.m30840a("/mfaEnrollment:start", this.f8314f), c3693zm, interfaceC3431pk, C3033an.class, c3534tj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: o */
    public final void mo30409o(C3060bn c3060bn, InterfaceC3431pk<C3087cn> interfaceC3431pk) {
        s.j(c3060bn);
        s.j(interfaceC3431pk);
        if (!TextUtils.isEmpty(c3060bn.m31355b())) {
            m31281u().m31235c(c3060bn.m31355b());
        }
        C3534tj c3534tj = this.f8310b;
        C3483rk.m30342a(c3534tj.m30840a("/mfaSignIn:start", this.f8314f), c3060bn, interfaceC3431pk, C3087cn.class, c3534tj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: p */
    public final void mo30408p(Context context, C3168fn c3168fn, InterfaceC3431pk<C3222hn> interfaceC3431pk) {
        s.j(c3168fn);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/verifyAssertion", this.f8314f), c3168fn, interfaceC3431pk, C3222hn.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: q */
    public final void mo30407q(C3249in c3249in, InterfaceC3431pk<C3276jn> interfaceC3431pk) {
        s.j(c3249in);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/verifyCustomToken", this.f8314f), c3249in, interfaceC3431pk, C3276jn.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: r */
    public final void mo30406r(Context context, C3330ln c3330ln, InterfaceC3431pk<C3356mn> interfaceC3431pk) {
        s.j(c3330ln);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/verifyPassword", this.f8314f), c3330ln, interfaceC3431pk, C3356mn.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: s */
    public final void mo30405s(Context context, C3382nn c3382nn, InterfaceC3431pk<C3408on> interfaceC3431pk) {
        s.j(c3382nn);
        s.j(interfaceC3431pk);
        C3508sj c3508sj = this.f8309a;
        C3483rk.m30342a(c3508sj.m30840a("/verifyPhoneNumber", this.f8314f), c3382nn, interfaceC3431pk, C3408on.class, c3508sj.f8684b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3457qk
    /* renamed from: t */
    public final void mo30404t(C3460qn c3460qn, InterfaceC3431pk<C3486rn> interfaceC3431pk) {
        s.j(c3460qn);
        s.j(interfaceC3431pk);
        C3534tj c3534tj = this.f8310b;
        C3483rk.m30342a(c3534tj.m30840a("/mfaEnrollment:withdraw", this.f8314f), c3460qn, interfaceC3431pk, C3486rn.class, c3534tj.f8684b);
    }
}
