package ai.kudi.agent.register.data.sources;

import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RemoteDataSource.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/data/sources/RemoteDataSource;", "Lai/kudi/agent/register/data/sources/DataSource;", "registerNewAgent", "Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;", "(Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;)V", "load", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "save", "Lio/reactivex/Observable;", "agentInfo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteDataSource implements DataSource {
    private final RegisterNewAgent registerNewAgent;

    public RemoteDataSource(RegisterNewAgent registerNewAgent) {
        Log_OC.getArray(registerNewAgent, "registerNewAgent");
        this.registerNewAgent = registerNewAgent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: save$lambda-1  reason: not valid java name */
    public static final RegistrationInfo m40309save$lambda1(RegistrationInfo registrationInfo, PersonalInfo personalInfo) {
        Log_OC.getArray(registrationInfo, "$agentInfo");
        Log_OC.getArray(personalInfo, "it");
        return registrationInfo;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.sources.DataSource
    public RegistrationInfo load() {
        IllegalStateException $r1 = new IllegalStateException("Remote source cannot load Agent Registration Info.");
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.sources.DataSource
    public AbstractC11688p save(final RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "agentInfo");
        RegisterNewAgent $r3 = this.registerNewAgent;
        AbstractC11688p $r4 = $r3.execute(registrationInfo).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.register.data.sources.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RegistrationInfo $r1 = RegistrationInfo.this;
                PersonalInfo $r32 = (PersonalInfo) obj;
                return RemoteDataSource.m40309save$lambda1($r1, $r32);
            }
        });
        Log_OC.loadImage($r4, "registerNewAgent.execute(agentInfo)\n                .map {\n                    agentInfo.apply {\n                        /* registrationId = it.data.registrationId\n                         expiresInMinutes = it.data.expiresInMinutes\n                         expiresInSeconds = it.data.expiresInSeconds\n                         skipOtp = it.data.skipOtp*/\n                    }\n                }");
        return $r4;
    }
}
