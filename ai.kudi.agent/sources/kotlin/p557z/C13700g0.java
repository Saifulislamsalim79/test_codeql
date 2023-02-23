package kotlin.p557z;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.C11782b0;
import kotlin.p483e0.p485d.C11811v;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupingJVM.kt */
/* renamed from: kotlin.z.g0 */
/* loaded from: classes3.dex */
public class C13700g0 {
    /* renamed from: a */
    public static <T, K> Map<K, Integer> m4135a(InterfaceC13696e0<T, ? extends K> interfaceC13696e0) {
        l.f(interfaceC13696e0, "$this$eachCount");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> m4138b = interfaceC13696e0.m4138b();
        while (m4138b.hasNext()) {
            K m4139a = interfaceC13696e0.m4139a(m4138b.next());
            Object obj = linkedHashMap.get(m4139a);
            if (obj == null && !linkedHashMap.containsKey(m4139a)) {
                obj = new C11811v();
            }
            C11811v c11811v = (C11811v) obj;
            c11811v.f26498c++;
            linkedHashMap.put(m4139a, c11811v);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            }
            C11782b0.m10347d(entry).setValue(Integer.valueOf(((C11811v) entry.getValue()).f26498c));
        }
        return C11782b0.m10348c(linkedHashMap);
    }
}
