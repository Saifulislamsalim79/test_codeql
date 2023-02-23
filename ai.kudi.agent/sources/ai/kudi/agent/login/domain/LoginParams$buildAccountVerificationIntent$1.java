package ai.kudi.agent.login.domain;

import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import android.os.Bundle;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginParams.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginParams$buildAccountVerificationIntent$1 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
    final /* synthetic */ OtpVerificationModel $otpVerificationModel;
    final /* synthetic */ String $status;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginParams$buildAccountVerificationIntent$1(OtpVerificationModel otpVerificationModel, String str) {
        super(1);
        this.$otpVerificationModel = otpVerificationModel;
        this.$status = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
        Bundle $r2 = bundle;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bundle bundle) {
        Log_OC.getArray(bundle, "$this$launchActivity");
        AccountVerificationHolderActivity.Companion $r3 = AccountVerificationHolderActivity.Companion;
        String $r2 = $r3.getACCOUNT_HOLDER_EXTRA();
        OtpVerificationModel $r4 = this.$otpVerificationModel;
        bundle.putParcelable($r2, $r4);
        String $r22 = this.$status;
        bundle.putString(AccountVerificationHolderActivity.ACCOUNT_VERIFICATION_TYPE, $r22);
    }
}
