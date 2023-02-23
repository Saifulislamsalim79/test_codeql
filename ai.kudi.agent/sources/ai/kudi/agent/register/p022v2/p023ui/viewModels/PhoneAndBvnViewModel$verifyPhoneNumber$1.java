package ai.kudi.agent.register.p022v2.p023ui.viewModels;

import ai.kudi.agent.login.domain.dto.ResetPinResponse;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.navigators.RegisterNavigator;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PhoneAndBvnViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.viewModels.PhoneAndBvnViewModel$verifyPhoneNumber$1 */
/* loaded from: classes.dex */
public final class PhoneAndBvnViewModel$verifyPhoneNumber$1 extends AbstractC11802m implements InterfaceC11767l<ResetPinResponse, C13666w> {
    final /* synthetic */ User $user;
    final /* synthetic */ PhoneAndBvnViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneAndBvnViewModel$verifyPhoneNumber$1(PhoneAndBvnViewModel phoneAndBvnViewModel, User user) {
        super(1);
        this.this$0 = phoneAndBvnViewModel;
        this.$user = user;
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
        long $l0;
        Log_OC.getArray(resetPinResponse, "it");
        PhoneAndBvnViewModel $r2 = this.this$0;
        PhoneAndBvnViewData $r3 = PhoneAndBvnViewModel.access$getState($r2);
        $r2.publish(PhoneAndBvnViewData.copy$default($r3, false, false, false, false, null, null, 23, null));
        User $r5 = this.$user;
        String $r6 = $r5.getPhoneNumber();
        if ($r6 == null) {
            $r6 = "";
        }
        String $r7 = resetPinResponse.getPinResetId();
        if ($r7 == null) {
            $r7 = "";
        }
        Long $r8 = resetPinResponse.getExpiresInSeconds();
        if ($r8 != null) {
            long $l02 = $r8.longValue();
            if ($l02 == 0) {
                $l0 = 600;
                OtpData $r9 = new OtpData($r6, $l0, $r7, null, 8, null);
                OtpFragmentData $r4 = new OtpFragmentData(null, false, $r9, "Click here", "Lost your phone number?", true, false, null, true, 195, null);
                RegisterNavigator $r10 = this.this$0.navigator;
                User $r52 = this.$user;
                String $r62 = $r52.keywords;
                Log_OC.loadImage($r62, "user.bvn");
                $r10.toEnterOtpView($r4, $r62);
            }
        }
        Long $r82 = resetPinResponse.getExpiresInSeconds();
        $l0 = $r82 == null ? 0L : $r82.longValue();
        OtpData $r92 = new OtpData($r6, $l0, $r7, null, 8, null);
        OtpFragmentData $r42 = new OtpFragmentData(null, false, $r92, "Click here", "Lost your phone number?", true, false, null, true, 195, null);
        RegisterNavigator $r102 = this.this$0.navigator;
        User $r522 = this.$user;
        String $r622 = $r522.keywords;
        Log_OC.loadImage($r622, "user.bvn");
        $r102.toEnterOtpView($r42, $r622);
    }
}
