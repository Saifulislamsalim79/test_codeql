package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.users.domain.package_1.SavingPinValidationResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.users.domain.usecases.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0671c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0671c f1870d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0671c $r0 = new C0671c();
        f1870d = $r0;
    }

    private /* synthetic */ C0671c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        SavingPinValidationResponse $r1 = AuthorizeSavings.m41426authorizePin$lambda1($r3);
        return $r1;
    }
}
