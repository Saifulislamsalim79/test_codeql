package kotlin.p476c0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13288p;
import kotlin.e0.d.l;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p477j.EnumC11727a;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
/* compiled from: SafeContinuationJvm.kt */
/* renamed from: kotlin.c0.i */
/* loaded from: classes3.dex */
public final class C11726i<T> implements InterfaceC11714d<T>, InterfaceC11739e {
    @Deprecated

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<C11726i<?>, Object> f26447d = AtomicReferenceFieldUpdater.newUpdater(C11726i.class, Object.class, "result");

    /* renamed from: c */
    private final InterfaceC11714d<T> f26448c;
    private volatile Object result;

    /* JADX WARN: Multi-variable type inference failed */
    public C11726i(InterfaceC11714d<? super T> interfaceC11714d, Object obj) {
        l.f(interfaceC11714d, "delegate");
        this.f26448c = interfaceC11714d;
        this.result = obj;
    }

    /* renamed from: c */
    public final Object m10395c() {
        Object m10387d;
        Object m10387d2;
        Object m10387d3;
        Object obj = this.result;
        EnumC11727a enumC11727a = EnumC11727a.UNDECIDED;
        if (obj == enumC11727a) {
            AtomicReferenceFieldUpdater<C11726i<?>, Object> atomicReferenceFieldUpdater = f26447d;
            m10387d2 = C11734d.m10387d();
            if (atomicReferenceFieldUpdater.compareAndSet(this, enumC11727a, m10387d2)) {
                m10387d3 = C11734d.m10387d();
                return m10387d3;
            }
            obj = this.result;
        }
        if (obj == EnumC11727a.RESUMED) {
            m10387d = C11734d.m10387d();
            return m10387d;
        } else if (obj instanceof C13288p.C13290b) {
            throw ((C13288p.C13290b) obj).f29445c;
        } else {
            return obj;
        }
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<T> interfaceC11714d = this.f26448c;
        if (!(interfaceC11714d instanceof InterfaceC11739e)) {
            interfaceC11714d = null;
        }
        return (InterfaceC11739e) interfaceC11714d;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        return this.f26448c.getContext();
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        Object m10387d;
        Object m10387d2;
        while (true) {
            Object obj2 = this.result;
            EnumC11727a enumC11727a = EnumC11727a.UNDECIDED;
            if (obj2 != enumC11727a) {
                m10387d = C11734d.m10387d();
                if (obj2 != m10387d) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<C11726i<?>, Object> atomicReferenceFieldUpdater = f26447d;
                m10387d2 = C11734d.m10387d();
                if (atomicReferenceFieldUpdater.compareAndSet(this, m10387d2, EnumC11727a.RESUMED)) {
                    this.f26448c.resumeWith(obj);
                    return;
                }
            } else if (f26447d.compareAndSet(this, enumC11727a, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f26448c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11726i(InterfaceC11714d<? super T> interfaceC11714d) {
        this(interfaceC11714d, EnumC11727a.UNDECIDED);
        l.f(interfaceC11714d, "delegate");
    }
}
