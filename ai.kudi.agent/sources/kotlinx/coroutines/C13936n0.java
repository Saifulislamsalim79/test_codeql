package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.internal.C13879e;
import kotlinx.coroutines.internal.C13912w;
import kotlinx.coroutines.p560r2.C14037b;
/* compiled from: CoroutineScope.kt */
/* renamed from: kotlinx.coroutines.n0 */
/* loaded from: classes3.dex */
public final class C13936n0 {
    /* renamed from: a */
    public static final <R> Object m3361a(InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super R> interfaceC11714d) {
        Object m10387d;
        C13912w c13912w = new C13912w(interfaceC11714d.getContext(), interfaceC11714d);
        Object m3193b = C14037b.m3193b(c13912w, c13912w, interfaceC11771p);
        m10387d = C11734d.m10387d();
        if (m3193b == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        return m3193b;
    }

    /* renamed from: b */
    public static final InterfaceC13932m0 m3360b(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g) {
        return new C13879e(interfaceC13932m0.mo3397o0().plus(interfaceC11719g));
    }
}
