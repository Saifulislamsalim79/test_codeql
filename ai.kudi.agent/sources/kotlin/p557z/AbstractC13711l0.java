package kotlin.p557z;

import java.util.Iterator;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
/* compiled from: Iterators.kt */
/* renamed from: kotlin.z.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13711l0 implements Iterator<Integer>, InterfaceC11791a {
    @Override // java.util.Iterator
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(mo4069b());
    }

    /* renamed from: b */
    public abstract int mo4069b();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
