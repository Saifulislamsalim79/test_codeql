package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.kshock.data.model.Data;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanRequest;
import ai.kudi.agent.kshock.data.model.VerifyOtpRequest;
import ai.kudi.agent.kshock.data.model.VerifyOtpResponse;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.presentation.viewdata.OtpVerificationViewData;
import ai.kudi.agent.kshock.usecases.OtpStatusCheck;
import ai.kudi.agent.kshock.usecases.PerformLoanRequest;
import ai.kudi.agent.kshock.usecases.VerifyOtp;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.os.CountDownTimer;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: OtpVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u0018J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/OtpVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/OtpVerificationViewData;", "verifyOtp", "Lai/kudi/agent/kshock/usecases/VerifyOtp;", "otpStatusCheck", "Lai/kudi/agent/kshock/usecases/OtpStatusCheck;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "performLoanRequest", "Lai/kudi/agent/kshock/usecases/PerformLoanRequest;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "res", "Lai/kudi/agent/core/util/ResourceDelegate;", "(Lai/kudi/agent/kshock/usecases/VerifyOtp;Lai/kudi/agent/kshock/usecases/OtpStatusCheck;Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/kshock/usecases/PerformLoanRequest;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/core/util/ResourceDelegate;)V", "countdownTimer", "Landroid/os/CountDownTimer;", "otpCountDownTimer", "", AttributeType.PHONE, "initCountdownTimer", "", "initialData", "Lai/kudi/agent/kshock/presentation/viewdata/OtpVerificationViewData$Initial;", "resendOrCheckStatus", "submitLoanApplication", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "otp", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.OtpVerificationViewModel */
/* loaded from: classes.dex */
public final class OtpVerificationViewModel extends BaseViewModel<OtpVerificationViewData> {
    private final Analytics analytics;
    private CountDownTimer countdownTimer;
    private final FetchCurrentUser currentUser;
    private final KShockNavigator kShockNavigator;
    private String otpCountDownTimer;
    private final OtpStatusCheck otpStatusCheck;
    private final PerformLoanRequest performLoanRequest;
    private String phone;
    private final ResourceDelegate suggestions;
    private final VerifyOtp verifyOtp;

