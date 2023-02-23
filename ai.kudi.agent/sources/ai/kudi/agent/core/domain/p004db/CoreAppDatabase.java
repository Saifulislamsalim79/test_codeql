package ai.kudi.agent.core.domain.p004db;

import ai.kudi.agent.core.domain.p004db.migrations.RoomMigrationKt;
import ai.kudi.agent.core.domain.p004db.room_dao.AccountDao;
import ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.BanksDao;
import ai.kudi.agent.core.domain.p004db.room_dao.BillerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao;
import ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao;
import ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao;
import ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductDao;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao;
import ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao;
import ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao;
import ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao;
import android.content.Context;
import androidx.room.AbstractC1802o0;
import androidx.room.C1800n0;
import androidx.room.p062y0.AbstractC1850b;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CoreAppDatabase.kt */
@Metadata(m10422d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010?\u001a\u00020@H&J\b\u0010A\u001a\u00020BH&J\b\u0010C\u001a\u00020DH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0012\u0010/\u001a\u000200X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0012\u00103\u001a\u000204X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0012\u00107\u001a\u000208X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0012\u0010;\u001a\u00020<X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006F"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "accountDao", "Lai/kudi/agent/core/domain/db/room_dao/AccountDao;", "getAccountDao", "()Lai/kudi/agent/core/domain/db/room_dao/AccountDao;", "agentCustomerDao", "Lai/kudi/agent/core/domain/db/room_dao/AgentCustomerDao;", "getAgentCustomerDao", "()Lai/kudi/agent/core/domain/db/room_dao/AgentCustomerDao;", "banksDao", "Lai/kudi/agent/core/domain/db/room_dao/BanksDao;", "getBanksDao", "()Lai/kudi/agent/core/domain/db/room_dao/BanksDao;", "idTypeDao", "Lai/kudi/agent/core/domain/db/room_dao/IdTypeDao;", "getIdTypeDao", "()Lai/kudi/agent/core/domain/db/room_dao/IdTypeDao;", "issueResolutionDao", "Lai/kudi/agent/core/domain/db/room_dao/IssueResolutionDao;", "getIssueResolutionDao", "()Lai/kudi/agent/core/domain/db/room_dao/IssueResolutionDao;", "kycLevelsDao", "Lai/kudi/agent/core/domain/db/room_dao/KycLevelsDao;", "getKycLevelsDao", "()Lai/kudi/agent/core/domain/db/room_dao/KycLevelsDao;", "miniKshockDetailsDao", "Lai/kudi/agent/core/domain/db/room_dao/MiniKshockDetailsDao;", "getMiniKshockDetailsDao", "()Lai/kudi/agent/core/domain/db/room_dao/MiniKshockDetailsDao;", "paymentMethodDao", "Lai/kudi/agent/core/domain/db/room_dao/PaymentMethodDao;", "getPaymentMethodDao", "()Lai/kudi/agent/core/domain/db/room_dao/PaymentMethodDao;", "pinCredentialsDao", "Lai/kudi/agent/core/domain/db/room_dao/PinCredentialsDao;", "getPinCredentialsDao", "()Lai/kudi/agent/core/domain/db/room_dao/PinCredentialsDao;", "productSectorDao", "Lai/kudi/agent/core/domain/db/room_dao/ProductSectorDao;", "getProductSectorDao", "()Lai/kudi/agent/core/domain/db/room_dao/ProductSectorDao;", "relationshipManagerDao", "Lai/kudi/agent/core/domain/db/room_dao/RelationshipManagerDao;", "getRelationshipManagerDao", "()Lai/kudi/agent/core/domain/db/room_dao/RelationshipManagerDao;", "transactionsDao", "Lai/kudi/agent/core/domain/db/room_dao/TransactionsDao;", "getTransactionsDao", "()Lai/kudi/agent/core/domain/db/room_dao/TransactionsDao;", "transactionsSummaryDao", "Lai/kudi/agent/core/domain/db/room_dao/TransactionsSummaryDao;", "getTransactionsSummaryDao", "()Lai/kudi/agent/core/domain/db/room_dao/TransactionsSummaryDao;", "userProfileDao", "Lai/kudi/agent/core/domain/db/room_dao/UserProfileDao;", "getUserProfileDao", "()Lai/kudi/agent/core/domain/db/room_dao/UserProfileDao;", "ussdWithdrawalProviderDao", "Lai/kudi/agent/core/domain/db/room_dao/UssdWithdrawalProviderDao;", "getUssdWithdrawalProviderDao", "()Lai/kudi/agent/core/domain/db/room_dao/UssdWithdrawalProviderDao;", "announcementDao", "Lai/kudi/agent/core/domain/db/room_dao/AnnouncementsDao;", "billerDao", "Lai/kudi/agent/core/domain/db/room_dao/BillerDao;", "productDao", "Lai/kudi/agent/core/domain/db/room_dao/ProductDao;", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.CoreAppDatabase */
/* loaded from: classes.dex */
public abstract class CoreAppDatabase extends AbstractC1802o0 {
    public static final Companion Companion;
    private static final String DATABASE_NAME;
    private static CoreAppDatabase sInstance;

    /* compiled from: CoreAppDatabase.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/CoreAppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "sInstance", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "getInstance", "context", "Landroid/content/Context;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.core.domain.db.CoreAppDatabase$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CoreAppDatabase getInstance(Context context) {
            Log_OC.getArray(context, "context");
            CoreAppDatabase $r2 = CoreAppDatabase.sInstance;
            if ($r2 == null) {
                synchronized (CoreAppDatabase.class) {
                    Companion companion = CoreAppDatabase.Companion;
                    Context $r1 = context.getApplicationContext();
                    String $r3 = CoreAppDatabase.DATABASE_NAME;
                    AbstractC1802o0.C1803a $r4 = C1800n0.m34493a($r1, CoreAppDatabase.class, $r3);
                    AbstractC1850b $r6 = RoomMigrationKt.getMIGRATION_1_2();
                    AbstractC1850b $r62 = RoomMigrationKt.getMIGRATION_2_3();
                    AbstractC1850b $r63 = RoomMigrationKt.getMIGRATION_3_4();
                    AbstractC1850b $r64 = RoomMigrationKt.getMIGRATION_4_5();
                    AbstractC1850b $r65 = RoomMigrationKt.getMIGRATION_5_6();
                    AbstractC1850b $r66 = RoomMigrationKt.getMIGRATION_6_7();
                    AbstractC1850b $r67 = RoomMigrationKt.getMIGRATION_7_8();
                    AbstractC1850b $r68 = RoomMigrationKt.getMIGRATION_8_9();
                    AbstractC1850b $r69 = RoomMigrationKt.getMIGRATION_9_10();
                    AbstractC1850b $r610 = RoomMigrationKt.getMIGRATION_10_11();
                    AbstractC1850b $r611 = RoomMigrationKt.getMIGRATION_11_12();
                    AbstractC1850b $r612 = RoomMigrationKt.getMIGRATION_12_13();
                    AbstractC1850b $r613 = RoomMigrationKt.getMIGRATION_13_14();
                    AbstractC1850b $r614 = RoomMigrationKt.getMIGRATION_14_15();
                    AbstractC1850b $r615 = RoomMigrationKt.getMIGRATION_15_16();
                    AbstractC1850b $r616 = RoomMigrationKt.getMIGRATION_16_17();
                    AbstractC1850b $r617 = RoomMigrationKt.getMIGRATION_17_18();
                    AbstractC1850b $r618 = RoomMigrationKt.getMIGRATION_18_19();
                    AbstractC1850b $r619 = RoomMigrationKt.getMIGRATION_19_20();
                    AbstractC1850b $r620 = RoomMigrationKt.getMIGRATION_20_21();
                    AbstractC1850b $r621 = RoomMigrationKt.getMIGRATION_21_22();
                    AbstractC1850b $r622 = RoomMigrationKt.getMIGRATION_22_23();
                    AbstractC1850b $r623 = RoomMigrationKt.getMIGRATION_23_24();
                    AbstractC1850b[] $r5 = {$r6, $r62, $r63, $r64, $r65, $r66, $r67, $r68, $r69, $r610, $r611, $r612, $r613, $r614, $r615, $r616, $r617, $r618, $r619, $r620, $r621, $r622, $r623};
                    $r4.m34489a($r5);
                    AbstractC1802o0 $r7 = $r4.m34488b();
                    CoreAppDatabase $r22 = (CoreAppDatabase) $r7;
                    CoreAppDatabase.sInstance = $r22;
                    C13666w c13666w = C13666w.f30112a;
                }
            }
            CoreAppDatabase $r23 = CoreAppDatabase.sInstance;
            return $r23;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DATABASE_NAME = "kudi_agent_app_db";
    }

    public abstract AnnouncementsDao announcementDao();

    public abstract BillerDao billerDao();

    public abstract AccountDao getAccountDao();

    public abstract AgentCustomerDao getAgentCustomerDao();

    public abstract BanksDao getBanksDao();

    public abstract IdTypeDao getIdTypeDao();

    public abstract IssueResolutionDao getIssueResolutionDao();

    public abstract KycLevelsDao getKycLevelsDao();

    public abstract MiniKshockDetailsDao getMiniKshockDetailsDao();

    public abstract PaymentMethodDao getPaymentMethodDao();

    public abstract PinCredentialsDao getPinCredentialsDao();

    public abstract ProductSectorDao getProductSectorDao();

    public abstract RelationshipManagerDao getRelationshipManagerDao();

    public abstract TransactionsDao getTransactionsDao();

    public abstract TransactionsSummaryDao getTransactionsSummaryDao();

    public abstract UserProfileDao getUserProfileDao();

    public abstract UssdWithdrawalProviderDao getUssdWithdrawalProviderDao();

    public abstract ProductDao productDao();
}
