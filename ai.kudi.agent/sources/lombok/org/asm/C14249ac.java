package lombok.org.asm;

import java.util.concurrent.locks.LockSupport;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.asm.ac */
/* loaded from: classes.dex */
public final class C14249ac<T> extends a.a.a.c<T> {

    /* renamed from: a */
    public final Thread f31323a;

    /* renamed from: b */
    public final AbstractC14271h f31324b;

    public C14249ac(InterfaceC11719g interfaceC11719g, Thread thread, AbstractC14271h abstractC14271h) {
        super(interfaceC11719g, true);
        this.f31323a = thread;
        this.f31324b = abstractC14271h;
    }

    public boolean add() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void append(java.lang.Object obj) {
        Thread $r3 = Thread.currentThread();
        Thread $r1 = this.f31323a;
        boolean $z0 = Log_OC.append($r3, $r1);
        if (!$z0) {
            Thread $r12 = this.f31323a;
            LockSupport.unpark($r12);
        }
    }
}
