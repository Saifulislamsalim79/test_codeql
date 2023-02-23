package kotlinx.coroutines.channels;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.C14034r0;
import kotlinx.coroutines.InterfaceC13930m;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: AbstractChannel.kt */
/* renamed from: kotlinx.coroutines.channels.y */
/* loaded from: classes3.dex */
public class C13803y<E> extends AbstractC13800w {

    /* renamed from: f */
    private final E f30256f;

    /* renamed from: w */
    public final InterfaceC13930m<C13666w> f30257w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13803y(E e, InterfaceC13930m<? super C13666w> interfaceC13930m) {
        this.f30256f = e;
        this.f30257w = interfaceC13930m;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: B */
    public void mo3637B() {
        this.f30257w.mo3371p(C13939o.f30425a);
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: C */
    public E mo3636C() {
        return this.f30256f;
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: D */
    public void mo3635D(C13790m<?> c13790m) {
        InterfaceC13930m<C13666w> interfaceC13930m = this.f30257w;
        Throwable m3666J = c13790m.m3666J();
        C13288p.C13289a c13289a = C13288p.f29444c;
        Object m5358a = C13291q.m5358a(m3666J);
        C13288p.m5362a(m5358a);
        interfaceC13930m.resumeWith(m5358a);
    }

    @Override // kotlinx.coroutines.channels.AbstractC13800w
    /* renamed from: E */
    public C13914y mo3634E(C13897n.C13900c c13900c) {
        Object mo3378b = this.f30257w.mo3378b(C13666w.f30112a, c13900c == null ? null : c13900c.f30380a);
        if (mo3378b == null) {
            return null;
        }
        if (C13952q0.m3345a()) {
            if (!(mo3378b == C13939o.f30425a)) {
                throw new AssertionError();
            }
        }
        if (c13900c == null) {
            return C13939o.f30425a;
        }
        c13900c.m3469d();
        throw null;
    }

    @Override // kotlinx.coroutines.internal.C13897n
    public String toString() {
        return C14034r0.m3204a(this) + '@' + C14034r0.m3203b(this) + '(' + mo3636C() + ')';
    }
}
