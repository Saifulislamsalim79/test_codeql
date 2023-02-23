package kotlin.p557z;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: AbstractIterator.kt */
/* renamed from: kotlin.z.c */
/* loaded from: classes3.dex */
public abstract class AbstractC13687c<T> implements Iterator<T>, InterfaceC11791a {

    /* renamed from: c */
    private EnumC13672a1 f30146c = EnumC13672a1.NotReady;

    /* renamed from: d */
    private T f30147d;

    /* renamed from: e */
    private final boolean m4156e() {
        this.f30146c = EnumC13672a1.Failed;
        mo4159a();
        return this.f30146c == EnumC13672a1.Ready;
    }

    /* renamed from: a */
    protected abstract void mo4159a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m4158b() {
        this.f30146c = EnumC13672a1.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m4157c(T t) {
        this.f30147d = t;
        this.f30146c = EnumC13672a1.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f30146c != EnumC13672a1.Failed) {
            int i = C13673b.f30123a[this.f30146c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m4156e();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f30146c = EnumC13672a1.NotReady;
            return this.f30147d;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
