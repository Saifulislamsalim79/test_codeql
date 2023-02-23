package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p466i.C11650e;
import p425j.p444e.p451f0.p466i.EnumC11649d;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableScalarXMap.java */
/* renamed from: j.e.f0.e.b.y */
/* loaded from: classes3.dex */
public final class C11427y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableScalarXMap.java */
    /* renamed from: j.e.f0.e.b.y$a */
    /* loaded from: classes3.dex */
    public static final class C11428a<T, R> extends AbstractC11293f<R> {

        /* renamed from: d */
        final T f25732d;

        /* renamed from: e */
        final InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> f25733e;

        C11428a(T t, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f) {
            this.f25732d = t;
            this.f25733e = interfaceC11291f;
        }

        @Override // p425j.p444e.AbstractC11293f
        /* renamed from: L */
        public void mo10791L(InterfaceC14456b<? super R> interfaceC14456b) {
            try {
                InterfaceC14455a<? extends R> mo10663a = this.f25733e.mo10663a((T) this.f25732d);
                C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                InterfaceC14455a<? extends R> interfaceC14455a = mo10663a;
                if (interfaceC14455a instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC14455a).call();
                        if (call == null) {
                            EnumC11649d.m10683a(interfaceC14456b);
                            return;
                        } else {
                            interfaceC14456b.mo1687g(new C11650e(interfaceC14456b, call));
                            return;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        EnumC11649d.m10682b(th, interfaceC14456b);
                        return;
                    }
                }
                interfaceC14455a.mo1691a(interfaceC14456b);
            } catch (Throwable th2) {
                EnumC11649d.m10682b(th2, interfaceC14456b);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC11293f<U> m11006a(T t, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> interfaceC11291f) {
        return a.k(new C11428a(t, interfaceC11291f));
    }

    /* renamed from: b */
    public static <T, R> boolean m11005b(InterfaceC14455a<T> interfaceC14455a, InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f) {
        if (interfaceC14455a instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) interfaceC14455a).call();
                if (obj == 0) {
                    EnumC11649d.m10683a(interfaceC14456b);
                    return true;
                }
                try {
                    InterfaceC14455a<? extends R> mo10663a = interfaceC11291f.mo10663a(obj);
                    C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                    InterfaceC14455a<? extends R> interfaceC14455a2 = mo10663a;
                    if (interfaceC14455a2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC14455a2).call();
                            if (call == null) {
                                EnumC11649d.m10683a(interfaceC14456b);
                                return true;
                            }
                            interfaceC14456b.mo1687g(new C11650e(interfaceC14456b, call));
                        } catch (Throwable th) {
                            C11118a.m11646b(th);
                            EnumC11649d.m10682b(th, interfaceC14456b);
                            return true;
                        }
                    } else {
                        interfaceC14455a2.mo1691a(interfaceC14456b);
                    }
                    return true;
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    EnumC11649d.m10682b(th2, interfaceC14456b);
                    return true;
                }
            } catch (Throwable th3) {
                C11118a.m11646b(th3);
                EnumC11649d.m10682b(th3, interfaceC14456b);
                return true;
            }
        }
        return false;
    }
}
