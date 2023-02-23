package io.intercom.com.bumptech.glide.p416r;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* renamed from: io.intercom.com.bumptech.glide.r.e */
/* loaded from: classes3.dex */
public class C10889e<T, Y> {

    /* renamed from: b */
    private long f24856b;

    /* renamed from: a */
    private final LinkedHashMap<T, Y> f24855a = new LinkedHashMap<>(100, 0.75f, true);

    /* renamed from: c */
    private long f24857c = 0;

    public C10889e(long j) {
        this.f24856b = j;
    }

    /* renamed from: f */
    private void m12029f() {
        m12022m(this.f24856b);
    }

    /* renamed from: b */
    public void m12030b() {
        m12022m(0L);
    }

    /* renamed from: g */
    public synchronized Y m12028g(T t) {
        return this.f24855a.get(t);
    }

    /* renamed from: h */
    public synchronized long m12027h() {
        return this.f24857c;
    }

    /* renamed from: i */
    protected int mo12026i(Y y) {
        return 1;
    }

    /* renamed from: j */
    protected void mo12025j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y m12024k(T t, Y y) {
        if (mo12026i(y) >= this.f24856b) {
            mo12025j(t, y);
            return null;
        }
        Y put = this.f24855a.put(t, y);
        if (y != null) {
            this.f24857c += mo12026i(y);
        }
        if (put != null) {
            this.f24857c -= mo12026i(put);
            if (!put.equals(y)) {
                mo12025j(t, put);
            }
        }
        m12029f();
        return put;
    }

    /* renamed from: l */
    public synchronized Y m12023l(T t) {
        Y remove;
        remove = this.f24855a.remove(t);
        if (remove != null) {
            this.f24857c -= mo12026i(remove);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void m12022m(long j) {
        while (this.f24857c > j) {
            Iterator<Map.Entry<T, Y>> it = this.f24855a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f24857c -= mo12026i(value);
            T key = next.getKey();
            it.remove();
            mo12025j(key, value);
        }
    }
}
