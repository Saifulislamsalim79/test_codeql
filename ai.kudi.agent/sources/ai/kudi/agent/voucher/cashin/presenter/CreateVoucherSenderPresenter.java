package ai.kudi.agent.voucher.cashin.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.view.CashInSenderView;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherSenderPresenter.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J$\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherSenderPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashin/view/CashInSenderView;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "logSenderEntryEvent", "phoneNumber", "", "name", "user", "Lai/kudi/agent/users/domain/dto/User;", "navigateToAmountPage", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "navigateToVoucherCreationPage", "senderPhone", "senderName", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showSenderNameError", "showSenderPhoneError", "validateInfo", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateVoucherSenderPresenter extends C9410b<CashInSenderView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final MainTransferView mainTransferView;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucherSenderPresenter(MainTransferView mainTransferView, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.mainTransferView = mainTransferView;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logSenderEntryEvent(String str, String str2, User user) {
        Analytics $r4 = this.analytics;
        $r4.onVoucherSenderInfoEntered(str, str2, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: navigateToVoucherCreationPage$lambda-1  reason: not valid java name */
    public static final void m41702navigateToVoucherCreationPage$lambda1(CreateVoucherSenderPresenter createVoucherSenderPresenter, String str, String str2, VoucherCashInRequest voucherCashInRequest, User user) {
        Log_OC.getArray(createVoucherSenderPresenter, "this$0");
        String $r6 = str == null ? "" : str;
        String $r5 = str2 != null ? str2 : "";
        Log_OC.loadImage(user, "it");
        createVoucherSenderPresenter.logSenderEntryEvent($r6, $r5, user);
        VoucherCashInRequest $r1 = voucherCashInRequest == null ? null : VoucherCashInRequest.copy$default(voucherCashInRequest, str, str2, null, null, 0, 28, null);
        MainTransferView $r7 = createVoucherSenderPresenter.mainTransferView;
        $r7.navigateToSummaryPage($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-0  reason: not valid java name */
    public static final void m41704showError$lambda0(String str, CashInSenderView cashInSenderView) {
        Log_OC.getArray(cashInSenderView, "view");
        cashInSenderView.showError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showSenderNameError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = str;
                CashInSenderView $r3 = (CashInSenderView) obj;
                CreateVoucherSenderPresenter.m41705showSenderNameError$lambda3($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSenderNameError$lambda-3  reason: not valid java name */
    public static final void m41705showSenderNameError$lambda3(String str, CashInSenderView cashInSenderView) {
        Log_OC.getArray(cashInSenderView, "view");
        cashInSenderView.senderNameError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showSenderPhoneError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.ViewTarget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                String $r1 = str;
                CashInSenderView $r3 = (CashInSenderView) obj;
                CreateVoucherSenderPresenter.m41706showSenderPhoneError$lambda4($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSenderPhoneError$lambda-4  reason: not valid java name */
    public static final void m41706showSenderPhoneError$lambda4(String str, CashInSenderView cashInSenderView) {
        Log_OC.getArray(cashInSenderView, "view");
        cashInSenderView.senderPhoneError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean validateInfo(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            if (r1 == 0) goto L15
            java.lang.String r2 = "Please enter the Sender's Phone"
            r4.showSenderPhoneError(r2)
        L13:
            r3 = 0
            return r3
        L15:
            boolean r1 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r5)
            if (r1 != 0) goto L21
            java.lang.String r2 = "Please enter a valid Sender's Phone"
            r4.showSenderPhoneError(r2)
            goto L13
        L21:
            if (r6 == 0) goto L2c
            int r0 = r6.length()
            if (r0 != 0) goto L2a
            goto L2c
        L2a:
            r1 = 0
            goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L35
            java.lang.String r2 = "Please enter the Sender's Name"
            r4.showSenderNameError(r2)
            goto L13
        L35:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.voucher.cashin.presenter.CreateVoucherSenderPresenter.validateInfo(java.lang.String, java.lang.String):boolean");
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
    public final void navigateToAmountPage(VoucherCashInRequest voucherCashInRequest) {
        MainTransferView $r2 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToAmountPage$default($r2, voucherCashInRequest, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToVoucherCreationPage(final String str, final String str2, final VoucherCashInRequest voucherCashInRequest) {
        boolean $z0 = validateInfo(str, str2);
        if ($z0) {
            FetchCurrentUser $r4 = this.fetchCurrentUser;
            AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
            Object object = new Object() { // from class: ai.kudi.agent.voucher.cashin.presenter.Label
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateVoucherSenderPresenter $r1 = CreateVoucherSenderPresenter.this;
                    String $r2 = str;
                    String $r3 = str2;
                    VoucherCashInRequest $r42 = voucherCashInRequest;
                    User $r6 = (User) obj;
                    CreateVoucherSenderPresenter.m41702navigateToVoucherCreationPage$lambda1($r1, $r2, $r3, $r42, $r6);
                }
            };
            Target $r7 = Target.VIBRANT;
            FavoritesArrayAdapter $r8 = $r5.s(object, $r7);
            Log_OC.loadImage($r8, "fetchCurrentUser.execute()\n                .subscribe(\n                    {\n                        logSenderEntryEvent(senderPhone ?: \"\", senderName ?: \"\", it)\n                        val updatedRequest = request?.copy(\n                            senderPhoneNumber = senderPhone, senderName = senderName\n                        )\n                        mainTransferView.navigateToSummaryPage(updatedRequest)\n\n                    },\n                    { err -> err.printStackTrace() })");
            C11280b $r9 = this.compositeDisposable;
            RxExtKt.addTo($r8, $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.Font
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getSize(Object obj) {
                String $r1 = str;
                CashInSenderView $r3 = (CashInSenderView) obj;
                CreateVoucherSenderPresenter.m41704showError$lambda0($r1, $r3);
            }
        });
    }
}
