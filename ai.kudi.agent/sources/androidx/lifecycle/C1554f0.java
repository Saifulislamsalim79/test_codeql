package androidx.lifecycle;

import androidx.lifecycle.C1556g0;
import androidx.lifecycle.d0;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p493j0.InterfaceC11863b;
/* compiled from: ViewModelLazy.kt */
/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes2.dex */
public final class C1554f0<VM extends d0> implements InterfaceC11824h<VM> {

    /* renamed from: c */
    private final InterfaceC11863b<VM> f4762c;

    /* renamed from: d */
    private final InterfaceC11756a<C1566i0> f4763d;

    /* renamed from: e */
    private final InterfaceC11756a<C1556g0.InterfaceC1559b> f4764e;

    /* renamed from: f */
    private VM f4765f;

    /* JADX WARN: Multi-variable type inference failed */
    public C1554f0(InterfaceC11863b<VM> interfaceC11863b, InterfaceC11756a<? extends C1566i0> interfaceC11756a, InterfaceC11756a<? extends C1556g0.InterfaceC1559b> interfaceC11756a2) {
        kotlin.e0.d.l.f(interfaceC11863b, "viewModelClass");
        kotlin.e0.d.l.f(interfaceC11756a, "storeProducer");
        kotlin.e0.d.l.f(interfaceC11756a2, "factoryProducer");
        this.f4762c = interfaceC11863b;
        this.f4763d = interfaceC11756a;
        this.f4764e = interfaceC11756a2;
    }

    @Override // kotlin.InterfaceC11824h
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f4765f;
        if (vm == null) {
            VM vm2 = (VM) new C1556g0(this.f4763d.invoke(), this.f4764e.invoke()).m35533a(C11754a.m10364b(this.f4762c));
            this.f4765f = vm2;
            return vm2;
        }
        return vm;
    }
}
