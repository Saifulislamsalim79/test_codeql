package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.banks.useCases.FetchBanks;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapper;
import ai.kudi.agent.transactions.presenters.TransactionDetailsPresenter;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActivity_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionDetailsActivity_MembersInjector implements InterfaceC9463a<TransactionDetailsActivity> {
    private final InterfaceC11700a<FetchBanks> fetchBanksProvider;
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<k> remoteConfigProvider;
    private final InterfaceC11700a<TransactionDetailsPresenter> thisPresenterProvider;
    private final InterfaceC11700a<TransactionTypeMapper> transactionTypeMapperProvider;

    public TransactionDetailsActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.thisPresenterProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
        this.transactionTypeMapperProvider = interfaceC11700a3;
        this.prefProvider = interfaceC11700a4;
        this.fetchBanksProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        TransactionDetailsActivity_MembersInjector $r5 = new TransactionDetailsActivity_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    public static void injectFetchBanks(TransactionDetailsActivity transactionDetailsActivity, FetchBanks fetchBanks) {
        transactionDetailsActivity.fetchBanks = fetchBanks;
    }

    public static void injectPref(TransactionDetailsActivity transactionDetailsActivity, Pref pref) {
        transactionDetailsActivity.pref = pref;
    }

    public static void injectRemoteConfig(TransactionDetailsActivity transactionDetailsActivity, Frame frame) {
        transactionDetailsActivity.remoteConfig = frame;
    }

    public static void injectThisPresenter(TransactionDetailsActivity transactionDetailsActivity, TransactionDetailsPresenter transactionDetailsPresenter) {
        transactionDetailsActivity.thisPresenter = transactionDetailsPresenter;
    }

    public static void injectTransactionTypeMapper(TransactionDetailsActivity transactionDetailsActivity, TransactionTypeMapper transactionTypeMapper) {
        transactionDetailsActivity.transactionTypeMapper = transactionTypeMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionDetailsActivity transactionDetailsActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        TransactionDetailsPresenter $r4 = (TransactionDetailsPresenter) $r3;
        injectThisPresenter(transactionDetailsActivity, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(transactionDetailsActivity, $r5);
        InterfaceC11700a $r23 = this.transactionTypeMapperProvider;
        Object $r33 = $r23.get();
        TransactionTypeMapper $r6 = (TransactionTypeMapper) $r33;
        injectTransactionTypeMapper(transactionDetailsActivity, $r6);
        InterfaceC11700a $r24 = this.prefProvider;
        Object $r34 = $r24.get();
        Pref $r7 = (Pref) $r34;
        injectPref(transactionDetailsActivity, $r7);
        InterfaceC11700a $r25 = this.fetchBanksProvider;
        Object $r35 = $r25.get();
        FetchBanks $r8 = (FetchBanks) $r35;
        injectFetchBanks(transactionDetailsActivity, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionDetailsActivity $r2 = (TransactionDetailsActivity) obj;
        injectMembers($r2);
    }
}
