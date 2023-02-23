package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.transfer.presenter.TransferToBankCustomerPresenter;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankCustomersFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransferToBankCustomersFragment_MembersInjector implements InterfaceC9463a<TransferToBankCustomersFragment> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TransferToBankCustomerPresenter> thisPresenterProvider;

    public TransferToBankCustomersFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransferToBankCustomersFragment_MembersInjector $r2 = new TransferToBankCustomersFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPreferences(TransferToBankCustomersFragment transferToBankCustomersFragment, SharedPreferences sharedPreferences) {
        transferToBankCustomersFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectThisPresenter(TransferToBankCustomersFragment transferToBankCustomersFragment, TransferToBankCustomerPresenter transferToBankCustomerPresenter) {
        transferToBankCustomersFragment.thisPresenter = transferToBankCustomerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferToBankCustomersFragment transferToBankCustomersFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        TransferToBankCustomerPresenter $r4 = (TransferToBankCustomerPresenter) $r3;
        injectThisPresenter(transferToBankCustomersFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(transferToBankCustomersFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferToBankCustomersFragment $r2 = (TransferToBankCustomersFragment) obj;
        injectMembers($r2);
    }
}
