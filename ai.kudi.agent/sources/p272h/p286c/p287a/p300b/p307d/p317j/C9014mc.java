package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.mc */
/* loaded from: classes2.dex */
public final class C9014mc extends AbstractC2916a {
    public static final Parcelable.Creator<C9014mc> CREATOR = new C9015md();

    /* renamed from: c */
    public final int f21306c;

    /* renamed from: d */
    public final float f21307d;

    /* renamed from: e */
    public final float f21308e;

    /* renamed from: f */
    public final int f21309f;

    public C9014mc(int i, float f, float f2, int i2) {
        this.f21306c = i;
        this.f21307d = f;
        this.f21308e = f2;
        this.f21309f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21306c);
        C2917b.m31659g(parcel, 2, this.f21307d);
        C2917b.m31659g(parcel, 3, this.f21308e);
        C2917b.m31656j(parcel, 4, this.f21309f);
        C2917b.m31664b(parcel, m31665a);
    }
}
