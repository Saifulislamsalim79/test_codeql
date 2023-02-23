package p272h.p286c.p287a.p300b.p307d.p317j;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.f0 */
/* loaded from: classes2.dex */
public final class C8897f0 extends AbstractMap implements Serializable {

    /* renamed from: B */
    private static final Object f20937B = new Object();

    /* renamed from: A */
    private transient Collection f20938A;

    /* renamed from: c */
    private transient Object f20939c;

    /* renamed from: d */
    transient int[] f20940d;

    /* renamed from: e */
    transient Object[] f20941e;

    /* renamed from: f */
    transient Object[] f20942f;

    /* renamed from: w */
    private transient int f20943w;

    /* renamed from: x */
    private transient int f20944x;

    /* renamed from: y */
    private transient Set f20945y;

    /* renamed from: z */
    private transient Set f20946z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8897f0(int i) {
        m15720s(12);
    }

    /* renamed from: A */
    private final int m15740A(int i, int i2, int i3, int i4) {
        Object m15709d = C8912g0.m15709d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C8912g0.m15708e(m15709d, i3 & i5, i4 + 1);
        }
        Object obj = this.f20939c;
        obj.getClass();
        int[] m15737D = m15737D();
        for (int i6 = 0; i6 <= i; i6++) {
            int m15710c = C8912g0.m15710c(obj, i6);
            while (m15710c != 0) {
                int i7 = m15710c - 1;
                int i8 = m15737D[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int m15710c2 = C8912g0.m15710c(m15709d, i10);
                C8912g0.m15708e(m15709d, i10, m15710c);
                m15737D[i7] = ((i5 ^ (-1)) & i9) | (m15710c2 & i5);
                m15710c = i8 & i;
            }
        }
        this.f20939c = m15709d;
        m15738C(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final Object m15739B(Object obj) {
        if (m15718u()) {
            return f20937B;
        }
        int m15714y = m15714y();
        Object obj2 = this.f20939c;
        obj2.getClass();
        int m15711b = C8912g0.m15711b(obj, null, m15714y, obj2, m15737D(), m15736a(), null);
        if (m15711b == -1) {
            return f20937B;
        }
        Object obj3 = m15735b()[m15711b];
        m15719t(m15711b, m15714y);
        this.f20944x--;
        m15721r();
        return obj3;
    }

    /* renamed from: C */
    private final void m15738C(int i) {
        this.f20943w = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f20943w & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final int[] m15737D() {
        int[] iArr = this.f20940d;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final Object[] m15736a() {
        Object[] objArr = this.f20941e;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final Object[] m15735b() {
        Object[] objArr = this.f20942f;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ int m15733e(C8897f0 c8897f0) {
        int i = c8897f0.f20944x;
        c8897f0.f20944x = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ Object m15728k(C8897f0 c8897f0, int i) {
        return c8897f0.m15736a()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ Object m15725n(C8897f0 c8897f0, int i) {
        return c8897f0.m15735b()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static /* synthetic */ Object m15724o(C8897f0 c8897f0) {
        Object obj = c8897f0.f20939c;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* synthetic */ void m15722q(C8897f0 c8897f0, int i, Object obj) {
        c8897f0.m15735b()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final int m15714y() {
        return (1 << (this.f20943w & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final int m15713z(Object obj) {
        if (m15718u()) {
            return -1;
        }
        int m15702a = C8927h0.m15702a(obj);
        int m15714y = m15714y();
        Object obj2 = this.f20939c;
        obj2.getClass();
        int m15710c = C8912g0.m15710c(obj2, m15702a & m15714y);
        if (m15710c != 0) {
            int i = m15714y ^ (-1);
            int i2 = m15702a & i;
            do {
                int i3 = m15710c - 1;
                int i4 = m15737D()[i3];
                if ((i4 & i) == i2 && C9148vd.m15518a(obj, m15736a()[i3])) {
                    return i3;
                }
                m15710c = i4 & m15714y;
            } while (m15710c != 0);
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m15718u()) {
            return;
        }
        m15721r();
        Map m15723p = m15723p();
        if (m15723p != null) {
            this.f20943w = C9048p1.m15576a(size(), 3, 1073741823);
            m15723p.clear();
            this.f20939c = null;
            this.f20944x = 0;
            return;
        }
        Arrays.fill(m15736a(), 0, this.f20944x, (Object) null);
        Arrays.fill(m15735b(), 0, this.f20944x, (Object) null);
        Object obj = this.f20939c;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m15737D(), 0, this.f20944x, 0);
        this.f20944x = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m15723p = m15723p();
        if (m15723p != null) {
            return m15723p.containsKey(obj);
        }
        return m15713z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m15723p = m15723p();
        if (m15723p == null) {
            for (int i = 0; i < this.f20944x; i++) {
                if (C9148vd.m15518a(obj, m15735b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return m15723p.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20946z;
        if (set == null) {
            C9190z c9190z = new C9190z(this);
            this.f20946z = c9190z;
            return c9190z;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m15723p = m15723p();
        if (m15723p != null) {
            return m15723p.get(obj);
        }
        int m15713z = m15713z(obj);
        if (m15713z == -1) {
            return null;
        }
        return m15735b()[m15713z];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final int m15730i() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final int m15729j(int i) {
        int i2 = i + 1;
        if (i2 < this.f20944x) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f20945y;
        if (set == null) {
            C8852c0 c8852c0 = new C8852c0(this);
            this.f20945y = c8852c0;
            return c8852c0;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Map m15723p() {
        Object obj = this.f20939c;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m15718u()) {
            C8851c.m15803d(m15718u(), "Arrays already allocated");
            int i = this.f20943w;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f20939c = C8912g0.m15709d(max2);
            m15738C(max2 - 1);
            this.f20940d = new int[i];
            this.f20941e = new Object[i];
            this.f20942f = new Object[i];
        }
        Map m15723p = m15723p();
        if (m15723p != null) {
            return m15723p.put(obj, obj2);
        }
        int[] m15737D = m15737D();
        Object[] m15736a = m15736a();
        Object[] m15735b = m15735b();
        int i2 = this.f20944x;
        int i3 = i2 + 1;
        int m15702a = C8927h0.m15702a(obj);
        int m15714y = m15714y();
        int i4 = m15702a & m15714y;
        Object obj3 = this.f20939c;
        obj3.getClass();
        int m15710c = C8912g0.m15710c(obj3, i4);
        if (m15710c != 0) {
            int i5 = m15714y ^ (-1);
            int i6 = m15702a & i5;
            int i7 = 0;
            while (true) {
                int i8 = m15710c - 1;
                int i9 = m15737D[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && C9148vd.m15518a(obj, m15736a[i8])) {
                    Object obj4 = m15735b[i8];
                    m15735b[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & m15714y;
                i7++;
                if (i11 != 0) {
                    m15710c = i11;
                } else if (i7 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m15714y() + 1, 1.0f);
                    int m15730i = m15730i();
                    while (m15730i >= 0) {
                        linkedHashMap.put(m15736a()[m15730i], m15735b()[m15730i]);
                        m15730i = m15729j(m15730i);
                    }
                    this.f20939c = linkedHashMap;
                    this.f20940d = null;
                    this.f20941e = null;
                    this.f20942f = null;
                    m15721r();
                    return linkedHashMap.put(obj, obj2);
                } else if (i3 > m15714y) {
                    m15714y = m15740A(m15714y, C8912g0.m15712a(m15714y), m15702a, i2);
                } else {
                    m15737D[i8] = (i3 & m15714y) | i10;
                }
            }
        } else if (i3 > m15714y) {
            m15714y = m15740A(m15714y, C8912g0.m15712a(m15714y), m15702a, i2);
        } else {
            Object obj5 = this.f20939c;
            obj5.getClass();
            C8912g0.m15708e(obj5, i4, i3);
        }
        int length = m15737D().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f20940d = Arrays.copyOf(m15737D(), min);
            this.f20941e = Arrays.copyOf(m15736a(), min);
            this.f20942f = Arrays.copyOf(m15735b(), min);
        }
        m15737D()[i2] = (m15714y ^ (-1)) & m15702a;
        m15736a()[i2] = obj;
        m15735b()[i2] = obj2;
        this.f20944x = i3;
        m15721r();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m15721r() {
        this.f20943w += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m15723p = m15723p();
        if (m15723p != null) {
            return m15723p.remove(obj);
        }
        Object m15739B = m15739B(obj);
        if (m15739B == f20937B) {
            return null;
        }
        return m15739B;
    }

    /* renamed from: s */
    final void m15720s(int i) {
        this.f20943w = C9048p1.m15576a(12, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m15723p = m15723p();
        return m15723p != null ? m15723p.size() : this.f20944x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final void m15719t(int i, int i2) {
        Object obj = this.f20939c;
        obj.getClass();
        int[] m15737D = m15737D();
        Object[] m15736a = m15736a();
        Object[] m15735b = m15735b();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = m15736a[size];
            m15736a[i] = obj2;
            m15735b[i] = m15735b[size];
            m15736a[size] = null;
            m15735b[size] = null;
            m15737D[i] = m15737D[size];
            m15737D[size] = 0;
            int m15702a = C8927h0.m15702a(obj2) & i2;
            int m15710c = C8912g0.m15710c(obj, m15702a);
            int i3 = size + 1;
            if (m15710c == i3) {
                C8912g0.m15708e(obj, m15702a, i + 1);
                return;
            }
            while (true) {
                int i4 = m15710c - 1;
                int i5 = m15737D[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    m15737D[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                    return;
                }
                m15710c = i6;
            }
        } else {
            m15736a[i] = null;
            m15735b[i] = null;
            m15737D[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m15718u() {
        return this.f20939c == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f20938A;
        if (collection == null) {
            C8882e0 c8882e0 = new C8882e0(this);
            this.f20938A = c8882e0;
            return c8882e0;
        }
        return collection;
    }
}
