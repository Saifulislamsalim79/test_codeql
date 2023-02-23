package ai.kudi.agent.settings.insurance.domain;

import ai.kudi.agent.core.network.InsuranceApi;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.NoInputUseCase;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: GetInsuranceDetailsUseCase.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/domain/GetInsuranceDetailsUseCase;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "Lai/kudi/agent/settings/insurance/data/InsuranceDetailModel;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "(Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/network/NetworkService;)V", "execute", "Lio/reactivex/Observable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class GetInsuranceDetailsUseCase implements NoInputUseCase<InsuranceDetailModel> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;
    private final UserRepository userRepo;

    public GetInsuranceDetailsUseCase(RxSchedulers rxSchedulers, UserRepository userRepository, NetworkService networkService) {
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
    public static final InterfaceC11692s m40773execute$lambda1(GetInsuranceDetailsUseCase getInsuranceDetailsUseCase, User user) {
        Log_OC.getArray(getInsuranceDetailsUseCase, "this$0");
        Log_OC.getArray(user, "user");
        NetworkService $r2 = getInsuranceDetailsUseCase.networkService;
        InsuranceApi $r3 = $r2.getInsuranceApi();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "user.sessionId");
        AbstractC11688p $r5 = $r3.checkStatus($r4);
        C0522c $r6 = C0522c.f1391d;
        return $r5.m10531O($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-1$lambda-0  reason: not valid java name */
    public static final InsuranceDetailModel m40774execute$lambda1$lambda0(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "response");
        Object $r1 = aPIResponse.data;
        InsuranceDetailModel $r2 = (InsuranceDetailModel) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        UserRepository $r1 = this.userRepo;
        AbstractC11696w $r2 = $r1.getCurrentUser();
        AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.insurance.domain.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                GetInsuranceDetailsUseCase $r12 = GetInsuranceDetailsUseCase.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = GetInsuranceDetailsUseCase.m40773execute$lambda1($r12, $r42);
                return $r22;
            }
        });
        RxSchedulers $r5 = this.rxSchedulers;
        p425j.p444e.Item $r6 = $r5.setSettings();
        AbstractC11688p $r42 = $r4.h0($r6);
        RxSchedulers $r52 = this.rxSchedulers;
        p425j.p444e.Item $r62 = $r52.main();
        AbstractC11688p $r43 = $r42.R($r62);
        Log_OC.loadImage($r43, "userRepo.currentUser.flatMapObservable { user ->\n            networkService.insuranceApi.checkStatus(user.sessionId)\n                .map { response -> response.data }\n        }.subscribeOn(rxSchedulers.io())\n            .observeOn(rxSchedulers.main())");
        return $r43;
    }
}
