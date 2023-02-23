package ai.kudi.agent.p036v2.common.view.adapter;

import ai.kudi.agent.p036v2.common.view.adapter.utils.CustomIdiomsKt;
import android.util.Log;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1620e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* compiled from: BaseRecyclerViewAdapter.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\b\u0010\u0017\u001a\u00020\u0010H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ$\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&J\u0015\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0012H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0004J\u0016\u0010\"\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010(\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0016\u0010)\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/adapter/BaseRecyclerViewAdapter;", "Type", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "isCurrentlyProcessing", "", "mDataset", "", "mPendingUpdates", "Ljava/util/ArrayDeque;", "opsThread", "Ljava/lang/Thread;", "addItemAtIndex", "", "index", "", "item", "(ILjava/lang/Object;)V", "addMoreItems", "moreItemList", "clearPendingUpdates", "getDataList", "getDiffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "oldList", "newList", "getItemAt", "position", "(I)Ljava/lang/Object;", "getItemCount", "getUpdatedList", "internalUpdate", "isValidIndex", "moveItemTo", "fromPosition", "toPosition", "removeItemAt", "swapAdapterData", "updateDataset", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.adapter.BaseRecyclerViewAdapter */
/* loaded from: classes.dex */
public abstract class BaseRecyclerViewAdapter<Type, VH extends RecyclerView.AbstractC1620e0> extends RecyclerView.AbstractC1623h<VH> {
    private boolean isCurrentlyProcessing;
    private List<? extends Type> mDataset;
    private final ArrayDeque<List<Type>> mPendingUpdates;
    private Thread opsThread;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseRecyclerViewAdapter() {
        List $r1;
        ArrayDeque $r2 = new ArrayDeque();
        this.mPendingUpdates = $r2;
        $r1 = C13726r.m3891e();
        this.mDataset = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void clearPendingUpdates() {
        Thread $r1 = this.opsThread;
        if ($r1 != null) {
            $r1.interrupt();
        }
        ArrayDeque $r2 = this.mPendingUpdates;
        $r2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void internalUpdate(List list) {
        this.isCurrentlyProcessing = true;
        BaseRecyclerViewAdapter$internalUpdate$1 $r3 = new BaseRecyclerViewAdapter$internalUpdate$1(this, list);
        Thread $r1 = CustomIdiomsKt.runBackground($r3);
        this.opsThread = $r1;
        Log_OC.append($r1);
        $r1.start();
        Thread $r12 = this.opsThread;
        Log_OC.append($r12);
        $r12.join();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isValidIndex(int i) {
        if (i >= 0) {
            int $i1 = getItemCount();
            return i <= $i1 - 1;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addItemAtIndex(int i, Object obj) {
        Log_OC.getArray(obj, "item");
        boolean $z0 = isValidIndex(i);
        if ($z0) {
            List $r3 = getUpdatedList();
            ArrayList $r2 = new ArrayList($r3);
            $r2.add(i, obj);
            updateDataset($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addMoreItems(List list) {
        List $r3;
        Log_OC.getArray(list, "moreItemList");
        List $r32 = getUpdatedList();
        $r3 = C13742z.m3823D0($r32);
        ArrayList $r2 = new ArrayList($r3);
        $r2.addAll(list);
        updateDataset($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getDataList() {
        List $r1 = getUpdatedList();
        return $r1;
    }

    public abstract C1713j.C1718e getDiffResult(List list, List list2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getItemAt(int i) {
        boolean $z0 = isValidIndex(i);
        if ($z0) {
            List $r5 = getUpdatedList();
            Object $r6 = $r5.get(i);
            return $r6;
        }
        C11780a0 c11780a0 = C11780a0.f26475a;
        Integer $r3 = Integer.valueOf(i);
        Object[] $r1 = {$r3};
        String $r4 = String.format("Invalid index %d", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r4, "java.lang.String.format(format, *args)");
        Log.e("TAG", $r4);
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = getUpdatedList();
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final List getUpdatedList() {
        ArrayDeque $r1 = this.mPendingUpdates;
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            List $r3 = this.mDataset;
            return $r3;
        }
        ArrayDeque $r12 = this.mPendingUpdates;
        Object $r2 = $r12.peekLast();
        Log_OC.append($r2);
        List $r32 = (List) $r2;
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void moveItemTo(int i, int i2) {
        List $r2;
        boolean $z0 = isValidIndex(i);
        if ($z0) {
            boolean $z02 = isValidIndex(i2);
            if ($z02) {
                List $r22 = getUpdatedList();
                $r2 = C13742z.m3823D0($r22);
                ArrayList $r1 = new ArrayList($r2);
                Object $r3 = $r1.get(i);
                Log_OC.loadImage($r3, "currentList[fromPosition]");
                $r1.remove(i);
                $r1.add(i2, $r3);
                updateDataset($r1);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeItemAt(int i) {
        boolean $z0 = isValidIndex(i);
        if ($z0) {
            List $r2 = getUpdatedList();
            ArrayList $r1 = new ArrayList($r2);
            $r1.remove(i);
            updateDataset($r1);
        }
    }

    public final void swapAdapterData(List list) {
        Log_OC.getArray(list, "newList");
        clearPendingUpdates();
        updateDataset(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateDataset(List list) {
        Log_OC.getArray(list, "newList");
        ArrayDeque $r2 = this.mPendingUpdates;
        $r2.add(list);
        ArrayDeque $r22 = this.mPendingUpdates;
        int $i0 = $r22.size();
        if ($i0 == 1) {
            boolean $z0 = this.isCurrentlyProcessing;
            if ($z0) {
                return;
            }
            internalUpdate(list);
        }
    }
}
