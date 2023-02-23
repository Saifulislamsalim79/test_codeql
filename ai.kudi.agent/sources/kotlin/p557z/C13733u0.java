package kotlin.p557z;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: MapWithDefault.kt */
/* renamed from: kotlin.z.u0 */
/* loaded from: classes3.dex */
final class C13733u0<K, V> implements InterfaceC13731t0<K, V> {

    /* renamed from: c */
    private final Map<K, V> f30175c;

    /* renamed from: d */
    private final InterfaceC11767l<K, V> f30176d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13733u0(Map<K, V> map, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        l.f(map, "map");
        l.f(interfaceC11767l, "default");
        this.f30175c = map;
        this.f30176d = interfaceC11767l;
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> m3861a() {
        return mo3858d().entrySet();
    }

    /* renamed from: b */
    public Set<K> m3860b() {
        return mo3858d().keySet();
    }

    /* renamed from: c */
    public int m3859c() {
        return mo3858d().size();
    }

    @Override // java.util.Map
    public void clear() {
        mo3858d().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo3858d().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo3858d().containsValue(obj);
    }

    @Override // kotlin.p557z.InterfaceC13731t0, kotlin.p557z.InterfaceC13714m0
    /* renamed from: d */
    public Map<K, V> mo3858d() {
        return this.f30175c;
    }

    /* renamed from: e */
    public Collection<V> m3857e() {
        return mo3858d().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m3861a();
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
        return (v != null || mo3858d.containsKey(k)) ? v : this.f30176d.invoke(k);
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
        return m3860b();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return mo3858d().put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        l.f(map, "from");
        mo3858d().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return mo3858d().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m3859c();
    }

    public String toString() {
        return mo3858d().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m3857e();
    }
}
