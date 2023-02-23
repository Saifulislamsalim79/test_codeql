package kotlinx.coroutines;
/* compiled from: EventLoop.kt */
/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes3.dex */
public final class C13856h extends AbstractC13760c1 {

    /* renamed from: y */
    private final Thread f30331y;

    public C13856h(Thread thread) {
        this.f30331y = thread;
    }

    @Override // kotlinx.coroutines.AbstractC13807d1
    /* renamed from: c1 */
    protected Thread mo3192c1() {
        return this.f30331y;
    }
}
