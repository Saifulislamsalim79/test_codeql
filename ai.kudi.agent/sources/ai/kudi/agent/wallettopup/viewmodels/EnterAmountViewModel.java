package ai.kudi.agent.wallettopup.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.EnterAmountView;
import ai.kudi.agent.wallettopup.navigators.WalletTopupNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: EnterAmountViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/wallettopup/viewmodels/EnterAmountViewModel;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/wallettopup/data/EnterAmountView;", "navigator", "Lai/kudi/agent/wallettopup/navigators/WalletTopupNavigator;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/wallettopup/navigators/WalletTopupNavigator;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getNavigator", "()Lai/kudi/agent/wallettopup/navigators/WalletTopupNavigator;", "destroy", "", "generateCode", TransactionField.AMOUNT, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EnterAmountViewModel extends C9410b<EnterAmountView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final WalletTopupNavigator navigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EnterAmountViewModel(WalletTopupNavigator walletTopupNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(walletTopupNavigator, "navigator");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.navigator = walletTopupNavigator;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generateCode$lambda-2  reason: not valid java name */
    public static final void m41778generateCode$lambda2(final EnterAmountViewModel enterAmountViewModel, final String str, final EnterAmountView enterAmountView) {
        Log_OC.getArray(enterAmountViewModel, "this$0");
        Log_OC.getArray(str, "$amount");
        Log_OC.getArray(enterAmountView, "view");
        FetchCurrentUser $r3 = enterAmountViewModel.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EnterAmountView $r1 = EnterAmountView.this;
                String $r2 = str;
                EnterAmountViewModel $r32 = enterAmountViewModel;
                User $r5 = (User) obj;
                EnterAmountViewModel.m41779generateCode$lambda2$lambda0($r1, $r2, $r32, $r5);
            }
        };
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute().subscribe(\n                {\n                    view.useCodeData(amount)\n                    analytics.onAmountEntered(it.phoneNumber, amount)\n                },\n                {\n\n                }\n            )");
        C11280b $r8 = enterAmountViewModel.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generateCode$lambda-2$lambda-0  reason: not valid java name */
    public static final void m41779generateCode$lambda2$lambda0(EnterAmountView enterAmountView, String str, EnterAmountViewModel enterAmountViewModel, User user) {
        Log_OC.getArray(enterAmountView, "$view");
        Log_OC.getArray(str, "$amount");
        Log_OC.getArray(enterAmountViewModel, "this$0");
        enterAmountView.useCodeData(str);
        Analytics $r5 = enterAmountViewModel.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r5.onAmountEntered($r1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: generateCode$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41780generateCode$lambda2$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void generateCode(final String str) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.wallettopup.viewmodels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                EnterAmountViewModel $r1 = EnterAmountViewModel.this;
                String $r2 = str;
                EnterAmountView $r4 = (EnterAmountView) obj;
                EnterAmountViewModel.m41778generateCode$lambda2($r1, $r2, $r4);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WalletTopupNavigator getNavigator() {
        WalletTopupNavigator r1 = this.navigator;
        return r1;
    }
}
