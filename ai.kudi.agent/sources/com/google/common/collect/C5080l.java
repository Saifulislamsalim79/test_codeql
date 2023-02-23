package com.google.common.collect;

import com.google.common.base.C5051n;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Iterators.java */
/* renamed from: com.google.common.collect.l */
/* loaded from: classes2.dex */
public final class C5080l {

    /* compiled from: Iterators.java */
    /* renamed from: com.google.common.collect.l$a */
    /* loaded from: classes2.dex */
    class C5081a extends AbstractC5064a0<T> {

        /* renamed from: c */
        boolean f12727c;

        /* renamed from: d */
        final /* synthetic */ Object f12728d;

        C5081a(Object obj) {
            this.f12728d = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f12727c;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!this.f12727c) {
                this.f12727c = true;
                return this.f12728d;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static <T> boolean m25709a(Collection<T> collection, Iterator<? extends T> it) {
        C5051n.m25780n(collection);
        C5051n.m25780n(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m25708b(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.C5046k.m25800a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C5080l.m25708b(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: c */
    public static <T> AbstractC5064a0<T> m25707c(T t) {
        return new C5081a(t);
    }
}
