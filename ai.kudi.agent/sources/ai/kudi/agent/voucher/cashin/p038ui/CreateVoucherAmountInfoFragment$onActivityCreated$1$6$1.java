package ai.kudi.agent.voucher.cashin.p038ui;

import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.presenter.CreateVoucherAmountPresenter;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateVoucherAmountInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashin.ui.CreateVoucherAmountInfoFragment$onActivityCreated$1$6$1 */
/* loaded from: classes.dex */
public final class CreateVoucherAmountInfoFragment$onActivityCreated$1$6$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ String $amount;
    final /* synthetic */ CreateVoucherAmountInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateVoucherAmountInfoFragment$onActivityCreated$1$6$1(CreateVoucherAmountInfoFragment createVoucherAmountInfoFragment, String str) {
        super(1);
        this.this$0 = createVoucherAmountInfoFragment;
        this.$amount = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String $r1) {
        if ($r1 != null) {
            CreateVoucherAmountInfoFragment $r2 = this.this$0;
            CreateVoucherAmountPresenter $r3 = $r2.getThisPresenter();
            $r3.showError($r1);
            return;
        }
        CreateVoucherAmountInfoFragment $r22 = this.this$0;
        CreateVoucherAmountPresenter $r32 = $r22.getThisPresenter();
        String $r12 = this.$amount;
        CreateVoucherAmountInfoFragment $r23 = this.this$0;
        VoucherCashInRequest $r4 = $r23.getRequest();
        CreateVoucherAmountInfoFragment $r24 = this.this$0;
        Boolean $r5 = $r24.isFromSummaryPage();
        boolean $z0 = $r5 == null ? false : $r5.booleanValue();
        $r32.navigateToCashInNamePage($r12, $r4, $z0);
    }
}
