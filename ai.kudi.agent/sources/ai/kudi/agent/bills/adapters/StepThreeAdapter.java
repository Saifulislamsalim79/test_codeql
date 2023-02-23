package ai.kudi.agent.bills.adapters;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.StepThreeItemBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: StepThreeAdapter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00162\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u0016\u0017\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/StepThreeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/bills/adapters/StepThreeAdapter$StepThreeViewHolder;", AttributeType.LIST, "", "Lai/kudi/agent/bills/adapters/StepThreeAdapter$DataToShow;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", TransactionBreakDownItemType.DATA, "", "Companion", "DataToShow", "StepThreeViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StepThreeAdapter extends RecyclerView.AbstractC1623h<StepThreeViewHolder> {
    public static final Companion Companion;
    private static InterfaceC11756a<C13666w> listener;
    private final List<DataToShow> list;

    /* compiled from: StepThreeAdapter.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/StepThreeAdapter$Companion;", "", "()V", "listener", "Lkotlin/Function0;", "", "getListener", "()Lkotlin/jvm/functions/Function0;", "setListener", "(Lkotlin/jvm/functions/Function0;)V", "mapCableDataToDataToShowList", "", "Lai/kudi/agent/bills/adapters/StepThreeAdapter$DataToShow;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final InterfaceC11756a getListener() {
            InterfaceC11756a $r1 = StepThreeAdapter.listener;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List mapCableDataToDataToShowList(BillsData billsData) {
            List $r8;
            Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
            DataToShow[] $r2 = new DataToShow[4];
            String $r4 = billsData.getAccountName();
            Log_OC.append($r4);
            StringBuilder $r5 = new StringBuilder();
            String $r6 = billsData.getCustomerBillerId();
            $r5.append((Object) $r6);
            $r5.append(" | ");
            String $r62 = billsData.getPlan();
            $r5.append((Object) $r62);
            $r5.append(" & ");
            int $i0 = billsData.getAmount();
            $r5.append($i0);
            String $r63 = $r5.toString();
            DataToShow $r3 = new DataToShow($r4, $r63);
            $r2[0] = $r3;
            int $i02 = billsData.getCustomerPhoneNo().length();
            boolean $z0 = $i02 == 0;
            DataToShow $r32 = new DataToShow("Customer's Name", $z0 ? "--" : billsData.getCustomerPhoneNo());
            $r2[1] = $r32;
            int $i03 = billsData.getAmount();
            Integer $r7 = Integer.valueOf($i03);
            DataToShow $r33 = new DataToShow("Amount", Log_OC.m10359a("NGN ", $r7));
            $r2[2] = $r33;
            DataToShow $r34 = new DataToShow("Nomba Charge", billsData.getServiceFee());
            $r2[3] = $r34;
            $r8 = C13726r.m3888h($r2);
            return $r8;
        }

        public final void setListener(InterfaceC11756a interfaceC11756a) {
            StepThreeAdapter.listener = interfaceC11756a;
        }
    }

    /* compiled from: StepThreeAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/StepThreeAdapter$DataToShow;", "", KudiPin.KUDI_PIN_TITLE, "", "subtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DataToShow {
        private final String subtitle;
        private final String title;

        public DataToShow(String str, String str2) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, "subtitle");
            this.title = str;
            this.subtitle = str2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ DataToShow copy$default(DataToShow dataToShow, String $r1, String $r2, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = dataToShow.title;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $r2 = dataToShow.subtitle;
            }
            DataToShow $r0 = dataToShow.copy($r1, $r2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.title;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.subtitle;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DataToShow copy(String str, String str2) {
            Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
            Log_OC.getArray(str2, "subtitle");
            DataToShow $r0 = new DataToShow(str, str2);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof DataToShow;
            if ($z0) {
                DataToShow $r3 = (DataToShow) obj;
                String $r4 = this.title;
                String $r1 = $r3.title;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    String $r12 = this.subtitle;
                    String $r42 = $r3.subtitle;
                    boolean $z03 = Log_OC.append($r12, $r42);
                    return $z03;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getSubtitle() {
            String r1 = this.subtitle;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getTitle() {
            String r1 = this.title;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.title;
            int $i0 = $r1.hashCode();
            String $r12 = this.subtitle;
            int $i1 = $r12.hashCode();
            return ($i0 * 31) + $i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("DataToShow(title=");
            String $r1 = this.title;
            $r2.append($r1);
            $r2.append(", subtitle=");
            String $r12 = this.subtitle;
            $r2.append($r12);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    /* compiled from: StepThreeAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/StepThreeAdapter$StepThreeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/StepThreeItemBinding;", "(Lai/kudi/agent/bills/adapters/StepThreeAdapter;Lai/kudi/agent/databinding/StepThreeItemBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/StepThreeItemBinding;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class StepThreeViewHolder extends RecyclerView.AbstractC1620e0 {
        private final StepThreeItemBinding binding;
        final /* synthetic */ StepThreeAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StepThreeViewHolder(ai.kudi.agent.bills.adapters.StepThreeAdapter r3, ai.kudi.agent.databinding.StepThreeItemBinding r4) {
            /*
                r2 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
                r2.this$0 = r3
                android.widget.LinearLayout r1 = r4.getRoot()
                r2.<init>(r1)
                r2.binding = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.adapters.StepThreeAdapter.StepThreeViewHolder.<init>(ai.kudi.agent.bills.adapters.StepThreeAdapter, ai.kudi.agent.databinding.StepThreeItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final StepThreeItemBinding getBinding() {
            StepThreeItemBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public StepThreeAdapter(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        this.list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m39019onBindViewHolder$lambda0(View view) {
        InterfaceC11756a $r1 = listener;
        if ($r1 == null) {
            return;
        }
        $r1.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.list;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getList() {
        List r1 = this.list;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(StepThreeViewHolder stepThreeViewHolder, int i) {
        Log_OC.getArray(stepThreeViewHolder, "holder");
        StepThreeItemBinding $r2 = stepThreeViewHolder.getBinding();
        TextView $r3 = $r2.titleText;
        List $r4 = this.list;
        Object $r5 = $r4.get(i);
        DataToShow $r6 = (DataToShow) $r5;
        String $r7 = $r6.getTitle();
        $r3.setText(StringExtKt.getCapitalizeAllWords($r7));
        StepThreeItemBinding $r22 = stepThreeViewHolder.getBinding();
        TextView $r32 = $r22.description;
        List $r42 = this.list;
        Object $r52 = $r42.get(i);
        DataToShow $r62 = (DataToShow) $r52;
        String $r72 = $r62.getSubtitle();
        $r32.setText($r72);
        List $r43 = this.list;
        Object $r53 = $r43.get(i);
        DataToShow $r63 = (DataToShow) $r53;
        String $r73 = $r63.getTitle();
        boolean $z0 = Log_OC.append($r73, "Nomba Charge");
        if ($z0) {
            StepThreeItemBinding $r23 = stepThreeViewHolder.getBinding();
            TextView $r33 = $r23.editButton;
            Log_OC.loadImage($r33, "holder.binding.editButton");
            ViewExtKt.hide$default($r33, false, 1, null);
        }
        StepThreeItemBinding $r24 = stepThreeViewHolder.getBinding();
        TextView $r34 = $r24.editButton;
        View$OnClickListenerC0011c $r8 = View$OnClickListenerC0011c.f40c;
        $r34.setOnClickListener($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(StepThreeViewHolder stepThreeViewHolder, int i) {
        StepThreeViewHolder $r2 = stepThreeViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public StepThreeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        StepThreeItemBinding $r5 = StepThreeItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        StepThreeViewHolder $r2 = new StepThreeViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ StepThreeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        StepThreeViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
        List $r2 = this.list;
        $r2.clear();
        List $r22 = this.list;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
