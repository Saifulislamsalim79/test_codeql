package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.IssueContainerPresenter;
import dagger.android.DispatchingAndroidInjector;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueActivity_MembersInjector */
/* loaded from: classes.dex */
public final class IssueActivity_MembersInjector implements InterfaceC9463a<IssueActivity> {
    private final InterfaceC11700a<DispatchingAndroidInjector<Object>> androidInjectorProvider;
    private final InterfaceC11700a<IssueContainerPresenter> thisPresenterProvider;

    public IssueActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.androidInjectorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        IssueActivity_MembersInjector $r2 = new IssueActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectAndroidInjector(IssueActivity issueActivity, DispatchingAndroidInjector dispatchingAndroidInjector) {
        issueActivity.androidInjector = dispatchingAndroidInjector;
    }

    public static void injectThisPresenter(IssueActivity issueActivity, IssueContainerPresenter issueContainerPresenter) {
        issueActivity.thisPresenter = issueContainerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueActivity issueActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        IssueContainerPresenter $r4 = (IssueContainerPresenter) $r3;
        injectThisPresenter(issueActivity, $r4);
        InterfaceC11700a $r22 = this.androidInjectorProvider;
        Object $r32 = $r22.get();
        DispatchingAndroidInjector $r5 = (DispatchingAndroidInjector) $r32;
        injectAndroidInjector(issueActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueActivity $r2 = (IssueActivity) obj;
        injectMembers($r2);
    }
}
