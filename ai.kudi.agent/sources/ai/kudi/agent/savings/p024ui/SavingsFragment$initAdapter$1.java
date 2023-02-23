package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.savings.adapter.SavingsAdapter;
import ai.kudi.agent.savings.databinding.FragmentSavingsBinding;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.AbstractC8061y;
import p201g.p259r.C7825a0;
import p201g.p259r.C7904j;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SavingsFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroidx/paging/CombinedLoadStates;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsFragment$initAdapter$1 */
/* loaded from: classes.dex */
public final class SavingsFragment$initAdapter$1 extends AbstractC11802m implements InterfaceC11767l<C7904j, C13666w> {
    final /* synthetic */ SavingsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsFragment$initAdapter$1(SavingsFragment savingsFragment) {
        super(1);
        this.this$0 = savingsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(C7904j c7904j) {
        C7904j $r2 = c7904j;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C7904j c7904j) {
        Log_OC.getArray(c7904j, "it");
        C7825a0 $r2 = c7904j.m17081c();
        AbstractC8061y $r3 = $r2.m17216g();
        boolean $z0 = $r3 instanceof AbstractC8061y.C8064c;
        if ($z0) {
            AbstractC8061y $r32 = c7904j.m17083a();
            boolean $z02 = $r32.m16805a();
            if ($z02) {
                SavingsFragment $r4 = this.this$0;
                SavingsAdapter $r5 = $r4.getAdapter();
                int $i0 = $r5.getItemCount();
                if ($i0 < 1) {
                    SavingsFragment $r42 = this.this$0;
                    InterfaceC8209a $r6 = $r42.requireBinding();
                    FragmentSavingsBinding $r7 = (FragmentSavingsBinding) $r6;
                    RecyclerView $r8 = $r7.rvSavingsTransactionView;
                    Log_OC.loadImage($r8, "requireBinding().rvSavingsTransactionView");
                    ViewExtKt.hide$default($r8, false, 1, null);
                    SavingsFragment $r43 = this.this$0;
                    InterfaceC8209a $r62 = $r43.requireBinding();
                    FragmentSavingsBinding $r72 = (FragmentSavingsBinding) $r62;
                    TextView $r9 = $r72.tvNoTransaction;
                    Log_OC.loadImage($r9, "requireBinding().tvNoTransaction");
                    ViewExtKt.show($r9);
                    return;
                }
            }
        }
        SavingsFragment $r44 = this.this$0;
        InterfaceC8209a $r63 = $r44.requireBinding();
        FragmentSavingsBinding $r73 = (FragmentSavingsBinding) $r63;
        TextView $r92 = $r73.tvNoTransaction;
        Log_OC.loadImage($r92, "requireBinding().tvNoTransaction");
        ViewExtKt.hide$default($r92, false, 1, null);
    }
}
