package ai.kudi.agent.p036v2.common.view.viewModels;

import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.view.viewModels.MediaUploadViewModel_Factory */
/* loaded from: classes.dex */
public final class MediaUploadViewModel_Factory implements InterfaceC9468d<MediaUploadViewModel> {
    private final InterfaceC11700a<FileUpload> fileUploadProvider;

    public MediaUploadViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.fileUploadProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MediaUploadViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        MediaUploadViewModel_Factory $r1 = new MediaUploadViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MediaUploadViewModel newInstance(FileUpload fileUpload) {
        MediaUploadViewModel $r1 = new MediaUploadViewModel(fileUpload);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MediaUploadViewModel multiply() {
        InterfaceC11700a $r1 = this.fileUploadProvider;
        Object $r2 = $r1.get();
        FileUpload $r3 = (FileUpload) $r2;
        MediaUploadViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41565multiply() {
        MediaUploadViewModel $r1 = multiply();
        return $r1;
    }
}
