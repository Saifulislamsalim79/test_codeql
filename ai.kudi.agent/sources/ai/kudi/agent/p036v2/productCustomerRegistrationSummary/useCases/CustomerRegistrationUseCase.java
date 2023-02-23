package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.useCases;

import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationRequestBody;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.repositories.CustomerRegistrationRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: CustomerRegistrationUseCase.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistrationSummary/useCases/CustomerRegistrationUseCase;", "", "customerRegistrationRepository", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/repositories/CustomerRegistrationRepository;", "(Lai/kudi/agent/v2/productCustomerRegistrationSummary/repositories/CustomerRegistrationRepository;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/productCustomerRegistrationSummary/dto/CustomerOnboardingResponse;", "params", "Lai/kudi/agent/v2/common/domain/dto/RegistrationRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.useCases.CustomerRegistrationUseCase */
/* loaded from: classes.dex */
public final class CustomerRegistrationUseCase {
    private final CustomerRegistrationRepository customerRegistrationRepository;

    public CustomerRegistrationUseCase(CustomerRegistrationRepository customerRegistrationRepository) {
        Log_OC.getArray(customerRegistrationRepository, "customerRegistrationRepository");
        this.customerRegistrationRepository = customerRegistrationRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(RegistrationRequestBody registrationRequestBody) {
        Log_OC.getArray(registrationRequestBody, "params");
        CustomerRegistrationRepository $r2 = this.customerRegistrationRepository;
        AbstractC11688p $r3 = $r2.registerCustomer(registrationRequestBody);
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Log_OC.loadImage($r33, "customerRegistrationRepository.registerCustomer(params).subscribeOn(\n            Schedulers.io()\n        ).observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }
}
