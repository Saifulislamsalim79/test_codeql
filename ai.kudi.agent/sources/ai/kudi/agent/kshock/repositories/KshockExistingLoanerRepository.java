package ai.kudi.agent.kshock.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao;
import ai.kudi.agent.core.domain.room_entities.MiniKshockDetails;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.kshock.data.domain.attention.KshockApi;
import ai.kudi.agent.kshock.data.model.ExistingLoanerResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: KshockExistingLoanerRepository.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/kshock/repositories/KshockExistingLoanerRepository;", "", "kshockApi", "Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "coreAppDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/kshock/data/domain/api/KshockApi;Lai/kudi/agent/core/domain/db/CoreAppDatabase;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getMiniKshockDetails", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/MiniKshockDetails;", MetricTracker.Object.INPUT, "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KshockExistingLoanerRepository {
    private final CoreAppDatabase coreAppDatabase;
    private final KshockApi kshockApi;
    private final RxSchedulers rxSchedulers;

    public KshockExistingLoanerRepository(KshockApi kshockApi, CoreAppDatabase coreAppDatabase, RxSchedulers rxSchedulers) {
        Log_OC.getArray(kshockApi, "kshockApi");
        Log_OC.getArray(coreAppDatabase, "coreAppDatabase");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.kshockApi = kshockApi;
        this.coreAppDatabase = coreAppDatabase;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMiniKshockDetails$lambda-0  reason: not valid java name */
    public static final MiniKshockDetails m39626getMiniKshockDetails$lambda0(KshockExistingLoanerRepository kshockExistingLoanerRepository, APIResponse aPIResponse) {
        Log_OC.getArray(kshockExistingLoanerRepository, "this$0");
        Log_OC.getArray(aPIResponse, "it");
        Object $r2 = aPIResponse.data;
        ExistingLoanerResponse $r3 = (ExistingLoanerResponse) $r2;
        BigDecimal $r4 = $r3.getMaxLoanAmount();
        BigDecimal $r5 = $r3.getAvailableLoanAmount();
        Integer $r6 = $r3.getTenure();
        MiniKshockDetails $r7 = new MiniKshockDetails(0, $r5, $r4, $r6, 1, null);
        CoreAppDatabase $r8 = kshockExistingLoanerRepository.coreAppDatabase;
        MiniKshockDetailsDao $r9 = $r8.getMiniKshockDetailsDao();
        $r9.insert($r7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getMiniKshockDetails(String str) {
        Log_OC.getArray(str, MetricTracker.Object.INPUT);
        KshockApi $r2 = this.kshockApi;
        AbstractC11688p $r3 = $r2.fetchExistingLoanerDetails(str);
        AbstractC11688p $r32 = $r3.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.repositories.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockExistingLoanerRepository $r1 = KshockExistingLoanerRepository.this;
                APIResponse $r4 = (APIResponse) obj;
                MiniKshockDetails $r22 = KshockExistingLoanerRepository.m39626getMiniKshockDetails$lambda0($r1, $r4);
                return $r22;
            }
        });
        RxSchedulers $r5 = this.rxSchedulers;
        Item $r6 = $r5.setSettings();
        Object $r33 = $r32.h0($r6);
        CoreAppDatabase $r7 = this.coreAppDatabase;
        MiniKshockDetailsDao $r8 = $r7.getMiniKshockDetailsDao();
        AbstractC11688p $r9 = $r8.getMiniKshockDetails();
        RxSchedulers $r52 = this.rxSchedulers;
        Item $r62 = $r52.setSettings();
        Object[] $r10 = {$r9.h0($r62), $r33};
        InterfaceC11692s[] r12 = (InterfaceC11692s[]) $r10;
        AbstractC11688p $r34 = AbstractC11688p.m10500n(r12);
        RxSchedulers $r53 = this.rxSchedulers;
        Item $r63 = $r53.setSettings();
        AbstractC11688p $r35 = $r34.h0($r63);
        Log_OC.loadImage($r35, "concatArrayEager(localMiniKshockDetails, remoteMiniKshockDetails)\n            .subscribeOn(rxSchedulers.io())");
        return $r35;
    }
}
