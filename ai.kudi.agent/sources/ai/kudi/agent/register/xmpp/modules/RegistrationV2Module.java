package ai.kudi.agent.register.xmpp.modules;

import ai.kudi.agent.register.data.RegistrationRepository;
import ai.kudi.agent.register.data.RegistrationRepositoryImpl;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.register.data.sources.DataSource;
import ai.kudi.agent.register.data.sources.RemoteDataSource;
import ai.kudi.agent.register.domain.usecases.RegisterNewAgent;
import android.content.Context;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: RegistrationV2Module.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/di/modules/RegistrationV2Module;", "", "()V", "providedRemoteDataSource", "Lai/kudi/agent/register/data/sources/DataSource;", "register", "Lai/kudi/agent/register/domain/usecases/RegisterNewAgent;", "providesCachedDataSource", "context", "Landroid/content/Context;", "providesRegistrationRepository", "Lai/kudi/agent/register/data/RegistrationRepository;", "registrationRepositoryImpl", "Lai/kudi/agent/register/data/RegistrationRepositoryImpl;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RegistrationV2Module {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DataSource providedRemoteDataSource(RegisterNewAgent registerNewAgent) {
        Log_OC.getArray(registerNewAgent, "register");
        RemoteDataSource $r2 = new RemoteDataSource(registerNewAgent);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DataSource providesCachedDataSource(Context context) {
        Log_OC.getArray(context, "context");
        CacheDataSource $r2 = new CacheDataSource(context);
        return $r2;
    }

    public final RegistrationRepository providesRegistrationRepository(RegistrationRepositoryImpl registrationRepositoryImpl) {
        Log_OC.getArray(registrationRepositoryImpl, "registrationRepositoryImpl");
        return registrationRepositoryImpl;
    }
}
