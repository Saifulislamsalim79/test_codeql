package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel;
import ai.kudi.agent.settings.insurance.p026ui.adapter.InsuranceDeactivationReasonsAdapter;
import ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: InsuranceDeactivationReasonsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/settings/insurance/ui/adapter/InsuranceDeactivationReasonsAdapter;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.InsuranceDeactivationReasonsFragment$reasonsAdapter$2 */
/* loaded from: classes.dex */
final class InsuranceDeactivationReasonsFragment$reasonsAdapter$2 extends AbstractC11802m implements InterfaceC11756a<InsuranceDeactivationReasonsAdapter> {
    final /* synthetic */ InsuranceDeactivationReasonsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InsuranceDeactivationReasonsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/settings/insurance/data/InsuranceDeactivationReasonUiModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.insurance.ui.InsuranceDeactivationReasonsFragment$reasonsAdapter$2$1 */
    /* loaded from: classes.dex */
    public static final class C05241 extends AbstractC11802m implements InterfaceC11767l<InsuranceDeactivationReasonUiModel, C13666w> {
        final /* synthetic */ InsuranceDeactivationReasonsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05241(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment) {
            super(1);
            this.this$0 = insuranceDeactivationReasonsFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(InsuranceDeactivationReasonUiModel insuranceDeactivationReasonUiModel) {
            InsuranceDeactivationReasonUiModel $r2 = insuranceDeactivationReasonUiModel;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InsuranceDeactivationReasonUiModel insuranceDeactivationReasonUiModel) {
            Log_OC.getArray(insuranceDeactivationReasonUiModel, "it");
            InsuranceDeactivationReasonsFragment $r2 = this.this$0;
            InsuranceDeactivationReasonViewModel $r3 = $r2.getViewModel();
            String $r4 = insuranceDeactivationReasonUiModel.getReasonText();
            $r3.onReasonSelectedAction($r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsuranceDeactivationReasonsFragment$reasonsAdapter$2(InsuranceDeactivationReasonsFragment insuranceDeactivationReasonsFragment) {
        super(0);
        this.this$0 = insuranceDeactivationReasonsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final InsuranceDeactivationReasonsAdapter invoke() {
        InsuranceDeactivationReasonsFragment $r3 = this.this$0;
        C05241 $r2 = new C05241($r3);
        InsuranceDeactivationReasonsAdapter $r1 = new InsuranceDeactivationReasonsAdapter($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ InsuranceDeactivationReasonsAdapter invoke() {
        InsuranceDeactivationReasonsAdapter $r1 = invoke();
        return $r1;
    }
}
