package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
/* loaded from: classes3.dex */
public class C13591j extends C13595k {

    /* renamed from: e */
    private final InterfaceC13601o f29977e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    /* loaded from: classes3.dex */
    public static class C13593b<K> implements Map.Entry<K, Object> {

        /* renamed from: c */
        private Map.Entry<K, C13591j> f29978c;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f29978c.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C13591j value = this.f29978c.getValue();
            if (value == null) {
                return null;
            }
            return value.m4403e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC13601o) {
                return this.f29978c.getValue().m4398d((InterfaceC13601o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C13593b(Map.Entry<K, C13591j> entry) {
            this.f29978c = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    /* loaded from: classes3.dex */
    static class C13594c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: c */
        private Iterator<Map.Entry<K, Object>> f29979c;

        public C13594c(Iterator<Map.Entry<K, Object>> it) {
            this.f29979c = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f29979c.next();
            return next.getValue() instanceof C13591j ? new C13593b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29979c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f29979c.remove();
        }
    }

    /* renamed from: e */
    public InterfaceC13601o m4403e() {
        return m4399c(this.f29977e);
    }

    public boolean equals(Object obj) {
        return m4403e().equals(obj);
    }

    public int hashCode() {
        return m4403e().hashCode();
    }

    public String toString() {
        return m4403e().toString();
    }
}
