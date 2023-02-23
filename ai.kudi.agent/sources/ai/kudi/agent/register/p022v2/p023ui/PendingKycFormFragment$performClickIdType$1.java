package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.core.domain.room_entities.IdType;
import ai.kudi.agent.databinding.FragmentPendingKycFormBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PendingKycFormFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "selectedIdType", "Lai/kudi/agent/core/domain/room_entities/IdType;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.PendingKycFormFragment$performClickIdType$1 */
/* loaded from: classes.dex */
public final class PendingKycFormFragment$performClickIdType$1 extends AbstractC11802m implements InterfaceC11767l<IdType, C13666w> {
    final /* synthetic */ PendingKycFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingKycFormFragment$performClickIdType$1(PendingKycFormFragment pendingKycFormFragment) {
        super(1);
        this.this$0 = pendingKycFormFragment;
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
        PendingKycFormFragment $r2 = this.this$0;
        FragmentActivity $r3 = $r2.requireActivity();
        $r3.onBackPressed();
        PendingKycFormFragment $r22 = this.this$0;
        $r22.idType = idType;
        PendingKycFormFragment $r23 = this.this$0;
        InterfaceC8209a $r4 = $r23.requireBinding();
        FragmentPendingKycFormBinding $r5 = (FragmentPendingKycFormBinding) $r4;
        KudiInputField $r6 = $r5.idCardType;
        PendingKycFormFragment $r24 = this.this$0;
        IdType $r7 = $r24.idType;
        String $r8 = $r7 == null ? null : $r7.getName();
        if ($r8 == null) {
            $r8 = "";
        }
        $r6.setText($r8);
        PendingKycFormFragment $r25 = this.this$0;
        $r25.setMaxLengthOfIdNo(idType);
    }
}
