package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: ParcelableSparseArray.java */
/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes2.dex */
public class C4680j extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C4680j> CREATOR = new C4681a();

    /* compiled from: ParcelableSparseArray.java */
    /* renamed from: com.google.android.material.internal.j$a */
    /* loaded from: classes2.dex */
    static class C4681a implements Parcelable.ClassLoaderCreator<C4680j> {
        C4681a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4680j createFromParcel(Parcel parcel) {
            return new C4680j(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public C4680j createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C4680j(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public C4680j[] newArray(int i) {
            return new C4680j[i];
        }
    }

    public C4680j() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public C4680j(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }
}
