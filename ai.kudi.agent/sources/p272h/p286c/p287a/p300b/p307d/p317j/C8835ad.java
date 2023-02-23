package p272h.p286c.p287a.p300b.p307d.p317j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.ad */
/* loaded from: classes2.dex */
public final class C8835ad extends AbstractC2916a {
    public static final Parcelable.Creator<C8835ad> CREATOR = new C8850bd();

    /* renamed from: c */
    private final int f20809c;

    /* renamed from: d */
    private final List f20810d;

    public C8835ad(int i, List list) {
        this.f20809c = i;
        this.f20810d = list;
    }

    /* renamed from: f */
    public final int m15815f() {
        return this.f20809c;
    }

    /* renamed from: h */
    public final List m15814h() {
        return this.f20810d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20809c);
        C2917b.m31648r(parcel, 2, this.f20810d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
