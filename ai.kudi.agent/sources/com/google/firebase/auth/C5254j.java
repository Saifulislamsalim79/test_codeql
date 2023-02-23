package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.j */
/* loaded from: classes2.dex */
public class C5254j extends AbstractC5197c {
    public static final Parcelable.Creator<C5254j> CREATOR = new C5276x();

    /* renamed from: c */
    private final String f13063c;

    /* renamed from: d */
    private final String f13064d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5254j(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f13063c = str;
        this.f13064d = str2;
    }

    /* renamed from: k */
    public static C3168fn m25261k(C5254j c5254j, String str) {
        com.google.android.gms.common.internal.s.j(c5254j);
        return new C3168fn(c5254j.f13063c, c5254j.f13064d, c5254j.mo25237f(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5254j(this.f13063c, this.f13064d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13063c, false);
        C2917b.m31651o(parcel, 2, this.f13064d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
