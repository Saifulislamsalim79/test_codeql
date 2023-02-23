package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueHistoryBinding;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IssueHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment$initBottomSheet$1 */
/* loaded from: classes.dex */
public final class IssueHistoryFragment$initBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ IssueHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IssueHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "position", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment$initBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C02641 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ IssueHistoryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02641(IssueHistoryFragment issueHistoryFragment) {
            super(2);
            this.this$0 = issueHistoryFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            String $r3 = str;
            Integer $r4 = num;
            int $i0 = $r4.intValue();
            invoke($r3, $i0);
            C13666w r5 = C13666w.f30112a;
            return r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void invoke(String str, int i) {
            Log_OC.getArray(str, TransactionField.STATUS);
            IssueHistoryFragment $r2 = this.this$0;
            FragmentIssueHistoryBinding $r3 = $r2.requireBinding();
            KudiDateAndTypeFilterView $r4 = $r3.issueHistoryDateAndTypeFilterView;
            $r4.setTypeText(str);
            Map $r5 = IssueHistoryFragmentKt.getIssueStatusMap();
            Object $r6 = $r5.get(str);
            String $r1 = (String) $r6;
            if ($r1 == null) {
                $r1 = "";
            }
            IssueHistoryFragment $r22 = this.this$0;
            $r22.lastSelectedStatus = $r1;
            IssueHistoryFragment $r23 = this.this$0;
            $r23.fetchFilteredIssueHistory($r23.lastSelectedStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueHistoryFragment$initBottomSheet$1(IssueHistoryFragment issueHistoryFragment) {
        super(1);
        this.this$0 = issueHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C0757a c0757a) {
        C0757a $r2 = c0757a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C0757a c0757a) {
        List $r5;
        Log_OC.getArray(c0757a, "$this$$receiver");
        Map $r3 = IssueHistoryFragmentKt.getIssueStatusMap();
        Set $r4 = $r3.keySet();
        $r5 = C13742z.m3823D0($r4);
        c0757a.m38049e($r5);
        IssueHistoryFragment $r2 = this.this$0;
        String $r6 = $r2.lastSelectedStatus;
        c0757a.m38048f($r6);
        IssueHistoryFragment $r22 = this.this$0;
        C02641 $r7 = new C02641($r22);
        c0757a.m38046h($r7);
    }
}
