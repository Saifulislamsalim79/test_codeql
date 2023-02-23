package kotlin.p557z;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: MapWithDefault.kt */
/* renamed from: kotlin.z.n0 */
/* loaded from: classes3.dex */
final class C13719n0<K, V> implements InterfaceC13714m0<K, V> {

    /* renamed from: c */
    private final Map<K, V> f30173c;

    /* renamed from: d */
    private final InterfaceC11767l<K, V> f30174d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13719n0(Map<K, ? extends V> map, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        l.f(map, "map");
        l.f(interfaceC11767l, "default");
        this.f30173c = map;
        this.f30174d = interfaceC11767l;
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> m3997a() {
        return mo3858d().entrySet();
    }

    /* renamed from: b */
    public Set<K> m3996b() {
        return mo3858d().keySet();
    }

    /* renamed from: c */
    public int m3995c() {
        return mo3858d().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo3858d().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo3858d().containsValue(obj);
    }

    @Override // kotlin.p557z.InterfaceC13714m0
    /* renamed from: d */
    public Map<K, V> mo3858d() {
        return this.f30173c;
    }

    /* renamed from: e */
    public Collection<V> m3994e() {
        return mo3858d().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m3997a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return mo3858d().equals(obj);
    }

    @Override // kotlin.p557z.InterfaceC13714m0
    /* renamed from: f */
    public V mo3856f(K k) {
        Map<K, V> mo3858d = mo3858d();
        V v = mo3858d.get(k);
        return (v != null || mo3858d.containsKey(k)) ? v : this.f30174d.invoke(k);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo3858d().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo3858d().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo3858d().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m3996b();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m3995c();
    }

    public String toString() {
        return mo3858d().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m3994e();
    }
}
