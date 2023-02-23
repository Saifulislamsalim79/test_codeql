package kotlin.p557z;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* renamed from: kotlin.z.y0 */
/* loaded from: classes3.dex */
public class C13741y0 extends C13739x0 {
    /* renamed from: b */
    public static <T> Set<T> m3831b() {
        return C13694d0.f30156c;
    }

    /* renamed from: c */
    public static <T> LinkedHashSet<T> m3830c(T... tArr) {
        int m3898f;
        l.f(tArr, "elements");
        m3898f = C13725q0.m3898f(tArr.length);
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(m3898f);
        C13715n.m4032S(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <T> Set<T> m3829d(T... tArr) {
        int m3898f;
        l.f(tArr, "elements");
        m3898f = C13725q0.m3898f(tArr.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(m3898f);
        C13715n.m4032S(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <T> Set<T> m3828e(Set<? extends T> set) {
        Set<T> m3831b;
        Set<T> m3832a;
        l.f(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            m3831b = m3831b();
            return m3831b;
        } else if (size != 1) {
            return set;
        } else {
            m3832a = C13739x0.m3832a(set.iterator().next());
            return m3832a;
        }
    }

    /* renamed from: f */
    public static <T> Set<T> m3827f(T... tArr) {
        Set<T> m3831b;
        Set<T> m4012m0;
        l.f(tArr, "elements");
        if (tArr.length > 0) {
            m4012m0 = C13715n.m4012m0(tArr);
            return m4012m0;
        }
        m3831b = m3831b();
        return m3831b;
    }
}
