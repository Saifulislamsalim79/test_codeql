package p272h.p286c.p287a.p323c.p327d0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p201g.p218e.C7534g;
import p201g.p243j.p244a.AbstractC7781a;
/* compiled from: ExtendableSavedState.java */
/* renamed from: h.c.a.c.d0.a */
/* loaded from: classes2.dex */
public class C9268a extends AbstractC7781a {
    public static final Parcelable.Creator<C9268a> CREATOR = new C9269a();

    /* renamed from: e */
    public final C7534g<String, Bundle> f21785e;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: h.c.a.c.d0.a$a */
    /* loaded from: classes2.dex */
    static class C9269a implements Parcelable.ClassLoaderCreator<C9268a> {
        C9269a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9268a createFromParcel(Parcel parcel) {
            return new C9268a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public C9268a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C9268a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public C9268a[] newArray(int i) {
            return new C9268a[i];
        }
    }

    /* synthetic */ C9268a(Parcel parcel, ClassLoader classLoader, C9269a c9269a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f21785e + "}";
    }

    @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f21785e.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f21785e.m18452k(i2);
            bundleArr[i2] = this.f21785e.m18448o(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C9268a(Parcelable parcelable) {
        super(parcelable);
        this.f21785e = new C7534g<>();
    }

    private C9268a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f21785e = new C7534g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f21785e.put(strArr[i], bundleArr[i]);
        }
    }
}
