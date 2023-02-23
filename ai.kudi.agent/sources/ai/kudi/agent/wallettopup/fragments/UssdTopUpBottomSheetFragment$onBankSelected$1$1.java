package ai.kudi.agent.wallettopup.fragments;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.KtaBottomSheetLayoutBinding;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.View;
import android.widget.TextView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UssdTopUpBottomSheetFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "bankData", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$BankData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdTopUpBottomSheetFragment$onBankSelected$1$1 extends AbstractC11802m implements InterfaceC11767l<MonnifyDetails.BankData, C13666w> {
    final /* synthetic */ KtaBottomSheetLayoutBinding $this_apply;
    final /* synthetic */ UssdTopUpBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdTopUpBottomSheetFragment$onBankSelected$1$1(UssdTopUpBottomSheetFragment ussdTopUpBottomSheetFragment, KtaBottomSheetLayoutBinding ktaBottomSheetLayoutBinding) {
        super(1);
        this.this$0 = ussdTopUpBottomSheetFragment;
        this.$this_apply = ktaBottomSheetLayoutBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(MonnifyDetails.BankData bankData) {
        MonnifyDetails.BankData $r2 = bankData;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MonnifyDetails.BankData bankData) {
        Log_OC.getArray(bankData, "bankData");
        UssdTopUpBottomSheetFragment $r2 = this.this$0;
        $r2.chosenBankData = bankData;
        KtaBottomSheetLayoutBinding $r3 = this.$this_apply;
        View $r4 = $r3.amtInputField;
        Log_OC.loadImage($r4, "amtInputField");
        View r10 = $r4;
        ViewExtKt.show(r10);
        UssdTopUpBottomSheetFragment $r22 = this.this$0;
        String $r5 = $r22.mapMonnifyDetailsToBankData(bankData);
        KtaBottomSheetLayoutBinding $r32 = this.$this_apply;
        KudiInputField $r6 = $r32.selectBank;
        String $r7 = bankData.getName();
        $r6.setText($r7);
        KtaBottomSheetLayoutBinding $r33 = this.$this_apply;
        $r33.ussdCode.setText($r5);
        KtaBottomSheetLayoutBinding $r34 = this.$this_apply;
        View $r9 = $r34.dialUssd;
        Log_OC.loadImage($r9, "dialUssd");
        View r102 = $r9;
        ViewExtKt.show(r102);
        KtaBottomSheetLayoutBinding $r35 = this.$this_apply;
        TextView $r8 = $r35.copyCode;
        Log_OC.loadImage($r8, "copyCode");
        ViewExtKt.show($r8);
        KtaBottomSheetLayoutBinding $r36 = this.$this_apply;
        TextView $r82 = $r36.ussdCode;
        Log_OC.loadImage($r82, "this.ussdCode");
        ViewExtKt.show($r82);
        UssdTopUpBottomSheetFragment $r23 = this.this$0;
        $r23.logOnBankSelected();
    }
}
