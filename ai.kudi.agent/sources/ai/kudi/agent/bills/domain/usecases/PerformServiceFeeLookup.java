package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.data.remote.CoreApiService;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: PerformServiceFeeLookup.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/bills/domain/usecases/FeesLookupResponse;", "Lai/kudi/agent/bills/domain/usecases/FeesLookupRequest;", "coreApiService", "Lai/kudi/agent/core/data/remote/CoreApiService;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "(Lai/kudi/agent/core/data/remote/CoreApiService;Lai/kudi/agent/users/data/repositories/UserRepository;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class PerformServiceFeeLookup implements OneInputUseCase<FeesLookupResponse, FeesLookupRequest> {
    private final CoreApiService coreApiService;
    private final UserRepository userRepo;

    public PerformServiceFeeLookup(CoreApiService coreApiService, UserRepository userRepository) {
        Log_OC.getArray(coreApiService, "coreApiService");
        Log_OC.getArray(userRepository, "userRepo");
        this.coreApiService = coreApiService;
        this.userRepo = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39032execute$lambda0(PerformServiceFeeLookup performServiceFeeLookup, FeesLookupRequest feesLookupRequest, Map map, User user) {
        Log_OC.getArray(performServiceFeeLookup, "this$0");
        Log_OC.getArray(feesLookupRequest, "$input");
        Log_OC.getArray(map, "$query");
        Log_OC.getArray(user, "it");
        CoreApiService $r4 = performServiceFeeLookup.coreApiService;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        String $r6 = feesLookupRequest.getProduct();
        AbstractC11688p $r7 = $r4.lookupFees($r5, $r6, map);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(final FeesLookupRequest feesLookupRequest) {
        final Map $r5;
        Log_OC.getArray(feesLookupRequest, MetricTracker.Object.INPUT);
        String $r3 = feesLookupRequest.getAmount();
        C13287o $r4 = C13664u.m4227a(TransactionField.AMOUNT, $r3);
        String $r32 = feesLookupRequest.getProductId();
        C13287o $r42 = C13664u.m4227a("productId", $r32);
        C13287o[] $r2 = {$r4, $r42};
        $r5 = C13727r0.m3878n($r2);
        UserRepository $r6 = this.userRepo;
        AbstractC11696w $r7 = $r6.getCurrentUser();
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.domain.usecases.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PerformServiceFeeLookup $r1 = PerformServiceFeeLookup.this;
                FeesLookupRequest $r22 = feesLookupRequest;
                Map $r33 = $r5;
                User $r62 = (User) obj;
                InterfaceC11692s $r43 = PerformServiceFeeLookup.m39032execute$lambda0($r1, $r22, $r33, $r62);
                return $r43;
            }
        });
        p425j.p444e.Item $r10 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r92 = $r9.h0($r10);
        p425j.p444e.Item $r102 = ContextUtils.LogError();
        AbstractC11688p $r93 = $r92.R($r102);
        Log_OC.loadImage($r93, "userRepo.currentUser\n            .flatMapObservable {\n                coreApiService.lookupFees(it.sessionId, input.product, query)\n            }\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r93;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        FeesLookupRequest $r3 = (FeesLookupRequest) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
