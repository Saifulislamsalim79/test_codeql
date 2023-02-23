package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateOutletFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateOutletFragment$applyViewData$1$1$1$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ StateFragment $this_apply;
    final /* synthetic */ CreateOutletFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOutletFragment$applyViewData$1$1$1$1(CreateOutletFragment createOutletFragment, StateFragment stateFragment) {
        super(1);
        this.this$0 = createOutletFragment;
        this.$this_apply = stateFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        CharSequence $r4;
        Log_OC.getArray(str, "it");
        CreateOutletFragment $r2 = this.this$0;
        CreateOutletViewModel $r3 = $r2.getCreateOutletViewModel();
        $r4 = C13277t.m5414M0(str);
        String $r1 = $r4.toString();
        $r3.onItemSelected($r1);
        StateFragment $r5 = this.$this_apply;
        $r5.dismiss();
    }
}
