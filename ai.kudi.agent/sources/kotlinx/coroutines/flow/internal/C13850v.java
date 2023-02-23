package kotlinx.coroutines.flow.internal;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.v */
/* loaded from: classes3.dex */
final class C13850v<T> implements InterfaceC13969e<T> {

    /* renamed from: c */
    private final InterfaceC11719g f30324c;

    /* renamed from: d */
    private final Object f30325d;

    /* renamed from: e */
    private final InterfaceC11771p<T, InterfaceC11714d<? super C13666w>, Object> f30326e;

    /* compiled from: ChannelFlow.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.v$a */
    /* loaded from: classes3.dex */
    static final class C13851a extends AbstractC11745k implements InterfaceC11771p<T, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30327c;

        /* renamed from: d */
        /* synthetic */ Object f30328d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13969e<T> f30329e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13851a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13851a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30329e = interfaceC13969e;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13851a c13851a = new C13851a(this.f30329e, interfaceC11714d);
            c13851a.f30328d = obj;
            return c13851a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30327c;
            if (i == 0) {
                C13291q.m5357b(obj);
                Object obj2 = this.f30328d;
                this.f30327c = 1;
                if (this.f30329e.emit(obj2, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13851a) create(t, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    public C13850v(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11719g interfaceC11719g) {
        this.f30324c = interfaceC11719g;
        this.f30325d = C13873c0.m3550b(interfaceC11719g);
        this.f30326e = new C13851a(interfaceC13969e, null);
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3600b = C13823e.m3600b(this.f30324c, t, this.f30325d, this.f30326e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3600b == m10387d ? m3600b : C13666w.f30112a;
    }
}
