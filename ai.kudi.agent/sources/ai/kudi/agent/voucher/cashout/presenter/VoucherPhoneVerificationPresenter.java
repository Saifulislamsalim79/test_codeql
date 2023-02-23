package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import ai.kudi.agent.voucher.cashout.domain.usecase.CashOutVoucherVerification;
import ai.kudi.agent.voucher.cashout.domain.usecase.ValidateRecipientPhone;
import ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherPhoneVerificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0017H\u0002J,\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001eJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010&\u001a\u00020\u0017J\b\u0010'\u001a\u00020\u0017H\u0002J\u0016\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cJ\u0018\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u001eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/presenter/VoucherPhoneVerificationPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashout/view/VoucherPhoneVerificationView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "verification", "Lai/kudi/agent/voucher/cashout/domain/usecase/CashOutVoucherVerification;", "validateRecipientPhone", "Lai/kudi/agent/voucher/cashout/domain/usecase/ValidateRecipientPhone;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/voucher/cashout/domain/usecase/CashOutVoucherVerification;Lai/kudi/agent/voucher/cashout/domain/usecase/ValidateRecipientPhone;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "user", "Lai/kudi/agent/users/domain/dto/User;", "getUser", "()Lai/kudi/agent/users/domain/dto/User;", "setUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "destroy", "", "hideLoading", "hideRetryView", "logEventOnPhoneVerification", "isSuccessful", "", "name", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "navigateToConfirmationPage", "voucherResponse", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "resendOtp", "reference", "showError", "showLoading", "showRetryView", "showTimer", "timer", "", "shouldReset", "validatePhone", "otpCode", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VoucherPhoneVerificationPresenter extends C9410b<VoucherPhoneVerificationView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private User user;
    private final ValidateRecipientPhone validateRecipientPhone;
    private final CashOutVoucherVerification verification;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VoucherPhoneVerificationPresenter(FetchCurrentUser fetchCurrentUser, CashOutVoucherVerification cashOutVoucherVerification, ValidateRecipientPhone validateRecipientPhone, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(cashOutVoucherVerification, "verification");
        Log_OC.getArray(validateRecipientPhone, "validateRecipientPhone");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.verification = cashOutVoucherVerification;
        this.validateRecipientPhone = validateRecipientPhone;
        this.analytics = analytics;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-4  reason: not valid java name */
    public static final void m41720hideLoading$lambda4(VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.hideLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideRetryView() {
        Format $r1 = Format.THREAD;
        ifViewAttached($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideRetryView$lambda-5  reason: not valid java name */
    public static final void m41721hideRetryView$lambda5(VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.hideRetry();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnPhoneVerification(boolean z, String str, String str2, User user) {
        Analytics $r4 = this.analytics;
        $r4.onVoucherRecipientPhoneVerificationEvent(z, str, str2, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToConfirmationPage(final VoucherResponse voucherResponse) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashout.presenter.Channel$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void close(Object obj) {
                VoucherResponse $r1 = VoucherResponse.this;
                VoucherPhoneVerificationView $r3 = (VoucherPhoneVerificationView) obj;
                VoucherPhoneVerificationPresenter.m41722navigateToConfirmationPage$lambda2($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateToConfirmationPage$lambda-2  reason: not valid java name */
    public static final void m41722navigateToConfirmationPage$lambda2(VoucherResponse voucherResponse, VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherResponse, "$voucherResponse");
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.navigateToConfirmationPage(voucherResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOtp$lambda-7  reason: not valid java name */
    public static final InterfaceC11692s m41723resendOtp$lambda7(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, VoucherRequest voucherRequest, User user) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        Log_OC.getArray(voucherRequest, "$voucher");
        Log_OC.getArray(user, "it");
        voucherPhoneVerificationPresenter.setUser(user);
        CashOutVoucherVerification $r3 = voucherPhoneVerificationPresenter.verification;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, voucherRequest, true);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOtp$lambda-8  reason: not valid java name */
    public static final void m41724resendOtp$lambda8(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, VoucherVerification voucherVerification) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        String $r2 = voucherVerification.getRecipientPhone();
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        User $r4 = voucherPhoneVerificationPresenter.getUser();
        voucherPhoneVerificationPresenter.logEventOnPhoneVerification(true, $r3, null, $r4);
        voucherPhoneVerificationPresenter.hideLoading();
        voucherPhoneVerificationPresenter.showRetryView();
        long $l0 = voucherVerification.getExpiresInSeconds();
        voucherPhoneVerificationPresenter.showTimer($l0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOtp$lambda-9  reason: not valid java name */
    public static final void m41725resendOtp$lambda9(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, Throwable th) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        th.printStackTrace();
        String $r2 = th.getMessage();
        User $r3 = voucherPhoneVerificationPresenter.getUser();
        voucherPhoneVerificationPresenter.logEventOnPhoneVerification(true, "", $r2, $r3);
        voucherPhoneVerificationPresenter.hideLoading();
        voucherPhoneVerificationPresenter.showRetryView();
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r5 = $r4.invoke(th);
        String $r22 = (String) $r5;
        voucherPhoneVerificationPresenter.showError($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-1  reason: not valid java name */
    public static final void m41726showError$lambda1(String str, VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.showError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-3  reason: not valid java name */
    public static final void m41727showLoading$lambda3(VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.showLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showRetryView() {
        ClassWriter $r1 = ClassWriter.f2027b;
        ifViewAttached($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRetryView$lambda-6  reason: not valid java name */
    public static final void m41728showRetryView$lambda6(VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.showRetry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTimer$lambda-0  reason: not valid java name */
    public static final void m41729showTimer$lambda0(long j, boolean z, VoucherPhoneVerificationView voucherPhoneVerificationView) {
        Log_OC.getArray(voucherPhoneVerificationView, "view");
        voucherPhoneVerificationView.otpTimer(j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validatePhone$lambda-10  reason: not valid java name */
    public static final InterfaceC11692s m41730validatePhone$lambda10(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, String str, VoucherRequest voucherRequest, User user) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        Log_OC.getArray(voucherRequest, "$voucher");
        Log_OC.getArray(user, "it");
        voucherPhoneVerificationPresenter.setUser(user);
        ValidateRecipientPhone $r4 = voucherPhoneVerificationPresenter.validateRecipientPhone;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        Log_OC.append(str);
        AbstractC11688p $r6 = $r4.execute($r5, str, voucherRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validatePhone$lambda-11  reason: not valid java name */
    public static final void m41731validatePhone$lambda11(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, VoucherResponse voucherResponse) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        String $r2 = voucherResponse.getRecipientName();
        User $r3 = voucherPhoneVerificationPresenter.getUser();
        voucherPhoneVerificationPresenter.logEventOnPhoneVerification(true, $r2, null, $r3);
        voucherPhoneVerificationPresenter.hideLoading();
        Log_OC.loadImage(voucherResponse, "response");
        voucherPhoneVerificationPresenter.navigateToConfirmationPage(voucherResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validatePhone$lambda-12  reason: not valid java name */
    public static final void m41732validatePhone$lambda12(VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter, Throwable th) {
        Log_OC.getArray(voucherPhoneVerificationPresenter, "this$0");
        th.printStackTrace();
        voucherPhoneVerificationPresenter.hideLoading();
        String $r2 = th.getMessage();
        User $r3 = voucherPhoneVerificationPresenter.getUser();
        voucherPhoneVerificationPresenter.logEventOnPhoneVerification(true, "", $r2, $r3);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r5 = $r4.invoke(th);
        String $r22 = (String) $r5;
        voucherPhoneVerificationPresenter.showError($r22);
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
        Settings $r1 = Settings.settings;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resendOtp(String str) {
        Log_OC.getArray(str, "reference");
        showLoading();
        hideRetryView();
        final VoucherRequest $r2 = new VoucherRequest(null, str, 1, null);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.voucher.cashout.presenter.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                VoucherPhoneVerificationPresenter $r1 = VoucherPhoneVerificationPresenter.this;
                VoucherRequest $r22 = $r2;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = VoucherPhoneVerificationPresenter.m41723resendOtp$lambda7($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.voucher.cashout.presenter.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VoucherPhoneVerificationPresenter $r1 = VoucherPhoneVerificationPresenter.this;
                VoucherVerification $r32 = (VoucherVerification) obj;
                VoucherPhoneVerificationPresenter.m41724resendOtp$lambda8($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.voucher.cashout.presenter.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VoucherPhoneVerificationPresenter $r1 = VoucherPhoneVerificationPresenter.this;
                Throwable $r32 = (Throwable) obj;
                VoucherPhoneVerificationPresenter.m41725resendOtp$lambda9($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "fetchCurrentUser.execute()\n            .flatMapObservable {\n                user = it\n                verification.execute(it.sessionId, voucher, isResend = true)\n            }\n            .subscribe({ response ->\n                logEventOnPhoneVerification(\n                    true, response.recipientPhone ?: \"\",\n                    null, user\n                )\n                hideLoading()\n                showRetryView()\n                showTimer(response.expiresInSeconds, shouldReset = true)\n\n            }, { err ->\n                err.printStackTrace()\n                logEventOnPhoneVerification(true, \"\", err.message, user)\n                hideLoading()\n                showRetryView()\n                showError(\n                    parseHttpError2(\"Something went wrong. Please try again\")(\n                        err\n                    )\n                )\n            })");
        C11280b $r10 = this.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashout.presenter.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void warn(Object obj) {
                String $r1 = str;
                VoucherPhoneVerificationView $r3 = (VoucherPhoneVerificationView) obj;
                VoucherPhoneVerificationPresenter.m41726showError$lambda1($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        Image $r1 = Image.image;
        ifViewAttached($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showTimer(final long j, final boolean z) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashout.presenter.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                long $l0 = j;
                boolean $z0 = z;
                VoucherPhoneVerificationView $r2 = (VoucherPhoneVerificationView) obj;
                VoucherPhoneVerificationPresenter.m41729showTimer$lambda0($l0, $z0, $r2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validatePhone(final java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            java.lang.String r2 = "reference"
            r0 = r20
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            if (r19 == 0) goto L14
            r0 = r19
            int r3 = r0.length()
            if (r3 != 0) goto L12
            goto L14
        L12:
            r4 = 0
            goto L15
        L14:
            r4 = 1
        L15:
            if (r4 == 0) goto L1f
            java.lang.String r2 = "Please enter your otp code"
            r0 = r18
            r0.showError(r2)
            return
        L1f:
            ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest r5 = new ai.kudi.agent.voucher.cashout.domain.model.VoucherRequest
            r6 = 0
            r7 = 1
            r8 = 0
            r0 = r20
            r5.<init>(r6, r0, r7, r8)
            r0 = r18
            r0.showLoading()
            r0 = r18
            ai.kudi.agent.users.domain.usecases.FetchCurrentUser r9 = r0.fetchCurrentUser
            r6 = 0
            r8 = 0
            r7 = 3
            r11 = 0
            j.e.w r10 = ai.kudi.agent.users.domain.usecases.FetchCurrentUser.execute$default(r9, r6, r8, r7, r11)
            ai.kudi.agent.voucher.cashout.presenter.MethodWriter r12 = new ai.kudi.agent.voucher.cashout.presenter.MethodWriter
            r0 = r18
            r1 = r19
            r12.<init>()
            j.e.p r13 = r10.m10440j(r12)
            ai.kudi.agent.voucher.cashout.presenter.Macro r14 = new ai.kudi.agent.voucher.cashout.presenter.Macro
            r0 = r18
            r14.<init>()
            ai.kudi.agent.voucher.cashout.presenter.FromMatchesFilter r15 = new ai.kudi.agent.voucher.cashout.presenter.FromMatchesFilter
            r0 = r18
            r15.<init>()
            j.e.c0.FavoritesArrayAdapter r16 = r13.e0(r14, r15)
            java.lang.String r2 = "fetchCurrentUser.execute()\n            .flatMapObservable {\n                user = it\n                validateRecipientPhone.execute(it.sessionId, otpCode!!, voucher)\n            }\n            .subscribe(\n                { response ->\n                    logEventOnPhoneVerification(true, response.recipientName, null, user)\n                    hideLoading()\n                    navigateToConfirmationPage(response)\n\n                },\n                { err ->\n                    err.printStackTrace()\n                    hideLoading()\n                    logEventOnPhoneVerification(true, \"\", err.message, user)\n                    showError(\n                        parseHttpError2(\"Something went wrong. Please try again\")(\n                            err\n                        )\n                    )\n                }\n            )"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r2)
            r0 = r18
            j.e.c0.b r0 = r0.compositeDisposable
            r17 = r0
            r0 = r16
            r1 = r17
            ai.kudi.agent.core.mvvm.RxExtKt.addTo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.voucher.cashout.presenter.VoucherPhoneVerificationPresenter.validatePhone(java.lang.String, java.lang.String):void");
    }
}
