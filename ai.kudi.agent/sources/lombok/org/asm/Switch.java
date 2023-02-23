package lombok.org.asm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* loaded from: classes.dex */
public final class Switch extends a.a.a.x<a.a.a.t> {
    public static final AtomicIntegerFieldUpdater ONCE_TERMINATED;

    /* renamed from: b */
    private volatile int f31310b;

    /* renamed from: c */
    public final InterfaceC11767l<Throwable, C13666w> f31311c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicIntegerFieldUpdater $r0 = AtomicIntegerFieldUpdater.newUpdater(a.a.a.l.class, "z");
        ONCE_TERMINATED = $r0;
    }

    public Switch(Label label, InterfaceC11767l interfaceC11767l) {
        super(label);
        this.f31311c = interfaceC11767l;
        this.f31310b = 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public void m2354a(Throwable th) {
        AtomicIntegerFieldUpdater $r2 = ONCE_TERMINATED;
        boolean $z0 = $r2.compareAndSet(this, 0, 1);
        if ($z0) {
            InterfaceC11767l $r3 = this.f31311c;
            $r3.invoke(th);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        Throwable $r2 = (Throwable) obj;
        m2354a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
