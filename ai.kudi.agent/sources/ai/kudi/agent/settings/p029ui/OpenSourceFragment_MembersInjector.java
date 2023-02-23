package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.settings.p029ui.viewModels.OpenSourceViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.OpenSourceFragment_MembersInjector */
/* loaded from: classes.dex */
public final class OpenSourceFragment_MembersInjector implements InterfaceC9463a<OpenSourceFragment> {
    private final InterfaceC11700a<OpenSourceViewModel> openSourceViewModelProvider;

    public OpenSourceFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.openSourceViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OpenSourceFragment_MembersInjector $r1 = new OpenSourceFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectOpenSourceViewModel(OpenSourceFragment openSourceFragment, OpenSourceViewModel openSourceViewModel) {
        openSourceFragment.openSourceViewModel = openSourceViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OpenSourceFragment openSourceFragment) {
        InterfaceC11700a $r3 = this.openSourceViewModelProvider;
        Object $r2 = $r3.get();
        OpenSourceViewModel $r4 = (OpenSourceViewModel) $r2;
        injectOpenSourceViewModel(openSourceFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OpenSourceFragment $r2 = (OpenSourceFragment) obj;
        injectMembers($r2);
    }
}
