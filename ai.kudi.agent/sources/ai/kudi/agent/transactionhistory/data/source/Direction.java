package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.domain.dto.AllWallets;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Direction implements InterfaceC11291f {

    /* renamed from: E */
    public static final /* synthetic */ Direction f1566E;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Direction $r0 = new Direction();
        f1566E = $r0;
    }

    private /* synthetic */ Direction() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        AllWallets $r1 = TransactionsRemoteDataSource.m41009transactionsSummary$lambda13($r3);
        return $r1;
    }
}
