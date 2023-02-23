package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.AbstractC13758c;
import kotlinx.coroutines.C14088v1;
import kotlinx.coroutines.JobCancellationException;
/* compiled from: ChannelCoroutine.kt */
/* renamed from: kotlinx.coroutines.channels.g */
/* loaded from: classes3.dex */
public class C13781g<E> extends AbstractC13758c<C13666w> implements InterfaceC13779f<E> {

    /* renamed from: e */
    private final InterfaceC13779f<E> f30248e;

    public C13781g(InterfaceC11719g interfaceC11719g, InterfaceC13779f<E> interfaceC13779f, boolean z, boolean z2) {
        super(interfaceC11719g, z, z2);
        this.f30248e = interfaceC13779f;
    }

    /* renamed from: W0 */
    public final InterfaceC13779f<E> m3690W0() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public final InterfaceC13779f<E> m3689X0() {
        return this.f30248e;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13797t
    /* renamed from: d */
    public Object mo3649d(InterfaceC11714d<? super C13784j<? extends E>> interfaceC11714d) {
        Object mo3649d = this.f30248e.mo3649d(interfaceC11714d);
        C11734d.m10387d();
        return mo3649d;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: f */
    public boolean mo3641f(Throwable th) {
        return this.f30248e.mo3641f(th);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13797t
    public InterfaceC13782h<E> iterator() {
        return this.f30248e.iterator();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: k */
    public Object mo3640k(E e) {
        return this.f30248e.mo3640k(e);
    }

    @Override // kotlinx.coroutines.C14088v1, kotlinx.coroutines.InterfaceC13947p1, kotlinx.coroutines.channels.InterfaceC13797t
    /* renamed from: m */
    public final void mo3015m(CancellationException cancellationException) {
        if (m3021c0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo3056C(), null, this);
        }
        mo2996z(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: o */
    public Object mo3639o(E e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return this.f30248e.mo3639o(e, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.C14088v1
    /* renamed from: z */
    public void mo2996z(Throwable th) {
        CancellationException m3041L0 = C14088v1.m3041L0(this, th, null, 1, null);
        this.f30248e.mo3015m(m3041L0);
        m2998x(m3041L0);
    }
}
