package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.EmailTransactionReportPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.EmailTransactionReportActivity_MembersInjector */
/* loaded from: classes.dex */
public final class EmailTransactionReportActivity_MembersInjector implements InterfaceC9463a<EmailTransactionReportActivity> {
    private final InterfaceC11700a<EmailTransactionReportPresenter> thisPresenterProvider;

    public EmailTransactionReportActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        EmailTransactionReportActivity_MembersInjector $r1 = new EmailTransactionReportActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(EmailTransactionReportActivity emailTransactionReportActivity, EmailTransactionReportPresenter emailTransactionReportPresenter) {
        emailTransactionReportActivity.thisPresenter = emailTransactionReportPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(EmailTransactionReportActivity emailTransactionReportActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        EmailTransactionReportPresenter $r4 = (EmailTransactionReportPresenter) $r2;
        injectThisPresenter(emailTransactionReportActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        EmailTransactionReportActivity $r2 = (EmailTransactionReportActivity) obj;
        injectMembers($r2);
    }
}
