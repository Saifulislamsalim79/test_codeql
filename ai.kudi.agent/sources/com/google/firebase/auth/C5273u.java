package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.u */
/* loaded from: classes2.dex */
public class C5273u extends AbstractC5197c {
    public static final Parcelable.Creator<C5273u> CREATOR = new C5196b0();

    /* renamed from: c */
    private String f13085c;

    /* renamed from: d */
    private String f13086d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5273u(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        this.f13085c = str;
        com.google.android.gms.common.internal.s.f(str2);
        this.f13086d = str2;
    }

    /* renamed from: k */
    public static C3168fn m25235k(C5273u c5273u, String str) {
        com.google.android.gms.common.internal.s.j(c5273u);
        return new C3168fn(null, c5273u.f13085c, c5273u.mo25237f(), null, c5273u.f13086d, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5273u(this.f13085c, this.f13086d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13085c, false);
        C2917b.m31651o(parcel, 2, this.f13086d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
