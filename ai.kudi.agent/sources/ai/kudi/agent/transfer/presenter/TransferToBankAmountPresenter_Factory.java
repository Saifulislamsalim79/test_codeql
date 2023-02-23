package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransferToBankAmountPresenter_Factory implements InterfaceC9468d<TransferToBankAmountPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public TransferToBankAmountPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.currentUserProvider = interfaceC11700a;
        this.feeLookupProvider = interfaceC11700a2;
        this.mainTransferViewProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.sharedPreferencesProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankAmountPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        TransferToBankAmountPresenter_Factory $r5 = new TransferToBankAmountPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankAmountPresenter newInstance(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, MainTransferView mainTransferView, Analytics analytics, SharedPreferences sharedPreferences) {
        TransferToBankAmountPresenter $r5 = new TransferToBankAmountPresenter(fetchCurrentUser, performServiceFeeLookup, mainTransferView, analytics, sharedPreferences);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBankAmountPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.feeLookupProvider;
        Object $r22 = $r12.get();
        PerformServiceFeeLookup $r4 = (PerformServiceFeeLookup) $r22;
        InterfaceC11700a $r13 = this.mainTransferViewProvider;
        Object $r23 = $r13.get();
        MainTransferView $r5 = (MainTransferView) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.sharedPreferencesProvider;
        Object $r25 = $r15.get();
        SharedPreferences $r7 = (SharedPreferences) $r25;
        TransferToBankAmountPresenter $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41335multiply() {
        TransferToBankAmountPresenter $r1 = multiply();
        return $r1;
    }
}
