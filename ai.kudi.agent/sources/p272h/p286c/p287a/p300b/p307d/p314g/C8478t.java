package p272h.p286c.p287a.p300b.p307d.p314g;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.location.AbstractBinderC4108a0;
import com.google.android.gms.location.AbstractBinderC4116d0;
import com.google.android.gms.location.InterfaceC4114c0;
import com.google.android.gms.location.InterfaceC4139z;
/* renamed from: h.c.a.b.d.g.t */
/* loaded from: classes2.dex */
public final class C8478t extends AbstractC2916a {
    public static final Parcelable.Creator<C8478t> CREATOR = new C8479u();

    /* renamed from: c */
    private int f20184c;

    /* renamed from: d */
    private C8476r f20185d;

    /* renamed from: e */
    private InterfaceC4114c0 f20186e;

    /* renamed from: f */
    private PendingIntent f20187f;

    /* renamed from: w */
    private InterfaceC4139z f20188w;

    /* renamed from: x */
    private InterfaceC8456b f20189x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8478t(int i, C8476r c8476r, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f20184c = i;
        this.f20185d = c8476r;
        InterfaceC8456b interfaceC8456b = null;
        this.f20186e = iBinder == null ? null : AbstractBinderC4116d0.m28498n(iBinder);
        this.f20187f = pendingIntent;
        this.f20188w = iBinder2 == null ? null : AbstractBinderC4108a0.m28504n(iBinder2);
        if (iBinder3 != null && iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            interfaceC8456b = queryLocalInterface instanceof InterfaceC8456b ? (InterfaceC8456b) queryLocalInterface : new C8458c(iBinder3);
        }
        this.f20189x = interfaceC8456b;
    }

    /* renamed from: f */
    public static C8478t m16054f(InterfaceC4139z interfaceC4139z, InterfaceC8456b interfaceC8456b) {
        return new C8478t(2, null, null, null, interfaceC4139z.asBinder(), interfaceC8456b != null ? interfaceC8456b.asBinder() : null);
    }

    /* renamed from: h */
    public static C8478t m16053h(InterfaceC4114c0 interfaceC4114c0, InterfaceC8456b interfaceC8456b) {
        return new C8478t(2, null, interfaceC4114c0.asBinder(), null, null, interfaceC8456b != null ? interfaceC8456b.asBinder() : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f20184c);
        C2917b.m31652n(parcel, 2, this.f20185d, i, false);
        InterfaceC4114c0 interfaceC4114c0 = this.f20186e;
        C2917b.m31657i(parcel, 3, interfaceC4114c0 == null ? null : interfaceC4114c0.asBinder(), false);
        C2917b.m31652n(parcel, 4, this.f20187f, i, false);
        InterfaceC4139z interfaceC4139z = this.f20188w;
        C2917b.m31657i(parcel, 5, interfaceC4139z == null ? null : interfaceC4139z.asBinder(), false);
        InterfaceC8456b interfaceC8456b = this.f20189x;
        C2917b.m31657i(parcel, 6, interfaceC8456b != null ? interfaceC8456b.asBinder() : null, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
