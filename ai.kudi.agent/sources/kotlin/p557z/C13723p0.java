package kotlin.p557z;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapWithDefault.kt */
/* renamed from: kotlin.z.p0 */
/* loaded from: classes3.dex */
public class C13723p0 {
    /* renamed from: a */
    public static <K, V> V m3905a(Map<K, ? extends V> map, K k) {
        l.f(map, "$this$getOrImplicitDefault");
        if (map instanceof InterfaceC13714m0) {
            return (V) ((InterfaceC13714m0) map).mo3856f(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m3904b(Map<K, ? extends V> map, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        Map<K, V> m3904b;
        l.f(map, "$this$withDefault");
        l.f(interfaceC11767l, "defaultValue");
        if (map instanceof InterfaceC13714m0) {
            m3904b = m3904b(((InterfaceC13714m0) map).mo3858d(), interfaceC11767l);
            return m3904b;
        }
        return new C13719n0(map, interfaceC11767l);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m3903c(Map<K, V> map, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        Map<K, V> m3903c;
        l.f(map, "$this$withDefault");
        l.f(interfaceC11767l, "defaultValue");
        if (map instanceof InterfaceC13731t0) {
            m3903c = m3903c(((InterfaceC13731t0) map).mo3858d(), interfaceC11767l);
            return m3903c;
        }
        return new C13733u0(map, interfaceC11767l);
    }
}
