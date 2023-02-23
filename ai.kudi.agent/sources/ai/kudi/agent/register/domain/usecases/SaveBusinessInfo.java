package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.register.data.RegistrationRepository;
import ai.kudi.agent.register.domain.dto.RegistrationInfo;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: SaveBusinessInfo.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/SaveBusinessInfo;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "registrationRepo", "Lai/kudi/agent/register/data/RegistrationRepository;", "(Lai/kudi/agent/register/data/RegistrationRepository;)V", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class SaveBusinessInfo implements OneInputUseCase<Boolean, RegistrationInfo> {
    private final RegistrationRepository registrationRepo;

    public SaveBusinessInfo(RegistrationRepository registrationRepository) {
        Log_OC.getArray(registrationRepository, "registrationRepo");
        this.registrationRepo = registrationRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Boolean m40348execute$lambda0(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "it");
        Boolean r1 = Boolean.TRUE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(ai.kudi.agent.register.domain.wiki.RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, MetricTracker.Object.INPUT);
        RegistrationRepository $r2 = this.registrationRepo;
        ai.kudi.agent.register.domain.wiki.RegistrationInfo $r1 = $r2.load();
        RegistrationRepository $r22 = this.registrationRepo;
        AbstractC11688p $r3 = $r22.save(ai.kudi.agent.register.domain.wiki.RegistrationInfo.copy$default($r1, null, null, null, false, null, 31, null));
        C0425b $r4 = C0425b.f1023e;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        p425j.p444e.Item $r5 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r33 = $r32.h0($r5);
        p425j.p444e.Item $r52 = ContextUtils.LogError();
        AbstractC11688p $r34 = $r33.R($r52);
        Log_OC.loadImage($r34, "registrationRepo.save(agentInfo.copy()/*(personalInfo =\n                businessName = input.businessName,\n                businessAddress = input.businessAddress,\n                cacRegistrationNo = input.cacRegistrationNo,\n                managerId = input.managerId,\n                referrerPhone = input.referrerPhone,\n                state = input.state,\n                city = input.city,\n                latitude = input.latitude,\n                longitude = input.longitude,\n                localGovernmentArea = input.localGovernmentArea,\n                referralType = input.referralType,\n                estimatedTransactionRange = input.estimatedTransactionRange\n        )*/)\n                .map { true }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return $r34;
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
