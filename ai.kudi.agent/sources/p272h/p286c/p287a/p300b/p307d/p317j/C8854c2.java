package p272h.p286c.p287a.p300b.p307d.p317j;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.c2 */
/* loaded from: classes2.dex */
public final class C8854c2 extends AbstractC2916a {
    public static final Parcelable.Creator<C8854c2> CREATOR = new C8870d3();

    /* renamed from: c */
    public final PointF[] f20827c;

    /* renamed from: d */
    public final int f20828d;

    public C8854c2(PointF[] pointFArr, int i) {
        this.f20827c = pointFArr;
        this.f20828d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31649q(parcel, 2, this.f20827c, i, false);
        C2917b.m31656j(parcel, 3, this.f20828d);
        C2917b.m31664b(parcel, m31665a);
    }
}
