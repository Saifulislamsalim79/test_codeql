package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import android.content.SharedPreferences;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsContainerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionsContainerFragment_MembersInjector implements InterfaceC9463a<TransactionsContainerFragment> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TransactionsViewModel> viewModelProvider;

    public TransactionsContainerFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.androidInjectorProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
        this.viewModelProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        TransactionsContainerFragment_MembersInjector $r3 = new TransactionsContainerFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectAndroidInjector(TransactionsContainerFragment transactionsContainerFragment, DispatchingAndroidInjector dispatchingAndroidInjector) {
        transactionsContainerFragment.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectSharedPreferences(TransactionsContainerFragment transactionsContainerFragment, SharedPreferences sharedPreferences) {
        transactionsContainerFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectViewModel(TransactionsContainerFragment transactionsContainerFragment, TransactionsViewModel transactionsViewModel) {
        transactionsContainerFragment.viewModel = transactionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionsContainerFragment transactionsContainerFragment) {
        InterfaceC11700a $r2 = this.androidInjectorProvider;
        Object $r3 = $r2.get();
        DispatchingAndroidInjector $r4 = (DispatchingAndroidInjector) $r3;
        injectAndroidInjector(transactionsContainerFragment, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(transactionsContainerFragment, $r5);
        InterfaceC11700a $r23 = this.viewModelProvider;
        Object $r33 = $r23.get();
        TransactionsViewModel $r6 = (TransactionsViewModel) $r33;
        injectViewModel(transactionsContainerFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionsContainerFragment $r2 = (TransactionsContainerFragment) obj;
        injectMembers($r2);
    }
}
