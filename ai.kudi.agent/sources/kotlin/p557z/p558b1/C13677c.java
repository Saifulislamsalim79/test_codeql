package kotlin.p557z.p558b1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11794d;
import kotlin.p491i0.C11841h;
import kotlin.p557z.C13712m;
/* compiled from: MapBuilder.kt */
/* renamed from: kotlin.z.b1.c */
/* loaded from: classes3.dex */
public final class C13677c<K, V> implements Map<K, V>, InterfaceC11794d {

    /* renamed from: E */
    private static final C13678a f30125E = new C13678a(null);

    /* renamed from: A */
    private int[] f30126A;

    /* renamed from: B */
    private int[] f30127B;

    /* renamed from: C */
    private int f30128C;

    /* renamed from: D */
    private int f30129D;

    /* renamed from: c */
    private int f30130c;

    /* renamed from: d */
    private int f30131d;

    /* renamed from: e */
    private C13685e<K> f30132e;

    /* renamed from: f */
    private C13686f<V> f30133f;

    /* renamed from: w */
    private C13684d<K, V> f30134w;

    /* renamed from: x */
    private boolean f30135x;

    /* renamed from: y */
    private K[] f30136y;

    /* renamed from: z */
    private V[] f30137z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$a */
    /* loaded from: classes3.dex */
    public static final class C13678a {
        private C13678a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m4173c(int i) {
            int m10271a;
            m10271a = C11841h.m10271a(i, 1);
            return Integer.highestOneBit(m10271a * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m4172d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public /* synthetic */ C13678a(g gVar) {
            this();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$b */
    /* loaded from: classes3.dex */
    public static final class C13679b<K, V> extends C13681d<K, V> implements Iterator<Map.Entry<K, V>>, Object {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13679b(C13677c<K, V> c13677c) {
            super(c13677c);
            l.f(c13677c, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i */
        public C13680c<K, V> next() {
            if (m4168a() < ((C13677c) m4166c()).f30129D) {
                int m4168a = m4168a();
                m4164g(m4168a + 1);
                m4163h(m4168a);
                C13680c<K, V> c13680c = new C13680c<>(m4166c(), m4167b());
                m4165e();
                return c13680c;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final void m4170j(StringBuilder sb) {
            l.f(sb, "sb");
            if (m4168a() < ((C13677c) m4166c()).f30129D) {
                int m4168a = m4168a();
                m4164g(m4168a + 1);
                m4163h(m4168a);
                Object obj = ((C13677c) m4166c()).f30136y[m4167b()];
                if (l.b(obj, m4166c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((C13677c) m4166c()).f30137z;
                l.d(objArr);
                Object obj2 = objArr[m4167b()];
                if (l.b(obj2, m4166c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                m4165e();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: k */
        public final int m4169k() {
            if (m4168a() < ((C13677c) m4166c()).f30129D) {
                int m4168a = m4168a();
                m4164g(m4168a + 1);
                m4163h(m4168a);
                Object obj = ((C13677c) m4166c()).f30136y[m4167b()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((C13677c) m4166c()).f30137z;
                l.d(objArr);
                Object obj2 = objArr[m4167b()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                m4165e();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$c */
    /* loaded from: classes3.dex */
    public static final class C13680c<K, V> implements Map.Entry<K, V>, InterfaceC11794d.InterfaceC11795a {

        /* renamed from: c */
        private final C13677c<K, V> f30138c;

        /* renamed from: d */
        private final int f30139d;

        public C13680c(C13677c<K, V> c13677c, int i) {
            l.f(c13677c, "map");
            this.f30138c = c13677c;
            this.f30139d = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (l.b(entry.getKey(), getKey()) && l.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C13677c) this.f30138c).f30136y[this.f30139d];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C13677c) this.f30138c).f30137z;
            l.d(objArr);
            return (V) objArr[this.f30139d];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f30138c.m4189l();
            Object[] m4191j = this.f30138c.m4191j();
            int i = this.f30139d;
            V v2 = (V) m4191j[i];
            m4191j[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$d */
    /* loaded from: classes3.dex */
    public static class C13681d<K, V> {

        /* renamed from: c */
        private int f30140c;

        /* renamed from: d */
        private int f30141d;

        /* renamed from: e */
        private final C13677c<K, V> f30142e;

        public C13681d(C13677c<K, V> c13677c) {
            l.f(c13677c, "map");
            this.f30142e = c13677c;
            this.f30141d = -1;
            m4165e();
        }

        /* renamed from: a */
        public final int m4168a() {
            return this.f30140c;
        }

        /* renamed from: b */
        public final int m4167b() {
            return this.f30141d;
        }

        /* renamed from: c */
        public final C13677c<K, V> m4166c() {
            return this.f30142e;
        }

        /* renamed from: e */
        public final void m4165e() {
            while (this.f30140c < ((C13677c) this.f30142e).f30129D) {
                int[] iArr = ((C13677c) this.f30142e).f30126A;
                int i = this.f30140c;
                if (iArr[i] >= 0) {
                    return;
                }
                this.f30140c = i + 1;
            }
        }

        /* renamed from: g */
        public final void m4164g(int i) {
            this.f30140c = i;
        }

        /* renamed from: h */
        public final void m4163h(int i) {
            this.f30141d = i;
        }

        public final boolean hasNext() {
            return this.f30140c < ((C13677c) this.f30142e).f30129D;
        }

        public final void remove() {
            if (this.f30141d != -1) {
                this.f30142e.m4189l();
                this.f30142e.m4201L(this.f30141d);
                this.f30141d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$e */
    /* loaded from: classes3.dex */
    public static final class C13682e<K, V> extends C13681d<K, V> implements Iterator<K>, Object {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13682e(C13677c<K, V> c13677c) {
            super(c13677c);
            l.f(c13677c, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (m4168a() < ((C13677c) m4166c()).f30129D) {
                int m4168a = m4168a();
                m4164g(m4168a + 1);
                m4163h(m4168a);
                K k = (K) ((C13677c) m4166c()).f30136y[m4167b()];
                m4165e();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: kotlin.z.b1.c$f */
    /* loaded from: classes3.dex */
    public static final class C13683f<K, V> extends C13681d<K, V> implements Iterator<V>, Object {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13683f(C13677c<K, V> c13677c) {
            super(c13677c);
            l.f(c13677c, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (m4168a() < ((C13677c) m4166c()).f30129D) {
                int m4168a = m4168a();
                m4164g(m4168a + 1);
                m4163h(m4168a);
                Object[] objArr = ((C13677c) m4166c()).f30137z;
                l.d(objArr);
                V v = (V) objArr[m4167b()];
                m4165e();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private C13677c(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f30136y = kArr;
        this.f30137z = vArr;
        this.f30126A = iArr;
        this.f30127B = iArr2;
        this.f30128C = i;
        this.f30129D = i2;
        this.f30130c = f30125E.m4172d(m4177y());
    }

    /* renamed from: C */
    private final int m4210C(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f30130c;
    }

    /* renamed from: E */
    private final boolean m4208E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m4183s(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (m4207F(entry)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private final boolean m4207F(Map.Entry<? extends K, ? extends V> entry) {
        int m4192i = m4192i(entry.getKey());
        V[] m4191j = m4191j();
        if (m4192i >= 0) {
            m4191j[m4192i] = entry.getValue();
            return true;
        }
        int i = (-m4192i) - 1;
        if (!l.b(entry.getValue(), m4191j[i])) {
            m4191j[i] = entry.getValue();
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private final boolean m4206G(int i) {
        int m4210C = m4210C(this.f30136y[i]);
        int i2 = this.f30128C;
        while (true) {
            int[] iArr = this.f30127B;
            if (iArr[m4210C] == 0) {
                iArr[m4210C] = i + 1;
                this.f30126A[i] = m4210C;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            m4210C = m4210C == 0 ? m4177y() - 1 : m4210C - 1;
        }
    }

    /* renamed from: H */
    private final void m4205H(int i) {
        if (this.f30129D > size()) {
            m4188m();
        }
        int i2 = 0;
        if (i != m4177y()) {
            this.f30127B = new int[i];
            this.f30130c = f30125E.m4172d(i);
        } else {
            C13712m.m4062i(this.f30127B, 0, 0, m4177y());
        }
        while (i2 < this.f30129D) {
            int i3 = i2 + 1;
            if (!m4206G(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* renamed from: J */
    private final void m4203J(int i) {
        int m10268d;
        m10268d = C11841h.m10268d(this.f30128C * 2, m4177y() / 2);
        int i2 = m10268d;
        int i3 = 0;
        int i4 = i;
        do {
            i = i == 0 ? m4177y() - 1 : i - 1;
            i3++;
            if (i3 > this.f30128C) {
                this.f30127B[i4] = 0;
                return;
            }
            int[] iArr = this.f30127B;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                if (((m4210C(this.f30136y[i6]) - i) & (m4177y() - 1)) >= i3) {
                    this.f30127B[i4] = i5;
                    this.f30126A[i6] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.f30127B[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m4201L(int i) {
        C13676b.m4214c(this.f30136y, i);
        m4203J(this.f30126A[i]);
        this.f30126A[i] = -1;
        this.f30131d = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final V[] m4191j() {
        V[] vArr = this.f30137z;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C13676b.m4216a(m4179w());
        this.f30137z = vArr2;
        return vArr2;
    }

    /* renamed from: m */
    private final void m4188m() {
        int i;
        V[] vArr = this.f30137z;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f30129D;
            if (i2 >= i) {
                break;
            }
            if (this.f30126A[i2] >= 0) {
                K[] kArr = this.f30136y;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C13676b.m4213d(this.f30136y, i3, i);
        if (vArr != null) {
            C13676b.m4213d(vArr, i3, this.f30129D);
        }
        this.f30129D = i3;
    }

    /* renamed from: p */
    private final boolean m4185p(Map<?, ?> map) {
        return size() == map.size() && m4187n(map.entrySet());
    }

    /* renamed from: q */
    private final void m4184q(int i) {
        if (i > m4179w()) {
            int m4179w = (m4179w() * 3) / 2;
            if (i <= m4179w) {
                i = m4179w;
            }
            this.f30136y = (K[]) C13676b.m4215b(this.f30136y, i);
            V[] vArr = this.f30137z;
            this.f30137z = vArr != null ? (V[]) C13676b.m4215b(vArr, i) : null;
            int[] copyOf = Arrays.copyOf(this.f30126A, i);
            l.e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f30126A = copyOf;
            int m4173c = f30125E.m4173c(i);
            if (m4173c > m4177y()) {
                m4205H(m4173c);
            }
        } else if ((this.f30129D + i) - size() > m4179w()) {
            m4205H(m4177y());
        }
    }

    /* renamed from: s */
    private final void m4183s(int i) {
        m4184q(this.f30129D + i);
    }

    /* renamed from: u */
    private final int m4181u(K k) {
        int m4210C = m4210C(k);
        int i = this.f30128C;
        while (true) {
            int i2 = this.f30127B[m4210C];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (l.b(this.f30136y[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            m4210C = m4210C == 0 ? m4177y() - 1 : m4210C - 1;
        }
    }

    /* renamed from: v */
    private final int m4180v(V v) {
        int i = this.f30129D;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f30126A[i] >= 0) {
                V[] vArr = this.f30137z;
                l.d(vArr);
                if (l.b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: w */
    private final int m4179w() {
        return this.f30136y.length;
    }

    /* renamed from: y */
    private final int m4177y() {
        return this.f30127B.length;
    }

    /* renamed from: A */
    public int m4212A() {
        return this.f30131d;
    }

    /* renamed from: B */
    public Collection<V> m4211B() {
        C13686f<V> c13686f = this.f30133f;
        if (c13686f == null) {
            C13686f<V> c13686f2 = new C13686f<>(this);
            this.f30133f = c13686f2;
            return c13686f2;
        }
        return c13686f;
    }

    /* renamed from: D */
    public final C13682e<K, V> m4209D() {
        return new C13682e<>(this);
    }

    /* renamed from: I */
    public final boolean m4204I(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        m4189l();
        int m4181u = m4181u(entry.getKey());
        if (m4181u < 0) {
            return false;
        }
        V[] vArr = this.f30137z;
        l.d(vArr);
        if (!l.b(vArr[m4181u], entry.getValue())) {
            return false;
        }
        m4201L(m4181u);
        return true;
    }

    /* renamed from: K */
    public final int m4202K(K k) {
        m4189l();
        int m4181u = m4181u(k);
        if (m4181u < 0) {
            return -1;
        }
        m4201L(m4181u);
        return m4181u;
    }

    /* renamed from: M */
    public final boolean m4200M(V v) {
        m4189l();
        int m4180v = m4180v(v);
        if (m4180v < 0) {
            return false;
        }
        m4201L(m4180v);
        return true;
    }

    /* renamed from: N */
    public final C13683f<K, V> m4199N() {
        return new C13683f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m4189l();
        int i = this.f30129D - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f30126A;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f30127B[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        C13676b.m4213d(this.f30136y, 0, this.f30129D);
        V[] vArr = this.f30137z;
        if (vArr != null) {
            C13676b.m4213d(vArr, 0, this.f30129D);
        }
        this.f30131d = 0;
        this.f30129D = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m4181u(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m4180v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m4178x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && m4185p((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int m4181u = m4181u(obj);
        if (m4181u < 0) {
            return null;
        }
        V[] vArr = this.f30137z;
        l.d(vArr);
        return vArr[m4181u];
    }

    @Override // java.util.Map
    public int hashCode() {
        C13679b<K, V> m4182t = m4182t();
        int i = 0;
        while (m4182t.hasNext()) {
            i += m4182t.m4169k();
        }
        return i;
    }

    /* renamed from: i */
    public final int m4192i(K k) {
        int m10268d;
        m4189l();
        while (true) {
            int m4210C = m4210C(k);
            m10268d = C11841h.m10268d(this.f30128C * 2, m4177y() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f30127B[m4210C];
                if (i2 <= 0) {
                    if (this.f30129D >= m4179w()) {
                        m4183s(1);
                    } else {
                        int i3 = this.f30129D;
                        int i4 = i3 + 1;
                        this.f30129D = i4;
                        this.f30136y[i3] = k;
                        this.f30126A[i3] = m4210C;
                        this.f30127B[m4210C] = i4;
                        this.f30131d = size() + 1;
                        if (i > this.f30128C) {
                            this.f30128C = i;
                        }
                        return i3;
                    }
                } else if (l.b(this.f30136y[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > m10268d) {
                        m4205H(m4177y() * 2);
                        break;
                    }
                    m4210C = m4210C == 0 ? m4177y() - 1 : m4210C - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final Map<K, V> m4190k() {
        m4189l();
        this.f30135x = true;
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m4176z();
    }

    /* renamed from: l */
    public final void m4189l() {
        if (this.f30135x) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final boolean m4187n(Collection<?> collection) {
        l.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m4186o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m4186o(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int m4181u = m4181u(entry.getKey());
        if (m4181u < 0) {
            return false;
        }
        V[] vArr = this.f30137z;
        l.d(vArr);
        return l.b(vArr[m4181u], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        m4189l();
        int m4192i = m4192i(k);
        V[] m4191j = m4191j();
        if (m4192i < 0) {
            int i = (-m4192i) - 1;
            V v2 = m4191j[i];
            m4191j[i] = v;
            return v2;
        }
        m4191j[m4192i] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        l.f(map, "from");
        m4189l();
        m4208E(map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int m4202K = m4202K(obj);
        if (m4202K < 0) {
            return null;
        }
        V[] vArr = this.f30137z;
        l.d(vArr);
        V v = vArr[m4202K];
        C13676b.m4214c(vArr, m4202K);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m4212A();
    }

    /* renamed from: t */
    public final C13679b<K, V> m4182t() {
        return new C13679b<>(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C13679b<K, V> m4182t = m4182t();
        int i = 0;
        while (m4182t.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            m4182t.m4170j(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.e(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m4211B();
    }

    /* renamed from: x */
    public Set<Map.Entry<K, V>> m4178x() {
        C13684d<K, V> c13684d = this.f30134w;
        if (c13684d == null) {
            C13684d<K, V> c13684d2 = new C13684d<>(this);
            this.f30134w = c13684d2;
            return c13684d2;
        }
        return c13684d;
    }

    /* renamed from: z */
    public Set<K> m4176z() {
        C13685e<K> c13685e = this.f30132e;
        if (c13685e == null) {
            C13685e<K> c13685e2 = new C13685e<>(this);
            this.f30132e = c13685e2;
            return c13685e2;
        }
        return c13685e;
    }

    public C13677c() {
        this(8);
    }

    public C13677c(int i) {
        this(C13676b.m4216a(i), null, new int[i], new int[f30125E.m4173c(i)], 2, 0);
    }
}
