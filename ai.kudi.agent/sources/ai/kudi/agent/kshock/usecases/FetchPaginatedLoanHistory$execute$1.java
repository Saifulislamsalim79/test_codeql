package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.paging.LoanHistoryPagingSource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import p201g.p259r.AbstractC8041v0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FetchPaginatedLoanHistory.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroidx/paging/PagingSource;", "", "Lai/kudi/agent/kshock/data/model/Loan;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchPaginatedLoanHistory$execute$1 extends AbstractC11802m implements InterfaceC11756a<AbstractC8041v0<Integer, Loan>> {
    final /* synthetic */ Map<String, String> $query;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ FetchPaginatedLoanHistory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPaginatedLoanHistory$execute$1(FetchPaginatedLoanHistory fetchPaginatedLoanHistory, String str, Map map) {
        super(0);
        this.this$0 = fetchPaginatedLoanHistory;
        this.$sessionId = str;
        this.$query = map;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final AbstractC8041v0<Integer, Loan> invoke() {
        FetchPaginatedLoanHistory $r4 = this.this$0;
        KshockApi $r5 = $r4.kshockApi;
        FetchPaginatedLoanHistory $r42 = this.this$0;
        RxSchedulers $r6 = $r42.rxSchedulers;
        String $r2 = this.$sessionId;
        Map $r3 = this.$query;
        AbstractC8041v0 r7 = new LoanHistoryPagingSource($r5, $r6, $r2, $r3);
        AbstractC8041v0 r8 = r7;
        return r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AbstractC8041v0<Integer, Loan> invoke2() {
        AbstractC8041v0 $r1 = invoke();
        return $r1;
    }
}
