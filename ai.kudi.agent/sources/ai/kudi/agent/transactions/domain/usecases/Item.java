package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Item implements InterfaceC11291f {

    /* renamed from: k */
    public static final /* synthetic */ Item f1631k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Item $r0 = new Item();
        f1631k = $r0;
    }

    private /* synthetic */ Item() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        TerminalConnectionResponse $r1 = InitializeTerminalRequest.m41112execute$lambda0($r3);
        return $r1;
    }
}
