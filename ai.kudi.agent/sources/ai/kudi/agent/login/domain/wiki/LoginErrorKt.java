package ai.kudi.agent.login.domain.wiki;

import com.google.gson.C6784f;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p565l.AbstractC14135d0;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: LoginError.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m10421d2 = {"parseLoginError", "Lai/kudi/agent/login/domain/dto/LoginError;", "throwable", "", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginErrorKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final LoginError parseLoginError(Throwable th) {
        Log_OC.getArray(th, "throwable");
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            try {
                HttpException $r2 = (HttpException) th;
                C14840l $r3 = $r2.m349d();
                AbstractC14135d0 $r4 = $r3 == null ? null : $r3.m281d();
                Log_OC.append($r4);
                Reader $r5 = $r4.m2834c();
                C6784f $r6 = new C6784f();
                Object $r7 = $r6.m20762j($r5, ai.kudi.agent.login.domain.dto.LoginError.class);
                LoginError $r8 = (LoginError) $r7;
                return $r8;
            } catch (Throwable th2) {
                return null;
            }
        }
        return null;
    }
}
