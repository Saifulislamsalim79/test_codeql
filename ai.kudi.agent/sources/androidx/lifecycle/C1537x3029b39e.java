package androidx.lifecycle;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import androidx.lifecycle.AbstractC1565i;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlinx.coroutines.InterfaceC13930m;
/* compiled from: WithLifecycleState.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, m10421d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/LifecycleOwner;", TransactionField.TRANSACTION_CHANNEL, "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime-ktx_release"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes2.dex */
public final class C1537x3029b39e implements InterfaceC1572l {

    /* renamed from: c */
    final /* synthetic */ InterfaceC13930m f4730c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1565i f4731d;

    /* renamed from: e */
    final /* synthetic */ AbstractC1565i.c f4732e;

    /* renamed from: f */
    final /* synthetic */ InterfaceC11756a f4733f;

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        Object m5358a;
        kotlin.e0.d.l.f(oVar, TransactionField.TRANSACTION_CHANNEL);
        kotlin.e0.d.l.f(bVar, "event");
        if (bVar == AbstractC1565i.b.g(this.f4732e)) {
            this.f4731d.mo35504c(this);
            InterfaceC13930m interfaceC13930m = this.f4730c;
            InterfaceC11756a interfaceC11756a = this.f4733f;
            try {
                C13288p.C13289a c13289a = C13288p.f29444c;
                m5358a = interfaceC11756a.invoke();
                C13288p.m5362a(m5358a);
            } catch (Throwable th) {
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                m5358a = C13291q.m5358a(th);
                C13288p.m5362a(m5358a);
            }
            interfaceC13930m.resumeWith(m5358a);
        } else if (bVar == AbstractC1565i.b.ON_DESTROY) {
            this.f4731d.mo35504c(this);
            InterfaceC13930m interfaceC13930m2 = this.f4730c;
            LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
            C13288p.C13289a c13289a3 = C13288p.f29444c;
            Object m5358a2 = C13291q.m5358a(lifecycleDestroyedException);
            C13288p.m5362a(m5358a2);
            interfaceC13930m2.resumeWith(m5358a2);
        }
    }
}
