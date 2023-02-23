package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p466i.C11648c;
import p425j.p444e.p451f0.p466i.EnumC11649d;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableToList.java */
/* renamed from: j.e.f0.e.b.a0 */
/* loaded from: classes3.dex */
public final class C11352a0<T, U extends Collection<? super T>> extends AbstractC11351a<T, U> {

    /* renamed from: e */
    final Callable<U> f25500e;

    /* compiled from: FlowableToList.java */
    /* renamed from: j.e.f0.e.b.a0$a */
    /* loaded from: classes3.dex */
    static final class C11353a<T, U extends Collection<? super T>> extends C11648c<U> implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: e */
        InterfaceC14457c f25501e;

        /* JADX WARN: Multi-variable type inference failed */
        C11353a(InterfaceC14456b<? super U> interfaceC14456b, U u) {
            super(interfaceC14456b);
            this.f26326d = u;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            m10684i(this.f26326d);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f26326d = null;
            this.f26325c.mo1689b(th);
        }

        @Override // p425j.p444e.p451f0.p466i.C11648c, p577n.p586b.InterfaceC14457c
        public void cancel() {
            super.cancel();
            this.f25501e.cancel();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            Collection collection = (Collection) this.f26326d;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25501e, interfaceC14457c)) {
                this.f25501e = interfaceC14457c;
                this.f26325c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }
    }

    public C11352a0(AbstractC11293f<T> abstractC11293f, Callable<U> callable) {
        super(abstractC11293f);
        this.f25500e = callable;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super U> interfaceC14456b) {
        try {
            U call = this.f25500e.call();
            C11312b.m11113d(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f25499d.m11188K(new C11353a(interfaceC14456b, call));
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11649d.m10682b(th, interfaceC14456b);
        }
    }
}
