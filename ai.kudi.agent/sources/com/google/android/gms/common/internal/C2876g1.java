package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@Deprecated
/* renamed from: com.google.android.gms.common.internal.g1 */
/* loaded from: classes2.dex */
public final class C2876g1 extends AbstractC2916a {
    public static final Parcelable.Creator<C2876g1> CREATOR = new C2879h1();

    /* renamed from: c */
    final int f7991c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2876g1(int i) {
        this.f7991c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f7991c);
        C2917b.m31664b(parcel, m31665a);
    }
}
