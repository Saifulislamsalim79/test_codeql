package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: CompletionState.kt */
/* renamed from: kotlinx.coroutines.q */
/* loaded from: classes3.dex */
public final class C13951q extends C13755b0 {

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30437c = AtomicIntegerFieldUpdater.newUpdater(C13951q.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13951q(kotlin.p476c0.InterfaceC11714d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13951q.<init>(kotlin.c0.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m3346c() {
        return f30437c.compareAndSet(this, 0, 1);
    }
}
