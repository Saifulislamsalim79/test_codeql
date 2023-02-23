package kotlinx.coroutines.p559q2;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlinx.coroutines.flow.internal.C13827h;
import kotlinx.coroutines.internal.C13915z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
/* renamed from: kotlinx.coroutines.q2.n */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14004n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Merge.kt */
    @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.q2.n$a */
    /* loaded from: classes3.dex */
    public static final class C14005a extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super R>, T, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30550c;

        /* renamed from: d */
        private /* synthetic */ Object f30551d;

        /* renamed from: e */
        /* synthetic */ Object f30552e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11771p<T, InterfaceC11714d<? super R>, Object> f30553f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14005a(InterfaceC11771p<? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C14005a> interfaceC11714d) {
            super(3, interfaceC11714d);
            this.f30553f = interfaceC11771p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            InterfaceC13969e interfaceC13969e;
            m10387d = C11734d.m10387d();
            int i = this.f30550c;
            if (i == 0) {
                C13291q.m5357b(obj);
                interfaceC13969e = (InterfaceC13969e) this.f30551d;
                Object obj2 = this.f30552e;
                InterfaceC11771p<T, InterfaceC11714d<? super R>, Object> interfaceC11771p = this.f30553f;
                this.f30551d = interfaceC13969e;
                this.f30550c = 1;
                obj = interfaceC11771p.invoke(obj2, this);
                if (obj == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13291q.m5357b(obj);
                    return C13666w.f30112a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                interfaceC13969e = (InterfaceC13969e) this.f30551d;
                C13291q.m5357b(obj);
            }
            this.f30551d = null;
            this.f30550c = 2;
            if (interfaceC13969e.emit(obj, this) == m10387d) {
                return m10387d;
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super R> interfaceC13969e, T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            C14005a c14005a = new C14005a(this.f30553f, interfaceC11714d);
            c14005a.f30551d = interfaceC13969e;
            c14005a.f30552e = t;
            return c14005a.invokeSuspend(C13666w.f30112a);
        }
    }

    static {
        C13915z.m3419b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static final <T, R> InterfaceC13964d<R> m3271a(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11771p<? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11771p) {
        return C13971f.m3310x(interfaceC13964d, new C14005a(interfaceC11771p, null));
    }

    /* renamed from: b */
    public static final <T, R> InterfaceC13964d<R> m3270b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super InterfaceC13969e<? super R>, ? super T, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q) {
        return new C13827h(interfaceC11772q, interfaceC13964d, null, 0, null, 28, null);
    }
}
