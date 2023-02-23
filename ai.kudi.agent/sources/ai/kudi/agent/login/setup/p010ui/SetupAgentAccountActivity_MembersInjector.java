package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.login.setup.presenters.SecureAccountPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.login.setup.ui.SetupAgentAccountActivity_MembersInjector */
/* loaded from: classes.dex */
public final class SetupAgentAccountActivity_MembersInjector implements InterfaceC9463a<SetupAgentAccountActivity> {
    private final InterfaceC11700a<SecureAccountPresenter> thisPresenterProvider;

    public SetupAgentAccountActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SetupAgentAccountActivity_MembersInjector $r1 = new SetupAgentAccountActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(SetupAgentAccountActivity setupAgentAccountActivity, SecureAccountPresenter secureAccountPresenter) {
        setupAgentAccountActivity.thisPresenter = secureAccountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SetupAgentAccountActivity setupAgentAccountActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        SecureAccountPresenter $r4 = (SecureAccountPresenter) $r2;
        injectThisPresenter(setupAgentAccountActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SetupAgentAccountActivity $r2 = (SetupAgentAccountActivity) obj;
        injectMembers($r2);
    }
}
