package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yd */
/* loaded from: classes2.dex */
public final class C3658yd extends AbstractC2916a {
    public static final Parcelable.Creator<C3658yd> CREATOR = new C3684zd();

    /* renamed from: c */
    private final String f9116c;

    /* renamed from: d */
    private final String f9117d;

    /* renamed from: e */
    private final String f9118e;

    public C3658yd(String str, String str2, String str3) {
        this.f9116c = str;
        this.f9117d = str2;
        this.f9118e = str3;
    }

    /* renamed from: f */
    public final String m29959f() {
        return this.f9116c;
    }

    /* renamed from: h */
    public final String m29958h() {
        return this.f9117d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f9116c, false);
        C2917b.m31651o(parcel, 2, this.f9117d, false);
        C2917b.m31651o(parcel, 3, this.f9118e, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f9118e;
    }
}
