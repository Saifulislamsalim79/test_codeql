package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.data.DeviceInformation;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.TransactionApi;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.TransferRequest;
import ai.kudi.agent.users.domain.dto.TransferResponse;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SubmitMultipleTransferRequest.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/bills/domain/usecases/SubmitMultipleTransferRequest;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/TransferResponse;", "", "Lai/kudi/agent/users/domain/dto/TransferRequest;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "deviceInformation", "Lai/kudi/agent/core/data/DeviceInformation;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/users/data/repositories/UserRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;Lai/kudi/agent/core/data/DeviceInformation;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubmitMultipleTransferRequest implements OneInputUseCase<TransferResponse, List<? extends TransferRequest>> {
    private final DeviceInformation deviceInformation;
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;
    private final UserRepository userRepo;

    public SubmitMultipleTransferRequest(NetworkService networkService, UserRepository userRepository, RxSchedulers rxSchedulers, DeviceInformation deviceInformation) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(userRepository, "userRepo");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        Log_OC.getArray(deviceInformation, "deviceInformation");
        this.networkService = networkService;
        this.userRepo = userRepository;
        this.rxSchedulers = rxSchedulers;
        this.deviceInformation = deviceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39036execute$lambda0(SubmitMultipleTransferRequest submitMultipleTransferRequest, List list, User user) {
        Log_OC.getArray(submitMultipleTransferRequest, "this$0");
        Log_OC.getArray(list, "$input");
        Log_OC.getArray(user, "it");
        NetworkService $r3 = submitMultipleTransferRequest.networkService;
        TransactionApi $r4 = $r3.getTransactionApi();
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        DeviceInformation $r6 = submitMultipleTransferRequest.deviceInformation;
        String $r7 = $r6.getDeviceId();
        AbstractC11688p $r8 = $r4.postMultipleTransfer($r5, list, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        List $r3 = (List) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final List list) {
        Log_OC.getArray(list, MetricTracker.Object.INPUT);
        UserRepository $r3 = this.userRepo;
        AbstractC11696w $r4 = $r3.getCurrentUser();
        AbstractC11688p $r5 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.domain.usecases.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SubmitMultipleTransferRequest $r1 = SubmitMultipleTransferRequest.this;
                List $r2 = list;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = SubmitMultipleTransferRequest.m39036execute$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r52 = $r5.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r53 = $r52.R($r72);
        Log_OC.loadImage($r53, "userRepo.currentUser.flatMapObservable {\n            networkService.transactionApi.postMultipleTransfer(\n                it.sessionId,\n                input,\n                deviceInformation.deviceId\n            )\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r53;
    }
}
