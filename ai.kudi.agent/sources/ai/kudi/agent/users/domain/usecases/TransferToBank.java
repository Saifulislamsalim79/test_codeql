package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.WithdrawToBankRequest;
import ai.kudi.agent.users.domain.dto.WithdrawToBankResponse;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: TransferToBank.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/TransferToBank;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/WithdrawToBankResponse;", "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepository", "Lai/kudi/agent/users/data/repositories/UserRepository;", "deviceInformation", "Lai/kudi/agent/core/data/DeviceInformation;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/data/DeviceInformation;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "getUserRepository", "()Lai/kudi/agent/users/data/repositories/UserRepository;", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBank implements OneInputUseCase<WithdrawToBankResponse, WithdrawToBankRequest> {
    private final DeviceInformation deviceInformation;
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;
    private final UserRepository userRepository;

    public TransferToBank(NetworkService networkService, UserRepository userRepository, DeviceInformation deviceInformation, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepository");
        Log_OC.getArray(deviceInformation, "deviceInformation");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.userRepository = userRepository;
        this.deviceInformation = deviceInformation;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41453execute$lambda0(TransferToBank transferToBank, ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest withdrawToBankRequest, User user) {
        Log_OC.getArray(transferToBank, "this$0");
        Log_OC.getArray(withdrawToBankRequest, "$request");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = transferToBank.getNetworkService();
        AddNoteCommand $r4 = $r3.getApi();
        DeviceInformation $r5 = transferToBank.deviceInformation;
        String $r6 = $r5.getDeviceId();
        String $r7 = user.getSessionId();
        Log_OC.loadImage($r7, "it.sessionId");
        AbstractC11688p $r8 = $r4.postWithdrawalToBank($r6, $r7, withdrawToBankRequest);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest withdrawToBankRequest) {
        Log_OC.getArray(withdrawToBankRequest, TransactionRequest.TYPE_REQUEST);
        UserRepository $r3 = this.userRepository;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransferToBank $r1 = TransferToBank.this;
                ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest $r2 = withdrawToBankRequest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = TransferToBank.m41453execute$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r52 = $r5.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r53 = $r52.R($r72);
        Log_OC.loadImage($r53, "userRepository.currentUser\n            .flatMapObservable {\n                networkService.api.postWithdrawalToBank(\n                    deviceInformation.deviceId,\n                    it.sessionId, request\n                )\n            }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r53;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest $r3 = (ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest) obj;
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
}
