package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2862c2;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.h0 */
/* loaded from: classes2.dex */
public final class C2839h0 extends AbstractC2916a {
    public static final Parcelable.Creator<C2839h0> CREATOR = new C2841i0();

    /* renamed from: c */
    private final String f7926c;

    /* renamed from: d */
    private final AbstractBinderC2984x f7927d;

    /* renamed from: e */
    private final boolean f7928e;

    /* renamed from: f */
    private final boolean f7929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2839h0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f7926c = str;
        BinderC2985y binderC2985y = null;
        if (iBinder != null) {
            try {
                InterfaceC2987a mo31500d = AbstractBinderC2862c2.m31766n(iBinder).mo31500d();
                byte[] bArr = mo31500d == null ? null : (byte[]) BinderC2989b.m31495o(mo31500d);
                if (bArr != null) {
                    binderC2985y = new BinderC2985y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f7927d = binderC2985y;
        this.f7928e = z;
        this.f7929f = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2839h0(String str, AbstractBinderC2984x abstractBinderC2984x, boolean z, boolean z2) {
        this.f7926c = str;
        this.f7927d = abstractBinderC2984x;
        this.f7928e = z;
        this.f7929f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f7926c, false);
        AbstractBinderC2984x abstractBinderC2984x = this.f7927d;
        if (abstractBinderC2984x == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2984x = null;
        }
        C2917b.m31657i(parcel, 2, abstractBinderC2984x, false);
        C2917b.m31663c(parcel, 3, this.f7928e);
        C2917b.m31663c(parcel, 4, this.f7929f);
        C2917b.m31664b(parcel, m31665a);
    }
}
