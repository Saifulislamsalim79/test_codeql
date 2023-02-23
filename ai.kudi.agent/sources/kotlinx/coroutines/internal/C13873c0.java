package kotlinx.coroutines.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.InterfaceC13919j2;
/* compiled from: ThreadContext.kt */
/* renamed from: kotlinx.coroutines.internal.c0 */
/* loaded from: classes3.dex */
public final class C13873c0 {

    /* renamed from: a */
    public static final C13914y f30342a = new C13914y("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final InterfaceC11771p<Object, InterfaceC11719g.InterfaceC11722b, Object> f30343b = C13874a.f30346c;

    /* renamed from: c */
    private static final InterfaceC11771p<InterfaceC13919j2<?>, InterfaceC11719g.InterfaceC11722b, InterfaceC13919j2<?>> f30344c = C13875b.f30347c;

    /* renamed from: d */
    private static final InterfaceC11771p<C13882f0, InterfaceC11719g.InterfaceC11722b, C13882f0> f30345d = C13876c.f30348c;

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.c0$a */
    /* loaded from: classes3.dex */
    static final class C13874a extends AbstractC11802m implements InterfaceC11771p<Object, InterfaceC11719g.InterfaceC11722b, Object> {

        /* renamed from: c */
        public static final C13874a f30346c = new C13874a();

        C13874a() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final Object invoke(Object obj, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            if (interfaceC11722b instanceof InterfaceC13919j2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? interfaceC11722b : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.c0$b */
    /* loaded from: classes3.dex */
    static final class C13875b extends AbstractC11802m implements InterfaceC11771p<InterfaceC13919j2<?>, InterfaceC11719g.InterfaceC11722b, InterfaceC13919j2<?>> {

        /* renamed from: c */
        public static final C13875b f30347c = new C13875b();

        C13875b() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: a */
        public final InterfaceC13919j2<?> invoke(InterfaceC13919j2<?> interfaceC13919j2, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            if (interfaceC13919j2 != null) {
                return interfaceC13919j2;
            }
            if (interfaceC11722b instanceof InterfaceC13919j2) {
                return (InterfaceC13919j2) interfaceC11722b;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* renamed from: kotlinx.coroutines.internal.c0$c */
    /* loaded from: classes3.dex */
    static final class C13876c extends AbstractC11802m implements InterfaceC11771p<C13882f0, InterfaceC11719g.InterfaceC11722b, C13882f0> {

        /* renamed from: c */
        public static final C13876c f30348c = new C13876c();

        C13876c() {
            super(2);
        }

        /* renamed from: a */
        public final C13882f0 m3546a(C13882f0 c13882f0, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            if (interfaceC11722b instanceof InterfaceC13919j2) {
                InterfaceC13919j2<?> interfaceC13919j2 = (InterfaceC13919j2) interfaceC11722b;
                c13882f0.m3518a(interfaceC13919j2, interfaceC13919j2.mo3408D0(c13882f0.f30357a));
            }
            return c13882f0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13882f0 invoke(C13882f0 c13882f0, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            C13882f0 c13882f02 = c13882f0;
            m3546a(c13882f02, interfaceC11722b);
            return c13882f02;
        }
    }

    /* renamed from: a */
    public static final void m3551a(InterfaceC11719g interfaceC11719g, Object obj) {
        if (obj == f30342a) {
            return;
        }
        if (obj instanceof C13882f0) {
            ((C13882f0) obj).m3517b(interfaceC11719g);
            return;
        }
        Object fold = interfaceC11719g.fold(null, f30344c);
        if (fold != null) {
            ((InterfaceC13919j2) fold).mo3404w0(interfaceC11719g, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final Object m3550b(InterfaceC11719g interfaceC11719g) {
        Object fold = interfaceC11719g.fold(0, f30343b);
        kotlin.e0.d.l.d(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m3549c(InterfaceC11719g interfaceC11719g, Object obj) {
        if (obj == null) {
            obj = m3550b(interfaceC11719g);
        }
        if (obj == 0) {
            return f30342a;
        }
        if (obj instanceof Integer) {
            return interfaceC11719g.fold(new C13882f0(interfaceC11719g, ((Number) obj).intValue()), f30345d);
        }
        return ((InterfaceC13919j2) obj).mo3408D0(interfaceC11719g);
    }
}
