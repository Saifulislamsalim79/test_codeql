package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.savings.data.paging.SavingPagingSource;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import p201g.p259r.AbstractC8041v0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SavingsRepository.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroidx/paging/PagingSource;", "", "Lai/kudi/agent/savings/data/model/SavingTransactionItem;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsRepository$getSavingsTransactionById$1 extends AbstractC11802m implements InterfaceC11756a<AbstractC8041v0<Integer, SavingTransactionItem>> {
    final /* synthetic */ String $planId;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ SavingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$getSavingsTransactionById$1(String str, SavingsRepository savingsRepository, String str2) {
        super(0);
        this.$sessionId = str;
        this.this$0 = savingsRepository;
        this.$planId = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final AbstractC8041v0<Integer, SavingTransactionItem> invoke() {
        String $r2 = this.$sessionId;
        SavingsRepository $r5 = this.this$0;
        SavingsApi $r4 = $r5.savingsService;
        String $r3 = this.$planId;
        AbstractC8041v0 r6 = new SavingPagingSource($r2, $r4, $r3);
        AbstractC8041v0 r7 = r6;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AbstractC8041v0<Integer, SavingTransactionItem> invoke2() {
        AbstractC8041v0 $r1 = invoke();
        return $r1;
    }
}
