package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.kshock.presentation.viewdata.OtpVerificationViewData;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OtpVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationViewModel$initCountdownTimer$1 */
/* loaded from: classes.dex */
public final class OtpVerificationViewModel$initCountdownTimer$1 extends AbstractC11802m implements InterfaceC11767l<Long, C13666w> {
    final /* synthetic */ OtpVerificationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpVerificationViewModel$initCountdownTimer$1(OtpVerificationViewModel otpVerificationViewModel) {
        super(1);
        this.this$0 = otpVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Long l) {
        Long $r2 = l;
        long $l0 = $r2.longValue();
        invoke($l0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(long j) {
        OtpVerificationViewModel $r1 = this.this$0;
        String $r2 = RandomUtilKt.toMinute_Second(j);
        $r1.otpCountDownTimer = $r2;
        OtpVerificationViewModel $r12 = this.this$0;
        String $r22 = RandomUtilKt.toMinute_Second(j);
        OtpVerificationViewData.Timer $r3 = new OtpVerificationViewData.Timer($r22, false);
        $r12.publish($r3);
    }
}
