package ai.kudi.agent.login.p011ui.p012v2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: ForgotPasswordActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroidx/fragment/app/Fragment;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.v2.ForgotPasswordActivity$enterPhoneFragment$2 */
/* loaded from: classes.dex */
final class ForgotPasswordActivity$enterPhoneFragment$2 extends AbstractC11802m implements InterfaceC11756a<Fragment> {
    final /* synthetic */ ForgotPasswordActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordActivity$enterPhoneFragment$2(ForgotPasswordActivity forgotPasswordActivity) {
        super(0);
        this.this$0 = forgotPasswordActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final Fragment invoke() {
        ForgotPasswordActivity $r1 = this.this$0;
        FragmentManager $r2 = $r1.getSupportFragmentManager();
        String $r4 = EnterPhoneNoFragment.class.getCanonicalName();
        Fragment $r5 = $r2.m35938g0($r4);
        if ($r5 == null) {
            EnterPhoneNoFragment $r6 = new EnterPhoneNoFragment();
            return $r6;
        }
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Fragment invoke() {
        Fragment $r1 = invoke();
        return $r1;
    }
}
