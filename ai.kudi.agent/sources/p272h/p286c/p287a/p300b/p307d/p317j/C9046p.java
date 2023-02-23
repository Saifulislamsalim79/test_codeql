package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.p */
/* loaded from: classes2.dex */
public class C9046p extends C9016n implements List {

    /* renamed from: x */
    final /* synthetic */ AbstractC9061q f21429x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9046p(AbstractC9061q abstractC9061q, Object obj, List list, C9016n c9016n) {
        super(abstractC9061q, obj, list, c9016n);
        this.f21429x = abstractC9061q;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f21311d.isEmpty();
        ((List) this.f21311d).add(i, obj);
        AbstractC9061q.m15573i(this.f21429x);
        if (isEmpty) {
            m15623d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f21311d).addAll(i, collection);
        if (addAll) {
            AbstractC9061q.m15571k(this.f21429x, this.f21311d.size() - size);
            if (size == 0) {
                m15623d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f21311d).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f21311d).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f21311d).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C9031o(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f21311d).remove(i);
        AbstractC9061q.m15572j(this.f21429x);
        m15622e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f21311d).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        AbstractC9061q abstractC9061q = this.f21429x;
        Object obj = this.f21310c;
        List subList = ((List) this.f21311d).subList(i, i2);
        C9016n c9016n = this.f21312e;
        if (c9016n == null) {
            c9016n = this;
        }
        return abstractC9061q.m15568n(obj, subList, c9016n);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C9031o(this, i);
    }
}
