package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.data.model.InterestResponse;
import ai.kudi.agent.kshock.data.model.LoanRequest;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.presentation.viewdata.ApplyForLoanViewData;
import ai.kudi.agent.kshock.usecases.FetchLoanInterest;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
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
/* compiled from: ApplyForLoanViewModel.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u001f\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/ApplyForLoanViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/ApplyForLoanViewData;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "fetchLoanInterest", "Lai/kudi/agent/kshock/usecases/FetchLoanInterest;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "app", "Landroid/app/Application;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/kshock/usecases/FetchLoanInterest;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Landroid/app/Application;Lai/kudi/agent/core/analytics/Analytics;)V", "initialData", "isInputParamsValid", "", TransactionField.AMOUNT, "", "maxAmt", "onNext", "", "maxLoanAmount", "(Ljava/lang/Double;Ljava/lang/Double;)V", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ApplyForLoanViewModel extends BaseViewModel<ApplyForLoanViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLoanInterest fetchLoanInterest;
    private final KShockNavigator kShockNavigator;
    private final Application suggestions;

    public ApplyForLoanViewModel(KShockNavigator kShockNavigator, FetchLoanInterest fetchLoanInterest, FetchCurrentUser fetchCurrentUser, Application application, Analytics analytics) {
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(fetchLoanInterest, "fetchLoanInterest");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(application, "app");
        Log_OC.getArray(analytics, "analytics");
        this.kShockNavigator = kShockNavigator;
        this.fetchLoanInterest = fetchLoanInterest;
        this.fetchCurrentUser = fetchCurrentUser;
        this.suggestions = application;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNext$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39574onNext$lambda0(ApplyForLoanViewModel applyForLoanViewModel, Double d, User user) {
        Log_OC.getArray(applyForLoanViewModel, "this$0");
        Log_OC.getArray(user, "it");
        Analytics $r3 = applyForLoanViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        double $d0 = d.doubleValue();
        $r3.onLoanAmountEntered($r4, $d0);
        FetchLoanInterest $r5 = applyForLoanViewModel.fetchLoanInterest;
        String $r42 = user.getSessionId();
        Log_OC.loadImage($r42, "it.sessionId");
        double $d02 = d.doubleValue();
        LoanRequest $r6 = new LoanRequest($d02);
        AbstractC11688p $r7 = $r5.execute($r42, $r6);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNext$lambda-1  reason: not valid java name */
    public static final void m39575onNext$lambda1(ApplyForLoanViewModel applyForLoanViewModel, InterestResponse interestResponse) {
        Log_OC.getArray(applyForLoanViewModel, "this$0");
        ViewData $r2 = applyForLoanViewModel.getState();
        ApplyForLoanViewData $r3 = (ApplyForLoanViewData) $r2;
        applyForLoanViewModel.publish(ApplyForLoanViewData.copy$default($r3, false, null, 2, null));
        KShockNavigator $r4 = applyForLoanViewModel.kShockNavigator;
        Interest $r5 = interestResponse.getData();
        $r4.toLoanApplicationReviewFragment($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNext$lambda-2  reason: not valid java name */
    public static final void m39576onNext$lambda2(ApplyForLoanViewModel applyForLoanViewModel, Throwable th) {
        Log_OC.getArray(applyForLoanViewModel, "this$0");
        ViewData $r3 = applyForLoanViewModel.getState();
        ApplyForLoanViewData $r4 = (ApplyForLoanViewData) $r3;
        Application $r5 = applyForLoanViewModel.suggestions;
        int $i0 = C0220R.string.kshock_loan_charges_error;
        String $r6 = $r5.getString($i0);
        Log_OC.loadImage($r6, "app.getString(R.string.kshock_loan_charges_error)");
        InterfaceC11767l $r7 = KudiErrorParserKt.parseHttpError2$default($r6, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r8 = $r7.invoke(th);
        ApplyForLoanViewData.Error $r1 = new ApplyForLoanViewData.Error(null, (String) $r8, 1, null);
        applyForLoanViewModel.publish($r4.copy(false, $r1));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ApplyForLoanViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ApplyForLoanViewData initialData() {
        ApplyForLoanViewData $r1 = new ApplyForLoanViewData(false, null, 3, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isInputParamsValid(double d, double d2) {
        if (d > d2) {
            ViewData $r2 = getState();
            ApplyForLoanViewData $r3 = (ApplyForLoanViewData) $r2;
            Application $r4 = this.suggestions;
            int $i1 = C0220R.string.enter_valid_amount;
            String $r5 = $r4.getString($i1);
            ApplyForLoanViewData.Error $r1 = new ApplyForLoanViewData.Error($r5, null, 2, null);
            publish($r3.copy(false, $r1));
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onNext(final Double d, Double d2) {
        double $d1 = d == null ? 0.0d : d.doubleValue();
        double $d0 = d2 != null ? d2.doubleValue() : 0.0d;
        boolean $z0 = isInputParamsValid($d1, $d0);
        if ($z0) {
            if (d == null) {
                ViewData $r3 = getState();
                ApplyForLoanViewData $r4 = (ApplyForLoanViewData) $r3;
                Application $r6 = this.suggestions;
                int $i0 = C0220R.string.enter_valid_amount;
                String $r7 = $r6.getString($i0);
                ApplyForLoanViewData.Error $r5 = new ApplyForLoanViewData.Error($r7, null, 2, null);
                publish(ApplyForLoanViewData.copy$default($r4, false, $r5, 1, null));
                return;
            }
            ViewData $r32 = getState();
            ApplyForLoanViewData $r42 = (ApplyForLoanViewData) $r32;
            publish($r42.copy(true, null));
            FetchCurrentUser $r8 = this.fetchCurrentUser;
            AbstractC11696w $r9 = FetchCurrentUser.execute$default($r8, null, null, 3, null);
            AbstractC11688p $r11 = $r9.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.SignatureWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    ApplyForLoanViewModel $r1 = ApplyForLoanViewModel.this;
                    Double $r2 = d;
                    User $r52 = (User) obj;
                    InterfaceC11692s $r33 = ApplyForLoanViewModel.m39574onNext$lambda0($r1, $r2, $r52);
                    return $r33;
                }
            });
            FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.SubjectSubscriptionManager$SubjectObserver
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ApplyForLoanViewModel $r1 = ApplyForLoanViewModel.this;
                    InterestResponse $r33 = (InterestResponse) obj;
                    ApplyForLoanViewModel.m39575onNext$lambda1($r1, $r33);
                }
            }, new Object() { // from class: ai.kudi.agent.kshock.presentation.OperatorDebounceWithTime$1$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    ApplyForLoanViewModel $r1 = ApplyForLoanViewModel.this;
                    Throwable $r33 = (Throwable) obj;
                    ApplyForLoanViewModel.m39576onNext$lambda2($r1, $r33);
                }
            });
            Log_OC.loadImage($r14, "fetchCurrentUser.execute().flatMapObservable {\n            analytics.onLoanAmountEntered(it.phoneNumber, amount)\n            fetchLoanInterest.execute(it.sessionId, LoanRequest(amount))\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false))\n                kShockNavigator.toLoanApplicationReviewFragment(it.data)\n            },\n            {\n                publish(\n                    state.copy(\n                        isLoading = false,\n                        error = ApplyForLoanViewData.Error(\n                            message = parseHttpError2(genericResponse = app.getString(R.string.kshock_loan_charges_error))(it)\n                        )\n                    )\n                )\n            }\n        )");
            C11280b $r15 = getCompositeDisposable();
            RxExtKt.addTo($r14, $r15);
        }
    }
}
