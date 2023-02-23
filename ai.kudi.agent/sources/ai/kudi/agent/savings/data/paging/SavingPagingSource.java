package ai.kudi.agent.savings.data.paging;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.SavingTransactionItem;
import ai.kudi.agent.savings.data.worker.SavingsApi;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.AbstractC8041v0;
import p201g.p259r.C8053w0;
import p201g.p259r.p260o1.AbstractC7993c;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SavingPagingSource.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/savings/data/paging/SavingPagingSource;", "Landroidx/paging/rxjava2/RxPagingSource;", "", "Lai/kudi/agent/savings/data/model/SavingTransactionItem;", "sessionId", "", "service", "Lai/kudi/agent/savings/data/api/SavingsApi;", "planId", "(Ljava/lang/String;Lai/kudi/agent/savings/data/api/SavingsApi;Ljava/lang/String;)V", "getRefreshKey", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "loadSingle", "Lio/reactivex/Single;", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "toLoadResult", "response", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/savings/data/model/SavingTransaction;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingPagingSource extends AbstractC7993c<Integer, SavingTransactionItem> {
    private final String planId;
    private final SavingsApi service;
    private final String sessionId;

    public SavingPagingSource(String str, SavingsApi savingsApi, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(savingsApi, "service");
        this.sessionId = str;
        this.service = savingsApi;
        this.planId = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SavingPagingSource(java.lang.String r1, ai.kudi.agent.savings.data.worker.SavingsApi r2, java.lang.String r3, int r4, kotlin.p483e0.p485d.DBUtils$1 r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.data.paging.SavingPagingSource.<init>(java.lang.String, ai.kudi.agent.savings.data.worker.SavingsApi, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSingle$lambda-2  reason: not valid java name */
    public static final AbstractC8041v0.AbstractC8048b m40507loadSingle$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        AbstractC8041v0.AbstractC8048b.C8049a $r1 = new AbstractC8041v0.AbstractC8048b.C8049a(th);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSingle$lambda-3  reason: not valid java name */
    public static final AbstractC8041v0.AbstractC8048b m40508loadSingle$lambda3(Throwable th) {
        Log_OC.getArray(th, "it");
        AbstractC8041v0.AbstractC8048b.C8049a $r1 = new AbstractC8041v0.AbstractC8048b.C8049a(th);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p201g.p259r.AbstractC8041v0.AbstractC8048b toLoadResult(ai.kudi.agent.core.network.response.APIResponse r22) {
        /*
            r21 = this;
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r3 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r3 = (ai.kudi.agent.savings.data.model.SavingTransaction) r3
            r2 = r3
            java.util.List r4 = r2.getContent()
            boolean r5 = r4.isEmpty()
            r6 = 0
            if (r5 == 0) goto L17
        L15:
            r7 = 0
            goto L7b
        L17:
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r8 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r8 = (ai.kudi.agent.savings.data.model.SavingTransaction) r8
            r2 = r8
            int r9 = r2.getTotalPages()
            r10 = 1
            if (r9 != r10) goto L29
            goto L15
        L29:
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r11 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r11 = (ai.kudi.agent.savings.data.model.SavingTransaction) r11
            r2 = r11
            int r9 = r2.getCurrentPage()
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r12 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r12 = (ai.kudi.agent.savings.data.model.SavingTransaction) r12
            r2 = r12
            int r13 = r2.getTotalPages()
            if (r9 >= r13) goto L5c
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r14 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r14 = (ai.kudi.agent.savings.data.model.SavingTransaction) r14
            r2 = r14
            int r9 = r2.getCurrentPage()
            int r9 = r9 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            goto L7b
        L5c:
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r15 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r15 = (ai.kudi.agent.savings.data.model.SavingTransaction) r15
            r2 = r15
            r2.getCurrentPage()
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r16 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r16 = (ai.kudi.agent.savings.data.model.SavingTransaction) r16
            r2 = r16
            r2.getTotalPages()
            goto L15
        L7b:
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r17 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r17 = (ai.kudi.agent.savings.data.model.SavingTransaction) r17
            r2 = r17
            int r9 = r2.getCurrentPage()
            if (r9 != 0) goto L8e
            goto La4
        L8e:
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r18 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r18 = (ai.kudi.agent.savings.data.model.SavingTransaction) r18
            r2 = r18
            int r9 = r2.getCurrentPage()
            r10 = 1
            int r9 = r9 - r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
        La4:
            g.r.v0$b$b r19 = new g.r.v0$b$b
            r0 = r22
            Data r1 = r0.data
            r22 = r0
            r20 = r1
            ai.kudi.agent.savings.data.model.SavingTransaction r20 = (ai.kudi.agent.savings.data.model.SavingTransaction) r20
            r2 = r20
            java.util.List r4 = r2.getContent()
            r0 = r19
            r0.<init>(r4, r6, r7)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.savings.data.paging.SavingPagingSource.toLoadResult(ai.kudi.agent.core.network.response.APIResponse):g.r.v0$b");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p259r.AbstractC8041v0
    public Integer getRefreshKey(C8053w0 c8053w0) {
        Log_OC.getArray(c8053w0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Integer $r2 = c8053w0.m16815c();
        if ($r2 == null) {
            return null;
        }
        int $i0 = $r2.intValue();
        AbstractC8041v0.AbstractC8048b.C8050b $r3 = c8053w0.m16816b($i0);
        if ($r3 == null) {
            return null;
        }
        Object $r4 = $r3.m16825a();
        Integer $r22 = (Integer) $r4;
        Object $r42 = $r3.m16824b();
        Integer $r5 = (Integer) $r42;
        if ($r22 != null) {
            $r22.intValue();
            int $i02 = $r22.intValue();
            return Integer.valueOf($i02 + 1);
        } else if ($r5 == null) {
            return null;
        } else {
            $r5.intValue();
            int $i03 = $r5.intValue();
            return Integer.valueOf($i03 - 1);
        }
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
    public AbstractC11696w<AbstractC8041v0.AbstractC8048b<Integer, SavingTransactionItem>> loadSingle(AbstractC8041v0.AbstractC8042a<Integer> abstractC8042a) {
        Log_OC.getArray(abstractC8042a, "params");
        Object $r3 = abstractC8042a.mo16827a();
        Integer $r4 = (Integer) $r3;
        int $i0 = $r4 == null ? 0 : $r4.intValue();
        String $r5 = this.planId;
        if ($r5 == null) {
            SavingsApi $r6 = this.service;
            String $r1 = this.sessionId;
            int $i1 = abstractC8042a.m16830b();
            AbstractC11696w $r7 = $r6.retrieveSavingTransactions($r1, $i0, $i1);
            Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
            AbstractC11696w $r72 = $r7.u($r8).m10437m(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.paging.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    SavingPagingSource $r12 = SavingPagingSource.this;
                    APIResponse $r42 = (APIResponse) obj;
                    AbstractC8041v0.AbstractC8048b $r2 = $r12.toLoadResult($r42);
                    return $r2;
                }
            });
            C0463c $r10 = C0463c.f1218d;
            AbstractC11696w $r73 = $r72.m10433q($r10);
            Log_OC.loadImage($r73, "{\n                service.retrieveSavingTransactions(sessionId, nextPageNumber, params.loadSize)\n                    .subscribeOn(Schedulers.io())\n                    .map(this::toLoadResult)\n                    .onErrorReturn { LoadResult.Error(it) }\n            }");
            return $r73;
        }
        SavingsApi $r62 = this.service;
        String $r12 = this.sessionId;
        int $i12 = abstractC8042a.m16830b();
        AbstractC11696w $r74 = $r62.retrieveTransactionByPlanId($r12, $r5, $i0, $i12);
        Item $r82 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r75 = $r74.u($r82).m10437m(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.data.paging.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingPagingSource $r122 = SavingPagingSource.this;
                APIResponse $r42 = (APIResponse) obj;
                AbstractC8041v0.AbstractC8048b $r2 = $r122.toLoadResult($r42);
                return $r2;
            }
        });
        Filter $r11 = Filter.ALL;
        AbstractC11696w $r76 = $r75.m10433q($r11);
        Log_OC.loadImage($r76, "{\n                service.retrieveTransactionByPlanId(sessionId, planId, nextPageNumber, params.loadSize)\n                    .subscribeOn(Schedulers.io())\n                    .map(this::toLoadResult)\n                    .onErrorReturn { LoadResult.Error(it) }\n            }");
        return $r76;
    }
}
