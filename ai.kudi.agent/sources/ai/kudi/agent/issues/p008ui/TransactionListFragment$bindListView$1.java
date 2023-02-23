package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionListFragment.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, m10421d2 = {"<anonymous>", "", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.TransactionListFragment$bindListView$1 */
/* loaded from: classes.dex */
final class TransactionListFragment$bindListView$1 extends AbstractC11802m implements InterfaceC11772q<HashMap<String, String>, View, Integer, C13666w> {
    final /* synthetic */ TransactionListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionListFragment$bindListView$1(TransactionListFragment transactionListFragment) {
        super(3);
        this.this$0 = transactionListFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(HashMap<String, String> hashMap, View view, Integer num) {
        HashMap<String, String> $r4 = hashMap;
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
    public final void invoke(HashMap hashMap, View view, int i) {
        Log_OC.getArray(hashMap, "transaction");
        Log_OC.getArray(view, "$noName_1");
        Object $r3 = hashMap.get("reference");
        String $r4 = (String) $r3;
        Object $r32 = hashMap.get(TransactionField.AMOUNT);
        String str = (String) $r32;
        Object $r33 = hashMap.get(TransactionField.TIME);
        String str2 = (String) $r33;
        Object $r34 = hashMap.get("Ticket Resolved");
        String str3 = (String) $r34;
        Object $r35 = hashMap.get("Ticket Id");
        String str4 = (String) $r35;
        Object $r36 = hashMap.get(TransactionField.PAGE_KEY);
        String $r9 = (String) $r36;
        Object $r37 = hashMap.get(TransactionField.MASKED_PAN);
        String $r10 = (String) $r37;
        boolean $z0 = hashMap.containsKey("Ticket Resolved");
        if ($z0) {
            boolean $z02 = Log_OC.append(str3, "false");
            if ($z02) {
                Fragment $r11 = this.this$0;
                Fragment r21 = $r11;
                FragmentActivity $r12 = r21.getActivity();
                if ($r12 == null) {
                    NullPointerException r20 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
                    throw r20;
                }
                IssueActivity $r13 = (IssueActivity) $r12;
                Log_OC.append(str4);
                HashMap r18 = new HashMap();
                Issue.Ticket r19 = new Issue.Ticket(str4, null, null, null, null, null, null, r18, null, 382, null);
                $r13.toDisputeIssueView(r19);
                return;
            }
        }
        TransactionListFragment $r112 = this.this$0;
        IssueTypeModel $r16 = $r112.getIssueData();
        $r16.setTransactionDate(str2);
        TransactionListFragment $r113 = this.this$0;
        IssueTypeModel $r162 = $r113.getIssueData();
        $r162.setTransactionId($r4);
        TransactionListFragment $r114 = this.this$0;
        IssueTypeModel $r163 = $r114.getIssueData();
        $r163.setTransactionValue(str);
        TransactionListFragment $r115 = this.this$0;
        IssueTypeModel $r164 = $r115.getIssueData();
        $r164.setRrn($r9);
        TransactionListFragment $r116 = this.this$0;
        IssueTypeModel $r165 = $r116.getIssueData();
        $r165.setMaxedPan($r10);
        TransactionListFragment $r117 = this.this$0;
        IssueTypeModel $r166 = $r117.getIssueData();
        String $r42 = $r166.getType();
        boolean $z03 = Log_OC.append($r42, WithdrawalTypes.USSD);
        if (!$z03) {
            TransactionListFragment $r118 = this.this$0;
            IssueTypeModel $r167 = $r118.getIssueData();
            String $r43 = $r167.getLabel();
            IssueLabels $r17 = IssueLabels.CHARGE_BACK;
            String $r5 = $r17.getLabel();
            boolean $z04 = Log_OC.append($r43, $r5);
            if (!$z04) {
                TransactionListFragment $r119 = this.this$0;
                IssueTypeModel $r168 = $r119.getIssueData();
                String $r44 = $r168.getLabel();
                IssueLabels $r172 = IssueLabels.DELAYED_CREDIT;
                String $r52 = $r172.getLabel();
                boolean $z05 = Log_OC.append($r44, $r52);
                if (!$z05) {
                    Fragment $r1110 = this.this$0;
                    Fragment r212 = $r1110;
                    FragmentActivity $r122 = r212.getActivity();
                    if ($r122 == null) {
                        NullPointerException r202 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
                        throw r202;
                    }
                    IssueActivity $r132 = (IssueActivity) $r122;
                    TransactionListFragment $r1111 = this.this$0;
                    IssueTypeModel $r169 = $r1111.getIssueData();
                    $r132.toIssueResolutionFragment($r169);
                    return;
                }
            }
        }
        Fragment $r1112 = this.this$0;
        Fragment r213 = $r1112;
        FragmentActivity $r123 = r213.getActivity();
        if ($r123 == null) {
            NullPointerException r203 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r203;
        }
        IssueActivity $r133 = (IssueActivity) $r123;
        TransactionListFragment $r1113 = this.this$0;
        IssueTypeModel $r1610 = $r1113.getIssueData();
        $r133.toCustomerDetailsFragment($r1610, false);
    }
}
