package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.p036v2.common.view.viewModels.MediaUploadViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.view.fragment.ImagePickerFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ImagePickerFragment_MembersInjector implements InterfaceC9463a<ImagePickerFragment> {
    private final InterfaceC11700a<MediaUploadViewModel> mediaUploadViewModelProvider;

    public ImagePickerFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.mediaUploadViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ImagePickerFragment_MembersInjector $r1 = new ImagePickerFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectMediaUploadViewModel(ImagePickerFragment imagePickerFragment, MediaUploadViewModel mediaUploadViewModel) {
        imagePickerFragment.mediaUploadViewModel = mediaUploadViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ImagePickerFragment imagePickerFragment) {
        InterfaceC11700a $r3 = this.mediaUploadViewModelProvider;
        Object $r2 = $r3.get();
        MediaUploadViewModel $r4 = (MediaUploadViewModel) $r2;
        injectMediaUploadViewModel(imagePickerFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ImagePickerFragment $r2 = (ImagePickerFragment) obj;
        injectMembers($r2);
    }
}
