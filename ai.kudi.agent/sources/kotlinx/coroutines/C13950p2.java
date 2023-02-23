package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlinx.coroutines.internal.C13881f;
import kotlinx.coroutines.internal.C13883g;
/* compiled from: Yield.kt */
/* renamed from: kotlinx.coroutines.p2 */
/* loaded from: classes3.dex */
public final class C13950p2 {
    /* renamed from: a */
    public static final Object m3347a(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d m10388c;
        Object m10387d;
        Object m10387d2;
        Object m10387d3;
        InterfaceC11719g context = interfaceC11714d.getContext();
        C14040s1.m3183e(context);
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13881f c13881f = m10388c instanceof C13881f ? (C13881f) m10388c : null;
        if (c13881f == null) {
            m10387d = C13666w.f30112a;
        } else {
            if (c13881f.f30353f.mo3399H0(context)) {
                c13881f.m3524q(context, C13666w.f30112a);
            } else {
                C13943o2 c13943o2 = new C13943o2();
                c13881f.m3524q(context.plus(c13943o2), C13666w.f30112a);
                if (c13943o2.f30434c) {
                    m10387d = C13883g.m3513d(c13881f) ? C11734d.m10387d() : C13666w.f30112a;
                }
            }
            m10387d = C11734d.m10387d();
        }
        m10387d2 = C11734d.m10387d();
        if (m10387d == m10387d2) {
            C11741h.m10374c(interfaceC11714d);
        }
        m10387d3 = C11734d.m10387d();
        return m10387d == m10387d3 ? m10387d : C13666w.f30112a;
    }
}
