package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.ea */
/* loaded from: classes2.dex */
public final class C4203ea extends AbstractC2916a {
    public static final Parcelable.Creator<C4203ea> CREATOR = new C4214fa();

    /* renamed from: c */
    public final int f10244c;

    /* renamed from: d */
    public final String f10245d;

    /* renamed from: e */
    public final long f10246e;

    /* renamed from: f */
    public final Long f10247f;

    /* renamed from: w */
    public final String f10248w;

    /* renamed from: x */
    public final String f10249x;

    /* renamed from: y */
    public final Double f10250y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4203ea(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f10244c = i;
        this.f10245d = str;
        this.f10246e = j;
        this.f10247f = l;
        if (i == 1) {
            this.f10250y = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f10250y = d;
        }
        this.f10248w = str2;
        this.f10249x = str3;
    }

    /* renamed from: f */
    public final Object m28270f() {
        Long l = this.f10247f;
        if (l != null) {
            return l;
        }
        Double d = this.f10250y;
        if (d != null) {
            return d;
        }
        String str = this.f10248w;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C4214fa.m28268a(this, parcel, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4203ea(C4225ga c4225ga) {
        this(c4225ga.f10319c, c4225ga.f10320d, c4225ga.f10321e, c4225ga.f10318b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4203ea(String str, long j, Object obj, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        this.f10244c = 2;
        this.f10245d = str;
        this.f10246e = j;
        this.f10249x = str2;
        if (obj == null) {
            this.f10247f = null;
            this.f10250y = null;
            this.f10248w = null;
        } else if (obj instanceof Long) {
            this.f10247f = (Long) obj;
            this.f10250y = null;
            this.f10248w = null;
        } else if (obj instanceof String) {
            this.f10247f = null;
            this.f10250y = null;
            this.f10248w = (String) obj;
        } else if (obj instanceof Double) {
            this.f10247f = null;
            this.f10250y = (Double) obj;
            this.f10248w = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
