package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import ai.kudi.agent.transactionstatus.summary.presenter.TransferSummaryPresenter;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransferSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "transferSummary", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment$onActivityCreated$1$3 */
/* loaded from: classes.dex */
final class TransferSummaryFragment$onActivityCreated$1$3 extends AbstractC11802m implements InterfaceC11772q<SummaryModel, View, Integer, C13666w> {
    final /* synthetic */ TransferSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSummaryFragment$onActivityCreated$1$3(TransferSummaryFragment transferSummaryFragment) {
        super(3);
        this.this$0 = transferSummaryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(SummaryModel summaryModel, View view, Integer num) {
        SummaryModel $r4 = summaryModel;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(SummaryModel summaryModel, View view, int i) {
        Log_OC.getArray(summaryModel, "transferSummary");
        Log_OC.getArray(view, "$noName_1");
        Fragment $r3 = summaryModel.getFragment();
        boolean $z0 = $r3 instanceof CreateVoucherRecipientInfoFragment;
        if ($z0) {
            TransferSummaryFragment $r4 = this.this$0;
            TransferSummaryPresenter $r5 = $r4.getThisPresenter();
            MainTransferView $r6 = $r5.getMainTransferView();
            TransferSummaryFragment $r42 = this.this$0;
            Parcelable $r7 = $r42.transferType;
            if ($r7 != null) {
                VoucherCashInRequest $r8 = (VoucherCashInRequest) $r7;
                $r6.navigateToRecipientPage($r8, true);
                return;
            }
            Log_OC.LogError("transferType");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        boolean $z02 = $r3 instanceof CreateVoucherAmountInfoFragment;
        if ($z02) {
            TransferSummaryFragment $r43 = this.this$0;
            TransferSummaryPresenter $r52 = $r43.getThisPresenter();
            MainTransferView $r62 = $r52.getMainTransferView();
            TransferSummaryFragment $r44 = this.this$0;
            Parcelable $r72 = $r44.transferType;
            if ($r72 != null) {
                VoucherCashInRequest $r82 = (VoucherCashInRequest) $r72;
                $r62.navigateToAmountPage($r82, true);
                return;
            }
            Log_OC.LogError("transferType");
            NullPointerException r102 = new NullPointerException("Null throw statement replaced by Soot");
            throw r102;
        }
        boolean $z03 = $r3 instanceof TransferToBankAmountFragment;
        if ($z03) {
            TransferSummaryFragment $r45 = this.this$0;
            TransferSummaryPresenter $r53 = $r45.getThisPresenter();
            TransferSummaryFragment $r46 = this.this$0;
            Parcelable $r73 = $r46.transferType;
            if ($r73 != null) {
                TransferToBankPayload $r9 = (TransferToBankPayload) $r73;
                $r53.editAmountPage($r9, true);
                return;
            }
            Log_OC.LogError("transferType");
            NullPointerException r103 = new NullPointerException("Null throw statement replaced by Soot");
            throw r103;
        }
        boolean $z04 = $r3 instanceof TransferToBankFragment;
        if ($z04) {
            TransferSummaryFragment $r47 = this.this$0;
            TransferSummaryPresenter $r54 = $r47.getThisPresenter();
            TransferSummaryFragment $r48 = this.this$0;
            Parcelable $r74 = $r48.transferType;
            if ($r74 != null) {
                TransferToBankPayload $r92 = (TransferToBankPayload) $r74;
                $r54.editAccountDetailsPage($r92, true);
                return;
            }
            Log_OC.LogError("transferType");
            NullPointerException r104 = new NullPointerException("Null throw statement replaced by Soot");
            throw r104;
        }
        boolean $z05 = $r3 instanceof TransferToBankCustomersFragment;
        if ($z05) {
            TransferSummaryFragment $r49 = this.this$0;
            TransferSummaryPresenter $r55 = $r49.getThisPresenter();
            TransferSummaryFragment $r410 = this.this$0;
            Parcelable $r75 = $r410.transferType;
            if ($r75 != null) {
                TransferToBankPayload $r93 = (TransferToBankPayload) $r75;
                $r55.editCustomerDetailsPage($r93);
                return;
            }
            Log_OC.LogError("transferType");
            NullPointerException r105 = new NullPointerException("Null throw statement replaced by Soot");
            throw r105;
        }
    }
}
