package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter;
import ai.kudi.agent.kshock.presentation.LoanHistoryViewModel;
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
/* compiled from: LoanHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupFilter$2$filterBottomSheet$1 */
/* loaded from: classes.dex */
public final class LoanHistoryFragment$setupFilter$2$filterBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ KudiDateAndTypeFilterView $filterView;
    final /* synthetic */ LoanHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoanHistoryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupFilter$2$filterBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C02931 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ KudiDateAndTypeFilterView $filterView;
        final /* synthetic */ LoanHistoryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02931(KudiDateAndTypeFilterView kudiDateAndTypeFilterView, LoanHistoryFragment loanHistoryFragment) {
            super(2);
            this.$filterView = kudiDateAndTypeFilterView;
            this.this$0 = loanHistoryFragment;
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
            KudiDateAndTypeFilterView $r2 = this.$filterView;
            $r2.setTypeText(str);
            LoanHistoryFragment $r3 = this.this$0;
            LoanHistoryViewModel $r4 = $r3.getViewModel();
            Map $r5 = $r4.getLoanStatusFilterMap();
            Object $r6 = $r5.get(str);
            String $r1 = (String) $r6;
            if ($r1 == null) {
                $r1 = "";
            }
            $r3.filteredStatus = $r1;
            LoanHistoryViewModel $r42 = this.this$0.getViewModel();
            LoanHistoryViewModel.loadLoanHistory$default($r42, this.this$0.filteredStatus, 0, null, null, 14, null);
            LoanHistoryAdapter $r7 = this.this$0.loansAdapter;
            if ($r7 != null) {
                $r7.refresh();
                return;
            }
            Log_OC.LogError("loansAdapter");
            NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
            throw r8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$setupFilter$2$filterBottomSheet$1(LoanHistoryFragment loanHistoryFragment, KudiDateAndTypeFilterView kudiDateAndTypeFilterView) {
        super(1);
        this.this$0 = loanHistoryFragment;
        this.$filterView = kudiDateAndTypeFilterView;
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
        List $r7;
        Log_OC.getArray(c0757a, "$this$$receiver");
        LoanHistoryFragment $r3 = this.this$0;
        LoanHistoryViewModel $r4 = $r3.getViewModel();
        Map $r5 = $r4.getLoanStatusFilterMap();
        Set $r6 = $r5.keySet();
        $r7 = C13742z.m3823D0($r6);
        c0757a.m38049e($r7);
        LoanHistoryFragment $r32 = this.this$0;
        String $r8 = $r32.filteredStatus;
        c0757a.m38048f($r8);
        KudiDateAndTypeFilterView $r2 = this.$filterView;
        LoanHistoryFragment $r33 = this.this$0;
        C02931 $r9 = new C02931($r2, $r33);
        c0757a.m38046h($r9);
    }
}
