package p272h.p286c.p287a.p288a.p289i.p290a0;

import com.google.android.datatransport.runtime.backends.InterfaceC2634e;
import com.google.android.datatransport.runtime.backends.InterfaceC2645m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x;
import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p272h.p286c.p287a.p288a.InterfaceC8242h;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.C8357t;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
/* compiled from: DefaultScheduler.java */
/* renamed from: h.c.a.a.i.a0.c */
/* loaded from: classes2.dex */
public class C8246c implements InterfaceC8248e {

    /* renamed from: f */
    private static final Logger f19819f = Logger.getLogger(C8357t.class.getName());

    /* renamed from: a */
    private final InterfaceC2675x f19820a;

    /* renamed from: b */
    private final Executor f19821b;

    /* renamed from: c */
    private final InterfaceC2634e f19822c;

    /* renamed from: d */
    private final InterfaceC8272i0 f19823d;

    /* renamed from: e */
    private final InterfaceC2676a f19824e;

    public C8246c(Executor executor, InterfaceC2634e interfaceC2634e, InterfaceC2675x interfaceC2675x, InterfaceC8272i0 interfaceC8272i0, InterfaceC2676a interfaceC2676a) {
        this.f19821b = executor;
        this.f19822c = interfaceC2634e;
        this.f19820a = interfaceC2675x;
        this.f19823d = interfaceC8272i0;
        this.f19824e = interfaceC2676a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.InterfaceC8248e
    /* renamed from: a */
    public void mo16431a(final AbstractC8352p abstractC8352p, final AbstractC8342j abstractC8342j, final InterfaceC8242h interfaceC8242h) {
        this.f19821b.execute(new Runnable() { // from class: h.c.a.a.i.a0.a
            @Override // java.lang.Runnable
            public final void run() {
                C8246c.this.m16435c(abstractC8352p, interfaceC8242h, abstractC8342j);
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ Object m16436b(AbstractC8352p abstractC8352p, AbstractC8342j abstractC8342j) {
        this.f19823d.mo16380G0(abstractC8352p, abstractC8342j);
        this.f19820a.mo32399a(abstractC8352p, 1);
        return null;
    }

    /* renamed from: c */
    public /* synthetic */ void m16435c(final AbstractC8352p abstractC8352p, InterfaceC8242h interfaceC8242h, AbstractC8342j abstractC8342j) {
        try {
            InterfaceC2645m mo32455b = this.f19822c.mo32455b(abstractC8352p.mo16241b());
            if (mo32455b == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC8352p.mo16241b());
                f19819f.warning(format);
                interfaceC8242h.mo16437a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC8342j mo32446b = mo32455b.mo32446b(abstractC8342j);
            this.f19824e.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: h.c.a.a.i.a0.b
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                public final Object execute() {
                    return C8246c.this.m16436b(abstractC8352p, mo32446b);
                }
            });
            interfaceC8242h.mo16437a(null);
        } catch (Exception e) {
            Logger logger = f19819f;
            logger.warning("Error scheduling event " + e.getMessage());
            interfaceC8242h.mo16437a(e);
        }
    }
}
