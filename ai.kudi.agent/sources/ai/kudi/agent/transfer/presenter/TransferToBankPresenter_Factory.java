package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.transfer.domain.usecases.TransactionLookUpUsecase;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransferToBankPresenter_Factory implements InterfaceC9468d<TransferToBankPresenter> {
    private final InterfaceC11700a<AccountLookup> accountLookupProvider;
    private final InterfaceC11700a<AccountRepository> accountRepositoryProvider;
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<TransactionLookUpUsecase> lookUpUsecaseProvider;
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;
    private final InterfaceC11700a<Pref> prefProvider;

    public TransferToBankPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.prefProvider = interfaceC11700a;
        this.accountRepositoryProvider = interfaceC11700a2;
        this.accountLookupProvider = interfaceC11700a3;
        this.currentUserProvider = interfaceC11700a4;
        this.mainTransferViewProvider = interfaceC11700a5;
        this.analyticsProvider = interfaceC11700a6;
        this.lookUpUsecaseProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        TransferToBankPresenter_Factory $r7 = new TransferToBankPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransferToBankPresenter newInstance(Pref pref, AccountRepository accountRepository, AccountLookup accountLookup, FetchCurrentUser fetchCurrentUser, MainTransferView mainTransferView, Analytics analytics, TransactionLookUpUsecase transactionLookUpUsecase) {
        TransferToBankPresenter $r7 = new TransferToBankPresenter(pref, accountRepository, accountLookup, fetchCurrentUser, mainTransferView, analytics, transactionLookUpUsecase);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToBankPresenter multiply() {
        InterfaceC11700a $r1 = this.prefProvider;
        Object $r2 = $r1.get();
        Pref $r3 = (Pref) $r2;
        InterfaceC11700a $r12 = this.accountRepositoryProvider;
        Object $r22 = $r12.get();
        AccountRepository $r4 = (AccountRepository) $r22;
        InterfaceC11700a $r13 = this.accountLookupProvider;
        Object $r23 = $r13.get();
        AccountLookup $r5 = (AccountLookup) $r23;
        InterfaceC11700a $r14 = this.currentUserProvider;
        Object $r24 = $r14.get();
        FetchCurrentUser fetchCurrentUser = (FetchCurrentUser) $r24;
        InterfaceC11700a $r15 = this.mainTransferViewProvider;
        Object $r25 = $r15.get();
        MainTransferView mainTransferView = (MainTransferView) $r25;
        InterfaceC11700a $r16 = this.analyticsProvider;
        Object $r26 = $r16.get();
        Analytics analytics = (Analytics) $r26;
        InterfaceC11700a $r17 = this.lookUpUsecaseProvider;
        Object $r27 = $r17.get();
        TransactionLookUpUsecase $r9 = (TransactionLookUpUsecase) $r27;
        TransferToBankPresenter $r10 = newInstance($r3, $r4, $r5, fetchCurrentUser, mainTransferView, analytics, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41377multiply() {
        TransferToBankPresenter $r1 = multiply();
        return $r1;
    }
}
