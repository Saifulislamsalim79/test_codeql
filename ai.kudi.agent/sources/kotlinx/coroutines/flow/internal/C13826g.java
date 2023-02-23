package kotlinx.coroutines.flow.internal;

import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.g */
/* loaded from: classes3.dex */
public final class C13826g<T> extends AbstractC13824f<T, T> {
    public /* synthetic */ C13826g(InterfaceC13964d interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, int i2, kotlin.e0.d.g gVar) {
        this(interfaceC13964d, (i2 & 2) != 0 ? C11725h.f26446c : interfaceC11719g, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC13778e.SUSPEND : enumC13778e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: j */
    protected AbstractC13820d<T> mo3173j(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return new C13826g(this.f30282f, interfaceC11719g, i, enumC13778e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: k */
    public InterfaceC13964d<T> mo3340k() {
        return (InterfaceC13964d<T>) this.f30282f;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13824f
    /* renamed from: r */
    protected Object mo3593r(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3175a = this.f30282f.mo3175a(interfaceC13969e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }

    public C13826g(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        super(interfaceC13964d, interfaceC11719g, i, enumC13778e);
    }
}
