package com.google.android.gms.internal.p104firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.C5206g0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xl */
/* loaded from: classes2.dex */
public final class C3640xl extends AbstractC2916a {
    public static final Parcelable.Creator<C3640xl> CREATOR = new C3666yl();

    /* renamed from: A */
    private long f9094A;

    /* renamed from: B */
    private long f9095B;

    /* renamed from: C */
    private boolean f9096C;

    /* renamed from: D */
    private C5206g0 f9097D;

    /* renamed from: E */
    private List<C3248im> f9098E;

    /* renamed from: c */
    private String f9099c;

    /* renamed from: d */
    private String f9100d;

    /* renamed from: e */
    private boolean f9101e;

    /* renamed from: f */
    private String f9102f;

    /* renamed from: w */
    private String f9103w;

    /* renamed from: x */
    private C3355mm f9104x;

    /* renamed from: y */
    private String f9105y;

    /* renamed from: z */
    private String f9106z;

    public C3640xl() {
        this.f9104x = new C3355mm();
    }

    /* renamed from: E */
    public final C3640xl m30021E(String str) {
        this.f9100d = str;
        return this;
    }

    /* renamed from: d0 */
    public final C3640xl m30020d0(boolean z) {
        this.f9096C = z;
        return this;
    }

    /* renamed from: e0 */
    public final C3640xl m30019e0(String str) {
        s.f(str);
        this.f9105y = str;
        return this;
    }

    /* renamed from: f */
    public final long m30018f() {
        return this.f9094A;
    }

    /* renamed from: h */
    public final long m30017h() {
        return this.f9095B;
    }

    /* renamed from: h0 */
    public final C3640xl m30016h0(String str) {
        this.f9103w = str;
        return this;
    }

    /* renamed from: j0 */
    public final C3640xl m30015j0(List<C3302km> list) {
        s.j(list);
        C3355mm c3355mm = new C3355mm();
        this.f9104x = c3355mm;
        c3355mm.m30655k().addAll(list);
        return this;
    }

    /* renamed from: k */
    public final Uri m30014k() {
        if (TextUtils.isEmpty(this.f9103w)) {
            return null;
        }
        return Uri.parse(this.f9103w);
    }

    /* renamed from: l */
    public final C5206g0 m30013l() {
        return this.f9097D;
    }

    /* renamed from: l0 */
    public final C3355mm m30012l0() {
        return this.f9104x;
    }

    /* renamed from: m0 */
    public final String m30011m0() {
        return this.f9102f;
    }

    /* renamed from: n0 */
    public final String m30010n0() {
        return this.f9100d;
    }

    /* renamed from: p0 */
    public final String m30009p0() {
        return this.f9099c;
    }

    /* renamed from: q0 */
    public final String m30008q0() {
        return this.f9106z;
    }

    /* renamed from: r0 */
    public final List<C3248im> m30007r0() {
        return this.f9098E;
    }

    /* renamed from: s */
    public final C3640xl m30006s(C5206g0 c5206g0) {
        this.f9097D = c5206g0;
        return this;
    }

    /* renamed from: s0 */
    public final List<C3302km> m30005s0() {
        return this.f9104x.m30655k();
    }

    /* renamed from: t0 */
    public final boolean m30004t0() {
        return this.f9101e;
    }

    /* renamed from: u */
    public final C3640xl m30003u(String str) {
        this.f9102f = str;
        return this;
    }

    /* renamed from: v0 */
    public final boolean m30002v0() {
        return this.f9096C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 2, this.f9099c, false);
        C2917b.m31651o(parcel, 3, this.f9100d, false);
        C2917b.m31663c(parcel, 4, this.f9101e);
        C2917b.m31651o(parcel, 5, this.f9102f, false);
        C2917b.m31651o(parcel, 6, this.f9103w, false);
        C2917b.m31652n(parcel, 7, this.f9104x, i, false);
        C2917b.m31651o(parcel, 8, this.f9105y, false);
        C2917b.m31651o(parcel, 9, this.f9106z, false);
        C2917b.m31654l(parcel, 10, this.f9094A);
        C2917b.m31654l(parcel, 11, this.f9095B);
        C2917b.m31663c(parcel, 12, this.f9096C);
        C2917b.m31652n(parcel, 13, this.f9097D, i, false);
        C2917b.m31648r(parcel, 14, this.f9098E, false);
        C2917b.m31664b(parcel, m31665a);
    }

    public C3640xl(String str, String str2, boolean z, String str3, String str4, C3355mm c3355mm, String str5, String str6, long j, long j2, boolean z2, C5206g0 c5206g0, List<C3248im> list) {
        C3355mm m30656h;
        this.f9099c = str;
        this.f9100d = str2;
        this.f9101e = z;
        this.f9102f = str3;
        this.f9103w = str4;
        if (c3355mm == null) {
            m30656h = new C3355mm();
        } else {
            m30656h = C3355mm.m30656h(c3355mm);
        }
        this.f9104x = m30656h;
        this.f9105y = str5;
        this.f9106z = str6;
        this.f9094A = j;
        this.f9095B = j2;
        this.f9096C = z2;
        this.f9097D = c5206g0;
        this.f9098E = list == null ? new ArrayList<>() : list;
    }
}
