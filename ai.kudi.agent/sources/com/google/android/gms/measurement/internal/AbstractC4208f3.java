package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C3948q0;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.f3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4208f3 extends com.google.android.gms.internal.measurement.p0 implements InterfaceC4219g3 {
    public AbstractC4208f3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: m */
    protected final boolean m28269m(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo27931t0((C4379u) C3948q0.m29090a(parcel, C4379u.CREATOR), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo27942c1((C4203ea) C3948q0.m29090a(parcel, C4203ea.CREATOR), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo27943a0((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo27940d1((C4379u) C3948q0.m29090a(parcel, C4379u.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo27939i0((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<C4203ea> mo27944X0 = mo27944X0((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR), C3948q0.m29085f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo27944X0);
                return true;
            case 9:
                byte[] mo27945Q = mo27945Q((C4379u) C3948q0.m29090a(parcel, C4379u.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo27945Q);
                return true;
            case 10:
                mo27924y0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String mo27948G = mo27948G((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo27948G);
                return true;
            case 12:
                mo27928v((C4169c) C3948q0.m29090a(parcel, C4169c.CREATOR), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo27947L((C4169c) C3948q0.m29090a(parcel, C4169c.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<C4203ea> mo27949C0 = mo27949C0(parcel.readString(), parcel.readString(), C3948q0.m29085f(parcel), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo27949C0);
                return true;
            case 15:
                List<C4203ea> mo27925y = mo27925y(parcel.readString(), parcel.readString(), parcel.readString(), C3948q0.m29085f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo27925y);
                return true;
            case 16:
                List<C4169c> mo27941d0 = mo27941d0(parcel.readString(), parcel.readString(), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo27941d0);
                return true;
            case 17:
                List<C4169c> mo27946M = mo27946M(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(mo27946M);
                return true;
            case 18:
                mo27923z((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo27933s((Bundle) C3948q0.m29090a(parcel, Bundle.CREATOR), (C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo27926w0((C4307na) C3948q0.m29090a(parcel, C4307na.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
