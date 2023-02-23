package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C13854g1;
/* compiled from: Channels.common.kt */
/* renamed from: kotlinx.coroutines.channels.l */
/* loaded from: classes3.dex */
final /* synthetic */ class C13789l {
    /* renamed from: a */
    public static final void m3670a(InterfaceC13797t<?> interfaceC13797t, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = C13854g1.m3573a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC13797t.mo3015m(r0);
    }
}
