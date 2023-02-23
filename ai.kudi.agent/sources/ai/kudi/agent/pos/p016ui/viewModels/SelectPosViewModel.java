package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.data.SelectPosTypeViewData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SelectPosViewModel.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/pos/ui/viewModels/SelectPosViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/ui/data/SelectPosTypeViewData;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "(Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;)V", "goToOrderDetailsFragment", "", "purchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "handleUserChoice", "pos", "Lai/kudi/agent/pos/ui/model/SelectPosType;", "allTerminals", "", "initialData", "Lai/kudi/agent/pos/ui/data/SelectPosTypeViewData$Initial;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.SelectPosViewModel */
/* loaded from: classes.dex */
public final class SelectPosViewModel extends BaseViewModel<SelectPosTypeViewData> {
    private final TerminalRequestNavigator terminalRequestNavigator;

    public SelectPosViewModel(TerminalRequestNavigator terminalRequestNavigator) {
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        this.terminalRequestNavigator = terminalRequestNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void goToOrderDetailsFragment(PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(posPurchaseInfo, "purchaseInfo");
        TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
        $r2.navigateToMakePayment(false, posPurchaseInfo);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleUserChoice(ai.kudi.agent.pos.p016ui.model.SelectPosType r24, java.util.List r25) {
        /*
            r23 = this;
            java.lang.String r7 = "pos"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r7)
            java.lang.String r7 = "allTerminals"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r10 = 10
            r0 = r25
            int r9 = kotlin.p557z.C13722p.m3921o(r0, r10)
            r8.<init>(r9)
            r0 = r25
            java.util.Iterator r11 = r0.iterator()
        L21:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L5d
            java.lang.Object r13 = r11.next()
            r15 = r13
            ai.kudi.agent.pos.ui.model.SelectPosType r15 = (ai.kudi.agent.pos.p016ui.model.SelectPosType) r15
            r14 = r15
            java.lang.String r16 = r14.getName()
            r0 = r24
            java.lang.String r17 = r0.getName()
            r0 = r16
            r1 = r17
            boolean r12 = kotlin.p483e0.p485d.Log_OC.append(r0, r1)
            r18 = 0
            r19 = 0
            r10 = 0
            r20 = 11
            r21 = 0
            r0 = r14
            r1 = r18
            r2 = r19
            r3 = r12
            r4 = r10
            r5 = r20
            r6 = r21
            ai.kudi.agent.pos.ui.model.SelectPosType r14 = ai.kudi.agent.pos.p016ui.model.SelectPosType.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r8.add(r14)
            goto L21
        L5d:
            ai.kudi.agent.pos.ui.data.SelectPosTypeViewData$OnTerminalSelected r22 = new ai.kudi.agent.pos.ui.data.SelectPosTypeViewData$OnTerminalSelected
            r0 = r22
            r1 = r24
            r0.<init>(r1, r8)
            r0 = r23
            r1 = r22
            r0.publish(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.viewModels.SelectPosViewModel.handleUserChoice(ai.kudi.agent.pos.ui.model.SelectPosType, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SelectPosTypeViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SelectPosTypeViewData.Initial initialData() {
        SelectPosTypeViewData.Initial r1 = SelectPosTypeViewData.Initial.INSTANCE;
        return r1;
    }
}
