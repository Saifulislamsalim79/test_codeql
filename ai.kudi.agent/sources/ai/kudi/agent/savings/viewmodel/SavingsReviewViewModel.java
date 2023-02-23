package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.savings.adapter.SavingsPlanAdapter;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.viewdata.SavingsReviewViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.p024ui.SavingsActivity;
import ai.kudi.agent.savings.usecase.CreateSavings;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.SharedPreferences;
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
/* compiled from: SavingsReviewViewModel.kt */
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsReviewViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsReviewViewData;", "createSavings", "Lai/kudi/agent/savings/usecase/CreateSavings;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/savings/usecase/CreateSavings;Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Landroid/content/SharedPreferences;)V", "", "savingsRequest", "Lai/kudi/agent/savings/data/model/SavingsRequest;", "getUserCategory", "initialData", "Lai/kudi/agent/savings/data/viewdata/SavingsReviewViewData$Initial;", "navigateToCreateSavingsPinFragment", "model", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", "navigateToSavingSuccessDialog", "toggleProgress", "visibility", "", "updateSavingsFeatureMenuLabel", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsReviewViewModel extends BaseViewModel<SavingsReviewViewData> {
    private final Analytics analytics;
    private final CreateSavings createSavings;
    private final FetchCurrentUser currentUser;
    private final SavingsNavigator navigator;
    private final SharedPreferences sharedPreferences;

    public SavingsReviewViewModel(CreateSavings createSavings, SavingsNavigator savingsNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics, SharedPreferences sharedPreferences) {
        Log_OC.getArray(createSavings, "createSavings");
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.createSavings = createSavings;
        this.navigator = savingsNavigator;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m40634createSavings$lambda3(SavingsReviewViewModel savingsReviewViewModel, SavingsRequest savingsRequest, User user) {
        Log_OC.getArray(savingsReviewViewModel, "this$0");
        Log_OC.getArray(savingsRequest, "$savingsRequest");
        Log_OC.getArray(user, "it");
        Analytics $r3 = savingsReviewViewModel.analytics;
        String $r4 = user.getPhoneNumber();
        Log_OC.loadImage($r4, "it.phoneNumber");
        $r3.onCreateSavingsClicked($r4);
        CreateSavings $r5 = savingsReviewViewModel.createSavings;
        AbstractC11688p $r6 = $r5.createSavingGoal(savingsRequest);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-4  reason: not valid java name */
    public static final void m40635createSavings$lambda4(SavingsReviewViewModel savingsReviewViewModel, SavingResponse savingResponse) {
        Log_OC.getArray(savingsReviewViewModel, "this$0");
        SavingsReviewViewData.ShowProgress $r2 = new SavingsReviewViewData.ShowProgress(false);
        savingsReviewViewModel.publish($r2);
        SavingsReviewViewData.Success $r3 = SavingsReviewViewData.Success.INSTANCE;
        savingsReviewViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: createSavings$lambda-5  reason: not valid java name */
    public static final void m40636createSavings$lambda5(SavingsReviewViewModel savingsReviewViewModel, Throwable th) {
        Log_OC.getArray(savingsReviewViewModel, "this$0");
        SavingsReviewViewData.ShowProgress $r2 = new SavingsReviewViewData.ShowProgress(false);
        savingsReviewViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        SavingsReviewViewData.Error $r3 = new SavingsReviewViewData.Error($r6);
        savingsReviewViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUserCategory$lambda-1  reason: not valid java name */
    public static final void m40637getUserCategory$lambda1(SavingsReviewViewModel savingsReviewViewModel, User user) {
        Log_OC.getArray(savingsReviewViewModel, "this$0");
        String $r2 = user.getSavingsCategory();
        SavingsPlanAdapter.UserCategory $r3 = SavingsPlanAdapter.UserCategory.EXISTING_USER;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        SavingsReviewViewData.User $r5 = new SavingsReviewViewData.User($z0);
        savingsReviewViewModel.publish($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void createSavings(final SavingsRequest savingsRequest) {
        Log_OC.getArray(savingsRequest, "savingsRequest");
        SavingsReviewViewData.ShowProgress $r2 = new SavingsReviewViewData.ShowProgress(true);
        publish($r2);
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.savings.viewmodel.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SavingsReviewViewModel $r1 = SavingsReviewViewModel.this;
                SavingsRequest $r22 = savingsRequest;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = SavingsReviewViewModel.m40634createSavings$lambda3($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.savings.viewmodel.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsReviewViewModel $r1 = SavingsReviewViewModel.this;
                SavingResponse $r32 = (SavingResponse) obj;
                SavingsReviewViewModel.m40635createSavings$lambda4($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.savings.viewmodel.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsReviewViewModel $r1 = SavingsReviewViewModel.this;
                Throwable $r32 = (Throwable) obj;
                SavingsReviewViewModel.m40636createSavings$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute().flatMapObservable {\n            analytics.onCreateSavingsClicked(it.phoneNumber)\n            createSavings.createSavingGoal(savingsRequest)\n        }.subscribe(\n            {\n                publish(SavingsReviewViewData.ShowProgress(visibility = false))\n                publish(SavingsReviewViewData.Success)\n            },\n            {\n                publish(SavingsReviewViewData.ShowProgress(visibility = false))\n                publish(SavingsReviewViewData.Error(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getUserCategory() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.savings.viewmodel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SavingsReviewViewModel $r12 = SavingsReviewViewModel.this;
                User $r3 = (User) obj;
                SavingsReviewViewModel.m40637getUserCategory$lambda1($r12, $r3);
            }
        };
        Message$RecipientType $r4 = Message$RecipientType.f1293TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                val isExistingUser = it.savingsCategory == SavingsPlanAdapter.UserCategory.EXISTING_USER.name\n                publish(SavingsReviewViewData.User(isExistingUser))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingsReviewViewData.Initial $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingsReviewViewData.Initial initialData() {
        SavingsReviewViewData.Initial r1 = SavingsReviewViewData.Initial.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToCreateSavingsPinFragment(CreateSavingsModel createSavingsModel) {
        Log_OC.getArray(createSavingsModel, "model");
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToCreateSavingsPinFragment(createSavingsModel);
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
    public final void toggleProgress(boolean z) {
        SavingsNavigator $r1 = this.navigator;
        $r1.displayProgressBar(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateSavingsFeatureMenuLabel() {
        SharedPreferences $r1 = this.sharedPreferences;
        boolean $z0 = $r1.getBoolean(SavingsActivity.IS_NEW_SAVINGS_FEATURE, true);
        if ($z0) {
            SharedPreferences $r12 = this.sharedPreferences;
            SharedPreferences.Editor $r2 = $r12.edit();
            Log_OC.loadImage($r2, "editor");
            SharedPreferences.Editor $r3 = $r2.putBoolean(SavingsActivity.IS_NEW_SAVINGS_FEATURE, true);
            $r3.apply();
            $r2.apply();
        }
    }
}
