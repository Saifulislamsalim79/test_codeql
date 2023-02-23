package p425j.p444e.p451f0.p456e.p458b;

import j.e.i0.a;
import java.util.NoSuchElementException;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.C11648c;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableElementAt.java */
/* renamed from: j.e.f0.e.b.e */
/* loaded from: classes3.dex */
public final class C11379e<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final long f25562e;

    /* renamed from: f */
    final T f25563f;

    /* renamed from: w */
    final boolean f25564w;

    /* compiled from: FlowableElementAt.java */
    /* renamed from: j.e.f0.e.b.e$a */
    /* loaded from: classes3.dex */
    static final class C11380a<T> extends C11648c<T> implements InterfaceC11676j<T> {

        /* renamed from: e */
        final long f25565e;

        /* renamed from: f */
        final T f25566f;

        /* renamed from: w */
        final boolean f25567w;

        /* renamed from: x */
        InterfaceC14457c f25568x;

        /* renamed from: y */
        long f25569y;

        /* renamed from: z */
        boolean f25570z;

        C11380a(InterfaceC14456b<? super T> interfaceC14456b, long j, T t, boolean z) {
            super(interfaceC14456b);
            this.f25565e = j;
            this.f25566f = t;
            this.f25567w = z;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25570z) {
                return;
            }
            this.f25570z = true;
            T t = this.f25566f;
            if (t == null) {
                if (this.f25567w) {
                    this.f26325c.mo1689b(new NoSuchElementException());
                    return;
                } else {
                    this.f26325c.mo1690a();
                    return;
                }
            }
            m10684i(t);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25570z) {
                a.r(th);
                return;
            }
            this.f25570z = true;
            this.f26325c.mo1689b(th);
        }

        @Override // p425j.p444e.p451f0.p466i.C11648c, p577n.p586b.InterfaceC14457c
        public void cancel() {
            super.cancel();
            this.f25568x.cancel();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25570z) {
                return;
            }
            long j = this.f25569y;
            if (j == this.f25565e) {
                this.f25570z = true;
                this.f25568x.cancel();
                m10684i(t);
                return;
            }
            this.f25569y = j + 1;
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25568x, interfaceC14457c)) {
                this.f25568x = interfaceC14457c;
                this.f26325c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }
    }

    public C11379e(AbstractC11293f<T> abstractC11293f, long j, T t, boolean z) {
        super(abstractC11293f);
        this.f25562e = j;
        this.f25563f = t;
        this.f25564w = z;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11380a(interfaceC14456b, this.f25562e, this.f25563f, this.f25564w));
    }
}
