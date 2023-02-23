package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.util.RandomUtilKt;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeasePosAgreementViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.LeasePosAgreementVm$startCountDown$1 */
/* loaded from: classes.dex */
public final class LeasePosAgreementVm$startCountDown$1 extends AbstractC11802m implements InterfaceC11767l<Long, C13666w> {
    final /* synthetic */ LeasePosAgreementVm this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeasePosAgreementVm$startCountDown$1(LeasePosAgreementVm leasePosAgreementVm) {
        super(1);
        this.this$0 = leasePosAgreementVm;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Long l) {
        Long $r2 = l;
        long $l0 = $r2.longValue();
        invoke($l0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(long j) {
        Long $r1 = Long.valueOf(j);
        String $r2 = Log_OC.m10359a("timer ", $r1);
        Object[] $r3 = new Object[0];
        Timber.tag($r2, $r3);
        LeasePosAgreementVm $r4 = this.this$0;
        LeasePosAgreementViewData $r5 = LeasePosAgreementVm.access$getState($r4);
        String $r22 = RandomUtilKt.toMinute_Second(j);
        $r4.publish(LeasePosAgreementViewData.copy$default($r5, $r22, false, null, 6, null));
    }
}
