package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: ObservableDefer.java */
/* renamed from: j.e.f0.e.e.h */
/* loaded from: classes3.dex */
public final class C11517h<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final Callable<? extends InterfaceC11692s<? extends T>> f25969c;

    public C11517h(Callable<? extends InterfaceC11692s<? extends T>> callable) {
        this.f25969c = callable;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        try {
            InterfaceC11692s<? extends T> call = this.f25969c.call();
            C11312b.m11113d(call, "null ObservableSource supplied");
            call.mo10478e(interfaceC11695u);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11297d.m11139n(th, interfaceC11695u);
        }
    }
}
