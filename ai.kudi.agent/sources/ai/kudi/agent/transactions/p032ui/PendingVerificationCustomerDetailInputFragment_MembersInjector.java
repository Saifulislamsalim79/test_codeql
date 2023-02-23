package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.transactions.viewmodels.PendingVerificationCustomerDetailInputPresenter;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.PendingVerificationCustomerDetailInputFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PendingVerificationCustomerDetailInputFragment_MembersInjector implements InterfaceC9463a<PendingVerificationCustomerDetailInputFragment> {
    private final InterfaceC11700a<k> firebaseRemoteConfigProvider;
    private final InterfaceC11700a<PendingVerificationCustomerDetailInputPresenter> thisPresenterProvider;

    public PendingVerificationCustomerDetailInputFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.firebaseRemoteConfigProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PendingVerificationCustomerDetailInputFragment_MembersInjector $r2 = new PendingVerificationCustomerDetailInputFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectFirebaseRemoteConfig(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, Frame frame) {
        pendingVerificationCustomerDetailInputFragment.firebaseRemoteConfig = frame;
    }

    public static void injectThisPresenter(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment, PendingVerificationCustomerDetailInputPresenter pendingVerificationCustomerDetailInputPresenter) {
        pendingVerificationCustomerDetailInputFragment.thisPresenter = pendingVerificationCustomerDetailInputPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PendingVerificationCustomerDetailInputFragment pendingVerificationCustomerDetailInputFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        PendingVerificationCustomerDetailInputPresenter $r4 = (PendingVerificationCustomerDetailInputPresenter) $r3;
        injectThisPresenter(pendingVerificationCustomerDetailInputFragment, $r4);
        InterfaceC11700a $r22 = this.firebaseRemoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectFirebaseRemoteConfig(pendingVerificationCustomerDetailInputFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PendingVerificationCustomerDetailInputFragment $r2 = (PendingVerificationCustomerDetailInputFragment) obj;
        injectMembers($r2);
    }
}
