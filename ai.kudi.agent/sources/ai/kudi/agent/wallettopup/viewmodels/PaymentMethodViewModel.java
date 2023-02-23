package ai.kudi.agent.wallettopup.viewmodels;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.adapters.CashDepositAdapter;
import ai.kudi.agent.wallettopup.data.FetchBanksWithMethods;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import ai.kudi.agent.wallettopup.data.PaymentMethodsViewData;
import android.app.Application;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: PaymentMethodViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/wallettopup/viewmodels/PaymentMethodViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/wallettopup/data/PaymentMethodsViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchBanksWithMethods", "Lai/kudi/agent/wallettopup/data/FetchBanksWithMethods;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "app", "Landroid/app/Application;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/wallettopup/data/FetchBanksWithMethods;Lai/kudi/agent/core/analytics/Analytics;Landroid/app/Application;)V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "getCashDepositSteps", "", "getMonnifyDetails", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentMethodViewModel extends BaseViewModel<PaymentMethodsViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final FetchBanksWithMethods fetchBanksWithMethods;
    private String phoneNumber;
    private final Application this$0;

    public PaymentMethodViewModel(FetchCurrentUser fetchCurrentUser, FetchBanksWithMethods fetchBanksWithMethods, Analytics analytics, Application application) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchBanksWithMethods, "fetchBanksWithMethods");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(application, "app");
        this.currentUser = fetchCurrentUser;
        this.fetchBanksWithMethods = fetchBanksWithMethods;
        this.analytics = analytics;
        this.this$0 = application;
        this.phoneNumber = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonnifyDetails$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41782getMonnifyDetails$lambda0(PaymentMethodViewModel paymentMethodViewModel, User user) {
        Log_OC.getArray(paymentMethodViewModel, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "it.phoneNumber");
        paymentMethodViewModel.setPhoneNumber($r2);
        Analytics $r3 = paymentMethodViewModel.analytics;
        String $r22 = user.getPhoneNumber();
        Log_OC.loadImage($r22, "it.phoneNumber");
        $r3.onKtaPageVisited($r22);
        FetchBanksWithMethods $r4 = paymentMethodViewModel.fetchBanksWithMethods;
        String $r23 = user.getSessionId();
        Log_OC.loadImage($r23, "it.sessionId");
        AbstractC11688p $r5 = $r4.execute($r23);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonnifyDetails$lambda-1  reason: not valid java name */
    public static final void m41783getMonnifyDetails$lambda1(PaymentMethodViewModel paymentMethodViewModel, MonnifyDetails monnifyDetails) {
        Log_OC.getArray(paymentMethodViewModel, "this$0");
        ViewData $r2 = paymentMethodViewModel.getState();
        PaymentMethodsViewData $r3 = (PaymentMethodsViewData) $r2;
        paymentMethodViewModel.publish(PaymentMethodsViewData.copy$default($r3, false, monnifyDetails, null, null, null, 28, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonnifyDetails$lambda-2  reason: not valid java name */
    public static final void m41784getMonnifyDetails$lambda2(PaymentMethodViewModel paymentMethodViewModel, Throwable th) {
        Log_OC.getArray(paymentMethodViewModel, "this$0");
        th.printStackTrace();
        ViewData $r2 = paymentMethodViewModel.getState();
        PaymentMethodsViewData $r3 = (PaymentMethodsViewData) $r2;
        Application $r5 = paymentMethodViewModel.this$0;
        String $r6 = $r5.getString(C0001R.string.could_not_load_details);
        PaymentMethodsViewData.Error $r4 = new PaymentMethodsViewData.Error(false, null, $r6, 3, null);
        paymentMethodViewModel.publish(PaymentMethodsViewData.copy$default($r3, false, null, null, null, $r4, 14, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getCashDepositSteps() {
        ArrayList $r5;
        ViewData $r1 = getState();
        PaymentMethodsViewData $r2 = (PaymentMethodsViewData) $r1;
        CashDepositAdapter.Item $r4 = new CashDepositAdapter.Item(1, C0001R.C0002drawable.ic_kudi_outlet_border, C0001R.string.go_to_nearest);
        CashDepositAdapter.Item $r42 = new CashDepositAdapter.Item(2, C0001R.C0002drawable.ic_give_cash, C0001R.string.give_cash_and_wallet_number);
        CashDepositAdapter.Item $r43 = new CashDepositAdapter.Item(3, C0001R.C0002drawable.ic_confirm_deposit, C0001R.string.confirm_wallet);
        CashDepositAdapter.Item[] $r3 = {$r4, $r42, $r43};
        $r5 = C13726r.m3893c($r3);
        publish(PaymentMethodsViewData.copy$default($r2, false, null, null, $r5, null, 23, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getMonnifyDetails() {
        ViewData $r1 = getState();
        PaymentMethodsViewData $r2 = (PaymentMethodsViewData) $r1;
        publish(PaymentMethodsViewData.copy$default($r2, true, null, null, null, null, 30, null));
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.wallettopup.viewmodels.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PaymentMethodViewModel $r12 = PaymentMethodViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = PaymentMethodViewModel.m41782getMonnifyDetails$lambda0($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PaymentMethodViewModel $r12 = PaymentMethodViewModel.this;
                MonnifyDetails $r32 = (MonnifyDetails) obj;
                PaymentMethodViewModel.m41783getMonnifyDetails$lambda1($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.wallettopup.viewmodels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PaymentMethodViewModel $r12 = PaymentMethodViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PaymentMethodViewModel.m41784getMonnifyDetails$lambda2($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
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

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }
}
