package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.InsuranceApi;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: DeactivateInsuranceUseCase.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/domain/DeactivateInsuranceUseCase;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class DeactivateInsuranceUseCase implements OneInputUseCase<InsuranceDetailModel, String> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;
    private final UserRepository userRepo;

    public DeactivateInsuranceUseCase(RxSchedulers rxSchedulers, UserRepository userRepository, NetworkService networkService) {
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(userRepository, "userRepo");
        Log_OC.getArray(networkService, "networkService");
        this.rxSchedulers = rxSchedulers;
        this.userRepo = userRepository;
        this.networkService = networkService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m40770execute$lambda1(DeactivateInsuranceUseCase deactivateInsuranceUseCase, String str, User user) {
        Log_OC.getArray(deactivateInsuranceUseCase, "this$0");
        Log_OC.getArray(str, "$input");
        Log_OC.getArray(user, "user");
        NetworkService $r3 = deactivateInsuranceUseCase.networkService;
        InsuranceApi $r4 = $r3.getInsuranceApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "user.sessionId");
        DeactivateInsuranceRequest $r6 = new DeactivateInsuranceRequest(str);
        AbstractC11688p $r7 = $r4.deactivateInsurance($r5, $r6);
        C0521b $r8 = C0521b.f1390e;
        return $r7.m10531O($r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final InsuranceDetailModel m40771execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "response");
        Object $r1 = aPIResponse.data;
        InsuranceDetailModel $r2 = (InsuranceDetailModel) $r1;
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
        UserRepository $r3 = this.userRepo;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.insurance.domain.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                DeactivateInsuranceUseCase $r1 = DeactivateInsuranceUseCase.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = DeactivateInsuranceUseCase.m40770execute$lambda1($r1, $r2, $r52);
                return $r32;
            }
        });
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r52 = $r5.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r53 = $r52.R($r72);
        Log_OC.loadImage($r53, "userRepo.currentUser.flatMapObservable { user ->\n            networkService.insuranceApi.deactivateInsurance(\n                sessionId = user.sessionId,\n                request = DeactivateInsuranceRequest(input)\n            )\n                .map { response -> response.data }\n        }.subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r53;
    }
}
