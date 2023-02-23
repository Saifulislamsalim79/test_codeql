package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3168fn;
import com.google.android.gms.internal.p104firebaseauthapi.C3516t1;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.g0 */
/* loaded from: classes2.dex */
public final class C5206g0 extends AbstractC5264o {
    public static final Parcelable.Creator<C5206g0> CREATOR = new C5208h0();

    /* renamed from: c */
    private final String f12966c;

    /* renamed from: d */
    private final String f12967d;

    /* renamed from: e */
    private final String f12968e;

    /* renamed from: f */
    private final C3168fn f12969f;

    /* renamed from: w */
    private final String f12970w;

    /* renamed from: x */
    private final String f12971x;

    /* renamed from: y */
    private final String f12972y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5206g0(String str, String str2, String str3, C3168fn c3168fn, String str4, String str5, String str6) {
        this.f12966c = C3516t1.m30220c(str);
        this.f12967d = str2;
        this.f12968e = str3;
        this.f12969f = c3168fn;
        this.f12970w = str4;
        this.f12971x = str5;
        this.f12972y = str6;
    }

    /* renamed from: k */
    public static C5206g0 m25364k(C3168fn c3168fn) {
        com.google.android.gms.common.internal.s.k(c3168fn, "Must specify a non-null webSignInCredential");
        return new C5206g0(null, null, null, c3168fn, null, null, null);
    }

    /* renamed from: l */
    public static C5206g0 m25363l(String str, String str2, String str3, String str4, String str5) {
        com.google.android.gms.common.internal.s.g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C5206g0(str, str2, str3, null, str4, str5, null);
    }

    /* renamed from: s */
    public static C3168fn m25362s(C5206g0 c5206g0, String str) {
        com.google.android.gms.common.internal.s.j(c5206g0);
        C3168fn c3168fn = c5206g0.f12969f;
        return c3168fn != null ? c3168fn : new C3168fn(c5206g0.f12967d, c5206g0.f12968e, c5206g0.f12966c, null, c5206g0.f12971x, null, str, c5206g0.f12970w, c5206g0.f12972y);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public final String mo25237f() {
        return this.f12966c;
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5206g0(this.f12966c, this.f12967d, this.f12968e, this.f12969f, this.f12970w, this.f12971x, this.f12972y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f12966c, false);
        C2917b.m31651o(parcel, 2, this.f12967d, false);
        C2917b.m31651o(parcel, 3, this.f12968e, false);
        C2917b.m31652n(parcel, 4, this.f12969f, i, false);
        C2917b.m31651o(parcel, 5, this.f12970w, false);
        C2917b.m31651o(parcel, 6, this.f12971x, false);
        C2917b.m31651o(parcel, 7, this.f12972y, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
