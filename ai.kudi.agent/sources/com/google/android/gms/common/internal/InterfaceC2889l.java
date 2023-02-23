package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes2.dex */
public interface InterfaceC2889l extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.l$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC2890a extends BinderC8424b implements InterfaceC2889l {
        /* renamed from: n */
        public static InterfaceC2889l m31708n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC2889l ? (InterfaceC2889l) queryLocalInterface : new C2849a2(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
