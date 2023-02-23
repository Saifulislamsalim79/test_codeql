package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.collections.databinding.FragmentAirtimeTopUpBinding;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.product.airtime_data.data.Networks;
import ai.kudi.agent.product.airtime_data.data.Plan;
import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import android.widget.TextView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AirtimeTopUpFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Lai/kudi/dip/library/bottomSheets/models/FilterBottomSheetParams;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment$initBottomSheet$1 */
/* loaded from: classes.dex */
public final class AirtimeTopUpFragment$initBottomSheet$1 extends AbstractC11802m implements InterfaceC11767l<C0757a, C13666w> {
    final /* synthetic */ FragmentAirtimeTopUpBinding $binding;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ String $typeOfData;
    final /* synthetic */ C11810u $validNetwork;
    final /* synthetic */ AirtimeTopUpFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AirtimeTopUpFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment$initBottomSheet$1$1 */
    /* loaded from: classes.dex */
    public static final class C03921 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
        final /* synthetic */ String $typeOfData;
        final /* synthetic */ C11810u $validNetwork;
        final /* synthetic */ AirtimeTopUpFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03921(String str, AirtimeTopUpFragment airtimeTopUpFragment, C11810u c11810u) {
            super(0);
            this.$typeOfData = str;
            this.this$0 = airtimeTopUpFragment;
            this.$validNetwork = c11810u;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            invoke2();
            C13666w r1 = C13666w.f30112a;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String $r1 = this.$typeOfData;
            boolean $z0 = Log_OC.append($r1, AirtimeTopUpFragment.TYPE_OF_DATA_PLAN);
            if ($z0) {
                AirtimeTopUpFragment $r2 = this.this$0;
                Networks $r3 = $r2.lastSelectedNetwork;
                if ($r3 != null) {
                    AirtimeAndDataPresenter $r4 = $r2.getThisPresenter();
                    Networks $r32 = this.this$0.getLastSelectedNetwork();
                    $r4.fetchDataPlan($r32);
                    return;
                }
                $r2.showInvalidNetworkSelection("Select a network first");
                C11810u $r5 = this.$validNetwork;
                $r5.f26497c = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AirtimeTopUpFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", TransactionField.STATUS, "", "position", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment$initBottomSheet$1$2 */
    /* loaded from: classes.dex */
    public static final class C03932 extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        final /* synthetic */ FragmentAirtimeTopUpBinding $binding;
        final /* synthetic */ String $typeOfData;
        final /* synthetic */ AirtimeTopUpFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03932(String str, AirtimeTopUpFragment airtimeTopUpFragment, FragmentAirtimeTopUpBinding fragmentAirtimeTopUpBinding) {
            super(2);
            this.$typeOfData = str;
            this.this$0 = airtimeTopUpFragment;
            this.$binding = fragmentAirtimeTopUpBinding;
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
            String $r2 = this.$typeOfData;
            boolean $z0 = Log_OC.append($r2, AirtimeTopUpFragment.TYPE_OF_DATA_PLAN);
            if ($z0) {
                AirtimeTopUpFragment $r3 = this.this$0;
                List $r4 = $r3.dataPlans;
                Object $r5 = $r4.get(i);
                Plan $r6 = (Plan) $r5;
                $r3.lastSelectedDataPlan = $r6;
                FragmentAirtimeTopUpBinding $r7 = this.$binding;
                $r7.spinnerDataPlan.setText(str);
                this.this$0.lastSelectedDataString = str;
                return;
            }
            AirtimeTopUpFragment $r32 = this.this$0;
            List $r42 = $r32.networks;
            Object $r52 = $r42.get(i);
            Networks $r9 = (Networks) $r52;
            $r32.setLastSelectedNetwork($r9);
            this.this$0.lastSelectedNetworkPosition = i;
            FragmentAirtimeTopUpBinding $r72 = this.$binding;
            $r72.spinnerNetwork.setText(str);
            FragmentAirtimeTopUpBinding $r73 = this.$binding;
            TextView $r8 = $r73.textNetworkError;
            Log_OC.loadImage($r8, "binding.textNetworkError");
            ViewExtKt.hide$default($r8, false, 1, null);
            this.this$0.lastSelectedNetworkString = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirtimeTopUpFragment$initBottomSheet$1(List list, String str, AirtimeTopUpFragment airtimeTopUpFragment, C11810u c11810u, FragmentAirtimeTopUpBinding fragmentAirtimeTopUpBinding) {
        super(1);
        this.$items = list;
        this.$typeOfData = str;
        this.this$0 = airtimeTopUpFragment;
        this.$validNetwork = c11810u;
        this.$binding = fragmentAirtimeTopUpBinding;
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
        String $r3;
        Log_OC.getArray(c0757a, "$this$$receiver");
        List $r2 = this.$items;
        c0757a.m38049e($r2);
        String $r32 = this.$typeOfData;
        boolean $z0 = Log_OC.append($r32, AirtimeTopUpFragment.TYPE_OF_DATA_PLAN);
        if ($z0) {
            AirtimeTopUpFragment $r4 = this.this$0;
            $r3 = $r4.lastSelectedDataString;
        } else {
            AirtimeTopUpFragment $r42 = this.this$0;
            $r3 = $r42.lastSelectedNetworkString;
        }
        c0757a.m38048f($r3);
        String $r33 = this.$typeOfData;
        AirtimeTopUpFragment $r43 = this.this$0;
        C11810u $r6 = this.$validNetwork;
        C03921 $r5 = new C03921($r33, $r43, $r6);
        c0757a.m38047g($r5);
        String $r34 = this.$typeOfData;
        AirtimeTopUpFragment $r44 = this.this$0;
        FragmentAirtimeTopUpBinding $r8 = this.$binding;
        C03932 $r7 = new C03932($r34, $r44, $r8);
        c0757a.m38046h($r7);
    }
}
