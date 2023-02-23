package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.PendingVerificationPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActionActivity_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionDetailsActionActivity_MembersInjector implements InterfaceC9463a<TransactionDetailsActionActivity> {
    private final InterfaceC11700a<PendingVerificationPresenter> thisPresenterProvider;

    public TransactionDetailsActionActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransactionDetailsActionActivity_MembersInjector $r1 = new TransactionDetailsActionActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(TransactionDetailsActionActivity transactionDetailsActionActivity, PendingVerificationPresenter pendingVerificationPresenter) {
        transactionDetailsActionActivity.thisPresenter = pendingVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionDetailsActionActivity transactionDetailsActionActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        PendingVerificationPresenter $r4 = (PendingVerificationPresenter) $r2;
        injectThisPresenter(transactionDetailsActionActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionDetailsActionActivity $r2 = (TransactionDetailsActionActivity) obj;
        injectMembers($r2);
    }
}
