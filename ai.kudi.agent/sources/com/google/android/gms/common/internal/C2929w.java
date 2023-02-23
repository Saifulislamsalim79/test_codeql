package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.w */
/* loaded from: classes2.dex */
public class C2929w extends AbstractC2916a {
    public static final Parcelable.Creator<C2929w> CREATOR = new C2860c0();

    /* renamed from: c */
    private final int f8091c;

    /* renamed from: d */
    private java.util.List<C2903p> f8092d;

    public C2929w(int i, java.util.List<C2903p> list) {
        this.f8091c = i;
        this.f8092d = list;
    }

    /* renamed from: f */
    public final int m31617f() {
        return this.f8091c;
    }

    /* renamed from: h */
    public final java.util.List<C2903p> m31616h() {
        return this.f8092d;
    }

    /* renamed from: k */
    public final void m31615k(C2903p c2903p) {
        if (this.f8092d == null) {
            this.f8092d = new ArrayList();
        }
        this.f8092d.add(c2903p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f8091c);
        C2917b.m31648r(parcel, 2, this.f8092d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
