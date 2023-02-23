package ai.kudi.agent.network.util;

import com.google.gson.C6784f;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p565l.AbstractC14135d0;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* compiled from: KudiErrorParser.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "throwable", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class KudiErrorParserKt$parseErrorBody$1 extends AbstractC11802m implements InterfaceC11767l<Throwable, String> {
    public static final KudiErrorParserKt$parseErrorBody$1 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        KudiErrorParserKt$parseErrorBody$1 $r0 = new KudiErrorParserKt$parseErrorBody$1();
        INSTANCE = $r0;
    }

    KudiErrorParserKt$parseErrorBody$1() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ String invoke(Throwable th) {
        Throwable $r3 = th;
        String $r1 = invoke2($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String invoke2(Throwable th) {
        Log_OC.getArray(th, "throwable");
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            return "Error in connection, please check network settings.";
        }
        boolean $z02 = th instanceof HttpException;
        if (!$z02) {
            String $r7 = th.getMessage();
            return $r7;
        }
        try {
            C6784f $r3 = new C6784f();
            HttpException $r4 = (HttpException) th;
            C14840l $r5 = $r4.m349d();
            AbstractC14135d0 $r6 = $r5 == null ? null : $r5.m281d();
            Log_OC.append($r6);
            String $r72 = $r6.m2835P();
            Object $r8 = $r3.m20760l($r72, HashMap.class);
            if ($r8 == null) {
                NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
                throw $r10;
            }
            HashMap $r9 = (HashMap) $r8;
            String $r73 = String.valueOf($r9.get(MetricTracker.Object.MESSAGE));
            return $r73;
        } catch (Exception e) {
            return "genericResponse";
        }
    }
}
