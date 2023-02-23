package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p272h.p286c.p287a.p300b.p307d.p312e.C8423a;
import p272h.p286c.p287a.p300b.p307d.p312e.C8425c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.a2 */
/* loaded from: classes2.dex */
public final class C2849a2 extends C8423a implements InterfaceC2889l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2849a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2889l
    public final Account zzb() throws RemoteException {
        Parcel m16115m = m16115m(2, m16113o());
        Account account = (Account) C8425c.m16111a(m16115m, Account.CREATOR);
        m16115m.recycle();
        return account;
    }
}
