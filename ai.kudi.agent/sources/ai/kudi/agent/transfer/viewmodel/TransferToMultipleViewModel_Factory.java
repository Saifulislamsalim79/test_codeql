package ai.kudi.agent.transfer.viewmodel;

import ai.kudi.agent.bills.domain.usecases.SubmitMultipleTransferRequest;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransferToMultipleViewModel_Factory implements InterfaceC9468d<TransferToMultipleViewModel> {
    private final InterfaceC11700a<AccountLookup> accountLookupProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<Application> appProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<SubmitMultipleTransferRequest> transferProvider;

    public TransferToMultipleViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        this.appProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.accountLookupProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.transferProvider = interfaceC11700a5;
        this.sharedPreferencesProvider = interfaceC11700a6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToMultipleViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6) {
        TransferToMultipleViewModel_Factory $r6 = new TransferToMultipleViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToMultipleViewModel newInstance(Application application, FetchCurrentUser fetchCurrentUser, AccountLookup accountLookup, Analytics analytics, SubmitMultipleTransferRequest submitMultipleTransferRequest, SharedPreferences sharedPreferences) {
        TransferToMultipleViewModel $r6 = new TransferToMultipleViewModel(application, fetchCurrentUser, accountLookup, analytics, submitMultipleTransferRequest, sharedPreferences);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToMultipleViewModel multiply() {
        InterfaceC11700a $r1 = this.appProvider;
        Object $r2 = $r1.get();
        Application $r3 = (Application) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.accountLookupProvider;
        Object $r23 = $r13.get();
        AccountLookup $r5 = (AccountLookup) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.transferProvider;
        Object $r25 = $r15.get();
        SubmitMultipleTransferRequest submitMultipleTransferRequest = (SubmitMultipleTransferRequest) $r25;
        InterfaceC11700a $r16 = this.sharedPreferencesProvider;
        Object $r26 = $r16.get();
        TransferToMultipleViewModel $r9 = newInstance($r3, $r4, $r5, $r6, submitMultipleTransferRequest, (SharedPreferences) $r26);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41415multiply() {
        TransferToMultipleViewModel $r1 = multiply();
        return $r1;
    }
}
