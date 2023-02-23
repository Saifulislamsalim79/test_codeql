package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.transactionstatus.summary.presenter.TransferSummaryPresenter;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.TransferSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransferSummaryFragment_MembersInjector implements InterfaceC9463a<TransferSummaryFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TransferSummaryPresenter> thisPresenterProvider;

    public TransferSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransferSummaryFragment_MembersInjector $r2 = new TransferSummaryFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPreferences(TransferSummaryFragment transferSummaryFragment, SharedPreferences sharedPreferences) {
        transferSummaryFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectThisPresenter(TransferSummaryFragment transferSummaryFragment, TransferSummaryPresenter transferSummaryPresenter) {
        transferSummaryFragment.thisPresenter = transferSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferSummaryFragment transferSummaryFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        TransferSummaryPresenter $r4 = (TransferSummaryPresenter) $r3;
        injectThisPresenter(transferSummaryFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(transferSummaryFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferSummaryFragment $r2 = (TransferSummaryFragment) obj;
        injectMembers($r2);
    }
}
