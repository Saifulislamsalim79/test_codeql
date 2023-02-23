package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.databinding.FragmentFilterTransactionsBinding;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import android.widget.TextView;
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
/* compiled from: FilterTransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment$setupFilter$1$2$1 */
/* loaded from: classes.dex */
public final class FilterTransactionsFragment$setupFilter$1$2$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ FragmentFilterTransactionsBinding $this_apply;
    final /* synthetic */ FilterTransactionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FilterTransactionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "type", "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment$setupFilter$1$2$1$1 */
    /* loaded from: classes.dex */
    public static final class C05951 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ FragmentFilterTransactionsBinding $this_apply;
        final /* synthetic */ FilterTransactionsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05951(FilterTransactionsFragment filterTransactionsFragment, FragmentFilterTransactionsBinding fragmentFilterTransactionsBinding) {
            super(2);
            this.this$0 = filterTransactionsFragment;
            this.$this_apply = fragmentFilterTransactionsBinding;
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
            Log_OC.getArray(str, "type");
            FilterTransactionsFragment $r2 = this.this$0;
            $r2.lastSelectedFilterType = str;
            FragmentFilterTransactionsBinding $r3 = this.$this_apply;
            TextView $r4 = $r3.filterType;
            TextView r5 = $r4;
            r5.setText(str);
            FilterTransactionsFragment $r22 = this.this$0;
            $r22.onSearch();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTransactionsFragment$setupFilter$1$2$1(FilterTransactionsFragment filterTransactionsFragment, FragmentFilterTransactionsBinding fragmentFilterTransactionsBinding) {
        super(1);
        this.this$0 = filterTransactionsFragment;
        this.$this_apply = fragmentFilterTransactionsBinding;
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
        List $r6;
        Log_OC.getArray(c0757a, "$this$$receiver");
        Map $r4 = TransactionsUtilKt.getTransactionMap();
        Set $r5 = $r4.keySet();
        $r6 = C13742z.m3823D0($r5);
        c0757a.m38049e($r6);
        FilterTransactionsFragment $r2 = this.this$0;
        String $r7 = $r2.lastSelectedFilterType;
        c0757a.m38048f($r7);
        FilterTransactionsFragment $r22 = this.this$0;
        FragmentFilterTransactionsBinding $r3 = this.$this_apply;
        C05951 $r8 = new C05951($r22, $r3);
        c0757a.m38046h($r8);
    }
}
