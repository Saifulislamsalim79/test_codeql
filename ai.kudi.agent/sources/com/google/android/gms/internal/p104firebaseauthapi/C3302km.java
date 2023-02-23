package com.google.android.gms.internal.p104firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.km */
/* loaded from: classes2.dex */
public final class C3302km extends AbstractC2916a {
    public static final Parcelable.Creator<C3302km> CREATOR = new C3329lm();

    /* renamed from: c */
    private String f8686c;

    /* renamed from: d */
    private String f8687d;

    /* renamed from: e */
    private String f8688e;

    /* renamed from: f */
    private String f8689f;

    /* renamed from: w */
    private String f8690w;

    /* renamed from: x */
    private String f8691x;

    /* renamed from: y */
    private String f8692y;

    public C3302km() {
    }

    /* renamed from: E */
    public final String m30837E() {
        return this.f8690w;
    }

    /* renamed from: d0 */
    public final void m30836d0(String str) {
        this.f8690w = str;
    }

    /* renamed from: f */
    public final Uri m30835f() {
        if (TextUtils.isEmpty(this.f8688e)) {
            return null;
        }
        return Uri.parse(this.f8688e);
    }

    /* renamed from: h */
    public final String m30834h() {
        return this.f8687d;
    }

    /* renamed from: k */
    public final String m30833k() {
        return this.f8692y;
    }

    /* renamed from: l */
    public final String m30832l() {
        return this.f8686c;
    }

    /* renamed from: s */
    public final String m30831s() {
        return this.f8691x;
    }

    /* renamed from: u */
    public final String m30830u() {
        return this.f8689f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f8686c, false);
        C2917b.m31651o(parcel, 3, this.f8687d, false);
        C2917b.m31651o(parcel, 4, this.f8688e, false);
        C2917b.m31651o(parcel, 5, this.f8689f, false);
        C2917b.m31651o(parcel, 6, this.f8690w, false);
        C2917b.m31651o(parcel, 7, this.f8691x, false);
        C2917b.m31651o(parcel, 8, this.f8692y, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3302km(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f8686c = str;
        this.f8687d = str2;
        this.f8688e = str3;
        this.f8689f = str4;
        this.f8690w = str5;
        this.f8691x = str6;
        this.f8692y = str7;
    }
}
