package io.intercom.android.sdk.metrics;

import android.content.Context;
import android.content.pm.Signature;
import android.text.TextUtils;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes3.dex */
class AppTypeDetector {
    private static final X500Principal DEBUG_DN = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static final Twig twig = LumberMill.getLogger();

    AppTypeDetector() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getInstallerPackageName(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Exception e) {
            Twig twig2 = twig;
            twig2.internal("Package name is unknown, error: " + e.getMessage());
            str = null;
        }
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isDebugBuild(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length > 0) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                for (Signature signature : signatureArr) {
                    if (((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(DEBUG_DN)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            twig.internal("Debug build status is unknown, error: " + e.getMessage());
        }
        return false;
    }
}
