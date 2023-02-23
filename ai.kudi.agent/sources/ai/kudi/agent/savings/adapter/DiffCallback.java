package ai.kudi.agent.savings.adapter;

import ai.kudi.agent.savings.data.model.SavingTransactionUIModel;
import ai.kudi.agent.savings.data.model.SavingsItemModel;
import androidx.recyclerview.widget.C1713j;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsAdapter.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lai/kudi/agent/savings/data/model/SavingsItemModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DiffCallback extends C1713j.AbstractC1719f<SavingsItemModel> {
    public static final DiffCallback INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        DiffCallback $r0 = new DiffCallback();
        INSTANCE = $r0;
    }

    private DiffCallback() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
    public boolean areContentsTheSame2(SavingsItemModel savingsItemModel, SavingsItemModel savingsItemModel2) {
        Log_OC.getArray(savingsItemModel, "oldItem");
        Log_OC.getArray(savingsItemModel2, "newItem");
        boolean $z0 = Log_OC.append(savingsItemModel, savingsItemModel2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
    public /* bridge */ /* synthetic */ boolean areContentsTheSame(SavingsItemModel savingsItemModel, SavingsItemModel savingsItemModel2) {
        SavingsItemModel $r3 = savingsItemModel;
        SavingsItemModel $r4 = savingsItemModel2;
        boolean $z0 = areContentsTheSame2($r3, $r4);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
    public boolean areItemsTheSame2(SavingsItemModel savingsItemModel, SavingsItemModel savingsItemModel2) {
        Log_OC.getArray(savingsItemModel, "oldItem");
        Log_OC.getArray(savingsItemModel2, "newItem");
        boolean $z0 = savingsItemModel instanceof SavingsItemModel.SavingsTransaction;
        if ($z0) {
            boolean $z02 = savingsItemModel2 instanceof SavingsItemModel.SavingsTransaction;
            if ($z02) {
                SavingsItemModel.SavingsTransaction $r3 = (SavingsItemModel.SavingsTransaction) savingsItemModel;
                SavingTransactionUIModel $r4 = $r3.getTransaction();
                String $r5 = $r4.getId();
                SavingsItemModel.SavingsTransaction $r32 = (SavingsItemModel.SavingsTransaction) savingsItemModel2;
                SavingTransactionUIModel $r42 = $r32.getTransaction();
                String $r6 = $r42.getId();
                boolean $z03 = Log_OC.append($r5, $r6);
                if ($z03) {
                    return true;
                }
            }
        }
        boolean $z04 = savingsItemModel instanceof SavingsItemModel.SavingsTransactionDate;
        if ($z04) {
            boolean $z05 = savingsItemModel2 instanceof SavingsItemModel.SavingsTransactionDate;
            if ($z05) {
                SavingsItemModel.SavingsTransactionDate $r7 = (SavingsItemModel.SavingsTransactionDate) savingsItemModel;
                String $r52 = $r7.getDate();
                SavingsItemModel.SavingsTransactionDate $r72 = (SavingsItemModel.SavingsTransactionDate) savingsItemModel2;
                String $r62 = $r72.getDate();
                boolean $z06 = Log_OC.append($r52, $r62);
                return $z06;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
    public /* bridge */ /* synthetic */ boolean areItemsTheSame(SavingsItemModel savingsItemModel, SavingsItemModel savingsItemModel2) {
        SavingsItemModel $r3 = savingsItemModel;
        SavingsItemModel $r4 = savingsItemModel2;
        boolean $z0 = areItemsTheSame2($r3, $r4);
        return $z0;
    }
}
