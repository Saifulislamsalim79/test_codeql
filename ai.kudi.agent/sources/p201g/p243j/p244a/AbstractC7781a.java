package p201g.p243j.p244a;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: AbsSavedState.java */
/* renamed from: g.j.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7781a implements Parcelable {

    /* renamed from: c */
    private final Parcelable f18552c;

    /* renamed from: d */
    public static final AbstractC7781a f18551d = new C7782a();
    public static final Parcelable.Creator<AbstractC7781a> CREATOR = new C7783b();

    /* compiled from: AbsSavedState.java */
    /* renamed from: g.j.a.a$a */
    /* loaded from: classes2.dex */
    static class C7782a extends AbstractC7781a {
        C7782a() {
            super((C7782a) null);
        }
    }

    /* compiled from: AbsSavedState.java */
    /* renamed from: g.j.a.a$b */
    /* loaded from: classes2.dex */
    static class C7783b implements Parcelable.ClassLoaderCreator<AbstractC7781a> {
        C7783b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbstractC7781a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbstractC7781a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC7781a.f18551d;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbstractC7781a[] newArray(int i) {
            return new AbstractC7781a[i];
        }
    }

    /* synthetic */ AbstractC7781a(C7782a c7782a) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m17424a() {
        return this.f18552c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18552c, i);
    }

    private AbstractC7781a() {
        this.f18552c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7781a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f18552c = parcelable == f18551d ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7781a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f18552c = readParcelable == null ? f18551d : readParcelable;
    }
}
