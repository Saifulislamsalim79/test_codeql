package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.settings.data.models.TwoColumnItem;
import androidx.recyclerview.widget.C1713j;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TwoColumnDiffUtil.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0017J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/TwoColumnDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lai/kudi/agent/settings/data/models/TwoColumnItem$SimpleItem;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "oldPosition", "newPosition", "getNewListSize", "getOldListSize", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.TwoColumnDiffUtil */
/* loaded from: classes.dex */
public final class TwoColumnDiffUtil extends C1713j.AbstractC1715b {
    private final List<TwoColumnItem.SimpleItem> newList;
    private final List<TwoColumnItem.SimpleItem> oldList;

    public TwoColumnDiffUtil(List list, List list2) {
        Log_OC.getArray(list, "oldList");
        Log_OC.getArray(list2, "newList");
        this.oldList = list;
        this.newList = list2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public boolean areContentsTheSame(int i, int i2) {
        List $r1 = this.oldList;
        Object $r2 = $r1.get(i);
        TwoColumnItem.SimpleItem $r3 = (TwoColumnItem.SimpleItem) $r2;
        List $r12 = this.newList;
        Object $r22 = $r12.get(i2);
        TwoColumnItem.SimpleItem $r4 = (TwoColumnItem.SimpleItem) $r22;
        boolean $z0 = Log_OC.append($r3, $r4);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public boolean areItemsTheSame(int i, int i2) {
        List $r1 = this.oldList;
        Object $r2 = $r1.get(i);
        TwoColumnItem.SimpleItem $r3 = (TwoColumnItem.SimpleItem) $r2;
        String $r4 = $r3.getValue();
        List $r12 = this.newList;
        Object $r22 = $r12.get(i2);
        TwoColumnItem.SimpleItem $r32 = (TwoColumnItem.SimpleItem) $r22;
        String $r5 = $r32.getValue();
        return $r4 == $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public Object getChangePayload(int i, int i2) {
        Object $r1 = super.getChangePayload(i, i2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public int getNewListSize() {
        List $r1 = this.newList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public int getOldListSize() {
        List $r1 = this.oldList;
        int $i0 = $r1.size();
        return $i0;
    }
}
