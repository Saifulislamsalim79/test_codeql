package ai.kudi.agent.network.util;

import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.HttpException;
/* compiled from: KudiErrorParser.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class KudiErrorParserKt$parseHttpError$1 extends AbstractC11802m implements InterfaceC11767l<Throwable, String> {
    final /* synthetic */ String $genericResponse;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiErrorParserKt$parseHttpError$1(String str) {
        super(1);
        this.$genericResponse = str;
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
        Log_OC.getArray(th, "it");
        boolean $z0 = ConnectivityUtil.isNoConnectivity(th);
        if ($z0) {
            return "Cannot connect to Kudi. Check connection";
        }
        boolean $z02 = th instanceof HttpException;
        if ($z02) {
            return "Something went wrong. Please contact support or try again...";
        }
        String r2 = this.$genericResponse;
        return r2;
    }
}
