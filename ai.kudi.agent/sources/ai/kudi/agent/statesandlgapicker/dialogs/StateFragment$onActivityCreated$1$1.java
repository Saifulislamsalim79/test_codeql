package ai.kudi.agent.statesandlgapicker.dialogs;

import ai.kudi.agent.register.data.models.DropDownModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: StateFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/data/models/DropDownModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class StateFragment$onActivityCreated$1$1 extends AbstractC11802m implements InterfaceC11767l<DropDownModel, C13666w> {
    final /* synthetic */ StateFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFragment$onActivityCreated$1$1(StateFragment stateFragment) {
        super(1);
        this.this$0 = stateFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(DropDownModel dropDownModel) {
        DropDownModel $r2 = dropDownModel;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DropDownModel dropDownModel) {
        Log_OC.getArray(dropDownModel, "it");
        StateFragment $r2 = this.this$0;
        InterfaceC11767l $r3 = $r2.getCallback();
        Log_OC.append($r3);
        String $r4 = dropDownModel.getData();
        $r3.invoke($r4);
    }
}
