package kotlin.p557z;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Collections.kt */
/* renamed from: kotlin.z.a0 */
/* loaded from: classes3.dex */
public final class C13671a0 implements ListIterator, InterfaceC11791a {

    /* renamed from: c */
    public static final C13671a0 f30117c = new C13671a0();

    private C13671a0() {
    }

    /* renamed from: a */
    public Void m4224a() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void m4223b() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        m4224a();
        throw null;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        m4223b();
        throw null;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
