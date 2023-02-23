package com.bumptech.glide.p086q;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* renamed from: com.bumptech.glide.q.g */
/* loaded from: classes2.dex */
public class C2377g<T, Y> {

    /* renamed from: a */
    private final Map<T, Y> f6868a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f6869b;

    /* renamed from: c */
    private long f6870c;

    public C2377g(long j) {
        this.f6869b = j;
    }

    /* renamed from: f */
    private void m33143f() {
        m33136m(this.f6869b);
    }

    /* renamed from: b */
    public void m33144b() {
        m33136m(0L);
    }

    /* renamed from: g */
    public synchronized Y m33142g(T t) {
        return this.f6868a.get(t);
    }

    /* renamed from: h */
    public synchronized long m33141h() {
        return this.f6869b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public int mo33140i(Y y) {
        return 1;
    }

    /* renamed from: j */
    protected void mo33139j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y m33138k(T t, Y y) {
        long mo33140i = mo33140i(y);
        if (mo33140i >= this.f6869b) {
            mo33139j(t, y);
            return null;
        }
        if (y != null) {
            this.f6870c += mo33140i;
        }
        Y put = this.f6868a.put(t, y);
        if (put != null) {
            this.f6870c -= mo33140i(put);
            if (!put.equals(y)) {
                mo33139j(t, put);
            }
        }
        m33143f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y m33137l(T t) {
        Y remove;
        remove = this.f6868a.remove(t);
        if (remove != null) {
            this.f6870c -= mo33140i(remove);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void m33136m(long j) {
        while (this.f6870c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f6868a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f6870c -= mo33140i(value);
            T key = next.getKey();
            it.remove();
            mo33139j(key, value);
        }
    }
}
