package ai.kudi.agent.p036v2.common.view.activities;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1566i0;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ActivityViewModelLazy.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$1"}, k = 3, m10420mv = {1, 5, 1})
/* renamed from: ai.kudi.agent.v2.common.view.activities.MarketplaceLookupActivity$special$$inlined$viewModels$default$2 */
/* loaded from: classes.dex */
public final class MarketplaceLookupActivity$special$$inlined$viewModels$default$2 extends AbstractC11802m implements InterfaceC11756a<C1566i0> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceLookupActivity$special$$inlined$viewModels$default$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final C1566i0 invoke() {
        ComponentActivity $r2 = this.$this_viewModels;
        C1566i0 $r1 = $r2.getViewModelStore();
        Log_OC.loadImage($r1, "viewModelStore");
        return $r1;
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
