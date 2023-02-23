package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.WithdrawResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Session implements InterfaceC11291f {
    public static final /* synthetic */ Session sInstance;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Session $r0 = new Session();
        sInstance = $r0;
    }

    private /* synthetic */ Session() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        WithdrawResponse $r1 = Withdraw.m40587withdraw$lambda1($r3);
        return $r1;
    }
}
