package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC1227f;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: OptionsBundle.java */
/* renamed from: androidx.camera.core.impl.i */
/* loaded from: classes2.dex */
public class C1232i implements InterfaceC1227f {

    /* renamed from: d */
    protected static final Comparator<InterfaceC1227f.AbstractC1228a<?>> f3704d = C1222a.f3695c;

    /* renamed from: c */
    protected final TreeMap<InterfaceC1227f.AbstractC1228a<?>, Map<InterfaceC1227f.EnumC1229b, Object>> f3705c;

    static {
        new TreeMap(f3704d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1232i(TreeMap<InterfaceC1227f.AbstractC1228a<?>, Map<InterfaceC1227f.EnumC1229b, Object>> treeMap) {
        this.f3705c = treeMap;
    }

    /* renamed from: g */
    public static C1232i m36713g(InterfaceC1227f interfaceC1227f) {
        if (C1232i.class.equals(interfaceC1227f.getClass())) {
            return (C1232i) interfaceC1227f;
        }
        TreeMap treeMap = new TreeMap(f3704d);
        for (InterfaceC1227f.AbstractC1228a<?> abstractC1228a : interfaceC1227f.mo36716c()) {
            Set<InterfaceC1227f.EnumC1229b> mo36714f = interfaceC1227f.mo36714f(abstractC1228a);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC1227f.EnumC1229b enumC1229b : mo36714f) {
                arrayMap.put(enumC1229b, interfaceC1227f.mo36717b(abstractC1228a, enumC1229b));
            }
            treeMap.put(abstractC1228a, arrayMap);
        }
        return new C1232i(treeMap);
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: b */
    public <ValueT> ValueT mo36717b(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, InterfaceC1227f.EnumC1229b enumC1229b) {
        Map<InterfaceC1227f.EnumC1229b, Object> map = this.f3705c.get(abstractC1228a);
        if (map != null) {
            if (map.containsKey(enumC1229b)) {
                return (ValueT) map.get(enumC1229b);
            }
            throw new IllegalArgumentException("Option does not exist: " + abstractC1228a + " with priority=" + enumC1229b);
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC1228a);
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: c */
    public Set<InterfaceC1227f.AbstractC1228a<?>> mo36716c() {
        return Collections.unmodifiableSet(this.f3705c.keySet());
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: e */
    public <ValueT> ValueT mo36715e(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, ValueT valuet) {
        try {
            return (ValueT) m36711i(abstractC1228a);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1227f
    /* renamed from: f */
    public Set<InterfaceC1227f.EnumC1229b> mo36714f(InterfaceC1227f.AbstractC1228a<?> abstractC1228a) {
        Map<InterfaceC1227f.EnumC1229b, Object> map = this.f3705c.get(abstractC1228a);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    /* renamed from: i */
    public <ValueT> ValueT m36711i(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a) {
        Map<InterfaceC1227f.EnumC1229b, Object> map = this.f3705c.get(abstractC1228a);
        if (map != null) {
            return (ValueT) map.get((InterfaceC1227f.EnumC1229b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + abstractC1228a);
    }
}
