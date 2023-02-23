package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* renamed from: com.google.android.play.core.internal.l0 */
/* loaded from: classes2.dex */
public final class C4984l0 extends C4968d0 implements InterfaceC4988n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4984l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: H0 */
    public final void mo25910H0(String str, Bundle bundle, Bundle bundle2, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25943c(m25947m, bundle2);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(9, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: T0 */
    public final void mo25909T0(String str, Bundle bundle, Bundle bundle2, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25943c(m25947m, bundle2);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(11, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: V */
    public final void mo25908V(String str, Bundle bundle, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(10, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: a1 */
    public final void mo25907a1(String str, List<Bundle> list, Bundle bundle, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        m25947m.writeTypedList(list);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(14, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: c0 */
    public final void mo25906c0(String str, Bundle bundle, Bundle bundle2, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25943c(m25947m, bundle2);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(6, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: k0 */
    public final void mo25905k0(String str, Bundle bundle, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(5, m25947m);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4988n0
    /* renamed from: m0 */
    public final void mo25904m0(String str, Bundle bundle, Bundle bundle2, InterfaceC4992p0 interfaceC4992p0) throws RemoteException {
        Parcel m25947m = m25947m();
        m25947m.writeString(str);
        C4972f0.m25943c(m25947m, bundle);
        C4972f0.m25943c(m25947m, bundle2);
        C4972f0.m25944b(m25947m, interfaceC4992p0);
        m25946n(7, m25947m);
    }
}
