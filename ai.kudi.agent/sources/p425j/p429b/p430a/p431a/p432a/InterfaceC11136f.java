package p425j.p429b.p430a.p431a.p432a;

import java.util.Map;
import java.util.Set;
/* compiled from: HandlerFinder.java */
/* renamed from: j.b.a.a.a.f */
/* loaded from: classes3.dex */
interface InterfaceC11136f {

    /* renamed from: a */
    public static final InterfaceC11136f f25196a = new C11137a();

    /* compiled from: HandlerFinder.java */
    /* renamed from: j.b.a.a.a.f$a */
    /* loaded from: classes3.dex */
    static class C11137a implements InterfaceC11136f {
        C11137a() {
        }

        @Override // p425j.p429b.p430a.p431a.p432a.InterfaceC11136f
        public Map<Class<?>, C11135e> findAllProducers(Object obj) {
            return C11128a.m11602a(obj);
        }

        @Override // p425j.p429b.p430a.p431a.p432a.InterfaceC11136f
        public Map<Class<?>, Set<C11134d>> findAllSubscribers(Object obj) {
            return C11128a.m11601b(obj);
        }
    }

    Map<Class<?>, C11135e> findAllProducers(Object obj);

    Map<Class<?>, Set<C11134d>> findAllSubscribers(Object obj);
}
