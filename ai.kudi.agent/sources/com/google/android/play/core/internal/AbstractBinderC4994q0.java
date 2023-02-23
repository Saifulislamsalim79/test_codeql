package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.q0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4994q0 extends BinderC4970e0 implements InterfaceC4996r0 {
    public AbstractBinderC4994q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.internal.BinderC4970e0
    /* renamed from: m */
    protected final boolean mo25885m(int i, Parcel parcel) throws RemoteException {
        InterfaceC5000t0 interfaceC5000t0 = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                interfaceC5000t0 = queryLocalInterface instanceof InterfaceC5000t0 ? (InterfaceC5000t0) queryLocalInterface : new C4998s0(readStrongBinder);
            }
            mo25884F(bundle, interfaceC5000t0);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                interfaceC5000t0 = queryLocalInterface2 instanceof InterfaceC5000t0 ? (InterfaceC5000t0) queryLocalInterface2 : new C4998s0(readStrongBinder2);
            }
            mo25883X(interfaceC5000t0);
            return true;
        }
    }
}
