package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.e0.d.l;
/* compiled from: Caller.kt */
/* renamed from: kotlin.j0.o.c.o0.d */
/* loaded from: classes3.dex */
public interface InterfaceC11990d<M extends Member> {

    /* compiled from: Caller.kt */
    /* renamed from: kotlin.j0.o.c.o0.d$a */
    /* loaded from: classes3.dex */
    public static final class C11991a {
        /* renamed from: a */
        public static <M extends Member> void m10006a(InterfaceC11990d<? extends M> interfaceC11990d, Object[] objArr) {
            l.f(objArr, "args");
            if (C12017f.m10001a(interfaceC11990d) == objArr.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + C12017f.m10001a(interfaceC11990d) + " arguments, but " + objArr.length + " were provided.");
        }
    }

    /* renamed from: a */
    Object mo9985a(Object[] objArr);

    /* renamed from: j */
    Type mo9983j();

    /* renamed from: k */
    List<Type> mo9982k();

    /* renamed from: l */
    M mo9981l();
}
