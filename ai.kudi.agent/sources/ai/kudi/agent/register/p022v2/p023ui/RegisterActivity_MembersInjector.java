package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.register.p021ui.viewmodels.ContainerViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.register.v2.ui.RegisterActivity_MembersInjector */
/* loaded from: classes.dex */
public final class RegisterActivity_MembersInjector implements InterfaceC9463a<RegisterActivity> {
    private final InterfaceC11700a<ContainerViewModel> viewModelProvider;

    public RegisterActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        RegisterActivity_MembersInjector $r1 = new RegisterActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(RegisterActivity registerActivity, ContainerViewModel containerViewModel) {
        registerActivity.viewModel = containerViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(RegisterActivity registerActivity) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        ContainerViewModel $r4 = (ContainerViewModel) $r2;
        injectViewModel(registerActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        RegisterActivity $r2 = (RegisterActivity) obj;
        injectMembers($r2);
    }
}
