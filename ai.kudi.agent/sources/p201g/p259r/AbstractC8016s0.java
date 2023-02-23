package p201g.p259r;

import androidx.lifecycle.AbstractC1565i;
import androidx.recyclerview.widget.C1672b;
import androidx.recyclerview.widget.C1697g;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import p201g.p259r.AbstractC8061y;
/* compiled from: PagingDataAdapter.kt */
/* renamed from: g.r.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8016s0<T, VH extends RecyclerView.AbstractC1620e0> extends RecyclerView.AbstractC1623h<VH> {
    private final C7842d<T> differ;
    private final InterfaceC13964d<C7904j> loadStateFlow;
    private final InterfaceC13964d<C13666w> onPagesUpdatedFlow;
    private boolean userSetRestorationPolicy;

    /* compiled from: PagingDataAdapter.kt */
    /* renamed from: g.r.s0$a */
    /* loaded from: classes2.dex */
    public static final class C8017a extends RecyclerView.AbstractC1626j {

        /* renamed from: a */
        final /* synthetic */ AbstractC8016s0<T, VH> f19317a;

        C8017a(AbstractC8016s0<T, VH> abstractC8016s0) {
            this.f19317a = abstractC8016s0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: d */
        public void mo16890d(int i, int i2) {
            AbstractC8016s0._init_$considerAllowingStateRestoration(this.f19317a);
            this.f19317a.unregisterAdapterDataObserver(this);
            super.mo16890d(i, i2);
        }
    }

    /* compiled from: PagingDataAdapter.kt */
    /* renamed from: g.r.s0$b */
    /* loaded from: classes2.dex */
    public static final class C8018b implements InterfaceC11767l<C7904j, C13666w> {

        /* renamed from: c */
        private boolean f19318c = true;

        /* renamed from: d */
        final /* synthetic */ AbstractC8016s0<T, VH> f19319d;

        C8018b(AbstractC8016s0<T, VH> abstractC8016s0) {
            this.f19319d = abstractC8016s0;
        }

        /* renamed from: a */
        public void m16889a(C7904j c7904j) {
            l.f(c7904j, "loadStates");
            if (this.f19318c) {
                this.f19318c = false;
            } else if (c7904j.m17081c().m17216g() instanceof AbstractC8061y.C8064c) {
                AbstractC8016s0._init_$considerAllowingStateRestoration(this.f19319d);
                this.f19319d.removeLoadStateListener(this);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C7904j c7904j) {
            m16889a(c7904j);
            return C13666w.f30112a;
        }
    }

    /* compiled from: PagingDataAdapter.kt */
    /* renamed from: g.r.s0$c */
    /* loaded from: classes2.dex */
    static final class C8019c extends AbstractC11802m implements InterfaceC11767l<C7904j, C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC8082z<?> f19320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8019c(AbstractC8082z<?> abstractC8082z) {
            super(1);
            this.f19320c = abstractC8082z;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C7904j c7904j) {
            invoke2(c7904j);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C7904j c7904j) {
            l.f(c7904j, "loadStates");
            this.f19320c.setLoadState(c7904j.m17083a());
        }
    }

    /* compiled from: PagingDataAdapter.kt */
    /* renamed from: g.r.s0$d */
    /* loaded from: classes2.dex */
    static final class C8020d extends AbstractC11802m implements InterfaceC11767l<C7904j, C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC8082z<?> f19321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8020d(AbstractC8082z<?> abstractC8082z) {
            super(1);
            this.f19321c = abstractC8082z;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C7904j c7904j) {
            invoke2(c7904j);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C7904j c7904j) {
            l.f(c7904j, "loadStates");
            this.f19321c.setLoadState(c7904j.m17082b());
        }
    }

    /* compiled from: PagingDataAdapter.kt */
    /* renamed from: g.r.s0$e */
    /* loaded from: classes2.dex */
    static final class C8021e extends AbstractC11802m implements InterfaceC11767l<C7904j, C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC8082z<?> f19322c;

        /* renamed from: d */
        final /* synthetic */ AbstractC8082z<?> f19323d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8021e(AbstractC8082z<?> abstractC8082z, AbstractC8082z<?> abstractC8082z2) {
            super(1);
            this.f19322c = abstractC8082z;
            this.f19323d = abstractC8082z2;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(C7904j c7904j) {
            invoke2(c7904j);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C7904j c7904j) {
            l.f(c7904j, "loadStates");
            this.f19322c.setLoadState(c7904j.m17082b());
            this.f19323d.setLoadState(c7904j.m17083a());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC8016s0(C1713j.AbstractC1719f<T> abstractC1719f) {
        this(abstractC1719f, null, null, 6, null);
        l.f(abstractC1719f, "diffCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC8016s0(C1713j.AbstractC1719f<T> abstractC1719f, AbstractC13857h0 abstractC13857h0) {
        this(abstractC1719f, abstractC13857h0, null, 4, null);
        l.f(abstractC1719f, "diffCallback");
        l.f(abstractC13857h0, "mainDispatcher");
    }

    public /* synthetic */ AbstractC8016s0(C1713j.AbstractC1719f abstractC1719f, AbstractC13857h0 abstractC13857h0, AbstractC13857h0 abstractC13857h02, int i, g gVar) {
        this(abstractC1719f, (i & 2) != 0 ? C14107x0.m2944c() : abstractC13857h0, (i & 4) != 0 ? C14107x0.m2946a() : abstractC13857h02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, VH extends RecyclerView.AbstractC1620e0> void _init_$considerAllowingStateRestoration(AbstractC8016s0<T, VH> abstractC8016s0) {
        if (abstractC8016s0.getStateRestorationPolicy() != RecyclerView.AbstractC1623h.EnumC1624a.PREVENT || ((AbstractC8016s0) abstractC8016s0).userSetRestorationPolicy) {
            return;
        }
        abstractC8016s0.setStateRestorationPolicy(RecyclerView.AbstractC1623h.EnumC1624a.ALLOW);
    }

    public final void addLoadStateListener(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.differ.m17169f(interfaceC11767l);
    }

    public final void addOnPagesUpdatedListener(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.differ.m17168g(interfaceC11756a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getItem(int i) {
        return this.differ.m17165j(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.differ.m17164k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final long getItemId(int i) {
        return super.getItemId(i);
    }

    public final InterfaceC13964d<C7904j> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final InterfaceC13964d<C13666w> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final T peek(int i) {
        return this.differ.m17161n(i);
    }

    public final void refresh() {
        this.differ.m17160o();
    }

    public final void removeLoadStateListener(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.differ.m17159p(interfaceC11767l);
    }

    public final void removeOnPagesUpdatedListener(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.differ.m17158q(interfaceC11756a);
    }

    public final void retry() {
        this.differ.m17157r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void setStateRestorationPolicy(RecyclerView.AbstractC1623h.EnumC1624a enumC1624a) {
        l.f(enumC1624a, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(enumC1624a);
    }

    public final C8052w<T> snapshot() {
        return this.differ.m17156s();
    }

    public final Object submitData(C8013r0<T> c8013r0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m17155t = this.differ.m17155t(c8013r0, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m17155t == m10387d ? m17155t : C13666w.f30112a;
    }

    public final C1697g withLoadStateFooter(AbstractC8082z<?> abstractC8082z) {
        l.f(abstractC8082z, "footer");
        addLoadStateListener(new C8019c(abstractC8082z));
        return new C1697g(this, abstractC8082z);
    }

    public final C1697g withLoadStateHeader(AbstractC8082z<?> abstractC8082z) {
        l.f(abstractC8082z, "header");
        addLoadStateListener(new C8020d(abstractC8082z));
        return new C1697g(abstractC8082z, this);
    }

    public final C1697g withLoadStateHeaderAndFooter(AbstractC8082z<?> abstractC8082z, AbstractC8082z<?> abstractC8082z2) {
        l.f(abstractC8082z, "header");
        l.f(abstractC8082z2, "footer");
        addLoadStateListener(new C8021e(abstractC8082z, abstractC8082z2));
        return new C1697g(abstractC8082z, this, abstractC8082z2);
    }

    public final void submitData(AbstractC1565i abstractC1565i, C8013r0<T> c8013r0) {
        l.f(abstractC1565i, "lifecycle");
        l.f(c8013r0, "pagingData");
        this.differ.m17154u(abstractC1565i, c8013r0);
    }

    public AbstractC8016s0(C1713j.AbstractC1719f<T> abstractC1719f, AbstractC13857h0 abstractC13857h0, AbstractC13857h0 abstractC13857h02) {
        l.f(abstractC1719f, "diffCallback");
        l.f(abstractC13857h0, "mainDispatcher");
        l.f(abstractC13857h02, "workerDispatcher");
        this.differ = new C7842d<>(abstractC1719f, new C1672b(this), abstractC13857h0, abstractC13857h02);
        super.setStateRestorationPolicy(RecyclerView.AbstractC1623h.EnumC1624a.PREVENT);
        registerAdapterDataObserver(new C8017a(this));
        addLoadStateListener(new C8018b(this));
        this.loadStateFlow = this.differ.m17163l();
        this.onPagesUpdatedFlow = this.differ.m17162m();
    }
}
