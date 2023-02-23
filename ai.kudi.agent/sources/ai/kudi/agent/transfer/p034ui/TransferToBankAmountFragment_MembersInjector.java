package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.transfer.presenter.TransferToBankAmountPresenter;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankAmountFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransferToBankAmountFragment_MembersInjector implements InterfaceC9463a<TransferToBankAmountFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TransferToBankAmountPresenter> thisPresenterProvider;

    public TransferToBankAmountFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransferToBankAmountFragment_MembersInjector $r2 = new TransferToBankAmountFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPreferences(TransferToBankAmountFragment transferToBankAmountFragment, SharedPreferences sharedPreferences) {
        transferToBankAmountFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectThisPresenter(TransferToBankAmountFragment transferToBankAmountFragment, TransferToBankAmountPresenter transferToBankAmountPresenter) {
        transferToBankAmountFragment.thisPresenter = transferToBankAmountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferToBankAmountFragment transferToBankAmountFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        TransferToBankAmountPresenter $r4 = (TransferToBankAmountPresenter) $r3;
        injectThisPresenter(transferToBankAmountFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(transferToBankAmountFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferToBankAmountFragment $r2 = (TransferToBankAmountFragment) obj;
        injectMembers($r2);
    }
}
