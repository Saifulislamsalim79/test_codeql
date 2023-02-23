package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import android.os.Bundle;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LoginActivity.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.LoginActivity$showPendingKycScreen$1 */
/* loaded from: classes.dex */
final class LoginActivity$showPendingKycScreen$1 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
    final /* synthetic */ RegistrationInfo $registrationInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$showPendingKycScreen$1(RegistrationInfo registrationInfo) {
        super(1);
        this.$registrationInfo = registrationInfo;
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
        RegistrationStatus $r4 = RegistrationStatus.PENDING_KYC_VERIFICATION;
        String $r3 = $r4.name();
        RegistrationInfo $r2 = this.$registrationInfo;
        bundle.putParcelable($r3, $r2);
    }
}
