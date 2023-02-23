package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: TransferToBankCustomerPresenter.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/transfer/presenter/TransferToBankCustomerPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transfer/views/TransferToBankCustomerView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/voucher/cashin/view/MainTransferView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "feesLookupDisposable", "Lio/reactivex/disposables/Disposable;", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "destroy", "", "fetchServiceFee", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "navigateToSummaryPage", "isUser", "", "validateFields", "agentPhoneNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBankCustomerPresenter extends C9410b<TransferToBankCustomerView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final PerformServiceFeeLookup feeLookup;
    private FavoritesArrayAdapter feesLookupDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final MainTransferView mainTransferView;
    private String phoneNumber;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBankCustomerPresenter(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, MainTransferView mainTransferView) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(mainTransferView, "mainTransferView");
        this.fetchCurrentUser = fetchCurrentUser;
        this.feeLookup = performServiceFeeLookup;
        this.analytics = analytics;
        this.mainTransferView = mainTransferView;
        this.phoneNumber = "";
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-12  reason: not valid java name */
    public static final void m41336fetchServiceFee$lambda12(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "view");
        transferToBankCustomerView.showServiceFeeLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-14  reason: not valid java name */
    public static final void m41337fetchServiceFee$lambda14(TransferToBankCustomerPresenter transferToBankCustomerPresenter, TransferToBankPayload transferToBankPayload, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(transferToBankCustomerPresenter, "this$0");
        Log_OC.getArray(transferToBankPayload, "$payload");
        ObjectId $r3 = ObjectId.ZEROID;
        transferToBankCustomerPresenter.ifViewAttached($r3);
        MainTransferView $r4 = transferToBankCustomerPresenter.mainTransferView;
        Boolean $r5 = Boolean.FALSE;
        String $r6 = feesLookupResponse.getServiceFee();
        TransferToBankPayload $r1 = TransferToBankPayload.copy$default(transferToBankPayload, null, null, null, null, null, null, $r5, null, null, null, $r6, null, null, 7103, null);
        MainTransferView.DefaultImpls.navigateToBankTransferSummaryPage$default($r4, $r1, false, 2, null);
        Analytics $r7 = transferToBankCustomerPresenter.analytics;
        String $r62 = transferToBankCustomerPresenter.getPhoneNumber();
        TransferToBankAnalytics.DefaultImpls.onPerformServiceFeeLookup$default($r7, $r62, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-14$lambda-13  reason: not valid java name */
    public static final void m41338fetchServiceFee$lambda14$lambda13(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "view");
        transferToBankCustomerView.hideServiceFeeLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-16  reason: not valid java name */
    public static final void m41339fetchServiceFee$lambda16(TransferToBankCustomerPresenter transferToBankCustomerPresenter, Throwable th) {
        Log_OC.getArray(transferToBankCustomerPresenter, "this$0");
        th.printStackTrace();
        Analytics $r2 = transferToBankCustomerPresenter.analytics;
        String $r3 = transferToBankCustomerPresenter.getPhoneNumber();
        String $r4 = th.getMessage();
        $r2.onPerformServiceFeeLookup($r3, false, $r4);
        UnsignedInteger $r5 = UnsignedInteger.ONE;
        transferToBankCustomerPresenter.ifViewAttached($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchServiceFee$lambda-16$lambda-15  reason: not valid java name */
    public static final void m41340fetchServiceFee$lambda16$lambda15(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "view");
        transferToBankCustomerView.hideServiceFeeLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: navigateToSummaryPage$lambda-0  reason: not valid java name */
    public static final void m41341navigateToSummaryPage$lambda0(TransferToBankCustomerPresenter transferToBankCustomerPresenter, TransferToBankPayload transferToBankPayload, boolean z, User user) {
        Log_OC.getArray(transferToBankCustomerPresenter, "this$0");
        Log_OC.getArray(transferToBankPayload, "$payload");
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        boolean $z0 = transferToBankCustomerPresenter.validateFields($r4, transferToBankPayload, z);
        if ($z0) {
            String $r42 = user.getPhoneNumber();
            Log_OC.loadImage($r42, "it.phoneNumber");
            transferToBankCustomerPresenter.setPhoneNumber($r42);
            Analytics $r3 = transferToBankCustomerPresenter.analytics;
            String $r43 = transferToBankCustomerPresenter.getPhoneNumber();
            String $r5 = transferToBankPayload.getReason();
            Log_OC.append($r5);
            TransferToBankAnalytics.DefaultImpls.onCustomerInfoEntered$default($r3, $r43, $r5, true, null, 8, null);
            transferToBankCustomerPresenter.fetchServiceFee(transferToBankPayload);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateFields(String str, TransferToBankPayload transferToBankPayload, boolean z) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        if (z) {
            Boolean $r3 = transferToBankPayload.getSendSMSToRecipient();
            Log_OC.append($r3);
            boolean $z04 = $r3.booleanValue();
            if ($z04) {
                String $r4 = transferToBankPayload.getPhoneNumber();
                Log_OC.append($r4);
                $z03 = C13276s.m5440u($r4);
                if ($z03) {
                    ISBNCheckDigit $r5 = ISBNCheckDigit.EXTERNAL;
                    ifViewAttached($r5);
                    return false;
                }
            }
            boolean $z05 = transferToBankPayload.getSendSMSToRecipient().booleanValue();
            if ($z05) {
                String $r42 = transferToBankPayload.getPhoneNumber();
                Log_OC.append($r42);
                boolean $z06 = StringExtKt.isNigerianPhoneNumber($r42);
                if (!$z06) {
                    Permission $r6 = Permission.NONE;
                    ifViewAttached($r6);
                    return false;
                }
            }
            boolean $z07 = Log_OC.append(str, transferToBankPayload.getPhoneNumber());
            if ($z07) {
                C0654b $r7 = C0654b.EXTERNAL;
                ifViewAttached($r7);
                return false;
            }
            return true;
        }
        String $r43 = transferToBankPayload.getSendersPhone();
        Log_OC.append($r43);
        $z0 = C13276s.m5440u($r43);
        if ($z0) {
            Device $r8 = Device.NONE;
            ifViewAttached($r8);
            return false;
        }
        boolean $z08 = StringExtKt.isNigerianPhoneNumber(transferToBankPayload.getSendersPhone());
        if (!$z08) {
            Target $r9 = Target.NONE;
            ifViewAttached($r9);
            return false;
        }
        Boolean $r32 = transferToBankPayload.getSendSMSToRecipient();
        Log_OC.append($r32);
        boolean $z09 = $r32.booleanValue();
        if ($z09) {
            String $r44 = transferToBankPayload.getPhoneNumber();
            Log_OC.append($r44);
            $z02 = C13276s.m5440u($r44);
            if ($z02) {
                RuleFieldValidator $r10 = RuleFieldValidator.RULE_VALIDATOR;
                ifViewAttached($r10);
                return false;
            }
        }
        boolean $z010 = transferToBankPayload.getSendSMSToRecipient().booleanValue();
        if ($z010) {
            String $r45 = transferToBankPayload.getPhoneNumber();
            Log_OC.append($r45);
            boolean $z011 = StringExtKt.isNigerianPhoneNumber($r45);
            if (!$z011) {
                Type $r11 = Type.MMS;
                ifViewAttached($r11);
                return false;
            }
        }
        boolean $z012 = Log_OC.append(str, transferToBankPayload.getSendersPhone());
        if ($z012) {
            Macro $r12 = Macro.BATTERY;
            ifViewAttached($r12);
            return false;
        }
        boolean $z013 = Log_OC.append(str, transferToBankPayload.getPhoneNumber());
        if ($z013) {
            RuleMemberValidator $r13 = RuleMemberValidator.RULE_VALIDATOR;
            ifViewAttached($r13);
            return false;
        }
        String $r1 = transferToBankPayload.getSendersPhone();
        boolean $z014 = Log_OC.append($r1, transferToBankPayload.getPhoneNumber());
        if ($z014) {
            Cache $r14 = Cache.NONE;
            ifViewAttached($r14);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-10  reason: not valid java name */
    public static final void m41343validateFields$lambda10(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("You cannot use your phone number. Please use the phone number of the recipient");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-11  reason: not valid java name */
    public static final void m41344validateFields$lambda11(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("You cannot use the same phone number as the sender's phone number.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-2  reason: not valid java name */
    public static final void m41345validateFields$lambda2(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("Please provide the phone number of the receiver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-3  reason: not valid java name */
    public static final void m41346validateFields$lambda3(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("Please provide a valid phone number");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-4  reason: not valid java name */
    public static final void m41347validateFields$lambda4(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("You cannot use your phone number. Please use the phone number of the recipient");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-5  reason: not valid java name */
    public static final void m41348validateFields$lambda5(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showSendersPhoneNumberError("Please provide the phone number of the sender");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-6  reason: not valid java name */
    public static final void m41349validateFields$lambda6(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showSendersPhoneNumberError("Please provide a valid phone number");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-7  reason: not valid java name */
    public static final void m41350validateFields$lambda7(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("Please provide the phone number of the receiver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-8  reason: not valid java name */
    public static final void m41351validateFields$lambda8(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showReceiversPhoneNumberError("Please provide a valid phone number");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateFields$lambda-9  reason: not valid java name */
    public static final void m41352validateFields$lambda9(TransferToBankCustomerView transferToBankCustomerView) {
        Log_OC.getArray(transferToBankCustomerView, "it");
        transferToBankCustomerView.showSendersPhoneNumberError("You can not use your phone number. Please use the phone number of the sender");
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
    public final void fetchServiceFee(final TransferToBankPayload transferToBankPayload) {
        Log_OC.getArray(transferToBankPayload, "payload");
        DiskLruCache$2 $r2 = DiskLruCache$2.ENV;
        ifViewAttached($r2);
        FavoritesArrayAdapter $r3 = this.feesLookupDisposable;
        if ($r3 != null) {
            $r3.backup();
        }
        PerformServiceFeeLookup $r4 = this.feeLookup;
        Integer $r6 = transferToBankPayload.getAmount();
        String $r7 = String.valueOf($r6);
        FeesLookupRequest $r5 = new FeesLookupRequest("transfer", $r7, "transfer");
        AbstractC11688p $r8 = $r4.execute($r5);
        this.feesLookupDisposable = $r8.e0(new Object() { // from class: ai.kudi.agent.transfer.presenter.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankCustomerPresenter $r1 = TransferToBankCustomerPresenter.this;
                TransferToBankPayload $r22 = transferToBankPayload;
                FeesLookupResponse $r42 = (FeesLookupResponse) obj;
                TransferToBankCustomerPresenter.m41337fetchServiceFee$lambda14($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transfer.presenter.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankCustomerPresenter $r1 = TransferToBankCustomerPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransferToBankCustomerPresenter.m41339fetchServiceFee$lambda16($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSummaryPage(final TransferToBankPayload transferToBankPayload, final boolean z) {
        Log_OC.getArray(transferToBankPayload, "payload");
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.presenter.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankCustomerPresenter $r1 = TransferToBankCustomerPresenter.this;
                TransferToBankPayload $r22 = transferToBankPayload;
                boolean $z0 = z;
                User $r4 = (User) obj;
                TransferToBankCustomerPresenter.m41341navigateToSummaryPage$lambda0($r1, $r22, $z0, $r4);
            }
        };
        Direction $r5 = Direction.f1794SE;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n            if (validateFields(it.phoneNumber, payload, isUser)) {\n                phoneNumber = it.phoneNumber\n                analytics.onCustomerInfoEntered(\n                    phoneNumber,\n                    payload.reason!!,\n                    true\n                )\n                fetchServiceFee(payload)\n            }\n        },\n            {\n            it.printStackTrace()\n        }\n        )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }
}
