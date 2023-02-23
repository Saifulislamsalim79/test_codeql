package ai.kudi.agent.transactionstatus.summary.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.transactionstatus.summary.model.WithdrawalSummaryModel;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: WithdrawalSummaryAdapter.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/adapter/WithdrawalSummaryAdapter;", "Landroid/widget/ArrayAdapter;", "Lai/kudi/agent/transactionstatus/summary/model/WithdrawalSummaryModel;", "context", "Landroid/content/Context;", "arrayList", "", "(Landroid/content/Context;Ljava/util/List;)V", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WithdrawalSummaryAdapter extends ArrayAdapter<WithdrawalSummaryModel> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawalSummaryAdapter(Context context, List list) {
        super(context, 0, list);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "arrayList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View $r1, ViewGroup viewGroup) {
        TextView $r8;
        Log_OC.getArray(viewGroup, "parent");
        if ($r1 == null) {
            Context $r3 = getContext();
            LayoutInflater $r4 = LayoutInflater.from($r3);
            $r1 = $r4.inflate(C0001R.C0004layout.transfer_summary_content_listing, viewGroup, false);
        }
        Object $r5 = getItem(i);
        if ($r5 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactionstatus.summary.model.WithdrawalSummaryModel");
            throw $r11;
        }
        WithdrawalSummaryModel $r6 = (WithdrawalSummaryModel) $r5;
        TextView $r7 = null;
        if ($r1 == null) {
            $r8 = null;
        } else {
            View $r9 = $r1.findViewById(C0001R.C0003id.title);
            $r8 = (TextView) $r9;
        }
        if ($r8 != null) {
            String $r10 = $r6.getTitle();
            $r8.setText($r10);
        }
        if ($r1 != null) {
            View $r92 = $r1.findViewById(C0001R.C0003id.value);
            $r7 = (TextView) $r92;
        }
        if ($r7 != null) {
            String $r102 = $r6.getValue();
            $r7.setText($r102);
        }
        Log_OC.append($r1);
        return $r1;
    }
}
