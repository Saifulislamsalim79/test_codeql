package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C4577a;
import java.util.Arrays;
/* compiled from: DateValidatorPointForward.java */
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes2.dex */
public class C4585f implements C4577a.InterfaceC4580c {
    public static final Parcelable.Creator<C4585f> CREATOR = new C4586a();

    /* renamed from: c */
    private final long f11408c;

    /* compiled from: DateValidatorPointForward.java */
    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes2.dex */
    static class C4586a implements Parcelable.Creator<C4585f> {
        C4586a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4585f createFromParcel(Parcel parcel) {
            return new C4585f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4585f[] newArray(int i) {
            return new C4585f[i];
        }
    }

    /* synthetic */ C4585f(long j, C4586a c4586a) {
        this(j);
    }

    /* renamed from: a */
    public static C4585f m27114a(long j) {
        return new C4585f(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4585f) && this.f11408c == ((C4585f) obj).f11408c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11408c)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11408c);
    }

    @Override // com.google.android.material.datepicker.C4577a.InterfaceC4580c
    /* renamed from: z0 */
    public boolean mo27113z0(long j) {
        return j >= this.f11408c;
    }

    private C4585f(long j) {
        this.f11408c = j;
    }
}
