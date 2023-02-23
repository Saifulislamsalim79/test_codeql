package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackState.java */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes2.dex */
public class C1465f implements Parcelable {
    public static final Parcelable.Creator<C1465f> CREATOR = new C1466a();

    /* renamed from: c */
    final List<String> f4524c;

    /* renamed from: d */
    final List<C1461e> f4525d;

    /* compiled from: BackStackState.java */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes2.dex */
    class C1466a implements Parcelable.Creator<C1465f> {
        C1466a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1465f createFromParcel(Parcel parcel) {
            return new C1465f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1465f[] newArray(int i) {
            return new C1465f[i];
        }
    }

    C1465f(Parcel parcel) {
        this.f4524c = parcel.createStringArrayList();
        this.f4525d = parcel.createTypedArrayList(C1461e.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4524c);
        parcel.writeTypedList(this.f4525d);
    }
}
