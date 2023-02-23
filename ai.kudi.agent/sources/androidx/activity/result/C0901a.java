package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ActivityResult.java */
/* renamed from: androidx.activity.result.a */
/* loaded from: classes2.dex */
public final class C0901a implements Parcelable {
    public static final Parcelable.Creator<C0901a> CREATOR = new C0902a();

    /* renamed from: c */
    private final int f2411c;

    /* renamed from: d */
    private final Intent f2412d;

    /* compiled from: ActivityResult.java */
    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes2.dex */
    class C0902a implements Parcelable.Creator<C0901a> {
        C0902a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0901a createFromParcel(Parcel parcel) {
            return new C0901a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0901a[] newArray(int i) {
            return new C0901a[i];
        }
    }

    public C0901a(int i, Intent intent) {
        this.f2411c = i;
        this.f2412d = intent;
    }

    /* renamed from: c */
    public static String m37856c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m37858a() {
        return this.f2412d;
    }

    /* renamed from: b */
    public int m37857b() {
        return this.f2411c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m37856c(this.f2411c) + ", data=" + this.f2412d + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2411c);
        parcel.writeInt(this.f2412d == null ? 0 : 1);
        Intent intent = this.f2412d;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    C0901a(Parcel parcel) {
        this.f2411c = parcel.readInt();
        this.f2412d = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
