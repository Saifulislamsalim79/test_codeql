package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.nd */
/* loaded from: classes2.dex */
public final class C9030nd extends AbstractC2916a {
    public static final Parcelable.Creator<C9030nd> CREATOR = new C9045od();

    /* renamed from: c */
    public int f21329c;

    /* renamed from: d */
    public int f21330d;

    /* renamed from: e */
    public int f21331e;

    /* renamed from: f */
    public long f21332f;

    /* renamed from: w */
    public int f21333w;

    public C9030nd(int i, int i2, int i3, long j, int i4) {
        this.f21329c = i;
        this.f21330d = i2;
        this.f21331e = i3;
        this.f21332f = j;
        this.f21333w = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 2, this.f21329c);
        C2917b.m31656j(parcel, 3, this.f21330d);
        C2917b.m31656j(parcel, 4, this.f21331e);
        C2917b.m31654l(parcel, 5, this.f21332f);
        C2917b.m31656j(parcel, 6, this.f21333w);
        C2917b.m31664b(parcel, m31665a);
    }
}
