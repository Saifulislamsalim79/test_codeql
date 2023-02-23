package androidx.lifecycle;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import androidx.lifecycle.AbstractC1565i;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC13947p1;
/* compiled from: LifecycleController.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m10421d2 = {"Landroidx/lifecycle/LifecycleController;", "", OpsMetricTracker.FINISH, "()V", "Lkotlinx/coroutines/Job;", "parentJob", "handleDestroy", "(Lkotlinx/coroutines/Job;)V", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "lifecycle-runtime-ktx_release"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class LifecycleController {

    /* renamed from: a */
    private final InterfaceC1572l f4698a;

    /* renamed from: b */
    private final AbstractC1565i f4699b;

    /* renamed from: c */
    private final AbstractC1565i.c f4700c;

    /* renamed from: d */
    private final C1549d f4701d;

    public LifecycleController(AbstractC1565i abstractC1565i, AbstractC1565i.c cVar, C1549d c1549d, final InterfaceC13947p1 interfaceC13947p1) {
        kotlin.e0.d.l.f(abstractC1565i, "lifecycle");
        kotlin.e0.d.l.f(cVar, "minState");
        kotlin.e0.d.l.f(c1549d, "dispatchQueue");
        kotlin.e0.d.l.f(interfaceC13947p1, "parentJob");
        this.f4699b = abstractC1565i;
        this.f4700c = cVar;
        this.f4701d = c1549d;
        this.f4698a = new InterfaceC1572l() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.InterfaceC1572l
            /* renamed from: m */
            public final void mo34271m(o oVar, AbstractC1565i.b bVar) {
                AbstractC1565i.c cVar2;
                C1549d c1549d2;
                C1549d c1549d3;
                kotlin.e0.d.l.f(oVar, TransactionField.TRANSACTION_CHANNEL);
                kotlin.e0.d.l.f(bVar, "<anonymous parameter 1>");
                AbstractC1565i lifecycle = oVar.getLifecycle();
                kotlin.e0.d.l.e(lifecycle, "source.lifecycle");
                if (lifecycle.mo35505b() == AbstractC1565i.c.c) {
                    LifecycleController lifecycleController = LifecycleController.this;
                    InterfaceC13947p1.C13948a.m3353a(interfaceC13947p1, null, 1, null);
                    lifecycleController.m35581c();
                    return;
                }
                AbstractC1565i lifecycle2 = oVar.getLifecycle();
                kotlin.e0.d.l.e(lifecycle2, "source.lifecycle");
                AbstractC1565i.c mo35505b = lifecycle2.mo35505b();
                cVar2 = LifecycleController.this.f4700c;
                if (mo35505b.compareTo(cVar2) < 0) {
                    c1549d3 = LifecycleController.this.f4701d;
                    c1549d3.m35540g();
                    return;
                }
                c1549d2 = LifecycleController.this.f4701d;
                c1549d2.m35539h();
            }
        };
        if (this.f4699b.mo35505b() == AbstractC1565i.c.c) {
            InterfaceC13947p1.C13948a.m3353a(interfaceC13947p1, null, 1, null);
            m35581c();
            return;
        }
        this.f4699b.mo35506a(this.f4698a);
    }

    /* renamed from: c */
    public final void m35581c() {
        this.f4699b.mo35504c(this.f4698a);
        this.f4701d.m35541f();
    }
}
