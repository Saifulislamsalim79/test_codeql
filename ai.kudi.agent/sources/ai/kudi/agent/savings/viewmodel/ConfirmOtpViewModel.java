package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.data.model.RequestPinResetOtpResponse;
import ai.kudi.agent.savings.data.model.ResetSavingPinRequest;
import ai.kudi.agent.savings.data.model.ResetSavingPinResponse;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.model.WithdrawResponse;
import ai.kudi.agent.savings.data.repository.ConfirmOtpRepository;
import ai.kudi.agent.savings.data.viewdata.ConfirmOtpViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.savings.usecase.DeactivateSaving;
import ai.kudi.agent.savings.usecase.Withdraw;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.os.CountDownTimer;
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
/* compiled from: ConfirmOtpViewModel.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020\u0016J\b\u0010!\u001a\u00020\u0016H\u0014J\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/ConfirmOtpViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/ConfirmOtpViewData;", "savingsNavigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "confirmOtpRepository", "Lai/kudi/agent/savings/data/repository/ConfirmOtpRepository;", "createSavings", "Lai/kudi/agent/savings/usecase/CreateSavings;", "withdraw", "Lai/kudi/agent/savings/usecase/Withdraw;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "deactivateSaving", "Lai/kudi/agent/savings/usecase/DeactivateSaving;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/savings/data/repository/ConfirmOtpRepository;Lai/kudi/agent/savings/usecase/CreateSavings;Lai/kudi/agent/savings/usecase/Withdraw;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/savings/usecase/DeactivateSaving;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "countdownTimer", "Landroid/os/CountDownTimer;", "getSavingsNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "", "savingsRequest", "Lai/kudi/agent/savings/data/model/SavingsRequest;", "deactivateSavingPlan", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "initCountdownTimer", "initialData", "Lai/kudi/agent/savings/data/viewdata/ConfirmOtpViewData$Initial;", "navigateToDeactivateSavingsDialog", "navigateToSavingSuccessDialog", "onCleared", "resend", "resetPin", "Lai/kudi/agent/savings/data/model/ResetSavingPinRequest;", "withdrawSavings", "withdrawRequest", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmOtpViewModel extends BaseViewModel<ConfirmOtpViewData> {
    private final Analytics analytics;
    private final ConfirmOtpRepository confirmOtpRepository;
    private CountDownTimer countdownTimer;
    private final CreateSavings createSavings;
    private final FetchCurrentUser currentUser;
    private final DeactivateSaving deactivateSaving;
    private final SavingsNavigator savingsNavigator;
    private final Withdraw withdraw;

    public ConfirmOtpViewModel(SavingsNavigator savingsNavigator, ConfirmOtpRepository confirmOtpRepository, CreateSavings createSavings, Withdraw withdraw, Analytics analytics, DeactivateSaving deactivateSaving, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(savingsNavigator, "savingsNavigator");
        Log_OC.getArray(confirmOtpRepository, "confirmOtpRepository");
        Log_OC.getArray(createSavings, "createSavings");
        Log_OC.getArray(withdraw, "withdraw");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(deactivateSaving, "deactivateSaving");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        this.savingsNavigator = savingsNavigator;
        this.confirmOtpRepository = confirmOtpRepository;
        this.createSavings = createSavings;
        this.withdraw = withdraw;
        this.analytics = analytics;
        this.deactivateSaving = deactivateSaving;
        this.currentUser = fetchCurrentUser;
        initCountdownTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-4  reason: not valid java name */
    public static final void m40589createSavings$lambda4(ConfirmOtpViewModel confirmOtpViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        ConfirmOtpViewData.SavingsCreatedSuccess $r3 = ConfirmOtpViewData.SavingsCreatedSuccess.INSTANCE;
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-5  reason: not valid java name */
    public static final void m40590createSavings$lambda5(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-10  reason: not valid java name */
    public static final void m40591deactivateSavingPlan$lambda10(ConfirmOtpViewModel confirmOtpViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        Log_OC.loadImage(savingResponse, "it");
        ConfirmOtpViewData.DeactivatePlanSuccess $r3 = new ConfirmOtpViewData.DeactivatePlanSuccess(savingResponse);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-11  reason: not valid java name */
    public static final void m40592deactivateSavingPlan$lambda11(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError3$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-9  reason: not valid java name */
    public static final InterfaceC11692s m40593deactivateSavingPlan$lambda9(ConfirmOtpViewModel confirmOtpViewModel, UpdateSavingPlanRequest updateSavingPlanRequest, User user) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        Log_OC.getArray(updateSavingPlanRequest, "$request");
        Log_OC.getArray(user, "it");
        Analytics $r3 = confirmOtpViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        $r3.onDeactivateSavingsClicked($r4);
        DeactivateSaving $r5 = confirmOtpViewModel.deactivateSaving;
        AbstractC11688p $r6 = $r5.deactivate(updateSavingPlanRequest);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initCountdownTimer() {
        ConfirmOtpViewModel$initCountdownTimer$1 $r1 = new ConfirmOtpViewModel$initCountdownTimer$1(this);
        ConfirmOtpViewModel$initCountdownTimer$2 $r2 = new ConfirmOtpViewModel$initCountdownTimer$2(this);
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
    /* renamed from: resend$lambda-2  reason: not valid java name */
    public static final void m40594resend$lambda2(ConfirmOtpViewModel confirmOtpViewModel, RequestPinResetOtpResponse requestPinResetOtpResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        ConfirmOtpViewData.ResendComplete $r3 = ConfirmOtpViewData.ResendComplete.INSTANCE;
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resend$lambda-3  reason: not valid java name */
    public static final void m40595resend$lambda3(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-0  reason: not valid java name */
    public static final void m40596resetPin$lambda0(ConfirmOtpViewModel confirmOtpViewModel, ResetSavingPinResponse resetSavingPinResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        ConfirmOtpViewData.ResetPinSuccess $r3 = ConfirmOtpViewData.ResetPinSuccess.INSTANCE;
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: resetPin$lambda-1  reason: not valid java name */
    public static final void m40597resetPin$lambda1(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-6  reason: not valid java name */
    public static final InterfaceC11692s m40598withdrawSavings$lambda6(ConfirmOtpViewModel confirmOtpViewModel, WithdrawRequest withdrawRequest, User user) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        Log_OC.getArray(withdrawRequest, "$withdrawRequest");
        Log_OC.getArray(user, "it");
        Analytics $r3 = confirmOtpViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        $r3.onConfirmWithdraw(true, $r4);
        Withdraw $r5 = confirmOtpViewModel.withdraw;
        AbstractC11688p $r6 = $r5.withdraw(withdrawRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-7  reason: not valid java name */
    public static final void m40599withdrawSavings$lambda7(ConfirmOtpViewModel confirmOtpViewModel, WithdrawResponse withdrawResponse) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r3 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r3);
        SavingsNavigator $r0 = confirmOtpViewModel.getSavingsNavigator();
        $r0.showWithdrawSuccessDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-8  reason: not valid java name */
    public static final void m40600withdrawSavings$lambda8(ConfirmOtpViewModel confirmOtpViewModel, Throwable th) {
        Log_OC.getArray(confirmOtpViewModel, "this$0");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(false);
        confirmOtpViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError3$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ConfirmOtpViewData.Error $r3 = new ConfirmOtpViewData.Error($r6);
        confirmOtpViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createSavings(SavingsRequest savingsRequest) {
        Log_OC.getArray(savingsRequest, "savingsRequest");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        CreateSavings $r3 = this.createSavings;
        AbstractC11688p $r4 = $r3.createSavingGoal(savingsRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                ConfirmOtpViewModel.m40589createSavings$lambda4($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40590createSavings$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "createSavings.createSavingGoal(savingsRequest).subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.SavingsCreatedSuccess)\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void deactivateSavingPlan(final UpdateSavingPlanRequest updateSavingPlanRequest) {
        Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                UpdateSavingPlanRequest $r22 = updateSavingPlanRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = ConfirmOtpViewModel.m40593deactivateSavingPlan$lambda9($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                ConfirmOtpViewModel.m40591deactivateSavingPlan$lambda10($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.InBandBytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40592deactivateSavingPlan$lambda11($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute().flatMapObservable {\n            analytics.onDeactivateSavingsClicked(it.phoneNumber)\n            deactivateSaving.deactivate(request)\n        }.subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.DeactivatePlanSuccess(it))\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.Error(parseHttpError3()(it)))\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsNavigator getSavingsNavigator() {
        SavingsNavigator r1 = this.savingsNavigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        ConfirmOtpViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ConfirmOtpViewData.Initial initialData() {
        ConfirmOtpViewData.Initial r1 = ConfirmOtpViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToDeactivateSavingsDialog() {
        SavingsNavigator $r1 = this.savingsNavigator;
        $r1.showSavingsDeactivatedDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingSuccessDialog() {
        SavingsNavigator $r1 = this.savingsNavigator;
        $r1.navigateToSavingsSuccess();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        CountDownTimer $r1 = this.countdownTimer;
        if ($r1 != null) {
            $r1.cancel();
            super.onCleared();
            return;
        }
        Log_OC.LogError("countdownTimer");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resend() {
        initCountdownTimer();
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        ConfirmOtpRepository $r3 = this.confirmOtpRepository;
        AbstractC11688p $r4 = $r3.resendPin();
        FavoritesArrayAdapter $r6 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.Composer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                RequestPinResetOtpResponse $r32 = (RequestPinResetOtpResponse) obj;
                ConfirmOtpViewModel.m40594resend$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.InFileObjectPersister$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40595resend$lambda3($r1, $r32);
            }
        });
        Log_OC.loadImage($r6, "confirmOtpRepository.resendPin().subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.ResendComplete)\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        RxExtKt.addTo($r6, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void resetPin(ResetSavingPinRequest resetSavingPinRequest) {
        Log_OC.getArray(resetSavingPinRequest, TransactionRequest.TYPE_REQUEST);
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        ConfirmOtpRepository $r3 = this.confirmOtpRepository;
        AbstractC11688p $r4 = $r3.resetPin(resetSavingPinRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                ResetSavingPinResponse $r32 = (ResetSavingPinResponse) obj;
                ConfirmOtpViewModel.m40596resetPin$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40597resetPin$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "confirmOtpRepository.resetPin(request).subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.ResetPinSuccess)\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(false))\n                publish(ConfirmOtpViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void withdrawSavings(final WithdrawRequest withdrawRequest) {
        Log_OC.getArray(withdrawRequest, "withdrawRequest");
        ConfirmOtpViewData.ShowProgress $r2 = new ConfirmOtpViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                WithdrawRequest $r22 = withdrawRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = ConfirmOtpViewModel.m40598withdrawSavings$lambda6($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                WithdrawResponse $r32 = (WithdrawResponse) obj;
                ConfirmOtpViewModel.m40599withdrawSavings$lambda7($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.MessageTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ConfirmOtpViewModel $r1 = ConfirmOtpViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ConfirmOtpViewModel.m40600withdrawSavings$lambda8($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute().flatMapObservable {\n            analytics.onConfirmWithdraw(true, it.phoneNumber)\n            withdraw.withdraw(withdrawRequest)\n        }.subscribe(\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                savingsNavigator.showWithdrawSuccessDialog()\n            },\n            {\n                publish(ConfirmOtpViewData.ShowProgress(visibility = false))\n                publish(ConfirmOtpViewData.Error(parseHttpError3()(it)))\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }
}
