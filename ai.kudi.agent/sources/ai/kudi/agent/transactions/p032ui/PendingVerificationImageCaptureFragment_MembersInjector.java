package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.presenters.PendingVerificationImageCapturePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationImageCaptureFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PendingVerificationImageCaptureFragment_MembersInjector implements InterfaceC9463a<PendingVerificationImageCaptureFragment> {
    private final InterfaceC11700a<PendingVerificationImageCapturePresenter> thisPresenterProvider;

    public PendingVerificationImageCaptureFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PendingVerificationImageCaptureFragment_MembersInjector $r1 = new PendingVerificationImageCaptureFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment, PendingVerificationImageCapturePresenter pendingVerificationImageCapturePresenter) {
        pendingVerificationImageCaptureFragment.thisPresenter = pendingVerificationImageCapturePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PendingVerificationImageCaptureFragment pendingVerificationImageCaptureFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        PendingVerificationImageCapturePresenter $r4 = (PendingVerificationImageCapturePresenter) $r2;
        injectThisPresenter(pendingVerificationImageCaptureFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PendingVerificationImageCaptureFragment $r2 = (PendingVerificationImageCaptureFragment) obj;
        injectMembers($r2);
    }
}
