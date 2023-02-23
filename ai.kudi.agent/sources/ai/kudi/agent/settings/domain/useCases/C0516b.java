package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.settings.domain.package_4.PosActivationData;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.settings.domain.useCases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0516b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0516b f1380e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0516b $r0 = new C0516b();
        f1380e = $r0;
    }

    private /* synthetic */ C0516b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        PosActivationData $r1 = ActivatePos.m40739execute$lambda0($r3);
        return $r1;
    }
}
