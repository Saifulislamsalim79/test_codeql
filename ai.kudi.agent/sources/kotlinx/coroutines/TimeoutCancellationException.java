package kotlinx.coroutines;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: Timeout.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", MetricTracker.Object.MESSAGE, "", "(Ljava/lang/String;)V", "coroutine", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "createCopy", "kotlinx-coroutines-core"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException implements InterfaceC13814f0<TimeoutCancellationException> {

    /* renamed from: c */
    public final InterfaceC13947p1 f30183c;

    public TimeoutCancellationException(String str, InterfaceC13947p1 interfaceC13947p1) {
        super(str);
        this.f30183c = interfaceC13947p1;
    }

    @Override // kotlinx.coroutines.InterfaceC13814f0
    /* renamed from: b */
    public TimeoutCancellationException mo3616a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f30183c);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
