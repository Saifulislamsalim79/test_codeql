package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.insurance.data.InsuranceDetailModel;
import ai.kudi.agent.settings.insurance.data.InsuranceError;
import ai.kudi.agent.settings.insurance.domain.DeactivateInsuranceUseCase;
import ai.kudi.agent.settings.insurance.domain.GetInsuranceDetailsUseCase;
import ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: CashInsuranceViewModel.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/insurance/presentation/CashInsuranceViewState;", "deactivateInsuranceUseCase", "Lai/kudi/agent/settings/insurance/domain/DeactivateInsuranceUseCase;", "getInsuranceUseCase", "Lai/kudi/agent/settings/insurance/domain/GetInsuranceDetailsUseCase;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "cashInsuranceFragmentNavigator", "Lai/kudi/agent/settings/insurance/navigator/CashInsuranceFragmentNavigator;", "(Lai/kudi/agent/settings/insurance/domain/DeactivateInsuranceUseCase;Lai/kudi/agent/settings/insurance/domain/GetInsuranceDetailsUseCase;Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/settings/insurance/navigator/CashInsuranceFragmentNavigator;)V", "toastMessage", "Lio/reactivex/subjects/PublishSubject;", "", "getToastMessage", "()Lio/reactivex/subjects/PublishSubject;", "initialData", "onDeactivateInsurance", "", "reason", "onDeactivateInsuranceAction", "onViewCreated", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CashInsuranceViewModel extends BaseViewModel<CashInsuranceViewState> {
    private final CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator;
    private final DeactivateInsuranceUseCase deactivateInsuranceUseCase;
    private final GetInsuranceDetailsUseCase getInsuranceUseCase;
    private final ResourceDelegate resource;
    private final C11680b<String> toastMessage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CashInsuranceViewModel(DeactivateInsuranceUseCase deactivateInsuranceUseCase, GetInsuranceDetailsUseCase getInsuranceDetailsUseCase, ResourceDelegate resourceDelegate, CashInsuranceFragmentNavigator cashInsuranceFragmentNavigator) {
        Log_OC.getArray(deactivateInsuranceUseCase, "deactivateInsuranceUseCase");
        Log_OC.getArray(getInsuranceDetailsUseCase, "getInsuranceUseCase");
        Log_OC.getArray(resourceDelegate, "resource");
        Log_OC.getArray(cashInsuranceFragmentNavigator, "cashInsuranceFragmentNavigator");
        this.deactivateInsuranceUseCase = deactivateInsuranceUseCase;
        this.getInsuranceUseCase = getInsuranceDetailsUseCase;
        this.resource = resourceDelegate;
        this.cashInsuranceFragmentNavigator = cashInsuranceFragmentNavigator;
        C11680b $r3 = C11680b.m10564v0();
        Log_OC.loadImage($r3, "create()");
        this.toastMessage = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onDeactivateInsurance$lambda-2  reason: not valid java name */
    public static final void m40778onDeactivateInsurance$lambda2(CashInsuranceViewModel cashInsuranceViewModel, InsuranceDetailModel insuranceDetailModel) {
        Log_OC.getArray(cashInsuranceViewModel, "this$0");
        ViewData $r2 = cashInsuranceViewModel.getState();
        CashInsuranceViewState $r3 = (CashInsuranceViewState) $r2;
        cashInsuranceViewModel.publish(CashInsuranceViewState.copy$default($r3, false, insuranceDetailModel, null, 4, null));
        C11680b $r4 = cashInsuranceViewModel.getToastMessage();
        ResourceDelegate $r5 = cashInsuranceViewModel.resource;
        String $r6 = $r5.getString(C0001R.string.insurance_deactivated);
        $r4.mo331f($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onDeactivateInsurance$lambda-3  reason: not valid java name */
    public static final void m40779onDeactivateInsurance$lambda3(CashInsuranceViewModel cashInsuranceViewModel, Throwable th) {
        Log_OC.getArray(cashInsuranceViewModel, "this$0");
        Timber.reorder(th);
        ViewData $r2 = cashInsuranceViewModel.getState();
        CashInsuranceViewState $r3 = (CashInsuranceViewState) $r2;
        cashInsuranceViewModel.publish(CashInsuranceViewState.copy$default($r3, false, null, null, 6, null));
        C11680b $r4 = cashInsuranceViewModel.getToastMessage();
        ResourceDelegate $r5 = cashInsuranceViewModel.resource;
        String $r6 = $r5.getString(C0001R.string.unable_to_deactivate_insurance_message);
        $r4.mo331f($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40780onViewCreated$lambda0(CashInsuranceViewModel cashInsuranceViewModel, InsuranceDetailModel insuranceDetailModel) {
        Log_OC.getArray(cashInsuranceViewModel, "this$0");
        ViewData $r2 = cashInsuranceViewModel.getState();
        CashInsuranceViewState $r3 = (CashInsuranceViewState) $r2;
        cashInsuranceViewModel.publish($r3.copy(false, insuranceDetailModel, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40781onViewCreated$lambda1(CashInsuranceViewModel cashInsuranceViewModel, Throwable th) {
        Log_OC.getArray(cashInsuranceViewModel, "this$0");
        Timber.reorder(th);
        ResourceDelegate $r3 = cashInsuranceViewModel.resource;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default($r3.getString(C0001R.string.error_loading_insurance_details), null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        String $r4 = (String) $r6;
        C11680b $r7 = cashInsuranceViewModel.getToastMessage();
        $r7.mo331f($r4);
        InsuranceError $r1 = new InsuranceError($r4);
        ViewData $r8 = cashInsuranceViewModel.getState();
        CashInsuranceViewState $r9 = CashInsuranceViewState.copy$default((CashInsuranceViewState) $r8, false, null, $r1, 2, null);
        cashInsuranceViewModel.publish($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CashInsuranceViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CashInsuranceViewState initialData() {
        CashInsuranceViewState $r1 = new CashInsuranceViewState(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onDeactivateInsurance(String str) {
        if (str == null) {
            return;
        }
        ViewData $r2 = getState();
        CashInsuranceViewState $r3 = (CashInsuranceViewState) $r2;
        publish(CashInsuranceViewState.copy$default($r3, true, null, null, 6, null));
        DeactivateInsuranceUseCase $r4 = this.deactivateInsuranceUseCase;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.settings.insurance.presentation.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashInsuranceViewModel $r1 = CashInsuranceViewModel.this;
                InsuranceDetailModel $r32 = (InsuranceDetailModel) obj;
                CashInsuranceViewModel.m40778onDeactivateInsurance$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.insurance.presentation.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashInsuranceViewModel $r1 = CashInsuranceViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CashInsuranceViewModel.m40779onDeactivateInsurance$lambda3($r1, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onDeactivateInsuranceAction() {
        CashInsuranceFragmentNavigator $r1 = this.cashInsuranceFragmentNavigator;
        $r1.openDeactivationReasonsFragment();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated() {
        ViewData $r1 = getState();
        CashInsuranceViewState $r2 = (CashInsuranceViewState) $r1;
        publish(CashInsuranceViewState.copy$default($r2, true, null, null, 6, null));
        GetInsuranceDetailsUseCase $r3 = this.getInsuranceUseCase;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.settings.insurance.presentation.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashInsuranceViewModel $r12 = CashInsuranceViewModel.this;
                InsuranceDetailModel $r32 = (InsuranceDetailModel) obj;
                CashInsuranceViewModel.m40780onViewCreated$lambda0($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.insurance.presentation.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CashInsuranceViewModel $r12 = CashInsuranceViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CashInsuranceViewModel.m40781onViewCreated$lambda1($r12, $r32);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }
}
