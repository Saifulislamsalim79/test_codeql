package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.location.BinderC4137x;
import com.google.android.gms.location.InterfaceC4136w;
/* renamed from: h.c.a.b.d.g.d0 */
/* loaded from: classes2.dex */
public final class C8461d0 extends AbstractC2916a {
    public static final Parcelable.Creator<C8461d0> CREATOR = new C8463e0();

    /* renamed from: c */
    private int f20161c;

    /* renamed from: d */
    private C8457b0 f20162d;

    /* renamed from: e */
    private InterfaceC4136w f20163e;

    /* renamed from: f */
    private InterfaceC8456b f20164f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8461d0(int i, C8457b0 c8457b0, IBinder iBinder, IBinder iBinder2) {
        this.f20161c = i;
        this.f20162d = c8457b0;
        InterfaceC8456b interfaceC8456b = null;
        this.f20163e = iBinder == null ? null : BinderC4137x.m28488n(iBinder);
        if (iBinder2 != null && iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC8456b = queryLocalInterface instanceof InterfaceC8456b ? (InterfaceC8456b) queryLocalInterface : new C8458c(iBinder2);
        }
        this.f20164f = interfaceC8456b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20161c);
        C2917b.m31652n(parcel, 2, this.f20162d, i, false);
        InterfaceC4136w interfaceC4136w = this.f20163e;
        C2917b.m31657i(parcel, 3, interfaceC4136w == null ? null : interfaceC4136w.asBinder(), false);
        InterfaceC8456b interfaceC8456b = this.f20164f;
        C2917b.m31657i(parcel, 4, interfaceC8456b != null ? interfaceC8456b.asBinder() : null, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
