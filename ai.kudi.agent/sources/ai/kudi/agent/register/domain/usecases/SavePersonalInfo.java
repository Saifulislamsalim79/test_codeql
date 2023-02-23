package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.data.RegistrationRepository;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavePersonalInfo.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/domain/usecases/SavePersonalInfo;", "", "registrationRepo", "Lai/kudi/agent/register/data/RegistrationRepository;", "(Lai/kudi/agent/register/data/RegistrationRepository;)V", "execute", "", MetricTracker.Object.INPUT, "Lai/kudi/agent/register/domain/dto/PersonalInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class SavePersonalInfo {
    private final RegistrationRepository registrationRepo;

    public SavePersonalInfo(RegistrationRepository registrationRepository) {
        Log_OC.getArray(registrationRepository, "registrationRepo");
        this.registrationRepo = registrationRepository;
    }

    public final void execute(PersonalInfo personalInfo) {
        Log_OC.getArray(personalInfo, MetricTracker.Object.INPUT);
    }
}
