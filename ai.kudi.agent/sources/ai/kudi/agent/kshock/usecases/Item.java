package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.PendingLoan;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Item implements InterfaceC11291f {

    /* renamed from: k */
    public static final /* synthetic */ Item f600k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Item $r0 = new Item();
        f600k = $r0;
    }

    private /* synthetic */ Item() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        PendingLoan $r3 = (PendingLoan) obj;
        Loan $r1 = FetchPendingLoan.m39690execute$lambda0($r3);
        return $r1;
    }
}
