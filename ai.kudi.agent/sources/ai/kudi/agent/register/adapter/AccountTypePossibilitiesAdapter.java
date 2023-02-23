package ai.kudi.agent.register.adapter;

import ai.kudi.agent.databinding.BusinessTypeItemBinding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountTypePossibilitiesAdapter.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/register/adapter/AccountTypePossibilitiesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/register/adapter/AccountTypePossibilitiesAdapter$AccountTypePossibilityViewHolder;", "items", "", "", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AccountTypePossibilityViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountTypePossibilitiesAdapter extends RecyclerView.AbstractC1623h<AccountTypePossibilityViewHolder> {
    private final List<Integer> items;

    /* compiled from: AccountTypePossibilitiesAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/adapter/AccountTypePossibilitiesAdapter$AccountTypePossibilityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/BusinessTypeItemBinding;", "(Lai/kudi/agent/databinding/BusinessTypeItemBinding;)V", "bind", "", "item", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AccountTypePossibilityViewHolder extends RecyclerView.AbstractC1620e0 {
        private final BusinessTypeItemBinding binding;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AccountTypePossibilityViewHolder(ai.kudi.agent.databinding.BusinessTypeItemBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
                android.widget.LinearLayout r1 = r3.getRoot()
                r2.<init>(r1)
                r2.binding = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.adapter.AccountTypePossibilitiesAdapter.AccountTypePossibilityViewHolder.<init>(ai.kudi.agent.databinding.BusinessTypeItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(int i) {
            BusinessTypeItemBinding $r2 = this.binding;
            TextView $r1 = $r2.content;
            LinearLayout $r3 = $r2.getRoot();
            Context $r4 = $r3.getContext();
            String $r5 = $r4.getString(i);
            $r1.setText($r5);
        }
    }

    public AccountTypePossibilitiesAdapter(List list) {
        Log_OC.getArray(list, "items");
        this.items = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(AccountTypePossibilityViewHolder accountTypePossibilityViewHolder, int i) {
        Log_OC.getArray(accountTypePossibilityViewHolder, "holder");
        List $r2 = this.items;
        Object $r3 = $r2.get(i);
        Number $r4 = (Number) $r3;
        int $i0 = $r4.intValue();
        accountTypePossibilityViewHolder.bind($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(AccountTypePossibilityViewHolder accountTypePossibilityViewHolder, int i) {
        AccountTypePossibilityViewHolder $r2 = accountTypePossibilityViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public AccountTypePossibilityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        BusinessTypeItemBinding $r5 = BusinessTypeItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(\n                    parent.context\n                ), parent, false\n            )");
        AccountTypePossibilityViewHolder $r2 = new AccountTypePossibilityViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ AccountTypePossibilityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AccountTypePossibilityViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
