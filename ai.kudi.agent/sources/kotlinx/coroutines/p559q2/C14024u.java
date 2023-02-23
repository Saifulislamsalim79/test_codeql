package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* renamed from: kotlinx.coroutines.q2.u */
/* loaded from: classes3.dex */
public final class C14024u<T> extends AbstractC13954a<T> {

    /* renamed from: c */
    private final InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> f30588c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14024u(InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        this.f30588c = interfaceC11771p;
    }

    @Override // kotlinx.coroutines.p559q2.AbstractC13954a
    /* renamed from: d */
    public Object mo3256d(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object invoke = this.f30588c.invoke(interfaceC13969e, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return invoke == m10387d ? invoke : C13666w.f30112a;
    }
}
