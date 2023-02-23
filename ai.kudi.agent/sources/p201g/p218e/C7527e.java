package p201g.p218e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: LruCache.java */
/* renamed from: g.e.e */
/* loaded from: classes2.dex */
public class C7527e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f17880a;

    /* renamed from: b */
    private int f17881b;

    /* renamed from: c */
    private int f17882c;

    /* renamed from: d */
    private int f17883d;

    /* renamed from: e */
    private int f17884e;

    /* renamed from: f */
    private int f17885f;

    /* renamed from: g */
    private int f17886g;

    /* renamed from: h */
    private int f17887h;

    public C7527e(int i) {
        if (i > 0) {
            this.f17882c = i;
            this.f17880a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: f */
    private int m18484f(K k, V v) {
        int m18483g = m18483g(k, v);
        if (m18483g >= 0) {
            return m18483g;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V mo18489a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void m18488b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final V m18487c(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.f17880a.get(k);
                if (v != null) {
                    this.f17886g++;
                    return v;
                }
                this.f17887h++;
                V mo18489a = mo18489a(k);
                if (mo18489a == null) {
                    return null;
                }
                synchronized (this) {
                    this.f17884e++;
                    put = this.f17880a.put(k, mo18489a);
                    if (put != null) {
                        this.f17880a.put(k, put);
                    } else {
                        this.f17881b += m18484f(k, mo18489a);
                    }
                }
                if (put != null) {
                    m18488b(false, k, mo18489a, put);
                    return put;
                }
                m18481i(this.f17882c);
                return mo18489a;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final V m18486d(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.f17883d++;
                this.f17881b += m18484f(k, v);
                put = this.f17880a.put(k, v);
                if (put != null) {
                    this.f17881b -= m18484f(k, put);
                }
            }
            if (put != null) {
                m18488b(false, k, put, v);
            }
            m18481i(this.f17882c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: e */
    public final V m18485e(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f17880a.remove(k);
                if (remove != null) {
                    this.f17881b -= m18484f(k, remove);
                }
            }
            if (remove != null) {
                m18488b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: g */
    protected int m18483g(K k, V v) {
        return 1;
    }

    /* renamed from: h */
    public final synchronized Map<K, V> m18482h() {
        return new LinkedHashMap(this.f17880a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18481i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f17881b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f17880a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f17881b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f17881b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f17880a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f17880a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f17880a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f17881b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m18484f(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f17881b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f17885f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f17885f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m18488b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r5
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p218e.C7527e.m18481i(int):void");
    }

    public final synchronized String toString() {
        int i;
        i = this.f17886g + this.f17887h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f17882c), Integer.valueOf(this.f17886g), Integer.valueOf(this.f17887h), Integer.valueOf(i != 0 ? (this.f17886g * 100) / i : 0));
    }
}
