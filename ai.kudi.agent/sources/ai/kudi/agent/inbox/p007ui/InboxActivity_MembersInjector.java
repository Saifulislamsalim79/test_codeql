package ai.kudi.agent.inbox.p007ui;

import ai.kudi.agent.inbox.presenters.InboxContainerPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.inbox.ui.InboxActivity_MembersInjector */
/* loaded from: classes.dex */
public final class InboxActivity_MembersInjector implements InterfaceC9463a<InboxActivity> {
    private final InterfaceC11700a<InboxContainerPresenter> thisPresenterProvider;

    public InboxActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        InboxActivity_MembersInjector $r1 = new InboxActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(InboxActivity inboxActivity, InboxContainerPresenter inboxContainerPresenter) {
        inboxActivity.thisPresenter = inboxContainerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(InboxActivity inboxActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        InboxContainerPresenter $r4 = (InboxContainerPresenter) $r2;
        injectThisPresenter(inboxActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        InboxActivity $r2 = (InboxActivity) obj;
        injectMembers($r2);
    }
}
