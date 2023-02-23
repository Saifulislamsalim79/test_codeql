package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.settings.insurance.domain.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0521b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0521b f1390e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0521b $r0 = new C0521b();
        f1390e = $r0;
    }

    private /* synthetic */ C0521b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        InsuranceDetailModel $r1 = DeactivateInsuranceUseCase.m40771execute$lambda1$lambda0($r3);
        return $r1;
    }
}
