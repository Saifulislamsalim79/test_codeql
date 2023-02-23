package p272h.p286c.p287a.p300b.p307d.p317j;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.ed */
/* loaded from: classes2.dex */
public final class C8895ed extends AbstractC2916a {
    public static final Parcelable.Creator<C8895ed> CREATOR = new C8910fd();

    /* renamed from: A */
    private final float f20926A;

    /* renamed from: B */
    private final List f20927B;

    /* renamed from: C */
    private final List f20928C;

    /* renamed from: c */
    private final int f20929c;

    /* renamed from: d */
    private final Rect f20930d;

    /* renamed from: e */
    private final float f20931e;

    /* renamed from: f */
    private final float f20932f;

    /* renamed from: w */
    private final float f20933w;

    /* renamed from: x */
    private final float f20934x;

    /* renamed from: y */
    private final float f20935y;

    /* renamed from: z */
    private final float f20936z;

    public C8895ed(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.f20929c = i;
        this.f20930d = rect;
        this.f20931e = f;
        this.f20932f = f2;
        this.f20933w = f3;
        this.f20934x = f4;
        this.f20935y = f5;
        this.f20936z = f6;
        this.f20926A = f7;
        this.f20927B = list;
        this.f20928C = list2;
    }

    /* renamed from: E */
    public final int m15750E() {
        return this.f20929c;
    }

    /* renamed from: d0 */
    public final Rect m15749d0() {
        return this.f20930d;
    }

    /* renamed from: e0 */
    public final List m15748e0() {
        return this.f20928C;
    }

    /* renamed from: f */
    public final float m15747f() {
        return this.f20934x;
    }

    /* renamed from: h */
    public final float m15746h() {
        return this.f20932f;
    }

    /* renamed from: h0 */
    public final List m15745h0() {
        return this.f20927B;
    }

    /* renamed from: k */
    public final float m15744k() {
        return this.f20935y;
    }

    /* renamed from: l */
    public final float m15743l() {
        return this.f20931e;
    }

    /* renamed from: s */
    public final float m15742s() {
        return this.f20936z;
    }

    /* renamed from: u */
    public final float m15741u() {
        return this.f20933w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20929c);
        C2917b.m31652n(parcel, 2, this.f20930d, i, false);
        C2917b.m31659g(parcel, 3, this.f20931e);
        C2917b.m31659g(parcel, 4, this.f20932f);
        C2917b.m31659g(parcel, 5, this.f20933w);
        C2917b.m31659g(parcel, 6, this.f20934x);
        C2917b.m31659g(parcel, 7, this.f20935y);
        C2917b.m31659g(parcel, 8, this.f20936z);
        C2917b.m31659g(parcel, 9, this.f20926A);
        C2917b.m31648r(parcel, 10, this.f20927B, false);
        C2917b.m31648r(parcel, 11, this.f20928C, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
