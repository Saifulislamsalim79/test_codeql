package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* renamed from: kotlinx.coroutines.q2.j0 */
/* loaded from: classes3.dex */
public final class C13986j0<T> implements InterfaceC14025v<T> {

    /* renamed from: c */
    private final InterfaceC14025v<T> f30507c;

    /* renamed from: d */
    private final InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> f30508d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13986j0(InterfaceC14025v<? extends T> interfaceC14025v, InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        this.f30507c = interfaceC14025v;
        this.f30508d = interfaceC11771p;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3175a = this.f30507c.mo3175a(new C13983i0(interfaceC13969e, this.f30508d), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }
}
