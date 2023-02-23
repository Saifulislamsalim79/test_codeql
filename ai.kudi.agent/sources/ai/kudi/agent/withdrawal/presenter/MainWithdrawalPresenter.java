package ai.kudi.agent.withdrawal.presenter;

import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import ai.kudi.agent.withdrawal.view.MainWithdrawalView;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: MainWithdrawalPresenter.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J4\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/withdrawal/presenter/MainWithdrawalPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/withdrawal/view/MainWithdrawalView;", "()V", "navigateToVoucherSummary", "", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "showDialog", MetricTracker.Object.MESSAGE, "", "buttonText", "upperCase", "", "cancelable", "action", "Lkotlin/Function0;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MainWithdrawalPresenter extends C9410b<MainWithdrawalView> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToVoucherSummary$lambda-0  reason: not valid java name */
    public static final void m41855navigateToVoucherSummary$lambda0(VoucherResponse voucherResponse, MainWithdrawalView mainWithdrawalView) {
        Log_OC.getArray(voucherResponse, "$voucherResponse");
        Log_OC.getArray(mainWithdrawalView, "view");
        mainWithdrawalView.navigateToVoucherSummaryFragment(voucherResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDialog$lambda-1  reason: not valid java name */
    public static final void m41856showDialog$lambda1(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a, MainWithdrawalView mainWithdrawalView) {
        Log_OC.getArray(str, "$message");
        Log_OC.getArray(str2, "$buttonText");
        Log_OC.getArray(interfaceC11756a, "$action");
        Log_OC.getArray(mainWithdrawalView, "view");
        mainWithdrawalView.showAlertDialog(str, str2, z, z2, interfaceC11756a);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToVoucherSummary(final VoucherResponse voucherResponse) {
        Log_OC.getArray(voucherResponse, "voucherResponse");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.withdrawal.presenter.Channel$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void close(Object obj) {
                VoucherResponse $r1 = VoucherResponse.this;
                MainWithdrawalView $r3 = (MainWithdrawalView) obj;
                MainWithdrawalPresenter.m41855navigateToVoucherSummary$lambda0($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDialog(final String str, final String str2, final boolean z, final boolean z2, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        Log_OC.getArray(interfaceC11756a, "action");
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.withdrawal.presenter.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r2 = str;
                String $r3 = str2;
                boolean $z0 = z;
                boolean $z1 = z2;
                InterfaceC11756a $r4 = interfaceC11756a;
                MainWithdrawalView $r5 = (MainWithdrawalView) obj;
                MainWithdrawalPresenter.m41856showDialog$lambda1($r2, $r3, $z0, $z1, $r4, $r5);
            }
        });
    }
}
