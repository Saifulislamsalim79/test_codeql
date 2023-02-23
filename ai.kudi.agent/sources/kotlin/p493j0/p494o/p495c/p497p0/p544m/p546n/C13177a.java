package kotlin.p493j0.p494o.p495c.p497p0.p544m.p546n;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.reflect.jvm.internal.impl.utils.C13653g;
/* compiled from: scopeUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.m.n.a */
/* loaded from: classes3.dex */
public final class C13177a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Collection<T> m5709a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        l.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C13653g<InterfaceC12777h> m5708b(Iterable<? extends InterfaceC12777h> iterable) {
        l.f(iterable, "scopes");
        C13653g<InterfaceC12777h> c13653g = new C13653g<>();
        for (InterfaceC12777h interfaceC12777h : iterable) {
            InterfaceC12777h interfaceC12777h2 = interfaceC12777h;
            if ((interfaceC12777h2 == null || interfaceC12777h2 == InterfaceC12777h.C12780b.f28671b) ? false : true) {
                c13653g.add(interfaceC12777h);
            }
        }
        return c13653g;
    }
}
