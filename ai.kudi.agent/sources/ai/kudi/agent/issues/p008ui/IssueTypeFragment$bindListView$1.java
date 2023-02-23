package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueTypeFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "issueModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragment$bindListView$1 */
/* loaded from: classes.dex */
final class IssueTypeFragment$bindListView$1 extends AbstractC11802m implements InterfaceC11772q<IssueTypeModel, View, Integer, C13666w> {
    final /* synthetic */ IssueTypeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueTypeFragment$bindListView$1(IssueTypeFragment issueTypeFragment) {
        super(3);
        this.this$0 = issueTypeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(IssueTypeModel issueTypeModel, View view, Integer num) {
        IssueTypeModel $r4 = issueTypeModel;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(IssueTypeModel issueTypeModel, View view, int i) {
        Log_OC.getArray(issueTypeModel, "issueModel");
        Log_OC.getArray(view, "$noName_1");
        IssueTypeFragment $r3 = this.this$0;
        String $r4 = $r3.getTicketId();
        int $i0 = $r4.length();
        boolean $z1 = $i0 == 0;
        if ($z1) {
            IssueTypeFragment $r32 = this.this$0;
            FragmentActivity $r5 = $r32.requireActivity();
            SharedPreferences $r6 = $r5.getSharedPreferences(IssueTypeFragment.TEMP_TICKET_PREFERENCE, 0);
            IssueTypeFragment $r33 = this.this$0;
            String $r7 = $r6.getString(IssueTypeFragment.TEMP_TICKET_ID, "");
            Log_OC.append($r7);
            Log_OC.loadImage($r7, "sharedPreferences.getString(TEMP_TICKET_ID, \"\")!!");
            $r33.setTicketId($r7);
        }
        IssueTypeFragment $r34 = this.this$0;
        int $i02 = $r34.getTicketId().length();
        boolean $z0 = $i02 > 0;
        if ($z0) {
            IssueTypeFragment $r35 = this.this$0;
            boolean $z02 = Log_OC.append($r35.getTicketStatus(), "RESOLVED");
            if (!$z02) {
                IssueTypeFragment $r36 = this.this$0;
                GlobalNavigator $r8 = $r36.getGlobalNavigator();
                IssueTypeFragment $r37 = this.this$0;
                Context $r9 = $r37.requireContext();
                Log_OC.loadImage($r9, "requireContext()");
                IssueTypeFragment $r38 = this.this$0;
                String $r42 = $r38.getTicketId();
                $r8.navigateToInboxActivity($r9, $r42);
                return;
            }
        }
        IssueTypeFragment $r39 = this.this$0;
        String $r72 = $r39.getTransactionRef();
        Log_OC.append($r72);
        issueTypeModel.setTransactionId($r72);
        String $r73 = $r39.getTransactionAmount();
        Log_OC.append($r73);
        issueTypeModel.setAmount($r73);
        String $r74 = issueTypeModel.getTransactionType();
        String $r43 = $r74 != null ? $r74 : "";
        issueTypeModel.setType($r43);
        IssueTypeFragment $r310 = this.this$0;
        Intent $r10 = new Intent($r310.getContext(), IssueActivity.class);
        $r10.putExtra(IssueActivity.ISSUE_MODEL, issueTypeModel);
        IssueTypeFragment $r311 = this.this$0;
        $r311.startActivity($r10);
    }
}
