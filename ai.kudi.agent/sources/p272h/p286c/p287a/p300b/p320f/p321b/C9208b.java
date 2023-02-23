package p272h.p286c.p287a.p300b.p320f.p321b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.b */
/* loaded from: classes2.dex */
public final class C9208b extends AbstractC2916a implements InterfaceC2748h {
    public static final Parcelable.Creator<C9208b> CREATOR = new C9209c();

    /* renamed from: c */
    final int f21608c;

    /* renamed from: d */
    private int f21609d;

    /* renamed from: e */
    private Intent f21610e;

    public C9208b() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.InterfaceC2748h
    public final Status getStatus() {
        return this.f21609d == 0 ? Status.f7692x : Status.f7691A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f21608c);
        C2917b.m31656j(parcel, 2, this.f21609d);
        C2917b.m31652n(parcel, 3, this.f21610e, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9208b(int i, int i2, Intent intent) {
        this.f21608c = i;
        this.f21609d = i2;
        this.f21610e = intent;
    }
}
