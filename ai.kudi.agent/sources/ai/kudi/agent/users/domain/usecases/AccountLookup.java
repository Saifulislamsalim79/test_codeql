package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.dto.AccountLookupRequest;
import ai.kudi.agent.users.domain.dto.AccountLookupResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: AccountLookup.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/AccountLookup;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/AccountLookupResponse;", "Lai/kudi/agent/users/domain/dto/AccountLookupRequest;", "networkService", "Lai/kudi/agent/core/data/remote/CoreApiService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/data/remote/CoreApiService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class AccountLookup implements OneInputUseCase<AccountLookupResponse, AccountLookupRequest> {
    private final CoreApiService networkService;
    private final RxSchedulers rxSchedulers;

    public AccountLookup(CoreApiService coreApiService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(coreApiService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = coreApiService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.users.domain.package_1.AccountLookupRequest accountLookupRequest) {
        Log_OC.getArray(accountLookupRequest, TransactionRequest.TYPE_REQUEST);
        CoreApiService $r2 = this.networkService;
        AbstractC11688p $r3 = $r2.lookupAccount(accountLookupRequest);
        RxSchedulers $r4 = this.rxSchedulers;
        p425j.p444e.Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.rxSchedulers;
        p425j.p444e.Item $r52 = $r42.main();
        AbstractC11688p $r33 = $r32.R($r52);
        Log_OC.loadImage($r33, "networkService.lookupAccount(request)\n                .subscribeOn(rxSchedulers.io())\n                .observeOn(rxSchedulers.main())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.users.domain.package_1.AccountLookupRequest $r3 = (ai.kudi.agent.users.domain.package_1.AccountLookupRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
