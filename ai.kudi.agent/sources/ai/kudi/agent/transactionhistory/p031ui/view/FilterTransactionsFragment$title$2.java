package ai.kudi.agent.transactionhistory.p031ui.view;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterTransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment$title$2 */
/* loaded from: classes.dex */
public final class FilterTransactionsFragment$title$2 extends AbstractC11802m implements InterfaceC11756a<String> {
    final /* synthetic */ FilterTransactionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTransactionsFragment$title$2(FilterTransactionsFragment filterTransactionsFragment) {
        super(0);
        this.this$0 = filterTransactionsFragment;
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
        FilterTransactionsFragment $r1 = this.this$0;
        Bundle $r2 = $r1.requireArguments();
        String $r3 = $r2.getString("BUNDLE_KEY_TITLE", "");
        return $r3;
    }
}
