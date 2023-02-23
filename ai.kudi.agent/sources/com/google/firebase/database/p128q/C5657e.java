package com.google.firebase.database.p128q;

import com.google.firebase.database.p128q.AbstractC5653c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ImmutableSortedSet.java */
/* renamed from: com.google.firebase.database.q.e */
/* loaded from: classes2.dex */
public class C5657e<T> implements Iterable<T> {

    /* renamed from: c */
    private final AbstractC5653c<T, Void> f13904c;

    /* compiled from: ImmutableSortedSet.java */
    /* renamed from: com.google.firebase.database.q.e$a */
    /* loaded from: classes2.dex */
    private static class C5658a<T> implements Iterator<T> {

        /* renamed from: c */
        final Iterator<Map.Entry<T, Void>> f13905c;

        public C5658a(Iterator<Map.Entry<T, Void>> it) {
            this.f13905c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13905c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f13905c.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f13905c.remove();
        }
    }

    public C5657e(List<T> list, Comparator<T> comparator) {
        this.f13904c = AbstractC5653c.C5654a.m24247a(list, Collections.emptyMap(), AbstractC5653c.C5654a.m24244d(), comparator);
    }

    /* renamed from: a0 */
    public Iterator<T> m24240a0() {
        return new C5658a(this.f13904c.mo24209a0());
    }

    /* renamed from: d */
    public T m24239d() {
        return this.f13904c.mo24205h();
    }

    /* renamed from: e */
    public T m24238e() {
        return this.f13904c.mo24204k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5657e) {
            return this.f13904c.equals(((C5657e) obj).f13904c);
        }
        return false;
    }

    /* renamed from: f */
    public T m24237f(T t) {
        return this.f13904c.mo24203l(t);
    }

    /* renamed from: h */
    public C5657e<T> m24236h(T t) {
        return new C5657e<>(this.f13904c.mo24201s(t, null));
    }

    public int hashCode() {
        return this.f13904c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C5658a(this.f13904c.iterator());
    }

    /* renamed from: k */
    public C5657e<T> m24235k(T t) {
        AbstractC5653c<T, Void> mo24200u = this.f13904c.mo24200u(t);
        return mo24200u == this.f13904c ? this : new C5657e<>(mo24200u);
    }

    private C5657e(AbstractC5653c<T, Void> abstractC5653c) {
        this.f13904c = abstractC5653c;
    }
}
