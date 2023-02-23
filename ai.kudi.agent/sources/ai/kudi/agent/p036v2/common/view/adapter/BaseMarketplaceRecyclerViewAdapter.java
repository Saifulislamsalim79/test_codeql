package ai.kudi.agent.p036v2.common.view.adapter;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BaseMarketplaceRecyclerViewAdapter.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/adapter/BaseMarketplaceRecyclerViewAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.adapter.BaseMarketplaceRecyclerViewAdapter */
/* loaded from: classes.dex */
public abstract class BaseMarketplaceRecyclerViewAdapter<VH extends RecyclerView.AbstractC1620e0> extends RecyclerView.AbstractC1623h<VH> {
    private final C1713j.AbstractC1719f<MarketplaceProductModel> DIFF_CALLBACK = new C1713j.AbstractC1719f<MarketplaceProductModel>() { // from class: ai.kudi.agent.v2.common.view.adapter.BaseMarketplaceRecyclerViewAdapter$DIFF_CALLBACK$1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
        public boolean areContentsTheSame2(MarketplaceProductModel marketplaceProductModel, MarketplaceProductModel marketplaceProductModel2) {
            Log_OC.getArray(marketplaceProductModel, "oldItem");
            Log_OC.getArray(marketplaceProductModel2, "newItem");
            int $i0 = marketplaceProductModel.getId();
            int $i1 = marketplaceProductModel2.getId();
            if ($i0 == $i1) {
                String $r3 = marketplaceProductModel.getCode();
                String $r4 = marketplaceProductModel2.getCode();
                boolean $z0 = Log_OC.append($r3, $r4);
                if ($z0) {
                    String $r32 = marketplaceProductModel.getTitle();
                    String $r42 = marketplaceProductModel2.getTitle();
                    boolean $z02 = Log_OC.append($r32, $r42);
                    if ($z02) {
                        String $r33 = marketplaceProductModel.getDescription();
                        String $r43 = marketplaceProductModel2.getDescription();
                        boolean $z03 = Log_OC.append($r33, $r43);
                        return $z03;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(MarketplaceProductModel marketplaceProductModel, MarketplaceProductModel marketplaceProductModel2) {
            MarketplaceProductModel $r3 = marketplaceProductModel;
            MarketplaceProductModel $r4 = marketplaceProductModel2;
            boolean $z0 = areContentsTheSame2($r3, $r4);
            return $z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
        public boolean areItemsTheSame2(MarketplaceProductModel marketplaceProductModel, MarketplaceProductModel marketplaceProductModel2) {
            Log_OC.getArray(marketplaceProductModel, "oldItem");
            Log_OC.getArray(marketplaceProductModel2, "newItem");
            int $i0 = marketplaceProductModel.getId();
            int $i1 = marketplaceProductModel2.getId();
            if ($i0 == $i1) {
                String $r3 = marketplaceProductModel.getCode();
                String $r4 = marketplaceProductModel2.getCode();
                boolean $z0 = Log_OC.append($r3, $r4);
                if ($z0) {
                    String $r32 = marketplaceProductModel.getTitle();
                    String $r42 = marketplaceProductModel2.getTitle();
                    boolean $z02 = Log_OC.append($r32, $r42);
                    if ($z02) {
                        String $r33 = marketplaceProductModel.getDescription();
                        String $r43 = marketplaceProductModel2.getDescription();
                        boolean $z03 = Log_OC.append($r33, $r43);
                        return $z03;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(MarketplaceProductModel marketplaceProductModel, MarketplaceProductModel marketplaceProductModel2) {
            MarketplaceProductModel $r3 = marketplaceProductModel;
            MarketplaceProductModel $r4 = marketplaceProductModel2;
            boolean $z0 = areItemsTheSame2($r3, $r4);
            return $z0;
        }
    };
    private ArrayList<MarketplaceProductModel> dataList;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMarketplaceRecyclerViewAdapter() {
        ArrayList $r2 = new ArrayList();
        this.dataList = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C1713j.AbstractC1719f getDIFF_CALLBACK() {
        C1713j.AbstractC1719f r1 = this.DIFF_CALLBACK;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList getDataList() {
        ArrayList r1 = this.dataList;
        return r1;
    }

    public final void setDataList(ArrayList arrayList) {
        Log_OC.getArray(arrayList, "<set-?>");
        this.dataList = arrayList;
    }
}
