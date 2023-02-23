package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.domain.api.KshockApi;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class GetWalletUseCase_Factory implements InterfaceC9468d<GetWalletUseCase> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<KshockApi> kshockApiProvider;

    public GetWalletUseCase_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kshockApiProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetWalletUseCase_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        GetWalletUseCase_Factory $r2 = new GetWalletUseCase_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static GetWalletUseCase newInstance(ai.kudi.agent.kshock.data.domain.attention.KshockApi kshockApi, FetchCurrentUser fetchCurrentUser) {
        GetWalletUseCase $r2 = new GetWalletUseCase(kshockApi, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public GetWalletUseCase multiply() {
        InterfaceC11700a $r1 = this.kshockApiProvider;
        Object $r2 = $r1.get();
        ai.kudi.agent.kshock.data.domain.attention.KshockApi $r3 = (ai.kudi.agent.kshock.data.domain.attention.KshockApi) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        GetWalletUseCase $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39693multiply() {
        GetWalletUseCase $r1 = multiply();
        return $r1;
    }
}
