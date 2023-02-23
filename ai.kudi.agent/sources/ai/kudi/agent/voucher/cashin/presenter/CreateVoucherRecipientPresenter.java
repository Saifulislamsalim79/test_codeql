package ai.kudi.agent.voucher.cashin.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.view.CashInRecipientView;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreateVoucherRecipientPresenter.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0002J.\u0010\u001c\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/voucher/cashin/presenter/CreateVoucherRecipientPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/voucher/cashin/view/CashInRecipientView;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "logRecipientEntryEvent", "phoneNumber", "", "name", "user", "Lai/kudi/agent/users/domain/dto/User;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showRecipientNameError", "showRecipientPhoneError", "validateInfo", "", "recipientPhone", "recipientName", "voucherRequest", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "isFromSummaryPage", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateVoucherRecipientPresenter extends C9410b<CashInRecipientView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final MainTransferView mainTransferView;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CreateVoucherRecipientPresenter(MainTransferView mainTransferView, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.mainTransferView = mainTransferView;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showError$lambda-0  reason: not valid java name */
    public static final void m41696showError$lambda0(String str, CashInRecipientView cashInRecipientView) {
        Log_OC.getArray(cashInRecipientView, "view");
        cashInRecipientView.showError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showRecipientNameError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: f */
            public final void m38107f(Object obj) {
                String $r1 = str;
                CashInRecipientView $r3 = (CashInRecipientView) obj;
                CreateVoucherRecipientPresenter.m41697showRecipientNameError$lambda2($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRecipientNameError$lambda-2  reason: not valid java name */
    public static final void m41697showRecipientNameError$lambda2(String str, CashInRecipientView cashInRecipientView) {
        Log_OC.getArray(cashInRecipientView, "view");
        cashInRecipientView.showRecipientNameError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showRecipientPhoneError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void warn(Object obj) {
                String $r1 = str;
                CashInRecipientView $r3 = (CashInRecipientView) obj;
                CreateVoucherRecipientPresenter.m41698showRecipientPhoneError$lambda1($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRecipientPhoneError$lambda-1  reason: not valid java name */
    public static final void m41698showRecipientPhoneError$lambda1(String str, CashInRecipientView cashInRecipientView) {
        Log_OC.getArray(cashInRecipientView, "view");
        cashInRecipientView.showRecipientPhoneError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[RETURN] */
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
            java.lang.String r2 = "Please enter the Recipient's Phone"
            r4.showRecipientPhoneError(r2)
        L13:
            r3 = 0
            return r3
        L15:
            kotlin.p483e0.p485d.Log_OC.append(r5)
            boolean r1 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r5)
            if (r1 != 0) goto L24
            java.lang.String r2 = "Please enter a valid Recipient's Phone"
            r4.showRecipientPhoneError(r2)
            goto L13
        L24:
            if (r6 == 0) goto L2f
            int r0 = r6.length()
            if (r0 != 0) goto L2d
            goto L2f
        L2d:
            r1 = 0
            goto L30
        L2f:
            r1 = 1
        L30:
            if (r1 == 0) goto L38
            java.lang.String r2 = "Please enter the Recipient's Name"
            r4.showRecipientNameError(r2)
            goto L13
        L38:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.voucher.cashin.presenter.CreateVoucherRecipientPresenter.validateInfo(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void voucherRequest$default(CreateVoucherRecipientPresenter createVoucherRecipientPresenter, String str, String str2, VoucherCashInRequest voucherCashInRequest, boolean $z0, int i, Object obj) {
        int $i0 = i & 8;
        if ($i0 != 0) {
            $z0 = false;
        }
        createVoucherRecipientPresenter.voucherRequest(str, str2, voucherCashInRequest, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: voucherRequest$lambda-3  reason: not valid java name */
    public static final void m41699voucherRequest$lambda3(CreateVoucherRecipientPresenter createVoucherRecipientPresenter, String str, String str2, VoucherCashInRequest voucherCashInRequest, boolean z, User user) {
        Log_OC.getArray(createVoucherRecipientPresenter, "this$0");
        String $r7 = str == null ? "" : str;
        String $r6 = str2 != null ? str2 : "";
        Log_OC.loadImage(user, "it");
        createVoucherRecipientPresenter.logRecipientEntryEvent($r7, $r6, user);
        if (voucherCashInRequest == null) {
            VoucherCashInRequest $r4 = new VoucherCashInRequest(null, null, str, str2, 0, 19, null);
            MainTransferView $r8 = createVoucherRecipientPresenter.mainTransferView;
            MainTransferView.DefaultImpls.navigateToAmountPage$default($r8, $r4, false, 2, null);
            return;
        }
        VoucherCashInRequest $r1 = VoucherCashInRequest.copy$default(voucherCashInRequest, null, null, str, str2, 0, 19, null);
        if (z) {
            MainTransferView $r82 = createVoucherRecipientPresenter.mainTransferView;
            $r82.navigateToSummaryPage(voucherCashInRequest);
            return;
        }
        MainTransferView $r83 = createVoucherRecipientPresenter.mainTransferView;
        MainTransferView.DefaultImpls.navigateToAmountPage$default($r83, $r1, false, 2, null);
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
    public final void logRecipientEntryEvent(String str, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "name");
        Log_OC.getArray(user, "user");
        Analytics $r4 = this.analytics;
        $r4.onVoucherRecipientInfoEntered(str, str2, user);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(final String str) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.voucher.cashin.presenter.Game
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void play(Object obj) {
                String $r1 = str;
                CashInRecipientView $r3 = (CashInRecipientView) obj;
                CreateVoucherRecipientPresenter.m41696showError$lambda0($r1, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void voucherRequest(final String str, final String str2, final VoucherCashInRequest voucherCashInRequest, final boolean z) {
        boolean $z1 = validateInfo(str, str2);
        if ($z1) {
            FetchCurrentUser $r5 = this.fetchCurrentUser;
            AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
            Object object = new Object() { // from class: ai.kudi.agent.voucher.cashin.presenter.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CreateVoucherRecipientPresenter $r2 = CreateVoucherRecipientPresenter.this;
                    String $r3 = str;
                    String $r4 = str2;
                    VoucherCashInRequest $r52 = voucherCashInRequest;
                    boolean $z0 = z;
                    User $r62 = (User) obj;
                    CreateVoucherRecipientPresenter.m41699voucherRequest$lambda3($r2, $r3, $r4, $r52, $z0, $r62);
                }
            };
            Chunk $r7 = Chunk.NEWLINE;
            FavoritesArrayAdapter $r8 = $r6.s(object, $r7);
            Log_OC.loadImage($r8, "fetchCurrentUser.execute()\n                .subscribe({\n                    logRecipientEntryEvent(\n                        recipientPhone ?: \"\", recipientName ?: \"\",\n                        it\n                    )\n                    if (request != null) {\n                        val updatedRequest = request.copy(\n                            recipientPhoneNumber = recipientPhone,\n                            recipientName = recipientName\n                        )\n                        if (isFromSummaryPage) {\n                            mainTransferView.navigateToSummaryPage(request)\n                        } else {\n                            mainTransferView.navigateToAmountPage(updatedRequest)\n                        }\n                    } else {\n                        val newRequest = VoucherCashInRequest(\n                            recipientPhoneNumber = recipientPhone,\n                            recipientName = recipientName\n                        )\n                        mainTransferView.navigateToAmountPage(newRequest)\n                    }\n\n                }, { err -> err.printStackTrace() })");
            C11280b $r9 = this.compositeDisposable;
            RxExtKt.addTo($r8, $r9);
        }
    }
}
