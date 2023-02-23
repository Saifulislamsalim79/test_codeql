package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.settings.personal.p027ui.viewModels.AboutKycViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.personal.ui.AboutKycFragment_MembersInjector */
/* loaded from: classes.dex */
public final class AboutKycFragment_MembersInjector implements InterfaceC9463a<AboutKycFragment> {
    private final InterfaceC11700a<AboutKycViewModel> aboutKycViewModelProvider;

    public AboutKycFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.aboutKycViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        AboutKycFragment_MembersInjector $r1 = new AboutKycFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectAboutKycViewModel(AboutKycFragment aboutKycFragment, AboutKycViewModel aboutKycViewModel) {
        aboutKycFragment.aboutKycViewModel = aboutKycViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(AboutKycFragment aboutKycFragment) {
        InterfaceC11700a $r3 = this.aboutKycViewModelProvider;
        Object $r2 = $r3.get();
        AboutKycViewModel $r4 = (AboutKycViewModel) $r2;
        injectAboutKycViewModel(aboutKycFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        AboutKycFragment $r2 = (AboutKycFragment) obj;
        injectMembers($r2);
    }
}
