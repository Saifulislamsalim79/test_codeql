package kotlin.p557z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Maps.kt */
/* renamed from: kotlin.z.s0 */
/* loaded from: classes3.dex */
public class C13729s0 extends C13727r0 {
    /* renamed from: y */
    public static <K, V> List<C13287o<K, V>> m3862y(Map<? extends K, ? extends V> map) {
        List<C13287o<K, V>> m3901b;
        List<C13287o<K, V>> m3891e;
        List<C13287o<K, V>> m3891e2;
        l.f(map, "$this$toList");
        if (map.size() == 0) {
            m3891e2 = C13726r.m3891e();
            return m3891e2;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            m3901b = C13724q.m3901b(new C13287o(next.getKey(), next.getValue()));
            return m3901b;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C13287o(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new C13287o(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
