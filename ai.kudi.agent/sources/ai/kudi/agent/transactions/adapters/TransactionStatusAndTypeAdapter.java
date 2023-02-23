package ai.kudi.agent.transactions.adapters;

import ai.kudi.agent.core.databinding.ItemDropDownListBinding;
import ai.kudi.agent.register.adapter.BaseViewHolder;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import ai.kudi.agent.register.data.models.DropDownModel;
import ai.kudi.agent.transactions.adapters.TransactionStatusAndTypeAdapter;
import ai.kudi.agent.transactions.utils.TransactionsUtilKt;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
/* compiled from: TransactionStatusAndTypeAdapter.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "Lai/kudi/agent/register/data/models/DropDownModel;", "transactionTypesOrStatus", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "IdTypesViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionStatusAndTypeAdapter extends DynamicSearchAdapter<DropDownModel> {
    public static final Companion Companion;
    private static InterfaceC11771p<? super String, ? super Integer, C13666w> clickedListener;
    private static final List<String> transactionStatus;
    private static final List<String> transactionTypes;
    private final List<DropDownModel> transactionTypesOrStatus;

    /* compiled from: TransactionStatusAndTypeAdapter.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter$Companion;", "", "()V", "clickedListener", "Lkotlin/Function2;", "", "", "", "getClickedListener", "()Lkotlin/jvm/functions/Function2;", "setClickedListener", "(Lkotlin/jvm/functions/Function2;)V", "transactionStatus", "", "getTransactionStatus", "()Ljava/util/List;", "transactionTypes", "getTransactionTypes", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final InterfaceC11771p getClickedListener() {
            InterfaceC11771p $r1 = TransactionStatusAndTypeAdapter.clickedListener;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getTransactionStatus() {
            List $r1 = TransactionStatusAndTypeAdapter.transactionStatus;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getTransactionTypes() {
            List $r1 = TransactionStatusAndTypeAdapter.transactionTypes;
            return $r1;
        }

        public final void setClickedListener(InterfaceC11771p interfaceC11771p) {
            TransactionStatusAndTypeAdapter.clickedListener = interfaceC11771p;
        }
    }

    /* compiled from: TransactionStatusAndTypeAdapter.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactions/adapters/TransactionStatusAndTypeAdapter$IdTypesViewHolder;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "binding", "Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "(Lai/kudi/agent/core/databinding/ItemDropDownListBinding;)V", "getBinding", "()Lai/kudi/agent/core/databinding/ItemDropDownListBinding;", "bind", "", "dropDownModel", "Lai/kudi/agent/register/data/models/DropDownModel;", "position", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IdTypesViewHolder extends BaseViewHolder {
        private final ItemDropDownListBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public IdTypesViewHolder(ai.kudi.agent.core.databinding.ItemDropDownListBinding r5) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                ai.kudi.dip.library.button.KudiTextView r1 = r5.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.adapters.TransactionStatusAndTypeAdapter.IdTypesViewHolder.<init>(ai.kudi.agent.core.databinding.ItemDropDownListBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-1$lambda-0  reason: not valid java name */
        public static final void m41088bind$lambda1$lambda0(DropDownModel dropDownModel, int i, View view) {
            Log_OC.getArray(dropDownModel, "$dropDownModel");
            Companion $r2 = TransactionStatusAndTypeAdapter.Companion;
            InterfaceC11771p $r3 = $r2.getClickedListener();
            Log_OC.append($r3);
            String $r4 = dropDownModel.getData();
            Integer $r5 = Integer.valueOf(i);
            $r3.invoke($r4, $r5);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final DropDownModel dropDownModel, final int i) {
            Log_OC.getArray(dropDownModel, "dropDownModel");
            ItemDropDownListBinding $r3 = this.binding;
            TextView $r4 = $r3.dropDownText;
            CharSequence $r2 = dropDownModel.getData();
            TextView r7 = $r4;
            r7.setText($r2);
            TextView r72 = $r4;
            r72.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.adapters.Main
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DropDownModel $r22 = DropDownModel.this;
                    int $i0 = i;
                    TransactionStatusAndTypeAdapter.IdTypesViewHolder.m41088bind$lambda1$lambda0($r22, $i0, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ItemDropDownListBinding getBinding() {
            ItemDropDownListBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r3;
        List $r32;
        Companion $r0 = new Companion(null);
        Companion = $r0;
        Map $r1 = TransactionsUtilKt.getStatusMap();
        Set $r2 = $r1.keySet();
        $r3 = C13742z.m3825B0($r2);
        transactionStatus = $r3;
        Map $r12 = TransactionsUtilKt.getTransactionMap();
        Set $r22 = $r12.keySet();
        $r32 = C13742z.m3825B0($r22);
        transactionTypes = $r32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionStatusAndTypeAdapter(List list) {
        super(list);
        Log_OC.getArray(list, "transactionTypesOrStatus");
        this.transactionTypesOrStatus = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.transactionTypesOrStatus;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(BaseViewHolder baseViewHolder, int i) {
        Log_OC.getArray(baseViewHolder, "holder");
        List $r3 = this.transactionTypesOrStatus;
        Object $r1 = $r3.get(i);
        DropDownModel $r4 = (DropDownModel) $r1;
        IdTypesViewHolder $r5 = (IdTypesViewHolder) baseViewHolder;
        $r5.bind($r4, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        BaseViewHolder $r2 = baseViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        ItemDropDownListBinding $r5 = ItemDropDownListBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        IdTypesViewHolder $r2 = new IdTypesViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
