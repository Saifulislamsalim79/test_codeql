package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.login.domain.wiki.LoginResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Type implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ Type f1866b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        f1866b = $r0;
    }

    private /* synthetic */ Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        LoginResponse $r3 = (LoginResponse) obj;
        AuthorizeOps $r1 = Authorize.m41423execute$lambda0($r3);
        return $r1;
    }
}
