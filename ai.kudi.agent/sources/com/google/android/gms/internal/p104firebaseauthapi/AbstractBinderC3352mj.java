package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C5266p;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3352mj extends BinderC3387o2 implements InterfaceC3378nj {
    public AbstractBinderC3352mj() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.BinderC3387o2
    /* renamed from: m */
    protected final boolean mo30461m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo30549o1((C3140em) C3414p3.m30478a(parcel, C3140em.CREATOR));
                return true;
            case 2:
                mo30561B0((C3140em) C3414p3.m30478a(parcel, C3140em.CREATOR), (C3640xl) C3414p3.m30478a(parcel, C3640xl.CREATOR));
                return true;
            case 3:
                mo30560C((C3274jl) C3414p3.m30478a(parcel, C3274jl.CREATOR));
                return true;
            case 4:
                mo30554f0((C3459qm) C3414p3.m30478a(parcel, C3459qm.CREATOR));
                return true;
            case 5:
                mo30552g1((Status) C3414p3.m30478a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo30555f();
                return true;
            case 7:
                mo30550i();
                return true;
            case 8:
                mo30559J0(parcel.readString());
                return true;
            case 9:
                mo30557R(parcel.readString());
                return true;
            case 10:
                mo30547z0((C5266p) C3414p3.m30478a(parcel, C5266p.CREATOR));
                return true;
            case 11:
                mo30551h0(parcel.readString());
                return true;
            case 12:
                mo30548w((Status) C3414p3.m30478a(parcel, Status.CREATOR), (C5266p) C3414p3.m30478a(parcel, C5266p.CREATOR));
                return true;
            case 13:
                mo30553g();
                return true;
            case 14:
                mo30558L0((C3426pf) C3414p3.m30478a(parcel, C3426pf.CREATOR));
                return true;
            case 15:
                mo30556e1((C3504sf) C3414p3.m30478a(parcel, C3504sf.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
