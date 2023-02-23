package kotlinx.coroutines.p559q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.channels.InterfaceC13795r;
import kotlinx.coroutines.channels.InterfaceC13797t;
import kotlinx.coroutines.flow.internal.AbstractC13820d;
import kotlinx.coroutines.flow.internal.C13848t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* renamed from: kotlinx.coroutines.q2.b */
/* loaded from: classes3.dex */
public final class C13957b<T> extends AbstractC13820d<T> {

    /* renamed from: x */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30450x = AtomicIntegerFieldUpdater.newUpdater(C13957b.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: f */
    private final InterfaceC13797t<T> f30451f;

    /* renamed from: w */
    private final boolean f30452w;

    public /* synthetic */ C13957b(InterfaceC13797t interfaceC13797t, boolean z, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, int i2, g gVar) {
        this(interfaceC13797t, z, (i2 & 4) != 0 ? C11725h.f26446c : interfaceC11719g, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? EnumC13778e.SUSPEND : enumC13778e);
    }

    /* renamed from: o */
    private final void m3338o() {
        if (this.f30452w) {
            if (!(f30450x.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d, kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m10387d2;
        if (this.f30273d == -3) {
            m3338o();
            Object m3294d = C13979h.m3294d(interfaceC13969e, this.f30451f, this.f30452w, interfaceC11714d);
            m10387d2 = C11734d.m10387d();
            return m3294d == m10387d2 ? m3294d : C13666w.f30112a;
        }
        Object mo3175a = super.mo3175a(interfaceC13969e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: d */
    protected String mo3341d() {
        return l.m("channel=", this.f30451f);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: i */
    protected Object mo3174i(InterfaceC13795r<? super T> interfaceC13795r, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m3294d = C13979h.m3294d(new C13848t(interfaceC13795r), this.f30451f, this.f30452w, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3294d == m10387d ? m3294d : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: j */
    protected AbstractC13820d<T> mo3173j(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return new C13957b(this.f30451f, this.f30452w, interfaceC11719g, i, enumC13778e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: k */
    public InterfaceC13964d<T> mo3340k() {
        return new C13957b(this.f30451f, this.f30452w, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: n */
    public InterfaceC13797t<T> mo3339n(InterfaceC13932m0 interfaceC13932m0) {
        m3338o();
        if (this.f30273d == -3) {
            return this.f30451f;
        }
        return super.mo3339n(interfaceC13932m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13957b(InterfaceC13797t<? extends T> interfaceC13797t, boolean z, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        super(interfaceC11719g, i, enumC13778e);
        this.f30451f = interfaceC13797t;
        this.f30452w = z;
        this.consumed = 0;
    }
}
