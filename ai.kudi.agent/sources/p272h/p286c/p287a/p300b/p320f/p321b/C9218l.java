package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.C2924u0;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.l */
/* loaded from: classes2.dex */
public final class C9218l extends AbstractC2916a {
    public static final Parcelable.Creator<C9218l> CREATOR = new C9219m();

    /* renamed from: c */
    final int f21615c;

    /* renamed from: d */
    private final C2826b f21616d;

    /* renamed from: e */
    private final C2924u0 f21617e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9218l(int i, C2826b c2826b, C2924u0 c2924u0) {
        this.f21615c = i;
        this.f21616d = c2826b;
        this.f21617e = c2924u0;
    }

    /* renamed from: f */
    public final C2826b m15461f() {
        return this.f21616d;
    }

    /* renamed from: h */
    public final C2924u0 m15460h() {
        return this.f21617e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21615c);
        C2917b.m31652n(parcel, 2, this.f21616d, i, false);
        C2917b.m31652n(parcel, 3, this.f21617e, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
