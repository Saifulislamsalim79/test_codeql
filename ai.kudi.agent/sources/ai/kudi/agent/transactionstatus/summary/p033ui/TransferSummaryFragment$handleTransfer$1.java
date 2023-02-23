package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.bills.domain.wiki.Meta;
import ai.kudi.agent.transactionstatus.summary.presenter.TransferSummaryPresenter;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransferSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "location", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$handleTransfer$1 */
/* loaded from: classes.dex */
public final class TransferSummaryFragment$handleTransfer$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ TransferToBankPayload $payload;
    final /* synthetic */ TransferSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSummaryFragment$handleTransfer$1(TransferSummaryFragment transferSummaryFragment, TransferToBankPayload transferToBankPayload) {
        super(1);
        this.this$0 = transferSummaryFragment;
        this.$payload = transferToBankPayload;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Location location) {
        Location $r2 = location;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        if (location == null) {
            TransferSummaryFragment $r3 = this.this$0;
            $r3.displayLocationNotification();
            return;
        }
        TransferSummaryFragment $r32 = this.this$0;
        boolean $z0 = $r32.isCashOutFlow;
        if (!$z0) {
            double $d0 = location.getLatitude();
            float $f0 = (float) $d0;
            double $d02 = location.getLongitude();
            float $f1 = (float) $d02;
            Meta $r2 = new Meta("", "", "", false, "", $f0, $f1);
            TransferSummaryFragment $r33 = this.this$0;
            TransferSummaryPresenter $r4 = $r33.getThisPresenter();
            TransferToBankPayload $r6 = this.$payload;
            $r4.performTransfer(TransferToBankPayload.copy$default($r6, null, null, null, null, null, null, null, null, null, null, null, $r2, null, 6143, null));
            return;
        }
        TransferSummaryFragment $r34 = this.this$0;
        TransferSummaryPresenter $r42 = $r34.getThisPresenter();
        TransferToBankPayload $r62 = this.$payload;
        String $r7 = $r62.getAccountNumber();
        Log_OC.append($r7);
        TransferToBankPayload $r63 = this.$payload;
        String $r8 = $r63.getBankCode();
        Log_OC.append($r8);
        TransferToBankPayload $r64 = this.$payload;
        Integer $r9 = $r64.getAmount();
        Log_OC.append($r9);
        int $i0 = $r9.intValue();
        TransferToBankPayload $r65 = this.$payload;
        String $r10 = $r65.getAccountName();
        Log_OC.append($r10);
        WithdrawToBankRequest $r5 = new WithdrawToBankRequest($r7, $r8, $i0, $r10);
        $r42.withdrawToBankAccount($r5);
    }
}
