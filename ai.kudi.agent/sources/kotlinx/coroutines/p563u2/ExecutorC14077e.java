package kotlinx.coroutines.p563u2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.AbstractC13860h1;
/* compiled from: Dispatcher.kt */
/* renamed from: kotlinx.coroutines.u2.e */
/* loaded from: classes3.dex */
final class ExecutorC14077e extends AbstractC13860h1 implements InterfaceC14082j, Executor {

    /* renamed from: y */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30703y = AtomicIntegerFieldUpdater.newUpdater(ExecutorC14077e.class, "inFlightTasks");

    /* renamed from: d */
    private final C14075c f30704d;

    /* renamed from: e */
    private final int f30705e;

    /* renamed from: f */
    private final String f30706f;

    /* renamed from: w */
    private final int f30707w;

    /* renamed from: x */
    private final ConcurrentLinkedQueue<Runnable> f30708x = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public ExecutorC14077e(C14075c c14075c, int i, String str, int i2) {
        this.f30704d = c14075c;
        this.f30705e = i;
        this.f30706f = str;
        this.f30707w = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3093J0(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.p563u2.ExecutorC14077e.f30703y
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f30705e
            if (r0 > r1) goto L10
            kotlinx.coroutines.u2.c r0 = r2.f30704d
            r0.m3095K0(r3, r2, r4)
            return
        L10:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.f30708x
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.p563u2.ExecutorC14077e.f30703y
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f30705e
            if (r3 < r0) goto L20
            return
        L20:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.f30708x
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p563u2.ExecutorC14077e.m3093J0(java.lang.Runnable, boolean):void");
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: F0 */
    public void mo3094F0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m3093J0(runnable, true);
    }

    @Override // kotlinx.coroutines.p563u2.InterfaceC14082j
    /* renamed from: I */
    public void mo3091I() {
        Runnable poll = this.f30708x.poll();
        if (poll != null) {
            this.f30704d.m3095K0(poll, this, true);
            return;
        }
        f30703y.decrementAndGet(this);
        Runnable poll2 = this.f30708x.poll();
        if (poll2 == null) {
            return;
        }
        m3093J0(poll2, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m3093J0(runnable, false);
    }

    @Override // kotlinx.coroutines.p563u2.InterfaceC14082j
    /* renamed from: f0 */
    public int mo3090f0() {
        return this.f30707w;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m3093J0(runnable, false);
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        String str = this.f30706f;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f30704d + ']';
        }
        return str;
    }
}
