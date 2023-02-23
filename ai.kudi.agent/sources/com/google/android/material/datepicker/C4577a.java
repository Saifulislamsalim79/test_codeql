package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p201g.p227h.p237k.C7670c;
/* compiled from: CalendarConstraints.java */
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes2.dex */
public final class C4577a implements Parcelable {
    public static final Parcelable.Creator<C4577a> CREATOR = new C4578a();

    /* renamed from: c */
    private final C4609l f11382c;

    /* renamed from: d */
    private final C4609l f11383d;

    /* renamed from: e */
    private final InterfaceC4580c f11384e;

    /* renamed from: f */
    private C4609l f11385f;

    /* renamed from: w */
    private final int f11386w;

    /* renamed from: x */
    private final int f11387x;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes2.dex */
    static class C4578a implements Parcelable.Creator<C4577a> {
        C4578a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4577a createFromParcel(Parcel parcel) {
            return new C4577a((C4609l) parcel.readParcelable(C4609l.class.getClassLoader()), (C4609l) parcel.readParcelable(C4609l.class.getClassLoader()), (InterfaceC4580c) parcel.readParcelable(InterfaceC4580c.class.getClassLoader()), (C4609l) parcel.readParcelable(C4609l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4577a[] newArray(int i) {
            return new C4577a[i];
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$b */
    /* loaded from: classes2.dex */
    public static final class C4579b {

        /* renamed from: e */
        static final long f11388e = C4620s.m27023a(C4609l.m27063b(1900, 0).f11480x);

        /* renamed from: f */
        static final long f11389f = C4620s.m27023a(C4609l.m27063b(2100, 11).f11480x);

        /* renamed from: a */
        private long f11390a;

        /* renamed from: b */
        private long f11391b;

        /* renamed from: c */
        private Long f11392c;

        /* renamed from: d */
        private InterfaceC4580c f11393d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C4579b(C4577a c4577a) {
            this.f11390a = f11388e;
            this.f11391b = f11389f;
            this.f11393d = C4585f.m27114a(Long.MIN_VALUE);
            this.f11390a = c4577a.f11382c.f11480x;
            this.f11391b = c4577a.f11383d.f11480x;
            this.f11392c = Long.valueOf(c4577a.f11385f.f11480x);
            this.f11393d = c4577a.f11384e;
        }

        /* renamed from: a */
        public C4577a m27133a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f11393d);
            C4609l m27062e = C4609l.m27062e(this.f11390a);
            C4609l m27062e2 = C4609l.m27062e(this.f11391b);
            InterfaceC4580c interfaceC4580c = (InterfaceC4580c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f11392c;
            return new C4577a(m27062e, m27062e2, interfaceC4580c, l == null ? null : C4609l.m27062e(l.longValue()), null);
        }

        /* renamed from: b */
        public C4579b m27132b(long j) {
            this.f11392c = Long.valueOf(j);
            return this;
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4580c extends Parcelable {
        /* renamed from: z0 */
        boolean mo27113z0(long j);
    }

    /* synthetic */ C4577a(C4609l c4609l, C4609l c4609l2, InterfaceC4580c interfaceC4580c, C4609l c4609l3, C4578a c4578a) {
        this(c4609l, c4609l2, interfaceC4580c, c4609l3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4609l m27142e(C4609l c4609l) {
        if (c4609l.compareTo(this.f11382c) < 0) {
            return this.f11382c;
        }
        return c4609l.compareTo(this.f11383d) > 0 ? this.f11383d : c4609l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4577a) {
            C4577a c4577a = (C4577a) obj;
            return this.f11382c.equals(c4577a.f11382c) && this.f11383d.equals(c4577a.f11383d) && C7670c.m17875a(this.f11385f, c4577a.f11385f) && this.f11384e.equals(c4577a.f11384e);
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC4580c m27141f() {
        return this.f11384e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C4609l m27140g() {
        return this.f11383d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m27139h() {
        return this.f11387x;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11382c, this.f11383d, this.f11385f, this.f11384e});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C4609l m27138i() {
        return this.f11385f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C4609l m27137j() {
        return this.f11382c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m27136k() {
        return this.f11386w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11382c, 0);
        parcel.writeParcelable(this.f11383d, 0);
        parcel.writeParcelable(this.f11385f, 0);
        parcel.writeParcelable(this.f11384e, 0);
    }

    private C4577a(C4609l c4609l, C4609l c4609l2, InterfaceC4580c interfaceC4580c, C4609l c4609l3) {
        this.f11382c = c4609l;
        this.f11383d = c4609l2;
        this.f11385f = c4609l3;
        this.f11384e = interfaceC4580c;
        if (c4609l3 != null && c4609l.compareTo(c4609l3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c4609l3 != null && c4609l3.compareTo(c4609l2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f11387x = c4609l.m27054q(c4609l2) + 1;
        this.f11386w = (c4609l2.f11477e - c4609l.f11477e) + 1;
    }
}
