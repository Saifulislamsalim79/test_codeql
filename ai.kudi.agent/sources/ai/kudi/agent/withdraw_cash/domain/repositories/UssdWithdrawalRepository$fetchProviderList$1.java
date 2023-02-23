package ai.kudi.agent.withdraw_cash.domain.repositories;

import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UssdWithdrawalRepository.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m10421d2 = {"<anonymous>", "", "providerList", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdWithdrawalRepository$fetchProviderList$1 extends AbstractC11802m implements InterfaceC11767l<List<? extends UssdWithdrawalProvider>, C13666w> {
    final /* synthetic */ UssdWithdrawalRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdWithdrawalRepository$fetchProviderList$1(UssdWithdrawalRepository ussdWithdrawalRepository) {
        super(1);
        this.this$0 = ussdWithdrawalRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(List<? extends UssdWithdrawalProvider> list) {
        List<? extends UssdWithdrawalProvider> $r2 = list;
        invoke2((List) $r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List list) {
        Log_OC.getArray(list, "providerList");
        UssdWithdrawalRepository $r3 = this.this$0;
        UssdWithdrawalRepository.LocalSource $r2 = $r3.localSource;
        $r2.persistProviderList(list);
    }
}
