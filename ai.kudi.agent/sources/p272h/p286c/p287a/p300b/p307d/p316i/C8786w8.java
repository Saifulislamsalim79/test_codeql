package p272h.p286c.p287a.p300b.p307d.p316i;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.w8 */
/* loaded from: classes2.dex */
public final class C8786w8 implements InterfaceC8543a9 {

    /* renamed from: a */
    final List f20733a = new ArrayList();

    public C8786w8(Context context, AbstractC8775v8 abstractC8775v8) {
        if (abstractC8775v8.mo15876c()) {
            this.f20733a.add(new C8623h9(context, abstractC8775v8));
        }
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.InterfaceC8543a9
    /* renamed from: a */
    public final void mo15859a(C8567c9 c8567c9) {
        for (InterfaceC8543a9 interfaceC8543a9 : this.f20733a) {
            interfaceC8543a9.mo15859a(c8567c9);
        }
    }
}
