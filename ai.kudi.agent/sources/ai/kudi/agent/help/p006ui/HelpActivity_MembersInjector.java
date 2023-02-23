package ai.kudi.agent.help.p006ui;

import ai.kudi.agent.help.presenter.HelpPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.help.ui.HelpActivity_MembersInjector */
/* loaded from: classes.dex */
public final class HelpActivity_MembersInjector implements InterfaceC9463a<HelpActivity> {
    private final InterfaceC11700a<HelpPresenter> thisPresenterProvider;

    public HelpActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        HelpActivity_MembersInjector $r1 = new HelpActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(HelpActivity helpActivity, HelpPresenter helpPresenter) {
        helpActivity.thisPresenter = helpPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(HelpActivity helpActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        HelpPresenter $r4 = (HelpPresenter) $r2;
        injectThisPresenter(helpActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        HelpActivity $r2 = (HelpActivity) obj;
        injectMembers($r2);
    }
}
