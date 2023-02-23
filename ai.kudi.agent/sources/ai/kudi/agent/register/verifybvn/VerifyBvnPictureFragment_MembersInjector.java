package ai.kudi.agent.register.verifybvn;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class VerifyBvnPictureFragment_MembersInjector implements InterfaceC9463a<VerifyBvnPictureFragment> {
    private final InterfaceC11700a<VerifyBvnPictureViewModel> viewModelProvider;

    public VerifyBvnPictureFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        VerifyBvnPictureFragment_MembersInjector $r1 = new VerifyBvnPictureFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(VerifyBvnPictureFragment verifyBvnPictureFragment, VerifyBvnPictureViewModel verifyBvnPictureViewModel) {
        verifyBvnPictureFragment.viewModel = verifyBvnPictureViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(VerifyBvnPictureFragment verifyBvnPictureFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        VerifyBvnPictureViewModel $r4 = (VerifyBvnPictureViewModel) $r2;
        injectViewModel(verifyBvnPictureFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        VerifyBvnPictureFragment $r2 = (VerifyBvnPictureFragment) obj;
        injectMembers($r2);
    }
}
