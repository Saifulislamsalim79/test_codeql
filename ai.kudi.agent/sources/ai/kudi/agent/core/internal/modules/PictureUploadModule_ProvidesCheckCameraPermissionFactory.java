package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.usecases.CheckPermission;
import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PictureUploadModule_ProvidesCheckCameraPermissionFactory implements InterfaceC9468d<CheckPermission> {
    private final InterfaceC11700a<Context> contextProvider;
    private final PictureUploadModule module;

    public PictureUploadModule_ProvidesCheckCameraPermissionFactory(PictureUploadModule pictureUploadModule, InterfaceC11700a interfaceC11700a) {
        this.module = pictureUploadModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PictureUploadModule_ProvidesCheckCameraPermissionFactory create(PictureUploadModule pictureUploadModule, InterfaceC11700a interfaceC11700a) {
        PictureUploadModule_ProvidesCheckCameraPermissionFactory $r2 = new PictureUploadModule_ProvidesCheckCameraPermissionFactory(pictureUploadModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CheckPermission providesCheckCameraPermission(PictureUploadModule pictureUploadModule, Context context) {
        CheckPermission $r1 = pictureUploadModule.providesCheckCameraPermission(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public CheckPermission get() {
        PictureUploadModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        CheckPermission $r5 = providesCheckCameraPermission($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        CheckPermission $r1 = get();
        return $r1;
    }
}
