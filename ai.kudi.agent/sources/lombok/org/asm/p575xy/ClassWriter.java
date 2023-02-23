package lombok.org.asm.p575xy;

import a.a.a.q.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p476c0.InterfaceC11719g;
import lombok.org.asm.Handler;
import lombok.org.asm.SpdyStream$SpdyDataSource;
/* renamed from: lombok.org.asm.xy.ClassWriter */
/* loaded from: classes.dex */
public final class ClassWriter extends SpdyStream$SpdyDataSource implements Label, Executor {

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f31493g;

    /* renamed from: c */
    public final String f31494c;

    /* renamed from: e */
    public final int f31495e;

    /* renamed from: p */
    public final C14324p f31496p;

    /* renamed from: q */
    public final ConcurrentLinkedQueue<Runnable> f31497q;

    /* renamed from: s */
    public final int f31498s;

    /* renamed from: t */
    private volatile int f31499t;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicIntegerFieldUpdater $r0 = AtomicIntegerFieldUpdater.newUpdater(e.class, "e");
        f31493g = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(C14324p c14324p, int i, String str, int i2) {
        this.f31496p = c14324p;
        this.f31498s = i;
        this.f31494c = str;
        this.f31495e = i2;
        ConcurrentLinkedQueue $r3 = new ConcurrentLinkedQueue();
        this.f31497q = $r3;
        this.f31499t = 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.p575xy.Label
    /* renamed from: a */
    public void mo2148a() {
        ConcurrentLinkedQueue $r3 = this.f31497q;
        Object $r4 = $r3.poll();
        Runnable $r5 = (Runnable) $r4;
        if ($r5 == null) {
            AtomicIntegerFieldUpdater $r9 = f31493g;
            $r9.decrementAndGet(this);
            ConcurrentLinkedQueue $r32 = this.f31497q;
            Object $r42 = $r32.poll();
            Runnable $r52 = (Runnable) $r42;
            if ($r52 != null) {
                m2166a($r52, true);
                return;
            }
            return;
        }
        C14324p $r6 = this.f31496p;
        $r6.getClass();
        ExecutorC14320i $r1 = $r6.f31552c;
        try {
            $r1.m2153a($r5, (Label) this, true);
        } catch (RejectedExecutionException e) {
            Handler $r7 = Handler.f31286d;
            ExecutorC14320i $r12 = $r6.f31552c;
            AbstractRunnableC14319h $r8 = $r12.m2154a($r5, this);
            $r7.m2348d($r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2166a(Runnable $r2, boolean z) {
        do {
            AtomicIntegerFieldUpdater $r3 = f31493g;
            int $i1 = $r3.incrementAndGet(this);
            int $i0 = this.f31498s;
            if ($i1 <= $i0) {
                C14324p $r4 = this.f31496p;
                $r4.getClass();
                ExecutorC14320i $r5 = $r4.f31552c;
                try {
                    $r5.m2153a($r2, this, z);
                    return;
                } catch (RejectedExecutionException e) {
                    Handler $r6 = Handler.f31286d;
                    ExecutorC14320i $r52 = $r4.f31552c;
                    AbstractRunnableC14319h $r7 = $r52.m2154a($r2, this);
                    $r6.m2348d($r7);
                    return;
                }
            }
            ConcurrentLinkedQueue $r8 = this.f31497q;
            $r8.add($r2);
            int $i02 = $r3.decrementAndGet(this);
            int $i12 = this.f31498s;
            if ($i02 >= $i12) {
                return;
            }
            ConcurrentLinkedQueue $r82 = this.f31497q;
            Object $r9 = $r82.poll();
            $r2 = (Runnable) $r9;
        } while ($r2 != null);
    }

    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public void mo2139a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m2166a(runnable, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.p575xy.Label
    /* renamed from: b */
    public int mo2147b() {
        int i0 = this.f31495e;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        String $r2 = "Close cannot be invoked on LimitingBlockingDispatcher".toString();
        IllegalStateException $r1 = new IllegalStateException($r2);
        throw $r1;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m2166a(runnable, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractC14272i
    public String toString() {
        String $r1 = this.f31494c;
        if ($r1 != null) {
            return $r1;
        }
        StringBuilder $r2 = new StringBuilder();
        $r2.append(super.toString());
        $r2.append("[dispatcher = ");
        C14324p $r3 = this.f31496p;
        $r2.append($r3);
        $r2.append(']');
        return $r2.toString();
    }
}
