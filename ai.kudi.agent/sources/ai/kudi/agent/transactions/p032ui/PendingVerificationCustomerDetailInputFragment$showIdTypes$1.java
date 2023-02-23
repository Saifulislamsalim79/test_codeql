package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.databinding.FragmentPendingVerificationBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PendingVerificationCustomerDetailInputFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "selectedIdType", "Lai/kudi/agent/core/domain/room_entities/IdType;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationCustomerDetailInputFragment$showIdTypes$1 */
/* loaded from: classes.dex */
public final class PendingVerificationCustomerDetailInputFragment$showIdTypes$1 extends AbstractC11802m implements InterfaceC11767l<IdType, C13666w> {
    final /* synthetic */ PendingVerificationCustomerDetailInputFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingVerificationCustomerDetailInputFragment$showIdTypes$1(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment) {
        super(1);
        this.this$0 = pendingVerificationCustomerDetailInputFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(IdType idType) {
        IdType $r2 = idType;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IdType idType) {
        Log_OC.getArray(idType, "selectedIdType");
        PendingVerificationCustomerDetailInputFragment $r2 = this.this$0;
        String $r3 = idType.getName();
        $r2.idType = $r3;
        PendingVerificationCustomerDetailInputFragment $r22 = this.this$0;
        FragmentPendingVerificationBinding $r4 = $r22.requireBinding();
        KudiInputField $r5 = $r4.pendingKycIdType;
        PendingVerificationCustomerDetailInputFragment $r23 = this.this$0;
        String $r32 = $r23.idType;
        $r5.setText($r32);
        PendingVerificationCustomerDetailInputFragment $r24 = this.this$0;
        String $r33 = idType.getName();
        $r24.setMaxLengthOfIdNo($r33);
    }
}
