package ai.kudi.agent.p036v2.common.domain.usecases;

import ai.kudi.mediaservice.marketplaceCollection.FileStorageClient;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.domain.usecases.FileUpload_Factory */
/* loaded from: classes.dex */
public final class FileUpload_Factory implements InterfaceC9468d<FileUpload> {
    private final InterfaceC11700a<FileStorageClient> mediaServiceProvider;

    public FileUpload_Factory(InterfaceC11700a interfaceC11700a) {
        this.mediaServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FileUpload_Factory create(InterfaceC11700a interfaceC11700a) {
        FileUpload_Factory $r1 = new FileUpload_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FileUpload newInstance(FileStorageClient fileStorageClient) {
        FileUpload $r1 = new FileUpload(fileStorageClient);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FileUpload multiply() {
        InterfaceC11700a $r1 = this.mediaServiceProvider;
        Object $r2 = $r1.get();
        FileStorageClient $r3 = (FileStorageClient) $r2;
        FileUpload $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41536multiply() {
        FileUpload $r1 = multiply();
        return $r1;
    }
}
