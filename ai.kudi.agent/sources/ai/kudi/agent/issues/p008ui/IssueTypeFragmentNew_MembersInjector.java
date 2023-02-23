package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.IssueTypeViewModel;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragmentNew_MembersInjector */
/* loaded from: classes.dex */
public final class IssueTypeFragmentNew_MembersInjector implements InterfaceC9463a<IssueTypeFragmentNew> {
    private final InterfaceC11700a<IssueTypeViewModel> issueTypeViewModelProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public IssueTypeFragmentNew_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.issueTypeViewModelProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        IssueTypeFragmentNew_MembersInjector $r2 = new IssueTypeFragmentNew_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectIssueTypeViewModel(IssueTypeFragmentNew issueTypeFragmentNew, IssueTypeViewModel issueTypeViewModel) {
        issueTypeFragmentNew.issueTypeViewModel = issueTypeViewModel;
    }

    public static void injectSharedPreferences(IssueTypeFragmentNew issueTypeFragmentNew, SharedPreferences sharedPreferences) {
        issueTypeFragmentNew.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueTypeFragmentNew issueTypeFragmentNew) {
        InterfaceC11700a $r2 = this.issueTypeViewModelProvider;
        Object $r3 = $r2.get();
        IssueTypeViewModel $r4 = (IssueTypeViewModel) $r3;
        injectIssueTypeViewModel(issueTypeFragmentNew, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(issueTypeFragmentNew, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueTypeFragmentNew $r2 = (IssueTypeFragmentNew) obj;
        injectMembers($r2);
    }
}
