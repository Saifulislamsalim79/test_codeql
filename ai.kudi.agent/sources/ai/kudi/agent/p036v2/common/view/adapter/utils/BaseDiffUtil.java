package ai.kudi.agent.p036v2.common.view.adapter.utils;

import androidx.recyclerview.widget.C1713j;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: BaseDiffUtil.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J,\u0010\u0014\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u000fJ\u0015\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/adapter/utils/BaseDiffUtil;", "Type", "", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "()V", "newList", "", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "oldList", "getOldList", "setOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "computeDiff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "detectMoves", "getFromNewListAt", "index", "(I)Ljava/lang/Object;", "getFromOldListAt", "getNewListSize", "getOldListSize", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.adapter.utils.BaseDiffUtil */
/* loaded from: classes.dex */
public abstract class BaseDiffUtil<Type> extends C1713j.AbstractC1715b {
    private List<? extends Type> newList;
    private List<? extends Type> oldList;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseDiffUtil() {
        List $r1;
        List $r12;
        $r1 = C13726r.m3891e();
        this.oldList = $r1;
        $r12 = C13726r.m3891e();
        this.newList = $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ C1713j.C1718e computeDiff$default(BaseDiffUtil baseDiffUtil, List list, List list2, boolean $z0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeDiff");
            throw $r5;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        C1713j.C1718e $r2 = baseDiffUtil.computeDiff(list, list2, $z0);
        return $r2;
    }

    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public abstract boolean areContentsTheSame(int i, int i2);

    @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
    public abstract boolean areItemsTheSame(int i, int i2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C1713j.C1718e computeDiff(List list, List list2, boolean z) {
        Log_OC.getArray(list, "oldList");
        Log_OC.getArray(list2, "newList");
        this.oldList = list;
        this.newList = list2;
        C1713j.C1718e $r1 = C1713j.m34728c(this, z);
        Log_OC.loadImage($r1, "calculateDiff(this, detectMoves)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getFromNewListAt(int i) {
        List $r1 = this.newList;
        boolean $z0 = $r1.isEmpty();
        if ($z0 || i < 0) {
            return null;
        }
        List $r12 = this.newList;
        int $i1 = $r12.size();
        if (i > $i1 - 1) {
            return null;
        }
        List $r13 = this.newList;
        Object $r2 = $r13.get(i);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getFromOldListAt(int i) {
        List $r1 = this.oldList;
        boolean $z0 = $r1.isEmpty();
        if ($z0 || i < 0) {
            return null;
        }
        List $r12 = this.oldList;
        int $i1 = $r12.size();
        if (i > $i1 - 1) {
            return null;
        }
        List $r13 = this.oldList;
        Object $r2 = $r13.get(i);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final List getNewList() {
        List r1 = this.newList;
        return r1;
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
    protected final List getOldList() {
        List r1 = this.oldList;
        return r1;
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

    protected final void setNewList(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.newList = list;
    }

    protected final void setOldList(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.oldList = list;
    }
}
