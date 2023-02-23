package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: FakePureImplementationsProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.m */
/* loaded from: classes3.dex */
public final class C12371m {

    /* renamed from: a */
    public static final C12371m f27451a = new C12371m();

    /* renamed from: b */
    private static final HashMap<C12609c, C12609c> f27452b = new HashMap<>();

    static {
        f27451a.m9105c(C12059k.C12060a.f26824L, f27451a.m9107a("java.util.ArrayList", "java.util.LinkedList"));
        f27451a.m9105c(C12059k.C12060a.f26826N, f27451a.m9107a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        f27451a.m9105c(C12059k.C12060a.f26827O, f27451a.m9107a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        f27451a.m9105c(new C12609c("java.util.function.Function"), f27451a.m9107a("java.util.function.UnaryOperator"));
        f27451a.m9105c(new C12609c("java.util.function.BiFunction"), f27451a.m9107a("java.util.function.BinaryOperator"));
    }

    private C12371m() {
    }

    /* renamed from: a */
    private final List<C12609c> m9107a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C12609c(str));
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m9105c(C12609c c12609c, List<C12609c> list) {
        AbstractMap abstractMap = f27452b;
        for (Object obj : list) {
            C12609c c12609c2 = (C12609c) obj;
            abstractMap.put(obj, c12609c);
        }
    }

    /* renamed from: b */
    public final C12609c m9106b(C12609c c12609c) {
        l.f(c12609c, "classFqName");
        return f27452b.get(c12609c);
    }
}
