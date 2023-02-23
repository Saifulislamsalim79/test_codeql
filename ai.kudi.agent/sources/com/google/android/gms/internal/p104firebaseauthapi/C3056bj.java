package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bj */
/* loaded from: classes2.dex */
public class C3056bj {

    /* renamed from: a */
    private final InterfaceC3378nj f8247a;

    /* renamed from: b */
    private final C2946a f8248b;

    public C3056bj(C3056bj c3056bj) {
        this(c3056bj.f8247a, c3056bj.f8248b);
    }

    /* renamed from: a */
    public final void m31393a(String str) {
        try {
            this.f8247a.mo30551h0(str);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo29941b(String str) {
        try {
            this.f8247a.mo30557R(str);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public final void m31392c(C3274jl c3274jl) {
        try {
            this.f8247a.mo30560C(c3274jl);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    /* renamed from: d */
    public final void m31391d() {
        try {
            this.f8247a.mo30555f();
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    /* renamed from: e */
    public final void m31390e(C3426pf c3426pf) {
        try {
            this.f8247a.mo30558L0(c3426pf);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    /* renamed from: f */
    public final void m31389f(C3504sf c3504sf) {
        try {
            this.f8247a.mo30556e1(c3504sf);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    /* renamed from: g */
    public final void m31388g(Status status, C5266p c5266p) {
        try {
            this.f8247a.mo30548w(status, c5266p);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: h */
    public void mo29940h(Status status) {
        try {
            this.f8247a.mo30552g1(status);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: i */
    public final void m31387i(C3140em c3140em, C3640xl c3640xl) {
        try {
            this.f8247a.mo30561B0(c3140em, c3640xl);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    /* renamed from: j */
    public final void m31386j(C3459qm c3459qm) {
        try {
            this.f8247a.mo30554f0(c3459qm);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    /* renamed from: k */
    public final void m31385k() {
        try {
            this.f8247a.mo30550i();
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    /* renamed from: l */
    public final void m31384l(String str) {
        try {
            this.f8247a.mo30559J0(str);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    /* renamed from: m */
    public final void m31383m() {
        try {
            this.f8247a.mo30553g();
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    /* renamed from: n */
    public final void m31382n(C3140em c3140em) {
        try {
            this.f8247a.mo30549o1(c3140em);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    /* renamed from: o */
    public final void m31381o(C5266p c5266p) {
        try {
            this.f8247a.mo30547z0(c5266p);
        } catch (RemoteException e) {
            this.f8248b.m31584b("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public C3056bj(InterfaceC3378nj interfaceC3378nj, C2946a c2946a) {
        s.j(interfaceC3378nj);
        this.f8247a = interfaceC3378nj;
        s.j(c2946a);
        this.f8248b = c2946a;
    }
}
