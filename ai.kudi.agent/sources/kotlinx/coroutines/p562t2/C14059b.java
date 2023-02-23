package kotlinx.coroutines.p562t2;

import j.e.c0.c;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.C13935n;
import kotlinx.coroutines.InterfaceC13930m;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
/* compiled from: RxAwait.kt */
/* renamed from: kotlinx.coroutines.t2.b */
/* loaded from: classes3.dex */
public final class C14059b {

    /* compiled from: RxAwait.kt */
    /* renamed from: kotlinx.coroutines.t2.b$a */
    /* loaded from: classes3.dex */
    public static final class C14060a implements InterfaceC11698y<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13930m<T> f30660c;

        /* JADX WARN: Multi-variable type inference failed */
        C14060a(InterfaceC13930m<? super T> interfaceC13930m) {
            this.f30660c = interfaceC13930m;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            InterfaceC11714d interfaceC11714d = this.f30660c;
            C13288p.C13289a c13289a = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
            interfaceC11714d.resumeWith(m5358a);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            InterfaceC11714d interfaceC11714d = this.f30660c;
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13288p.m5362a(t);
            interfaceC11714d.resumeWith(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            C14059b.m3153b(this.f30660c, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxAwait.kt */
    /* renamed from: kotlinx.coroutines.t2.b$b */
    /* loaded from: classes3.dex */
    public static final class C14061b extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

        /* renamed from: c */
        final /* synthetic */ c f30661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14061b(c cVar) {
            super(1);
            this.f30661c = cVar;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            invoke2(th);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f30661c.i();
        }
    }

    /* renamed from: a */
    public static final <T> Object m3154a(InterfaceC11270a0<T> interfaceC11270a0, InterfaceC11714d<? super T> interfaceC11714d) {
        InterfaceC11714d m10388c;
        Object m10387d;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n c13935n = new C13935n(m10388c, 1);
        c13935n.m3393B();
        interfaceC11270a0.mo10446b(new C14060a(c13935n));
        Object m3363y = c13935n.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        return m3363y;
    }

    /* renamed from: b */
    public static final void m3153b(InterfaceC13930m<?> interfaceC13930m, c cVar) {
        interfaceC13930m.mo3377i(new C14061b(cVar));
    }
}
