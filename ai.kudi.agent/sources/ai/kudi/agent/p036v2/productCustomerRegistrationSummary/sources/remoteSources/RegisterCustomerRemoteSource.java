package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.sources.remoteSources;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationResponseBody;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.streaming.CustomerOnboardingResponse;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: RegisterCustomerRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/sources/remoteSources/RegisterCustomerRemoteSource;", "", "marketplaceApi", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "registerCustomer", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/dto/CustomerOnboardingResponse;", "params", "Lai/kudi/agent/v2/common/domain/dto/RegistrationRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.sources.remoteSources.RegisterCustomerRemoteSource */
/* loaded from: classes.dex */
public final class RegisterCustomerRemoteSource {
    private final MarketPlaceApi marketplaceApi;

    public RegisterCustomerRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "marketplaceApi");
        this.marketplaceApi = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: registerCustomer$lambda-0  reason: not valid java name */
    public static final CustomerOnboardingResponse m41601registerCustomer$lambda0(C14840l c14840l) {
        String $r6;
        RegistrationResponseBody $r4;
        Log_OC.getArray(c14840l, "it");
        int $i0 = c14840l.m283b();
        if ($i0 != 200) {
            Object $r2 = c14840l.m284a();
            APIResponse $r3 = (APIResponse) $r2;
            String $r5 = "Error registering customer";
            if ($r3 != null && ($r6 = $r3.message) != null) {
                $r5 = $r6;
            }
            CustomerOnboardingResponse $r1 = new CustomerOnboardingResponse($r5, null);
            return $r1;
        }
        Object $r22 = c14840l.m284a();
        APIResponse $r32 = (APIResponse) $r22;
        if ($r32 == null) {
            $r4 = null;
        } else {
            Object $r23 = $r32.data;
            $r4 = (RegistrationResponseBody) $r23;
        }
        Log_OC.append($r4);
        CustomerOnboardingResponse $r12 = new CustomerOnboardingResponse(null, $r4);
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: registerCustomer$lambda-2  reason: not valid java name */
    public static final CustomerOnboardingResponse m41603registerCustomer$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        String $r0 = th.getLocalizedMessage();
        CustomerOnboardingResponse $r2 = new CustomerOnboardingResponse($r0, null);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p registerCustomer(RegistrationRequestBody registrationRequestBody) {
        Log_OC.getArray(registrationRequestBody, "params");
        MarketPlaceApi $r2 = this.marketplaceApi;
        AbstractC11688p $r3 = $r2.registerCustomer(registrationRequestBody);
        ClassWriter $r4 = ClassWriter.f1942b;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        C0717c $r5 = C0717c.f1946d;
        AbstractC11688p $r33 = $r32.x($r5);
        C0716b $r6 = C0716b.f1945e;
        AbstractC11688p $r34 = $r33.m10526T($r6);
        Log_OC.loadImage($r34, "marketplaceApi.registerCustomer(params).map {\n            if (it.code() == 200) {\n                CustomerOnboardingResponse(null, it.body()?.data!!)\n            } else {\n                CustomerOnboardingResponse(it.body()?.message ?: \"Error registering customer\", null)\n            }\n        }.doOnError { throwAppropriateException() }\n            .onErrorReturn { CustomerOnboardingResponse(it.localizedMessage, null) }");
        return $r34;
    }
}
