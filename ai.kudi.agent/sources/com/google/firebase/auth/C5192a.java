package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.a */
/* loaded from: classes2.dex */
public class C5192a extends AbstractC2916a {
    public static final Parcelable.Creator<C5192a> CREATOR = new C5200d0();

    /* renamed from: A */
    private int f12947A;

    /* renamed from: B */
    private String f12948B;

    /* renamed from: c */
    private final String f12949c;

    /* renamed from: d */
    private final String f12950d;

    /* renamed from: e */
    private final String f12951e;

    /* renamed from: f */
    private final String f12952f;

    /* renamed from: w */
    private final boolean f12953w;

    /* renamed from: x */
    private final String f12954x;

    /* renamed from: y */
    private final boolean f12955y;

    /* renamed from: z */
    private String f12956z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5192a(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f12949c = str;
        this.f12950d = str2;
        this.f12951e = str3;
        this.f12952f = str4;
        this.f12953w = z;
        this.f12954x = str5;
        this.f12955y = z2;
        this.f12956z = str6;
        this.f12947A = i;
        this.f12948B = str7;
    }

    /* renamed from: E */
    public final int m25388E() {
        return this.f12947A;
    }

    /* renamed from: d0 */
    public final String m25387d0() {
        return this.f12948B;
    }

    /* renamed from: e0 */
    public final String m25386e0() {
        return this.f12951e;
    }

    /* renamed from: f */
    public boolean m25385f() {
        return this.f12955y;
    }

    /* renamed from: h */
    public boolean m25384h() {
        return this.f12953w;
    }

    /* renamed from: h0 */
    public final String m25383h0() {
        return this.f12956z;
    }

    /* renamed from: k */
    public String m25382k() {
        return this.f12954x;
    }

    /* renamed from: l */
    public String m25381l() {
        return this.f12952f;
    }

    /* renamed from: s */
    public String m25380s() {
        return this.f12950d;
    }

    /* renamed from: u */
    public String m25379u() {
        return this.f12949c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, m25379u(), false);
        C2917b.m31651o(parcel, 2, m25380s(), false);
        C2917b.m31651o(parcel, 3, this.f12951e, false);
        C2917b.m31651o(parcel, 4, m25381l(), false);
        C2917b.m31663c(parcel, 5, m25384h());
        C2917b.m31651o(parcel, 6, m25382k(), false);
        C2917b.m31663c(parcel, 7, m25385f());
        C2917b.m31651o(parcel, 8, this.f12956z, false);
        C2917b.m31656j(parcel, 9, this.f12947A);
        C2917b.m31651o(parcel, 10, this.f12948B, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
