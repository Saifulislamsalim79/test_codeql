package ai.kudi.agent.kshock.paging;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanHistoryResponse;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import p201g.p259r.AbstractC8041v0;
import p201g.p259r.C8053w0;
import p201g.p259r.p260o1.AbstractC7993c;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: LoanHistoryPagingSource.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/kshock/paging/LoanHistoryPagingSource;", "Landroidx/paging/rxjava2/RxPagingSource;", "", "Lai/kudi/agent/kshock/data/model/Loan;", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "sessionId", "", "query", "", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/schedulers/RxSchedulers;Ljava/lang/String;Ljava/util/Map;)V", "getNextKey", "position", "apiPagedData", "Lai/kudi/agent/kshock/data/model/LoanHistoryResponse;", "(ILai/kudi/agent/kshock/data/model/LoanHistoryResponse;)Ljava/lang/Integer;", "getRefreshKey", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "loadSingle", "Lio/reactivex/Single;", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "toLoadResult", TransactionBreakDownItemType.DATA, "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanHistoryPagingSource extends AbstractC7993c<Integer, Loan> {
    public static final Companion Companion;
    public static final int NETWORK_PAGE_SIZE = 15;
    private static final int STARTING_PAGE_INDEX = 0;
    private final KshockApi kshockApi;
    private final Map<String, String> query;
    private final RxSchedulers rxSchedulers;
    private final String sessionId;

    /* compiled from: LoanHistoryPagingSource.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/kshock/paging/LoanHistoryPagingSource$Companion;", "", "()V", "NETWORK_PAGE_SIZE", "", "STARTING_PAGE_INDEX", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public LoanHistoryPagingSource(KshockApi kshockApi, RxSchedulers rxSchedulers, String str, Map map) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(map, "query");
        this.kshockApi = kshockApi;
        this.rxSchedulers = rxSchedulers;
        this.sessionId = str;
        this.query = map;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer getNextKey(int r8, ai.kudi.agent.kshock.data.model.LoanHistoryResponse r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L5
        L3:
            r1 = 0
            goto L13
        L5:
            ai.kudi.agent.kshock.data.model.MetaData r2 = r9.getMeta()
            if (r2 != 0) goto Lc
            goto L3
        Lc:
            int r3 = r2.getTotalPages()
            if (r8 != r3) goto L3
            r1 = 1
        L13:
            if (r1 != 0) goto L31
            if (r9 != 0) goto L19
            r4 = 0
            goto L1d
        L19:
            java.util.List r4 = r9.getData()
        L1d:
            if (r4 == 0) goto L25
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L26
        L25:
            r0 = 1
        L26:
            if (r0 == 0) goto L2a
            r5 = 0
            return r5
        L2a:
            int r8 = r8 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            return r6
        L31:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.paging.LoanHistoryPagingSource.getNextKey(int, ai.kudi.agent.kshock.data.model.LoanHistoryResponse):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSingle$lambda-1  reason: not valid java name */
    public static final AbstractC8041v0.AbstractC8048b m39563loadSingle$lambda1(LoanHistoryPagingSource loanHistoryPagingSource, int i, LoanHistoryResponse loanHistoryResponse) {
        Log_OC.getArray(loanHistoryPagingSource, "this$0");
        Log_OC.getArray(loanHistoryResponse, "it");
        AbstractC8041v0.AbstractC8048b $r1 = loanHistoryPagingSource.toLoadResult(loanHistoryResponse, i);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSingle$lambda-2  reason: not valid java name */
    public static final AbstractC8041v0.AbstractC8048b m39564loadSingle$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        AbstractC8041v0.AbstractC8048b.C8049a $r1 = new AbstractC8041v0.AbstractC8048b.C8049a(th);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC8041v0.AbstractC8048b toLoadResult(LoanHistoryResponse loanHistoryResponse, int i) {
        List $r3 = loanHistoryResponse == null ? null : loanHistoryResponse.getData();
        if ($r3 == null) {
            $r3 = C13726r.m3891e();
        }
        Integer $r4 = getNextKey(i, loanHistoryResponse);
        AbstractC8041v0.AbstractC8048b.C8050b $r1 = new AbstractC8041v0.AbstractC8048b.C8050b($r3, null, $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.AbstractC8041v0
    public Integer getRefreshKey(C8053w0 c8053w0) {
        Log_OC.getArray(c8053w0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.AbstractC8041v0
    public /* bridge */ /* synthetic */ Object getRefreshKey(C8053w0 c8053w0) {
        Integer $r1 = getRefreshKey(c8053w0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.p260o1.AbstractC7993c
    public AbstractC11696w<AbstractC8041v0.AbstractC8048b<Integer, Loan>> loadSingle(AbstractC8041v0.AbstractC8042a<Integer> abstractC8042a) {
        Map $r4;
        Log_OC.getArray(abstractC8042a, "params");
        Object $r2 = abstractC8042a.mo16827a();
        Integer $r3 = (Integer) $r2;
        final int $i0 = $r3 == null ? 0 : $r3.intValue();
        $r4 = C13727r0.m3868x(this.query);
        String $r5 = String.valueOf($i0);
        $r4.put("page", $r5);
        $r4.put("pageSize", "15");
        KshockApi $r6 = this.kshockApi;
        String $r52 = this.sessionId;
        AbstractC11696w $r7 = $r6.fetchLoanHistory($r52, $r4);
        AbstractC11696w $r72 = $r7.m10437m(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.paging.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoanHistoryPagingSource $r1 = LoanHistoryPagingSource.this;
                int $i02 = $i0;
                LoanHistoryResponse $r42 = (LoanHistoryResponse) obj;
                AbstractC8041v0.AbstractC8048b $r22 = LoanHistoryPagingSource.m39563loadSingle$lambda1($r1, $i02, $r42);
                return $r22;
            }
        });
        RxSchedulers $r9 = this.rxSchedulers;
        Item $r10 = $r9.setSettings();
        AbstractC11696w $r73 = $r72.u($r10);
        Filter $r11 = Filter.ALL;
        AbstractC11696w $r74 = $r73.m10433q($r11);
        Log_OC.loadImage($r74, "kshockApi.fetchLoanHistory(sessionId, queryWithPage).map {\n            toLoadResult(it, position)\n        }.subscribeOn(rxSchedulers.io()).onErrorReturn {\n            LoadResult.Error(it)\n        }");
        return $r74;
    }
}
