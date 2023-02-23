package ai.kudi.agent.register.data;

import ai.kudi.agent.register.data.sources.DataSource;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RegistrationRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/register/data/RegistrationRepositoryImpl;", "Lai/kudi/agent/register/data/RegistrationRepository;", "cache", "Lai/kudi/agent/register/data/sources/DataSource;", "remote", "(Lai/kudi/agent/register/data/sources/DataSource;Lai/kudi/agent/register/data/sources/DataSource;)V", "load", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "save", "Lio/reactivex/Observable;", "agentInfo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RegistrationRepositoryImpl implements RegistrationRepository {
    private final DataSource cache;
    private final DataSource remote;

    public RegistrationRepositoryImpl(DataSource dataSource, DataSource dataSource2) {
        Log_OC.getArray(dataSource, "cache");
        Log_OC.getArray(dataSource2, "remote");
        this.cache = dataSource;
        this.remote = dataSource2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: save$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m40306save$lambda0(RegistrationInfo registrationInfo, RegistrationRepositoryImpl registrationRepositoryImpl, RegistrationInfo registrationInfo2) {
        Log_OC.getArray(registrationInfo, "$agentInfo");
        Log_OC.getArray(registrationRepositoryImpl, "this$0");
        Log_OC.getArray(registrationInfo2, "it");
        boolean $z0 = registrationInfo.isComplete();
        if ($z0) {
            DataSource $r3 = registrationRepositoryImpl.remote;
            return $r3.save(registrationInfo);
        }
        AbstractC11688p $r4 = AbstractC11688p.m10532N(registrationInfo2);
        Log_OC.loadImage($r4, "{\n                        Observable.just(it)\n                    }");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.RegistrationRepository
    public RegistrationInfo load() {
        DataSource $r2 = this.cache;
        RegistrationInfo $r1 = $r2.load();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.RegistrationRepository
    public AbstractC11688p save(final RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "agentInfo");
        DataSource $r3 = this.cache;
        AbstractC11688p $r4 = $r3.save(registrationInfo).m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.register.data.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RegistrationInfo $r1 = RegistrationInfo.this;
                RegistrationRepositoryImpl $r2 = this;
                RegistrationInfo $r5 = (RegistrationInfo) obj;
                InterfaceC11692s $r32 = RegistrationRepositoryImpl.m40306save$lambda0($r1, $r2, $r5);
                return $r32;
            }
        });
        Log_OC.loadImage($r4, "cache.save(agentInfo)\n                .flatMap {\n                    if (agentInfo.isComplete) {\n                        remote.save(agentInfo)\n                    } else {\n                        Observable.just(it)\n                    }\n                }");
        return $r4;
    }
}
