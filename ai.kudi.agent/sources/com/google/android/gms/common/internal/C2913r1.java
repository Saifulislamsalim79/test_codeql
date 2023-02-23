package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.r1 */
/* loaded from: classes2.dex */
public final class C2913r1 implements Parcelable.Creator<C2877h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m31694a(C2877h c2877h, Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, c2877h.f7998c);
        C2917b.m31656j(parcel, 2, c2877h.f7999d);
        C2917b.m31656j(parcel, 3, c2877h.f8000e);
        C2917b.m31651o(parcel, 4, c2877h.f8001f, false);
        C2917b.m31657i(parcel, 5, c2877h.f8002w, false);
        C2917b.m31649q(parcel, 6, c2877h.f8003x, i, false);
        C2917b.m31661e(parcel, 7, c2877h.f8004y, false);
        C2917b.m31652n(parcel, 8, c2877h.f8005z, i, false);
        C2917b.m31649q(parcel, 10, c2877h.f7992A, i, false);
        C2917b.m31649q(parcel, 11, c2877h.f7993B, i, false);
        C2917b.m31663c(parcel, 12, c2877h.f7994C);
        C2917b.m31656j(parcel, 13, c2877h.f7995D);
        C2917b.m31663c(parcel, 14, c2877h.f7996E);
        C2917b.m31651o(parcel, 15, c2877h.zza(), false);
        C2917b.m31664b(parcel, m31665a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2877h createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C2830d[] c2830dArr = null;
        C2830d[] c2830dArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            switch (SafeParcelReader.m31681i(m31675o)) {
                case 1:
                    i = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 2:
                    i2 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 3:
                    i3 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 4:
                    str = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m31674p(parcel, m31675o);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m31684f(parcel, m31675o, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m31689a(parcel, m31675o);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m31687c(parcel, m31675o, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.m31669u(parcel, m31675o);
                    break;
                case 10:
                    c2830dArr = (C2830d[]) SafeParcelReader.m31684f(parcel, m31675o, C2830d.CREATOR);
                    break;
                case 11:
                    c2830dArr2 = (C2830d[]) SafeParcelReader.m31684f(parcel, m31675o, C2830d.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 13:
                    i4 = SafeParcelReader.m31673q(parcel, m31675o);
                    break;
                case 14:
                    z2 = SafeParcelReader.m31680j(parcel, m31675o);
                    break;
                case 15:
                    str2 = SafeParcelReader.m31686d(parcel, m31675o);
                    break;
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2877h(i, i2, i3, str, iBinder, scopeArr, bundle, account, c2830dArr, c2830dArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2877h[] newArray(int i) {
        return new C2877h[i];
    }
}
