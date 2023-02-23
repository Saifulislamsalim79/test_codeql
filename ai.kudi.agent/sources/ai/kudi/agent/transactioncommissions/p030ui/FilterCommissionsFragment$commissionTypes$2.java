package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.C0001R;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13727r0;
/* compiled from: FilterCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment$commissionTypes$2 */
/* loaded from: classes.dex */
final class FilterCommissionsFragment$commissionTypes$2 extends AbstractC11802m implements InterfaceC11756a<Map<String, ? extends String>> {
    final /* synthetic */ FilterCommissionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterCommissionsFragment$commissionTypes$2(FilterCommissionsFragment filterCommissionsFragment) {
        super(0);
        this.this$0 = filterCommissionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Map<String, ? extends String> invoke() {
        Map $r1 = invoke2();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Map<String, ? extends String> invoke2() {
        Map $r5;
        FilterCommissionsFragment $r2 = this.this$0;
        String $r3 = $r2.getString(C0001R.string.all_commissions_key);
        C13287o $r4 = C13664u.m4227a($r3, "");
        FilterCommissionsFragment $r22 = this.this$0;
        String $r32 = $r22.getString(C0001R.string.commissions);
        C13287o $r42 = C13664u.m4227a($r32, "CREDIT");
        FilterCommissionsFragment $r23 = this.this$0;
        String $r33 = $r23.getString(C0001R.string.payouts);
        C13287o $r43 = C13664u.m4227a($r33, "DEBIT");
        C13287o[] $r1 = {$r4, $r42, $r43};
        $r5 = C13727r0.m3878n($r1);
        return $r5;
    }
}
