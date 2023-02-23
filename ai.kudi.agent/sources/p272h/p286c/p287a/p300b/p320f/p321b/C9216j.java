package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2914s0;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.j */
/* loaded from: classes2.dex */
public final class C9216j extends AbstractC2916a {
    public static final Parcelable.Creator<C9216j> CREATOR = new C9217k();

    /* renamed from: c */
    final int f21613c;

    /* renamed from: d */
    final C2914s0 f21614d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9216j(int i, C2914s0 c2914s0) {
        this.f21613c = i;
        this.f21614d = c2914s0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21613c);
        C2917b.m31652n(parcel, 2, this.f21614d, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
