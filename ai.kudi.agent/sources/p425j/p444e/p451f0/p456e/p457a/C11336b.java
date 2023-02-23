package p425j.p444e.p451f0.p456e.p457a;

import io.reactivex.exceptions.C11118a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: CompletableDefer.java */
/* renamed from: j.e.f0.e.a.b */
/* loaded from: classes3.dex */
public final class C11336b extends AbstractC11271b {

    /* renamed from: c */
    final Callable<? extends InterfaceC11284d> f25465c;

    public C11336b(Callable<? extends InterfaceC11284d> callable) {
        this.f25465c = callable;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        try {
            InterfaceC11284d call = this.f25465c.call();
            C11312b.m11113d(call, "The completableSupplier returned a null CompletableSource");
            call.mo11202b(interfaceC11278c);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11297d.m11143g(th, interfaceC11278c);
        }
    }
}
