package ai.kudi.agent.transfer.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.databinding.SearchItemBinding;
import ai.kudi.agent.register.adapter.BaseViewHolder;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter.Searchable;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BanksAdapter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u0019\u001aB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0014\u001a\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/BanksAdapter;", "T", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "context", "Landroid/content/Context;", "mutableList", "", "bankAdapterClickListener", "Lai/kudi/agent/transfer/adapter/BanksAdapter$BankAdapterClickListener;", "bankCode", "", "(Landroid/content/Context;Ljava/util/List;Lai/kudi/agent/transfer/adapter/BanksAdapter$BankAdapterClickListener;Ljava/lang/String;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "position", "onCreateViewHolder", "Lai/kudi/agent/transfer/adapter/BanksAdapter$SearchViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "BankAdapterClickListener", "SearchViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BanksAdapter<T extends DynamicSearchAdapter.Searchable> extends DynamicSearchAdapter<T> {
    private final BankAdapterClickListener<T> bankAdapterClickListener;
    private final String bankCode;
    private final Context context;
    private final List<T> mutableList;

    /* compiled from: BanksAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/BanksAdapter$BankAdapterClickListener;", "T", "", "onBankSelected", "", "bank", "(Ljava/lang/Object;)V", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface BankAdapterClickListener<T> {
        void onBankSelected(Object obj);
    }

    /* compiled from: BanksAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/adapter/BanksAdapter$SearchViewHolder;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "binding", "Lai/kudi/agent/databinding/SearchItemBinding;", "(Lai/kudi/agent/transfer/adapter/BanksAdapter;Lai/kudi/agent/databinding/SearchItemBinding;)V", "getBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class SearchViewHolder extends BaseViewHolder {
        private final SearchItemBinding binding;
        final /* synthetic */ BanksAdapter<T> this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SearchViewHolder(ai.kudi.agent.transfer.adapter.BanksAdapter r4, ai.kudi.agent.databinding.SearchItemBinding r5) {
            /*
                r3 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                r3.this$0 = r4
                android.widget.LinearLayout r1 = r5.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3.<init>(r1)
                r3.binding = r5
                android.widget.LinearLayout r1 = r5.getRoot()
                ai.kudi.agent.transfer.adapter.BanksAdapter<T extends ai.kudi.agent.register.adapter.DynamicSearchAdapter$Searchable> r4 = r3.this$0
                ai.kudi.agent.transfer.adapter.d r2 = new ai.kudi.agent.transfer.adapter.d
                r2.<init>()
                r1.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.adapter.BanksAdapter.SearchViewHolder.<init>(ai.kudi.agent.transfer.adapter.BanksAdapter, ai.kudi.agent.databinding.SearchItemBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m41310_init_$lambda0(BanksAdapter banksAdapter, SearchViewHolder searchViewHolder, View view) {
            Log_OC.getArray(banksAdapter, "this$0");
            Log_OC.getArray(searchViewHolder, "this$1");
            BankAdapterClickListener $r3 = banksAdapter.bankAdapterClickListener;
            List $r4 = banksAdapter.mutableList;
            int $i0 = searchViewHolder.getAdapterPosition();
            Object $r5 = $r4.get($i0);
            $r3.onBankSelected($r5);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SearchItemBinding getBinding() {
            SearchItemBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BanksAdapter(Context context, List list, BankAdapterClickListener bankAdapterClickListener, String str) {
        super(list);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(list, "mutableList");
        Log_OC.getArray(bankAdapterClickListener, "bankAdapterClickListener");
        this.context = context;
        this.mutableList = list;
        this.bankAdapterClickListener = bankAdapterClickListener;
        this.bankCode = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.mutableList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(BaseViewHolder baseViewHolder, int i) {
        Log_OC.getArray(baseViewHolder, "holder");
        boolean $z0 = baseViewHolder instanceof SearchViewHolder;
        if ($z0) {
            SearchViewHolder $r2 = (SearchViewHolder) baseViewHolder;
            SearchItemBinding $r3 = $r2.getBinding();
            TextView $r4 = $r3.bankNameText;
            Log_OC.loadImage($r4, "binding.bankNameText");
            List $r5 = this.mutableList;
            Object $r6 = $r5.get(i);
            DynamicSearchAdapter.Searchable $r7 = (DynamicSearchAdapter.Searchable) $r6;
            String $r8 = $r7.getSearchCriteria();
            $r4.setText($r8);
            Bank.BanksList $r9 = new Bank.BanksList();
            String $r82 = this.bankCode;
            int $i1 = $r9.locateBank($r82);
            if ($i1 != i) {
                ImageView $r10 = $r3.selectedImage;
                $r10.setImageDrawable(null);
                return;
            }
            ImageView $r102 = $r3.selectedImage;
            Context $r11 = this.context;
            Drawable $r12 = C1335a.m36322f($r11, C0001R.C0002drawable.ic_sqare_selected);
            $r102.setImageDrawable($r12);
        }
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
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SearchViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = this.context;
        LayoutInflater $r4 = LayoutInflater.from($r3);
        SearchItemBinding $r5 = SearchItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(context), parent, false)");
        SearchViewHolder $r2 = new SearchViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SearchViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
