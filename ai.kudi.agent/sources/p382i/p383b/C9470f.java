package p382i.p383b;

import java.util.Map;
import p382i.p383b.AbstractC9464a;
import p472k.p473a.InterfaceC11700a;
/* compiled from: MapProviderFactory.java */
/* renamed from: i.b.f */
/* loaded from: classes2.dex */
public final class C9470f<K, V> extends AbstractC9464a<K, V, InterfaceC11700a<V>> {

    /* compiled from: MapProviderFactory.java */
    /* renamed from: i.b.f$b */
    /* loaded from: classes2.dex */
    public static final class C9472b<K, V> extends AbstractC9464a.AbstractC9465a<K, V, InterfaceC11700a<V>> {
        /* renamed from: b */
        public C9470f<K, V> m14653b() {
            return new C9470f<>(this.f22141a);
        }

        /* renamed from: c */
        public C9472b<K, V> m14652c(K k, InterfaceC11700a<V> interfaceC11700a) {
            super.m14661a(k, interfaceC11700a);
            return this;
        }

        private C9472b(int i) {
            super(i);
        }
    }

    /* renamed from: b */
    public static <K, V> C9472b<K, V> m14655b(int i) {
        return new C9472b<>(i);
    }

    @Override // p472k.p473a.InterfaceC11700a
    /* renamed from: c */
    public Map<K, InterfaceC11700a<V>> get() {
        return m14662a();
    }

    private C9470f(Map<K, InterfaceC11700a<V>> map) {
        super(map);
    }
}
