package kotlinx.coroutines.p560r2;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11782b0;
import kotlinx.coroutines.C13755b0;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14105w1;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.internal.C13912w;
import kotlinx.coroutines.internal.C13913x;
/* compiled from: Undispatched.kt */
/* renamed from: kotlinx.coroutines.r2.b */
/* loaded from: classes3.dex */
public final class C14037b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <R, T> void m3194a(InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, R r, InterfaceC11714d<? super T> interfaceC11714d) {
        Object m10387d;
        C11741h.m10376a(interfaceC11714d);
        try {
            InterfaceC11719g context = interfaceC11714d.getContext();
            Object m3549c = C13873c0.m3549c(context, null);
            if (interfaceC11771p != null) {
                C11782b0.m10345f(interfaceC11771p, 2);
                Object invoke = interfaceC11771p.invoke(r, interfaceC11714d);
                C13873c0.m3551a(context, m3549c);
                m10387d = C11734d.m10387d();
                if (invoke != m10387d) {
                    C13288p.C13289a c13289a = C13288p.f29444c;
                    C13288p.m5362a(invoke);
                    interfaceC11714d.resumeWith(invoke);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(th);
            C13288p.m5362a(m5358a);
            interfaceC11714d.resumeWith(m5358a);
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m3193b(C13912w<? super T> c13912w, R r, InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p) {
        Object c13755b0;
        Object m10387d;
        Throwable m3425j;
        Object m10387d2;
        Object m10387d3;
        try {
        } catch (Throwable th) {
            c13755b0 = new C13755b0(th, false, 2, null);
        }
        if (interfaceC11771p != null) {
            C11782b0.m10345f(interfaceC11771p, 2);
            c13755b0 = interfaceC11771p.invoke(r, c13912w);
            m10387d = C11734d.m10387d();
            if (c13755b0 == m10387d) {
                m10387d3 = C11734d.m10387d();
                return m10387d3;
            }
            Object m3014m0 = c13912w.m3014m0(c13755b0);
            if (m3014m0 == C14105w1.f30756b) {
                m10387d2 = C11734d.m10387d();
                return m10387d2;
            } else if (m3014m0 instanceof C13755b0) {
                Throwable th2 = ((C13755b0) m3014m0).f30198a;
                InterfaceC11714d<? super T> interfaceC11714d = c13912w.f30401e;
                if (C13952q0.m3342d() && (interfaceC11714d instanceof InterfaceC11739e)) {
                    m3425j = C13913x.m3425j(th2, (InterfaceC11739e) interfaceC11714d);
                    throw m3425j;
                }
                throw th2;
            } else {
                return C14105w1.m2950h(m3014m0);
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
