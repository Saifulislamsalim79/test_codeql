package ai.kudi.agent.p036v2.productSearch.adapter;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$id;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.core.content.C1335a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13726r;
/* compiled from: AutoSearchInputAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/adapter/AutoSearchInputAdapter;", "Landroid/widget/ArrayAdapter;", "", "c", "Landroid/content/Context;", "layoutResource", "", "searchEntries", "", "(Landroid/content/Context;I[Ljava/lang/String;)V", "filteredEntries", "", "getFilteredEntries", "()Ljava/util/List;", "setFilteredEntries", "(Ljava/util/List;)V", "[Ljava/lang/String;", "getCount", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.adapter.AutoSearchInputAdapter */
/* loaded from: classes.dex */
public final class AutoSearchInputAdapter extends ArrayAdapter<String> {
    private List<String> filteredEntries;
    private final int layoutResource;
    private final String[] searchEntries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AutoSearchInputAdapter(Context context, int i, String[] strArr) {
        super(context, i, strArr);
        List $r2;
        Log_OC.getArray(context, "c");
        Log_OC.getArray(strArr, "searchEntries");
        this.layoutResource = i;
        this.searchEntries = strArr;
        $r2 = C13726r.m3891e();
        this.filteredEntries = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        List $r1 = this.filteredEntries;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: ai.kudi.agent.v2.productSearch.adapter.AutoSearchInputAdapter$getFilter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                List $r5;
                Filter.FilterResults $r2 = new Filter.FilterResults();
                AutoSearchInputAdapter $r3 = AutoSearchInputAdapter.this;
                String[] $r4 = $r3.searchEntries;
                $r5 = C13712m.m4067d($r4);
                $r2.values = $r5;
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                AutoSearchInputAdapter $r3 = AutoSearchInputAdapter.this;
                Object $r4 = filterResults == null ? null : filterResults.values;
                if ($r4 == null) {
                    NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    throw $r6;
                }
                List $r5 = (List) $r4;
                $r3.setFilteredEntries($r5);
                AutoSearchInputAdapter $r32 = AutoSearchInputAdapter.this;
                $r32.notifyDataSetChanged();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getFilteredEntries() {
        List r1 = this.filteredEntries;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        String $r1 = getItem(i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public String getItem(int i) {
        List $r1 = this.filteredEntries;
        Object $r2 = $r1.get(i);
        String $r3 = (String) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View $r1, ViewGroup viewGroup) {
        Log_OC.getArray(viewGroup, "parent");
        if ($r1 == null) {
            Context $r3 = viewGroup.getContext();
            LayoutInflater $r4 = LayoutInflater.from($r3);
            int $i1 = this.layoutResource;
            $r1 = $r4.inflate($i1, viewGroup, false);
        }
        int $i12 = R$id.tv_entry_item_text;
        View $r5 = $r1.findViewById($i12);
        TextView $r6 = (TextView) $r5;
        List $r7 = this.filteredEntries;
        Object $r8 = $r7.get(i);
        String $r9 = (String) $r8;
        $r6.setText($r9);
        if (i == 0) {
            Context $r32 = $r1.getContext();
            int $i0 = R$drawable.drawable_auto_complete_background;
            Drawable $r10 = C1335a.m36322f($r32, $i0);
            $r6.setBackground($r10);
        } else {
            Context $r33 = $r1.getContext();
            Drawable $r102 = C1335a.m36322f($r33, 17170445);
            $r6.setBackground($r102);
        }
        Log_OC.loadImage($r1, "view");
        return $r1;
    }

    public final void setFilteredEntries(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.filteredEntries = list;
    }
}
