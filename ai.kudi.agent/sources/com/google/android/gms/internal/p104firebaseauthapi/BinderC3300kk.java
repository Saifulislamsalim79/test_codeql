package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AbstractC5197c;
import com.google.firebase.auth.C5266p;
import com.google.firebase.auth.internal.C5227i;
import com.google.firebase.auth.internal.InterfaceC5235m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kk */
/* loaded from: classes2.dex */
public final class BinderC3300kk extends AbstractBinderC3352mj {

    /* renamed from: a */
    final /* synthetic */ AbstractC3379nk f8685a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3300kk(AbstractC3379nk abstractC3379nk) {
        this.f8685a = abstractC3379nk;
    }

    /* renamed from: n */
    private final void m30839n(InterfaceC3327lk interfaceC3327lk) {
        this.f8685a.f8767h.execute(new RunnableC3273jk(this, interfaceC3327lk));
    }

    /* renamed from: o */
    private final void m30838o(Status status, AbstractC5197c abstractC5197c, String str, String str2) {
        AbstractC3379nk.m30541g(this.f8685a, status);
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8774o = abstractC5197c;
        abstractC3379nk.f8775p = str;
        abstractC3379nk.f8776q = str2;
        InterfaceC5235m interfaceC5235m = abstractC3379nk.f8765f;
        if (interfaceC5235m != null) {
            interfaceC5235m.mo25258b(status);
        }
        this.f8685a.m30540h(status);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: B0 */
    public final void mo30561B0(C3140em c3140em, C3640xl c3640xl) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 2;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8768i = c3140em;
        abstractC3379nk.f8769j = c3640xl;
        AbstractC3379nk.m30542f(abstractC3379nk);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: C */
    public final void mo30560C(C3274jl c3274jl) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 3;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8770k = c3274jl;
        AbstractC3379nk.m30542f(abstractC3379nk);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: J0 */
    public final void mo30559J0(String str) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 7;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8772m = str;
        AbstractC3379nk.m30542f(abstractC3379nk);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: L0 */
    public final void mo30558L0(C3426pf c3426pf) {
        m30838o(c3426pf.m30465f(), c3426pf.m30464h(), c3426pf.m30463k(), c3426pf.m30462l());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: R */
    public final void mo30557R(String str) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        this.f8685a.f8773n = str;
        m30839n(new C3165fk(this, str));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: e1 */
    public final void mo30556e1(C3504sf c3504sf) {
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8777r = c3504sf;
        abstractC3379nk.m30540h(C5227i.m25323a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: f */
    public final void mo30555f() throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 5;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk.m30542f(this.f8685a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: f0 */
    public final void mo30554f0(C3459qm c3459qm) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 4;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8771l = c3459qm;
        AbstractC3379nk.m30542f(abstractC3379nk);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: g */
    public final void mo30553g() throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 9;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk.m30542f(this.f8685a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: g1 */
    public final void mo30552g1(Status status) throws RemoteException {
        String m32096k = status.m32096k();
        if (m32096k != null) {
            if (m32096k.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (m32096k.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (m32096k.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (m32096k.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (m32096k.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (m32096k.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (m32096k.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (m32096k.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (m32096k.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (m32096k.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        AbstractC3379nk abstractC3379nk = this.f8685a;
        if (abstractC3379nk.f8760a == 8) {
            abstractC3379nk.f8778s = true;
            m30839n(new C3246ik(this, status));
            return;
        }
        AbstractC3379nk.m30541g(abstractC3379nk, status);
        this.f8685a.m30540h(status);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: h0 */
    public final void mo30551h0(String str) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8773n = str;
        abstractC3379nk.f8778s = true;
        m30839n(new C3219hk(this, str));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: i */
    public final void mo30550i() throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 6;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk.m30542f(this.f8685a);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: o1 */
    public final void mo30549o1(C3140em c3140em) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 1;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        s.n(z, sb.toString());
        AbstractC3379nk abstractC3379nk = this.f8685a;
        abstractC3379nk.f8768i = c3140em;
        AbstractC3379nk.m30542f(abstractC3379nk);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: w */
    public final void mo30548w(Status status, C5266p c5266p) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 2;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        m30838o(status, c5266p, null, null);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: z0 */
    public final void mo30547z0(C5266p c5266p) throws RemoteException {
        int i = this.f8685a.f8760a;
        boolean z = i == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        s.n(z, sb.toString());
        this.f8685a.f8778s = true;
        m30839n(new C3192gk(this, c5266p));
    }
}
