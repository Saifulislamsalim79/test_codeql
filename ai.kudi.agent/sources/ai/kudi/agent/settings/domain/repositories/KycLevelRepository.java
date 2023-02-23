package ai.kudi.agent.settings.domain.repositories;

import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import ai.kudi.agent.settings.dataSource.KycLevelsLocalDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: KycLevelRepository.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/settings/domain/repositories/KycLevelRepository;", "", "kycLevelRemoteDataSource", "Lai/kudi/agent/settings/dataSource/KycLevelRemoteDataSource;", "kycLevelsLocalDataSource", "Lai/kudi/agent/settings/dataSource/KycLevelsLocalDataSource;", "(Lai/kudi/agent/settings/dataSource/KycLevelRemoteDataSource;Lai/kudi/agent/settings/dataSource/KycLevelsLocalDataSource;)V", "getKycLevels", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "getMonthlyKycLevels", "id", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KycLevelRepository {
    private final KycLevelRemoteDataSource kycLevelRemoteDataSource;
    private final KycLevelsLocalDataSource kycLevelsLocalDataSource;

    public KycLevelRepository(KycLevelRemoteDataSource kycLevelRemoteDataSource, KycLevelsLocalDataSource kycLevelsLocalDataSource) {
        Log_OC.getArray(kycLevelRemoteDataSource, "kycLevelRemoteDataSource");
        Log_OC.getArray(kycLevelsLocalDataSource, "kycLevelsLocalDataSource");
        this.kycLevelRemoteDataSource = kycLevelRemoteDataSource;
        this.kycLevelsLocalDataSource = kycLevelsLocalDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getKycLevels$lambda-0  reason: not valid java name */
    public static final List m40734getKycLevels$lambda0(KycLevelRepository kycLevelRepository, List list) {
        Log_OC.getArray(kycLevelRepository, "this$0");
        Log_OC.getArray(list, "it");
        KycLevelsLocalDataSource $r2 = kycLevelRepository.kycLevelsLocalDataSource;
        $r2.updateKycLevels(list);
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonthlyKycLevels$lambda-1  reason: not valid java name */
    public static final List m40735getMonthlyKycLevels$lambda1(KycLevelRepository kycLevelRepository, List list) {
        Log_OC.getArray(kycLevelRepository, "this$0");
        Log_OC.getArray(list, "it");
        KycLevelsLocalDataSource $r2 = kycLevelRepository.kycLevelsLocalDataSource;
        $r2.updateKycLevels(list);
        return list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getKycLevels() {
        KycLevelsLocalDataSource $r2 = this.kycLevelsLocalDataSource;
        AbstractC11688p $r3 = $r2.getKycLevels();
        KycLevelRemoteDataSource $r4 = this.kycLevelRemoteDataSource;
        AbstractC11688p $r32 = $r4.getKycLevels();
        Object[] $r1 = {$r3, $r32.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KycLevelRepository $r12 = KycLevelRepository.this;
                List $r22 = (List) obj;
                return KycLevelRepository.m40734getKycLevels$lambda0($r12, $r22);
            }
        })};
        InterfaceC11692s[] r7 = (InterfaceC11692s[]) $r1;
        AbstractC11688p $r33 = AbstractC11688p.m10500n(r7);
        Log_OC.loadImage($r33, "concatArrayEager(\n            kycLevelsLocalDataSource.getKycLevels(),\n            kycLevelRemoteDataSource.getKycLevels().map {\n                kycLevelsLocalDataSource.updateKycLevels(it)\n                it\n            }\n        )");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getMonthlyKycLevels(String str) {
        Log_OC.getArray(str, "id");
        KycLevelsLocalDataSource $r3 = this.kycLevelsLocalDataSource;
        AbstractC11688p $r4 = $r3.getKycLevels();
        KycLevelRemoteDataSource $r5 = this.kycLevelRemoteDataSource;
        AbstractC11688p $r42 = $r5.getMonthlyKycLevelLimit(str);
        Object[] $r2 = {$r4, $r42.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.domain.repositories.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KycLevelRepository $r1 = KycLevelRepository.this;
                List $r22 = (List) obj;
                return KycLevelRepository.m40735getMonthlyKycLevels$lambda1($r1, $r22);
            }
        })};
        InterfaceC11692s[] r8 = (InterfaceC11692s[]) $r2;
        AbstractC11688p $r43 = AbstractC11688p.m10500n(r8);
        Log_OC.loadImage($r43, "concatArrayEager(\n            kycLevelsLocalDataSource.getKycLevels(),\n            kycLevelRemoteDataSource.getMonthlyKycLevelLimit(id).map {\n                kycLevelsLocalDataSource.updateKycLevels(it)\n                it\n            }\n        )");
        return $r43;
    }
}
