package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.C0001R;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: HomeFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment$textToBold$2 */
/* loaded from: classes.dex */
final class HomeFragment$textToBold$2 extends AbstractC11802m implements InterfaceC11756a<String> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$textToBold$2(HomeFragment homeFragment) {
        super(0);
        this.this$0 = homeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ String invoke() {
        String $r1 = invoke2();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2() {
        Fragment $r2 = this.this$0;
        Fragment r3 = $r2;
        String $r1 = r3.getString(C0001R.string.k_shock_);
        return $r1;
    }
}
