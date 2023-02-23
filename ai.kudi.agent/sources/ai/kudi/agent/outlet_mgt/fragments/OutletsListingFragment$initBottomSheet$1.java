package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.databinding.FragmentOutletsListingBinding;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
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
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutletsListingFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletsListingFragment$initBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ OutletsListingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OutletsListingFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "<anonymous parameter 1>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment$initBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C03391 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ OutletsListingFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03391(OutletsListingFragment outletsListingFragment) {
            super(2);
            this.this$0 = outletsListingFragment;
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
            OutletsListingFragment $r2 = this.this$0;
            InterfaceC8209a $r3 = $r2.requireBinding();
            FragmentOutletsListingBinding $r4 = (FragmentOutletsListingBinding) $r3;
            TextView $r5 = $r4.tvStatusFilter;
            $r5.setText(str);
            OutletsListingFragment $r22 = this.this$0;
            $r22.lastSelectedStatus = str;
            OutletsListingFragment $r23 = this.this$0;
            OutletsListingViewModel $r6 = $r23.getScreenViewModel();
            Map $r7 = $r6.getOutletStatusMap();
            Object $r8 = $r7.get(str);
            String $r1 = (String) $r8;
            if ($r1 == null) {
                IllegalStateException $r9 = new IllegalStateException("".toString());
                throw $r9;
            }
            OutletsListingFragment $r24 = this.this$0;
            OutletsListingViewModel $r62 = $r24.getScreenViewModel();
            $r62.loadNext($r1, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutletsListingFragment$initBottomSheet$1(OutletsListingFragment outletsListingFragment) {
        super(1);
        this.this$0 = outletsListingFragment;
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
        OutletsListingFragment $r2 = this.this$0;
        OutletsListingViewModel $r3 = $r2.getScreenViewModel();
        Map $r4 = $r3.getOutletStatusMap();
        Set $r5 = $r4.keySet();
        $r6 = C13742z.m3823D0($r5);
        c0757a.m38049e($r6);
        OutletsListingFragment $r22 = this.this$0;
        String $r7 = $r22.lastSelectedStatus;
        c0757a.m38048f($r7);
        OutletsListingFragment $r23 = this.this$0;
        C03391 $r8 = new C03391($r23);
        c0757a.m38046h($r8);
    }
}
