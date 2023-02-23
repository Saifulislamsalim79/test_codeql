package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.o1 */
/* loaded from: classes2.dex */
public final class C2902o1 extends AbstractC2916a {
    public static final Parcelable.Creator<C2902o1> CREATOR = new C2905p1();

    /* renamed from: c */
    Bundle f8038c;

    /* renamed from: d */
    C2830d[] f8039d;

    /* renamed from: e */
    int f8040e;

    /* renamed from: f */
    C2871f f8041f;

    public C2902o1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2902o1(Bundle bundle, C2830d[] c2830dArr, int i, C2871f c2871f) {
        this.f8038c = bundle;
        this.f8039d = c2830dArr;
        this.f8040e = i;
        this.f8041f = c2871f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31661e(parcel, 1, this.f8038c, false);
        C2917b.m31649q(parcel, 2, this.f8039d, i, false);
        C2917b.m31656j(parcel, 3, this.f8040e);
        C2917b.m31652n(parcel, 4, this.f8041f, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
