package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.internal.C13912w;
import kotlinx.coroutines.p560r2.C14036a;
import kotlinx.coroutines.p560r2.C14037b;
/* compiled from: Builders.common.kt */
/* renamed from: kotlinx.coroutines.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13916j {
    /* renamed from: a */
    public static final InterfaceC13947p1 m3413a(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g, EnumC13940o0 enumC13940o0, InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        AbstractC13758c c13855g2;
        InterfaceC11719g m3576c = C13853g0.m3576c(interfaceC13932m0, interfaceC11719g);
        if (enumC13940o0.m3357e()) {
            c13855g2 = new C14108x1(m3576c, interfaceC11771p);
        } else {
            c13855g2 = new C13855g2(m3576c, true);
        }
        c13855g2.m3748V0(enumC13940o0, c13855g2, interfaceC11771p);
        return c13855g2;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13947p1 m3412b(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g, EnumC13940o0 enumC13940o0, InterfaceC11771p interfaceC11771p, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC11719g = C11725h.f26446c;
        }
        if ((i & 2) != 0) {
            enumC13940o0 = EnumC13940o0.DEFAULT;
        }
        return C13864i.m3568a(interfaceC13932m0, interfaceC11719g, enumC13940o0, interfaceC11771p);
    }

    /* renamed from: c */
    public static final <T> Object m3411c(InterfaceC11719g interfaceC11719g, InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super T> interfaceC11714d) {
        Object m3141X0;
        Object m10387d;
        InterfaceC11719g context = interfaceC11714d.getContext();
        InterfaceC11719g plus = context.plus(interfaceC11719g);
        C14040s1.m3183e(plus);
        if (plus == context) {
            C13912w c13912w = new C13912w(plus, interfaceC11714d);
            m3141X0 = C14037b.m3193b(c13912w, c13912w, interfaceC11771p);
        } else if (kotlin.e0.d.l.b(plus.get(InterfaceC11715e.f26443r), context.get(InterfaceC11715e.f26443r))) {
            C13934m2 c13934m2 = new C13934m2(plus, interfaceC11714d);
            Object m3549c = C13873c0.m3549c(plus, null);
            try {
                Object m3193b = C14037b.m3193b(c13934m2, c13934m2, interfaceC11771p);
                C13873c0.m3551a(plus, m3549c);
                m3141X0 = m3193b;
            } catch (Throwable th) {
                C13873c0.m3551a(plus, m3549c);
                throw th;
            }
        } else {
            C14068u0 c14068u0 = new C14068u0(plus, interfaceC11714d);
            C14036a.m3195f(interfaceC11771p, c14068u0, c14068u0, null, 4, null);
            m3141X0 = c14068u0.m3141X0();
        }
        m10387d = C11734d.m10387d();
        if (m3141X0 == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        return m3141X0;
    }
}
