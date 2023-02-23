package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.settings.domain.useCases.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0517c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0517c f1381d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0517c $r0 = new C0517c();
        f1381d = $r0;
    }

    private /* synthetic */ C0517c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        InsuranceDetailModel $r1 = InsuranceRequests.m40755checkStatus$lambda0($r3);
        return $r1;
    }
}
