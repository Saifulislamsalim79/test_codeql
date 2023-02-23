package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.domain.wiki.UpdateBvnRequest;
import ai.kudi.agent.login.setup.domain.UpdateBvnUseCase;
import ai.kudi.agent.login.setup.viewModels.data.BvnUpdateViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.register.domain.wiki.UpdateBvnModel;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: EnforceBvnVerificationViewModel.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/BvnUpdateViewData;", "updateBvnUseCase", "Lai/kudi/agent/login/setup/domain/UpdateBvnUseCase;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/login/setup/domain/UpdateBvnUseCase;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "initialData", "verifyId", "", "loginAttemptId", "", "idNumber", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EnforceBvnVerificationViewModel extends BaseViewModel<BvnUpdateViewData> {
    private final FetchCurrentUser currentUser;
    private final UpdateBvnUseCase updateBvnUseCase;

    public EnforceBvnVerificationViewModel(UpdateBvnUseCase updateBvnUseCase, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(updateBvnUseCase, "updateBvnUseCase");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        this.updateBvnUseCase = updateBvnUseCase;
        this.currentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-0  reason: not valid java name */
    public static final void m39754verifyId$lambda0(EnforceBvnVerificationViewModel enforceBvnVerificationViewModel, UpdateBvnModel updateBvnModel) {
        Log_OC.getArray(enforceBvnVerificationViewModel, "this$0");
        ViewData $r2 = enforceBvnVerificationViewModel.getState();
        BvnUpdateViewData $r3 = (BvnUpdateViewData) $r2;
        enforceBvnVerificationViewModel.publish(BvnUpdateViewData.copy$default($r3, false, updateBvnModel, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyId$lambda-1  reason: not valid java name */
    public static final void m39755verifyId$lambda1(EnforceBvnVerificationViewModel enforceBvnVerificationViewModel, Throwable th) {
        Log_OC.getArray(enforceBvnVerificationViewModel, "this$0");
        ViewData $r2 = enforceBvnVerificationViewModel.getState();
        BvnUpdateViewData $r3 = (BvnUpdateViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        enforceBvnVerificationViewModel.publish($r3.copy(false, null, $r6));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getCurrentUser() {
        FetchCurrentUser r1 = this.currentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        BvnUpdateViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public BvnUpdateViewData initialData() {
        BvnUpdateViewData $r1 = new BvnUpdateViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyId(String str, String str2) {
        Log_OC.getArray(str, "loginAttemptId");
        Log_OC.getArray(str2, "idNumber");
        ViewData $r3 = getState();
        BvnUpdateViewData $r4 = (BvnUpdateViewData) $r3;
        publish(BvnUpdateViewData.copy$default($r4, true, null, null, 2, null));
        UpdateBvnUseCase $r5 = this.updateBvnUseCase;
        UpdateBvnRequest $r6 = new UpdateBvnRequest(str2);
        AbstractC11688p $r7 = $r5.execute(str, $r6);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.login.setup.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EnforceBvnVerificationViewModel $r1 = EnforceBvnVerificationViewModel.this;
                UpdateBvnModel $r32 = (UpdateBvnModel) obj;
                EnforceBvnVerificationViewModel.m39754verifyId$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.login.setup.presenters.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EnforceBvnVerificationViewModel $r1 = EnforceBvnVerificationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                EnforceBvnVerificationViewModel.m39755verifyId$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "updateBvnUseCase.execute(loginAttemptId, UpdateBvnRequest(idNumber)).subscribe(\n                {\n                    publish(state.copy(isLoading = false, bvnUpdateData = it))\n\n                },\n                {\n                    publish(\n                        state.copy(\n                            isLoading = false,\n                            bvnUpdateData = null,\n                            error = parseHttpError2()(it)\n                        )\n                    )\n                }\n            )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }
}
