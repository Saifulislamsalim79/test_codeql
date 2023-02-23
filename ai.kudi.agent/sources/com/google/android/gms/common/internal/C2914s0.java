package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.s0 */
/* loaded from: classes2.dex */
public final class C2914s0 extends AbstractC2916a {
    public static final Parcelable.Creator<C2914s0> CREATOR = new C2921t0();

    /* renamed from: c */
    final int f8058c;

    /* renamed from: d */
    private final Account f8059d;

    /* renamed from: e */
    private final int f8060e;

    /* renamed from: f */
    private final GoogleSignInAccount f8061f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2914s0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f8058c = i;
        this.f8059d = account;
        this.f8060e = i2;
        this.f8061f = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f8058c);
        C2917b.m31652n(parcel, 2, this.f8059d, i, false);
        C2917b.m31656j(parcel, 3, this.f8060e);
        C2917b.m31652n(parcel, 4, this.f8061f, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public C2914s0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
