package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.transactions.domain.dto.AllWallets;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetAllWalletsUseCase.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/transactions/domain/usecases/GetAllWalletsUseCase;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "Lai/kudi/agent/transactions/domain/dto/AllWallets;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetAllWalletsUseCase implements NoInputUseCase<AllWallets> {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;

    public GetAllWalletsUseCase(NetworkService networkService, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.networkService = networkService;
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41105execute$lambda1(GetAllWalletsUseCase getAllWalletsUseCase, User user) {
        Log_OC.getArray(getAllWalletsUseCase, "this$0");
        Log_OC.getArray(user, "user");
        NetworkService $r2 = getAllWalletsUseCase.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "user.sessionId");
        AbstractC11688p $r5 = $r3.getAllWallets($r4);
        Language $r6 = Language.JAPANESE;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        return $r53.R($r72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final AllWallets m41106execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        AllWallets $r2 = (AllWallets) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.domain.usecases.Frame
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetAllWalletsUseCase $r12 = GetAllWalletsUseCase.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = GetAllWalletsUseCase.m41105execute$lambda1($r12, $r42);
                return $r22;
            }
        });
        p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        p425j.p444e.Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r43 = $r42.R($r52);
        Log_OC.loadImage($r43, "fetchCurrentUser.execute().flatMapObservable { user ->\n            networkService.api.getAllWallets(user.sessionId).map { it.data }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())\n        }.subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r43;
    }
}
