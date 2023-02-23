package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentDelayedKtatopUpBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DelayedKTAtopUpFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/core/domain/room_entities/Bank;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.DelayedKTAtopUpFragment$showBanksView$1 */
/* loaded from: classes.dex */
public final class DelayedKTAtopUpFragment$showBanksView$1 extends AbstractC11802m implements InterfaceC11767l<Bank, C13666w> {
    final /* synthetic */ BanksFragment $bankFragment;
    final /* synthetic */ DelayedKTAtopUpFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayedKTAtopUpFragment$showBanksView$1(BanksFragment banksFragment, DelayedKTAtopUpFragment delayedKTAtopUpFragment) {
        super(1);
        this.$bankFragment = banksFragment;
        this.this$0 = delayedKTAtopUpFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bank bank) {
        Bank $r2 = bank;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bank bank) {
        Log_OC.getArray(bank, "it");
        BanksFragment $r2 = this.$bankFragment;
        $r2.dismiss();
        DelayedKTAtopUpFragment $r3 = this.this$0;
        $r3.selectedBank = bank;
        DelayedKTAtopUpFragment $r32 = this.this$0;
        InterfaceC8209a $r4 = $r32.requireBinding();
        FragmentDelayedKtatopUpBinding $r5 = (FragmentDelayedKtatopUpBinding) $r4;
        KudiInputField $r6 = $r5.sendersBankView;
        String $r7 = bank.getName();
        $r6.setText($r7);
    }
}
