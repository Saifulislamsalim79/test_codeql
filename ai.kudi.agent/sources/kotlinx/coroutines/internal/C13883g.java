package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlinx.coroutines.AbstractC13756b1;
import kotlinx.coroutines.C13810e0;
import kotlinx.coroutines.C13853g0;
import kotlinx.coroutines.C13924k2;
import kotlinx.coroutines.C13934m2;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.InterfaceC13947p1;
/* compiled from: DispatchedContinuation.kt */
/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: classes3.dex */
public final class C13883g {

    /* renamed from: a */
    private static final C13914y f30361a = new C13914y("UNDEFINED");

    /* renamed from: b */
    public static final C13914y f30362b = new C13914y("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ C13914y m3516a() {
        return f30361a;
    }

    /* renamed from: b */
    public static final <T> void m3515b(InterfaceC11714d<? super T> interfaceC11714d, Object obj, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        boolean z;
        if (interfaceC11714d instanceof C13881f) {
            C13881f c13881f = (C13881f) interfaceC11714d;
            Object m3620b = C13810e0.m3620b(obj, interfaceC11767l);
            if (c13881f.f30353f.mo3399H0(c13881f.getContext())) {
                c13881f.f30355x = m3620b;
                c13881f.f30728e = 1;
                c13881f.f30353f.mo3067o0(c13881f.getContext(), c13881f);
                return;
            }
            C13952q0.m3345a();
            AbstractC13756b1 m3403a = C13924k2.f30408a.m3403a();
            if (m3403a.m3751X0()) {
                c13881f.f30355x = m3620b;
                c13881f.f30728e = 1;
                m3403a.m3754L0(c13881f);
                return;
            }
            m3403a.m3753Q0(true);
            try {
                InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) c13881f.getContext().get(InterfaceC13947p1.f30435u);
                if (interfaceC13947p1 == null || interfaceC13947p1.isActive()) {
                    z = false;
                } else {
                    CancellationException mo3025X = interfaceC13947p1.mo3025X();
                    c13881f.mo3066c(m3620b, mo3025X);
                    C13288p.C13289a c13289a = C13288p.f29444c;
                    Object m5358a = C13291q.m5358a(mo3025X);
                    C13288p.m5362a(m5358a);
                    c13881f.resumeWith(m5358a);
                    z = true;
                }
                if (!z) {
                    InterfaceC11714d<T> interfaceC11714d2 = c13881f.f30354w;
                    Object obj2 = c13881f.f30356y;
                    InterfaceC11719g context = interfaceC11714d2.getContext();
                    Object m3549c = C13873c0.m3549c(context, obj2);
                    C13934m2<?> m3574e = m3549c != C13873c0.f30342a ? C13853g0.m3574e(interfaceC11714d2, context, m3549c) : null;
                    c13881f.f30354w.resumeWith(obj);
                    C13666w c13666w = C13666w.f30112a;
                    if (m3574e == null || m3574e.m3396X0()) {
                        C13873c0.m3551a(context, m3549c);
                    }
                }
                do {
                } while (m3403a.m3749b1());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC11714d.resumeWith(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m3514c(InterfaceC11714d interfaceC11714d, Object obj, InterfaceC11767l interfaceC11767l, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC11767l = null;
        }
        m3515b(interfaceC11714d, obj, interfaceC11767l);
    }

    /* renamed from: d */
    public static final boolean m3513d(C13881f<? super C13666w> c13881f) {
        C13666w c13666w = C13666w.f30112a;
        C13952q0.m3345a();
        AbstractC13756b1 m3403a = C13924k2.f30408a.m3403a();
        if (m3403a.m3750Z0()) {
            return false;
        }
        if (m3403a.m3751X0()) {
            c13881f.f30355x = c13666w;
            c13881f.f30728e = 1;
            m3403a.m3754L0(c13881f);
            return true;
        }
        m3403a.m3753Q0(true);
        try {
            c13881f.run();
            do {
            } while (m3403a.m3749b1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
