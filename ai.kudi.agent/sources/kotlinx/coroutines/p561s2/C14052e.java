package kotlinx.coroutines.p561s2;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import p577n.p586b.InterfaceC14455a;
/* compiled from: ReactiveFlow.kt */
/* renamed from: kotlinx.coroutines.s2.e */
/* loaded from: classes3.dex */
public final class C14052e {

    /* renamed from: a */
    private static final InterfaceC14041a[] f30650a;

    static {
        InterfaceC13230h m5588a;
        List m5563x;
        m5588a = C13234l.m5588a(ServiceLoader.load(InterfaceC14041a.class, InterfaceC14041a.class.getClassLoader()).iterator());
        m5563x = C13242n.m5563x(m5588a);
        Object[] array = m5563x.toArray(new InterfaceC14041a[0]);
        if (array != null) {
            f30650a = (InterfaceC14041a[]) array;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3168a(InterfaceC14455a<T> interfaceC14455a) {
        return new C14049d(interfaceC14455a, null, 0, null, 14, null);
    }

    /* renamed from: b */
    public static final <T> InterfaceC14455a<T> m3167b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11719g interfaceC11719g) {
        return new C14042b(interfaceC13964d, C14107x0.m2943d().plus(interfaceC11719g));
    }

    /* renamed from: c */
    public static final <T> InterfaceC14455a<T> m3166c(InterfaceC14455a<T> interfaceC14455a, InterfaceC11719g interfaceC11719g) {
        for (InterfaceC14041a interfaceC14041a : f30650a) {
            interfaceC14455a = interfaceC14041a.m3181a(interfaceC14455a, interfaceC11719g);
        }
        return interfaceC14455a;
    }
}
