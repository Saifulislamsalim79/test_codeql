package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C3918o0;
import com.google.android.gms.internal.measurement.C3948q0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* loaded from: classes2.dex */
public final class C4185d3 extends C3918o0 implements InterfaceC4219g3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4185d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: C0 */
    public final List<C4203ea> mo27949C0(String str, String str2, boolean z, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29088c(m29321m, z);
        C3948q0.m29087d(m29321m, c4307na);
        Parcel m29320n = m29320n(14, m29321m);
        ArrayList createTypedArrayList = m29320n.createTypedArrayList(C4203ea.CREATOR);
        m29320n.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: G */
    public final String mo27948G(C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        Parcel m29320n = m29320n(11, m29321m);
        String readString = m29320n.readString();
        m29320n.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: L */
    public final void mo27947L(C4169c c4169c) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: M */
    public final List<C4169c> mo27946M(String str, String str2, String str3) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(null);
        m29321m.writeString(str2);
        m29321m.writeString(str3);
        Parcel m29320n = m29320n(17, m29321m);
        ArrayList createTypedArrayList = m29320n.createTypedArrayList(C4169c.CREATOR);
        m29320n.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: Q */
    public final byte[] mo27945Q(C4379u c4379u, String str) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4379u);
        m29321m.writeString(str);
        Parcel m29320n = m29320n(9, m29321m);
        byte[] createByteArray = m29320n.createByteArray();
        m29320n.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: X0 */
    public final List<C4203ea> mo27944X0(C4307na c4307na, boolean z) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        C3948q0.m29088c(m29321m, z);
        Parcel m29320n = m29320n(7, m29321m);
        ArrayList createTypedArrayList = m29320n.createTypedArrayList(C4203ea.CREATOR);
        m29320n.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: a0 */
    public final void mo27943a0(C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(4, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: c1 */
    public final void mo27942c1(C4203ea c4203ea, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4203ea);
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(2, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: d0 */
    public final List<C4169c> mo27941d0(String str, String str2, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29087d(m29321m, c4307na);
        Parcel m29320n = m29320n(16, m29321m);
        ArrayList createTypedArrayList = m29320n.createTypedArrayList(C4169c.CREATOR);
        m29320n.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: d1 */
    public final void mo27940d1(C4379u c4379u, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: i0 */
    public final void mo27939i0(C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(6, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: s */
    public final void mo27933s(Bundle bundle, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(19, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: t0 */
    public final void mo27931t0(C4379u c4379u, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4379u);
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(1, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: v */
    public final void mo27928v(C4169c c4169c, C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4169c);
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(12, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: w0 */
    public final void mo27926w0(C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(20, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: y */
    public final List<C4203ea> mo27925y(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(null);
        m29321m.writeString(str2);
        m29321m.writeString(str3);
        C3948q0.m29088c(m29321m, z);
        Parcel m29320n = m29320n(15, m29321m);
        ArrayList createTypedArrayList = m29320n.createTypedArrayList(C4203ea.CREATOR);
        m29320n.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: y0 */
    public final void mo27924y0(long j, String str, String str2, String str3) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeLong(j);
        m29321m.writeString(str);
        m29321m.writeString(str2);
        m29321m.writeString(str3);
        m29319o(10, m29321m);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4219g3
    /* renamed from: z */
    public final void mo27923z(C4307na c4307na) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, c4307na);
        m29319o(18, m29321m);
    }
}
