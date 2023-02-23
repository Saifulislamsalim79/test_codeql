package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p201g.p218e.C7521a;
/* compiled from: VersionedParcelParcel.java */
/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes2.dex */
class C1887a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f5755d;

    /* renamed from: e */
    private final Parcel f5756e;

    /* renamed from: f */
    private final int f5757f;

    /* renamed from: g */
    private final int f5758g;

    /* renamed from: h */
    private final String f5759h;

    /* renamed from: i */
    private int f5760i;

    /* renamed from: j */
    private int f5761j;

    /* renamed from: k */
    private int f5762k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1887a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C7521a(), new C7521a(), new C7521a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: A */
    public void mo34298A(byte[] bArr) {
        if (bArr != null) {
            this.f5756e.writeInt(bArr.length);
            this.f5756e.writeByteArray(bArr);
            return;
        }
        this.f5756e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: C */
    protected void mo34297C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5756e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: E */
    public void mo34296E(int i) {
        this.f5756e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: G */
    public void mo34295G(Parcelable parcelable) {
        this.f5756e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: I */
    public void mo34294I(String str) {
        this.f5756e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo34293a() {
        int i = this.f5760i;
        if (i >= 0) {
            int i2 = this.f5755d.get(i);
            int dataPosition = this.f5756e.dataPosition();
            this.f5756e.setDataPosition(i2);
            this.f5756e.writeInt(dataPosition - i2);
            this.f5756e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    protected VersionedParcel mo34292b() {
        Parcel parcel = this.f5756e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5761j;
        if (i == this.f5757f) {
            i = this.f5758g;
        }
        int i2 = i;
        return new C1887a(parcel, dataPosition, i2, this.f5759h + "  ", this.f5752a, this.f5753b, this.f5754c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo34291g() {
        return this.f5756e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public byte[] mo34290i() {
        int readInt = this.f5756e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5756e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    protected CharSequence mo34289k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5756e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public boolean mo34288m(int i) {
        while (this.f5761j < this.f5758g) {
            int i2 = this.f5762k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f5756e.setDataPosition(this.f5761j);
            int readInt = this.f5756e.readInt();
            this.f5762k = this.f5756e.readInt();
            this.f5761j += readInt;
        }
        return this.f5762k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public int mo34287o() {
        return this.f5756e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public <T extends Parcelable> T mo34286q() {
        return (T) this.f5756e.readParcelable(C1887a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public String mo34285s() {
        return this.f5756e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo34284w(int i) {
        mo34293a();
        this.f5760i = i;
        this.f5755d.put(i, this.f5756e.dataPosition());
        mo34296E(0);
        mo34296E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: y */
    public void mo34283y(boolean z) {
        this.f5756e.writeInt(z ? 1 : 0);
    }

    private C1887a(Parcel parcel, int i, int i2, String str, C7521a<String, Method> c7521a, C7521a<String, Method> c7521a2, C7521a<String, Class> c7521a3) {
        super(c7521a, c7521a2, c7521a3);
        this.f5755d = new SparseIntArray();
        this.f5760i = -1;
        this.f5761j = 0;
        this.f5762k = -1;
        this.f5756e = parcel;
        this.f5757f = i;
        this.f5758g = i2;
        this.f5761j = i;
        this.f5759h = str;
    }
}
