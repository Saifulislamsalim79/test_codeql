package p272h.p286c.p287a.p300b.p307d.p314g;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.internal.AbstractC2880i;
import com.google.android.gms.common.internal.C2867e;
/* renamed from: h.c.a.b.d.g.z */
/* loaded from: classes2.dex */
public class C8484z extends AbstractC2880i<InterfaceC8460d> {

    /* renamed from: A */
    private final String f20192A;

    /* renamed from: B */
    protected final InterfaceC8480v<InterfaceC8460d> f20193B;

    public C8484z(Context context, Looper looper, AbstractC2743d.a aVar, AbstractC2743d.b bVar, String str, C2867e c2867e) {
        super(context, looper, 23, c2867e, aVar, bVar);
        this.f20193B = new C8455a0(this);
        this.f20192A = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public String mo15471D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected String mo15470E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public int mo15469k() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public /* synthetic */ IInterface mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof InterfaceC8460d ? (InterfaceC8460d) queryLocalInterface : new C8462e(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: z */
    public Bundle mo15465z() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f20192A);
        return bundle;
    }
}
