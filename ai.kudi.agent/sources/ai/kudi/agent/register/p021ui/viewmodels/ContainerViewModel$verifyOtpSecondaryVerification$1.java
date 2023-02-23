package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.domain.dto.SecondaryDetailsResponse;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContainerViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/SecondaryDetailsResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel$verifyOtpSecondaryVerification$1 */
/* loaded from: classes.dex */
public final class ContainerViewModel$verifyOtpSecondaryVerification$1 extends AbstractC11802m implements InterfaceC11767l<SecondaryDetailsResponse, C13666w> {
    final /* synthetic */ CompleteRegistrationData $completeRegistrationData;
    final /* synthetic */ ContainerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerViewModel$verifyOtpSecondaryVerification$1(ContainerViewModel containerViewModel, CompleteRegistrationData completeRegistrationData) {
        super(1);
        this.this$0 = containerViewModel;
        this.$completeRegistrationData = completeRegistrationData;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(SecondaryDetailsResponse secondaryDetailsResponse) {
        ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse $r2 = (ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse) secondaryDetailsResponse;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.register.domain.wiki.SecondaryDetailsResponse secondaryDetailsResponse) {
        Log_OC.getArray(secondaryDetailsResponse, "it");
        ContainerViewModel $r2 = this.this$0;
        ContainerViewData $r3 = ContainerViewModel.access$getState($r2);
        $r2.publish(ContainerViewData.copy$default($r3, false, null, false, null, null, null, false, false, 254, null));
        CompleteRegistrationData $r4 = this.$completeRegistrationData;
        if ($r4 == null) {
            return;
        }
        ContainerViewModel $r22 = this.this$0;
        boolean $z0 = $r4.isOnbardingFlow();
        if (!$z0) {
            ContainerViewData $r32 = ContainerViewModel.access$getState($r22);
            $r22.publish(ContainerViewData.copy$default($r32, false, null, false, null, null, null, true, false, 191, null));
            return;
        }
        String $r5 = $r4.getFirstName();
        String $r6 = $r5;
        if ($r5 == null) {
            $r6 = "";
        }
        String $r52 = $r6;
        Double $r7 = $r4.getWalletBalance();
        double $d0 = $r7 == null ? 0.0d : $r7.doubleValue();
        Boolean $r8 = $r4.isKCashEnabled();
        boolean $z02 = $r8 == null ? false : $r8.booleanValue();
        Boolean $r82 = $r4.isC2C();
        boolean $z1 = $r82 == null ? false : $r82.booleanValue();
        boolean $z2 = $r4.isHq();
        boolean $z3 = $r4.isOutlet();
        Boolean $r83 = $r4.isNewUser();
        boolean $z4 = $r83 == null ? false : $r83.booleanValue();
        String $r62 = $r4.getCustomerType();
        RegisterNavigator $r9 = $r22.navigator;
        $r9.navigateToWelcomePage($r52, $d0, $z4, $z02, $z1, $z2, $z3, $r62);
    }
}
