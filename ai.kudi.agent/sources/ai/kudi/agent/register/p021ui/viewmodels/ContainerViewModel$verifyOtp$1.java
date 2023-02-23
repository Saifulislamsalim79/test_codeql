package ai.kudi.agent.register.p021ui.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.login.domain.dto.ResetPinResponse;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p021ui.viewmodels.data.ContainerViewData;
import ai.kudi.agent.register.util.USERTYPES;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContainerViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.viewmodels.ContainerViewModel$verifyOtp$1 */
/* loaded from: classes.dex */
public final class ContainerViewModel$verifyOtp$1 extends AbstractC11802m implements InterfaceC11767l<ResetPinResponse, C13666w> {
    final /* synthetic */ String $bvn;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $registrationId;
    final /* synthetic */ ContainerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerViewModel$verifyOtp$1(ContainerViewModel containerViewModel, String str, String str2, String str3) {
        super(1);
        this.this$0 = containerViewModel;
        this.$phoneNumber = str;
        this.$registrationId = str2;
        this.$bvn = str3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(ResetPinResponse resetPinResponse) {
        ai.kudi.agent.login.domain.wiki.ResetPinResponse $r2 = (ai.kudi.agent.login.domain.wiki.ResetPinResponse) resetPinResponse;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.login.domain.wiki.ResetPinResponse resetPinResponse) {
        Log_OC.getArray(resetPinResponse, "it");
        Analytics $r4 = this.this$0.analytics;
        String $r2 = this.$phoneNumber;
        USERTYPES $r5 = USERTYPES.isMethod;
        String $r6 = $r5.name();
        OnboardingAnalytics.DefaultImpls.verifyPhoneNumber$default($r4, $r2, true, $r6, null, 8, null);
        ContainerViewModel $r3 = this.this$0;
        ContainerViewData $r7 = ContainerViewModel.access$getState($r3);
        $r3.publish(ContainerViewData.copy$default($r7, false, "Otp Validated!", false, null, null, null, false, false, 252, null));
        RegisterNavigator $r8 = this.this$0.navigator;
        String $r62 = this.$registrationId;
        String $r22 = this.$phoneNumber;
        String $r11 = this.$bvn;
        PersonalInfo $r10 = new PersonalInfo(null, null, $r22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, $r11, null, null, null, null, null, null, null, null, false, null, -268435461, 127, null);
        RegistrationInfo $r9 = new RegistrationInfo($r62, $r10, null, false, null, 28, null);
        $r8.toProfilePictureUploadView($r9);
    }
}
