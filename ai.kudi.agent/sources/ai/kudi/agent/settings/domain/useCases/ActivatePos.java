package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.settings.domain.package_4.PosActivationData;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ActivatePos.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/ActivatePos;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/settings/domain/dto/PosActivationData;", "sessionId", "", "terminalId", "updateUser", "Lai/kudi/agent/users/domain/dto/User;", "acquiringBank", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ActivatePos {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public ActivatePos(NetworkService networkService, FetchCurrentUser fetchCurrentUser, UserRepository userRepository) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(userRepository, "userRepository");
        this.networkService = networkService;
        this.fetchCurrentUser = fetchCurrentUser;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final PosActivationData m40739execute$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        PosActivationData $r2 = (PosActivationData) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUser$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40740updateUser$lambda1(ActivatePos activatePos, String str, String str2, User user) {
        Log_OC.getArray(activatePos, "this$0");
        Log_OC.getArray(str, "$terminalId");
        Log_OC.getArray(user, "it");
        UserRepository $r4 = activatePos.getUserRepository();
        User.Builder $r5 = user.toBuilder();
        User $r3 = $r5.setTerminalId(str).setMposVendor(str2).build();
        Log_OC.loadImage($r3, "it.toBuilder()\n                    .setTerminalId(terminalId)\n                    .setMposVendor(acquiringBank).build()");
        AbstractC11688p $r6 = $r4.updateUser($r3);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "terminalId");
        NetworkService $r3 = this.networkService;
        TerminalApi $r4 = $r3.getTerminalApi();
        AbstractC11688p $r5 = $r4.activatePos(str, str2);
        C0516b $r6 = C0516b.f1380e;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r7);
        p425j.p444e.Item $r72 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r54 = $r53.h0($r72);
        Log_OC.loadImage($r54, "networkService.terminalApi.activatePos(sessionId, terminalId).map {\n            it.data\n        }.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserRepository getUserRepository() {
        UserRepository r1 = this.userRepository;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p updateUser(final String str, final String str2) {
        Log_OC.getArray(str, "terminalId");
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.useCases.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ActivatePos $r1 = ActivatePos.this;
                String $r2 = str;
                String $r32 = str2;
                User $r62 = (User) obj;
                InterfaceC11692s $r42 = ActivatePos.m40740updateUser$lambda1($r1, $r2, $r32, $r62);
                return $r42;
            }
        });
        p425j.p444e.Item $r7 = ContextUtils.LogError();
        AbstractC11688p $r62 = $r6.R($r7);
        p425j.p444e.Item $r72 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r72);
        Log_OC.loadImage($r63, "fetchCurrentUser.execute().flatMapObservable {\n            userRepository.updateUser(user = it.toBuilder()\n                    .setTerminalId(terminalId)\n                    .setMposVendor(acquiringBank).build())\n        }.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())");
        return $r63;
    }
}
