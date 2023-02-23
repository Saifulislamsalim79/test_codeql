package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* compiled from: Exceptions.kt */
/* renamed from: kotlinx.coroutines.g1 */
/* loaded from: classes3.dex */
public final class C13854g1 {
    /* renamed from: a */
    public static final CancellationException m3573a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
