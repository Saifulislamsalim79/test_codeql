package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC1449b0;
import androidx.lifecycle.AbstractC1565i;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecordState.java */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes2.dex */
public final class C1461e implements Parcelable {
    public static final Parcelable.Creator<C1461e> CREATOR = new C1462a();

    /* renamed from: A */
    final CharSequence f4505A;

    /* renamed from: B */
    final int f4506B;

    /* renamed from: C */
    final CharSequence f4507C;

    /* renamed from: D */
    final ArrayList<String> f4508D;

    /* renamed from: E */
    final ArrayList<String> f4509E;

    /* renamed from: F */
    final boolean f4510F;

    /* renamed from: c */
    final int[] f4511c;

    /* renamed from: d */
    final ArrayList<String> f4512d;

    /* renamed from: e */
    final int[] f4513e;

    /* renamed from: f */
    final int[] f4514f;

    /* renamed from: w */
    final int f4515w;

    /* renamed from: x */
    final String f4516x;

    /* renamed from: y */
    final int f4517y;

    /* renamed from: z */
    final int f4518z;

    /* compiled from: BackStackRecordState.java */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes2.dex */
    class C1462a implements Parcelable.Creator<C1461e> {
        C1462a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1461e createFromParcel(Parcel parcel) {
            return new C1461e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1461e[] newArray(int i) {
            return new C1461e[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1461e(C1453d c1453d) {
        int size = c1453d.f4460a.size();
        this.f4511c = new int[size * 6];
        if (c1453d.f4466g) {
            this.f4512d = new ArrayList<>(size);
            this.f4513e = new int[size];
            this.f4514f = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                AbstractC1449b0.C1450a c1450a = c1453d.f4460a.get(i);
                int i3 = i2 + 1;
                this.f4511c[i2] = c1450a.f4477a;
                ArrayList<String> arrayList = this.f4512d;
                Fragment fragment = c1450a.f4478b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4511c;
                int i4 = i3 + 1;
                iArr[i3] = c1450a.f4479c ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = c1450a.f4480d;
                int i6 = i5 + 1;
                iArr[i5] = c1450a.f4481e;
                int i7 = i6 + 1;
                iArr[i6] = c1450a.f4482f;
                iArr[i7] = c1450a.f4483g;
                this.f4513e[i] = c1450a.f4484h.ordinal();
                this.f4514f[i] = c1450a.f4485i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f4515w = c1453d.f4465f;
            this.f4516x = c1453d.f4468i;
            this.f4517y = c1453d.f4491t;
            this.f4518z = c1453d.f4469j;
            this.f4505A = c1453d.f4470k;
            this.f4506B = c1453d.f4471l;
            this.f4507C = c1453d.f4472m;
            this.f4508D = c1453d.f4473n;
            this.f4509E = c1453d.f4474o;
            this.f4510F = c1453d.f4475p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    private void m35788a(C1453d c1453d) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f4511c.length) {
                AbstractC1449b0.C1450a c1450a = new AbstractC1449b0.C1450a();
                int i3 = i + 1;
                c1450a.f4477a = this.f4511c[i];
                if (FragmentManager.m35996G0(2)) {
                    Log.v("FragmentManager", "Instantiate " + c1453d + " op #" + i2 + " base fragment #" + this.f4511c[i3]);
                }
                c1450a.f4484h = AbstractC1565i.c.values()[this.f4513e[i2]];
                c1450a.f4485i = AbstractC1565i.c.values()[this.f4514f[i2]];
                int i4 = i3 + 1;
                if (this.f4511c[i3] == 0) {
                    z = false;
                }
                c1450a.f4479c = z;
                int[] iArr = this.f4511c;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                c1450a.f4480d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                c1450a.f4481e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                c1450a.f4482f = i10;
                int i11 = iArr[i9];
                c1450a.f4483g = i11;
                c1453d.f4461b = i6;
                c1453d.f4462c = i8;
                c1453d.f4463d = i10;
                c1453d.f4464e = i11;
                c1453d.m35825f(c1450a);
                i2++;
                i = i9 + 1;
            } else {
                c1453d.f4465f = this.f4515w;
                c1453d.f4468i = this.f4516x;
                c1453d.f4466g = true;
                c1453d.f4469j = this.f4518z;
                c1453d.f4470k = this.f4505A;
                c1453d.f4471l = this.f4506B;
                c1453d.f4472m = this.f4507C;
                c1453d.f4473n = this.f4508D;
                c1453d.f4474o = this.f4509E;
                c1453d.f4475p = this.f4510F;
                return;
            }
        }
    }

    /* renamed from: b */
    public C1453d m35787b(FragmentManager fragmentManager) {
        C1453d c1453d = new C1453d(fragmentManager);
        m35788a(c1453d);
        c1453d.f4491t = this.f4517y;
        for (int i = 0; i < this.f4512d.size(); i++) {
            String str = this.f4512d.get(i);
            if (str != null) {
                c1453d.f4460a.get(i).f4478b = fragmentManager.m35947d0(str);
            }
        }
        c1453d.m35796w(1);
        return c1453d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4511c);
        parcel.writeStringList(this.f4512d);
        parcel.writeIntArray(this.f4513e);
        parcel.writeIntArray(this.f4514f);
        parcel.writeInt(this.f4515w);
        parcel.writeString(this.f4516x);
        parcel.writeInt(this.f4517y);
        parcel.writeInt(this.f4518z);
        TextUtils.writeToParcel(this.f4505A, parcel, 0);
        parcel.writeInt(this.f4506B);
        TextUtils.writeToParcel(this.f4507C, parcel, 0);
        parcel.writeStringList(this.f4508D);
        parcel.writeStringList(this.f4509E);
        parcel.writeInt(this.f4510F ? 1 : 0);
    }

    C1461e(Parcel parcel) {
        this.f4511c = parcel.createIntArray();
        this.f4512d = parcel.createStringArrayList();
        this.f4513e = parcel.createIntArray();
        this.f4514f = parcel.createIntArray();
        this.f4515w = parcel.readInt();
        this.f4516x = parcel.readString();
        this.f4517y = parcel.readInt();
        this.f4518z = parcel.readInt();
        this.f4505A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4506B = parcel.readInt();
        this.f4507C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4508D = parcel.createStringArrayList();
        this.f4509E = parcel.createStringArrayList();
        this.f4510F = parcel.readInt() != 0;
    }
}
