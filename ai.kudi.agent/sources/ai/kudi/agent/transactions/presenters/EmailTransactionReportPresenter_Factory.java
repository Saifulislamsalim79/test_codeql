package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.domain.usecases.SendTransactionToMail;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class EmailTransactionReportPresenter_Factory implements InterfaceC9468d<EmailTransactionReportPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<SendTransactionToMail> sendTransactionToMailProvider;

    public EmailTransactionReportPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.sendTransactionToMailProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmailTransactionReportPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        EmailTransactionReportPresenter_Factory $r2 = new EmailTransactionReportPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static EmailTransactionReportPresenter newInstance(SendTransactionToMail sendTransactionToMail, FetchCurrentUser fetchCurrentUser) {
        EmailTransactionReportPresenter $r2 = new EmailTransactionReportPresenter(sendTransactionToMail, fetchCurrentUser);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EmailTransactionReportPresenter multiply() {
        InterfaceC11700a $r1 = this.sendTransactionToMailProvider;
        Object $r2 = $r1.get();
        SendTransactionToMail $r3 = (SendTransactionToMail) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        EmailTransactionReportPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41158multiply() {
        EmailTransactionReportPresenter $r1 = multiply();
        return $r1;
    }
}
