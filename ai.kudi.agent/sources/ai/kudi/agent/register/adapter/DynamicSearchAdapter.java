package ai.kudi.agent.register.adapter;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter.Searchable;
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
/* compiled from: DynamicSearchAdapter.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001!B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J \u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eR\u0016\u0010\t\u001a\u00020\n8UX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010\u0010\u001a\"\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u00000\u0011j\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000`\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/register/adapter/DynamicSearchAdapter;", "T", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/register/adapter/BaseViewHolder;", "Landroid/widget/Filterable;", "searchableList", "", "(Ljava/util/List;)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "onNothingFound", "Lkotlin/Function0;", "", "originalList", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "getOriginalList", "()Ljava/util/ArrayList;", "getSearchableList", "()Ljava/util/List;", "getFilter", "Landroid/widget/Filter;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "search", "s", "", "Searchable", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class DynamicSearchAdapter<T extends Searchable> extends RecyclerView.AbstractC1623h<BaseViewHolder> implements Filterable {
    private final int layoutResourceId;
    private InterfaceC11756a<C13666w> onNothingFound;
    private final ArrayList<T> originalList;
    private final List<T> searchableList;

    /* compiled from: DynamicSearchAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", "", "getSearchCriteria", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Searchable {
        String getSearchCriteria();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public DynamicSearchAdapter(List list) {
        Log_OC.getArray(list, "searchableList");
        this.searchableList = list;
        int $i0 = C0038R.C0041layout.item_drop_down_list;
        this.layoutResourceId = $i0;
        List $r1 = this.searchableList;
        ArrayList $r2 = new ArrayList($r1);
        this.originalList = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: ai.kudi.agent.register.adapter.DynamicSearchAdapter$getFilter$1
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
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = r1.getSearchableList()
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
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r0 = r17
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.ArrayList r4 = r1.getOriginalList()
                    r2.addAll(r4)
                    goto L9f
                L35:
                    r0 = r17
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.ArrayList r4 = r1.getOriginalList()
                    java.util.Iterator r5 = r4.iterator()
                L43:
                    boolean r3 = r5.hasNext()
                    if (r3 == 0) goto L9f
                    java.lang.Object r6 = r5.next()
                    r8 = r6
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter$Searchable r8 = (ai.kudi.agent.register.adapter.DynamicSearchAdapter.Searchable) r8
                    r7 = r8
                    java.lang.String r9 = r7.getSearchCriteria()
                    r10 = 0
                    r11 = 2
                    r12 = 0
                    r0 = r18
                    boolean r3 = kotlin.p549l0.C13265j.m5501J(r9, r0, r10, r11, r12)
                    if (r3 != 0) goto L8c
                    java.lang.String r9 = r7.getSearchCriteria()
                    java.util.Locale r13 = java.util.Locale.getDefault()
                    java.lang.String r14 = "getDefault()"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r13, r14)
                    if (r9 == 0) goto L84
                    java.lang.String r9 = r9.toLowerCase(r13)
                    java.lang.String r14 = "(this as java.lang.String).toLowerCase(locale)"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r9, r14)
                    r10 = 0
                    r11 = 2
                    r12 = 0
                    r0 = r18
                    boolean r3 = kotlin.p549l0.C13265j.m5501J(r9, r0, r10, r11, r12)
                    if (r3 == 0) goto L43
                    goto L8c
                L84:
                    java.lang.NullPointerException r15 = new java.lang.NullPointerException
                    java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
                    r15.<init>(r14)
                    throw r15
                L8c:
                    r0 = r17
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = r1.getSearchableList()
                    java.lang.String r14 = "i"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r7, r14)
                    r2.add(r7)
                    goto L43
                L9f:
                    r0 = r17
                    android.widget.Filter$FilterResults r0 = r0.filterResults
                    r16 = r0
                    r0 = r17
                    ai.kudi.agent.register.adapter.DynamicSearchAdapter<T> r1 = ai.kudi.agent.register.adapter.DynamicSearchAdapter.this
                    r17 = r0
                    java.util.List r2 = r1.getSearchableList()
                    r0 = r16
                    r0.values = r2
                    return r16
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.adapter.DynamicSearchAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                DynamicSearchAdapter $r3 = DynamicSearchAdapter.this;
                List $r4 = $r3.getSearchableList();
                boolean $z0 = $r4.isEmpty();
                if ($z0) {
                    DynamicSearchAdapter $r32 = DynamicSearchAdapter.this;
                    InterfaceC11756a $r5 = $r32.onNothingFound;
                    if ($r5 != null) {
                        $r5.invoke();
                    }
                }
                DynamicSearchAdapter $r33 = DynamicSearchAdapter.this;
                $r33.notifyDataSetChanged();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected int getLayoutResourceId() {
        int i0 = this.layoutResourceId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final ArrayList getOriginalList() {
        ArrayList r1 = this.originalList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List getSearchableList() {
        List r1 = this.searchableList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Can't rename method to resolve collision */
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void search(String str, InterfaceC11756a interfaceC11756a) {
        this.onNothingFound = interfaceC11756a;
        Filter $r2 = getFilter();
        $r2.filter(str);
    }
}
