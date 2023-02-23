package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11782b0;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.e */
/* loaded from: classes3.dex */
public final class C13823e {
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC13969e m3601a(InterfaceC13969e interfaceC13969e, InterfaceC11719g interfaceC11719g) {
        return m3598d(interfaceC13969e, interfaceC11719g);
    }

    /* renamed from: b */
    public static final <T, V> Object m3600b(InterfaceC11719g interfaceC11719g, V v, Object obj, InterfaceC11771p<? super V, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super T> interfaceC11714d) {
        Object m10387d;
        Object m3549c = C13873c0.m3549c(interfaceC11719g, obj);
        try {
            C13849u c13849u = new C13849u(interfaceC11714d, interfaceC11719g);
            if (interfaceC11771p != null) {
                C11782b0.m10345f(interfaceC11771p, 2);
                Object invoke = interfaceC11771p.invoke(v, c13849u);
                C13873c0.m3551a(interfaceC11719g, m3549c);
                m10387d = C11734d.m10387d();
                if (invoke == m10387d) {
                    C11741h.m10374c(interfaceC11714d);
                }
                return invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C13873c0.m3551a(interfaceC11719g, m3549c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m3599c(InterfaceC11719g interfaceC11719g, Object obj, Object obj2, InterfaceC11771p interfaceC11771p, InterfaceC11714d interfaceC11714d, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C13873c0.m3550b(interfaceC11719g);
        }
        return m3600b(interfaceC11719g, obj, obj2, interfaceC11771p, interfaceC11714d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> InterfaceC13969e<T> m3598d(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11719g interfaceC11719g) {
        return interfaceC13969e instanceof C13848t ? true : interfaceC13969e instanceof C13840o ? interfaceC13969e : new C13850v(interfaceC13969e, interfaceC11719g);
    }
}
