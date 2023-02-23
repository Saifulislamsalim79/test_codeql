package com.google.common.collect;

import com.google.common.base.C5051n;
import java.util.AbstractMap;
import java.util.Map;
/* compiled from: RegularImmutableMap.java */
/* renamed from: com.google.common.collect.v */
/* loaded from: classes2.dex */
final class C5128v<K, V> extends AbstractC5077j<K, V> {

    /* renamed from: y */
    static final AbstractC5077j<Object, Object> f12793y = new C5128v(null, new Object[0], 0);

    /* renamed from: f */
    private final transient Object f12794f;

    /* renamed from: w */
    final transient Object[] f12795w;

    /* renamed from: x */
    private final transient int f12796x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* renamed from: com.google.common.collect.v$a */
    /* loaded from: classes2.dex */
    public static class C5129a<K, V> extends AbstractC5079k<Map.Entry<K, V>> {

        /* renamed from: e */
        private final transient AbstractC5077j<K, V> f12797e;

        /* renamed from: f */
        private final transient Object[] f12798f;

        /* renamed from: w */
        private final transient int f12799w;

        /* renamed from: x */
        private final transient int f12800x;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.v$a$a */
        /* loaded from: classes2.dex */
        class C5130a extends AbstractC5074i<Map.Entry<K, V>> {
            C5130a() {
            }

            @Override // java.util.List
            /* renamed from: V */
            public Map.Entry<K, V> get(int i) {
                C5051n.m25782l(i, C5129a.this.f12800x);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C5129a.this.f12798f[C5129a.this.f12799w + i2], C5129a.this.f12798f[i2 + (C5129a.this.f12799w ^ 1)]);
            }

