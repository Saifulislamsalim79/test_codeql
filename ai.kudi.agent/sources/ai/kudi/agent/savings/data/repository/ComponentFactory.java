package ai.kudi.agent.savings.data.repository;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.ResetSavingPinResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ComponentFactory implements InterfaceC11291f {
    public static final /* synthetic */ ComponentFactory ROLE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ComponentFactory $r0 = new ComponentFactory();
        ROLE = $r0;
    }

    private /* synthetic */ ComponentFactory() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        ResetSavingPinResponse $r1 = ConfirmOtpRepository.m40512resetPin$lambda1($r3);
        return $r1;
    }
}
