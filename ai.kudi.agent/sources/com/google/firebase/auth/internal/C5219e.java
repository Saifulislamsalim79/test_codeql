package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.AbstractC5260m;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.e */
/* loaded from: classes2.dex */
public final class C5219e extends AbstractC5260m {
    public static final Parcelable.Creator<C5219e> CREATOR = new C5221f();

    /* renamed from: c */
    private final List<C5271s> f12989c = new ArrayList();

    /* renamed from: d */
    private final C5223g f12990d;

    /* renamed from: e */
    private final String f12991e;

    /* renamed from: f */
    private final C5206g0 f12992f;

    /* renamed from: w */
    private final C5240o0 f12993w;

    public C5219e(List<C5271s> list, C5223g c5223g, String str, C5206g0 c5206g0, C5240o0 c5240o0) {
        for (C5271s c5271s : list) {
            if (c5271s instanceof C5271s) {
                this.f12989c.add(c5271s);
            }
        }
        com.google.android.gms.common.internal.s.j(c5223g);
        this.f12990d = c5223g;
        com.google.android.gms.common.internal.s.f(str);
        this.f12991e = str;
        this.f12992f = c5206g0;
        this.f12993w = c5240o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 1, this.f12989c, false);
        C2917b.m31652n(parcel, 2, this.f12990d, i, false);
        C2917b.m31651o(parcel, 3, this.f12991e, false);
        C2917b.m31652n(parcel, 4, this.f12992f, i, false);
        C2917b.m31652n(parcel, 5, this.f12993w, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
