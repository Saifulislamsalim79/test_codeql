package kotlin.p557z;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* renamed from: kotlin.z.c0 */
/* loaded from: classes3.dex */
public final class C13688c0 implements Map, Serializable, InterfaceC11791a {

    /* renamed from: c */
    public static final C13688c0 f30148c = new C13688c0();

    private C13688c0() {
    }

    /* renamed from: a */
    public boolean m4155a(Void r2) {
        l.f(r2, "value");
        return false;
    }

    /* renamed from: b */
    public Void m4154b(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> m4153c() {
        return C13694d0.f30156c;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m4155a((Void) obj);
        }
        return false;
    }

    /* renamed from: e */
    public Set<Object> m4152e() {
        return C13694d0.f30156c;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m4153c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: g */
    public int m4151g() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return m4154b(obj);
    }

    /* renamed from: h */
    public Collection m4150h() {
        return C13674b0.f30124c;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m4152e();
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m4151g();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m4150h();
    }
}
