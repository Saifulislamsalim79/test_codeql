package ai.kudi.agent.transactions.data.sources.remote;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements InterfaceC11291f {
    public static final /* synthetic */ Token FUNCTION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        FUNCTION = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = TransactionRemoteSource.m41091fetchTransaction$lambda1($r3);
        return $r1;
    }
}
