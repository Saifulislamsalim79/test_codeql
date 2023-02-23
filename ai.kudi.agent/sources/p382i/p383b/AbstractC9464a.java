package p382i.p383b;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p472k.p473a.InterfaceC11700a;
/* compiled from: AbstractMapFactory.java */
/* renamed from: i.b.a */
/* loaded from: classes2.dex */
abstract class AbstractC9464a<K, V, V2> implements InterfaceC9468d<Map<K, V2>> {

    /* renamed from: a */
    private final Map<K, InterfaceC11700a<V>> f22140a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: i.b.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9465a<K, V, V2> {

        /* renamed from: a */
        final LinkedHashMap<K, InterfaceC11700a<V>> f22141a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC9465a(int i) {
            this.f22141a = C9466b.m14659b(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC9465a<K, V, V2> m14661a(K k, InterfaceC11700a<V> interfaceC11700a) {
            LinkedHashMap<K, InterfaceC11700a<V>> linkedHashMap = this.f22141a;
            C9473g.m14649c(k, "key");
            C9473g.m14649c(interfaceC11700a, "provider");
            linkedHashMap.put(k, interfaceC11700a);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9464a(Map<K, InterfaceC11700a<V>> map) {
        this.f22140a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<K, InterfaceC11700a<V>> m14662a() {
        return this.f22140a;
    }
}
