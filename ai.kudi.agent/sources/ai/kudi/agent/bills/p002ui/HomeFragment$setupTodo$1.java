package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.TodoConstantsKt;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: HomeFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "todo", "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment$setupTodo$1 */
/* loaded from: classes.dex */
final class HomeFragment$setupTodo$1 extends AbstractC11802m implements InterfaceC11771p<String, Boolean, C13666w> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$setupTodo$1(HomeFragment homeFragment) {
        super(2);
        this.this$0 = homeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Boolean bool) {
        String $r3 = str;
        Boolean $r4 = bool;
        boolean $z0 = $r4.booleanValue();
        invoke($r3, $z0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, boolean z) {
        Intent $r2;
        Log_OC.getArray(str, "todo");
        boolean $z0 = Log_OC.append(str, TodoConstantsKt.FUND_WALLET_TODO);
        if ($z0) {
            $r2 = r5;
            Fragment $r3 = this.this$0;
            Fragment r6 = $r3;
            Context $r4 = r6.requireContext();
            Intent r5 = new Intent($r4, WalletTopUpActivity.class);
            $r2.putExtra(WalletTopUpActivity.EXTRA_MODE, WalletTopUpActivity.MODE_WALLET_TOPUP);
        } else {
            boolean $z02 = Log_OC.append(str, TodoConstantsKt.CASH_INSURANCE_TODO);
            if ($z02) {
                $r2 = r5;
                Fragment $r32 = this.this$0;
                Fragment r62 = $r32;
                Context $r42 = r62.requireContext();
                Intent r52 = new Intent($r42, SettingsActivity.class);
                $r2.putExtra("PARAM_SETTINGS", TodoConstantsKt.CASH_INSURANCE_TODO);
            } else {
                $r2 = r5;
                Fragment $r33 = this.this$0;
                Fragment r63 = $r33;
                Context $r43 = r63.requireContext();
                Intent r53 = new Intent($r43, PostRegistrationActivity.class);
                $r2.putExtra(TodoConstantsKt.TODO_SELECTED, str);
            }
        }
        Fragment $r34 = this.this$0;
        Fragment r64 = $r34;
        r64.startActivity($r2);
    }
}
