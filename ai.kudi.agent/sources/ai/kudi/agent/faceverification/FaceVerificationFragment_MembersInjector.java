package ai.kudi.agent.faceverification;

import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FaceVerificationFragment_MembersInjector implements InterfaceC9463a<FaceVerificationFragment> {
    private final InterfaceC11700a<FaceVerificationViewModel> viewModelProvider;

    public FaceVerificationFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        FaceVerificationFragment_MembersInjector $r1 = new FaceVerificationFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(FaceVerificationFragment faceVerificationFragment, FaceVerificationViewModel faceVerificationViewModel) {
        faceVerificationFragment.viewModel = faceVerificationViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(FaceVerificationFragment faceVerificationFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        FaceVerificationViewModel $r4 = (FaceVerificationViewModel) $r2;
        injectViewModel(faceVerificationFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        FaceVerificationFragment $r2 = (FaceVerificationFragment) obj;
        injectMembers($r2);
    }
}
