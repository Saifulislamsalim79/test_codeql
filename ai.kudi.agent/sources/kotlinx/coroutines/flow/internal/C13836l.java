package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: FlowExceptions.common.kt */
/* renamed from: kotlinx.coroutines.flow.internal.l */
/* loaded from: classes3.dex */
public final class C13836l {
    /* renamed from: a */
    public static final void m3590a(AbortFlowException abortFlowException, InterfaceC13969e<?> interfaceC13969e) {
        if (abortFlowException.m3613a() != interfaceC13969e) {
            throw abortFlowException;
        }
    }
}
