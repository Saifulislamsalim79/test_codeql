package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.ContactUsViewModel;
import com.google.firebase.remoteconfig.Frame;
import com.google.firebase.remoteconfig.k;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.ContactUsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ContactUsFragment_MembersInjector implements InterfaceC9463a<ContactUsFragment> {
    private final InterfaceC11700a<k> remoteConfigProvider;
    private final InterfaceC11700a<ContactUsViewModel> screenViewModelProvider;

    public ContactUsFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.screenViewModelProvider = interfaceC11700a;
        this.remoteConfigProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        ContactUsFragment_MembersInjector $r2 = new ContactUsFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectRemoteConfig(ContactUsFragment contactUsFragment, Frame frame) {
        contactUsFragment.remoteConfig = frame;
    }

    public static void injectScreenViewModel(ContactUsFragment contactUsFragment, ContactUsViewModel contactUsViewModel) {
        contactUsFragment.screenViewModel = contactUsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ContactUsFragment contactUsFragment) {
        InterfaceC11700a $r2 = this.screenViewModelProvider;
        Object $r3 = $r2.get();
        ContactUsViewModel $r4 = (ContactUsViewModel) $r3;
        injectScreenViewModel(contactUsFragment, $r4);
        InterfaceC11700a $r22 = this.remoteConfigProvider;
        Object $r32 = $r22.get();
        Frame $r5 = (Frame) $r32;
        injectRemoteConfig(contactUsFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ContactUsFragment $r2 = (ContactUsFragment) obj;
        injectMembers($r2);
    }
}
