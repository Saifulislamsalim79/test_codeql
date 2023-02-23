package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.internal.C13912w;
/* compiled from: SafeCollector.common.kt */
/* renamed from: kotlinx.coroutines.flow.internal.s */
/* loaded from: classes3.dex */
public final class C13846s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.s$a */
    /* loaded from: classes3.dex */
    public static final class C13847a extends AbstractC11802m implements InterfaceC11771p<Integer, InterfaceC11719g.InterfaceC11722b, Integer> {

        /* renamed from: c */
        final /* synthetic */ C13842q<?> f30320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13847a(C13842q<?> c13842q) {
            super(2);
            this.f30320c = c13842q;
        }

        /* renamed from: a */
        public final Integer m3580a(int i, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            InterfaceC11719g.InterfaceC11724c<?> key = interfaceC11722b.getKey();
            InterfaceC11719g.InterfaceC11722b interfaceC11722b2 = this.f30320c.f30313d.get(key);
            if (key != InterfaceC13947p1.f30435u) {
                return Integer.valueOf(interfaceC11722b != interfaceC11722b2 ? Integer.MIN_VALUE : i + 1);
            }
            InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) interfaceC11722b2;
            InterfaceC13947p1 m3581b = C13846s.m3581b((InterfaceC13947p1) interfaceC11722b, interfaceC13947p1);
            if (m3581b == interfaceC13947p1) {
                if (interfaceC13947p1 != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m3581b + ", expected child of " + interfaceC13947p1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
            return m3580a(num.intValue(), interfaceC11722b);
        }
    }

    /* renamed from: a */
    public static final void m3582a(C13842q<?> c13842q, InterfaceC11719g interfaceC11719g) {
        if (((Number) interfaceC11719g.fold(0, new C13847a(c13842q))).intValue() == c13842q.f30314e) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c13842q.f30313d + ",\n\t\tbut emission happened in " + interfaceC11719g + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC13947p1 m3581b(InterfaceC13947p1 interfaceC13947p1, InterfaceC13947p1 interfaceC13947p12) {
        while (interfaceC13947p1 != null) {
            if (interfaceC13947p1 == interfaceC13947p12 || !(interfaceC13947p1 instanceof C13912w)) {
                return interfaceC13947p1;
            }
            interfaceC13947p1 = ((C13912w) interfaceC13947p1).m3435W0();
        }
        return null;
    }
}
