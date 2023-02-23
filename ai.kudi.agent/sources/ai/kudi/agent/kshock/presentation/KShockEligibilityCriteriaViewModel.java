package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.kshock.presentation.viewdata.KShockEligibilityCriteriaViewState;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.kshock.usecases.FetchNewKshockEligibility;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
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
import p425j.p444e.p471k0.C11680b;
/* compiled from: KShockEligibilityCriteriaViewModel.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/KShockEligibilityCriteriaViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KShockEligibilityCriteriaViewState;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchNewKshockEligibility", "Lai/kudi/agent/kshock/usecases/FetchNewKshockEligibility;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/usecases/FetchNewKshockEligibility;)V", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "getData", "()Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "toastMessage", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getToastMessage", "()Lio/reactivex/subjects/PublishSubject;", "initialData", "onViewCreated", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaViewModel extends BaseViewModel<KShockEligibilityCriteriaViewState> {
    private final FetchCurrentUser currentUser;
    private final KShockViewData data;
    private final FetchNewKshockEligibility fetchNewKshockEligibility;
    private final C11680b<String> toastMessage;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KShockEligibilityCriteriaViewModel(FetchCurrentUser fetchCurrentUser, FetchNewKshockEligibility fetchNewKshockEligibility) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchNewKshockEligibility, "fetchNewKshockEligibility");
        this.currentUser = fetchCurrentUser;
        this.fetchNewKshockEligibility = fetchNewKshockEligibility;
        KShockViewData $r4 = new KShockViewData(false, null, null, null, null, null, 63, null);
        this.data = $r4;
        C11680b $r1 = C11680b.m10564v0();
        Log_OC.loadImage($r1, "create<String>()");
        this.toastMessage = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39578onViewCreated$lambda0(KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel, User user) {
        Log_OC.getArray(kShockEligibilityCriteriaViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchNewKshockEligibility $r2 = kShockEligibilityCriteriaViewModel.fetchNewKshockEligibility;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        AbstractC11688p $r4 = $r2.execute($r3);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39579onViewCreated$lambda1(KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel, List list) {
        Log_OC.getArray(kShockEligibilityCriteriaViewModel, "this$0");
        ViewData $r2 = kShockEligibilityCriteriaViewModel.getState();
        KShockEligibilityCriteriaViewState $r3 = (KShockEligibilityCriteriaViewState) $r2;
        Log_OC.loadImage(list, "kshockAvailability");
        kShockEligibilityCriteriaViewModel.publish(KShockEligibilityCriteriaViewState.copy$default($r3, false, list, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m39580onViewCreated$lambda2(KShockEligibilityCriteriaViewModel kShockEligibilityCriteriaViewModel, Throwable th) {
        Log_OC.getArray(kShockEligibilityCriteriaViewModel, "this$0");
        ViewData $r2 = kShockEligibilityCriteriaViewModel.getState();
        KShockEligibilityCriteriaViewState $r3 = (KShockEligibilityCriteriaViewState) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        kShockEligibilityCriteriaViewModel.publish(KShockEligibilityCriteriaViewState.copy$default($r3, false, null, (String) $r5, 2, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KShockViewData getData() {
        KShockViewData r1 = this.data;
        return r1;
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
        KShockEligibilityCriteriaViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KShockEligibilityCriteriaViewState initialData() {
        KShockEligibilityCriteriaViewState $r1 = new KShockEligibilityCriteriaViewState(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreated() {
        ViewData $r1 = getState();
        KShockEligibilityCriteriaViewState $r2 = (KShockEligibilityCriteriaViewState) $r1;
        publish(KShockEligibilityCriteriaViewState.copy$default($r2, true, null, null, 6, null));
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KShockEligibilityCriteriaViewModel $r12 = KShockEligibilityCriteriaViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = KShockEligibilityCriteriaViewModel.m39578onViewCreated$lambda0($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.Point
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockEligibilityCriteriaViewModel $r12 = KShockEligibilityCriteriaViewModel.this;
                List $r32 = (List) obj;
                KShockEligibilityCriteriaViewModel.m39579onViewCreated$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockEligibilityCriteriaViewModel $r12 = KShockEligibilityCriteriaViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KShockEligibilityCriteriaViewModel.m39580onViewCreated$lambda2($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }
}
