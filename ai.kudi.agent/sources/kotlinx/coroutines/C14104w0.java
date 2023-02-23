package kotlinx.coroutines;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.internal.C13873c0;
import kotlinx.coroutines.internal.C13881f;
/* compiled from: DispatchedTask.kt */
/* renamed from: kotlinx.coroutines.w0 */
/* loaded from: classes3.dex */
public final class C14104w0 {
    /* renamed from: a */
    public static final <T> void m2962a(AbstractC14087v0<? super T> abstractC14087v0, int i) {
        if (C13952q0.m3345a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        InterfaceC11714d<? super T> mo3065d = abstractC14087v0.mo3065d();
        boolean z = i == 4;
        if (!z && (mo3065d instanceof C13881f) && m2961b(i) == m2961b(abstractC14087v0.f30728e)) {
            AbstractC13857h0 abstractC13857h0 = ((C13881f) mo3065d).f30353f;
            InterfaceC11719g context = mo3065d.getContext();
            if (abstractC13857h0.mo3399H0(context)) {
                abstractC13857h0.mo3067o0(context, abstractC14087v0);
                return;
            } else {
                m2958e(abstractC14087v0);
                return;
            }
        }
        m2959d(abstractC14087v0, mo3065d, z);
    }

    /* renamed from: b */
    public static final boolean m2961b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m2960c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m2959d(AbstractC14087v0<? super T> abstractC14087v0, InterfaceC11714d<? super T> interfaceC11714d, boolean z) {
        Object mo3063f;
        boolean m3396X0;
        Object mo3061k = abstractC14087v0.mo3061k();
        Throwable mo3064e = abstractC14087v0.mo3064e(mo3061k);
        if (mo3064e != null) {
            C13288p.C13289a c13289a = C13288p.f29444c;
            mo3063f = C13291q.m5358a(mo3064e);
        } else {
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            mo3063f = abstractC14087v0.mo3063f(mo3061k);
        }
        C13288p.m5362a(mo3063f);
        if (z) {
            C13881f c13881f = (C13881f) interfaceC11714d;
            InterfaceC11714d<T> interfaceC11714d2 = c13881f.f30354w;
            Object obj = c13881f.f30356y;
            InterfaceC11719g context = interfaceC11714d2.getContext();
            Object m3549c = C13873c0.m3549c(context, obj);
            C13934m2<?> m3574e = m3549c != C13873c0.f30342a ? C13853g0.m3574e(interfaceC11714d2, context, m3549c) : null;
            try {
                c13881f.f30354w.resumeWith(mo3063f);
                C13666w c13666w = C13666w.f30112a;
                if (m3574e != null) {
                    if (!m3396X0) {
                        return;
                    }
                }
                return;
            } finally {
                if (m3574e == null || m3574e.m3396X0()) {
                    C13873c0.m3551a(context, m3549c);
                }
            }
        }
        interfaceC11714d.resumeWith(mo3063f);
    }

    /* renamed from: e */
    private static final void m2958e(AbstractC14087v0<?> abstractC14087v0) {
        AbstractC13756b1 m3403a = C13924k2.f30408a.m3403a();
        if (m3403a.m3751X0()) {
            m3403a.m3754L0(abstractC14087v0);
            return;
        }
        m3403a.m3753Q0(true);
        try {
            m2959d(abstractC14087v0, abstractC14087v0.mo3065d(), true);
            do {
            } while (m3403a.m3749b1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
