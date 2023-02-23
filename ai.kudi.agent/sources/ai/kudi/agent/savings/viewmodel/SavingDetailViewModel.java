package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.RenewSavingRequest;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.viewdata.SavingDetailViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.usecase.DeactivateSaving;
import ai.kudi.agent.savings.usecase.RenewSaving;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: SavingDetailViewModel.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020 J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingDetailViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingDetailViewData;", "deactivateSaving", "Lai/kudi/agent/savings/usecase/DeactivateSaving;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "renewSaving", "Lai/kudi/agent/savings/usecase/RenewSaving;", "(Lai/kudi/agent/savings/usecase/DeactivateSaving;Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/savings/usecase/RenewSaving;)V", "deactivateSavingPlan", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "getUserCategory", "initialData", "Lai/kudi/agent/savings/data/viewdata/SavingDetailViewData$Initial;", "navigateToCreateSavingsPinFragment", "navigateToDeactivateSavingsDialog", "navigateToSavingSuccessDialog", "navigateToWithdraw", "balance", "", "id", "", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "renewSavingPlan", "Lai/kudi/agent/savings/data/model/RenewSavingRequest;", "showProgress", "visibility", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingDetailViewModel extends BaseViewModel<SavingDetailViewData> {
    private final Analytics analytics;
    private final DeactivateSaving deactivateSaving;
    private final FetchCurrentUser fetchCurrentUser;
    private final SavingsNavigator navigator;
    private final RenewSaving renewSaving;

    public SavingDetailViewModel(DeactivateSaving deactivateSaving, SavingsNavigator savingsNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics, RenewSaving renewSaving) {
        Log_OC.getArray(deactivateSaving, "deactivateSaving");
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(renewSaving, "renewSaving");
        this.deactivateSaving = deactivateSaving;
        this.navigator = savingsNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.renewSaving = renewSaving;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40619deactivateSavingPlan$lambda0(SavingDetailViewModel savingDetailViewModel, UpdateSavingPlanRequest updateSavingPlanRequest, User user) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        Log_OC.getArray(updateSavingPlanRequest, "$request");
        Log_OC.getArray(user, "it");
        Analytics $r3 = savingDetailViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        $r3.onDeactivateSavingsClicked($r4);
        DeactivateSaving $r5 = savingDetailViewModel.deactivateSaving;
        AbstractC11688p $r6 = $r5.deactivate(updateSavingPlanRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-1  reason: not valid java name */
    public static final void m40620deactivateSavingPlan$lambda1(SavingDetailViewModel savingDetailViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(false);
        savingDetailViewModel.publish($r2);
        Log_OC.loadImage(savingResponse, "it");
        SavingDetailViewData.Success $r3 = new SavingDetailViewData.Success(savingResponse, false, 2, null);
        savingDetailViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: deactivateSavingPlan$lambda-2  reason: not valid java name */
    public static final void m40621deactivateSavingPlan$lambda2(SavingDetailViewModel savingDetailViewModel, Throwable th) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(false);
        savingDetailViewModel.publish($r2);
        SavingDetailViewData.Error $r3 = SavingDetailViewData.Error.INSTANCE;
        savingDetailViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUserCategory$lambda-5  reason: not valid java name */
    public static final void m40622getUserCategory$lambda5(SavingDetailViewModel savingDetailViewModel, User user) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        String $r2 = user.getSavingsCategory();
        SavingsPlanAdapter.UserCategory $r3 = SavingsPlanAdapter.UserCategory.EXISTING_USER;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        SavingDetailViewData.User $r5 = new SavingDetailViewData.User($z0);
        savingDetailViewModel.publish($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: renewSavingPlan$lambda-3  reason: not valid java name */
    public static final void m40624renewSavingPlan$lambda3(SavingDetailViewModel savingDetailViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(false);
        savingDetailViewModel.publish($r2);
        Log_OC.loadImage(savingResponse, "it");
        SavingDetailViewData.Success $r3 = new SavingDetailViewData.Success(savingResponse, true);
        savingDetailViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: renewSavingPlan$lambda-4  reason: not valid java name */
    public static final void m40625renewSavingPlan$lambda4(SavingDetailViewModel savingDetailViewModel, Throwable th) {
        Log_OC.getArray(savingDetailViewModel, "this$0");
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(false);
        savingDetailViewModel.publish($r2);
        SavingDetailViewData.Error $r3 = SavingDetailViewData.Error.INSTANCE;
        savingDetailViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void deactivateSavingPlan(final UpdateSavingPlanRequest updateSavingPlanRequest) {
        Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingDetailViewModel $r1 = SavingDetailViewModel.this;
                UpdateSavingPlanRequest $r22 = updateSavingPlanRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = SavingDetailViewModel.m40619deactivateSavingPlan$lambda0($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.RoomListenerMultiplexor$RoomMultiplexFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingDetailViewModel $r1 = SavingDetailViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                SavingDetailViewModel.m40620deactivateSavingPlan$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.OfflineMessageManager$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingDetailViewModel $r1 = SavingDetailViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingDetailViewModel.m40621deactivateSavingPlan$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "fetchCurrentUser.execute().flatMapObservable {\n            analytics.onDeactivateSavingsClicked(it.phoneNumber)\n            deactivateSaving.deactivate(request)\n        }.subscribe(\n            {\n                publish(SavingDetailViewData.ShowProgress(visibility = false))\n                publish(SavingDetailViewData.Success(it))\n            },\n            {\n                publish(SavingDetailViewData.ShowProgress(visibility = false))\n                publish(SavingDetailViewData.Error)\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getUserCategory() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.savings.viewmodel.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingDetailViewModel $r12 = SavingDetailViewModel.this;
                User $r3 = (User) obj;
                SavingDetailViewModel.m40622getUserCategory$lambda5($r12, $r3);
            }
        };
        HttpStatus $r4 = HttpStatus.SYNCHRONIZED;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                val isExistingUser = it.savingsCategory == SavingsPlanAdapter.UserCategory.EXISTING_USER.name\n                publish(SavingDetailViewData.User(isExistingUser))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingDetailViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingDetailViewData.Initial initialData() {
        SavingDetailViewData.Initial r1 = SavingDetailViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToCreateSavingsPinFragment(UpdateSavingPlanRequest updateSavingPlanRequest) {
        Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToCreateSavingsPinFragment(updateSavingPlanRequest);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToDeactivateSavingsDialog() {
        SavingsNavigator $r1 = this.navigator;
        $r1.showSavingsDeactivatedDialog();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingSuccessDialog() {
        SavingsNavigator $r1 = this.navigator;
        $r1.navigateToSavingsSuccess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToWithdraw(int i, String str, SavingResponse savingResponse) {
        Log_OC.getArray(str, "id");
        Log_OC.getArray(savingResponse, "savingResponse");
        SavingsNavigator $r3 = this.navigator;
        $r3.navigateToWithdraw(i, str, savingResponse);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void renewSavingPlan(RenewSavingRequest renewSavingRequest) {
        Log_OC.getArray(renewSavingRequest, TransactionRequest.TYPE_REQUEST);
        SavingDetailViewData.ShowProgress $r2 = new SavingDetailViewData.ShowProgress(true);
        publish($r2);
        RenewSaving $r3 = this.renewSaving;
        AbstractC11688p $r4 = $r3.continuePlan(renewSavingRequest);
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingDetailViewModel $r1 = SavingDetailViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                SavingDetailViewModel.m40624renewSavingPlan$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.IQTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingDetailViewModel $r1 = SavingDetailViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingDetailViewModel.m40625renewSavingPlan$lambda4($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "renewSaving.continuePlan(request).subscribe(\n            {\n                publish(SavingDetailViewData.ShowProgress(visibility = false))\n                publish(SavingDetailViewData.Success(it, true))\n            },\n            {\n                publish(SavingDetailViewData.ShowProgress(visibility = false))\n                publish(SavingDetailViewData.Error)\n            }\n        )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showProgress(boolean z) {
        SavingsNavigator $r1 = this.navigator;
        $r1.displayProgressBar(z);
    }
}
