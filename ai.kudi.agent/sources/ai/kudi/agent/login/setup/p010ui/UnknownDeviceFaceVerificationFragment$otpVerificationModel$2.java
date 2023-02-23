package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.register.domain.dto.OtpVerificationModel;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownDeviceFaceVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceFaceVerificationFragment$otpVerificationModel$2 */
/* loaded from: classes.dex */
public final class UnknownDeviceFaceVerificationFragment$otpVerificationModel$2 extends AbstractC11802m implements InterfaceC11756a<OtpVerificationModel> {
    final /* synthetic */ UnknownDeviceFaceVerificationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownDeviceFaceVerificationFragment$otpVerificationModel$2(UnknownDeviceFaceVerificationFragment unknownDeviceFaceVerificationFragment) {
        super(0);
        this.this$0 = unknownDeviceFaceVerificationFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final OtpVerificationModel invoke() {
        UnknownDeviceFaceVerificationFragment $r1 = this.this$0;
        Bundle $r2 = $r1.getArguments();
        OtpVerificationModel otpVerificationModel = $r2 == null ? null : (ai.kudi.agent.register.domain.wiki.OtpVerificationModel) $r2.getParcelable("OTP_MODEL");
        boolean $z0 = otpVerificationModel instanceof ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
        if ($z0) {
            return otpVerificationModel;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ OtpVerificationModel invoke2() {
        ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r1 = invoke();
        return $r1;
    }
}
