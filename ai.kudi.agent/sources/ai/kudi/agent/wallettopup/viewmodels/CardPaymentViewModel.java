package ai.kudi.agent.wallettopup.viewmodels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.payments.domain.usecases.FetchPaymentMethods;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.PaymentMethodsViewData;
import android.app.Application;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: CardPaymentViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/wallettopup/viewmodels/CardPaymentViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "fetchPaymentMethods", "Lai/kudi/agent/payments/domain/usecases/FetchPaymentMethods;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "app", "Landroid/app/Application;", "(Lai/kudi/agent/payments/domain/usecases/FetchPaymentMethods;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Landroid/app/Application;)V", "initialData", "loadCards", "", "logOnCardAdded", "logOnCardPaymentVisited", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardPaymentViewModel extends BaseViewModel<PaymentMethodsViewData> {
    private final Analytics analytics;
    private final Application application;
    private final FetchCurrentUser currentUser;
    private final FetchPaymentMethods fetchPaymentMethods;

    public CardPaymentViewModel(FetchPaymentMethods fetchPaymentMethods, Analytics analytics, FetchCurrentUser fetchCurrentUser, Application application) {
        Log_OC.getArray(fetchPaymentMethods, "fetchPaymentMethods");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(application, "app");
        this.fetchPaymentMethods = fetchPaymentMethods;
        this.analytics = analytics;
        this.currentUser = fetchCurrentUser;
        this.application = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0027 */
    /* renamed from: loadCards$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41772loadCards$lambda1(ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel r24, java.util.List r25) {
        /*
            java.lang.String r8 = "this$0"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            r0 = r24
            ai.kudi.agent.core.mvvm.ViewData r9 = r0.getState()
            r11 = r9
            ai.kudi.agent.wallettopup.data.PaymentMethodsViewData r11 = (ai.kudi.agent.wallettopup.data.PaymentMethodsViewData) r11
            r10 = r11
            java.lang.String r8 = "data"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = r25
            java.util.Iterator r13 = r0.iterator()
        L23:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L3f
            java.lang.Object r15 = r13.next()
            r17 = r15
            ai.kudi.agent.payments.domain.wiki.PaymentMethod r17 = (ai.kudi.agent.payments.domain.wiki.PaymentMethod) r17
            r16 = r17
            r0 = r16
            boolean r14 = r0.isCard()
            if (r14 == 0) goto L23
            r12.add(r15)
            goto L23
        L3f:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 10
            r23 = 0
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r12
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            ai.kudi.agent.wallettopup.data.PaymentMethodsViewData r10 = ai.kudi.agent.wallettopup.data.PaymentMethodsViewData.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = r24
            r0.publish(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel.m41772loadCards$lambda1(ai.kudi.agent.wallettopup.viewmodels.CardPaymentViewModel, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadCards$lambda-2  reason: not valid java name */
    public static final void m41773loadCards$lambda2(CardPaymentViewModel cardPaymentViewModel, Throwable th) {
        Log_OC.getArray(cardPaymentViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = cardPaymentViewModel.getState();
        PaymentMethodsViewData $r3 = (PaymentMethodsViewData) $r2;
        Application $r5 = cardPaymentViewModel.application;
        String $r6 = $r5.getString(C0001R.string.something_went_wrong);
        PaymentMethodsViewData.Error $r4 = new PaymentMethodsViewData.Error(true, null, $r6, 2, null);
        cardPaymentViewModel.publish(PaymentMethodsViewData.copy$default($r3, false, null, null, null, $r4, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logOnCardPaymentVisited$lambda-3  reason: not valid java name */
    public static final void m41774logOnCardPaymentVisited$lambda3(CardPaymentViewModel cardPaymentViewModel, User user) {
        Log_OC.getArray(cardPaymentViewModel, "this$0");
        Analytics $r3 = cardPaymentViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onCardPageVisited($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PaymentMethodsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PaymentMethodsViewData initialData() {
        PaymentMethodsViewData $r1 = new PaymentMethodsViewData(true, null, null, null, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadCards() {
        ViewData $r1 = getState();
        PaymentMethodsViewData $r2 = (PaymentMethodsViewData) $r1;
        publish(PaymentMethodsViewData.copy$default($r2, true, null, null, null, null, 30, null));
        FetchPaymentMethods $r3 = this.fetchPaymentMethods;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CardPaymentViewModel $r12 = CardPaymentViewModel.this;
                List $r32 = (List) obj;
                CardPaymentViewModel.m41772loadCards$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CardPaymentViewModel $r12 = CardPaymentViewModel.this;
                Throwable $r32 = (Throwable) obj;
                CardPaymentViewModel.m41773loadCards$lambda2($r12, $r32);
            }
        });
        Log_OC.loadImage($r7, "fetchPaymentMethods.execute()\n            .subscribe(\n                { data ->\n                    publish(\n                        state.copy(\n                            loading = false,\n                            cards = data.filter { it.isCard },\n                            error = null\n                        )\n                    )\n                },\n                {\n                    it.printStackTrace()\n                    publish(\n                        state.copy(\n                            loading = false,\n                            error = PaymentMethodsViewData.Error(\n                                paymentMethodFetchFailed = true,\n                                generalError = app.getString(R.string.something_went_wrong)\n                            )\n                        )\n                    )\n                }\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnCardAdded() {
        Analytics $r1 = this.analytics;
        $r1.onNewCardAdded();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnCardPaymentVisited() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                CardPaymentViewModel $r12 = CardPaymentViewModel.this;
                User $r3 = (User) obj;
                CardPaymentViewModel.m41774logOnCardPaymentVisited$lambda3($r12, $r3);
            }
        };
        Country $r4 = Country.f2061TO;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onCardPageVisited(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }
}
