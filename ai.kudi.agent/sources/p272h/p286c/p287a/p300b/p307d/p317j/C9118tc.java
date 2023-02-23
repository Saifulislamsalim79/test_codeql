package p272h.p286c.p287a.p300b.p307d.p317j;

import android.content.Context;
import com.google.android.datatransport.cct.C2583c;
import com.google.firebase.components.C5315w;
import com.google.firebase.p170o.InterfaceC6560b;
import p272h.p286c.p287a.p288a.AbstractC8237c;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.InterfaceC8240f;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
import p272h.p286c.p287a.p288a.p289i.C8357t;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.tc */
/* loaded from: classes2.dex */
public final class C9118tc implements InterfaceC8969jc {

    /* renamed from: a */
    private InterfaceC6560b f21492a;

    /* renamed from: b */
    private final InterfaceC6560b f21493b;

    /* renamed from: c */
    private final AbstractC8864cc f21494c;

    public C9118tc(Context context, AbstractC8864cc abstractC8864cc) {
        this.f21494c = abstractC8864cc;
        C2583c c2583c = C2583c.f7219g;
        C8357t.m16222f(context);
        final InterfaceC8241g m16221g = C8357t.m16225c().m16221g(c2583c);
        if (c2583c.mo16288a().contains(C8236b.m16444b("json"))) {
            this.f21492a = new C5315w(new InterfaceC6560b() { // from class: h.c.a.b.d.j.rc
                @Override // com.google.firebase.p170o.InterfaceC6560b
                public final Object get() {
                    return InterfaceC8241g.this.mo16231b("FIREBASE_ML_SDK", byte[].class, C8236b.m16444b("json"), C9059pc.f21440a);
                }
            });
        }
        this.f21493b = new C5315w(new InterfaceC6560b() { // from class: h.c.a.b.d.j.sc
            @Override // com.google.firebase.p170o.InterfaceC6560b
            public final Object get() {
                return InterfaceC8241g.this.mo16231b("FIREBASE_ML_SDK", byte[].class, C8236b.m16444b("proto"), C9074qc.f21455a);
            }
        });
    }

    /* renamed from: b */
    static AbstractC8237c m15541b(AbstractC8864cc abstractC8864cc, C9044oc c9044oc) {
        int mo15773a = abstractC8864cc.mo15773a();
        if (c9044oc.m15589a() != 0) {
            return AbstractC8237c.m16440d(c9044oc.m15587c(mo15773a, false));
        }
        return AbstractC8237c.m16439e(c9044oc.m15587c(mo15773a, false));
    }

    @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8969jc
    /* renamed from: a */
    public final void mo15542a(C9044oc c9044oc) {
        if (this.f21494c.mo15773a() != 0) {
            ((InterfaceC8240f) this.f21493b.get()).mo16230a(m15541b(this.f21494c, c9044oc));
            return;
        }
        InterfaceC6560b interfaceC6560b = this.f21492a;
        if (interfaceC6560b != null) {
            ((InterfaceC8240f) interfaceC6560b.get()).mo16230a(m15541b(this.f21494c, c9044oc));
        }
    }
}
