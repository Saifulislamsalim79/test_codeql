package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.FetchCategoryByLabel;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.transactions.domain.usecases.InitializeTerminalRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class TransactionDetailsPresenter_Factory implements InterfaceC9468d<TransactionDetailsPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCategoryByLabel> fetchCategoryByLabelProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchTransaction> fetchTransactionProvider;
    private final InterfaceC11700a<C5615f> firebaseDatabaseProvider;
    private final InterfaceC11700a<InitializeTerminalRequest> initializeTerminalRequestProvider;
    private final InterfaceC11700a<UpdateNotificationReadStatus> updateNotificationReadStatusProvider;

    public TransactionDetailsPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        this.fetchTransactionProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.updateNotificationReadStatusProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.firebaseDatabaseProvider = interfaceC11700a5;
        this.fetchCategoryByLabelProvider = interfaceC11700a6;
        this.initializeTerminalRequestProvider = interfaceC11700a7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDetailsPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5, InterfaceC11700a interfaceC11700a6, InterfaceC11700a interfaceC11700a7) {
        TransactionDetailsPresenter_Factory $r7 = new TransactionDetailsPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5, interfaceC11700a6, interfaceC11700a7);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static TransactionDetailsPresenter newInstance(FetchTransaction fetchTransaction, FetchCurrentUser fetchCurrentUser, UpdateNotificationReadStatus updateNotificationReadStatus, Analytics analytics, C5615f c5615f, FetchCategoryByLabel fetchCategoryByLabel, InitializeTerminalRequest initializeTerminalRequest) {
        TransactionDetailsPresenter $r7 = new TransactionDetailsPresenter(fetchTransaction, fetchCurrentUser, updateNotificationReadStatus, analytics, c5615f, fetchCategoryByLabel, initializeTerminalRequest);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionDetailsPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchTransactionProvider;
        Object $r2 = $r1.get();
        FetchTransaction $r3 = (FetchTransaction) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.updateNotificationReadStatusProvider;
        Object $r23 = $r13.get();
        UpdateNotificationReadStatus $r5 = (UpdateNotificationReadStatus) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics analytics = (Analytics) $r24;
        InterfaceC11700a $r15 = this.firebaseDatabaseProvider;
        Object $r25 = $r15.get();
        C5615f c5615f = (C5615f) $r25;
        InterfaceC11700a $r16 = this.fetchCategoryByLabelProvider;
        Object $r26 = $r16.get();
        FetchCategoryByLabel fetchCategoryByLabel = (FetchCategoryByLabel) $r26;
        InterfaceC11700a $r17 = this.initializeTerminalRequestProvider;
        Object $r27 = $r17.get();
        InitializeTerminalRequest $r9 = (InitializeTerminalRequest) $r27;
        TransactionDetailsPresenter $r10 = newInstance($r3, $r4, $r5, analytics, c5615f, fetchCategoryByLabel, $r9);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41206multiply() {
        TransactionDetailsPresenter $r1 = multiply();
        return $r1;
    }
}
