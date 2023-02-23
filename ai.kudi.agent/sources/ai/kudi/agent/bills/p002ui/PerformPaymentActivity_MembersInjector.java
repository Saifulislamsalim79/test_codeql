package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.bills.viewmodels.PerformPaymentViewModel;
import ai.kudi.agent.users.p035ui.AuthDialog;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.bills.ui.PerformPaymentActivity_MembersInjector */
/* loaded from: classes.dex */
public final class PerformPaymentActivity_MembersInjector implements InterfaceC9463a<PerformPaymentActivity> {
    private final InterfaceC11700a<AuthDialog> authDialogProvider;
    private final InterfaceC11700a<PerformPaymentViewModel> viewModelProvider;

    public PerformPaymentActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.viewModelProvider = interfaceC11700a;
        this.authDialogProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PerformPaymentActivity_MembersInjector $r2 = new PerformPaymentActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAuthDialog(PerformPaymentActivity performPaymentActivity, AuthDialog authDialog) {
        performPaymentActivity.authDialog = authDialog;
    }

    public static void injectViewModel(PerformPaymentActivity performPaymentActivity, PerformPaymentViewModel performPaymentViewModel) {
        performPaymentActivity.viewModel = performPaymentViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PerformPaymentActivity performPaymentActivity) {
        InterfaceC11700a $r2 = this.viewModelProvider;
        Object $r3 = $r2.get();
        PerformPaymentViewModel $r4 = (PerformPaymentViewModel) $r3;
        injectViewModel(performPaymentActivity, $r4);
        InterfaceC11700a $r22 = this.authDialogProvider;
        Object $r32 = $r22.get();
        AuthDialog $r5 = (AuthDialog) $r32;
        injectAuthDialog(performPaymentActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PerformPaymentActivity $r2 = (PerformPaymentActivity) obj;
        injectMembers($r2);
    }
}