            @Override // com.google.common.collect.AbstractC5072h
            /* renamed from: k */
            public boolean mo25554k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C5129a.this.f12800x;
            }
        }

        C5129a(AbstractC5077j<K, V> abstractC5077j, Object[] objArr, int i, int i2) {
            this.f12797e = abstractC5077j;
            this.f12798f = objArr;
            this.f12799w = i;
            this.f12800x = i2;
        }

        @Override // com.google.common.collect.AbstractC5079k
        /* renamed from: F */
        AbstractC5074i<Map.Entry<K, V>> mo25557F() {
            return new C5130a();
        }

        @Override // com.google.common.collect.AbstractC5072h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f12797e.get(key));
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: d */
        int mo25555d(Object[] objArr, int i) {
            return mo25563m().mo25555d(objArr, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: k */
        public boolean mo25554k() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5079k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: l */
        public AbstractC5064a0<Map.Entry<K, V>> iterator() {
            return mo25563m().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12800x;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: com.google.common.collect.v$b */
    /* loaded from: classes2.dex */
    static final class C5131b<K> extends AbstractC5079k<K> {

        /* renamed from: e */
        private final transient AbstractC5077j<K, ?> f12802e;

        /* renamed from: f */
        private final transient AbstractC5074i<K> f12803f;

        C5131b(AbstractC5077j<K, ?> abstractC5077j, AbstractC5074i<K> abstractC5074i) {
            this.f12802e = abstractC5077j;
            this.f12803f = abstractC5074i;
        }

        @Override // com.google.common.collect.AbstractC5072h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f12802e.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: d */
        int mo25555d(Object[] objArr, int i) {
            return mo25563m().mo25555d(objArr, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: k */
        public boolean mo25554k() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5079k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: l */
        public AbstractC5064a0<K> iterator() {
            return mo25563m().iterator();
        }

        @Override // com.google.common.collect.AbstractC5079k
        /* renamed from: m */
        public AbstractC5074i<K> mo25563m() {
            return this.f12803f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12802e.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* renamed from: com.google.common.collect.v$c */
    /* loaded from: classes2.dex */
    static final class C5132c extends AbstractC5074i<Object> {

        /* renamed from: e */
        private final transient Object[] f12804e;

        /* renamed from: f */
        private final transient int f12805f;

        /* renamed from: w */
        private final transient int f12806w;

        C5132c(Object[] objArr, int i, int i2) {
            this.f12804e = objArr;
            this.f12805f = i;
            this.f12806w = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            C5051n.m25782l(i, this.f12806w);
            return this.f12804e[(i * 2) + this.f12805f];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5072h
        /* renamed from: k */
        public boolean mo25554k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12806w;
        }
    }

    private C5128v(Object obj, Object[] objArr, int i) {
        this.f12794f = obj;
        this.f12795w = objArr;
        this.f12796x = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <K, V> C5128v<K, V> m25571n(int i, Object[] objArr) {
        if (i == 0) {
            return (C5128v) f12793y;
        }
        if (i == 1) {
            C5068d.m25746a(objArr[0], objArr[1]);
            return new C5128v<>(null, objArr, 1);
        }
        C5051n.m25777q(i, objArr.length >> 1);
        return new C5128v<>(m25570o(objArr, i, AbstractC5079k.m25711s(i), 0), objArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m25570o(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto Le
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            com.google.common.collect.C5068d.m25746a(r10, r9)
            r9 = 0
            return r9
        Le:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L50
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1b:
            if (r2 >= r10) goto L4f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C5068d.m25746a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C5071g.m25742a(r5)
        L31:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1b
        L3f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L4a
            int r5 = r5 + 1
            goto L31
        L4a:
            java.lang.IllegalArgumentException r9 = m25569p(r3, r4, r9, r6)
            throw r9
        L4f:
            return r11
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L90
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L5a:
            if (r2 >= r10) goto L8f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C5068d.m25746a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C5071g.m25742a(r5)
        L70:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L5a
        L7f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8a
            int r5 = r5 + 1
            goto L70
        L8a:
            java.lang.IllegalArgumentException r9 = m25569p(r3, r4, r9, r6)
            throw r9
        L8f:
            return r11
        L90:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L95:
            if (r2 >= r10) goto Lc5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            com.google.common.collect.C5068d.m25746a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.C5071g.m25742a(r6)
        Lab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lb5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L95
        Lb5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto Lc0
            int r6 = r6 + 1
            goto Lab
        Lc0:
            java.lang.IllegalArgumentException r9 = m25569p(r4, r5, r9, r7)
            throw r9
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C5128v.m25570o(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: p */
    private static IllegalArgumentException m25569p(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    static Object m25568q(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj2)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int m25742a = C5071g.m25742a(obj2.hashCode());
                while (true) {
                    int i3 = m25742a & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (objArr[i4].equals(obj2)) {
                        return objArr[i4 ^ 1];
                    }
                    m25742a = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int m25742a2 = C5071g.m25742a(obj2.hashCode());
                while (true) {
                    int i5 = m25742a2 & length2;
                    int i6 = sArr[i5] & 65535;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (objArr[i6].equals(obj2)) {
                        return objArr[i6 ^ 1];
                    }
                    m25742a2 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int m25742a3 = C5071g.m25742a(obj2.hashCode());
                while (true) {
                    int i7 = m25742a3 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (objArr[i8].equals(obj2)) {
                        return objArr[i8 ^ 1];
                    }
                    m25742a3 = i7 + 1;
                }
            }
        }
    }

    @Override // com.google.common.collect.AbstractC5077j
    /* renamed from: e */
    AbstractC5079k<Map.Entry<K, V>> mo25575e() {
        return new C5129a(this, this.f12795w, 0, this.f12796x);
    }

    @Override // com.google.common.collect.AbstractC5077j
    /* renamed from: g */
    AbstractC5079k<K> mo25574g() {
        return new C5131b(this, new C5132c(this.f12795w, 0, this.f12796x));
    }

    @Override // com.google.common.collect.AbstractC5077j, java.util.Map
    public V get(Object obj) {
        return (V) m25568q(this.f12794f, this.f12795w, this.f12796x, 0, obj);
    }

    @Override // com.google.common.collect.AbstractC5077j
    /* renamed from: h */
    AbstractC5072h<V> mo25573h() {
        return new C5132c(this.f12795w, 1, this.f12796x);
    }

    @Override // com.google.common.collect.AbstractC5077j
    /* renamed from: j */
    boolean mo25572j() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f12796x;
    }
}
