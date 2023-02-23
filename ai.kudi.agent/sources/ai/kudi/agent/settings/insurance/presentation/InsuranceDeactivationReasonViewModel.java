package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import p425j.p444e.p471k0.C11680b;
/* compiled from: InsuranceDeactivationReasonViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u000fJ\f\u0010\u0014\u001a\u00020\u0015*\u00020\bH\u0002R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/insurance/presentation/InsuranceDeactivationReasonViewState;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/core/util/ResourceDelegate;)V", "onReasonSubmitted", "Lio/reactivex/subjects/PublishSubject;", "", "getOnReasonSubmitted", "()Lio/reactivex/subjects/PublishSubject;", "toastMessage", "getToastMessage", "initialData", "onReasonSelectedAction", "", "selectedReason", "onSubmitAction", "userInputtedReason", "onViewCreated", "isOtherReason", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonViewModel extends BaseViewModel<InsuranceDeactivationReasonViewState> {
    private final C11680b<String> onReasonSubmitted;
    private final ResourceDelegate resource;
    private final C11680b<String> toastMessage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InsuranceDeactivationReasonViewModel(ResourceDelegate resourceDelegate) {
        Log_OC.getArray(resourceDelegate, "resource");
        this.resource = resourceDelegate;
        C11680b $r2 = C11680b.m10564v0();
        Log_OC.loadImage($r2, "create()");
        this.toastMessage = $r2;
        C11680b $r22 = C11680b.m10564v0();
        Log_OC.loadImage($r22, "create()");
        this.onReasonSubmitted = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isOtherReason(String str) {
        boolean $z0;
        $z0 = C13277t.m5425H(str, "Other reasons", true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnReasonSubmitted() {
        C11680b r1 = this.onReasonSubmitted;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        InsuranceDeactivationReasonViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public InsuranceDeactivationReasonViewState initialData() {
        InsuranceDeactivationReasonViewState $r1 = new InsuranceDeactivationReasonViewState(false, null, false, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReasonSelectedAction(java.lang.String r26) {
        /*
            r25 = this;
            java.lang.String r6 = "selectedReason"
            r0 = r26
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r6)
            r0 = r25
            r1 = r26
            boolean r7 = r0.isOtherReason(r1)
            r0 = r25
            ai.kudi.agent.core.mvvm.ViewData r8 = r0.getState()
            r10 = r8
            ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState r10 = (ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState) r10
            r9 = r10
            java.util.List r11 = r9.getReasons()
            java.util.ArrayList r12 = new java.util.ArrayList
            r14 = 10
            int r13 = kotlin.p557z.C13722p.m3921o(r11, r14)
            r12.<init>(r13)
            java.util.Iterator r15 = r11.iterator()
        L2c:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L61
            java.lang.Object r17 = r15.next()
            r19 = r17
            ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel r19 = (ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel) r19
            r18 = r19
            r0 = r18
            java.lang.String r20 = r0.getReasonText()
            r0 = r26
            r1 = r20
            boolean r16 = kotlin.p483e0.p485d.Log_OC.append(r0, r1)
            r21 = 0
            r14 = 1
            r22 = 0
            r0 = r18
            r1 = r21
            r2 = r16
            r3 = r22
            ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel r18 = ai.kudi.agent.settings.insurance.data.InsuranceDeactivationReasonUiModel.copy$default(r0, r1, r2, r14, r3)
            r0 = r18
            r12.add(r0)
            goto L2c
        L61:
            r0 = r25
            ai.kudi.agent.core.mvvm.ViewData r8 = r0.getState()
            r23 = r8
            ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState r23 = (ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState) r23
            r9 = r23
            r14 = 0
            r24 = 1
            r21 = 0
            r0 = r9
            r1 = r14
            r2 = r12
            r3 = r7
            r4 = r24
            r5 = r21
            ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState r9 = ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewState.copy$default(r0, r1, r2, r3, r4, r5)
            r0 = r25
            r0.publish(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.insurance.presentation.InsuranceDeactivationReasonViewModel.onReasonSelectedAction(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onSubmitAction(String $r1) {
        InsuranceDeactivationReasonUiModel insuranceDeactivationReasonUiModel;
        boolean $z0;
        Log_OC.getArray($r1, "userInputtedReason");
        ViewData $r2 = getState();
        InsuranceDeactivationReasonViewState $r3 = (InsuranceDeactivationReasonViewState) $r2;
        List $r4 = $r3.getReasons();
        Iterator $r5 = $r4.iterator();
        while (true) {
            boolean $z02 = $r5.hasNext();
            if (!$z02) {
                insuranceDeactivationReasonUiModel = null;
                break;
            }
            Object $r6 = $r5.next();
            insuranceDeactivationReasonUiModel = $r6;
            boolean $z03 = ((InsuranceDeactivationReasonUiModel) $r6).isSelected();
            if ($z03) {
                break;
            }
        }
        InsuranceDeactivationReasonUiModel $r8 = insuranceDeactivationReasonUiModel;
        if ($r8 == null) {
            C11680b $r9 = this.toastMessage;
            ResourceDelegate $r10 = this.resource;
            $r9.mo331f($r10.getString(C0001R.string.kindly_select_a_reason));
            return;
        }
        String $r11 = $r8.getReasonText();
        boolean $z04 = isOtherReason($r11);
        if ($z04) {
            $z0 = C13276s.m5440u($r1);
            if ($z0) {
                C11680b $r92 = this.toastMessage;
                ResourceDelegate $r102 = this.resource;
                $r92.mo331f($r102.getString(C0001R.string.please_enter_a_reason));
                return;
            }
        }
        String $r112 = $r8.getReasonText();
        boolean $z05 = isOtherReason($r112);
        if (!$z05) {
            $r1 = $r8.getReasonText();
        }
        C11680b $r93 = this.onReasonSubmitted;
        $r93.mo331f($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated() {
        List $r5;
        ViewData $r1 = getState();
        InsuranceDeactivationReasonViewState $r2 = (InsuranceDeactivationReasonViewState) $r1;
        InsuranceDeactivationReasonUiModel $r4 = new InsuranceDeactivationReasonUiModel("I can’t afford the amount", false, 2, null);
        InsuranceDeactivationReasonUiModel $r42 = new InsuranceDeactivationReasonUiModel("I am not interested in getting insured", false, 2, null);
        InsuranceDeactivationReasonUiModel $r43 = new InsuranceDeactivationReasonUiModel("This account is currently inactive", false, 2, null);
        InsuranceDeactivationReasonUiModel $r44 = new InsuranceDeactivationReasonUiModel("Other reasons", false, 2, null);
        InsuranceDeactivationReasonUiModel[] $r3 = {$r4, $r42, $r43, $r44};
        $r5 = C13726r.m3888h($r3);
        publish(InsuranceDeactivationReasonViewState.copy$default($r2, false, $r5, false, 5, null));
    }
}
