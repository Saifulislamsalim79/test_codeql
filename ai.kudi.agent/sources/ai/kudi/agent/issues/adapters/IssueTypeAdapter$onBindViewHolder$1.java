package ai.kudi.agent.issues.adapters;

import ai.kudi.agent.issues.adapters.IssueTypeAdapter;
import android.view.View;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IssueTypeAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "v", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueTypeAdapter$onBindViewHolder$1 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ IssueTypeAdapter.ViewHolder $holder;
    final /* synthetic */ IssueTypeAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueTypeAdapter$onBindViewHolder$1(IssueTypeAdapter issueTypeAdapter, IssueTypeAdapter.ViewHolder viewHolder) {
        super(1);
        this.this$0 = issueTypeAdapter;
        this.$holder = viewHolder;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "v");
        IssueTypeAdapter $r2 = this.this$0;
        if ($r2.getOnClickListener() != null) {
            IssueTypeAdapter $r22 = this.this$0;
            InterfaceC11772q $r3 = $r22.getOnClickListener();
            if ($r3 == null) {
                return;
            }
            IssueTypeAdapter $r23 = this.this$0;
            List $r4 = $r23.issueTypeList;
            Log_OC.append($r4);
            IssueTypeAdapter.ViewHolder $r5 = this.$holder;
            IssueTypeAdapter.TransactionViewHolder $r6 = (IssueTypeAdapter.TransactionViewHolder) $r5;
            int $i0 = $r6.getAdapterPosition();
            Object $r7 = $r4.get($i0);
            IssueTypeAdapter.ViewHolder $r52 = this.$holder;
            IssueTypeAdapter.TransactionViewHolder $r62 = (IssueTypeAdapter.TransactionViewHolder) $r52;
            int $i02 = $r62.getAdapterPosition();
            Integer $r8 = Integer.valueOf($i02);
            $r3.invoke($r7, view, $r8);
        }
    }
}
