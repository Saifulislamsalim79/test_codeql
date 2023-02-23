package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transfer.ui.TransferToMultipleBankFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransferToMultipleBankFragment_MembersInjector implements InterfaceC9463a<TransferToMultipleBankFragment> {
    private final InterfaceC11700a<MainTransferView> mainTransferViewProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TransferToMultipleViewModel> viewModelProvider;

    public TransferToMultipleBankFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.viewModelProvider = interfaceC11700a;
        this.mainTransferViewProvider = interfaceC11700a2;
        this.sharedPreferencesProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        TransferToMultipleBankFragment_MembersInjector $r3 = new TransferToMultipleBankFragment_MembersInjector(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    public static void injectMainTransferView(TransferToMultipleBankFragment transferToMultipleBankFragment, MainTransferView mainTransferView) {
        transferToMultipleBankFragment.mainTransferView = mainTransferView;
    }

    public static void injectSharedPreferences(TransferToMultipleBankFragment transferToMultipleBankFragment, SharedPreferences sharedPreferences) {
        transferToMultipleBankFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectViewModel(TransferToMultipleBankFragment transferToMultipleBankFragment, TransferToMultipleViewModel transferToMultipleViewModel) {
        transferToMultipleBankFragment.viewModel = transferToMultipleViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransferToMultipleBankFragment transferToMultipleBankFragment) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        TransferToMultipleViewModel $r4 = (TransferToMultipleViewModel) $r3;
        injectViewModel(transferToMultipleBankFragment, $r4);
        InterfaceC11700a $r22 = this.mainTransferViewProvider;
        Object $r32 = $r22.get();
        MainTransferView $r5 = (MainTransferView) $r32;
        injectMainTransferView(transferToMultipleBankFragment, $r5);
        InterfaceC11700a $r23 = this.sharedPreferencesProvider;
        Object $r33 = $r23.get();
        SharedPreferences $r6 = (SharedPreferences) $r33;
        injectSharedPreferences(transferToMultipleBankFragment, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransferToMultipleBankFragment $r2 = (TransferToMultipleBankFragment) obj;
        injectMembers($r2);
    }
}
