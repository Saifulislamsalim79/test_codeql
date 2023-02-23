package com.google.mlkit.common.p186b;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.e */
/* loaded from: classes2.dex */
public abstract class AbstractC6931e<K, V> {

    /* renamed from: a */
    private final Map f16624a = new HashMap();

    /* renamed from: a */
    protected abstract V mo15519a(K k);

    /* renamed from: b */
    public V m20454b(K k) {
        synchronized (this.f16624a) {
            if (this.f16624a.containsKey(k)) {
                return (V) this.f16624a.get(k);
            }
            V mo15519a = mo15519a(k);
            this.f16624a.put(k, mo15519a);
            return mo15519a;
        }
    }
}
