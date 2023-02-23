package io.grpc;

import com.google.common.base.C5046k;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: Attributes.java */
/* renamed from: io.grpc.a */
/* loaded from: classes2.dex */
public final class C9477a {

    /* renamed from: b */
    public static final C9477a f22159b = new C9477a(Collections.emptyMap());

    /* renamed from: a */
    private final Map<C9480c<?>, Object> f22160a;

    /* compiled from: Attributes.java */
    /* renamed from: io.grpc.a$b */
    /* loaded from: classes2.dex */
    public static final class C9479b {

        /* renamed from: a */
        private C9477a f22161a;

        /* renamed from: b */
        private Map<C9480c<?>, Object> f22162b;

        /* renamed from: b */
        private Map<C9480c<?>, Object> m14626b(int i) {
            if (this.f22162b == null) {
                this.f22162b = new IdentityHashMap(i);
            }
            return this.f22162b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public C9477a m14627a() {
            if (this.f22162b != null) {
                for (Map.Entry entry : this.f22161a.f22160a.entrySet()) {
                    if (!this.f22162b.containsKey(entry.getKey())) {
                        this.f22162b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f22161a = new C9477a(this.f22162b);
                this.f22162b = null;
            }
            return this.f22161a;
        }

        /* renamed from: c */
        public <T> C9479b m14625c(C9480c<T> c9480c) {
            if (this.f22161a.f22160a.containsKey(c9480c)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f22161a.f22160a);
                identityHashMap.remove(c9480c);
                this.f22161a = new C9477a(identityHashMap);
            }
            Map<C9480c<?>, Object> map = this.f22162b;
            if (map != null) {
                map.remove(c9480c);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public <T> C9479b m14624d(C9480c<T> c9480c, T t) {
            m14626b(1).put(c9480c, t);
            return this;
        }

        private C9479b(C9477a c9477a) {
            this.f22161a = c9477a;
        }
    }

    /* compiled from: Attributes.java */
    /* renamed from: io.grpc.a$c */
    /* loaded from: classes2.dex */
    public static final class C9480c<T> {

        /* renamed from: a */
        private final String f22163a;

        private C9480c(String str) {
            this.f22163a = str;
        }

        /* renamed from: a */
        public static <T> C9480c<T> m14623a(String str) {
            return new C9480c<>(str);
        }

        public String toString() {
            return this.f22163a;
        }
    }

    /* renamed from: c */
    public static C9479b m14629c() {
        return new C9479b();
    }

    /* renamed from: b */
    public <T> T m14630b(C9480c<T> c9480c) {
        return (T) this.f22160a.get(c9480c);
    }

    /* renamed from: d */
    public C9479b m14628d() {
        return new C9479b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5a
            java.lang.Class<io.grpc.a> r2 = io.grpc.C9477a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L5a
        L10:
            io.grpc.a r7 = (io.grpc.C9477a) r7
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f22160a
            int r2 = r2.size()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r3 = r7.f22160a
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r2 = r6.f22160a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r4 = r7.f22160a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L44
            return r1
        L44:
            java.lang.Object r4 = r3.getValue()
            java.util.Map<io.grpc.a$c<?>, java.lang.Object> r5 = r7.f22160a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.common.base.C5046k.m25800a(r4, r3)
            if (r3 != 0) goto L2b
            return r1
        L59:
            return r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.C9477a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry<C9480c<?>, Object> entry : this.f22160a.entrySet()) {
            i += C5046k.m25799b(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public String toString() {
        return this.f22160a.toString();
    }

    private C9477a(Map<C9480c<?>, Object> map) {
        this.f22160a = map;
    }
}
