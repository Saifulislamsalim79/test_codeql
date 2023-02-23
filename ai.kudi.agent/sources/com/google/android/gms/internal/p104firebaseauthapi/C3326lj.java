package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lj */
/* loaded from: classes2.dex */
public final class C3326lj extends C3009a implements InterfaceC3378nj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3326lj(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: B0 */
    public final void mo30561B0(C3140em c3140em, C3640xl c3640xl) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3140em);
        C3414p3.m30477b(m31465o, c3640xl);
        m31466n(2, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: C */
    public final void mo30560C(C3274jl c3274jl) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3274jl);
        m31466n(3, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: J0 */
    public final void mo30559J0(String str) throws RemoteException {
        Parcel m31465o = m31465o();
        m31465o.writeString(str);
        m31466n(8, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: L0 */
    public final void mo30558L0(C3426pf c3426pf) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3426pf);
        m31466n(14, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: R */
    public final void mo30557R(String str) throws RemoteException {
        Parcel m31465o = m31465o();
        m31465o.writeString(str);
        m31466n(9, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: e1 */
    public final void mo30556e1(C3504sf c3504sf) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3504sf);
        m31466n(15, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: f */
    public final void mo30555f() throws RemoteException {
        m31466n(6, m31465o());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: f0 */
    public final void mo30554f0(C3459qm c3459qm) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3459qm);
        m31466n(4, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: g */
    public final void mo30553g() throws RemoteException {
        m31466n(13, m31465o());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: g1 */
    public final void mo30552g1(Status status) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, status);
        m31466n(5, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: h0 */
    public final void mo30551h0(String str) throws RemoteException {
        Parcel m31465o = m31465o();
        m31465o.writeString(str);
        m31466n(11, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: i */
    public final void mo30550i() throws RemoteException {
        m31466n(7, m31465o());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: o1 */
    public final void mo30549o1(C3140em c3140em) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c3140em);
        m31466n(1, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: w */
    public final void mo30548w(Status status, C5266p c5266p) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, status);
        C3414p3.m30477b(m31465o, c5266p);
        m31466n(12, m31465o);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3378nj
    /* renamed from: z0 */
    public final void mo30547z0(C5266p c5266p) throws RemoteException {
        Parcel m31465o = m31465o();
        C3414p3.m30477b(m31465o, c5266p);
        m31466n(10, m31465o);
    }
}
