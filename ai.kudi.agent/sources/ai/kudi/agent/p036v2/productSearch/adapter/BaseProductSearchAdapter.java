package ai.kudi.agent.p036v2.productSearch.adapter;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.p036v2.common.view.adapter.BaseRecyclerViewAdapter;
import ai.kudi.agent.register.adapter.BaseViewHolder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BaseProductSearchAdapter.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J \u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078UX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/adapter/BaseProductSearchAdapter;", "Lai/kudi/agent/v2/common/view/adapter/BaseRecyclerViewAdapter;", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "Landroid/widget/Filterable;", "()V", "layoutResourceId", "", "getLayoutResourceId", "()I", "onNothingFound", "Lkotlin/Function0;", "", "searchableList", "", "getFilter", "Landroid/widget/Filter;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "search", "s", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter */
/* loaded from: classes.dex */
public abstract class BaseProductSearchAdapter extends BaseRecyclerViewAdapter<MarketplaceProductModel, BaseViewHolder> implements Filterable {
    private final int layoutResourceId;
    private InterfaceC11756a<C13666w> onNothingFound;
    private final List<MarketplaceProductModel> searchableList;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseProductSearchAdapter() {
        int $i0 = C0038R.C0041layout.item_drop_down_list;
        this.layoutResourceId = $i0;
        ArrayList $r1 = new ArrayList();
        this.searchableList = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter$getFilter$1
            private final Filter.FilterResults filterResults;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                Filter.FilterResults $r2 = new Filter.FilterResults();
                this.filterResults = $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:13:0x0047 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
            @Override // android.widget.Filter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r18) {
                /*
                    r17 = this;
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.access$getSearchableList$p(r1)
                    r2.clear()
                    if (r18 == 0) goto L1a
                    r0 = r18
                    boolean r3 = kotlin.p549l0.C13265j.m5470u(r0)
                    if (r3 == 0) goto L18
                    goto L1a
                L18:
                    r3 = 0
                    goto L1b
                L1a:
                    r3 = 1
                L1b:
                    if (r3 == 0) goto L35
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.access$getSearchableList$p(r1)
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r4 = r1.getDataList()
                    r2.addAll(r4)
                    goto L93
                L35:
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = r1.getDataList()
                    java.util.Iterator r5 = r2.iterator()
                L43:
                    boolean r3 = r5.hasNext()
                    if (r3 == 0) goto L93
                    java.lang.Object r6 = r5.next()
                    r8 = r6
                    ai.kudi.agent.core.domain.data.MarketplaceProductModel r8 = (ai.kudi.agent.core.domain.data.MarketplaceProductModel) r8
                    r7 = r8
                    java.lang.String r9 = r7.getTitle()
                    r10 = 0
                    r11 = 2
                    r12 = 0
                    r0 = r18
                    boolean r3 = kotlin.p549l0.C13265j.m5501J(r9, r0, r10, r11, r12)
                    if (r3 != 0) goto L85
                    java.lang.String r9 = r7.getTitle()
                    if (r9 == 0) goto L7d
                    java.util.Locale r13 = java.util.Locale.ROOT
                    java.lang.String r9 = r9.toLowerCase(r13)
                    java.lang.String r14 = "(this as java.lang.Strin….toLowerCase(Locale.ROOT)"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r9, r14)
                    r10 = 0
                    r11 = 2
                    r12 = 0
                    r0 = r18
                    boolean r3 = kotlin.p549l0.C13265j.m5501J(r9, r0, r10, r11, r12)
                    if (r3 == 0) goto L43
                    goto L85
                L7d:
                    java.lang.NullPointerException r15 = new java.lang.NullPointerException
                    java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
                    r15.<init>(r14)
                    throw r15
                L85:
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.access$getSearchableList$p(r1)
                    r2.add(r7)
                    goto L43
                L93:
                    r0 = r17
                    android.widget.Filter$FilterResults r0 = r0.filterResults
                    r16 = r0
                    r0 = r17
                    ai.kudi.agent.v2.productSearch.adapter.BaseProductSearchAdapter r1 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter.access$getSearchableList$p(r1)
                    r0 = r16
                    r0.values = r2
                    return r16
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.productSearch.adapter.BaseProductSearchAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                BaseProductSearchAdapter $r3 = BaseProductSearchAdapter.this;
                List $r4 = $r3.searchableList;
                boolean $z0 = $r4.isEmpty();
                if ($z0) {
                    BaseProductSearchAdapter $r32 = BaseProductSearchAdapter.this;
                    InterfaceC11756a $r5 = $r32.onNothingFound;
                    if ($r5 != null) {
                        $r5.invoke();
                    }
                }
                BaseProductSearchAdapter $r33 = BaseProductSearchAdapter.this;
                $r33.notifyDataSetChanged();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected int getLayoutResourceId() {
        int i0 = this.layoutResourceId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        int $i0 = getLayoutResourceId();
        View $r5 = $r4.inflate($i0, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context).inflate(layoutResourceId, parent, false)");
        BaseViewHolder $r2 = new BaseViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void search(String str, InterfaceC11756a interfaceC11756a) {
        this.onNothingFound = interfaceC11756a;
        Filter $r2 = getFilter();
        $r2.filter(str);
    }
}
