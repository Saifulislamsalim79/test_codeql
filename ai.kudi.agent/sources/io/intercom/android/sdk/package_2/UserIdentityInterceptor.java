package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.okhttp3.Interceptor;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.ResponseBody;
import java.io.IOException;
/* loaded from: classes.dex */
class UserIdentityInterceptor implements Interceptor {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig;
    private final UserIdentity userIdentity;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserIdentityInterceptor(UserIdentity userIdentity) {
        Twig $r2 = LumberMill.getLogger();
        this.twig = $r2;
        this.userIdentity = userIdentity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        UserIdentity $r2 = this.userIdentity;
        boolean $z0 = $r2.identityExists();
        if (!$z0) {
            IOException $r9 = new IOException(NO_USER_IDENTITY);
            throw $r9;
        }
        UserIdentity $r22 = this.userIdentity;
        String $r3 = $r22.getFingerprint();
        Request $r4 = chain.request();
        Response $r5 = chain.proceed($r4);
        UserIdentity $r23 = this.userIdentity;
        String $r6 = $r23.getFingerprint();
        boolean $z02 = $r3.equals($r6);
        if ($z02) {
            Twig $r7 = this.twig;
            $r7.internal("interceptor", "proceeding");
            return $r5;
        }
        Twig $r72 = this.twig;
        $r72.internal("interceptor", "halting: user identity changed");
        if ($r5 != null) {
            ResponseBody $r8 = $r5.body();
            $r8.close();
        }
        IOException $r92 = new IOException(USER_IDENTITY_CHANGED);
        throw $r92;
    }
}
