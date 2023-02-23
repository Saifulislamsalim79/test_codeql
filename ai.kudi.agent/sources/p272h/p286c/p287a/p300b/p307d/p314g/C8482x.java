package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C4109b;
import com.google.android.gms.location.C4112c;
import com.google.android.gms.location.C4117e;
/* renamed from: h.c.a.b.d.g.x */
/* loaded from: classes2.dex */
final class C8482x extends C4109b.AbstractC4110a<C4117e> {

    /* renamed from: p */
    private final /* synthetic */ C4112c f20190p;

    /* renamed from: q */
    private final /* synthetic */ String f20191q = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8482x(C8481w c8481w, AbstractC2743d abstractC2743d, C4112c c4112c, String str) {
        super(abstractC2743d);
        this.f20190p = c4112c;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* synthetic */ InterfaceC2748h mo16049d(Status status) {
        return new C4117e(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2761d
    /* renamed from: m */
    protected final /* synthetic */ void mo16048m(C8473o c8473o) throws RemoteException {
        c8473o.m16057m0(this.f20190p, this, this.f20191q);
    }
}
