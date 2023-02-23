package ai.kudi.agent.network.util;

import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.HttpException;
/* compiled from: KudiErrorParser.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u001a\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\b\u001a(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u001a(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¨\u0006\u000e"}, m10421d2 = {"getHttpCode", "", "throwable", "", "isThrowableAHttpException", "", "parseErrorBody", "Lkotlin/Function1;", "", "parseHttpError", "genericResponse", "parseHttpError2", "serverErrorMessage", "parseHttpError3", "network_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KudiErrorParserKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final int getHttpCode(Throwable th) {
        Log_OC.getArray(th, "throwable");
        boolean $z0 = th instanceof HttpException;
        if ($z0) {
            HttpException $r1 = (HttpException) th;
            int $i0 = $r1.m352a();
            return $i0;
        }
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean isThrowableAHttpException(Throwable th) {
        Log_OC.getArray(th, "throwable");
        boolean $z0 = th instanceof HttpException;
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final InterfaceC11767l parseErrorBody() {
        KudiErrorParserKt$parseErrorBody$1 r0 = KudiErrorParserKt$parseErrorBody$1.INSTANCE;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final InterfaceC11767l parseHttpError(String str) {
        Log_OC.getArray(str, "genericResponse");
        KudiErrorParserKt$parseHttpError$1 $r1 = new KudiErrorParserKt$parseHttpError$1(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final InterfaceC11767l parseHttpError2(String str, String str2) {
        Log_OC.getArray(str, "genericResponse");
        KudiErrorParserKt$parseHttpError2$1 $r2 = new KudiErrorParserKt$parseHttpError2$1(str2, str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ InterfaceC11767l parseHttpError2$default(String $r1, String $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = "Something went wrong. Please try again.";
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = null;
        }
        InterfaceC11767l $r0 = parseHttpError2($r1, $r2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final InterfaceC11767l parseHttpError3(String str, String str2) {
        Log_OC.getArray(str, "genericResponse");
        KudiErrorParserKt$parseHttpError3$1 $r2 = new KudiErrorParserKt$parseHttpError3$1(str2, str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ InterfaceC11767l parseHttpError3$default(String $r1, String $r2, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = "Something went wrong. Please try again.";
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = null;
        }
        InterfaceC11767l $r0 = parseHttpError3($r1, $r2);
        return $r0;
    }
}
