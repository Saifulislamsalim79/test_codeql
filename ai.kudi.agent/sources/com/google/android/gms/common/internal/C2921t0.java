package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.t0 */
/* loaded from: classes2.dex */
public final class C2921t0 implements Parcelable.Creator<C2914s0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2914s0 createFromParcel(Parcel parcel) {
        int m31668v = SafeParcelReader.m31668v(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m31668v) {
            int m31675o = SafeParcelReader.m31675o(parcel);
            int m31681i = SafeParcelReader.m31681i(m31675o);
            if (m31681i == 1) {
                i = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i == 2) {
                account = (Account) SafeParcelReader.m31687c(parcel, m31675o, Account.CREATOR);
            } else if (m31681i == 3) {
                i2 = SafeParcelReader.m31673q(parcel, m31675o);
            } else if (m31681i != 4) {
                SafeParcelReader.m31669u(parcel, m31675o);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m31687c(parcel, m31675o, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m31682h(parcel, m31668v);
        return new C2914s0(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2914s0[] newArray(int i) {
        return new C2914s0[i];
    }
}
