package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OnboardingApi;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.register.domain.dto.PersonalInfo;
import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.OnboardMerchantRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: OnboardMerchant.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/OnboardMerchant;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OnboardMerchant implements OneInputUseCase<PersonalInfo, RegistrationInfo> {
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    public OnboardMerchant(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, MetricTracker.Object.INPUT);
        ai.kudi.agent.register.domain.wiki.PersonalInfo $r2 = registrationInfo.getPersonalInfo();
        NetworkService $r3 = this.networkService;
        OnboardingApi $r4 = $r3.getOnboardingApi();
        String $r5 = $r2.getBusinessAddress();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r6 = $r2.getBusinessName();
        if ($r6 == null) {
            $r6 = "";
        }
        String $r7 = $r2.getBvn();
        if ($r7 == null) {
            $r7 = "";
        }
        String $r8 = $r2.getEmail();
        if ($r8 == null) {
            $r8 = "";
        }
        String $r9 = $r2.getFirstName();
        if ($r9 == null) {
            $r9 = "";
        }
        String $r10 = $r2.getLastName();
        if ($r10 == null) {
            $r10 = "";
        }
        String $r11 = $r2.getLocalGovernmentArea();
        if ($r11 == null) {
            $r11 = "";
        }
        String $r12 = $r2.getPhoneNumber();
        if ($r12 == null) {
            $r12 = "";
        }
        String $r13 = $r2.getPin();
        if ($r13 == null) {
            $r13 = "";
        }
        String $r14 = $r2.getState();
        if ($r14 == null) {
            $r14 = "";
        }
        String $r15 = $r2.getPrimaryBusinessCategory();
        if ($r15 == null) {
            $r15 = "";
        }
        String $r16 = $r2.getDeviceId();
        if ($r16 == null) {
            $r16 = "";
        }
        String $r17 = $r2.getDeviceName();
        if ($r17 == null) {
            $r17 = "";
        }
        String $r18 = $r2.getDeviceOsVersion();
        if ($r18 == null) {
            $r18 = "";
        }
        String $r19 = $r2.getSecondaryDeviceId();
        if ($r19 == null) {
            $r19 = "";
        }
        OnboardMerchantRequest $r20 = new OnboardMerchantRequest($r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r17, $r16, $r19, $r18);
        AbstractC11688p $r21 = $r4.onboardMerchant($r20, registrationInfo.getRegistrationId());
        Money $r22 = Money.ZERO;
        AbstractC11688p $r212 = $r21.m10531O($r22);
        RxSchedulers $r23 = this.rxSchedulers;
        p425j.p444e.Item $r24 = $r23.setSettings();
        AbstractC11688p $r213 = $r212.h0($r24);
        RxSchedulers $r232 = this.rxSchedulers;
        p425j.p444e.Item $r242 = $r232.main();
        AbstractC11688p $r214 = $r213.R($r242);
        Log_OC.loadImage($r214, "networkService.onboardingApi.onboardMerchant(OnboardMerchantRequest(\n            businessAddress = personalInfo.businessAddress.orEmpty(),\n            businessName = personalInfo.businessName.orEmpty(),\n            bvn = personalInfo.bvn.orEmpty(),\n            email = personalInfo.email.orEmpty(),\n            firstName = personalInfo.firstName.orEmpty(),\n            lastName = personalInfo.lastName.orEmpty(),\n            lga = personalInfo.localGovernmentArea.orEmpty(),\n            phoneNumber = personalInfo.phoneNumber.orEmpty(),\n            pin = personalInfo.pin.orEmpty(),\n            state = personalInfo.state.orEmpty(),\n            primaryBusinessCategory = personalInfo.primaryBusinessCategory.orEmpty(),\n            deviceId = personalInfo.deviceId.orEmpty(),\n            deviceName = personalInfo.deviceName.orEmpty(),\n            deviceOsVersion = personalInfo.deviceOsVersion.orEmpty(),\n            secondaryDeviceId = personalInfo.secondaryDeviceId.orEmpty()\n        ), input.registrationId).map {\n            it\n        }.subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r214;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        ai.kudi.agent.register.domain.wiki.RegistrationInfo $r3 = (ai.kudi.agent.register.domain.wiki.RegistrationInfo) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }
}
