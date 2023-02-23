package kotlin.p476c0.p478k.p479a;

import java.io.Serializable;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
/* compiled from: ContinuationImpl.kt */
/* renamed from: kotlin.c0.k.a.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11735a implements InterfaceC11714d<Object>, InterfaceC11739e, Serializable {
    private final InterfaceC11714d<Object> completion;

    public AbstractC11735a(InterfaceC11714d<Object> interfaceC11714d) {
        this.completion = interfaceC11714d;
    }

    public InterfaceC11714d<C13666w> create(InterfaceC11714d<?> interfaceC11714d) {
        l.f(interfaceC11714d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public InterfaceC11739e getCallerFrame() {
        InterfaceC11714d<Object> interfaceC11714d = this.completion;
        if (!(interfaceC11714d instanceof InterfaceC11739e)) {
            interfaceC11714d = null;
        }
        return (InterfaceC11739e) interfaceC11714d;
    }

    public final InterfaceC11714d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.p476c0.p478k.p479a.InterfaceC11739e
    public StackTraceElement getStackTraceElement() {
        return C11740g.m10377d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public final void resumeWith(Object obj) {
        Object m10387d;
        AbstractC11735a abstractC11735a = this;
        while (true) {
            C11741h.m10375b(abstractC11735a);
            InterfaceC11714d<Object> interfaceC11714d = abstractC11735a.completion;
            l.d(interfaceC11714d);
            try {
                obj = abstractC11735a.invokeSuspend(obj);
                m10387d = C11734d.m10387d();
            } catch (Throwable th) {
                C13288p.C13289a c13289a = C13288p.f29444c;
                obj = C13291q.m5358a(th);
                C13288p.m5362a(obj);
            }
            if (obj == m10387d) {
                return;
            }
            C13288p.C13289a c13289a2 = C13288p.f29444c;
            C13288p.m5362a(obj);
            abstractC11735a.releaseIntercepted();
            if (interfaceC11714d instanceof AbstractC11735a) {
                abstractC11735a = (AbstractC11735a) interfaceC11714d;
            } else {
                interfaceC11714d.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
        l.f(interfaceC11714d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
