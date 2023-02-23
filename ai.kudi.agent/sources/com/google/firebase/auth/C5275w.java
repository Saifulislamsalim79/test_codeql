package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.w */
/* loaded from: classes2.dex */
public class C5275w extends AbstractC2916a {
    public static final Parcelable.Creator<C5275w> CREATOR = new C5198c0();

    /* renamed from: c */
    private String f13087c;

    /* renamed from: d */
    private String f13088d;

    /* renamed from: e */
    private boolean f13089e;

    /* renamed from: f */
    private boolean f13090f;

    /* renamed from: w */
    private Uri f13091w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5275w(String str, String str2, boolean z, boolean z2) {
        this.f13087c = str;
        this.f13088d = str2;
        this.f13089e = z;
        this.f13090f = z2;
        this.f13091w = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: c */
    public final boolean m25233c() {
        return this.f13090f;
    }

    /* renamed from: f */
    public String m25232f() {
        return this.f13087c;
    }

    /* renamed from: h */
    public Uri m25231h() {
        return this.f13091w;
    }

    /* renamed from: k */
    public final boolean m25230k() {
        return this.f13089e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, m25232f(), false);
        C2917b.m31651o(parcel, 3, this.f13088d, false);
        C2917b.m31663c(parcel, 4, this.f13089e);
        C2917b.m31663c(parcel, 5, this.f13090f);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        return this.f13088d;
    }
}
