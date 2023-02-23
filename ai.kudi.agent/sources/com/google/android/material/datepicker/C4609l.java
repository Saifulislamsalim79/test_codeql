package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Month.java */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes2.dex */
public final class C4609l implements Comparable<C4609l>, Parcelable {
    public static final Parcelable.Creator<C4609l> CREATOR = new C4610a();

    /* renamed from: c */
    private final Calendar f11475c;

    /* renamed from: d */
    final int f11476d;

    /* renamed from: e */
    final int f11477e;

    /* renamed from: f */
    final int f11478f;

    /* renamed from: w */
    final int f11479w;

    /* renamed from: x */
    final long f11480x;

    /* renamed from: y */
    private String f11481y;

    /* compiled from: Month.java */
    /* renamed from: com.google.android.material.datepicker.l$a */
    /* loaded from: classes2.dex */
    static class C4610a implements Parcelable.Creator<C4609l> {
        C4610a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4609l createFromParcel(Parcel parcel) {
            return C4609l.m27063b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4609l[] newArray(int i) {
            return new C4609l[i];
        }
    }

    private C4609l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m27020d = C4620s.m27020d(calendar);
        this.f11475c = m27020d;
        this.f11476d = m27020d.get(2);
        this.f11477e = this.f11475c.get(1);
        this.f11478f = this.f11475c.getMaximum(7);
        this.f11479w = this.f11475c.getActualMaximum(5);
        this.f11480x = this.f11475c.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4609l m27063b(int i, int i2) {
        Calendar m27013k = C4620s.m27013k();
        m27013k.set(1, i);
        m27013k.set(2, i2);
        return new C4609l(m27013k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C4609l m27062e(long j) {
        Calendar m27013k = C4620s.m27013k();
        m27013k.setTimeInMillis(j);
        return new C4609l(m27013k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4609l m27061g() {
        return new C4609l(C4620s.m27015i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C4609l c4609l) {
        return this.f11475c.compareTo(c4609l.f11475c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4609l) {
            C4609l c4609l = (C4609l) obj;
            return this.f11476d == c4609l.f11476d && this.f11477e == c4609l.f11477e;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m27060h() {
        int firstDayOfWeek = this.f11475c.get(7) - this.f11475c.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f11478f : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11476d), Integer.valueOf(this.f11477e)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public long m27059i(int i) {
        Calendar m27020d = C4620s.m27020d(this.f11475c);
        m27020d.set(5, i);
        return m27020d.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m27058j(long j) {
        Calendar m27020d = C4620s.m27020d(this.f11475c);
        m27020d.setTimeInMillis(j);
        return m27020d.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public String m27057m(Context context) {
        if (this.f11481y == null) {
            this.f11481y = C4584e.m27117c(context, this.f11475c.getTimeInMillis());
        }
        return this.f11481y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public long m27056n() {
        return this.f11475c.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C4609l m27055p(int i) {
        Calendar m27020d = C4620s.m27020d(this.f11475c);
        m27020d.add(2, i);
        return new C4609l(m27020d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m27054q(C4609l c4609l) {
        if (this.f11475c instanceof GregorianCalendar) {
            return ((c4609l.f11477e - this.f11477e) * 12) + (c4609l.f11476d - this.f11476d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11477e);
        parcel.writeInt(this.f11476d);
    }
}
