package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fj */
/* loaded from: classes2.dex */
public final class BinderC3164fj extends AbstractBinderC3430pj {

    /* renamed from: c */
    private static final C2946a f8472c = new C2946a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    private final C3350mh f8473a;

    /* renamed from: b */
    private final C3058bl f8474b;

    public BinderC3164fj(Context context, String str) {
        s.j(context);
        C3057bk m31380a = C3057bk.m31380a();
        s.f(str);
        this.f8473a = new C3350mh(new C3084ck(context, str, m31380a, null, null, null));
        this.f8474b = new C3058bl(context);
    }

    /* renamed from: n */
    private static boolean m31141n(long j, boolean z) {
        if (j <= 0 || !z) {
            f8472c.m31578h("App hash will not be appended to the request.", new Object[0]);
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: A */
    public final void mo30374A(C3106df c3106df, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3106df);
        s.j(interfaceC3378nj);
        String m25240l = c3106df.m31245h().m25240l();
        C3056bj c3056bj = new C3056bj(interfaceC3378nj, f8472c);
        if (this.f8474b.m31366l(m25240l)) {
            if (c3106df.m31248E()) {
                this.f8474b.m31368j(m25240l);
            } else {
                this.f8474b.m31369i(c3056bj, m25240l);
                return;
            }
        }
        long m31246f = c3106df.m31246f();
        boolean m31247d0 = c3106df.m31247d0();
        C3060bn m31356a = C3060bn.m31356a(c3106df.m31243l(), c3106df.m31245h().m25239s(), c3106df.m31245h().m25240l(), c3106df.m31244k(), c3106df.m31242s(), c3106df.m31241u());
        if (m31141n(m31246f, m31247d0)) {
            m31356a.m31354c(new C3193gl(this.f8474b.m31375c()));
        }
        this.f8474b.m31367k(m25240l, c3056bj, m31246f, m31247d0);
        this.f8473a.m30678g(m31356a, new C3665yk(this.f8474b, c3056bj, m25240l));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: E */
    public final void mo30373E(C3554ud c3554ud, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3554ud);
        s.j(interfaceC3378nj);
        s.f(c3554ud.zza());
        this.f8473a.m30695F(c3554ud.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: H */
    public final void mo30372H(C3158fd c3158fd, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3158fd);
        s.f(c3158fd.zza());
        s.f(c3158fd.m31144f());
        s.j(interfaceC3378nj);
        this.f8473a.m30660y(c3158fd.zza(), c3158fd.m31144f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: I0 */
    public final void mo30371I0(C3212hd c3212hd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3212hd);
        s.f(c3212hd.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30659z(c3212hd.zza(), c3212hd.m31050f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: K */
    public final void mo30370K(C3685ze c3685ze, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(interfaceC3378nj);
        s.j(c3685ze);
        C5266p m29887f = c3685ze.m29887f();
        s.j(m29887f);
        this.f8473a.m30680e(null, C3535tk.m30212a(m29887f), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: K0 */
    public final void mo30369K0(C3347me c3347me, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3347me);
        s.j(interfaceC3378nj);
        this.f8473a.m30686O(c3347me.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: N0 */
    public final void mo30368N0(C3477re c3477re, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3477re);
        s.j(c3477re.m30378f());
        s.j(interfaceC3378nj);
        this.f8473a.m30684a(null, c3477re.m30378f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: P0 */
    public final void mo30367P0(C3322lf c3322lf, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3322lf);
        s.f(c3322lf.m30768h());
        s.j(c3322lf.m30769f());
        s.j(interfaceC3378nj);
        this.f8473a.m30674k(c3322lf.m30768h(), c3322lf.m30769f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: S */
    public final void mo30366S(C3294ke c3294ke, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(interfaceC3378nj);
        s.j(c3294ke);
        C3511sm m30841f = c3294ke.m30841f();
        s.j(m30841f);
        C3511sm c3511sm = m30841f;
        String m30269k = c3511sm.m30269k();
        C3056bj c3056bj = new C3056bj(interfaceC3378nj, f8472c);
        if (this.f8474b.m31366l(m30269k)) {
            if (c3511sm.m30267s()) {
                this.f8474b.m31368j(m30269k);
            } else {
                this.f8474b.m31369i(c3056bj, m30269k);
                return;
            }
        }
        long m30271f = c3511sm.m30271f();
        boolean m30266u = c3511sm.m30266u();
        if (m31141n(m30271f, m30266u)) {
            c3511sm.m30268l(new C3193gl(this.f8474b.m31375c()));
        }
        this.f8474b.m31367k(m30269k, c3056bj, m30271f, m30266u);
        this.f8473a.m30687N(c3511sm, new C3665yk(this.f8474b, c3056bj, m30269k));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: U0 */
    public final void mo30365U0(C3078ce c3078ce, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(interfaceC3378nj);
        s.j(c3078ce);
        C5266p m31284f = c3078ce.m31284f();
        s.j(m31284f);
        String m31283h = c3078ce.m31283h();
        s.f(m31283h);
        this.f8473a.m30691J(null, m31283h, C3535tk.m30212a(m31284f), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: V0 */
    public final void mo30364V0(C3372nd c3372nd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3372nd);
        s.f(c3372nd.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30698C(c3372nd.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: W */
    public final void mo30363W(C3450qd c3450qd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3450qd);
        s.j(interfaceC3378nj);
        this.f8473a.m30697D(null, C3406ol.m30496a(c3450qd.m30427h(), c3450qd.m30428f().m25255e0(), c3450qd.m30428f().m25252k(), c3450qd.m30426k()), c3450qd.m30427h(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: Y0 */
    public final void mo30362Y0(C3633xe c3633xe, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3633xe);
        s.j(c3633xe.m30023f());
        s.j(interfaceC3378nj);
        this.f8473a.m30681d(c3633xe.m30023f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: Z */
    public final void mo30361Z(C3024ae c3024ae, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3024ae);
        s.f(c3024ae.m31418h());
        s.j(c3024ae.m31419f());
        s.j(interfaceC3378nj);
        this.f8473a.m30692I(c3024ae.m31418h(), c3024ae.m31419f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: Z0 */
    public final void mo30360Z0(C3502sd c3502sd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3502sd);
        s.j(interfaceC3378nj);
        this.f8473a.m30696E(null, C3458ql.m30403a(c3502sd.m30278h(), c3502sd.m30279f().m25255e0(), c3502sd.m30279f().m25252k()), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: b0 */
    public final void mo30359b0(C3268jf c3268jf, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3268jf);
        s.f(c3268jf.m30897f());
        s.f(c3268jf.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30675j(c3268jf.m30897f(), c3268jf.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: b1 */
    public final void mo30358b1(C3052bf c3052bf, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3052bf);
        s.j(interfaceC3378nj);
        String m31396l = c3052bf.m31396l();
        C3056bj c3056bj = new C3056bj(interfaceC3378nj, f8472c);
        if (this.f8474b.m31366l(m31396l)) {
            if (c3052bf.m31401E()) {
                this.f8474b.m31368j(m31396l);
            } else {
                this.f8474b.m31369i(c3056bj, m31396l);
                return;
            }
        }
        long m31399f = c3052bf.m31399f();
        boolean m31400d0 = c3052bf.m31400d0();
        C3693zm m29882a = C3693zm.m29882a(c3052bf.m31398h(), c3052bf.m31396l(), c3052bf.m31397k(), c3052bf.m31395s(), c3052bf.m31394u());
        if (m31141n(m31399f, m31400d0)) {
            m29882a.m29880c(new C3193gl(this.f8474b.m31375c()));
        }
        this.f8474b.m31367k(m31396l, c3056bj, m31399f, m31400d0);
        this.f8473a.m30679f(m29882a, new C3665yk(this.f8474b, c3056bj, m31396l));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: e0 */
    public final void mo30357e0(C3581ve c3581ve, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3581ve);
        s.f(c3581ve.zza());
        s.f(c3581ve.m30125f());
        s.j(interfaceC3378nj);
        this.f8473a.m30682c(null, c3581ve.zza(), c3581ve.m30125f(), c3581ve.m30124h(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: f1 */
    public final void mo30356f1(C3104dd c3104dd, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3104dd);
        s.f(c3104dd.zza());
        s.f(c3104dd.m31249f());
        s.j(interfaceC3378nj);
        this.f8473a.m30661x(c3104dd.zza(), c3104dd.m31249f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: i1 */
    public final void mo30355i1(C3658yd c3658yd, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3658yd);
        s.f(c3658yd.m29959f());
        s.f(c3658yd.m29958h());
        s.f(c3658yd.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30693H(c3658yd.m29959f(), c3658yd.m29958h(), c3658yd.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: j0 */
    public final void mo30354j0(C3320ld c3320ld, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3320ld);
        s.f(c3320ld.zza());
        s.f(c3320ld.m30771f());
        s.j(interfaceC3378nj);
        this.f8473a.m30699B(c3320ld.zza(), c3320ld.m30771f(), c3320ld.m30770h(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: k1 */
    public final void mo30353k1(C3240ie c3240ie, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3240ie);
        s.f(c3240ie.m30963h());
        s.j(interfaceC3378nj);
        this.f8473a.m30688M(c3240ie.m30963h(), c3240ie.m30964f(), c3240ie.m30962k(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: n1 */
    public final void mo30352n1(C3214hf c3214hf, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3214hf);
        s.f(c3214hf.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30676i(c3214hf.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: o0 */
    public final void mo30351o0(C3186ge c3186ge, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3186ge);
        s.f(c3186ge.m31097h());
        s.j(interfaceC3378nj);
        this.f8473a.m30689L(c3186ge.m31097h(), c3186ge.m31098f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: p */
    public final void mo30350p(C3399oe c3399oe, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3399oe);
        s.j(interfaceC3378nj);
        this.f8473a.m30685P(c3399oe.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: q */
    public final void mo30349q(C3266jd c3266jd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3266jd);
        s.f(c3266jd.zza());
        s.f(c3266jd.m30899f());
        s.j(interfaceC3378nj);
        this.f8473a.m30700A(c3266jd.zza(), c3266jd.m30899f(), c3266jd.m30898h(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: q0 */
    public final void mo30348q0(C3050bd c3050bd, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3050bd);
        s.f(c3050bd.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30662w(c3050bd.zza(), c3050bd.m31402f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: t */
    public final void mo30347t(C3529te c3529te, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3529te);
        s.f(c3529te.m30213f());
        s.j(interfaceC3378nj);
        this.f8473a.m30683b(new C3249in(c3529te.m30213f(), c3529te.zza()), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: u */
    public final void mo30346u(C3132ee c3132ee, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3132ee);
        s.f(c3132ee.zza());
        s.j(interfaceC3378nj);
        this.f8473a.m30690K(c3132ee.zza(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: u0 */
    public final void mo30345u0(C3606wd c3606wd, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3606wd);
        s.f(c3606wd.zza());
        this.f8473a.m30694G(c3606wd.zza(), c3606wd.m30083f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: v0 */
    public final void mo30344v0(C3160ff c3160ff, InterfaceC3378nj interfaceC3378nj) throws RemoteException {
        s.j(c3160ff);
        s.j(interfaceC3378nj);
        this.f8473a.m30677h(c3160ff.zza(), c3160ff.m31143f(), new C3056bj(interfaceC3378nj, f8472c));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3482rj
    /* renamed from: x */
    public final void mo30343x(C3374nf c3374nf, InterfaceC3378nj interfaceC3378nj) {
        s.j(c3374nf);
        this.f8473a.m30673l(C3059bm.m31361b(c3374nf.m30564f(), c3374nf.m30563h(), c3374nf.m30562k()), new C3056bj(interfaceC3378nj, f8472c));
    }
}
