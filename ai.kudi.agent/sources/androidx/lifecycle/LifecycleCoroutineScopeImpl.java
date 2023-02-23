package androidx.lifecycle;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import androidx.lifecycle.AbstractC1565i;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.C14057t1;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: Lifecycle.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u00118\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m10421d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/LifecycleOwner;", TransactionField.TRANSACTION_CHANNEL, "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "register", "()V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_runtime_ktx_release", "()Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-runtime-ktx_release"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1567j implements InterfaceC1572l {

    /* renamed from: c */
    private final AbstractC1565i f4704c;

    /* renamed from: d */
    private final InterfaceC11719g f4705d;

    /* compiled from: Lifecycle.kt */
    @kotlin.c0.k.a.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: classes2.dex */
    static final class C1531a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        private /* synthetic */ Object f4706c;

        /* renamed from: d */
        int f4707d;

        C1531a(InterfaceC11714d interfaceC11714d) {
            super(2, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            kotlin.e0.d.l.f(interfaceC11714d, "completion");
            C1531a c1531a = new C1531a(interfaceC11714d);
            c1531a.f4706c = obj;
            return c1531a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C1531a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f4707d == 0) {
                C13291q.m5357b(obj);
                InterfaceC13932m0 interfaceC13932m0 = (InterfaceC13932m0) this.f4706c;
                if (LifecycleCoroutineScopeImpl.this.mo35513a().mo35505b().compareTo(AbstractC1565i.c.d) < 0) {
                    C14057t1.m3158d(interfaceC13932m0.mo3397o0(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.mo35513a().mo35506a(LifecycleCoroutineScopeImpl.this);
                }
                return C13666w.f30112a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC1565i abstractC1565i, InterfaceC11719g interfaceC11719g) {
        kotlin.e0.d.l.f(abstractC1565i, "lifecycle");
        kotlin.e0.d.l.f(interfaceC11719g, "coroutineContext");
        this.f4704c = abstractC1565i;
        this.f4705d = interfaceC11719g;
        if (mo35513a().mo35505b() == AbstractC1565i.c.c) {
            C14057t1.m3158d(mo3397o0(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.AbstractC1567j
    /* renamed from: a */
    public AbstractC1565i mo35513a() {
        return this.f4704c;
    }

    /* renamed from: d */
    public final void m35580d() {
        C13864i.m3567b(this, C14107x0.m2944c().mo2938J0(), null, new C1531a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        kotlin.e0.d.l.f(oVar, TransactionField.TRANSACTION_CHANNEL);
        kotlin.e0.d.l.f(bVar, "event");
        if (mo35513a().mo35505b().compareTo(AbstractC1565i.c.c) <= 0) {
            mo35513a().mo35504c(this);
            C14057t1.m3158d(mo3397o0(), null, 1, null);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC13932m0
    /* renamed from: o0 */
    public InterfaceC11719g mo3397o0() {
        return this.f4705d;
    }
}
