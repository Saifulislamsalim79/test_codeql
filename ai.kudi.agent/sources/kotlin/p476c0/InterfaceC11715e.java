package kotlin.p476c0;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: ContinuationInterceptor.kt */
/* renamed from: kotlin.c0.e */
/* loaded from: classes3.dex */
public interface InterfaceC11715e extends InterfaceC11719g.InterfaceC11722b {

    /* renamed from: r */
    public static final C11717b f26443r = C11717b.f26444c;

    /* compiled from: ContinuationInterceptor.kt */
    /* renamed from: kotlin.c0.e$a */
    /* loaded from: classes3.dex */
    public static final class C11716a {
        /* renamed from: a */
        public static <E extends InterfaceC11719g.InterfaceC11722b> E m10404a(InterfaceC11715e interfaceC11715e, InterfaceC11719g.InterfaceC11724c<E> interfaceC11724c) {
            l.f(interfaceC11724c, "key");
            if (interfaceC11724c instanceof AbstractC11711b) {
                AbstractC11711b abstractC11711b = (AbstractC11711b) interfaceC11724c;
                if (abstractC11711b.m10410a(interfaceC11715e.getKey())) {
                    E e = (E) abstractC11711b.m10409b(interfaceC11715e);
                    if (e instanceof InterfaceC11719g.InterfaceC11722b) {
                        return e;
                    }
                    return null;
                }
                return null;
            } else if (InterfaceC11715e.f26443r == interfaceC11724c) {
                if (interfaceC11715e != null) {
                    return interfaceC11715e;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            } else {
                return null;
            }
        }

        /* renamed from: b */
        public static InterfaceC11719g m10403b(InterfaceC11715e interfaceC11715e, InterfaceC11719g.InterfaceC11724c<?> interfaceC11724c) {
            l.f(interfaceC11724c, "key");
            if (!(interfaceC11724c instanceof AbstractC11711b)) {
                return InterfaceC11715e.f26443r == interfaceC11724c ? C11725h.f26446c : interfaceC11715e;
            }
            AbstractC11711b abstractC11711b = (AbstractC11711b) interfaceC11724c;
            return (!abstractC11711b.m10410a(interfaceC11715e.getKey()) || abstractC11711b.m10409b(interfaceC11715e) == null) ? interfaceC11715e : C11725h.f26446c;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    /* renamed from: kotlin.c0.e$b */
    /* loaded from: classes3.dex */
    public static final class C11717b implements InterfaceC11719g.InterfaceC11724c<InterfaceC11715e> {

        /* renamed from: c */
        static final /* synthetic */ C11717b f26444c = new C11717b();

        private C11717b() {
        }
    }

    /* renamed from: F */
    void mo3572F(InterfaceC11714d<?> interfaceC11714d);

    /* renamed from: J */
    <T> InterfaceC11714d<T> mo3571J(InterfaceC11714d<? super T> interfaceC11714d);
}
