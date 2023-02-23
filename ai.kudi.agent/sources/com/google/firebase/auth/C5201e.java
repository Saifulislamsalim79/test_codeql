package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.e */
/* loaded from: classes2.dex */
public class C5201e extends AbstractC5197c {
    public static final Parcelable.Creator<C5201e> CREATOR = new C5255j0();

    /* renamed from: c */
    private final String f12965c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5201e(String str) {
        com.google.android.gms.common.internal.s.f(str);
        this.f12965c = str;
    }

    /* renamed from: k */
    public static C3168fn m25365k(C5201e c5201e, String str) {
        com.google.android.gms.common.internal.s.j(c5201e);
        return new C3168fn(null, c5201e.f12965c, c5201e.mo25237f(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5201e(this.f12965c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f12965c, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
