package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.cd */
/* loaded from: classes2.dex */
public final class C8865cd extends AbstractC2916a {
    public static final Parcelable.Creator<C8865cd> CREATOR = new C8880dd();

    /* renamed from: c */
    private final int f20849c;

    /* renamed from: d */
    private final int f20850d;

    /* renamed from: e */
    private final int f20851e;

    /* renamed from: f */
    private final int f20852f;

    /* renamed from: w */
    private final boolean f20853w;

    /* renamed from: x */
    private final float f20854x;

    public C8865cd(int i, int i2, int i3, int i4, boolean z, float f) {
        this.f20849c = i;
        this.f20850d = i2;
        this.f20851e = i3;
        this.f20852f = i4;
        this.f20853w = z;
        this.f20854x = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20849c);
        C2917b.m31656j(parcel, 2, this.f20850d);
        C2917b.m31656j(parcel, 3, this.f20851e);
        C2917b.m31656j(parcel, 4, this.f20852f);
        C2917b.m31663c(parcel, 5, this.f20853w);
        C2917b.m31659g(parcel, 6, this.f20854x);
        C2917b.m31664b(parcel, m31665a);
    }
}
