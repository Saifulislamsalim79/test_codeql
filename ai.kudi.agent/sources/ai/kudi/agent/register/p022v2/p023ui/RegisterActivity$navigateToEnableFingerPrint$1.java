package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.register.data.CompleteRegistrationData;
import ai.kudi.agent.register.p022v2.p023ui.EmailVerificationFragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RegisterActivity.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/register/data/CompleteRegistrationData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.RegisterActivity$navigateToEnableFingerPrint$1 */
/* loaded from: classes.dex */
final class RegisterActivity$navigateToEnableFingerPrint$1 extends AbstractC11802m implements InterfaceC11767l<CompleteRegistrationData, C13666w> {
    final /* synthetic */ RegisterActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterActivity$navigateToEnableFingerPrint$1(RegisterActivity registerActivity) {
        super(1);
        this.this$0 = registerActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(CompleteRegistrationData completeRegistrationData) {
        CompleteRegistrationData $r2 = completeRegistrationData;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CompleteRegistrationData completeRegistrationData) {
        if (completeRegistrationData == null) {
            return;
        }
        RegisterActivity $r2 = this.this$0;
        EmailVerificationFragment.Companion $r4 = EmailVerificationFragment.Companion;
        EmailVerificationFragment $r3 = $r4.newInstance(completeRegistrationData);
        AppCompatActivityExtKt.startFragment$default($r2, $r3, C0001R.C0003id.container, false, false, false, 28, null);
    }
}
