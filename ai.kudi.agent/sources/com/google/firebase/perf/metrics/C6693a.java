package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Counter.java */
/* renamed from: com.google.firebase.perf.metrics.a */
/* loaded from: classes2.dex */
public class C6693a implements Parcelable {
    public static final Parcelable.Creator<C6693a> CREATOR = new C6694a();

    /* renamed from: c */
    private final String f16093c;

    /* renamed from: d */
    private final AtomicLong f16094d;

    /* compiled from: Counter.java */
    /* renamed from: com.google.firebase.perf.metrics.a$a */
    /* loaded from: classes2.dex */
    class C6694a implements Parcelable.Creator<C6693a> {
        C6694a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6693a createFromParcel(Parcel parcel) {
            return new C6693a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6693a[] newArray(int i) {
            return new C6693a[i];
        }
    }

    /* synthetic */ C6693a(Parcel parcel, C6694a c6694a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m21116a() {
        return this.f16094d.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m21115b() {
        return this.f16093c;
    }

    /* renamed from: c */
    public void m21114c(long j) {
        this.f16094d.addAndGet(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21113d(long j) {
        this.f16094d.set(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16093c);
        parcel.writeLong(this.f16094d.get());
    }

    public C6693a(String str) {
        this.f16093c = str;
        this.f16094d = new AtomicLong(0L);
    }

    private C6693a(Parcel parcel) {
        this.f16093c = parcel.readString();
        this.f16094d = new AtomicLong(parcel.readLong());
    }
}
