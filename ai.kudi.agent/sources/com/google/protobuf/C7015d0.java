package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* renamed from: com.google.protobuf.d0 */
/* loaded from: classes2.dex */
public class C7015d0 extends C7023e0 {

    /* renamed from: e */
    private final InterfaceC7100r0 f16778e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* renamed from: com.google.protobuf.d0$b */
    /* loaded from: classes2.dex */
    public static class C7017b<K> implements Map.Entry<K, Object> {

        /* renamed from: c */
        private Map.Entry<K, C7015d0> f16779c;

        /* renamed from: a */
        public C7015d0 m20214a() {
            return this.f16779c.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16779c.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C7015d0 value = this.f16779c.getValue();
            if (value == null) {
                return null;
            }
            return value.m20215f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC7100r0) {
                return this.f16779c.getValue().m20164d((InterfaceC7100r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C7017b(Map.Entry<K, C7015d0> entry) {
            this.f16779c = entry;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* renamed from: com.google.protobuf.d0$c */
    /* loaded from: classes2.dex */
    public static class C7018c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: c */
        private Iterator<Map.Entry<K, Object>> f16780c;

        public C7018c(Iterator<Map.Entry<K, Object>> it) {
            this.f16780c = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f16780c.next();
            return next.getValue() instanceof C7015d0 ? new C7017b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16780c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f16780c.remove();
        }
    }

    @Override // com.google.protobuf.C7023e0
    public boolean equals(Object obj) {
        return m20215f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC7100r0 m20215f() {
        return m20165c(this.f16778e);
    }

    @Override // com.google.protobuf.C7023e0
    public int hashCode() {
        return m20215f().hashCode();
    }

    public String toString() {
        return m20215f().toString();
    }
}
