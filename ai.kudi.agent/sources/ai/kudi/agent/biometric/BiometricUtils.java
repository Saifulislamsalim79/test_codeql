package ai.kudi.agent.biometric;

import android.content.Context;
import android.os.Build;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p227h.p229f.p230a.C7620a;
import p590o.p591a.Timber;
/* compiled from: BiometricUtils.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/biometric/BiometricUtils;", "", "()V", "isBiometricPromptEnabled", "", "()Z", "isSdkVersionSupported", "isFingerprintAvailable", "context", "Landroid/content/Context;", "isHardwareSupported", "isPermissionGranted", "shouldShowEnableBiometric", "shouldUseBiometric", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BiometricUtils {
    public static final BiometricUtils INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        BiometricUtils $r0 = new BiometricUtils();
        INSTANCE = $r0;
    }

    private BiometricUtils() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isBiometricPromptEnabled() {
        int $i0 = Build.VERSION.SDK_INT;
        return $i0 >= 28;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isFingerprintAvailable(Context context) {
        C7620a $r2 = C7620a.m17989b(context);
        Log_OC.loadImage($r2, "from(context)");
        boolean $z0 = $r2.m17987d();
        Boolean $r3 = Boolean.valueOf($z0);
        String $r4 = Log_OC.m10359a("FingerPrint: ", $r3);
        Object[] $r5 = new Object[0];
        Timber.m1627e($r4, $r5);
        boolean $z02 = $r2.m17987d();
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isHardwareSupported(Context context) {
        C7620a $r2 = C7620a.m17989b(context);
        Log_OC.loadImage($r2, "from(context)");
        boolean $z0 = $r2.m17986e();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isPermissionGranted(Context context) {
        int $i0 = C1335a.m36327a(context, "android.permission.USE_FINGERPRINT");
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isSdkVersionSupported() {
        int $i0 = Build.VERSION.SDK_INT;
        return $i0 >= 23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean shouldShowEnableBiometric(Context context) {
        Log_OC.getArray(context, "context");
        boolean $z0 = isSdkVersionSupported();
        if ($z0) {
            boolean $z02 = isHardwareSupported(context);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean shouldUseBiometric(Context context) {
        Log_OC.getArray(context, "context");
        boolean $z0 = isSdkVersionSupported();
        if ($z0) {
            boolean $z02 = isPermissionGranted(context);
            if ($z02) {
                boolean $z03 = isHardwareSupported(context);
                return $z03;
            }
            return false;
        }
        return false;
    }
}
