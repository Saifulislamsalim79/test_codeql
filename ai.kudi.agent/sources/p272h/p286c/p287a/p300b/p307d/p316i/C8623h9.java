package p272h.p286c.p287a.p300b.p307d.p316i;

import android.content.Context;
import com.google.android.datatransport.cct.C2583c;
import com.google.firebase.components.C5315w;
import com.google.firebase.p170o.InterfaceC6560b;
import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p272h.p286c.p287a.p288a.p289i.C8357t;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.h9 */
/* loaded from: classes2.dex */
public final class C8623h9 implements InterfaceC8543a9 {

    /* renamed from: a */
    private InterfaceC6560b f20478a;

    /* renamed from: b */
    private final InterfaceC6560b f20479b;

    /* renamed from: c */
    private final AbstractC8775v8 f20480c;

    public C8623h9(Context context, AbstractC8775v8 abstractC8775v8) {
        this.f20480c = abstractC8775v8;
        C2583c c2583c = C2583c.f7219g;
        C8357t.m16222f(context);
        final InterfaceC8241g m16221g = C8357t.m16225c().m16221g(c2583c);
        if (c2583c.mo16288a().contains(C8236b.m16444b("json"))) {
            this.f20478a = new C5315w(new InterfaceC6560b() { // from class: h.c.a.b.d.i.f9
                @Override // com.google.firebase.p170o.InterfaceC6560b
                public final Object get() {
                    return InterfaceC8241g.this.mo16231b("FIREBASE_ML_SDK", byte[].class, C8236b.m16444b("json"), C8578d9.f20278a);
                }
            });
        }
        this.f20479b = new C5315w(new InterfaceC6560b() { // from class: h.c.a.b.d.i.g9
            @Override // com.google.firebase.p170o.InterfaceC6560b
            public final Object get() {
                return InterfaceC8241g.this.mo16231b("FIREBASE_ML_SDK", byte[].class, C8236b.m16444b("proto"), C8590e9.f20454a);
            }
        });
    }

    /* renamed from: b */
    static AbstractC8237c m15960b(AbstractC8775v8 abstractC8775v8, C8567c9 c8567c9) {
        return AbstractC8237c.m16439e(c8567c9.m15985b(abstractC8775v8.mo15878a(), false));
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p316i.InterfaceC8543a9
    /* renamed from: a */
    public final void mo15859a(C8567c9 c8567c9) {
        if (this.f20480c.mo15878a() != 0) {
            ((InterfaceC8240f) this.f20479b.get()).mo16230a(m15960b(this.f20480c, c8567c9));
            return;
        }
        InterfaceC6560b interfaceC6560b = this.f20478a;
        if (interfaceC6560b != null) {
            ((InterfaceC8240f) interfaceC6560b.get()).mo16230a(m15960b(this.f20480c, c8567c9));
        }
    }
}
