package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1565i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentState.java */
/* renamed from: androidx.fragment.app.x */
/* loaded from: classes2.dex */
public final class C1524x implements Parcelable {
    public static final Parcelable.Creator<C1524x> CREATOR = new C1525a();

    /* renamed from: A */
    final boolean f4672A;

    /* renamed from: B */
    final Bundle f4673B;

    /* renamed from: C */
    final boolean f4674C;

    /* renamed from: D */
    final int f4675D;

    /* renamed from: E */
    Bundle f4676E;

    /* renamed from: c */
    final String f4677c;

    /* renamed from: d */
    final String f4678d;

    /* renamed from: e */
    final boolean f4679e;

    /* renamed from: f */
    final int f4680f;

    /* renamed from: w */
    final int f4681w;

    /* renamed from: x */
    final String f4682x;

    /* renamed from: y */
    final boolean f4683y;

    /* renamed from: z */
    final boolean f4684z;

    /* compiled from: FragmentState.java */
    /* renamed from: androidx.fragment.app.x$a */
    /* loaded from: classes2.dex */
    class C1525a implements Parcelable.Creator<C1524x> {
        C1525a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1524x createFromParcel(Parcel parcel) {
            return new C1524x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1524x[] newArray(int i) {
            return new C1524x[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1524x(Fragment fragment) {
        this.f4677c = fragment.getClass().getName();
        this.f4678d = fragment.mWho;
        this.f4679e = fragment.mFromLayout;
        this.f4680f = fragment.mFragmentId;
        this.f4681w = fragment.mContainerId;
        this.f4682x = fragment.mTag;
        this.f4683y = fragment.mRetainInstance;
        this.f4684z = fragment.mRemoving;
        this.f4672A = fragment.mDetached;
        this.f4673B = fragment.mArguments;
        this.f4674C = fragment.mHidden;
        this.f4675D = fragment.mMaxState.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment m35610a(C1504n c1504n, ClassLoader classLoader) {
        Fragment mo35684a = c1504n.mo35684a(classLoader, this.f4677c);
        Bundle bundle = this.f4673B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo35684a.setArguments(this.f4673B);
        mo35684a.mWho = this.f4678d;
        mo35684a.mFromLayout = this.f4679e;
        mo35684a.mRestored = true;
        mo35684a.mFragmentId = this.f4680f;
        mo35684a.mContainerId = this.f4681w;
        mo35684a.mTag = this.f4682x;
        mo35684a.mRetainInstance = this.f4683y;
        mo35684a.mRemoving = this.f4684z;
        mo35684a.mDetached = this.f4672A;
        mo35684a.mHidden = this.f4674C;
        mo35684a.mMaxState = AbstractC1565i.c.values()[this.f4675D];
        Bundle bundle2 = this.f4676E;
        if (bundle2 != null) {
            mo35684a.mSavedFragmentState = bundle2;
        } else {
            mo35684a.mSavedFragmentState = new Bundle();
        }
        return mo35684a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4677c);
        sb.append(" (");
        sb.append(this.f4678d);
        sb.append(")}:");
        if (this.f4679e) {
            sb.append(" fromLayout");
        }
        if (this.f4681w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4681w));
        }
        String str = this.f4682x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4682x);
        }
        if (this.f4683y) {
            sb.append(" retainInstance");
        }
        if (this.f4684z) {
            sb.append(" removing");
        }
        if (this.f4672A) {
            sb.append(" detached");
        }
        if (this.f4674C) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4677c);
        parcel.writeString(this.f4678d);
        parcel.writeInt(this.f4679e ? 1 : 0);
        parcel.writeInt(this.f4680f);
        parcel.writeInt(this.f4681w);
        parcel.writeString(this.f4682x);
        parcel.writeInt(this.f4683y ? 1 : 0);
        parcel.writeInt(this.f4684z ? 1 : 0);
        parcel.writeInt(this.f4672A ? 1 : 0);
        parcel.writeBundle(this.f4673B);
        parcel.writeInt(this.f4674C ? 1 : 0);
        parcel.writeBundle(this.f4676E);
        parcel.writeInt(this.f4675D);
    }

    C1524x(Parcel parcel) {
        this.f4677c = parcel.readString();
        this.f4678d = parcel.readString();
        this.f4679e = parcel.readInt() != 0;
        this.f4680f = parcel.readInt();
        this.f4681w = parcel.readInt();
        this.f4682x = parcel.readString();
        this.f4683y = parcel.readInt() != 0;
        this.f4684z = parcel.readInt() != 0;
        this.f4672A = parcel.readInt() != 0;
        this.f4673B = parcel.readBundle();
        this.f4674C = parcel.readInt() != 0;
        this.f4676E = parcel.readBundle();
        this.f4675D = parcel.readInt();
    }
}
