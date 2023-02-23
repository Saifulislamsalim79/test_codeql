package ai.kudi.agent.biometric;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import android.os.RemoteException;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: BiometricManagerCompat.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/biometric/BiometricManagerCompat;", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "biometricCallback", "Lai/kudi/agent/biometric/BiometricCallback;", "activity", "Landroidx/fragment/app/FragmentActivity;", "executor", "Ljava/util/concurrent/Executor;", "(Lai/kudi/agent/biometric/BiometricCallback;Landroidx/fragment/app/FragmentActivity;Ljava/util/concurrent/Executor;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "authenticate", "", "onAuthenticationError", "errorCode", "", "errString", "", "onAuthenticationFailed", "onAuthenticationSucceeded", "result", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BiometricManagerCompat extends BiometricPrompt.AbstractC1177b {
    private final FragmentActivity activity;
    private final BiometricCallback biometricCallback;
    private final Executor executor;

    public BiometricManagerCompat(BiometricCallback biometricCallback, FragmentActivity fragmentActivity, Executor executor) {
        Log_OC.getArray(biometricCallback, "biometricCallback");
        Log_OC.getArray(fragmentActivity, "activity");
        Log_OC.getArray(executor, "executor");
        this.biometricCallback = biometricCallback;
        this.activity = fragmentActivity;
        this.executor = executor;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void authenticate() {
        FragmentActivity $r3 = this.activity;
        Executor $r4 = this.executor;
        BiometricPrompt $r2 = new BiometricPrompt($r3, $r4, this);
        BiometricPrompt.C1180e.C1181a $r5 = new BiometricPrompt.C1180e.C1181a();
        $r5.m36826d("Login with Biometrics");
        $r5.m36828b("Use your fingerprint to login faster");
        $r5.m36827c("Cancel");
        BiometricPrompt.C1180e $r1 = $r5.m36829a();
        Log_OC.loadImage($r1, "Builder()\n            .setTitle(\"Login with Biometrics\")\n            .setDescription(\"Use your fingerprint to login faster\")\n            .setNegativeButtonText(\"Cancel\")\n            .build()");
        try {
            $r2.m36843s($r1);
        } catch (RemoteException $r7) {
            CrashlyticsReport.logException($r7);
        } catch (NullPointerException $r6) {
            CrashlyticsReport.logException($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FragmentActivity getActivity() {
        FragmentActivity r1 = this.activity;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.biometric.BiometricPrompt.AbstractC1177b
    public void onAuthenticationError(int i, CharSequence charSequence) {
        Log_OC.getArray(charSequence, "errString");
        super.onAuthenticationError(i, charSequence);
        BiometricCallback $r2 = this.biometricCallback;
        $r2.onAuthenticationError(i, charSequence);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.biometric.BiometricPrompt.AbstractC1177b
    public void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        BiometricCallback $r1 = this.biometricCallback;
        $r1.onAuthenticationFailed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.biometric.BiometricPrompt.AbstractC1177b
    public void onAuthenticationSucceeded(BiometricPrompt.C1178c c1178c) {
        Log_OC.getArray(c1178c, "result");
        super.onAuthenticationSucceeded(c1178c);
        BiometricCallback $r2 = this.biometricCallback;
        $r2.onAuthenticationSuccessful();
    }
}
