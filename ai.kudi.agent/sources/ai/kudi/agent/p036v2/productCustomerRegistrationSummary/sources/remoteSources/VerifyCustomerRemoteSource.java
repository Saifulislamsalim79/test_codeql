package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.VerificationRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.VerificationResponseBody;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: VerifyCustomerRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/sources/remoteSources/VerifyCustomerRemoteSource;", "", "api", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "verifyCustomer", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/VerificationResponseBody;", "param", "Lai/kudi/agent/v2/common/domain/dto/VerificationRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.VerifyCustomerRemoteSource */
/* loaded from: classes.dex */
public final class VerifyCustomerRemoteSource {
    private final MarketPlaceApi prototype;

    public VerifyCustomerRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "api");
        this.prototype = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyCustomer$lambda-0  reason: not valid java name */
    public static final VerificationResponseBody m41605verifyCustomer$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 == 200) {
            VerificationResponseBody $r1 = new VerificationResponseBody(true, null);
            return $r1;
        }
        Exception $r2 = new Exception("Error verifying customer");
        VerificationResponseBody $r12 = new VerificationResponseBody(false, $r2);
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyCustomer$lambda-1  reason: not valid java name */
    public static final VerificationResponseBody m41606verifyCustomer$lambda1(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r1 = th.getMessage();
        Exception $r0 = new Exception($r1);
        VerificationResponseBody $r3 = new VerificationResponseBody(false, $r0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p verifyCustomer(VerificationRequestBody verificationRequestBody) {
        Log_OC.getArray(verificationRequestBody, "param");
        MarketPlaceApi $r2 = this.prototype;
        AbstractC11688p $r3 = $r2.verifyRegistration(verificationRequestBody);
        Label $r4 = Label.f1944k;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        C0715DD $r5 = C0715DD.f1943E;
        AbstractC11688p $r33 = $r32.m10526T($r5);
        Log_OC.loadImage($r33, "api.verifyRegistration(param).map {\n            if (it.code() == 200) {\n                VerificationResponseBody(true, null)\n            } else\n                VerificationResponseBody(false, Exception(\"Error verifying customer\"))\n        }.onErrorReturn {\n            VerificationResponseBody(false, Exception(it.message))\n        }");
        return $r33;
    }
}
