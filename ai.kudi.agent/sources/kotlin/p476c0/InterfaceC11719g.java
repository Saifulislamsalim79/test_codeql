package kotlin.p476c0;

import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: CoroutineContext.kt */
/* renamed from: kotlin.c0.g */
/* loaded from: classes3.dex */
public interface InterfaceC11719g {

    /* compiled from: CoroutineContext.kt */
    /* renamed from: kotlin.c0.g$a */
    /* loaded from: classes3.dex */
    public static final class C11720a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        /* renamed from: kotlin.c0.g$a$a */
        /* loaded from: classes3.dex */
        public static final class C11721a extends AbstractC11802m implements InterfaceC11771p<InterfaceC11719g, InterfaceC11722b, InterfaceC11719g> {

            /* renamed from: c */
            public static final C11721a f26445c = new C11721a();

            C11721a() {
                super(2);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: a */
            public final InterfaceC11719g invoke(InterfaceC11719g interfaceC11719g, InterfaceC11722b interfaceC11722b) {
                l.f(interfaceC11719g, "acc");
                l.f(interfaceC11722b, "element");
                InterfaceC11719g minusKey = interfaceC11719g.minusKey(interfaceC11722b.getKey());
                if (minusKey == C11725h.f26446c) {
                    return interfaceC11722b;
                }
                InterfaceC11715e interfaceC11715e = (InterfaceC11715e) minusKey.get(InterfaceC11715e.f26443r);
                if (interfaceC11715e == null) {
                    return new C11712c(minusKey, interfaceC11722b);
                }
                InterfaceC11719g minusKey2 = minusKey.minusKey(InterfaceC11715e.f26443r);
                return minusKey2 == C11725h.f26446c ? new C11712c(interfaceC11722b, interfaceC11715e) : new C11712c(new C11712c(minusKey2, interfaceC11722b), interfaceC11715e);
            }
        }

        /* renamed from: a */
        public static InterfaceC11719g m10401a(InterfaceC11719g interfaceC11719g, InterfaceC11719g interfaceC11719g2) {
            l.f(interfaceC11719g2, "context");
            return interfaceC11719g2 == C11725h.f26446c ? interfaceC11719g : (InterfaceC11719g) interfaceC11719g2.fold(interfaceC11719g, C11721a.f26445c);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: kotlin.c0.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC11722b extends InterfaceC11719g {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: kotlin.c0.g$b$a */
        /* loaded from: classes3.dex */
        public static final class C11723a {
            /* renamed from: a */
            public static <R> R m10399a(InterfaceC11722b interfaceC11722b, R r, InterfaceC11771p<? super R, ? super InterfaceC11722b, ? extends R> interfaceC11771p) {
                l.f(interfaceC11771p, "operation");
                return interfaceC11771p.invoke(r, interfaceC11722b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends InterfaceC11722b> E m10398b(InterfaceC11722b interfaceC11722b, InterfaceC11724c<E> interfaceC11724c) {
                l.f(interfaceC11724c, "key");
                if (l.b(interfaceC11722b.getKey(), interfaceC11724c)) {
                    if (interfaceC11722b != 0) {
                        return interfaceC11722b;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type E");
                }
                return null;
            }

            /* renamed from: c */
            public static InterfaceC11719g m10397c(InterfaceC11722b interfaceC11722b, InterfaceC11724c<?> interfaceC11724c) {
                l.f(interfaceC11724c, "key");
                return l.b(interfaceC11722b.getKey(), interfaceC11724c) ? C11725h.f26446c : interfaceC11722b;
            }

            /* renamed from: d */
            public static InterfaceC11719g m10396d(InterfaceC11722b interfaceC11722b, InterfaceC11719g interfaceC11719g) {
                l.f(interfaceC11719g, "context");
                return C11720a.m10401a(interfaceC11722b, interfaceC11719g);
            }
        }

        @Override // kotlin.p476c0.InterfaceC11719g
        <E extends InterfaceC11722b> E get(InterfaceC11724c<E> interfaceC11724c);

        InterfaceC11724c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: kotlin.c0.g$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC11724c<E extends InterfaceC11722b> {
    }

    <R> R fold(R r, InterfaceC11771p<? super R, ? super InterfaceC11722b, ? extends R> interfaceC11771p);

    <E extends InterfaceC11722b> E get(InterfaceC11724c<E> interfaceC11724c);

    InterfaceC11719g minusKey(InterfaceC11724c<?> interfaceC11724c);

    InterfaceC11719g plus(InterfaceC11719g interfaceC11719g);
}
