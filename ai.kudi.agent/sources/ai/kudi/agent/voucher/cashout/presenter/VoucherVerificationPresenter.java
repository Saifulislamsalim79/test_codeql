package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import ai.kudi.agent.voucher.cashout.domain.usecase.CashOutVoucherVerification;
import ai.kudi.agent.voucher.cashout.view.VoucherVerificationView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J,\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0017J\u0010\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/presenter/VoucherVerificationPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashout/view/VoucherVerificationView;", "cashOutVoucherVerification", "Lai/kudi/agent/voucher/cashout/domain/usecase/CashOutVoucherVerification;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/voucher/cashout/domain/usecase/CashOutVoucherVerification;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "hideLoading", "logEventOnVoucherVerification", "code", "", "isSuccessful", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showError", "showLoading", "verifyVoucher", "voucherCode", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VoucherVerificationPresenter extends C9410b<VoucherVerificationView> {
    private final Analytics analytics;
    private final CashOutVoucherVerification cashOutVoucherVerification;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private User user;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VoucherVerificationPresenter(CashOutVoucherVerification cashOutVoucherVerification, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(cashOutVoucherVerification, "cashOutVoucherVerification");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.cashOutVoucherVerification = cashOutVoucherVerification;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-2  reason: not valid java name */
    public static final void m41734hideLoading$lambda2(VoucherVerificationView voucherVerificationView) {
        Log_OC.getArray(voucherVerificationView, "view");
        voucherVerificationView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnVoucherVerification(String str, boolean z, String str2, User user) {
        Analytics $r4 = this.analytics;
        $r4.onVoucherCodeLookUpClickedEvent(str, z, str2, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-0  reason: not valid java name */
    public static final void m41735showError$lambda0(String str, VoucherVerificationView voucherVerificationView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(voucherVerificationView, "view");
        voucherVerificationView.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-1  reason: not valid java name */
    public static final void m41736showLoading$lambda1(VoucherVerificationView voucherVerificationView) {
        Log_OC.getArray(voucherVerificationView, "view");
        voucherVerificationView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyVoucher$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41737verifyVoucher$lambda3(VoucherVerificationPresenter voucherVerificationPresenter, VoucherRequest voucherRequest, User user) {
        Log_OC.getArray(voucherVerificationPresenter, "this$0");
        Log_OC.getArray(voucherRequest, "$voucher");
        Log_OC.getArray(user, "it");
        CashOutVoucherVerification $r3 = voucherVerificationPresenter.cashOutVoucherVerification;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, voucherRequest);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyVoucher$lambda-5  reason: not valid java name */
    public static final void m41738verifyVoucher$lambda5(VoucherVerificationPresenter voucherVerificationPresenter, String $r3, final VoucherVerification voucherVerification) {
        Log_OC.getArray(voucherVerificationPresenter, "this$0");
        if ($r3 == null) {
            $r3 = "";
        }
        User $r2 = voucherVerificationPresenter.getUser();
        voucherVerificationPresenter.logEventOnVoucherVerification($r3, true, null, $r2);
        voucherVerificationPresenter.hideLoading();
        voucherVerificationPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashout.presenter.NumberPicker$TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void format(Object obj) {
                VoucherVerification $r1 = VoucherVerification.this;
                VoucherVerificationView $r32 = (VoucherVerificationView) obj;
                VoucherVerificationPresenter.m41739verifyVoucher$lambda5$lambda4($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyVoucher$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41739verifyVoucher$lambda5$lambda4(VoucherVerification voucherVerification, VoucherVerificationView voucherVerificationView) {
        Log_OC.getArray(voucherVerificationView, "view");
        Log_OC.loadImage(voucherVerification, "verification");
        voucherVerificationView.navigateToPhoneVerificationPage(voucherVerification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyVoucher$lambda-6  reason: not valid java name */
    public static final void m41740verifyVoucher$lambda6(VoucherVerificationPresenter voucherVerificationPresenter, String $r2, Throwable th) {
        Log_OC.getArray(voucherVerificationPresenter, "this$0");
        if ($r2 == null) {
            $r2 = "";
        }
        String $r3 = th == null ? null : th.getMessage();
        User $r4 = voucherVerificationPresenter.getUser();
        voucherVerificationPresenter.logEventOnVoucherVerification($r2, false, $r3, $r4);
        voucherVerificationPresenter.hideLoading();
        th.printStackTrace();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r6 = $r5.invoke(th);
        voucherVerificationPresenter.showError((String) $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final User getUser() {
        User r1 = this.user;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        Log $r1 = Log.LOG;
        ifViewAttached($r1);
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashout.presenter.Preference
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void setTitle(Object obj) {
                String $r1 = str;
                VoucherVerificationView $r3 = (VoucherVerificationView) obj;
                VoucherVerificationPresenter.m41735showError$lambda0($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        DialogAction $r1 = DialogAction.POSITIVE;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void verifyVoucher(final java.lang.String r19) {
        /*
            r18 = this;
            if (r19 == 0) goto Ld
            r0 = r19
            int r2 = r0.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r3 = 0
            goto Le
        Ld:
            r3 = 1
        Le:
            if (r3 == 0) goto L18
            java.lang.String r4 = "Please enter your voucher code"
            r0 = r18
            r0.showError(r4)
            return
        L18:
            r0 = r18
            r0.showLoading()
            ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest r5 = new ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest
            r6 = 0
            r7 = 2
            r8 = 0
            r0 = r19
            r5.<init>(r0, r6, r7, r8)
            r0 = r18
            ai.kudi.agent.users.domain.usecases.FetchCurrentUser r9 = r0.fetchCurrentUser
            r6 = 0
            r8 = 0
            r7 = 3
            r11 = 0
            j.e.w r10 = ai.kudi.agent.users.domain.usecases.FetchCurrentUser.execute$default(r9, r6, r8, r7, r11)
            ai.kudi.agent.voucher.cashout.presenter.c r12 = new ai.kudi.agent.voucher.cashout.presenter.c
            r0 = r18
            r12.<init>()
            j.e.p r13 = r10.m10440j(r12)
            ai.kudi.agent.voucher.cashout.presenter.MessageTypeFilter r14 = new ai.kudi.agent.voucher.cashout.presenter.MessageTypeFilter
            r0 = r18
            r1 = r19
            r14.<init>()
            ai.kudi.agent.voucher.cashout.presenter.Label r15 = new ai.kudi.agent.voucher.cashout.presenter.Label
            r0 = r18
            r1 = r19
            r15.<init>()
            j.e.c0.FavoritesArrayAdapter r16 = r13.e0(r14, r15)
            java.lang.String r4 = "fetchCurrentUser.execute()\n            .flatMapObservable { cashOutVoucherVerification.execute(it.sessionId, voucher) }\n            .subscribe(\n                { verification ->\n                    logEventOnVoucherVerification(voucherCode ?: \"\", true, null, user)\n                    hideLoading()\n                    ifViewAttached { view ->\n                        view.navigateToPhoneVerificationPage(verification)\n                    }\n\n                },\n                { err ->\n                    logEventOnVoucherVerification(\n                        voucherCode ?: \"\", false, err?.message,\n                        user\n                    )\n                    hideLoading()\n                    err.printStackTrace()\n                    showError(\n                        parseHttpError2(\"Something went wrong. Please try again\")(\n                            err\n                        )\n                    )\n                }\n            )"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r4)
            r0 = r18
            j.e.c0.b r0 = r0.compositeDisposable
            r17 = r0
            r0 = r16
            r1 = r17
            ai.kudi.agent.core.mvvm.RxExtKt.addTo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.voucher.cashout.presenter.VoucherVerificationPresenter.verifyVoucher(java.lang.String):void");
    }
}
