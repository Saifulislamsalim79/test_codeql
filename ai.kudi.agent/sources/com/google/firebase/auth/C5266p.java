package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import io.intercom.android.sdk.views.holder.AttributeType;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.p */
/* loaded from: classes2.dex */
public class C5266p extends AbstractC5197c implements Cloneable {
    public static final Parcelable.Creator<C5266p> CREATOR = new C5277y();

    /* renamed from: c */
    private String f13071c;

    /* renamed from: d */
    private String f13072d;

    /* renamed from: e */
    private boolean f13073e;

    /* renamed from: f */
    private String f13074f;

    /* renamed from: w */
    private boolean f13075w;

    /* renamed from: x */
    private String f13076x;

    /* renamed from: y */
    private String f13077y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5266p(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        com.google.android.gms.common.internal.s.b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f13071c = str;
        this.f13072d = str2;
        this.f13073e = z;
        this.f13074f = str3;
        this.f13075w = z2;
        this.f13076x = str4;
        this.f13077y = str5;
    }

    /* renamed from: s */
    public static C5266p m25250s(String str, String str2) {
        return new C5266p(str, str2, false, null, true, null, null);
    }

    /* renamed from: u */
    public static C5266p m25249u(String str, String str2) {
        return new C5266p(null, null, false, str, true, str2, null);
    }

    /* renamed from: E */
    public final C5266p m25257E(boolean z) {
        this.f13075w = false;
        return this;
    }

    /* renamed from: d0 */
    public final String m25256d0() {
        return this.f13074f;
    }

    /* renamed from: e0 */
    public final String m25255e0() {
        return this.f13071c;
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: f */
    public String mo25237f() {
        return AttributeType.PHONE;
    }

    @Override // com.google.firebase.auth.AbstractC5197c
    /* renamed from: h */
    public final AbstractC5197c mo25236h() {
        return clone();
    }

    /* renamed from: h0 */
    public final String m25254h0() {
        return this.f13076x;
    }

    /* renamed from: j0 */
    public final boolean m25253j0() {
        return this.f13075w;
    }

    /* renamed from: k */
    public String m25252k() {
        return this.f13072d;
    }

    /* renamed from: l */
    public final C5266p clone() {
        return new C5266p(this.f13071c, m25252k(), this.f13073e, this.f13074f, this.f13075w, this.f13076x, this.f13077y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13071c, false);
        C2917b.m31651o(parcel, 2, m25252k(), false);
        C2917b.m31663c(parcel, 3, this.f13073e);
        C2917b.m31651o(parcel, 4, this.f13074f, false);
        C2917b.m31663c(parcel, 5, this.f13075w);
        C2917b.m31651o(parcel, 6, this.f13076x, false);
        C2917b.m31651o(parcel, 7, this.f13077y, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
