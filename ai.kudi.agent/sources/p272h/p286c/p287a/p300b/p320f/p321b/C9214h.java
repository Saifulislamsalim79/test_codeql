package p272h.p286c.p287a.p300b.p320f.p321b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.h */
/* loaded from: classes2.dex */
public final class C9214h extends AbstractC2916a implements InterfaceC2748h {
    public static final Parcelable.Creator<C9214h> CREATOR = new C9215i();

    /* renamed from: c */
    private final List<String> f21611c;

    /* renamed from: d */
    private final String f21612d;

    public C9214h(List<String> list, String str) {
        this.f21611c = list;
        this.f21612d = str;
    }

    @Override // com.google.android.gms.common.api.InterfaceC2748h
    public final Status getStatus() {
        return this.f21612d != null ? Status.f7692x : Status.f7691A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31650p(parcel, 1, this.f21611c, false);
        C2917b.m31651o(parcel, 2, this.f21612d, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
