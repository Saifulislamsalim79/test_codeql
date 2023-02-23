package p272h.p286c.p287a.p300b.p307d.p317j;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.kd */
/* loaded from: classes2.dex */
public final class C8985kd extends AbstractC2916a {
    public static final Parcelable.Creator<C8985kd> CREATOR = new C9000ld();

    /* renamed from: c */
    private final int f21096c;

    /* renamed from: d */
    private final PointF f21097d;

    public C8985kd(int i, PointF pointF) {
        this.f21096c = i;
        this.f21097d = pointF;
    }

    /* renamed from: f */
    public final int m15670f() {
        return this.f21096c;
    }

    /* renamed from: h */
    public final PointF m15669h() {
        return this.f21097d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21096c);
        C2917b.m31652n(parcel, 2, this.f21097d, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