    public OtpVerificationViewModel(VerifyOtp verifyOtp, OtpStatusCheck otpStatusCheck, KShockNavigator kShockNavigator, PerformLoanRequest performLoanRequest, FetchCurrentUser fetchCurrentUser, Analytics analytics, ResourceDelegate resourceDelegate) {
        Log_OC.getArray(verifyOtp, "verifyOtp");
        Log_OC.getArray(otpStatusCheck, "otpStatusCheck");
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(performLoanRequest, "performLoanRequest");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(resourceDelegate, "res");
        this.verifyOtp = verifyOtp;
        this.otpStatusCheck = otpStatusCheck;
        this.kShockNavigator = kShockNavigator;
        this.performLoanRequest = performLoanRequest;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.suggestions = resourceDelegate;
        this.phone = "";
        this.otpCountDownTimer = "";
        initCountdownTimer();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCountdownTimer() {
        OtpVerificationViewModel$initCountdownTimer$1 $r1 = new OtpVerificationViewModel$initCountdownTimer$1(this);
        OtpVerificationViewModel$initCountdownTimer$2 $r2 = new OtpVerificationViewModel$initCountdownTimer$2(this);
        CountDownTimer $r3 = RandomUtilKt.initCountDownTimer(300000L, 1000L, $r1, $r2);
        this.countdownTimer = $r3;
        if ($r3 != null) {
            $r3.start();
            return;
        }
        Log_OC.LogError("countdownTimer");
        NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
        throw r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOrCheckStatus$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m39666resendOrCheckStatus$lambda3(OtpVerificationViewModel otpVerificationViewModel, User user) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        Log_OC.getArray(user, "it");
        OtpStatusCheck $r3 = otpVerificationViewModel.otpStatusCheck;
        AbstractC11688p $r1 = $r3.isOtpRequired();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOrCheckStatus$lambda-4  reason: not valid java name */
    public static final void m39667resendOrCheckStatus$lambda4(OtpVerificationViewModel otpVerificationViewModel, String str) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        OtpVerificationViewData.ShowProgress $r2 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r2);
        OtpStatusType $r3 = OtpStatusType.REQUIRE_OTP;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append(str, $r4);
        if ($z0) {
            otpVerificationViewModel.initCountdownTimer();
            return;
        }
        OtpVerificationViewData.OtpState $r5 = new OtpVerificationViewData.OtpState(false);
        otpVerificationViewModel.publish($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resendOrCheckStatus$lambda-5  reason: not valid java name */
    public static final void m39668resendOrCheckStatus$lambda5(OtpVerificationViewModel otpVerificationViewModel, Throwable th) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        OtpVerificationViewData.ShowProgress $r2 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        OtpVerificationViewData.Error $r3 = new OtpVerificationViewData.Error($r6);
        otpVerificationViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitLoanApplication(final Interest interest) {
        OtpVerificationViewData.ShowProgress $r2 = new OtpVerificationViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.ui.views.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                Interest $r22 = interest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = OtpVerificationViewModel.m39669submitLoanApplication$lambda6($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.ui.views.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                Interest $r22 = interest;
                Loan $r42 = (Loan) obj;
                OtpVerificationViewModel.m39670submitLoanApplication$lambda7($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.ui.views.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OtpVerificationViewModel.m39671submitLoanApplication$lambda8($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m39669submitLoanApplication$lambda6(OtpVerificationViewModel otpVerificationViewModel, Interest interest, User user) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        Log_OC.getArray(user, "it");
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        otpVerificationViewModel.phone = $r3;
        PerformLoanRequest $r4 = otpVerificationViewModel.performLoanRequest;
        String $r32 = user.getSessionId();
        Log_OC.loadImage($r32, "it.sessionId");
        double $d0 = interest.getAmount();
        LoanRequest $r5 = new LoanRequest($d0);
        AbstractC11688p $r6 = $r4.execute($r32, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-7  reason: not valid java name */
    public static final void m39670submitLoanApplication$lambda7(OtpVerificationViewModel otpVerificationViewModel, Interest interest, Loan loan) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        OtpVerificationViewData.ShowProgress $r3 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r3);
        double $d0 = interest.getCharge();
        Double $r4 = Double.valueOf($d0);
        loan.setInitialInterest($r4);
        String $r5 = interest.getDueDate();
        loan.setDueDate($r5);
        Analytics $r6 = otpVerificationViewModel.analytics;
        String $r52 = otpVerificationViewModel.phone;
        $r6.onLoanApplicationSubmitted($r52);
        KShockNavigator $r7 = otpVerificationViewModel.kShockNavigator;
        Log_OC.loadImage(loan, "it");
        $r7.toApplicationSubmittedFragment(loan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-8  reason: not valid java name */
    public static final void m39671submitLoanApplication$lambda8(OtpVerificationViewModel otpVerificationViewModel, Throwable th) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        OtpVerificationViewData.ShowProgress $r2 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r2);
        ResourceDelegate $r4 = otpVerificationViewModel.suggestions;
        int $i0 = C0220R.string.loan_app_error;
        String $r5 = $r4.getString($i0);
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default($r5, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        String $r52 = (String) $r7;
        OtpVerificationViewData.Error $r3 = new OtpVerificationViewData.Error($r52);
        otpVerificationViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyOtp$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39672verifyOtp$lambda0(OtpVerificationViewModel otpVerificationViewModel, String str, User user) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        Log_OC.getArray(str, "$otp");
        Log_OC.getArray(user, "it");
        VerifyOtp $r3 = otpVerificationViewModel.verifyOtp;
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "it.phoneNumber");
        VerifyOtpRequest $r4 = new VerifyOtpRequest($r5, str);
        AbstractC11688p $r6 = $r3.confirmToken($r4);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyOtp$lambda-1  reason: not valid java name */
    public static final void m39673verifyOtp$lambda1(OtpVerificationViewModel otpVerificationViewModel, Interest interest, VerifyOtpResponse verifyOtpResponse) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        OtpVerificationViewData.ShowProgress $r3 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r3);
        Data $r4 = verifyOtpResponse.getData();
        boolean $z0 = $r4.isVerified();
        if (!$z0) {
            ResourceDelegate $r6 = otpVerificationViewModel.suggestions;
            int $i0 = C0220R.string.incorrect_otp;
            String $r7 = $r6.getString($i0);
            OtpVerificationViewData.OtpVerification $r5 = new OtpVerificationViewData.OtpVerification(false, $r7);
            otpVerificationViewModel.publish($r5);
            return;
        }
        ResourceDelegate $r62 = otpVerificationViewModel.suggestions;
        int $i02 = C0220R.string.correct_otp;
        String $r72 = $r62.getString($i02);
        OtpVerificationViewData.OtpVerification $r52 = new OtpVerificationViewData.OtpVerification(true, $r72);
        otpVerificationViewModel.publish($r52);
        otpVerificationViewModel.submitLoanApplication(interest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyOtp$lambda-2  reason: not valid java name */
    public static final void m39674verifyOtp$lambda2(OtpVerificationViewModel otpVerificationViewModel, Throwable th) {
        Log_OC.getArray(otpVerificationViewModel, "this$0");
        OtpVerificationViewData.ShowProgress $r2 = new OtpVerificationViewData.ShowProgress(false);
        otpVerificationViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        OtpVerificationViewData.Error $r3 = new OtpVerificationViewData.Error($r6);
        otpVerificationViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OtpVerificationViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OtpVerificationViewData.Initial initialData() {
        OtpVerificationViewData.Initial r1 = OtpVerificationViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resendOrCheckStatus() {
        OtpVerificationViewData.ShowProgress $r1 = new OtpVerificationViewData.ShowProgress(true);
        publish($r1);
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.ui.views.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OtpVerificationViewModel $r12 = OtpVerificationViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = OtpVerificationViewModel.m39666resendOrCheckStatus$lambda3($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.kshock.ui.views.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r12 = OtpVerificationViewModel.this;
                String $r32 = (String) obj;
                OtpVerificationViewModel.m39667resendOrCheckStatus$lambda4($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.ui.views.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r12 = OtpVerificationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OtpVerificationViewModel.m39668resendOrCheckStatus$lambda5($r12, $r32);
            }
        });
        Log_OC.loadImage($r8, "currentUser.execute().flatMapObservable {\n            otpStatusCheck.isOtpRequired()\n        }.subscribe(\n            {\n                publish(OtpVerificationViewData.ShowProgress(visibility = false))\n                if (it == OtpStatusType.REQUIRE_OTP.name) {\n                    initCountdownTimer()\n                } else {\n                    publish(OtpVerificationViewData.OtpState(isOtpRequired = false))\n                }\n            },\n            {\n                publish(OtpVerificationViewData.ShowProgress(visibility = false))\n                publish(OtpVerificationViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r9 = getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyOtp(final String str, final Interest interest) {
        Log_OC.getArray(str, "otp");
        Log_OC.getArray(interest, "interest");
        OtpVerificationViewData.ShowProgress $r3 = new OtpVerificationViewData.ShowProgress(true);
        publish($r3);
        FetchCurrentUser $r4 = this.currentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.ui.views.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = OtpVerificationViewModel.m39672verifyOtp$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.kshock.ui.views.Matrix
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                Interest $r2 = interest;
                VerifyOtpResponse $r42 = (VerifyOtpResponse) obj;
                OtpVerificationViewModel.m39673verifyOtp$lambda1($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.ui.views.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OtpVerificationViewModel $r1 = OtpVerificationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OtpVerificationViewModel.m39674verifyOtp$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "currentUser.execute().flatMapObservable {\n            verifyOtp.confirmToken(VerifyOtpRequest(it.phoneNumber, otp))\n        }.subscribe(\n            {\n                publish(OtpVerificationViewData.ShowProgress(visibility = false))\n                when {\n                    it.data.isVerified -> {\n                        publish(\n                            OtpVerificationViewData.OtpVerification(\n                                isVerified = true,\n                                message = res.getString(R.string.correct_otp)\n                            )\n                        )\n                        submitLoanApplication(interest)\n                    }\n                    else -> {\n                        publish(\n                            OtpVerificationViewData.OtpVerification(\n                                isVerified = false,\n                                message = res.getString(R.string.incorrect_otp)\n                            )\n                        )\n                    }\n                }\n            },\n            {\n                publish(OtpVerificationViewData.ShowProgress(visibility = false))\n                publish(OtpVerificationViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }
}
