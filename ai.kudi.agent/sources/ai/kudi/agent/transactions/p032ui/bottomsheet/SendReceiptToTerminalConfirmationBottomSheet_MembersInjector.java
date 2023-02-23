package ai.kudi.agent.transactions.p032ui.bottomsheet;

import ai.kudi.agent.transactions.viewmodels.SendReceiptToTerminalViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactions.ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet_MembersInjector */
/* loaded from: classes.dex */
public final class SendReceiptToTerminalConfirmationBottomSheet_MembersInjector implements InterfaceC9463a<SendReceiptToTerminalConfirmationBottomSheet> {
    private final InterfaceC11700a<SendReceiptToTerminalViewModel> sendReceiptToTerminalViewModelProvider;

    public SendReceiptToTerminalConfirmationBottomSheet_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.sendReceiptToTerminalViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SendReceiptToTerminalConfirmationBottomSheet_MembersInjector $r1 = new SendReceiptToTerminalConfirmationBottomSheet_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSendReceiptToTerminalViewModel(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet, SendReceiptToTerminalViewModel sendReceiptToTerminalViewModel) {
        sendReceiptToTerminalConfirmationBottomSheet.sendReceiptToTerminalViewModel = sendReceiptToTerminalViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SendReceiptToTerminalConfirmationBottomSheet sendReceiptToTerminalConfirmationBottomSheet) {
        InterfaceC11700a $r3 = this.sendReceiptToTerminalViewModelProvider;
        Object $r2 = $r3.get();
        SendReceiptToTerminalViewModel $r4 = (SendReceiptToTerminalViewModel) $r2;
        injectSendReceiptToTerminalViewModel(sendReceiptToTerminalConfirmationBottomSheet, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SendReceiptToTerminalConfirmationBottomSheet $r2 = (SendReceiptToTerminalConfirmationBottomSheet) obj;
        injectMembers($r2);
    }
}
