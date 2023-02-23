package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.AbstractC5258l;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.internal.C5243q;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sf */
/* loaded from: classes2.dex */
public final class C3504sf extends AbstractC2916a {
    public static final Parcelable.Creator<C3504sf> CREATOR = new C3530tf();

    /* renamed from: c */
    final String f8944c;

    /* renamed from: d */
    final List<C3248im> f8945d;

    /* renamed from: e */
    final C5206g0 f8946e;

    public C3504sf(String str, List<C3248im> list, C5206g0 c5206g0) {
        this.f8944c = str;
        this.f8945d = list;
        this.f8946e = c5206g0;
    }

    /* renamed from: f */
    public final C5206g0 m30277f() {
        return this.f8946e;
    }

    /* renamed from: h */
    public final String m30276h() {
        return this.f8944c;
    }

    /* renamed from: k */
    public final List<AbstractC5258l> m30275k() {
        return C5243q.m25284b(this.f8945d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f8944c, false);
        C2917b.m31648r(parcel, 2, this.f8945d, false);
        C2917b.m31652n(parcel, 3, this.f8946e, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
