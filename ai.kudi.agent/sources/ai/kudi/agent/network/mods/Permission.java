package ai.kudi.agent.network.mods;

import p565l.C14131c0;
import p565l.InterfaceC14233u;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Permission implements InterfaceC14233u {
    public static final /* synthetic */ Permission DELETE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Permission $r0 = new Permission();
        DELETE = $r0;
    }

    private /* synthetic */ Permission() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p565l.InterfaceC14233u
    public final C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) {
        C14131c0 $r1 = MarketplaceServiceModule.m39825authInterceptor$lambda2(interfaceC14234a);
        return $r1;
    }
}
