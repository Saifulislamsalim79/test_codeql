package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: CompletionState.kt */
/* renamed from: kotlinx.coroutines.b0 */
/* loaded from: classes3.dex */
public class C13755b0 {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30197b = AtomicIntegerFieldUpdater.newUpdater(C13755b0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f30198a;

    public C13755b0(Throwable th, boolean z) {
        this.f30198a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean m3758a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m3757b() {
        return f30197b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C14034r0.m3204a(this) + '[' + this.f30198a + ']';
    }

    public /* synthetic */ C13755b0(Throwable th, boolean z, int i, kotlin.e0.d.g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
