package kotlinx.coroutines.channels;

import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: AbstractChannel.kt */
/* renamed from: kotlinx.coroutines.channels.m */
/* loaded from: classes3.dex */
public final class C13790m<E> extends AbstractC13800w implements InterfaceC13798u<E> {

    /* renamed from: f */
    public final Throwable f30253f;

    public C13790m(Throwable th) {
        this.f30253f = th;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: B */
    public void mo3637B() {
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: C */
    public /* bridge */ /* synthetic */ Object mo3636C() {
        m3668H();
        return this;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: D */
    public void mo3635D(C13790m<?> c13790m) {
        if (C13952q0.m3345a()) {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: E */
    public C13914y mo3634E(C13897n.C13900c c13900c) {
        C13914y c13914y = C13939o.f30425a;
        if (c13900c == null) {
            return c13914y;
        }
        c13900c.m3469d();
        throw null;
    }

    /* renamed from: G */
    public C13790m<E> m3669G() {
        return this;
    }

    /* renamed from: H */
    public C13790m<E> m3668H() {
        return this;
    }

    /* renamed from: I */
    public final Throwable m3667I() {
        Throwable th = this.f30253f;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* renamed from: J */
    public final Throwable m3666J() {
        Throwable th = this.f30253f;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13798u
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo3648a() {
        m3669G();
        return this;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13798u
    /* renamed from: e */
    public void mo3647e(E e) {
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13798u
    /* renamed from: f */
    public C13914y mo3646f(E e, C13897n.C13900c c13900c) {
        C13914y c13914y = C13939o.f30425a;
        if (c13900c == null) {
            return c13914y;
        }
        c13900c.m3469d();
        throw null;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    public String toString() {
        return "Closed@" + C14034r0.m3203b(this) + '[' + this.f30253f + ']';
    }
}
