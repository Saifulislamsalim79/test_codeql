package p272h.p286c.p287a.p300b.p307d.p317j;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.dc */
/* loaded from: classes2.dex */
public final class C8879dc implements InterfaceC8969jc {

    /* renamed from: a */
    final List f20867a = new ArrayList();

    public C8879dc(Context context, AbstractC8864cc abstractC8864cc) {
        if (abstractC8864cc.mo15771c()) {
            this.f20867a.add(new C9118tc(context, abstractC8864cc));
        }
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8969jc
    /* renamed from: a */
    public final void mo15542a(C9044oc c9044oc) {
        for (InterfaceC8969jc interfaceC8969jc : this.f20867a) {
            interfaceC8969jc.mo15542a(c9044oc);
        }
    }
}
