package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.ReferralApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.referral.AgentReferralModel;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: CreateAgentReferral.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/referral/domain/usecase/BuzzReferredAgent;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/referral/AgentReferralModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "body", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BuzzReferredAgent implements OneInputUseCase<AgentReferralModel, AgentReferralModel> {
    private final FetchCurrentUser fetchCurrentUser;
    private final NetworkService networkService;

    public BuzzReferredAgent(FetchCurrentUser fetchCurrentUser, NetworkService networkService) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(networkService, "networkService");
        this.fetchCurrentUser = fetchCurrentUser;
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40237execute$lambda2(BuzzReferredAgent buzzReferredAgent, final AgentReferralModel agentReferralModel, User user) {
        Log_OC.getArray(buzzReferredAgent, "this$0");
        Log_OC.getArray(agentReferralModel, "$body");
        Log_OC.getArray(user, "user");
        NetworkService $r3 = buzzReferredAgent.networkService;
        ReferralApi $r4 = $r3.getReferralApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        AbstractC11688p $r6 = $r4.buzzReferredAgent($r5, agentReferralModel);
        C0412c $r7 = C0412c.f962d;
        AbstractC11688p $r62 = $r6.m10531O($r7);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r63 = $r62.h0($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        return $r63.R($r82).m10526T(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.domain.usecase.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                AgentReferralModel $r1 = AgentReferralModel.this;
                Throwable $r32 = (Throwable) obj;
                return BuzzReferredAgent.m40239execute$lambda2$lambda1($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-2$lambda-0  reason: not valid java name */
    public static final AgentReferralModel m40238execute$lambda2$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        AgentReferralModel $r2 = (AgentReferralModel) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-2$lambda-1  reason: not valid java name */
    public static final AgentReferralModel m40239execute$lambda2$lambda1(AgentReferralModel agentReferralModel, Throwable th) {
        Log_OC.getArray(agentReferralModel, "$body");
        Log_OC.getArray(th, "it");
        String $r0 = agentReferralModel.getReferredPhone();
        AgentReferralModel $r3 = new AgentReferralModel("Omolara", $r0, "Adejuwon", "Active");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final AgentReferralModel agentReferralModel) {
        Log_OC.getArray(agentReferralModel, "body");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.referral.domain.usecase.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                BuzzReferredAgent $r1 = BuzzReferredAgent.this;
                AgentReferralModel $r22 = agentReferralModel;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = BuzzReferredAgent.m40237execute$lambda2($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().flatMapObservable { user ->\n            networkService.referralApi.buzzReferredAgent(user.sessionId, body).map {\n                it.data\n            }.subscribeOn(Schedulers.io())\n                    .observeOn(AndroidSchedulers.mainThread())\n                    .onErrorReturn {\n                        AgentReferralModel(\"Omolara\", body.referredPhone, \"Adejuwon\", \"Active\")\n                    }\n        }");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        AgentReferralModel $r3 = (AgentReferralModel) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
