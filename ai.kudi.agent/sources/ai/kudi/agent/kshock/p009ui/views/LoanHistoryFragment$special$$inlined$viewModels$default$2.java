package ai.kudi.agent.kshock.p009ui.views;

import androidx.lifecycle.C1566i0;
import androidx.lifecycle.Rule;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: FragmentViewModelLazy.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¨\u0006\u0004"}, m10421d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$2"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$special$$inlined$viewModels$default$2 */
/* loaded from: classes.dex */
public final class LoanHistoryFragment$special$$inlined$viewModels$default$2 extends AbstractC11802m implements InterfaceC11756a<C1566i0> {
    final /* synthetic */ InterfaceC11756a $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$special$$inlined$viewModels$default$2(InterfaceC11756a interfaceC11756a) {
        super(0);
        this.$ownerProducer = interfaceC11756a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final C1566i0 invoke() {
        InterfaceC11756a $r1 = this.$ownerProducer;
        Object $r2 = $r1.invoke();
        Rule $r3 = (Rule) $r2;
        C1566i0 $r4 = $r3.getViewModelStore();
        Log_OC.loadImage($r4, "ownerProducer().viewModelStore");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C1566i0 invoke() {
        C1566i0 $r1 = invoke();
        return $r1;
    }
}
