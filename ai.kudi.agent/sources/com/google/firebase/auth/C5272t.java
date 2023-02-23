package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.t */
/* loaded from: classes2.dex */
public class C5272t extends AbstractC5197c {
    public static final Parcelable.Creator<C5272t> CREATOR = new C5193a0();

    /* renamed from: c */
    private final String f13084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5272t(String str) {
        com.google.android.gms.common.internal.s.f(str);
        this.f13084c = str;
    }

    /* renamed from: k */
    public static C3168fn m25238k(C5272t c5272t, String str) {
        com.google.android.gms.common.internal.s.j(c5272t);
        return new C3168fn(null, null, c5272t.mo25237f(), null, null, c5272t.f13084c, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5272t(this.f13084c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13084c, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
