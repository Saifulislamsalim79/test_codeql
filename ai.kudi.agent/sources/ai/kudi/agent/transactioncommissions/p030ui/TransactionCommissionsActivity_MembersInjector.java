package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsActivityViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionCommissionsActivity_MembersInjector implements InterfaceC9463a<TransactionCommissionsActivity> {
    private final InterfaceC11700a<SharedPreferences> preferencesProvider;
    private final InterfaceC11700a<TransactionCommissionsActivityViewModel> viewModelProvider;

    public TransactionCommissionsActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.preferencesProvider = interfaceC11700a;
        this.viewModelProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        TransactionCommissionsActivity_MembersInjector $r2 = new TransactionCommissionsActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectPreferences(TransactionCommissionsActivity transactionCommissionsActivity, SharedPreferences sharedPreferences) {
        transactionCommissionsActivity.preferences = sharedPreferences;
    }

    public static void injectViewModel(TransactionCommissionsActivity transactionCommissionsActivity, TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel) {
        transactionCommissionsActivity.viewModel = transactionCommissionsActivityViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionCommissionsActivity transactionCommissionsActivity) {
        InterfaceC11700a $r2 = this.preferencesProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        injectPreferences(transactionCommissionsActivity, $r4);
        InterfaceC11700a $r22 = this.viewModelProvider;
        Object $r32 = $r22.get();
        TransactionCommissionsActivityViewModel $r5 = (TransactionCommissionsActivityViewModel) $r32;
        injectViewModel(transactionCommissionsActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionCommissionsActivity $r2 = (TransactionCommissionsActivity) obj;
        injectMembers($r2);
    }
}
