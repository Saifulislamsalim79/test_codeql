package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: Job.kt */
/* renamed from: kotlinx.coroutines.p1 */
/* loaded from: classes3.dex */
public interface InterfaceC13947p1 extends InterfaceC11719g.InterfaceC11722b {

    /* renamed from: u */
    public static final C13949b f30435u = C13949b.f30436c;

    /* compiled from: Job.kt */
    /* renamed from: kotlinx.coroutines.p1$a */
    /* loaded from: classes3.dex */
    public static final class C13948a {
        /* renamed from: a */
        public static /* synthetic */ void m3353a(InterfaceC13947p1 interfaceC13947p1, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC13947p1.mo3015m(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m3352b(InterfaceC13947p1 interfaceC13947p1, R r, InterfaceC11771p<? super R, ? super InterfaceC11719g.InterfaceC11722b, ? extends R> interfaceC11771p) {
            return (R) InterfaceC11719g.InterfaceC11722b.C11723a.m10399a(interfaceC13947p1, r, interfaceC11771p);
        }

        /* renamed from: c */
        public static <E extends InterfaceC11719g.InterfaceC11722b> E m3351c(InterfaceC13947p1 interfaceC13947p1, InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
            return (E) InterfaceC11719g.InterfaceC11722b.C11723a.m10398b(interfaceC13947p1, interfaceC11724c);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC14110y0 m3350d(InterfaceC13947p1 interfaceC13947p1, boolean z, boolean z2, InterfaceC11767l interfaceC11767l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return interfaceC13947p1.mo3027V(z, z2, interfaceC11767l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static InterfaceC11719g m3349e(InterfaceC13947p1 interfaceC13947p1, InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
            return InterfaceC11719g.InterfaceC11722b.C11723a.m10397c(interfaceC13947p1, interfaceC11724c);
        }

        /* renamed from: f */
        public static InterfaceC11719g m3348f(InterfaceC13947p1 interfaceC13947p1, InterfaceC11719g interfaceC11719g) {
            return InterfaceC11719g.InterfaceC11722b.C11723a.m10396d(interfaceC13947p1, interfaceC11719g);
        }
    }

    /* compiled from: Job.kt */
    /* renamed from: kotlinx.coroutines.p1$b */
    /* loaded from: classes3.dex */
    public static final class C13949b implements InterfaceC11719g.InterfaceC11724c<InterfaceC13947p1> {

        /* renamed from: c */
        static final /* synthetic */ C13949b f30436c = new C13949b();

        private C13949b() {
        }
    }

    /* renamed from: C0 */
    boolean mo3055C0();

    /* renamed from: E0 */
    InterfaceC14038s mo3052E0(InterfaceC14067u interfaceC14067u);

    /* renamed from: P */
    Object mo3035P(InterfaceC11714d<? super C13666w> interfaceC11714d);

    /* renamed from: V */
    InterfaceC14110y0 mo3027V(boolean z, boolean z2, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l);

    /* renamed from: X */
    CancellationException mo3025X();

    boolean isActive();

    /* renamed from: m */
    void mo3015m(CancellationException cancellationException);

    boolean start();

    /* renamed from: u0 */
    InterfaceC14110y0 mo3002u0(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l);
}
