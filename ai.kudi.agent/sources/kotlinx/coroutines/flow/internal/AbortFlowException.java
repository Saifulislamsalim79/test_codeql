package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: FlowExceptions.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m10421d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "fillInStackTrace", "", "kotlinx-coroutines-core"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: c */
    private final InterfaceC13969e<?> f30266c;

    public AbortFlowException(InterfaceC13969e<?> interfaceC13969e) {
        super("Flow was aborted, no more elements needed");
        this.f30266c = interfaceC13969e;
    }

    /* renamed from: a */
    public final InterfaceC13969e<?> m3613a() {
        return this.f30266c;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C13952q0.m3343c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
