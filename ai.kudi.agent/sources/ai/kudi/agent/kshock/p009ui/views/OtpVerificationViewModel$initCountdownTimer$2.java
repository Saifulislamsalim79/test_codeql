package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.viewdata.OtpVerificationViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OtpVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationViewModel$initCountdownTimer$2 */
/* loaded from: classes.dex */
public final class OtpVerificationViewModel$initCountdownTimer$2 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ OtpVerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpVerificationViewModel$initCountdownTimer$2(OtpVerificationViewModel otpVerificationViewModel) {
        super(0);
        this.this$0 = otpVerificationViewModel;
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
        OtpVerificationViewModel $r1 = this.this$0;
        OtpVerificationViewData.Timer $r2 = new OtpVerificationViewData.Timer("", true);
        $r1.publish($r2);
    }
}
