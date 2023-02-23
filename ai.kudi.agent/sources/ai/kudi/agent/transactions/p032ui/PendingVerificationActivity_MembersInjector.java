package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.PendingVerificationPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationActivity_MembersInjector */
/* loaded from: classes.dex */
public final class PendingVerificationActivity_MembersInjector implements InterfaceC9463a<PendingVerificationActivity> {
    private final InterfaceC11700a<PendingVerificationPresenter> thisPresenterProvider;

    public PendingVerificationActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PendingVerificationActivity_MembersInjector $r1 = new PendingVerificationActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(PendingVerificationActivity pendingVerificationActivity, PendingVerificationPresenter pendingVerificationPresenter) {
        pendingVerificationActivity.thisPresenter = pendingVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PendingVerificationActivity pendingVerificationActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        PendingVerificationPresenter $r4 = (PendingVerificationPresenter) $r2;
        injectThisPresenter(pendingVerificationActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PendingVerificationActivity $r2 = (PendingVerificationActivity) obj;
        injectMembers($r2);
    }
}
