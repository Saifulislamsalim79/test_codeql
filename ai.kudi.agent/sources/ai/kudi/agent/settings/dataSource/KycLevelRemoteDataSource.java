package ai.kudi.agent.settings.dataSource;

import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.settings.domain.package_4.KycLevelResponse;
import ai.kudi.agent.settings.domain.package_4.LevelData;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: KycLevelRemoteDataSource.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/settings/dataSource/KycLevelRemoteDataSource;", "", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "getKycLevels", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "getMonthlyKycLevelLimit", "id", "", "toListOfKycModel", "resp", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/settings/domain/dto/KycLevelResponse;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KycLevelRemoteDataSource {
    public static final Companion Companion;
    public static final String LEVEL_ONE = "LEVEL_ONE";
    public static final String LEVEL_THREE = "LEVEL_THREE";
    public static final String LEVEL_TWO = "LEVEL_TWO";
    public static final String NONE = "NONE";
    private final NetworkService networkService;
    private final RxSchedulers rxSchedulers;

    /* compiled from: KycLevelRemoteDataSource.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/dataSource/KycLevelRemoteDataSource$Companion;", "", "()V", KycLevelRemoteDataSource.LEVEL_ONE, "", KycLevelRemoteDataSource.LEVEL_THREE, KycLevelRemoteDataSource.LEVEL_TWO, KycLevelRemoteDataSource.NONE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public KycLevelRemoteDataSource(NetworkService networkService, RxSchedulers rxSchedulers) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.networkService = networkService;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getKycLevels$lambda-0  reason: not valid java name */
    public static final List m40719getKycLevels$lambda0(KycLevelRemoteDataSource kycLevelRemoteDataSource, APIResponse aPIResponse) {
        Log_OC.getArray(kycLevelRemoteDataSource, "this$0");
        Log_OC.getArray(aPIResponse, "it");
        List $r1 = kycLevelRemoteDataSource.toListOfKycModel(aPIResponse);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getMonthlyKycLevelLimit$lambda-1  reason: not valid java name */
    public static final List m40720getMonthlyKycLevelLimit$lambda1(KycLevelRemoteDataSource kycLevelRemoteDataSource, APIResponse aPIResponse) {
        Log_OC.getArray(kycLevelRemoteDataSource, "this$0");
        Log_OC.getArray(aPIResponse, "it");
        List $r1 = kycLevelRemoteDataSource.toListOfKycModel(aPIResponse);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List toListOfKycModel(APIResponse aPIResponse) {
        List $r15;
        Object $r2 = aPIResponse.data;
        KycLevelResponse $r3 = (KycLevelResponse) $r2;
        LevelData $r4 = $r3.getLevelOne();
        Object $r22 = aPIResponse.data;
        KycLevelResponse $r32 = (KycLevelResponse) $r22;
        LevelData $r5 = $r32.getLevelTwo();
        Object $r23 = aPIResponse.data;
        KycLevelResponse $r33 = (KycLevelResponse) $r23;
        LevelData $r6 = $r33.getLevelThree();
        Object $r24 = aPIResponse.data;
        KycLevelResponse $r34 = (KycLevelResponse) $r24;
        LevelData $r7 = $r34.getNone();
        KycLevelsModel[] $r8 = new KycLevelsModel[4];
        BigDecimal $r10 = $r7 == null ? null : $r7.getMonthlyTransferLimit();
        BigDecimal $r11 = $r7 == null ? null : $r7.getMonthlyWithdrawalLimit();
        Object $r25 = $r7 == null ? null : $r7.getMonthlyWalletTopupLimit();
        String $r12 = String.valueOf($r25);
        String $r13 = $r7 == null ? null : $r7.getName();
        if ($r13 == null) {
            $r13 = "";
        }
        KycLevelsModel $r14 = new KycLevelsModel(0, $r11, $r10, $r12, NONE, $r13, 1, null);
        $r8[0] = $r14;
        BigDecimal $r102 = $r4 == null ? null : $r4.getMonthlyTransferLimit();
        BigDecimal $r112 = $r4 == null ? null : $r4.getMonthlyWithdrawalLimit();
        Object $r26 = $r4 == null ? null : $r4.getMonthlyWalletTopupLimit();
        String $r122 = String.valueOf($r26);
        String $r132 = $r4 == null ? null : $r4.getName();
        if ($r132 == null) {
            $r132 = "";
        }
        KycLevelsModel $r142 = new KycLevelsModel(0, $r112, $r102, $r122, LEVEL_ONE, $r132, 1, null);
        $r8[1] = $r142;
        BigDecimal $r103 = $r5 == null ? null : $r5.getMonthlyTransferLimit();
        BigDecimal $r113 = $r5 == null ? null : $r5.getMonthlyWithdrawalLimit();
        Object $r27 = $r5 == null ? null : $r5.getMonthlyWalletTopupLimit();
        String $r123 = String.valueOf($r27);
        String $r133 = $r5 == null ? null : $r5.getName();
        if ($r133 == null) {
            $r133 = "";
        }
        KycLevelsModel $r143 = new KycLevelsModel(0, $r113, $r103, $r123, LEVEL_TWO, $r133, 1, null);
        $r8[2] = $r143;
        BigDecimal $r104 = $r6 == null ? null : $r6.getMonthlyTransferLimit();
        BigDecimal $r114 = $r6 == null ? null : $r6.getMonthlyWithdrawalLimit();
        Object $r28 = $r6 == null ? null : $r6.getMonthlyWalletTopupLimit();
        String $r124 = String.valueOf($r28);
        String $r9 = $r6 != null ? $r6.getName() : null;
        if ($r9 == null) {
            $r9 = "";
        }
        KycLevelsModel $r144 = new KycLevelsModel(0, $r114, $r104, $r124, LEVEL_THREE, $r9, 1, null);
        $r8[3] = $r144;
        $r15 = C13726r.m3888h($r8);
        return $r15;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getKycLevels() {
        NetworkService $r1 = this.networkService;
        AddNoteCommand $r2 = $r1.getApi();
        AbstractC11688p $r3 = $r2.getKycLevels();
        AbstractC11688p $r32 = $r3.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.dataSource.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KycLevelRemoteDataSource $r12 = KycLevelRemoteDataSource.this;
                APIResponse $r4 = (APIResponse) obj;
                List $r22 = KycLevelRemoteDataSource.m40719getKycLevels$lambda0($r12, $r4);
                return $r22;
            }
        });
        RxSchedulers $r5 = this.rxSchedulers;
        Item $r6 = $r5.setSettings();
        AbstractC11688p $r33 = $r32.h0($r6);
        Log_OC.loadImage($r33, "networkService.api.getKycLevels().map {\n            toListOfKycModel(it)\n        }.subscribeOn(rxSchedulers.io())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getMonthlyKycLevelLimit(String str) {
        Log_OC.getArray(str, "id");
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        AbstractC11688p $r4 = $r3.getMonthlyKycLevels(str);
        AbstractC11688p $r42 = $r4.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.settings.dataSource.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KycLevelRemoteDataSource $r1 = KycLevelRemoteDataSource.this;
                APIResponse $r43 = (APIResponse) obj;
                List $r22 = KycLevelRemoteDataSource.m40720getMonthlyKycLevelLimit$lambda1($r1, $r43);
                return $r22;
            }
        });
        RxSchedulers $r6 = this.rxSchedulers;
        Item $r7 = $r6.setSettings();
        AbstractC11688p $r43 = $r42.h0($r7);
        Log_OC.loadImage($r43, "networkService.api.getMonthlyKycLevels(id).map {\n            toListOfKycModel(it)\n        }.subscribeOn(rxSchedulers.io())");
        return $r43;
    }
}
