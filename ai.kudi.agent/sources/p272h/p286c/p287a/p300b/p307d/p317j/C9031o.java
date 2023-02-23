package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.List;
import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.o */
/* loaded from: classes2.dex */
final class C9031o extends C9001m implements ListIterator {

    /* renamed from: f */
    final /* synthetic */ C9046p f21334f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9031o(C9046p c9046p) {
        super(c9046p);
        this.f21334f = c9046p;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f21334f.isEmpty();
        m15656a();
        ((ListIterator) this.f21277c).add(obj);
        AbstractC9061q.m15573i(this.f21334f.f21429x);
        if (isEmpty) {
            this.f21334f.m15623d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m15656a();
        return ((ListIterator) this.f21277c).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m15656a();
        return ((ListIterator) this.f21277c).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m15656a();
        return ((ListIterator) this.f21277c).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m15656a();
        return ((ListIterator) this.f21277c).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m15656a();
        ((ListIterator) this.f21277c).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9031o(C9046p c9046p, int i) {
        super(c9046p, ((List) c9046p.f21311d).listIterator(i));
        this.f21334f = c9046p;
    }
}
