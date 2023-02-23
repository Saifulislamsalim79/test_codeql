package kotlinx.coroutines.p559q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlinx.coroutines.C13935n;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.flow.internal.AbstractC13819c;
import kotlinx.coroutines.flow.internal.C13818b;
import kotlinx.coroutines.internal.C13914y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* renamed from: kotlinx.coroutines.q2.h0 */
/* loaded from: classes3.dex */
public final class C13981h0 extends AbstractC13819c<C13972f0<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f30499a = AtomicReferenceFieldUpdater.newUpdater(C13981h0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.AbstractC13819c
    /* renamed from: c */
    public boolean mo3209a(C13972f0<?> c13972f0) {
        C13914y c13914y;
        if (this._state != null) {
            return false;
        }
        c13914y = C13978g0.f30492a;
        this._state = c13914y;
        return true;
    }

    /* renamed from: d */
    public final Object m3292d(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d m10388c;
        C13914y c13914y;
        Object m10387d;
        Object m10387d2;
        C13914y c13914y2;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n c13935n = new C13935n(m10388c, 1);
        c13935n.m3393B();
        if (!C13952q0.m3345a() || (!(this._state instanceof C13935n))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30499a;
            c13914y = C13978g0.f30492a;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c13914y, c13935n)) {
                if (C13952q0.m3345a()) {
                    Object obj = this._state;
                    c13914y2 = C13978g0.f30493b;
                    if (!(obj == c13914y2)) {
                        throw new AssertionError();
                    }
                }
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                c13935n.resumeWith(c13666w);
            }
            Object m3363y = c13935n.m3363y();
            m10387d = C11734d.m10387d();
            if (m3363y == m10387d) {
                C11741h.m10374c(interfaceC11714d);
            }
            m10387d2 = C11734d.m10387d();
            return m3363y == m10387d2 ? m3363y : C13666w.f30112a;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13819c
    /* renamed from: e */
    public InterfaceC11714d<C13666w>[] mo3208b(C13972f0<?> c13972f0) {
        this._state = null;
        return C13818b.f30271a;
    }

    /* renamed from: f */
    public final void m3290f() {
        C13914y c13914y;
        C13914y c13914y2;
        C13914y c13914y3;
        C13914y c13914y4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            c13914y = C13978g0.f30493b;
            if (obj == c13914y) {
                return;
            }
            c13914y2 = C13978g0.f30492a;
            if (obj == c13914y2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30499a;
                c13914y3 = C13978g0.f30493b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c13914y3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30499a;
                c13914y4 = C13978g0.f30492a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c13914y4)) {
                    C13666w c13666w = C13666w.f30112a;
                    C13288p.C13289a c13289a = C13288p.f29444c;
                    C13288p.m5362a(c13666w);
                    ((C13935n) obj).resumeWith(c13666w);
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m3289g() {
        C13914y c13914y;
        C13914y c13914y2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30499a;
        c13914y = C13978g0.f30492a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c13914y);
        l.d(andSet);
        if (!C13952q0.m3345a() || (!(andSet instanceof C13935n))) {
            c13914y2 = C13978g0.f30493b;
            return andSet == c13914y2;
        }
        throw new AssertionError();
    }
}
