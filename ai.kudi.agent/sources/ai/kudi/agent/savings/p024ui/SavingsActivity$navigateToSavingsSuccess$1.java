package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.p024ui.SavingsPlanFragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: SavingsActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsActivity$navigateToSavingsSuccess$1 */
/* loaded from: classes.dex */
final class SavingsActivity$navigateToSavingsSuccess$1 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ SavingsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsActivity$navigateToSavingsSuccess$1(SavingsActivity savingsActivity) {
        super(0);
        this.this$0 = savingsActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SavingsActivity $r1 = this.this$0;
        AppCompatActivityExtKt.popAllFragmentsInActivity$default($r1, null, 1, null);
        SavingsActivity $r12 = this.this$0;
        SavingsPlanFragment.Companion $r3 = SavingsPlanFragment.Companion;
        SavingsPlanFragment $r2 = $r3.newInstance();
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default($r12, $r2, $i0, false, false, false, 28, null);
    }
}
