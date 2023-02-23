package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.yc */
/* loaded from: classes2.dex */
public final class C9189yc extends AbstractC2916a {
    public static final Parcelable.Creator<C9189yc> CREATOR = new C9203zc();

    /* renamed from: c */
    private final int f21568c;

    /* renamed from: d */
    private final int f21569d;

    /* renamed from: e */
    private final int f21570e;

    /* renamed from: f */
    private final int f21571f;

    /* renamed from: w */
    private final long f21572w;

    public C9189yc(int i, int i2, int i3, int i4, long j) {
        this.f21568c = i;
        this.f21569d = i2;
        this.f21570e = i3;
        this.f21571f = i4;
        this.f21572w = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21568c);
        C2917b.m31656j(parcel, 2, this.f21569d);
        C2917b.m31656j(parcel, 3, this.f21570e);
        C2917b.m31656j(parcel, 4, this.f21571f);
        C2917b.m31654l(parcel, 5, this.f21572w);
        C2917b.m31664b(parcel, m31665a);
    }
}
