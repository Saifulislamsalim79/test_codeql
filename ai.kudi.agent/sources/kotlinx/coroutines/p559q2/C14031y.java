package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.flow.internal.AbstractC13819c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedFlow.kt */
/* renamed from: kotlinx.coroutines.q2.y */
/* loaded from: classes3.dex */
public final class C14031y extends AbstractC13819c<C14026w<?>> {

    /* renamed from: a */
    public long f30610a = -1;

    /* renamed from: b */
    public InterfaceC11714d<? super C13666w> f30611b;

    @Override // kotlinx.coroutines.flow.internal.AbstractC13819c
    /* renamed from: c */
    public boolean mo3209a(C14026w<?> c14026w) {
        if (this.f30610a >= 0) {
            return false;
        }
        this.f30610a = c14026w.m3234V();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13819c
    /* renamed from: d */
    public InterfaceC11714d<C13666w>[] mo3208b(C14026w<?> c14026w) {
        if (C13952q0.m3345a()) {
            if (!(this.f30610a >= 0)) {
                throw new AssertionError();
            }
        }
        long j = this.f30610a;
        this.f30610a = -1L;
        this.f30611b = null;
        return c14026w.m3235U(j);
    }
}
