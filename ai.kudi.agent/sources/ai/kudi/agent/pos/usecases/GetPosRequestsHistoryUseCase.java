package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.pos.data.PosOrder;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetPosRequestsHistoryUseCase.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/GetPosRequestsHistoryUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/pos/data/PosOrder;", "Lai/kudi/agent/pos/usecases/GetPosRequestsHistoryRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "schedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetPosRequestsHistoryUseCase implements OneInputUseCase<List<? extends PosOrder>, GetPosRequestsHistoryRequest> {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;
    private final RxSchedulers schedulers;

    /* compiled from: GetPosRequestsHistoryUseCase.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            PosFilterType[] $r0 = PosFilterType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            PosFilterType $r2 = PosFilterType.ASSIGNED;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            PosFilterType $r22 = PosFilterType.UNASSIGNED;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            PosFilterType $r23 = PosFilterType.type;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    public GetPosRequestsHistoryUseCase(NetworkService networkService, FetchCurrentUser fetchCurrentUser, RxSchedulers rxSchedulers) {
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
    public static final InterfaceC11692s m40122execute$lambda1(GetPosRequestsHistoryUseCase getPosRequestsHistoryUseCase, HashMap hashMap, User user) {
        Log_OC.getArray(getPosRequestsHistoryUseCase, "this$0");
        Log_OC.getArray(hashMap, "$params");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = getPosRequestsHistoryUseCase.networkService;
        TerminalApi $r4 = $r3.getTerminalApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.posRequestHistory($r5, hashMap);
        ClassWriter $r7 = ClassWriter.f883b;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        RxSchedulers $r8 = getPosRequestsHistoryUseCase.schedulers;
        p425j.p444e.Item $r9 = $r8.setSettings();
        AbstractC11688p $r63 = $r62.h0($r9);
        RxSchedulers $r82 = getPosRequestsHistoryUseCase.schedulers;
        p425j.p444e.Item $r92 = $r82.main();
        return $r63.R($r92);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final List m40123execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "response");
        Object $r1 = aPIResponse.data;
        List $r2 = (List) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(GetPosRequestsHistoryRequest getPosRequestsHistoryRequest) {
        final HashMap $r5;
        Log_OC.getArray(getPosRequestsHistoryRequest, MetricTracker.Object.INPUT);
        String $r3 = getPosRequestsHistoryRequest.getFrom();
        C13287o $r4 = C13664u.m4227a("from", $r3);
        String $r32 = getPosRequestsHistoryRequest.getTo();
        C13287o $r42 = C13664u.m4227a("to", $r32);
        String $r33 = getPosRequestsHistoryRequest.getPhoneNumber();
        C13287o $r43 = C13664u.m4227a("phoneNumber", $r33);
        int $i0 = getPosRequestsHistoryRequest.getPage();
        String $r34 = String.valueOf($i0);
        C13287o $r44 = C13664u.m4227a("page", $r34);
        C13287o[] $r2 = {$r4, $r42, $r43, $r44};
        $r5 = C13727r0.m3879m($r2);
        PosFilterType $r6 = getPosRequestsHistoryRequest.getFilterType();
        int[] $r7 = WhenMappings.$EnumSwitchMapping$0;
        int $i02 = $r6.ordinal();
        int $i03 = $r7[$i02];
        if ($i03 == 1) {
            $r5.put("used", "true");
        } else if ($i03 == 2) {
            $r5.put("used", "false");
        }
        FetchCurrentUser $r8 = this.fetchCurrentUser;
        AbstractC11696w $r9 = FetchCurrentUser.execute$default($r8, null, null, 3, null);
        AbstractC11688p $r11 = $r9.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.usecases.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetPosRequestsHistoryUseCase $r1 = GetPosRequestsHistoryUseCase.this;
                HashMap $r22 = $r5;
                User $r52 = (User) obj;
                InterfaceC11692s $r35 = GetPosRequestsHistoryUseCase.m40122execute$lambda1($r1, $r22, $r52);
                return $r35;
            }
        });
        RxSchedulers $r12 = this.schedulers;
        p425j.p444e.Item $r13 = $r12.setSettings();
        AbstractC11688p $r112 = $r11.h0($r13);
        RxSchedulers $r122 = this.schedulers;
        p425j.p444e.Item $r132 = $r122.main();
        AbstractC11688p $r113 = $r112.R($r132);
        Log_OC.loadImage($r113, "fetchCurrentUser.execute().flatMapObservable {\n            networkService.terminalApi.posRequestHistory(it.sessionId, params)\n                .map { response -> response.data }\n                .subscribeOn(schedulers.io())\n                .observeOn(schedulers.main())\n        }.subscribeOn(schedulers.io()).observeOn(schedulers.main())");
        return $r113;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        GetPosRequestsHistoryRequest $r3 = (GetPosRequestsHistoryRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
