package kotlin.p557z;

import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Iterables.kt */
/* renamed from: kotlin.z.j0 */
/* loaded from: classes3.dex */
public final class C13707j0<T> implements Iterable<C13705i0<? extends T>>, InterfaceC11791a {

    /* renamed from: c */
    private final InterfaceC11756a<Iterator<T>> f30166c;

    /* JADX WARN: Multi-variable type inference failed */
    public C13707j0(InterfaceC11756a<? extends Iterator<? extends T>> interfaceC11756a) {
        l.f(interfaceC11756a, "iteratorFactory");
        this.f30166c = interfaceC11756a;
    }

    @Override // java.lang.Iterable
    public Iterator<C13705i0<T>> iterator() {
        return new C13709k0(this.f30166c.invoke());
    }
}
