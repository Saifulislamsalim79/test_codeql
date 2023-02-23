package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.pos.data.PosOrder;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetPosRequestsDetailUseCase.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/GetPosRequestsDetailUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/pos/data/PosOrder;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "schedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetPosRequestsDetailUseCase implements OneInputUseCase<PosOrder, String> {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;
    private final RxSchedulers schedulers;

    public GetPosRequestsDetailUseCase(NetworkService networkService, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(rxSchedulers, "schedulers");
        this.networkService = networkService;
        this.fetchCurrentUser = fetchCurrentUser;
        this.schedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40119execute$lambda1(GetPosRequestsDetailUseCase getPosRequestsDetailUseCase, String str, User user) {
        Log_OC.getArray(getPosRequestsDetailUseCase, "this$0");
        Log_OC.getArray(str, "$input");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = getPosRequestsDetailUseCase.getNetworkService();
        TerminalApi $r4 = $r3.getTerminalApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.posOrderDetail($r5, str);
        C0385c $r7 = C0385c.f891d;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        RxSchedulers $r8 = getPosRequestsDetailUseCase.schedulers;
        p425j.p444e.Item $r9 = $r8.setSettings();
        AbstractC11688p $r63 = $r62.h0($r9);
        RxSchedulers $r82 = getPosRequestsDetailUseCase.schedulers;
        p425j.p444e.Item $r92 = $r82.main();
        return $r63.R($r92);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final PosOrder m40120execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "response");
        Object $r1 = aPIResponse.data;
        PosOrder $r2 = (PosOrder) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        String $r3 = (String) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final String str) {
        Log_OC.getArray(str, MetricTracker.Object.INPUT);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.usecases.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetPosRequestsDetailUseCase $r1 = GetPosRequestsDetailUseCase.this;
                String $r22 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = GetPosRequestsDetailUseCase.m40119execute$lambda1($r1, $r22, $r52);
                return $r32;
            }
        });
        RxSchedulers $r6 = this.schedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r52 = $r5.h0($r7);
        RxSchedulers $r62 = this.schedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r53 = $r52.R($r72);
        Log_OC.loadImage($r53, "fetchCurrentUser.execute().flatMapObservable {\n            networkService.terminalApi.posOrderDetail(it.sessionId, input)\n                .map { response -> response.data }\n                .subscribeOn(schedulers.io())\n                .observeOn(schedulers.main())\n        }.subscribeOn(schedulers.io()).observeOn(schedulers.main())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
