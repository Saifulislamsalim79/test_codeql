package kotlin.p548k0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.e0.d.l;
/* compiled from: SequencesJVM.kt */
/* renamed from: kotlin.k0.a */
/* loaded from: classes3.dex */
public final class C13219a<T> implements InterfaceC13230h<T> {

    /* renamed from: a */
    private final AtomicReference<InterfaceC13230h<T>> f29370a;

    public C13219a(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "sequence");
        this.f29370a = new AtomicReference<>(interfaceC13230h);
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<T> iterator() {
        InterfaceC13230h<T> andSet = this.f29370a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
