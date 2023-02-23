package ai.kudi.agent.pictureupload.p015ui;

import ai.kudi.agent.register.p021ui.viewmodels.PictureUploadViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pictureupload.ui.PictureUploadFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PictureUploadFragment_MembersInjector implements InterfaceC9463a<PictureUploadFragment> {
    private final InterfaceC11700a<PictureUploadViewModel> vmProvider;

    public PictureUploadFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.vmProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PictureUploadFragment_MembersInjector $r1 = new PictureUploadFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectVm(PictureUploadFragment pictureUploadFragment, PictureUploadViewModel pictureUploadViewModel) {
        pictureUploadFragment.srv = pictureUploadViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PictureUploadFragment pictureUploadFragment) {
        InterfaceC11700a $r3 = this.vmProvider;
        Object $r2 = $r3.get();
        PictureUploadViewModel $r4 = (PictureUploadViewModel) $r2;
        injectVm(pictureUploadFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PictureUploadFragment $r2 = (PictureUploadFragment) obj;
        injectMembers($r2);
    }
}
