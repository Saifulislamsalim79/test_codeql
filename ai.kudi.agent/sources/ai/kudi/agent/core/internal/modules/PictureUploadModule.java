package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.core.usecases.RequestFragmentPermissionUseCase;
import ai.kudi.agent.core.usecases.RequestPermission;
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PictureUploadModule.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/PictureUploadModule;", "", "()V", "providesCheckCameraPermission", "Lai/kudi/agent/core/usecases/CheckPermission;", "context", "Landroid/content/Context;", "providesCheckStoragePermission", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PictureUploadModule {
    public static final Companion Companion;
    private static final int cameraPermissionRequestCode = 0;
    private static final int storagePermissionRequestCode = 0;

    /* compiled from: PictureUploadModule.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/PictureUploadModule$Companion;", "", "()V", "cameraPermissionRequestCode", "", "storagePermissionRequestCode", "providesCameraPermission", "Lai/kudi/agent/core/usecases/RequestPermission;", "fragment", "Landroidx/fragment/app/Fragment;", "providesStoragePermission", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final RequestPermission providesCameraPermission(Fragment fragment) {
            Log_OC.getArray(fragment, "fragment");
            RequestFragmentPermissionUseCase $r2 = new RequestFragmentPermissionUseCase("android.permission.CAMERA", 0, fragment);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final RequestPermission providesStoragePermission(Fragment fragment) {
            Log_OC.getArray(fragment, "fragment");
            RequestFragmentPermissionUseCase $r2 = new RequestFragmentPermissionUseCase("android.permission.READ_EXTERNAL_STORAGE", 0, fragment);
            return $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CheckPermission providesCheckCameraPermission(Context context) {
        Log_OC.getArray(context, "context");
        CheckPermission $r2 = new CheckPermission("android.permission.CAMERA", context);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CheckPermission providesCheckStoragePermission(Context context) {
        Log_OC.getArray(context, "context");
        CheckPermission $r2 = new CheckPermission("android.permission.READ_EXTERNAL_STORAGE", context);
        return $r2;
    }
}
