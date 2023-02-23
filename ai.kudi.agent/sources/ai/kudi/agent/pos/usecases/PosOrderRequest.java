package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TerminalApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.pos.data.PosRequest;
import ai.kudi.agent.pos.data.PosRequestV2;
import ai.kudi.agent.pos.data.PosResponse;
import ai.kudi.agent.pos.data.TrackPosResponse;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: PosOrderRequest.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0014\u001a\u00020\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/PosOrderRequest;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/pos/data/PosRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "requestPaidPos", "Lai/kudi/agent/pos/data/PosResponse;", "posRequestV2", "Lai/kudi/agent/pos/data/PosRequestV2;", "sessionId", "trackPos", "Lai/kudi/agent/pos/data/TrackPosResponse;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosOrderRequest implements OneInputUseCase<String, PosRequest> {
    private final NetworkService networkService;
    private final UserRepository userRepository;

    public PosOrderRequest(NetworkService networkService, UserRepository userRepository) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepository");
        this.networkService = networkService;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40127execute$lambda1(PosOrderRequest posOrderRequest, PosRequest posRequest, User user) {
        Log_OC.getArray(posOrderRequest, "this$0");
        Log_OC.getArray(posRequest, "$input");
        Log_OC.getArray(user, "user");
        NetworkService $r3 = posOrderRequest.getNetworkService();
        TerminalApi $r4 = $r3.getTerminalApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        AbstractC11688p $r6 = $r4.requestPOS($r5, posRequest);
        Language $r7 = Language.KOREAN;
        return $r6.m10531O($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final String m40128execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        String $r2 = (String) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestPaidPos$lambda-2  reason: not valid java name */
    public static final PosResponse m40129requestPaidPos$lambda2(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        PosResponse $r2 = (PosResponse) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: trackPos$lambda-3  reason: not valid java name */
    public static final TrackPosResponse m40130trackPos$lambda3(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r0 = c14840l.m284a();
        Log_OC.append($r0);
        TrackPosResponse $r2 = (TrackPosResponse) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final PosRequest posRequest) {
        Log_OC.getArray(posRequest, MetricTracker.Object.INPUT);
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.usecases.Frame
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosOrderRequest $r1 = PosOrderRequest.this;
                PosRequest $r2 = posRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = PosOrderRequest.m40127execute$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r52 = $r5.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r53 = $r52.R($r62);
        Log_OC.loadImage($r53, "userRepository.currentUser.flatMapObservable { user ->\n            networkService.terminalApi.requestPOS(user.sessionId, input).map { it.data }\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        PosRequest $r3 = (PosRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
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
    public final AbstractC11688p requestPaidPos(PosRequestV2 posRequestV2, String str) {
        Log_OC.getArray(posRequestV2, "posRequestV2");
        Log_OC.getArray(str, "sessionId");
        NetworkService $r3 = this.networkService;
        TerminalApi $r4 = $r3.getTerminalApi();
        AbstractC11688p $r5 = $r4.requestPosV2(str, posRequestV2);
        C0387k $r6 = C0387k.f894a;
        AbstractC11688p $r52 = $r5.m10531O($r6);
        p425j.p444e.Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r53 = $r52.h0($r7);
        p425j.p444e.Item $r72 = ContextUtils.LogError();
        AbstractC11688p $r54 = $r53.R($r72);
        Log_OC.loadImage($r54, "networkService.terminalApi.requestPosV2(sessionId, posRequestV2).map {\n            it.data\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r54;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p trackPos(String str) {
        Log_OC.getArray(str, "sessionId");
        NetworkService $r2 = this.networkService;
        TerminalApi $r3 = $r2.getTerminalApi();
        AbstractC11688p $r4 = $r3.trackPos(str);
        Vector3 $r5 = Vector3.Zero;
        AbstractC11688p $r42 = $r4.m10531O($r5);
        p425j.p444e.Item $r6 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r43 = $r42.h0($r6);
        p425j.p444e.Item $r62 = ContextUtils.LogError();
        AbstractC11688p $r44 = $r43.R($r62);
        Log_OC.loadImage($r44, "networkService.terminalApi.trackPos(sessionId).map {\n            it.body()!!\n        }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())");
        return $r44;
    }
}
