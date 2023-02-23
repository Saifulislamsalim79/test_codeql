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
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "throwable", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class KudiErrorParserKt$parseHttpError3$1 extends AbstractC11802m implements InterfaceC11767l<Throwable, String> {
    final /* synthetic */ String $genericResponse;
    final /* synthetic */ String $serverErrorMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiErrorParserKt$parseHttpError3$1(String str, String str2) {
        super(1);
        this.$serverErrorMessage = str;
        this.$genericResponse = str2;
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
            String $r4 = this.$genericResponse;
            return $r4;
        }
        HttpException $r3 = (HttpException) th;
        int $i0 = $r3.m352a();
        boolean $z03 = false;
        if (500 <= $i0 && $i0 <= 504) {
            $z03 = true;
        }
        if ($z03) {
            String $r42 = this.$serverErrorMessage;
            return $r42 == null ? "Something went wrong. Please try again" : $r42;
        }
        try {
            C6784f $r5 = new C6784f();
            HttpException $r32 = (HttpException) th;
            C14840l $r6 = $r32.m349d();
            AbstractC14135d0 $r7 = $r6 == null ? null : $r6.m281d();
            Log_OC.append($r7);
            String $r43 = $r7.m2835P();
            Object $r8 = $r5.m20760l($r43, HashMap.class);
            if ($r8 == null) {
                NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
                throw $r10;
            }
            HashMap $r9 = (HashMap) $r8;
            Object $r82 = $r9.get(MetricTracker.Object.MESSAGE);
            if ($r82 != null) {
                String $r44 = (String) $r82;
                return $r44;
            }
            NullPointerException $r102 = new NullPointerException("null cannot be cast to non-null type kotlin.String");
            throw $r102;
        } catch (Exception e) {
            String $r45 = this.$genericResponse;
            return $r45;
        }
    }
}
