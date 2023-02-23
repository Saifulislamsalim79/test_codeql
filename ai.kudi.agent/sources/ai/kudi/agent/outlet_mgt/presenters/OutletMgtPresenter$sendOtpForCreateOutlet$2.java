package ai.kudi.agent.outlet_mgt.presenters;

import ai.kudi.agent.outlet_mgt.views.OutletMgtView;
import ai.kudi.agent.register.domain.dto.OtpVerificationModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutletMgtPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtPresenter$sendOtpForCreateOutlet$2 extends AbstractC11802m implements InterfaceC11767l<OtpVerificationModel, C13666w> {
    final /* synthetic */ OutletMgtPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutletMgtPresenter$sendOtpForCreateOutlet$2(OutletMgtPresenter outletMgtPresenter) {
        super(1);
        this.this$0 = outletMgtPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39890invoke$lambda0(OutletMgtView outletMgtView) {
        Log_OC.getArray(outletMgtView, "it");
        outletMgtView.toggleOtpLoading(false);
        outletMgtView.showFeedBack("Otp has been resent");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(OtpVerificationModel otpVerificationModel) {
        ai.kudi.agent.register.domain.wiki.OtpVerificationModel $r2 = (ai.kudi.agent.register.domain.wiki.OtpVerificationModel) otpVerificationModel;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(ai.kudi.agent.register.domain.wiki.OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(otpVerificationModel, "it");
        OutletMgtPresenter $r2 = this.this$0;
        Util $r3 = Util.FALSE;
        $r2.ifViewAttached($r3);
    }
}
