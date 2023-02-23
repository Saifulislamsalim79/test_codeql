package kotlinx.coroutines.flow.internal;

import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p549l0.C13267l;
import kotlinx.coroutines.C14040s1;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: SafeCollector.kt */
/* renamed from: kotlinx.coroutines.flow.internal.q */
/* loaded from: classes3.dex */
public final class C13842q<T> extends AbstractC11738d implements InterfaceC13969e<T>, InterfaceC11739e {

    /* renamed from: c */
    public final InterfaceC13969e<T> f30312c;

    /* renamed from: d */
    public final InterfaceC11719g f30313d;

    /* renamed from: e */
    public final int f30314e;

    /* renamed from: f */
    private InterfaceC11719g f30315f;

    /* renamed from: w */
    private InterfaceC11714d<? super C13666w> f30316w;

    /* compiled from: SafeCollector.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.q$a */
    /* loaded from: classes3.dex */
    static final class C13843a extends AbstractC11802m implements InterfaceC11771p<Integer, InterfaceC11719g.InterfaceC11722b, Integer> {

        /* renamed from: c */
        public static final C13843a f30317c = new C13843a();

        C13843a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m3585a(int i, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            return m3585a(num.intValue(), interfaceC11722b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13842q(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11719g interfaceC11719g) {
        super(C13839n.f30308c, C11725h.f26446c);
        this.f30312c = interfaceC13969e;
        this.f30313d = interfaceC11719g;
        this.f30314e = ((Number) interfaceC11719g.fold(0, C13843a.f30317c)).intValue();
    }

    /* renamed from: m */
    private final void m3588m(InterfaceC11719g interfaceC11719g, InterfaceC11719g interfaceC11719g2, T t) {
        if (!(interfaceC11719g2 instanceof C13832i)) {
            C13846s.m3582a(this, interfaceC11719g);
            this.f30315f = interfaceC11719g;
            return;
        }
        m3586r((C13832i) interfaceC11719g2, t);
        throw null;
    }

    /* renamed from: o */
    private final Object m3587o(InterfaceC11714d<? super C13666w> interfaceC11714d, T t) {
        InterfaceC11719g context = interfaceC11714d.getContext();
        C14040s1.m3183e(context);
        InterfaceC11719g interfaceC11719g = this.f30315f;
        if (interfaceC11719g != context) {
            m3588m(context, interfaceC11719g, t);
        }
        this.f30316w = interfaceC11714d;
        return C13844r.m3584a().invoke(this.f30312c, t, this);
    }

    /* renamed from: r */
    private final void m3586r(C13832i c13832i, Object obj) {
        String m5460f;
        m5460f = C13267l.m5460f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c13832i.f30306c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m5460f.toString());
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m10387d2;
        try {
            Object m3587o = m3587o(interfaceC11714d, t);
            m10387d = C11734d.m10387d();
            if (m3587o == m10387d) {
                C11741h.m10374c(interfaceC11714d);
            }
            m10387d2 = C11734d.m10387d();
            return m3587o == m10387d2 ? m3587o : C13666w.f30112a;
        } catch (Throwable th) {
            this.f30315f = new C13832i(th);
            throw th;
        }
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a, kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<? super C13666w> interfaceC11714d = this.f30316w;
        if (interfaceC11714d instanceof InterfaceC11739e) {
            return (InterfaceC11739e) interfaceC11714d;
        }
        return null;
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11738d, kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        InterfaceC11714d<? super C13666w> interfaceC11714d = this.f30316w;
        InterfaceC11719g context = interfaceC11714d == null ? null : interfaceC11714d.getContext();
        return context == null ? C11725h.f26446c : context;
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a, kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public Object invokeSuspend(Object obj) {
        Object m10387d;
        Throwable m5361b = C13288p.m5361b(obj);
        if (m5361b != null) {
            this.f30315f = new C13832i(m5361b);
        }
        InterfaceC11714d<? super C13666w> interfaceC11714d = this.f30316w;
        if (interfaceC11714d != null) {
            interfaceC11714d.resumeWith(obj);
        }
        m10387d = C11734d.m10387d();
        return m10387d;
    }

    @Override // kotlin.p476c0.p478k.p479a.AbstractC11738d, kotlin.p476c0.p478k.p479a.AbstractC11735a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
