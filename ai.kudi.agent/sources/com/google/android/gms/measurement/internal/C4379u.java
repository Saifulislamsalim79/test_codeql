package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes2.dex */
public final class C4379u extends AbstractC2916a {
    public static final Parcelable.Creator<C4379u> CREATOR = new C4391v();

    /* renamed from: c */
    public final String f10698c;

    /* renamed from: d */
    public final C4355s f10699d;

    /* renamed from: e */
    public final String f10700e;

    /* renamed from: f */
    public final long f10701f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4379u(C4379u c4379u, long j) {
        com.google.android.gms.common.internal.s.j(c4379u);
        this.f10698c = c4379u.f10698c;
        this.f10699d = c4379u.f10699d;
        this.f10700e = c4379u.f10700e;
        this.f10701f = j;
    }

    public final String toString() {
        String str = this.f10700e;
        String str2 = this.f10698c;
        String valueOf = String.valueOf(this.f10699d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C4391v.m27921a(this, parcel, i);
    }

    public C4379u(String str, C4355s c4355s, String str2, long j) {
        this.f10698c = str;
        this.f10699d = c4355s;
        this.f10700e = str2;
        this.f10701f = j;
    }
}
