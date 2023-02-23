package ai.kudi.agent.kcash.viewmodels;

import ai.kudi.agent.BuildConfig;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.kcash.data.KCashViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: KCashViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/kcash/viewmodels/KCashViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kcash/data/KCashViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getUrlToLoad", "", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KCashViewModel extends BaseViewModel<KCashViewData> {
    private final FetchCurrentUser fetchCurrentUser;

    public KCashViewModel(FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.fetchCurrentUser = fetchCurrentUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getUrlToLoad$lambda-0  reason: not valid java name */
    public static final void m39560getUrlToLoad$lambda0(KCashViewModel kCashViewModel, User user) {
        Log_OC.getArray(kCashViewModel, "this$0");
        StringBuilder $r3 = new StringBuilder();
        $r3.append(BuildConfig.KCASH_BASE_URL);
        $r3.append("login/?source=android&token=");
        String $r4 = user.getSessionId();
        $r3.append($r4);
        String $r42 = $r3.toString();
        KCashViewData $r2 = new KCashViewData(false, $r42);
        kCashViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUrlToLoad$lambda-1  reason: not valid java name */
    public static final void m39561getUrlToLoad$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getUrlToLoad() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.kcash.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KCashViewModel $r12 = KCashViewModel.this;
                User $r3 = (User) obj;
                KCashViewModel.m39560getUrlToLoad$lambda0($r12, $r3);
            }
        };
        Function $r4 = Function.SUBTOTAL;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                publish(\n                    KCashViewData(\n                        false,\n                        StringBuilder().append(KCASH_BASE_URL).append(\"login/?source=android&token=\").append(it.sessionId).toString()\n                    )\n                )\n            },\n            {\n\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KCashViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KCashViewData initialData() {
        KCashViewData $r1 = new KCashViewData(false, null, 2, null);
        return $r1;
    }
}
