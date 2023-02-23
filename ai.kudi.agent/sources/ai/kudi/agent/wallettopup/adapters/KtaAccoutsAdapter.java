package ai.kudi.agent.wallettopup.adapters;

import ai.kudi.agent.databinding.LayoutKtaItemBinding;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KtaAccoutsAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/KtaAccoutsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/wallettopup/adapters/KtaAccountViewHolder;", "()V", "monnifyDetails", "", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$AccountData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "accountData", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KtaAccoutsAdapter extends RecyclerView.AbstractC1623h<KtaAccountViewHolder> {
    private List<MonnifyDetails.AccountData> monnifyDetails;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KtaAccoutsAdapter() {
        ArrayList $r1 = new ArrayList();
        this.monnifyDetails = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.monnifyDetails;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(KtaAccountViewHolder ktaAccountViewHolder, int i) {
        Log_OC.getArray(ktaAccountViewHolder, "holder");
        List $r2 = this.monnifyDetails;
        Object $r3 = $r2.get(i);
        MonnifyDetails.AccountData $r4 = (MonnifyDetails.AccountData) $r3;
        ktaAccountViewHolder.bind($r4);
        List $r22 = this.monnifyDetails;
        int $i1 = $r22.size();
        if (i == $i1 - 1) {
            ktaAccountViewHolder.hideView();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(KtaAccountViewHolder ktaAccountViewHolder, int i) {
        KtaAccountViewHolder $r2 = ktaAccountViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public KtaAccountViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        LayoutKtaItemBinding $r5 = LayoutKtaItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        KtaAccountViewHolder $r2 = new KtaAccountViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ KtaAccountViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        KtaAccountViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "accountData");
        List $r2 = this.monnifyDetails;
        $r2.clear();
        List $r22 = this.monnifyDetails;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
