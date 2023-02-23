package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimeModel.java */
/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes2.dex */
public class C4822b implements Parcelable {
    public static final Parcelable.Creator<C4822b> CREATOR = new C4823a();

    /* renamed from: c */
    final int f12216c;

    /* renamed from: d */
    int f12217d;

    /* renamed from: e */
    int f12218e;

    /* renamed from: f */
    int f12219f;

    /* compiled from: TimeModel.java */
    /* renamed from: com.google.android.material.timepicker.b$a */
    /* loaded from: classes2.dex */
    static class C4823a implements Parcelable.Creator<C4822b> {
        C4823a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4822b createFromParcel(Parcel parcel) {
            return new C4822b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4822b[] newArray(int i) {
            return new C4822b[i];
        }
    }

    public C4822b() {
        this(0);
    }

    /* renamed from: a */
    public static String m26215a(Resources resources, CharSequence charSequence) {
        return m26214b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m26214b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: c */
    private static int m26213c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4822b) {
            C4822b c4822b = (C4822b) obj;
            return this.f12217d == c4822b.f12217d && this.f12218e == c4822b.f12218e && this.f12216c == c4822b.f12216c && this.f12219f == c4822b.f12219f;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12216c), Integer.valueOf(this.f12217d), Integer.valueOf(this.f12218e), Integer.valueOf(this.f12219f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12217d);
        parcel.writeInt(this.f12218e);
        parcel.writeInt(this.f12219f);
        parcel.writeInt(this.f12216c);
    }

    public C4822b(int i) {
        this(0, 0, 10, i);
    }

    public C4822b(int i, int i2, int i3, int i4) {
        this.f12217d = i;
        this.f12218e = i2;
        this.f12219f = i3;
        this.f12216c = i4;
        m26213c(i);
    }

    protected C4822b(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
