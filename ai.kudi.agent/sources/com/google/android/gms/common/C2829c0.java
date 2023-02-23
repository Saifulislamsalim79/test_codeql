package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.c0 */
/* loaded from: classes2.dex */
public final class C2829c0 extends AbstractC2916a {
    public static final Parcelable.Creator<C2829c0> CREATOR = new C2831d0();

    /* renamed from: c */
    private final String f7905c;

    /* renamed from: d */
    private final boolean f7906d;

    /* renamed from: e */
    private final boolean f7907e;

    /* renamed from: f */
    private final Context f7908f;

    /* renamed from: w */
    private final boolean f7909w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2829c0(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f7905c = str;
        this.f7906d = z;
        this.f7907e = z2;
        this.f7908f = (Context) BinderC2989b.m31495o(InterfaceC2987a.AbstractBinderC2988a.m31496n(iBinder));
        this.f7909w = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.dynamic.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f7905c, false);
        C2917b.m31663c(parcel, 2, this.f7906d);
        C2917b.m31663c(parcel, 3, this.f7907e);
        C2917b.m31657i(parcel, 4, BinderC2989b.m31494p1(this.f7908f), false);
        C2917b.m31663c(parcel, 5, this.f7909w);
        C2917b.m31664b(parcel, m31665a);
    }
}
