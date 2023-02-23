package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: IntentSenderRequest.java */
/* renamed from: androidx.activity.result.e */
/* loaded from: classes2.dex */
public final class C0905e implements Parcelable {
    public static final Parcelable.Creator<C0905e> CREATOR = new C0906a();

    /* renamed from: c */
    private final IntentSender f2413c;

    /* renamed from: d */
    private final Intent f2414d;

    /* renamed from: e */
    private final int f2415e;

    /* renamed from: f */
    private final int f2416f;

    /* compiled from: IntentSenderRequest.java */
    /* renamed from: androidx.activity.result.e$a */
    /* loaded from: classes2.dex */
    class C0906a implements Parcelable.Creator<C0905e> {
        C0906a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0905e createFromParcel(Parcel parcel) {
            return new C0905e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0905e[] newArray(int i) {
            return new C0905e[i];
        }
    }

    /* compiled from: IntentSenderRequest.java */
    /* renamed from: androidx.activity.result.e$b */
    /* loaded from: classes2.dex */
    public static final class C0907b {

        /* renamed from: a */
        private IntentSender f2417a;

        /* renamed from: b */
        private Intent f2418b;

        /* renamed from: c */
        private int f2419c;

        /* renamed from: d */
        private int f2420d;

        public C0907b(IntentSender intentSender) {
            this.f2417a = intentSender;
        }

        /* renamed from: a */
        public C0905e m37846a() {
            return new C0905e(this.f2417a, this.f2418b, this.f2419c, this.f2420d);
        }

        /* renamed from: b */
        public C0907b m37845b(Intent intent) {
            this.f2418b = intent;
            return this;
        }

        /* renamed from: c */
        public C0907b m37844c(int i, int i2) {
            this.f2420d = i;
            this.f2419c = i2;
            return this;
        }
    }

    C0905e(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f2413c = intentSender;
        this.f2414d = intent;
        this.f2415e = i;
        this.f2416f = i2;
    }

    /* renamed from: a */
    public Intent m37852a() {
        return this.f2414d;
    }

    /* renamed from: b */
    public int m37851b() {
        return this.f2415e;
    }

    /* renamed from: c */
    public int m37850c() {
        return this.f2416f;
    }

    /* renamed from: d */
    public IntentSender m37849d() {
        return this.f2413c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2413c, i);
        parcel.writeParcelable(this.f2414d, i);
        parcel.writeInt(this.f2415e);
        parcel.writeInt(this.f2416f);
    }

    C0905e(Parcel parcel) {
        this.f2413c = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f2414d = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f2415e = parcel.readInt();
        this.f2416f = parcel.readInt();
    }
}
