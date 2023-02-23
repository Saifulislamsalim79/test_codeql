package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Type implements InterfaceC11291f {
    public static final /* synthetic */ Type RSTRING;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        RSTRING = $r0;
    }

    private /* synthetic */ Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        UserProfileResponse $r1 = SwitchCustomerType.m40776execute$lambda0($r3);
        return $r1;
    }
}
