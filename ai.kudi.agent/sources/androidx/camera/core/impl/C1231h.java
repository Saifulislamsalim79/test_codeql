package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC1227f;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: MutableOptionsBundle.java */
/* renamed from: androidx.camera.core.impl.h */
/* loaded from: classes2.dex */
public final class C1231h extends C1232i implements InterfaceC1230g {

    /* renamed from: e */
    private static final InterfaceC1227f.EnumC1229b f3703e = InterfaceC1227f.EnumC1229b.OPTIONAL;

    private C1231h(TreeMap<InterfaceC1227f.AbstractC1228a<?>, Map<InterfaceC1227f.EnumC1229b, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: j */
    public static C1231h m36719j() {
        return new C1231h(new TreeMap(C1232i.f3704d));
    }

    @Override // androidx.camera.core.impl.InterfaceC1230g
    /* renamed from: d */
    public <ValueT> void mo36720d(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, ValueT valuet) {
        m36718k(abstractC1228a, f3703e, valuet);
    }

    /* renamed from: k */
    public <ValueT> void m36718k(InterfaceC1227f.AbstractC1228a<ValueT> abstractC1228a, InterfaceC1227f.EnumC1229b enumC1229b, ValueT valuet) {
        Map<InterfaceC1227f.EnumC1229b, Object> map = this.f3705c.get(abstractC1228a);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f3705c.put(abstractC1228a, arrayMap);
            arrayMap.put(enumC1229b, valuet);
            return;
        }
        InterfaceC1227f.EnumC1229b enumC1229b2 = (InterfaceC1227f.EnumC1229b) Collections.min(map.keySet());
        if (!map.get(enumC1229b2).equals(valuet) && C1226e.m36726a(enumC1229b2, enumC1229b)) {
            throw new IllegalArgumentException("Option values conflicts: " + abstractC1228a.mo36723c() + ", existing value (" + enumC1229b2 + ")=" + map.get(enumC1229b2) + ", conflicting (" + enumC1229b + ")=" + valuet);
        }
        map.put(enumC1229b, valuet);
    }
}
