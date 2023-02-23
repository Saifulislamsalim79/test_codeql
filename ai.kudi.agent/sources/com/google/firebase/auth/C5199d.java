package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.d */
/* loaded from: classes2.dex */
public class C5199d extends AbstractC5197c {
    public static final Parcelable.Creator<C5199d> CREATOR = new C5210i0();

    /* renamed from: c */
    private String f12960c;

    /* renamed from: d */
    private String f12961d;

    /* renamed from: e */
    private final String f12962e;

    /* renamed from: f */
    private String f12963f;

    /* renamed from: w */
    private boolean f12964w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5199d(String str, String str2, String str3, String str4, boolean z) {
        com.google.android.gms.common.internal.s.f(str);
        this.f12960c = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f12961d = str2;
        this.f12962e = str3;
        this.f12963f = str4;
        this.f12964w = z;
    }

    /* renamed from: E */
    public final String m25373E() {
        return this.f12961d;
    }

    /* renamed from: d0 */
    public final String m25372d0() {
        return this.f12962e;
    }

    /* renamed from: e0 */
    public final boolean m25371e0() {
        return !TextUtils.isEmpty(this.f12962e);
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return "password";
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return new C5199d(this.f12960c, this.f12961d, this.f12962e, this.f12963f, this.f12964w);
    }

    /* renamed from: h0 */
    public final boolean m25370h0() {
        return this.f12964w;
    }

    /* renamed from: k */
    public String m25369k() {
        return !TextUtils.isEmpty(this.f12961d) ? "password" : "emailLink";
    }

    /* renamed from: l */
    public final C5199d m25368l(AbstractC5203f abstractC5203f) {
        this.f12963f = abstractC5203f.mo25305h0();
        this.f12964w = true;
        return this;
    }

    /* renamed from: s */
    public final String m25367s() {
        return this.f12963f;
    }

    /* renamed from: u */
    public final String m25366u() {
        return this.f12960c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f12960c, false);
        C2917b.m31651o(parcel, 2, this.f12961d, false);
        C2917b.m31651o(parcel, 3, this.f12962e, false);
        C2917b.m31651o(parcel, 4, this.f12963f, false);
        C2917b.m31663c(parcel, 5, this.f12964w);
        C2917b.m31664b(parcel, m31665a);
    }
}
