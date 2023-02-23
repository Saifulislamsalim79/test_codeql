package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Quaternion implements InterfaceC11291f {

    /* renamed from: J */
    public static final /* synthetic */ Quaternion f1222J;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Quaternion $r0 = new Quaternion();
        f1222J = $r0;
    }

    private /* synthetic */ Quaternion() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = SavingsRepository.m40515fetchAllSavings$lambda3($r3);
        return $r1;
    }
}
