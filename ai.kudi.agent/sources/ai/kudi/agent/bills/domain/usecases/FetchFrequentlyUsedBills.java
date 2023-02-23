package ai.kudi.agent.bills.domain.usecases;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.product.repository.BillerRepository;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.InterfaceC11291f;
import p590o.p591a.Timber;
/* compiled from: FetchFrequentlyUsedBills.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/bills/domain/usecases/FetchFrequentlyUsedBills;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "billerRepository", "Lai/kudi/agent/product/repository/BillerRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/product/repository/BillerRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getBillerRepository", "()Lai/kudi/agent/product/repository/BillerRepository;", "getNetworkService", "()Lai/kudi/agent/core/network/NetworkService;", "execute", "Lio/reactivex/Observable;", "", "sessionId", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchFrequentlyUsedBills {
    private final BillerRepository billerRepository;
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public FetchFrequentlyUsedBills(NetworkService networkService, BillerRepository billerRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(billerRepository, "billerRepository");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.billerRepository = billerRepository;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0027 */
    /* renamed from: execute$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.C13666w m39024execute$lambda3(ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills r24, ai.kudi.agent.core.network.response.APIResponse r25) {
        /*
            java.lang.String r3 = "this$0"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r3)
            java.lang.String r3 = "it"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r3)
            r0 = r25
            Data r4 = r0.data
            java.lang.String r3 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r3)
            r6 = r4
            java.util.Map r6 = (java.util.Map) r6
            r5 = r6
            java.util.Set r7 = r5.entrySet()
            java.util.Iterator r8 = r7.iterator()
        L23:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L78
            java.lang.Object r4 = r8.next()
            r11 = r4
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r10 = r11
            r0 = r24
            ai.kudi.agent.product.repository.BillerRepository r12 = r0.getBillerRepository()
            java.lang.Object r4 = r10.getKey()
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r13 = r14
            java.lang.Object r4 = r10.getValue()
            r16 = r4
            java.lang.Number r16 = (java.lang.Number) r16
            r15 = r16
            int r17 = r15.intValue()
            r0 = r17
            j.e.w r18 = r12.updateFrequentlyUsed(r13, r0)
            r0 = r24
            ai.kudi.agent.core.schedulers.RxSchedulers r0 = r0.rxSchedulers
            r19 = r0
            j.e.Item r20 = r0.setSettings()
            r0 = r18
            r1 = r20
            j.e.w r18 = r0.u(r1)
            ai.kudi.agent.bills.domain.usecases.Label r21 = new ai.kudi.agent.bills.domain.usecases.Label
            r0 = r21
            r0.<init>()
            ai.kudi.agent.bills.domain.usecases.Function r22 = ai.kudi.agent.bills.domain.usecases.Function.TRUE
            r0 = r18
            r1 = r21
            r2 = r22
            r0.s(r1, r2)
            goto L23
        L78:
            kotlin.w r23 = kotlin.C13666w.f30112a
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills.m39024execute$lambda3(ai.kudi.agent.bills.domain.usecases.FetchFrequentlyUsedBills, ai.kudi.agent.core.network.response.APIResponse):kotlin.w");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-3$lambda-2$lambda-0  reason: not valid java name */
    public static final void m39025execute$lambda3$lambda2$lambda0(Map.Entry entry, C13666w c13666w) {
        Log_OC.getArray(entry, "$item");
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Updating ");
        Object $r3 = entry.getKey();
        String $r4 = (String) $r3;
        $r2.append($r4);
        $r2.append(" with ");
        Object $r32 = entry.getValue();
        Number $r5 = (Number) $r32;
        int $i0 = $r5.intValue();
        $r2.append($i0);
        String $r42 = $r2.toString();
        Object[] $r6 = new Object[0];
        Timber.m1627e($r42, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "sessionId");
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        AbstractC11688p $r4 = $r3.getFrequentlyUsedBills(str);
        AbstractC11688p $r42 = $r4.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.bills.domain.usecases.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                FetchFrequentlyUsedBills $r1 = FetchFrequentlyUsedBills.this;
                APIResponse $r43 = (APIResponse) obj;
                C13666w $r22 = FetchFrequentlyUsedBills.m39024execute$lambda3($r1, $r43);
                return $r22;
            }
        });
        RxSchedulers $r6 = this.rxSchedulers;
        p425j.p444e.Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        RxSchedulers $r62 = this.rxSchedulers;
        p425j.p444e.Item $r72 = $r62.main();
        AbstractC11688p $r44 = $r43.R($r72);
        Log_OC.loadImage($r44, "networkService.api.getFrequentlyUsedBills(sessionId).map {\n\n            it.data.forEach { item ->\n                billerRepository.updateFrequentlyUsed(item.key, item.value).subscribeOn(\n                    rxSchedulers.io()\n                ).subscribe(\n                    { Timber.e(\"Updating ${item.key} with ${item.value}\") },\n                    { it.printStackTrace() })\n            }\n\n        }.subscribeOn(\n            rxSchedulers.io()\n        ).observeOn(\n            rxSchedulers.main()\n        )");
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillerRepository getBillerRepository() {
        BillerRepository r1 = this.billerRepository;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NetworkService getNetworkService() {
        NetworkService r1 = this.networkService;
        return r1;
    }
}
