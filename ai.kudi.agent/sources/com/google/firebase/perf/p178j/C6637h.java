package com.google.firebase.perf.p178j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;
/* compiled from: Timer.java */
/* renamed from: com.google.firebase.perf.j.h */
/* loaded from: classes2.dex */
public class C6637h implements Parcelable {
    public static final Parcelable.Creator<C6637h> CREATOR = new C6638a();

    /* renamed from: c */
    private long f16013c;

    /* renamed from: d */
    private long f16014d;

    /* compiled from: Timer.java */
    /* renamed from: com.google.firebase.perf.j.h$a */
    /* loaded from: classes2.dex */
    class C6638a implements Parcelable.Creator<C6637h> {
        C6638a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6637h createFromParcel(Parcel parcel) {
            return new C6637h(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6637h[] newArray(int i) {
            return new C6637h[i];
        }
    }

    /* synthetic */ C6637h(Parcel parcel, C6638a c6638a) {
        this(parcel);
    }

    /* renamed from: a */
    public long m21402a() {
        return this.f16013c + m21401b();
    }

    /* renamed from: b */
    public long m21401b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.f16014d);
    }

    /* renamed from: c */
    public long m21400c(C6637h c6637h) {
        return TimeUnit.NANOSECONDS.toMicros(c6637h.f16014d - this.f16014d);
    }

    /* renamed from: d */
    public long m21399d() {
        return this.f16013c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m21398e() {
        this.f16013c = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f16014d = System.nanoTime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16013c);
        parcel.writeLong(this.f16014d);
    }

    public C6637h() {
        this.f16013c = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f16014d = System.nanoTime();
    }

    public C6637h(long j) {
        this.f16013c = j;
        this.f16014d = TimeUnit.MICROSECONDS.toNanos(j);
    }

    private C6637h(Parcel parcel) {
        this.f16013c = parcel.readLong();
        this.f16014d = parcel.readLong();
    }
}
