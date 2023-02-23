package ai.kudi.agent.savings.adapter;

import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.p024ui.SavingsDetailFragment;
import ai.kudi.agent.savings.p024ui.SavingsFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: DetailAndTransactionAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/savings/adapter/DetailAndTransactionAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentManager;", "lifeCycle", "Landroidx/lifecycle/Lifecycle;", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", KudiPin.KUDI_PIN_TITLE, "", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Lai/kudi/agent/savings/data/model/SavingResponse;[Ljava/lang/String;)V", "[Ljava/lang/String;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DetailAndTransactionAdapter extends FragmentStateAdapter {
    private final SavingResponse savingResponse;
    private final String[] title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAndTransactionAdapter(FragmentManager fragmentManager, AbstractC1565i abstractC1565i, SavingResponse savingResponse, String[] strArr) {
        super(fragmentManager, abstractC1565i);
        Log_OC.getArray(fragmentManager, "fragmentActivity");
        Log_OC.getArray(abstractC1565i, "lifeCycle");
        Log_OC.getArray(savingResponse, "savingResponse");
        Log_OC.getArray(strArr, KudiPin.KUDI_PIN_TITLE);
        this.savingResponse = savingResponse;
        this.title = strArr;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i) {
        if (i == 0) {
            SavingsDetailFragment.Companion $r1 = SavingsDetailFragment.Companion;
            SavingResponse $r2 = this.savingResponse;
            SavingsDetailFragment $r3 = $r1.newInstance($r2);
            return $r3;
        } else if (i != 1) {
            SavingsDetailFragment.Companion $r12 = SavingsDetailFragment.Companion;
            SavingResponse $r22 = this.savingResponse;
            SavingsDetailFragment $r32 = $r12.newInstance($r22);
            return $r32;
        } else {
            SavingsFragment.Companion $r4 = SavingsFragment.Companion;
            SavingResponse $r23 = this.savingResponse;
            String $r5 = $r23.getId();
            SavingsFragment $r6 = $r4.newInstance($r5);
            return $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        String[] $r1 = this.title;
        int $i0 = $r1.length;
        return $i0;
    }
}
