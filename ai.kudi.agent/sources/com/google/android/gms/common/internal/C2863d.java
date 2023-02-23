package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes2.dex */
public class C2863d extends AbstractC2916a {
    public static final Parcelable.Creator<C2863d> CREATOR = new C2851b0();

    /* renamed from: c */
    public final int f7964c;

    /* renamed from: d */
    public final String f7965d;

    public C2863d(int i, String str) {
        this.f7964c = i;
        this.f7965d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2863d) {
            C2863d c2863d = (C2863d) obj;
            return c2863d.f7964c == this.f7964c && C2906q.m31701a(c2863d.f7965d, this.f7965d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7964c;
    }

    public final String toString() {
        int i = this.f7964c;
        String str = this.f7965d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f7964c);
        C2917b.m31651o(parcel, 2, this.f7965d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
