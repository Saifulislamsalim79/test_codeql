package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e4 */
/* loaded from: classes2.dex */
public final class C8886e4 extends AbstractC2916a {
    public static final Parcelable.Creator<C8886e4> CREATOR = new C8902f5();

    /* renamed from: A */
    public final float f20874A;

    /* renamed from: B */
    public final C9014mc[] f20875B;

    /* renamed from: C */
    public final float f20876C;

    /* renamed from: D */
    public final float f20877D;

    /* renamed from: E */
    public final float f20878E;

    /* renamed from: F */
    public final C8854c2[] f20879F;

    /* renamed from: G */
    public final float f20880G;

    /* renamed from: c */
    public final int f20881c;

    /* renamed from: d */
    public final int f20882d;

    /* renamed from: e */
    public final float f20883e;

    /* renamed from: f */
    public final float f20884f;

    /* renamed from: w */
    public final float f20885w;

    /* renamed from: x */
    public final float f20886x;

    /* renamed from: y */
    public final float f20887y;

    /* renamed from: z */
    public final float f20888z;

    public C8886e4(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, C9014mc[] c9014mcArr, float f8, float f9, float f10, C8854c2[] c8854c2Arr, float f11) {
        this.f20881c = i;
        this.f20882d = i2;
        this.f20883e = f;
        this.f20884f = f2;
        this.f20885w = f3;
        this.f20886x = f4;
        this.f20887y = f5;
        this.f20888z = f6;
        this.f20874A = f7;
        this.f20875B = c9014mcArr;
        this.f20876C = f8;
        this.f20877D = f9;
        this.f20878E = f10;
        this.f20879F = c8854c2Arr;
        this.f20880G = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20881c);
        C2917b.m31656j(parcel, 2, this.f20882d);
        C2917b.m31659g(parcel, 3, this.f20883e);
        C2917b.m31659g(parcel, 4, this.f20884f);
        C2917b.m31659g(parcel, 5, this.f20885w);
        C2917b.m31659g(parcel, 6, this.f20886x);
        C2917b.m31659g(parcel, 7, this.f20887y);
        C2917b.m31659g(parcel, 8, this.f20888z);
        C2917b.m31649q(parcel, 9, this.f20875B, i, false);
        C2917b.m31659g(parcel, 10, this.f20876C);
        C2917b.m31659g(parcel, 11, this.f20877D);
        C2917b.m31659g(parcel, 12, this.f20878E);
        C2917b.m31649q(parcel, 13, this.f20879F, i, false);
        C2917b.m31659g(parcel, 14, this.f20874A);
        C2917b.m31659g(parcel, 15, this.f20880G);
        C2917b.m31664b(parcel, m31665a);
    }
}
