package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.internal.safeparcel.InterfaceC2918c;
import com.google.firebase.auth.C5206g0;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.j0 */
/* loaded from: classes2.dex */
public final class C5230j0 implements InterfaceC2918c {
    public static final Parcelable.Creator<C5230j0> CREATOR = new C5232k0();

    /* renamed from: c */
    private C5240o0 f13010c;

    /* renamed from: d */
    private C5226h0 f13011d;

    /* renamed from: e */
    private C5206g0 f13012e;

    public C5230j0(C5240o0 c5240o0) {
        com.google.android.gms.common.internal.s.j(c5240o0);
        C5240o0 c5240o02 = c5240o0;
        this.f13010c = c5240o02;
        List<C5234l0> m25291v0 = c5240o02.m25291v0();
        this.f13011d = null;
        for (int i = 0; i < m25291v0.size(); i++) {
            if (!TextUtils.isEmpty(m25291v0.get(i).zza())) {
                this.f13011d = new C5226h0(m25291v0.get(i).mo25234d(), m25291v0.get(i).zza(), c5240o0.m25310I0());
            }
        }
        if (this.f13011d == null) {
            this.f13011d = new C5226h0(c5240o0.m25310I0());
        }
        this.f13012e = c5240o0.m25297q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5230j0(C5240o0 c5240o0, C5226h0 c5226h0, C5206g0 c5206g0) {
        this.f13010c = c5240o0;
        this.f13011d = c5226h0;
        this.f13012e = c5206g0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f13010c, i, false);
        C2917b.m31652n(parcel, 2, this.f13011d, i, false);
        C2917b.m31652n(parcel, 3, this.f13012e, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
