package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerState.java */
/* renamed from: androidx.fragment.app.s */
/* loaded from: classes2.dex */
public final class C1511s implements Parcelable {
    public static final Parcelable.Creator<C1511s> CREATOR = new C1512a();

    /* renamed from: A */
    ArrayList<String> f4633A;

    /* renamed from: B */
    ArrayList<Bundle> f4634B;

    /* renamed from: C */
    ArrayList<FragmentManager.C1440k> f4635C;

    /* renamed from: c */
    ArrayList<C1524x> f4636c;

    /* renamed from: d */
    ArrayList<String> f4637d;

    /* renamed from: e */
    ArrayList<String> f4638e;

    /* renamed from: f */
    C1461e[] f4639f;

    /* renamed from: w */
    int f4640w;

    /* renamed from: x */
    String f4641x;

    /* renamed from: y */
    ArrayList<String> f4642y;

    /* renamed from: z */
    ArrayList<C1465f> f4643z;

    /* compiled from: FragmentManagerState.java */
    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: classes2.dex */
    class C1512a implements Parcelable.Creator<C1511s> {
        C1512a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1511s createFromParcel(Parcel parcel) {
            return new C1511s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1511s[] newArray(int i) {
            return new C1511s[i];
        }
    }

    public C1511s() {
        this.f4641x = null;
        this.f4642y = new ArrayList<>();
        this.f4643z = new ArrayList<>();
        this.f4633A = new ArrayList<>();
        this.f4634B = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f4636c);
        parcel.writeStringList(this.f4637d);
        parcel.writeStringList(this.f4638e);
        parcel.writeTypedArray(this.f4639f, i);
        parcel.writeInt(this.f4640w);
        parcel.writeString(this.f4641x);
        parcel.writeStringList(this.f4642y);
        parcel.writeTypedList(this.f4643z);
        parcel.writeStringList(this.f4633A);
        parcel.writeTypedList(this.f4634B);
        parcel.writeTypedList(this.f4635C);
    }

    public C1511s(Parcel parcel) {
        this.f4641x = null;
        this.f4642y = new ArrayList<>();
        this.f4643z = new ArrayList<>();
        this.f4633A = new ArrayList<>();
        this.f4634B = new ArrayList<>();
        this.f4636c = parcel.createTypedArrayList(C1524x.CREATOR);
        this.f4637d = parcel.createStringArrayList();
        this.f4638e = parcel.createStringArrayList();
        this.f4639f = (C1461e[]) parcel.createTypedArray(C1461e.CREATOR);
        this.f4640w = parcel.readInt();
        this.f4641x = parcel.readString();
        this.f4642y = parcel.createStringArrayList();
        this.f4643z = parcel.createTypedArrayList(C1465f.CREATOR);
        this.f4633A = parcel.createStringArrayList();
        this.f4634B = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4635C = parcel.createTypedArrayList(FragmentManager.C1440k.CREATOR);
    }
}
