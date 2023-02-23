package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.model.WithdrawResponse;
import ai.kudi.agent.savings.data.viewdata.WithdrawSavingsViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.Withdraw;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
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
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WithdrawSavingsViewModel.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/WithdrawSavingsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/WithdrawSavingsViewData;", "withdraw", "Lai/kudi/agent/savings/usecase/Withdraw;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/savings/usecase/Withdraw;Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getUserCategory", "", "initialData", "Lai/kudi/agent/savings/data/viewdata/WithdrawSavingsViewData$Initial;", "navigateToCreateSavingsPinFragment", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "showAmountError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showWithdrawSuccessDialog", "withdrawSavings", "withdrawRequest", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WithdrawSavingsViewModel extends BaseViewModel<WithdrawSavingsViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final SavingsNavigator navigator;
    private final Withdraw withdraw;

    public WithdrawSavingsViewModel(Withdraw withdraw, SavingsNavigator savingsNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(withdraw, "withdraw");
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        this.withdraw = withdraw;
        this.navigator = savingsNavigator;
        this.analytics = analytics;
        this.currentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUserCategory$lambda-3  reason: not valid java name */
    public static final void m40650getUserCategory$lambda3(WithdrawSavingsViewModel withdrawSavingsViewModel, User user) {
        Log_OC.getArray(withdrawSavingsViewModel, "this$0");
        String $r2 = user.getSavingsCategory();
        SavingsPlanAdapter.UserCategory $r3 = SavingsPlanAdapter.UserCategory.EXISTING_USER;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        WithdrawSavingsViewData.User $r5 = new WithdrawSavingsViewData.User($z0);
        withdrawSavingsViewModel.publish($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40652withdrawSavings$lambda0(WithdrawSavingsViewModel withdrawSavingsViewModel, WithdrawRequest withdrawRequest, User user) {
        Log_OC.getArray(withdrawSavingsViewModel, "this$0");
        Log_OC.getArray(withdrawRequest, "$withdrawRequest");
        Log_OC.getArray(user, "it");
        Analytics $r3 = withdrawSavingsViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        $r3.onConfirmWithdraw(true, $r4);
        Withdraw $r5 = withdrawSavingsViewModel.withdraw;
        AbstractC11688p $r6 = $r5.withdraw(withdrawRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-1  reason: not valid java name */
    public static final void m40653withdrawSavings$lambda1(WithdrawSavingsViewModel withdrawSavingsViewModel, WithdrawResponse withdrawResponse) {
        Log_OC.getArray(withdrawSavingsViewModel, "this$0");
        WithdrawSavingsViewData.ShowProgress $r2 = new WithdrawSavingsViewData.ShowProgress(false);
        withdrawSavingsViewModel.publish($r2);
        Log_OC.loadImage(withdrawResponse, "it");
        WithdrawSavingsViewData.Success $r3 = new WithdrawSavingsViewData.Success(withdrawResponse);
        withdrawSavingsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: withdrawSavings$lambda-2  reason: not valid java name */
    public static final void m40654withdrawSavings$lambda2(WithdrawSavingsViewModel withdrawSavingsViewModel, Throwable th) {
        Log_OC.getArray(withdrawSavingsViewModel, "this$0");
        WithdrawSavingsViewData.ShowProgress $r2 = new WithdrawSavingsViewData.ShowProgress(false);
        withdrawSavingsViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError3$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        WithdrawSavingsViewData.Error $r3 = new WithdrawSavingsViewData.Error($r6);
        withdrawSavingsViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getUserCategory() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.savings.viewmodel.ThreadFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawSavingsViewModel $r12 = WithdrawSavingsViewModel.this;
                User $r3 = (User) obj;
                WithdrawSavingsViewModel.m40650getUserCategory$lambda3($r12, $r3);
            }
        };
        Country $r4 = Country.f1284TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                val isExistingUser = it.savingsCategory == SavingsPlanAdapter.UserCategory.EXISTING_USER.name\n                publish(WithdrawSavingsViewData.User(isExistingUser))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        WithdrawSavingsViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public WithdrawSavingsViewData.Initial initialData() {
        WithdrawSavingsViewData.Initial r1 = WithdrawSavingsViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToCreateSavingsPinFragment(WithdrawRequest withdrawRequest) {
        Log_OC.getArray(withdrawRequest, TransactionRequest.TYPE_REQUEST);
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToCreateSavingsPinFragment(withdrawRequest);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showAmountError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        WithdrawSavingsViewData.AmountError $r2 = new WithdrawSavingsViewData.AmountError(str);
        publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showWithdrawSuccessDialog() {
        SavingsNavigator $r1 = this.navigator;
        $r1.showWithdrawSuccessDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void withdrawSavings(final WithdrawRequest withdrawRequest) {
        Log_OC.getArray(withdrawRequest, "withdrawRequest");
        WithdrawSavingsViewData.ShowProgress $r2 = new WithdrawSavingsViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.XYPlot
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                WithdrawSavingsViewModel $r1 = WithdrawSavingsViewModel.this;
                WithdrawRequest $r22 = withdrawRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = WithdrawSavingsViewModel.m40652withdrawSavings$lambda0($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawSavingsViewModel $r1 = WithdrawSavingsViewModel.this;
                WithdrawResponse $r32 = (WithdrawResponse) obj;
                WithdrawSavingsViewModel.m40653withdrawSavings$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                WithdrawSavingsViewModel $r1 = WithdrawSavingsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                WithdrawSavingsViewModel.m40654withdrawSavings$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute().flatMapObservable {\n            analytics.onConfirmWithdraw(true, it.phoneNumber)\n            withdraw.withdraw(withdrawRequest)\n        }.subscribe(\n            {\n                publish(WithdrawSavingsViewData.ShowProgress(visibility = false))\n                publish(WithdrawSavingsViewData.Success(it))\n            },\n            {\n                publish(WithdrawSavingsViewData.ShowProgress(visibility = false))\n                publish(WithdrawSavingsViewData.Error(parseHttpError3()(it)))\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }
}
