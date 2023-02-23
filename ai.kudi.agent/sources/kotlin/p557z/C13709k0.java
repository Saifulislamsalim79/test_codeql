package kotlin.p557z;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Iterators.kt */
/* renamed from: kotlin.z.k0 */
/* loaded from: classes3.dex */
public final class C13709k0<T> implements Iterator<C13705i0<? extends T>>, InterfaceC11791a {

    /* renamed from: c */
    private int f30167c;

    /* renamed from: d */
    private final Iterator<T> f30168d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13709k0(Iterator<? extends T> it) {
        l.f(it, "iterator");
        this.f30168d = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final C13705i0<T> next() {
        int i = this.f30167c;
        this.f30167c = i + 1;
        if (i >= 0) {
            return new C13705i0<>(i, this.f30168d.next());
        }
        C13722p.m3923n();
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30168d.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
