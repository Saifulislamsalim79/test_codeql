package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import ai.kudi.agent.settings.dataSource.KycLevelsLocalDataSource;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class KycLevelRepository_Factory implements InterfaceC9468d<KycLevelRepository> {
    private final InterfaceC11700a<KycLevelRemoteDataSource> kycLevelRemoteDataSourceProvider;
    private final InterfaceC11700a<KycLevelsLocalDataSource> kycLevelsLocalDataSourceProvider;

    public KycLevelRepository_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.kycLevelRemoteDataSourceProvider = interfaceC11700a;
        this.kycLevelsLocalDataSourceProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycLevelRepository_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        KycLevelRepository_Factory $r2 = new KycLevelRepository_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KycLevelRepository newInstance(KycLevelRemoteDataSource kycLevelRemoteDataSource, KycLevelsLocalDataSource kycLevelsLocalDataSource) {
        KycLevelRepository $r2 = new KycLevelRepository(kycLevelRemoteDataSource, kycLevelsLocalDataSource);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KycLevelRepository multiply() {
        InterfaceC11700a $r1 = this.kycLevelRemoteDataSourceProvider;
        Object $r2 = $r1.get();
        KycLevelRemoteDataSource $r3 = (KycLevelRemoteDataSource) $r2;
        InterfaceC11700a $r12 = this.kycLevelsLocalDataSourceProvider;
        Object $r22 = $r12.get();
        KycLevelsLocalDataSource $r4 = (KycLevelsLocalDataSource) $r22;
        KycLevelRepository $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40736multiply() {
        KycLevelRepository $r1 = multiply();
        return $r1;
    }
}
