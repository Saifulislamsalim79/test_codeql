package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.d */
/* loaded from: classes2.dex */
public class C2830d extends AbstractC2916a {
    public static final Parcelable.Creator<C2830d> CREATOR = new C2959r();

    /* renamed from: c */
    private final String f7910c;
    @Deprecated

    /* renamed from: d */
    private final int f7911d;

    /* renamed from: e */
    private final long f7912e;

    public C2830d(String str, int i, long j) {
        this.f7910c = str;
        this.f7911d = i;
        this.f7912e = j;
    }

    public C2830d(String str, long j) {
        this.f7910c = str;
        this.f7912e = j;
        this.f7911d = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2830d) {
            C2830d c2830d = (C2830d) obj;
            if (((m31869f() != null && m31869f().equals(c2830d.m31869f())) || (m31869f() == null && c2830d.m31869f() == null)) && m31868h() == c2830d.m31868h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m31869f() {
        return this.f7910c;
    }

    /* renamed from: h */
    public long m31868h() {
        long j = this.f7912e;
        return j == -1 ? this.f7911d : j;
    }

    public final int hashCode() {
        return C2906q.m31700b(m31869f(), Long.valueOf(m31868h()));
    }

    public final String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("name", m31869f());
        m31699c.m31698a("version", Long.valueOf(m31868h()));
        return m31699c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, m31869f(), false);
        C2917b.m31656j(parcel, 2, this.f7911d);
        C2917b.m31654l(parcel, 3, m31868h());
        C2917b.m31664b(parcel, m31665a);
    }
}
