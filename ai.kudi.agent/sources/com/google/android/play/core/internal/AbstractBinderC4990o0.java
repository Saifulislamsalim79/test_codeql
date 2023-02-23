package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.android.play.core.internal.o0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4990o0 extends BinderC4970e0 implements InterfaceC4992p0 {
    public AbstractBinderC4990o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.internal.BinderC4970e0
    /* renamed from: m */
    protected final boolean mo25885m(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo25899R0(parcel.readInt(), (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25891j(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25901E0(readInt2);
                return true;
            case 5:
                mo25894a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25892b((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo25895a((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25897T((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Bundle bundle5 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25898S0((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo25890k((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR), (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                mo25889l0((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR), (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo25900F0((Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR), (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25893b();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C4972f0.m25945a(parcel, Bundle.CREATOR);
                mo25896a();
                return true;
        }
    }
}
