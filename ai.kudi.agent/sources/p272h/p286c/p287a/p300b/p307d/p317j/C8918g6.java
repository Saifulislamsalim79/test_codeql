package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.g6 */
/* loaded from: classes2.dex */
public final class C8918g6 extends AbstractC2916a {
    public static final Parcelable.Creator<C8918g6> CREATOR = new C8934h7();

    /* renamed from: c */
    public int f20963c;

    /* renamed from: d */
    public int f20964d;

    /* renamed from: e */
    public int f20965e;

    /* renamed from: f */
    public boolean f20966f;

    /* renamed from: w */
    public boolean f20967w;

    /* renamed from: x */
    public float f20968x;

    public C8918g6(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f20963c = i;
        this.f20964d = i2;
        this.f20965e = i3;
        this.f20966f = z;
        this.f20967w = z2;
        this.f20968x = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 2, this.f20963c);
        C2917b.m31656j(parcel, 3, this.f20964d);
        C2917b.m31656j(parcel, 4, this.f20965e);
        C2917b.m31663c(parcel, 5, this.f20966f);
        C2917b.m31663c(parcel, 6, this.f20967w);
        C2917b.m31659g(parcel, 7, this.f20968x);
        C2917b.m31664b(parcel, m31665a);
    }
}
