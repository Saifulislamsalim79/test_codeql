package kotlin.p493j0.p494o.p495c.p547q0;

import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
/* compiled from: HashPMap.java */
/* renamed from: kotlin.j0.o.c.q0.b */
/* loaded from: classes3.dex */
public final class C13182b<K, V> {

    /* renamed from: c */
    private static final C13182b<Object, Object> f29307c = new C13182b<>(C13184d.m5682a(), 0);

    /* renamed from: a */
    private final C13184d<C13180a<C13185e<K, V>>> f29308a;

    /* renamed from: b */
    private final int f29309b;

    private C13182b(C13184d<C13180a<C13185e<K, V>>> c13184d, int i) {
        this.f29308a = c13184d;
        this.f29309b = i;
    }

    /* renamed from: a */
    private static /* synthetic */ void m5693a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = MPOSPaymentMethod.STATE_EMPTY;
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    public static <K, V> C13182b<K, V> m5692b() {
        C13182b<K, V> c13182b = (C13182b<K, V>) f29307c;
        if (c13182b != null) {
            return c13182b;
        }
        m5693a(0);
        throw null;
    }

    /* renamed from: d */
    private C13180a<C13185e<K, V>> m5690d(int i) {
        C13180a<C13185e<K, V>> m5681b = this.f29308a.m5681b(i);
        return m5681b == null ? C13180a.m5699e() : m5681b;
    }

    /* renamed from: e */
    private static <K, V> int m5689e(C13180a<C13185e<K, V>> c13180a, Object obj) {
        int i = 0;
        while (c13180a != null && c13180a.size() > 0) {
            if (c13180a.f29303c.f29318c.equals(obj)) {
                return i;
            }
            c13180a = c13180a.f29304d;
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public V m5691c(Object obj) {
        for (C13180a m5690d = m5690d(obj.hashCode()); m5690d != null && m5690d.size() > 0; m5690d = m5690d.f29304d) {
            C13185e c13185e = (C13185e) m5690d.f29303c;
            if (c13185e.f29318c.equals(obj)) {
                return c13185e.f29319d;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C13182b<K, V> m5688f(K k, V v) {
        C13180a<C13185e<K, V>> m5690d = m5690d(k.hashCode());
        int size = m5690d.size();
        int m5689e = m5689e(m5690d, k);
        if (m5689e != -1) {
            m5690d = m5690d.m5697h(m5689e);
        }
        C13180a<C13185e<K, V>> m5695l = m5690d.m5695l(new C13185e<>(k, v));
        return new C13182b<>(this.f29308a.m5680c(k.hashCode(), m5695l), (this.f29309b - size) + m5695l.size());
    }
}
