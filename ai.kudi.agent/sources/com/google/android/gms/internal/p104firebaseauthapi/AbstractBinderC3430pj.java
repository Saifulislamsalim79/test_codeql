package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3430pj extends BinderC3387o2 implements InterfaceC3482rj {
    public AbstractBinderC3430pj() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.BinderC3387o2
    /* renamed from: m */
    protected final boolean mo30461m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3378nj interfaceC3378nj = null;
        switch (i) {
            case 101:
                C3554ud c3554ud = (C3554ud) C3414p3.m30478a(parcel, C3554ud.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder);
                    }
                }
                mo30373E(c3554ud, interfaceC3378nj);
                break;
            case 102:
                C3529te c3529te = (C3529te) C3414p3.m30478a(parcel, C3529te.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface2 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface2;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder2);
                    }
                }
                mo30347t(c3529te, interfaceC3378nj);
                break;
            case 103:
                C3477re c3477re = (C3477re) C3414p3.m30478a(parcel, C3477re.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface3 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface3;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder3);
                    }
                }
                mo30368N0(c3477re, interfaceC3378nj);
                break;
            case 104:
                C3322lf c3322lf = (C3322lf) C3414p3.m30478a(parcel, C3322lf.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface4 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface4;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder4);
                    }
                }
                mo30367P0(c3322lf, interfaceC3378nj);
                break;
            case 105:
                C3104dd c3104dd = (C3104dd) C3414p3.m30478a(parcel, C3104dd.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface5 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface5;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder5);
                    }
                }
                mo30356f1(c3104dd, interfaceC3378nj);
                break;
            case 106:
                C3158fd c3158fd = (C3158fd) C3414p3.m30478a(parcel, C3158fd.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface6 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface6;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder6);
                    }
                }
                mo30372H(c3158fd, interfaceC3378nj);
                break;
            case 107:
                C3320ld c3320ld = (C3320ld) C3414p3.m30478a(parcel, C3320ld.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface7 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface7;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder7);
                    }
                }
                mo30354j0(c3320ld, interfaceC3378nj);
                break;
            case 108:
                C3581ve c3581ve = (C3581ve) C3414p3.m30478a(parcel, C3581ve.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface8 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface8;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder8);
                    }
                }
                mo30357e0(c3581ve, interfaceC3378nj);
                break;
            case 109:
                C3606wd c3606wd = (C3606wd) C3414p3.m30478a(parcel, C3606wd.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface9 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface9;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder9);
                    }
                }
                mo30345u0(c3606wd, interfaceC3378nj);
                break;
            case 110:
            case 118:
            case 125:
            default:
                return false;
            case 111:
                C3658yd c3658yd = (C3658yd) C3414p3.m30478a(parcel, C3658yd.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface10 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface10;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder10);
                    }
                }
                mo30355i1(c3658yd, interfaceC3378nj);
                break;
            case 112:
                C3024ae c3024ae = (C3024ae) C3414p3.m30478a(parcel, C3024ae.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface11 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface11;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder11);
                    }
                }
                mo30361Z(c3024ae, interfaceC3378nj);
                break;
            case 113:
                C3214hf c3214hf = (C3214hf) C3414p3.m30478a(parcel, C3214hf.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface12 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface12;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder12);
                    }
                }
                mo30352n1(c3214hf, interfaceC3378nj);
                break;
            case 114:
                C3268jf c3268jf = (C3268jf) C3414p3.m30478a(parcel, C3268jf.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface13 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface13;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder13);
                    }
                }
                mo30359b0(c3268jf, interfaceC3378nj);
                break;
            case 115:
                C3132ee c3132ee = (C3132ee) C3414p3.m30478a(parcel, C3132ee.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface14 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface14;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder14);
                    }
                }
                mo30346u(c3132ee, interfaceC3378nj);
                break;
            case 116:
                C3399oe c3399oe = (C3399oe) C3414p3.m30478a(parcel, C3399oe.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface15 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface15;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder15);
                    }
                }
                mo30350p(c3399oe, interfaceC3378nj);
                break;
            case 117:
                C3372nd c3372nd = (C3372nd) C3414p3.m30478a(parcel, C3372nd.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface16 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface16;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder16);
                    }
                }
                mo30364V0(c3372nd, interfaceC3378nj);
                break;
            case 119:
                C3212hd c3212hd = (C3212hd) C3414p3.m30478a(parcel, C3212hd.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface17 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface17;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder17);
                    }
                }
                mo30371I0(c3212hd, interfaceC3378nj);
                break;
            case 120:
                C3050bd c3050bd = (C3050bd) C3414p3.m30478a(parcel, C3050bd.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface18 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface18;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder18);
                    }
                }
                mo30348q0(c3050bd, interfaceC3378nj);
                break;
            case 121:
                C3266jd c3266jd = (C3266jd) C3414p3.m30478a(parcel, C3266jd.CREATOR);
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface19 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface19;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder19);
                    }
                }
                mo30349q(c3266jd, interfaceC3378nj);
                break;
            case 122:
                C3294ke c3294ke = (C3294ke) C3414p3.m30478a(parcel, C3294ke.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface20 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface20;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder20);
                    }
                }
                mo30366S(c3294ke, interfaceC3378nj);
                break;
            case 123:
                C3685ze c3685ze = (C3685ze) C3414p3.m30478a(parcel, C3685ze.CREATOR);
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface21 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface21;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder21);
                    }
                }
                mo30370K(c3685ze, interfaceC3378nj);
                break;
            case 124:
                C3078ce c3078ce = (C3078ce) C3414p3.m30478a(parcel, C3078ce.CREATOR);
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface22 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface22;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder22);
                    }
                }
                mo30365U0(c3078ce, interfaceC3378nj);
                break;
            case 126:
                C3186ge c3186ge = (C3186ge) C3414p3.m30478a(parcel, C3186ge.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface23 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface23;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder23);
                    }
                }
                mo30351o0(c3186ge, interfaceC3378nj);
                break;
            case 127:
                C3347me c3347me = (C3347me) C3414p3.m30478a(parcel, C3347me.CREATOR);
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface24 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface24;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder24);
                    }
                }
                mo30369K0(c3347me, interfaceC3378nj);
                break;
            case 128:
                C3240ie c3240ie = (C3240ie) C3414p3.m30478a(parcel, C3240ie.CREATOR);
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface25 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface25;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder25);
                    }
                }
                mo30353k1(c3240ie, interfaceC3378nj);
                break;
            case 129:
                C3633xe c3633xe = (C3633xe) C3414p3.m30478a(parcel, C3633xe.CREATOR);
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface26 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface26;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder26);
                    }
                }
                mo30362Y0(c3633xe, interfaceC3378nj);
                break;
            case 130:
                C3052bf c3052bf = (C3052bf) C3414p3.m30478a(parcel, C3052bf.CREATOR);
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface27 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface27;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder27);
                    }
                }
                mo30358b1(c3052bf, interfaceC3378nj);
                break;
            case 131:
                C3160ff c3160ff = (C3160ff) C3414p3.m30478a(parcel, C3160ff.CREATOR);
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface28 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface28;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder28);
                    }
                }
                mo30344v0(c3160ff, interfaceC3378nj);
                break;
            case 132:
                C3450qd c3450qd = (C3450qd) C3414p3.m30478a(parcel, C3450qd.CREATOR);
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface29 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface29;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder29);
                    }
                }
                mo30363W(c3450qd, interfaceC3378nj);
                break;
            case 133:
                C3106df c3106df = (C3106df) C3414p3.m30478a(parcel, C3106df.CREATOR);
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface30 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface30;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder30);
                    }
                }
                mo30374A(c3106df, interfaceC3378nj);
                break;
            case 134:
                C3502sd c3502sd = (C3502sd) C3414p3.m30478a(parcel, C3502sd.CREATOR);
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface31 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface31;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder31);
                    }
                }
                mo30360Z0(c3502sd, interfaceC3378nj);
                break;
            case 135:
                C3374nf c3374nf = (C3374nf) C3414p3.m30478a(parcel, C3374nf.CREATOR);
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
                    if (queryLocalInterface32 instanceof InterfaceC3378nj) {
                        interfaceC3378nj = (InterfaceC3378nj) queryLocalInterface32;
                    } else {
                        interfaceC3378nj = new C3326lj(readStrongBinder32);
                    }
                }
                mo30343x(c3374nf, interfaceC3378nj);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
