package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u */
/* loaded from: classes3.dex */
public class C13620u extends AbstractList<String> implements RandomAccess, InterfaceC13597m {

    /* renamed from: c */
    private final InterfaceC13597m f30026c;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$a */
    /* loaded from: classes3.dex */
    class C13621a implements ListIterator<String> {

        /* renamed from: c */
        ListIterator<String> f30027c;

        /* renamed from: d */
        final /* synthetic */ int f30028d;

        C13621a(int i) {
            this.f30028d = i;
            this.f30027c = C13620u.this.f30026c.listIterator(this.f30028d);
        }

        /* renamed from: a */
        public void m4315a(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
            m4315a(str);
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f30027c.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f30027c.previous();
        }

        /* renamed from: d */
        public void m4312d(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f30027c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f30027c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f30027c.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f30027c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
            m4312d(str);
            throw null;
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$b */
    /* loaded from: classes3.dex */
    class C13622b implements Iterator<String> {

        /* renamed from: c */
        Iterator<String> f30030c;

        C13622b() {
            this.f30030c = C13620u.this.f30026c.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f30030c.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30030c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C13620u(InterfaceC13597m interfaceC13597m) {
        this.f30026c = interfaceC13597m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: M */
    public AbstractC13570d mo4321M(int i) {
        return this.f30026c.mo4321M(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: Y */
    public void mo4320Y(AbstractC13570d abstractC13570d) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i) {
        return this.f30026c.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C13622b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new C13621a(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: p */
    public List<?> mo4317p() {
        return this.f30026c.mo4317p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m
    /* renamed from: q */
    public InterfaceC13597m mo4316q() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30026c.size();
    }
}
