package com.google.firebase.inappmessaging.display.p145i.p146a;

import java.util.Collections;
import java.util.Map;
/* compiled from: MapBuilder.java */
/* renamed from: com.google.firebase.inappmessaging.display.i.a.c */
/* loaded from: classes2.dex */
public final class C6032c<K, V> {

    /* renamed from: a */
    private final Map<K, V> f14736a;

    private C6032c(int i) {
        this.f14736a = C6030a.m22953b(i);
    }

    /* renamed from: b */
    public static <K, V> C6032c<K, V> m22949b(int i) {
        return new C6032c<>(i);
    }

    /* renamed from: a */
    public Map<K, V> m22950a() {
        if (this.f14736a.size() != 0) {
            return Collections.unmodifiableMap(this.f14736a);
        }
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public C6032c<K, V> m22948c(K k, V v) {
        this.f14736a.put(k, v);
        return this;
    }
}
