package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanRequest;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.views.OtpStatusType;
import ai.kudi.agent.kshock.presentation.viewdata.ApplyForLoanReviewViewData;
import ai.kudi.agent.kshock.usecases.OtpStatusCheck;
import ai.kudi.agent.kshock.usecases.PerformLoanRequest;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
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
/* compiled from: ApplyForLoanReviewViewModel.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/ApplyForLoanReviewViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/ApplyForLoanReviewViewData;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "performLoanRequest", "Lai/kudi/agent/kshock/usecases/PerformLoanRequest;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "app", "Landroid/app/Application;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "otpStatusCheck", "Lai/kudi/agent/kshock/usecases/OtpStatusCheck;", "(Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/kshock/usecases/PerformLoanRequest;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Landroid/app/Application;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/kshock/usecases/OtpStatusCheck;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", AttributeType.PHONE, "getPhone", "setPhone", "initialData", "isOtpRequired", "", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "loanSummaryAnalytics", "onPinEntered", "submitLoanApplication", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApplyForLoanReviewViewModel extends BaseViewModel<ApplyForLoanReviewViewData> {
    private final Analytics analytics;
    private String email;
    private final FetchCurrentUser fetchCurrentUser;
    private final KShockNavigator kShockNavigator;
    private final OtpStatusCheck otpStatusCheck;
    private final PerformLoanRequest performLoanRequest;
    private String phone;
    private final Application suggestions;

    public ApplyForLoanReviewViewModel(KShockNavigator kShockNavigator, PerformLoanRequest performLoanRequest, FetchCurrentUser fetchCurrentUser, Application application, Analytics analytics, OtpStatusCheck otpStatusCheck) {
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(performLoanRequest, "performLoanRequest");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(application, "app");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(otpStatusCheck, "otpStatusCheck");
        this.kShockNavigator = kShockNavigator;
        this.performLoanRequest = performLoanRequest;
        this.fetchCurrentUser = fetchCurrentUser;
        this.suggestions = application;
        this.analytics = analytics;
        this.otpStatusCheck = otpStatusCheck;
        this.phone = "";
        this.email = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isOtpRequired$lambda-5  reason: not valid java name */
    public static final InterfaceC11692s m39565isOtpRequired$lambda5(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, User user) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        applyForLoanReviewViewModel.setPhone($r2);
        String $r22 = user.getEmail();
        Log_OC.loadImage($r22, "it.email");
        applyForLoanReviewViewModel.setEmail($r22);
        OtpStatusCheck $r3 = applyForLoanReviewViewModel.otpStatusCheck;
        AbstractC11688p $r4 = $r3.isOtpRequired();
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isOtpRequired$lambda-6  reason: not valid java name */
    public static final void m39566isOtpRequired$lambda6(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, Interest interest, String str) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        ViewData $r3 = applyForLoanReviewViewModel.getState();
        ApplyForLoanReviewViewData $r4 = (ApplyForLoanReviewViewData) $r3;
        applyForLoanReviewViewModel.publish(ApplyForLoanReviewViewData.copy$default($r4, false, null, 2, null));
        OtpStatusType $r5 = OtpStatusType.REQUIRE_OTP;
        String $r6 = $r5.name();
        boolean $z0 = Log_OC.append(str, $r6);
        if (!$z0) {
            applyForLoanReviewViewModel.submitLoanApplication(interest);
            return;
        }
        KShockNavigator $r7 = applyForLoanReviewViewModel.kShockNavigator;
        String $r2 = applyForLoanReviewViewModel.getPhone();
        String $r62 = applyForLoanReviewViewModel.getEmail();
        $r7.toOtpVerification($r2, $r62, interest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: isOtpRequired$lambda-7  reason: not valid java name */
    public static final void m39567isOtpRequired$lambda7(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, Throwable th) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        ViewData $r2 = applyForLoanReviewViewModel.getState();
        ApplyForLoanReviewViewData $r3 = (ApplyForLoanReviewViewData) $r2;
        Application $r4 = applyForLoanReviewViewModel.suggestions;
        int $i0 = C0220R.string.loan_app_error;
        String $r5 = $r4.getString($i0);
        Log_OC.loadImage($r5, "app.getString(R.string.loan_app_error)");
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default($r5, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        applyForLoanReviewViewModel.publish($r3.copy(false, (String) $r7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loanSummaryAnalytics$lambda-0  reason: not valid java name */
    public static final void m39568loanSummaryAnalytics$lambda0(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, User user) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        applyForLoanReviewViewModel.setPhone($r2);
        Analytics $r3 = applyForLoanReviewViewModel.analytics;
        String $r22 = user.getPhoneNumber();
        Log_OC.loadImage($r22, "it.phoneNumber");
        $r3.onLoanSummary($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m39570submitLoanApplication$lambda2(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, Interest interest, User user) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        Log_OC.getArray(user, "it");
        PerformLoanRequest $r3 = applyForLoanReviewViewModel.performLoanRequest;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        double $d0 = interest.getAmount();
        LoanRequest $r5 = new LoanRequest($d0);
        AbstractC11688p $r6 = $r3.execute($r4, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-3  reason: not valid java name */
    public static final void m39571submitLoanApplication$lambda3(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, Interest interest, Loan loan) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        Log_OC.getArray(interest, "$interest");
        ViewData $r3 = applyForLoanReviewViewModel.getState();
        ApplyForLoanReviewViewData $r4 = (ApplyForLoanReviewViewData) $r3;
        applyForLoanReviewViewModel.publish(ApplyForLoanReviewViewData.copy$default($r4, false, null, 2, null));
        double $d0 = interest.getCharge();
        Double $r5 = Double.valueOf($d0);
        loan.setInitialInterest($r5);
        String $r6 = interest.getDueDate();
        loan.setDueDate($r6);
        Analytics $r7 = applyForLoanReviewViewModel.analytics;
        String $r62 = applyForLoanReviewViewModel.getPhone();
        $r7.onLoanApplicationSubmitted($r62);
        KShockNavigator $r8 = applyForLoanReviewViewModel.kShockNavigator;
        Log_OC.loadImage(loan, "it");
        $r8.toApplicationSubmittedFragment(loan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitLoanApplication$lambda-4  reason: not valid java name */
    public static final void m39572submitLoanApplication$lambda4(ApplyForLoanReviewViewModel applyForLoanReviewViewModel, Throwable th) {
        Log_OC.getArray(applyForLoanReviewViewModel, "this$0");
        ViewData $r2 = applyForLoanReviewViewModel.getState();
        ApplyForLoanReviewViewData $r3 = (ApplyForLoanReviewViewData) $r2;
        Application $r4 = applyForLoanReviewViewModel.suggestions;
        int $i0 = C0220R.string.loan_app_error;
        String $r5 = $r4.getString($i0);
        Log_OC.loadImage($r5, "app.getString(R.string.loan_app_error)");
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default($r5, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        applyForLoanReviewViewModel.publish($r3.copy(false, (String) $r7));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEmail() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhone() {
        String r1 = this.phone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ApplyForLoanReviewViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ApplyForLoanReviewViewData initialData() {
        ApplyForLoanReviewViewData $r1 = new ApplyForLoanReviewViewData(false, null, 3, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void isOtpRequired(final Interest interest) {
        Log_OC.getArray(interest, "interest");
        ViewData $r2 = getState();
        ApplyForLoanReviewViewData $r3 = (ApplyForLoanReviewViewData) $r2;
        publish(ApplyForLoanReviewViewData.copy$default($r3, true, null, 2, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = ApplyForLoanReviewViewModel.m39565isOtpRequired$lambda5($r1, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                Interest $r22 = interest;
                String $r42 = (String) obj;
                ApplyForLoanReviewViewModel.m39566isOtpRequired$lambda6($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.PacketExtensionFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ApplyForLoanReviewViewModel.m39567isOtpRequired$lambda7($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            phone = it.phoneNumber\n            email = it.email\n            otpStatusCheck.isOtpRequired()\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false))\n                if (it == OtpStatusType.REQUIRE_OTP.name) {\n                    kShockNavigator.toOtpVerification(phone, email, interest)\n                } else {\n                    submitLoanApplication(interest)\n                }\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = parseHttpError2(app.getString(R.string.loan_app_error))(it)\n                    )\n                )\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loanSummaryAnalytics() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.kshock.presentation.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ApplyForLoanReviewViewModel $r12 = ApplyForLoanReviewViewModel.this;
                User $r3 = (User) obj;
                ApplyForLoanReviewViewModel.m39568loanSummaryAnalytics$lambda0($r12, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute()\n            .subscribe(\n                {\n                    phone = it.phoneNumber\n                    analytics.onLoanSummary(it.phoneNumber)\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPinEntered() {
        Analytics $r1 = this.analytics;
        String $r2 = this.phone;
        $r1.onKShockPinEntered($r2);
    }

    public final void setEmail(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.email = str;
    }

    public final void setPhone(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phone = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitLoanApplication(final Interest interest) {
        Log_OC.getArray(interest, "interest");
        ViewData $r2 = getState();
        ApplyForLoanReviewViewData $r3 = (ApplyForLoanReviewViewData) $r2;
        publish($r3.copy(true, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                Interest $r22 = interest;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = ApplyForLoanReviewViewModel.m39570submitLoanApplication$lambda2($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                Interest $r22 = interest;
                Loan $r42 = (Loan) obj;
                ApplyForLoanReviewViewModel.m39571submitLoanApplication$lambda3($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ApplyForLoanReviewViewModel $r1 = ApplyForLoanReviewViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ApplyForLoanReviewViewModel.m39572submitLoanApplication$lambda4($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }
}
