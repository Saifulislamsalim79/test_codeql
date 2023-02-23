package ai.kudi.agent.core.domain.p004db;

import ai.kudi.agent.core.domain.p004db.room_dao.AccountDao;
import ai.kudi.agent.core.domain.p004db.room_dao.AccountDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.AnnouncementsDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.BanksDao;
import ai.kudi.agent.core.domain.p004db.room_dao.BanksDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.BillerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.BillerDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao;
import ai.kudi.agent.core.domain.p004db.room_dao.IdTypeDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao;
import ai.kudi.agent.core.domain.p004db.room_dao.IssueResolutionDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.KycLevelsDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.MiniKshockDetailsDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao;
import ai.kudi.agent.core.domain.p004db.room_dao.PaymentMethodDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.PinCredentialsDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductDao;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductSectorDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.RelationshipManagerDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao;
import ai.kudi.agent.core.domain.p004db.room_dao.TransactionsSummaryDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao;
import ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao_Impl;
import ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao;
import ai.kudi.agent.core.domain.p004db.room_dao.UssdWithdrawalProviderDao_Impl;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.content.Context;
import android.database.Cursor;
import androidx.room.AbstractC1802o0;
import androidx.room.C1775g0;
import androidx.room.C1812q0;
import androidx.room.C1851z;
import androidx.room.p062y0.AbstractC1850b;
import androidx.room.p063z0.C1854c;
import androidx.room.p063z0.C1858g;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p201g.p262t.p263a.InterfaceC8093g;
import p201g.p262t.p263a.InterfaceC8094h;
/* renamed from: ai.kudi.agent.core.domain.db.CoreAppDatabase_Impl */
/* loaded from: classes.dex */
public final class CoreAppDatabase_Impl extends CoreAppDatabase {
    private volatile AccountDao _accountDao;
    private volatile AgentCustomerDao _agentCustomerDao;
    private volatile AnnouncementsDao _announcementsDao;
    private volatile BanksDao _banksDao;
    private volatile BillerDao _billerDao;
    private volatile IdTypeDao _idTypeDao;
    private volatile IssueResolutionDao _issueResolutionDao;
    private volatile KycLevelsDao _kycLevelsDao;
    private volatile MiniKshockDetailsDao _miniKshockDetailsDao;
    private volatile PaymentMethodDao _paymentMethodDao;
    private volatile PinCredentialsDao _pinCredentialsDao;
    private volatile ProductDao _productDao;
    private volatile ProductSectorDao _productSectorDao;
    private volatile RelationshipManagerDao _relationshipManagerDao;
    private volatile TransactionsDao _transactionsDao;
    private volatile TransactionsSummaryDao _transactionsSummaryDao;
    private volatile UserProfileDao _userProfileDao;
    private volatile UssdWithdrawalProviderDao _ussdWithdrawalProviderDao;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public AnnouncementsDao announcementDao() {
        AnnouncementsDao $r1;
        AnnouncementsDao $r12 = this._announcementsDao;
        if ($r12 != null) {
            AnnouncementsDao $r13 = this._announcementsDao;
            return $r13;
        }
        synchronized (this) {
            AnnouncementsDao $r14 = this._announcementsDao;
            if ($r14 == null) {
                AnnouncementsDao_Impl $r2 = new AnnouncementsDao_Impl(this);
                this._announcementsDao = $r2;
            }
            $r1 = this._announcementsDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public BillerDao billerDao() {
        BillerDao $r1;
        BillerDao $r12 = this._billerDao;
        if ($r12 != null) {
            BillerDao $r13 = this._billerDao;
            return $r13;
        }
        synchronized (this) {
            BillerDao $r14 = this._billerDao;
            if ($r14 == null) {
                BillerDao_Impl $r2 = new BillerDao_Impl(this);
                this._billerDao = $r2;
            }
            $r1 = this._billerDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC8094h $r1 = super.getOpenHelper();
        InterfaceC8093g $r2 = $r1.mo16747h0();
        try {
            super.beginTransaction();
            $r2.execSQL("DELETE FROM `agent_customer`");
            $r2.execSQL("DELETE FROM `agent_credentials`");
            $r2.execSQL("DELETE FROM `user_profile`");
            $r2.execSQL("DELETE FROM `account_details`");
            $r2.execSQL("DELETE FROM `Biller`");
            $r2.execSQL("DELETE FROM `Product`");
            $r2.execSQL("DELETE FROM `issue_data`");
            $r2.execSQL("DELETE FROM `issue_details`");
            $r2.execSQL("DELETE FROM `ussd_withdrawal_provider`");
            $r2.execSQL("DELETE FROM `announcements`");
            $r2.execSQL("DELETE FROM `bank`");
            $r2.execSQL("DELETE FROM `relationship_manager`");
            $r2.execSQL("DELETE FROM `idType`");
            $r2.execSQL("DELETE FROM `payment_method`");
            $r2.execSQL("DELETE FROM `product_sectors`");
            $r2.execSQL("DELETE FROM `transactions`");
            $r2.execSQL("DELETE FROM `transactions_summary`");
            $r2.execSQL("DELETE FROM `mini_kshock_details`");
            $r2.execSQL("DELETE FROM `kyc_level_data`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            Cursor $r3 = $r2.mo16750j0("PRAGMA wal_checkpoint(FULL)");
            $r3.close();
            boolean $z0 = $r2.inTransaction();
            if (!$z0) {
                $r2.execSQL("VACUUM");
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    protected C1775g0 createInvalidationTracker() {
        HashMap $r1 = new HashMap(0);
        HashMap $r2 = new HashMap(0);
        String[] $r3 = {"agent_customer", "agent_credentials", "user_profile", "account_details", "Biller", "Product", "issue_data", "issue_details", "ussd_withdrawal_provider", "announcements", "bank", "relationship_manager", "idType", "payment_method", "product_sectors", "transactions", "transactions_summary", "mini_kshock_details", "kyc_level_data"};
        C1775g0 $r4 = new C1775g0(this, $r1, $r2, $r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    protected InterfaceC8094h createOpenHelper(C1851z c1851z) {
        C1812q0 $r2 = new C1812q0(c1851z, new C1812q0.AbstractC1813a(24) { // from class: ai.kudi.agent.core.domain.db.CoreAppDatabase_Impl.1
            @Override // androidx.room.C1812q0.AbstractC1813a
            public void createAllTables(InterfaceC8093g interfaceC8093g) {
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `agent_customer` (`name` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `agent_credentials` (`phoneNumber` TEXT NOT NULL, `encodedPin` TEXT NOT NULL, PRIMARY KEY(`phoneNumber`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `user_profile` (`userId` TEXT, `profileImage` TEXT, `phoneNumber` TEXT, `kycLevel` TEXT, `bvnIsVerified` INTEGER NOT NULL, `email` TEXT, `dob` TEXT, `gender` TEXT, `businessName` TEXT, `address` TEXT, `state` TEXT, `lga` TEXT, `firstName` TEXT, `lastName` TEXT, `businessAddress` TEXT, `bvn` TEXT, `secondaryPhoneNumber` TEXT, `managerId` TEXT, `sessionId` TEXT, `userName` TEXT, `picsUrl` TEXT, `isActive` INTEGER NOT NULL, `isLoggedIn` INTEGER NOT NULL, `cacDocumentId` TEXT, `utilityBillImageId` TEXT, `city` TEXT, `agentKyc` TEXT, `bank` TEXT, `accountName` TEXT, `accountNumber` TEXT, `personalBusinessAddress` TEXT, `homeAddress` TEXT, `closestLandmark` TEXT, `identityNumberType` TEXT, `cacRegistrationNo` TEXT, `terminalId` TEXT, `mposVendor` TEXT, `serialNumber` TEXT, `posDeviceName` TEXT, `timeCreated` TEXT, `sourceId` TEXT, `fcmToken` TEXT, `identificationCardImageId` TEXT, `uplinePhoneNumber` TEXT, `area` TEXT, `primaryBusinessCategory` TEXT, `customerType` TEXT, `savingsCategory` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `account_details` (`accountName` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `bankName` TEXT NOT NULL, `bankCode` TEXT NOT NULL, `dateAdded` TEXT NOT NULL, `agentId` TEXT NOT NULL, `accountPurpose` TEXT NOT NULL, PRIMARY KEY(`accountNumber`, `accountPurpose`, `agentId`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `Biller` (`lookupId` TEXT NOT NULL, `name` TEXT NOT NULL, `namePrompt` TEXT NOT NULL, `image` TEXT NOT NULL, `header` TEXT NOT NULL, `availability` INTEGER NOT NULL, `promptType` TEXT, `shouldUseProductForLookUp` INTEGER NOT NULL, `usageFrequency` INTEGER NOT NULL, PRIMARY KEY(`lookupId`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `Product` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER, `type` TEXT NOT NULL, `types` TEXT NOT NULL, `requiresPhone` INTEGER NOT NULL, `billerId` TEXT, `localId` TEXT NOT NULL, `availability` INTEGER NOT NULL, PRIMARY KEY(`localId`, `type`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `issue_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `category` TEXT, `categoryName` TEXT, `hasChildren` INTEGER, `index` INTEGER NOT NULL, `parentIndex` INTEGER NOT NULL, `transactionCentric` INTEGER NOT NULL, `transactionTypeKey` TEXT)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `issue_details` (`description` TEXT, `globalIndex` INTEGER, `id` TEXT NOT NULL, `index` INTEGER, `label` TEXT, `prettyName` TEXT, `slaInHours` INTEGER, `timeCreated` TEXT, `timeUpdated` TEXT, `type` TEXT, `body` TEXT, `typeSlug` TEXT, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `ussd_withdrawal_provider` (`api_bank_name` TEXT NOT NULL, `bank_name` TEXT NOT NULL, `bank_code` TEXT NOT NULL, `enable` INTEGER NOT NULL, `processor` TEXT NOT NULL, `prompt` TEXT NOT NULL, `ussd_code` TEXT NOT NULL, PRIMARY KEY(`bank_code`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `announcements` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` TEXT NOT NULL, `customerType` TEXT, `preview` TEXT)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `bank` (`name` TEXT NOT NULL, `bankCode` TEXT NOT NULL, PRIMARY KEY(`bankCode`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `relationship_manager` (`contactPhoneNumber` TEXT, `firstName` TEXT, `lastName` TEXT, `managerAccountPhone` TEXT, `managerId` TEXT NOT NULL, `officialEmail` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `idType` (`name` TEXT NOT NULL, `id` TEXT NOT NULL, `validLength` INTEGER NOT NULL, `isAvailable` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `payment_method` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `cardNo` TEXT, `token` TEXT, `amount` INTEGER, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `product_sectors` (`id` INTEGER, `name` TEXT, `nameSlugified` TEXT, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE INDEX IF NOT EXISTS `index_product_sectors_id` ON `product_sectors` (`id`)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`id` TEXT NOT NULL, `transactionType` TEXT NOT NULL, `accountBalance` TEXT NOT NULL, `amount` TEXT NOT NULL, `kind` TEXT, `customerPhone` TEXT NOT NULL, `customerName` TEXT NOT NULL, `customerPictureId` TEXT NOT NULL, `status` TEXT NOT NULL, `date` INTEGER NOT NULL, `userId` TEXT NOT NULL, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `transactions_summary` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `value` TEXT NOT NULL, `userId` TEXT NOT NULL)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `mini_kshock_details` (`id` INTEGER NOT NULL, `availableLoanAmount` INTEGER, `maxLoanAmount` INTEGER, `tenure` INTEGER, PRIMARY KEY(`id`))");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `kyc_level_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `monthlyWithdrawalLimit` INTEGER, `monthlyTransferLimit` INTEGER, `monthlyWalletTopUpLimit` TEXT, `kycLevel` TEXT NOT NULL, `name` TEXT)");
                interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC8093g.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '67c3f24c038d2895f8eed47c29e5aa6c')");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.C1812q0.AbstractC1813a
            public void dropAllTables(InterfaceC8093g interfaceC8093g) {
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `agent_customer`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `agent_credentials`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `user_profile`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `account_details`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `Biller`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `Product`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `issue_data`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `issue_details`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `ussd_withdrawal_provider`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `announcements`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `bank`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `relationship_manager`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `idType`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `payment_method`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `product_sectors`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `transactions`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `transactions_summary`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `mini_kshock_details`");
                interfaceC8093g.execSQL("DROP TABLE IF EXISTS `kyc_level_data`");
                CoreAppDatabase_Impl $r22 = CoreAppDatabase_Impl.this;
                List $r3 = ((AbstractC1802o0) $r22).mCallbacks;
                if ($r3 != null) {
                    CoreAppDatabase_Impl $r23 = CoreAppDatabase_Impl.this;
                    List $r32 = ((AbstractC1802o0) $r23).mCallbacks;
                    int $i1 = $r32.size();
                    for (int $i0 = 0; $i0 < $i1; $i0++) {
                        CoreAppDatabase_Impl $r24 = CoreAppDatabase_Impl.this;
                        List $r33 = ((AbstractC1802o0) $r24).mCallbacks;
                        Object $r4 = $r33.get($i0);
                        AbstractC1802o0.AbstractC1804b $r5 = (AbstractC1802o0.AbstractC1804b) $r4;
                        $r5.m34486b(interfaceC8093g);
                    }
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.C1812q0.AbstractC1813a
            protected void onCreate(InterfaceC8093g interfaceC8093g) {
                CoreAppDatabase_Impl $r22 = CoreAppDatabase_Impl.this;
                List $r3 = ((AbstractC1802o0) $r22).mCallbacks;
                if ($r3 != null) {
                    CoreAppDatabase_Impl $r23 = CoreAppDatabase_Impl.this;
                    List $r32 = ((AbstractC1802o0) $r23).mCallbacks;
                    int $i1 = $r32.size();
                    for (int $i0 = 0; $i0 < $i1; $i0++) {
                        CoreAppDatabase_Impl $r24 = CoreAppDatabase_Impl.this;
                        List $r33 = ((AbstractC1802o0) $r24).mCallbacks;
                        Object $r4 = $r33.get($i0);
                        AbstractC1802o0.AbstractC1804b $r5 = (AbstractC1802o0.AbstractC1804b) $r4;
                        $r5.m34487a(interfaceC8093g);
                    }
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.C1812q0.AbstractC1813a
            public void onOpen(InterfaceC8093g interfaceC8093g) {
                CoreAppDatabase_Impl $r22 = CoreAppDatabase_Impl.this;
                ((AbstractC1802o0) $r22).mDatabase = interfaceC8093g;
                CoreAppDatabase_Impl $r23 = CoreAppDatabase_Impl.this;
                $r23.internalInitInvalidationTracker(interfaceC8093g);
                CoreAppDatabase_Impl $r24 = CoreAppDatabase_Impl.this;
                List $r3 = ((AbstractC1802o0) $r24).mCallbacks;
                if ($r3 != null) {
                    CoreAppDatabase_Impl $r25 = CoreAppDatabase_Impl.this;
                    List $r32 = ((AbstractC1802o0) $r25).mCallbacks;
                    int $i1 = $r32.size();
                    for (int $i0 = 0; $i0 < $i1; $i0++) {
                        CoreAppDatabase_Impl $r26 = CoreAppDatabase_Impl.this;
                        List $r33 = ((AbstractC1802o0) $r26).mCallbacks;
                        Object $r4 = $r33.get($i0);
                        AbstractC1802o0.AbstractC1804b $r5 = (AbstractC1802o0.AbstractC1804b) $r4;
                        $r5.m34485c(interfaceC8093g);
                    }
                }
            }

            @Override // androidx.room.C1812q0.AbstractC1813a
            public void onPostMigrate(InterfaceC8093g interfaceC8093g) {
            }

            @Override // androidx.room.C1812q0.AbstractC1813a
            public void onPreMigrate(InterfaceC8093g interfaceC8093g) {
                C1854c.m34420a(interfaceC8093g);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.C1812q0.AbstractC1813a
            protected C1812q0.C1814b onValidateSchema(InterfaceC8093g interfaceC8093g) {
                HashMap $r22 = new HashMap(2);
                C1858g.C1859a $r3 = new C1858g.C1859a("name", "TEXT", false, 0, null, 1);
                $r22.put("name", $r3);
                C1858g.C1859a $r32 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r22.put("id", $r32);
                HashSet $r4 = new HashSet(0);
                HashSet $r5 = new HashSet(0);
                C1858g $r6 = new C1858g("agent_customer", $r22, $r4, $r5);
                C1858g $r7 = C1858g.m34412a(interfaceC8093g, "agent_customer");
                boolean $z0 = $r6.equals($r7);
                if (!$z0) {
                    String $r10 = "agent_customer(ai.kudi.agent.core.domain.room_entities.AgentCustomerEntity).\n Expected:\n" + $r6 + "\n Found:\n" + $r7;
                    C1812q0.C1814b $r8 = new C1812q0.C1814b(false, $r10);
                    return $r8;
                }
                HashMap $r23 = new HashMap(2);
                C1858g.C1859a $r33 = new C1858g.C1859a("phoneNumber", "TEXT", true, 1, null, 1);
                $r23.put("phoneNumber", $r33);
                C1858g.C1859a $r34 = new C1858g.C1859a("encodedPin", "TEXT", true, 0, null, 1);
                $r23.put("encodedPin", $r34);
                HashSet $r42 = new HashSet(0);
                HashSet $r52 = new HashSet(0);
                C1858g $r62 = new C1858g("agent_credentials", $r23, $r42, $r52);
                C1858g $r72 = C1858g.m34412a(interfaceC8093g, "agent_credentials");
                boolean $z02 = $r62.equals($r72);
                if (!$z02) {
                    String $r102 = "agent_credentials(ai.kudi.agent.core.domain.room_entities.PinEntity).\n Expected:\n" + $r62 + "\n Found:\n" + $r72;
                    C1812q0.C1814b $r82 = new C1812q0.C1814b(false, $r102);
                    return $r82;
                }
                HashMap $r24 = new HashMap(49);
                C1858g.C1859a $r35 = new C1858g.C1859a("userId", "TEXT", false, 0, null, 1);
                $r24.put("userId", $r35);
                C1858g.C1859a $r36 = new C1858g.C1859a("profileImage", "TEXT", false, 0, null, 1);
                $r24.put("profileImage", $r36);
                C1858g.C1859a $r37 = new C1858g.C1859a("phoneNumber", "TEXT", false, 0, null, 1);
                $r24.put("phoneNumber", $r37);
                C1858g.C1859a $r38 = new C1858g.C1859a("kycLevel", "TEXT", false, 0, null, 1);
                $r24.put("kycLevel", $r38);
                C1858g.C1859a $r39 = new C1858g.C1859a("bvnIsVerified", "INTEGER", true, 0, null, 1);
                $r24.put("bvnIsVerified", $r39);
                C1858g.C1859a $r310 = new C1858g.C1859a("email", "TEXT", false, 0, null, 1);
                $r24.put("email", $r310);
                C1858g.C1859a $r311 = new C1858g.C1859a("dob", "TEXT", false, 0, null, 1);
                $r24.put("dob", $r311);
                C1858g.C1859a $r312 = new C1858g.C1859a("gender", "TEXT", false, 0, null, 1);
                $r24.put("gender", $r312);
                C1858g.C1859a $r313 = new C1858g.C1859a("businessName", "TEXT", false, 0, null, 1);
                $r24.put("businessName", $r313);
                C1858g.C1859a $r314 = new C1858g.C1859a("address", "TEXT", false, 0, null, 1);
                $r24.put("address", $r314);
                C1858g.C1859a $r315 = new C1858g.C1859a(SendReceiptToTerminalConfirmationBottomSheet.STATE, "TEXT", false, 0, null, 1);
                $r24.put(SendReceiptToTerminalConfirmationBottomSheet.STATE, $r315);
                C1858g.C1859a $r316 = new C1858g.C1859a("lga", "TEXT", false, 0, null, 1);
                $r24.put("lga", $r316);
                C1858g.C1859a $r317 = new C1858g.C1859a("firstName", "TEXT", false, 0, null, 1);
                $r24.put("firstName", $r317);
                C1858g.C1859a $r318 = new C1858g.C1859a("lastName", "TEXT", false, 0, null, 1);
                $r24.put("lastName", $r318);
                C1858g.C1859a $r319 = new C1858g.C1859a("businessAddress", "TEXT", false, 0, null, 1);
                $r24.put("businessAddress", $r319);
                C1858g.C1859a $r320 = new C1858g.C1859a(PhoneFragment.ARG_BVN, "TEXT", false, 0, null, 1);
                $r24.put(PhoneFragment.ARG_BVN, $r320);
                C1858g.C1859a $r321 = new C1858g.C1859a("secondaryPhoneNumber", "TEXT", false, 0, null, 1);
                $r24.put("secondaryPhoneNumber", $r321);
                C1858g.C1859a $r322 = new C1858g.C1859a("managerId", "TEXT", false, 0, null, 1);
                $r24.put("managerId", $r322);
                C1858g.C1859a $r323 = new C1858g.C1859a("sessionId", "TEXT", false, 0, null, 1);
                $r24.put("sessionId", $r323);
                C1858g.C1859a $r324 = new C1858g.C1859a("userName", "TEXT", false, 0, null, 1);
                $r24.put("userName", $r324);
                C1858g.C1859a $r325 = new C1858g.C1859a("picsUrl", "TEXT", false, 0, null, 1);
                $r24.put("picsUrl", $r325);
                C1858g.C1859a $r326 = new C1858g.C1859a("isActive", "INTEGER", true, 0, null, 1);
                $r24.put("isActive", $r326);
                C1858g.C1859a $r327 = new C1858g.C1859a("isLoggedIn", "INTEGER", true, 0, null, 1);
                $r24.put("isLoggedIn", $r327);
                C1858g.C1859a $r328 = new C1858g.C1859a("cacDocumentId", "TEXT", false, 0, null, 1);
                $r24.put("cacDocumentId", $r328);
                C1858g.C1859a $r329 = new C1858g.C1859a("utilityBillImageId", "TEXT", false, 0, null, 1);
                $r24.put("utilityBillImageId", $r329);
                C1858g.C1859a $r330 = new C1858g.C1859a("city", "TEXT", false, 0, null, 1);
                $r24.put("city", $r330);
                C1858g.C1859a $r331 = new C1858g.C1859a("agentKyc", "TEXT", false, 0, null, 1);
                $r24.put("agentKyc", $r331);
                C1858g.C1859a $r332 = new C1858g.C1859a("bank", "TEXT", false, 0, null, 1);
                $r24.put("bank", $r332);
                C1858g.C1859a $r333 = new C1858g.C1859a(BanksWithMethods.ACCOUNT_NAME, "TEXT", false, 0, null, 1);
                $r24.put(BanksWithMethods.ACCOUNT_NAME, $r333);
                C1858g.C1859a $r334 = new C1858g.C1859a(BanksWithMethods.ACCOUNT_NUMBER, "TEXT", false, 0, null, 1);
                $r24.put(BanksWithMethods.ACCOUNT_NUMBER, $r334);
                C1858g.C1859a $r335 = new C1858g.C1859a("personalBusinessAddress", "TEXT", false, 0, null, 1);
                $r24.put("personalBusinessAddress", $r335);
                C1858g.C1859a $r336 = new C1858g.C1859a("homeAddress", "TEXT", false, 0, null, 1);
                $r24.put("homeAddress", $r336);
                C1858g.C1859a $r337 = new C1858g.C1859a("closestLandmark", "TEXT", false, 0, null, 1);
                $r24.put("closestLandmark", $r337);
                C1858g.C1859a $r338 = new C1858g.C1859a("identityNumberType", "TEXT", false, 0, null, 1);
                $r24.put("identityNumberType", $r338);
                C1858g.C1859a $r339 = new C1858g.C1859a("cacRegistrationNo", "TEXT", false, 0, null, 1);
                $r24.put("cacRegistrationNo", $r339);
                C1858g.C1859a $r340 = new C1858g.C1859a("terminalId", "TEXT", false, 0, null, 1);
                $r24.put("terminalId", $r340);
                C1858g.C1859a $r341 = new C1858g.C1859a("mposVendor", "TEXT", false, 0, null, 1);
                $r24.put("mposVendor", $r341);
                C1858g.C1859a $r342 = new C1858g.C1859a("serialNumber", "TEXT", false, 0, null, 1);
                $r24.put("serialNumber", $r342);
                C1858g.C1859a $r343 = new C1858g.C1859a("posDeviceName", "TEXT", false, 0, null, 1);
                $r24.put("posDeviceName", $r343);
                C1858g.C1859a $r344 = new C1858g.C1859a("timeCreated", "TEXT", false, 0, null, 1);
                $r24.put("timeCreated", $r344);
                C1858g.C1859a $r345 = new C1858g.C1859a("sourceId", "TEXT", false, 0, null, 1);
                $r24.put("sourceId", $r345);
                C1858g.C1859a $r346 = new C1858g.C1859a("fcmToken", "TEXT", false, 0, null, 1);
                $r24.put("fcmToken", $r346);
                C1858g.C1859a $r347 = new C1858g.C1859a("identificationCardImageId", "TEXT", false, 0, null, 1);
                $r24.put("identificationCardImageId", $r347);
                C1858g.C1859a $r348 = new C1858g.C1859a("uplinePhoneNumber", "TEXT", false, 0, null, 1);
                $r24.put("uplinePhoneNumber", $r348);
                C1858g.C1859a $r349 = new C1858g.C1859a("area", "TEXT", false, 0, null, 1);
                $r24.put("area", $r349);
                C1858g.C1859a $r350 = new C1858g.C1859a("primaryBusinessCategory", "TEXT", false, 0, null, 1);
                $r24.put("primaryBusinessCategory", $r350);
                C1858g.C1859a $r351 = new C1858g.C1859a("customerType", "TEXT", false, 0, null, 1);
                $r24.put("customerType", $r351);
                C1858g.C1859a $r352 = new C1858g.C1859a("savingsCategory", "TEXT", false, 0, null, 1);
                $r24.put("savingsCategory", $r352);
                C1858g.C1859a $r353 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r24.put("id", $r353);
                HashSet $r43 = new HashSet(0);
                HashSet $r53 = new HashSet(0);
                C1858g $r63 = new C1858g("user_profile", $r24, $r43, $r53);
                C1858g $r73 = C1858g.m34412a(interfaceC8093g, "user_profile");
                boolean $z03 = $r63.equals($r73);
                if (!$z03) {
                    String $r103 = "user_profile(ai.kudi.agent.core.domain.room_entities.UserProfile).\n Expected:\n" + $r63 + "\n Found:\n" + $r73;
                    C1812q0.C1814b $r83 = new C1812q0.C1814b(false, $r103);
                    return $r83;
                }
                HashMap $r25 = new HashMap(7);
                C1858g.C1859a $r354 = new C1858g.C1859a(BanksWithMethods.ACCOUNT_NAME, "TEXT", true, 0, null, 1);
                $r25.put(BanksWithMethods.ACCOUNT_NAME, $r354);
                C1858g.C1859a $r355 = new C1858g.C1859a(BanksWithMethods.ACCOUNT_NUMBER, "TEXT", true, 1, null, 1);
                $r25.put(BanksWithMethods.ACCOUNT_NUMBER, $r355);
                C1858g.C1859a $r356 = new C1858g.C1859a(BanksWithMethods.BANK_NAME, "TEXT", true, 0, null, 1);
                $r25.put(BanksWithMethods.BANK_NAME, $r356);
                C1858g.C1859a $r357 = new C1858g.C1859a("bankCode", "TEXT", true, 0, null, 1);
                $r25.put("bankCode", $r357);
                C1858g.C1859a $r358 = new C1858g.C1859a("dateAdded", "TEXT", true, 0, null, 1);
                $r25.put("dateAdded", $r358);
                C1858g.C1859a $r359 = new C1858g.C1859a("agentId", "TEXT", true, 3, null, 1);
                $r25.put("agentId", $r359);
                C1858g.C1859a $r360 = new C1858g.C1859a("accountPurpose", "TEXT", true, 2, null, 1);
                $r25.put("accountPurpose", $r360);
                HashSet $r44 = new HashSet(0);
                HashSet $r54 = new HashSet(0);
                C1858g $r64 = new C1858g("account_details", $r25, $r44, $r54);
                C1858g $r74 = C1858g.m34412a(interfaceC8093g, "account_details");
                boolean $z04 = $r64.equals($r74);
                if (!$z04) {
                    String $r104 = "account_details(ai.kudi.agent.core.domain.room_entities.BankAccount).\n Expected:\n" + $r64 + "\n Found:\n" + $r74;
                    C1812q0.C1814b $r84 = new C1812q0.C1814b(false, $r104);
                    return $r84;
                }
                HashMap $r26 = new HashMap(9);
                C1858g.C1859a $r361 = new C1858g.C1859a("lookupId", "TEXT", true, 1, null, 1);
                $r26.put("lookupId", $r361);
                C1858g.C1859a $r362 = new C1858g.C1859a("name", "TEXT", true, 0, null, 1);
                $r26.put("name", $r362);
                C1858g.C1859a $r363 = new C1858g.C1859a("namePrompt", "TEXT", true, 0, null, 1);
                $r26.put("namePrompt", $r363);
                C1858g.C1859a $r364 = new C1858g.C1859a("image", "TEXT", true, 0, null, 1);
                $r26.put("image", $r364);
                C1858g.C1859a $r365 = new C1858g.C1859a("header", "TEXT", true, 0, null, 1);
                $r26.put("header", $r365);
                C1858g.C1859a $r366 = new C1858g.C1859a("availability", "INTEGER", true, 0, null, 1);
                $r26.put("availability", $r366);
                C1858g.C1859a $r367 = new C1858g.C1859a("promptType", "TEXT", false, 0, null, 1);
                $r26.put("promptType", $r367);
                C1858g.C1859a $r368 = new C1858g.C1859a("shouldUseProductForLookUp", "INTEGER", true, 0, null, 1);
                $r26.put("shouldUseProductForLookUp", $r368);
                C1858g.C1859a $r369 = new C1858g.C1859a("usageFrequency", "INTEGER", true, 0, null, 1);
                $r26.put("usageFrequency", $r369);
                HashSet $r45 = new HashSet(0);
                HashSet $r55 = new HashSet(0);
                C1858g $r65 = new C1858g("Biller", $r26, $r45, $r55);
                C1858g $r75 = C1858g.m34412a(interfaceC8093g, "Biller");
                boolean $z05 = $r65.equals($r75);
                if (!$z05) {
                    String $r105 = "Biller(ai.kudi.agent.bills.data.Biller).\n Expected:\n" + $r65 + "\n Found:\n" + $r75;
                    C1812q0.C1814b $r85 = new C1812q0.C1814b(false, $r105);
                    return $r85;
                }
                HashMap $r27 = new HashMap(9);
                C1858g.C1859a $r370 = new C1858g.C1859a("id", "TEXT", true, 0, null, 1);
                $r27.put("id", $r370);
                C1858g.C1859a $r371 = new C1858g.C1859a("name", "TEXT", true, 0, null, 1);
                $r27.put("name", $r371);
                C1858g.C1859a $r372 = new C1858g.C1859a(TransactionField.AMOUNT, "INTEGER", false, 0, null, 1);
                $r27.put(TransactionField.AMOUNT, $r372);
                C1858g.C1859a $r373 = new C1858g.C1859a("type", "TEXT", true, 2, null, 1);
                $r27.put("type", $r373);
                C1858g.C1859a $r374 = new C1858g.C1859a("types", "TEXT", true, 0, null, 1);
                $r27.put("types", $r374);
                C1858g.C1859a $r375 = new C1858g.C1859a("requiresPhone", "INTEGER", true, 0, null, 1);
                $r27.put("requiresPhone", $r375);
                C1858g.C1859a $r376 = new C1858g.C1859a("billerId", "TEXT", false, 0, null, 1);
                $r27.put("billerId", $r376);
                C1858g.C1859a $r377 = new C1858g.C1859a("localId", "TEXT", true, 1, null, 1);
                $r27.put("localId", $r377);
                C1858g.C1859a $r378 = new C1858g.C1859a("availability", "INTEGER", true, 0, null, 1);
                $r27.put("availability", $r378);
                HashSet $r46 = new HashSet(0);
                HashSet $r56 = new HashSet(0);
                C1858g $r66 = new C1858g("Product", $r27, $r46, $r56);
                C1858g $r76 = C1858g.m34412a(interfaceC8093g, "Product");
                boolean $z06 = $r66.equals($r76);
                if (!$z06) {
                    String $r106 = "Product(ai.kudi.agent.bills.data.Product).\n Expected:\n" + $r66 + "\n Found:\n" + $r76;
                    C1812q0.C1814b $r86 = new C1812q0.C1814b(false, $r106);
                    return $r86;
                }
                HashMap $r28 = new HashMap(8);
                C1858g.C1859a $r379 = new C1858g.C1859a("id", "INTEGER", false, 1, null, 1);
                $r28.put("id", $r379);
                C1858g.C1859a $r380 = new C1858g.C1859a("category", "TEXT", false, 0, null, 1);
                $r28.put("category", $r380);
                C1858g.C1859a $r381 = new C1858g.C1859a("categoryName", "TEXT", false, 0, null, 1);
                $r28.put("categoryName", $r381);
                C1858g.C1859a $r382 = new C1858g.C1859a("hasChildren", "INTEGER", false, 0, null, 1);
                $r28.put("hasChildren", $r382);
                C1858g.C1859a $r383 = new C1858g.C1859a("index", "INTEGER", true, 0, null, 1);
                $r28.put("index", $r383);
                C1858g.C1859a $r384 = new C1858g.C1859a("parentIndex", "INTEGER", true, 0, null, 1);
                $r28.put("parentIndex", $r384);
                C1858g.C1859a $r385 = new C1858g.C1859a("transactionCentric", "INTEGER", true, 0, null, 1);
                $r28.put("transactionCentric", $r385);
                C1858g.C1859a $r386 = new C1858g.C1859a("transactionTypeKey", "TEXT", false, 0, null, 1);
                $r28.put("transactionTypeKey", $r386);
                HashSet $r47 = new HashSet(0);
                HashSet $r57 = new HashSet(0);
                C1858g $r67 = new C1858g("issue_data", $r28, $r47, $r57);
                C1858g $r77 = C1858g.m34412a(interfaceC8093g, "issue_data");
                boolean $z07 = $r67.equals($r77);
                if (!$z07) {
                    String $r107 = "issue_data(ai.kudi.agent.core.domain.room_entities.IssueCategory).\n Expected:\n" + $r67 + "\n Found:\n" + $r77;
                    C1812q0.C1814b $r87 = new C1812q0.C1814b(false, $r107);
                    return $r87;
                }
                HashMap $r29 = new HashMap(12);
                C1858g.C1859a $r387 = new C1858g.C1859a("description", "TEXT", false, 0, null, 1);
                $r29.put("description", $r387);
                C1858g.C1859a $r388 = new C1858g.C1859a("globalIndex", "INTEGER", false, 0, null, 1);
                $r29.put("globalIndex", $r388);
                C1858g.C1859a $r389 = new C1858g.C1859a("id", "TEXT", true, 1, null, 1);
                $r29.put("id", $r389);
                C1858g.C1859a $r390 = new C1858g.C1859a("index", "INTEGER", false, 0, null, 1);
                $r29.put("index", $r390);
                C1858g.C1859a $r391 = new C1858g.C1859a("label", "TEXT", false, 0, null, 1);
                $r29.put("label", $r391);
                C1858g.C1859a $r392 = new C1858g.C1859a("prettyName", "TEXT", false, 0, null, 1);
                $r29.put("prettyName", $r392);
                C1858g.C1859a $r393 = new C1858g.C1859a("slaInHours", "INTEGER", false, 0, null, 1);
                $r29.put("slaInHours", $r393);
                C1858g.C1859a $r394 = new C1858g.C1859a("timeCreated", "TEXT", false, 0, null, 1);
                $r29.put("timeCreated", $r394);
                C1858g.C1859a $r395 = new C1858g.C1859a("timeUpdated", "TEXT", false, 0, null, 1);
                $r29.put("timeUpdated", $r395);
                C1858g.C1859a $r396 = new C1858g.C1859a("type", "TEXT", false, 0, null, 1);
                $r29.put("type", $r396);
                C1858g.C1859a $r397 = new C1858g.C1859a("body", "TEXT", false, 0, null, 1);
                $r29.put("body", $r397);
                C1858g.C1859a $r398 = new C1858g.C1859a("typeSlug", "TEXT", false, 0, null, 1);
                $r29.put("typeSlug", $r398);
                HashSet $r48 = new HashSet(0);
                HashSet $r58 = new HashSet(0);
                C1858g $r68 = new C1858g("issue_details", $r29, $r48, $r58);
                C1858g $r78 = C1858g.m34412a(interfaceC8093g, "issue_details");
                boolean $z08 = $r68.equals($r78);
                if (!$z08) {
                    String $r108 = "issue_details(ai.kudi.agent.core.domain.room_entities.CategoryData).\n Expected:\n" + $r68 + "\n Found:\n" + $r78;
                    C1812q0.C1814b $r88 = new C1812q0.C1814b(false, $r108);
                    return $r88;
                }
                HashMap $r210 = new HashMap(7);
                C1858g.C1859a $r399 = new C1858g.C1859a("api_bank_name", "TEXT", true, 0, null, 1);
                $r210.put("api_bank_name", $r399);
                C1858g.C1859a $r3100 = new C1858g.C1859a("bank_name", "TEXT", true, 0, null, 1);
                $r210.put("bank_name", $r3100);
                C1858g.C1859a $r3101 = new C1858g.C1859a("bank_code", "TEXT", true, 1, null, 1);
                $r210.put("bank_code", $r3101);
                C1858g.C1859a $r3102 = new C1858g.C1859a("enable", "INTEGER", true, 0, null, 1);
                $r210.put("enable", $r3102);
                C1858g.C1859a $r3103 = new C1858g.C1859a("processor", "TEXT", true, 0, null, 1);
                $r210.put("processor", $r3103);
                C1858g.C1859a $r3104 = new C1858g.C1859a("prompt", "TEXT", true, 0, null, 1);
                $r210.put("prompt", $r3104);
                C1858g.C1859a $r3105 = new C1858g.C1859a("ussd_code", "TEXT", true, 0, null, 1);
                $r210.put("ussd_code", $r3105);
                HashSet $r49 = new HashSet(0);
                HashSet $r59 = new HashSet(0);
                C1858g $r69 = new C1858g("ussd_withdrawal_provider", $r210, $r49, $r59);
                C1858g $r79 = C1858g.m34412a(interfaceC8093g, "ussd_withdrawal_provider");
                boolean $z09 = $r69.equals($r79);
                if (!$z09) {
                    String $r109 = "ussd_withdrawal_provider(ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider).\n Expected:\n" + $r69 + "\n Found:\n" + $r79;
                    C1812q0.C1814b $r89 = new C1812q0.C1814b(false, $r109);
                    return $r89;
                }
                HashMap $r211 = new HashMap(6);
                C1858g.C1859a $r3106 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r211.put("id", $r3106);
                C1858g.C1859a $r3107 = new C1858g.C1859a(KudiPin.KUDI_PIN_TITLE, "TEXT", true, 0, null, 1);
                $r211.put(KudiPin.KUDI_PIN_TITLE, $r3107);
                C1858g.C1859a $r3108 = new C1858g.C1859a(MetricTracker.Object.MESSAGE, "TEXT", true, 0, null, 1);
                $r211.put(MetricTracker.Object.MESSAGE, $r3108);
                C1858g.C1859a $r3109 = new C1858g.C1859a("type", "TEXT", true, 0, null, 1);
                $r211.put("type", $r3109);
                C1858g.C1859a $r3110 = new C1858g.C1859a("customerType", "TEXT", false, 0, null, 1);
                $r211.put("customerType", $r3110);
                C1858g.C1859a $r3111 = new C1858g.C1859a("preview", "TEXT", false, 0, null, 1);
                $r211.put("preview", $r3111);
                HashSet $r410 = new HashSet(0);
                HashSet $r510 = new HashSet(0);
                C1858g $r610 = new C1858g("announcements", $r211, $r410, $r510);
                C1858g $r710 = C1858g.m34412a(interfaceC8093g, "announcements");
                boolean $z010 = $r610.equals($r710);
                if (!$z010) {
                    String $r1010 = "announcements(ai.kudi.agent.core.domain.room_entities.AnnouncementEntity).\n Expected:\n" + $r610 + "\n Found:\n" + $r710;
                    C1812q0.C1814b $r810 = new C1812q0.C1814b(false, $r1010);
                    return $r810;
                }
                HashMap $r212 = new HashMap(2);
                C1858g.C1859a $r3112 = new C1858g.C1859a("name", "TEXT", true, 0, null, 1);
                $r212.put("name", $r3112);
                C1858g.C1859a $r3113 = new C1858g.C1859a("bankCode", "TEXT", true, 1, null, 1);
                $r212.put("bankCode", $r3113);
                HashSet $r411 = new HashSet(0);
                HashSet $r511 = new HashSet(0);
                C1858g $r611 = new C1858g("bank", $r212, $r411, $r511);
                C1858g $r711 = C1858g.m34412a(interfaceC8093g, "bank");
                boolean $z011 = $r611.equals($r711);
                if (!$z011) {
                    String $r1011 = "bank(ai.kudi.agent.core.domain.room_entities.Bank).\n Expected:\n" + $r611 + "\n Found:\n" + $r711;
                    C1812q0.C1814b $r811 = new C1812q0.C1814b(false, $r1011);
                    return $r811;
                }
                HashMap $r213 = new HashMap(7);
                C1858g.C1859a $r3114 = new C1858g.C1859a("contactPhoneNumber", "TEXT", false, 0, null, 1);
                $r213.put("contactPhoneNumber", $r3114);
                C1858g.C1859a $r3115 = new C1858g.C1859a("firstName", "TEXT", false, 0, null, 1);
                $r213.put("firstName", $r3115);
                C1858g.C1859a $r3116 = new C1858g.C1859a("lastName", "TEXT", false, 0, null, 1);
                $r213.put("lastName", $r3116);
                C1858g.C1859a $r3117 = new C1858g.C1859a("managerAccountPhone", "TEXT", false, 0, null, 1);
                $r213.put("managerAccountPhone", $r3117);
                C1858g.C1859a $r3118 = new C1858g.C1859a("managerId", "TEXT", true, 0, null, 1);
                $r213.put("managerId", $r3118);
                C1858g.C1859a $r3119 = new C1858g.C1859a("officialEmail", "TEXT", false, 0, null, 1);
                $r213.put("officialEmail", $r3119);
                C1858g.C1859a $r3120 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r213.put("id", $r3120);
                HashSet $r412 = new HashSet(0);
                HashSet $r512 = new HashSet(0);
                C1858g $r612 = new C1858g("relationship_manager", $r213, $r412, $r512);
                C1858g $r712 = C1858g.m34412a(interfaceC8093g, "relationship_manager");
                boolean $z012 = $r612.equals($r712);
                if (!$z012) {
                    String $r1012 = "relationship_manager(ai.kudi.agent.core.domain.room_entities.RelationshipManager).\n Expected:\n" + $r612 + "\n Found:\n" + $r712;
                    C1812q0.C1814b $r812 = new C1812q0.C1814b(false, $r1012);
                    return $r812;
                }
                HashMap $r214 = new HashMap(4);
                C1858g.C1859a $r3121 = new C1858g.C1859a("name", "TEXT", true, 0, null, 1);
                $r214.put("name", $r3121);
                C1858g.C1859a $r3122 = new C1858g.C1859a("id", "TEXT", true, 1, null, 1);
                $r214.put("id", $r3122);
                C1858g.C1859a $r3123 = new C1858g.C1859a("validLength", "INTEGER", true, 0, null, 1);
                $r214.put("validLength", $r3123);
                C1858g.C1859a $r3124 = new C1858g.C1859a("isAvailable", "INTEGER", true, 0, null, 1);
                $r214.put("isAvailable", $r3124);
                HashSet $r413 = new HashSet(0);
                HashSet $r513 = new HashSet(0);
                C1858g $r613 = new C1858g("idType", $r214, $r413, $r513);
                C1858g $r713 = C1858g.m34412a(interfaceC8093g, "idType");
                boolean $z013 = $r613.equals($r713);
                if (!$z013) {
                    String $r1013 = "idType(ai.kudi.agent.core.domain.room_entities.IdType).\n Expected:\n" + $r613 + "\n Found:\n" + $r713;
                    C1812q0.C1814b $r813 = new C1812q0.C1814b(false, $r1013);
                    return $r813;
                }
                HashMap $r215 = new HashMap(5);
                C1858g.C1859a $r3125 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r215.put("id", $r3125);
                C1858g.C1859a $r3126 = new C1858g.C1859a("type", "INTEGER", true, 0, null, 1);
                $r215.put("type", $r3126);
                C1858g.C1859a $r3127 = new C1858g.C1859a("cardNo", "TEXT", false, 0, null, 1);
                $r215.put("cardNo", $r3127);
                C1858g.C1859a $r3128 = new C1858g.C1859a("token", "TEXT", false, 0, null, 1);
                $r215.put("token", $r3128);
                C1858g.C1859a $r3129 = new C1858g.C1859a(TransactionField.AMOUNT, "INTEGER", false, 0, null, 1);
                $r215.put(TransactionField.AMOUNT, $r3129);
                HashSet $r414 = new HashSet(0);
                HashSet $r514 = new HashSet(0);
                C1858g $r614 = new C1858g("payment_method", $r215, $r414, $r514);
                C1858g $r714 = C1858g.m34412a(interfaceC8093g, "payment_method");
                boolean $z014 = $r614.equals($r714);
                if (!$z014) {
                    String $r1014 = "payment_method(ai.kudi.agent.payments.domain.dto.PaymentMethod).\n Expected:\n" + $r614 + "\n Found:\n" + $r714;
                    C1812q0.C1814b $r814 = new C1812q0.C1814b(false, $r1014);
                    return $r814;
                }
                HashMap $r216 = new HashMap(4);
                C1858g.C1859a $r3130 = new C1858g.C1859a("id", "INTEGER", false, 1, null, 1);
                $r216.put("id", $r3130);
                C1858g.C1859a $r3131 = new C1858g.C1859a("name", "TEXT", false, 0, null, 1);
                $r216.put("name", $r3131);
                C1858g.C1859a $r3132 = new C1858g.C1859a("nameSlugified", "TEXT", false, 0, null, 1);
                $r216.put("nameSlugified", $r3132);
                C1858g.C1859a $r3133 = new C1858g.C1859a(TransactionField.STATUS, "TEXT", true, 0, null, 1);
                $r216.put(TransactionField.STATUS, $r3133);
                HashSet $r415 = new HashSet(0);
                HashSet $r515 = new HashSet(1);
                String[] $r12 = {"id"};
                List $r13 = Arrays.asList($r12);
                C1858g.C1862d $r11 = new C1858g.C1862d("index_product_sectors_id", false, $r13);
                $r515.add($r11);
                C1858g $r615 = new C1858g("product_sectors", $r216, $r415, $r515);
                C1858g $r715 = C1858g.m34412a(interfaceC8093g, "product_sectors");
                boolean $z015 = $r615.equals($r715);
                if (!$z015) {
                    String $r1015 = "product_sectors(ai.kudi.agent.core.domain.room_entities.ProductSectorEntity).\n Expected:\n" + $r615 + "\n Found:\n" + $r715;
                    C1812q0.C1814b $r815 = new C1812q0.C1814b(false, $r1015);
                    return $r815;
                }
                HashMap $r217 = new HashMap(11);
                C1858g.C1859a $r3134 = new C1858g.C1859a("id", "TEXT", true, 1, null, 1);
                $r217.put("id", $r3134);
                C1858g.C1859a $r3135 = new C1858g.C1859a("transactionType", "TEXT", true, 0, null, 1);
                $r217.put("transactionType", $r3135);
                C1858g.C1859a $r3136 = new C1858g.C1859a("accountBalance", "TEXT", true, 0, null, 1);
                $r217.put("accountBalance", $r3136);
                C1858g.C1859a $r3137 = new C1858g.C1859a(TransactionField.AMOUNT, "TEXT", true, 0, null, 1);
                $r217.put(TransactionField.AMOUNT, $r3137);
                C1858g.C1859a $r3138 = new C1858g.C1859a("kind", "TEXT", false, 0, null, 1);
                $r217.put("kind", $r3138);
                C1858g.C1859a $r3139 = new C1858g.C1859a("customerPhone", "TEXT", true, 0, null, 1);
                $r217.put("customerPhone", $r3139);
                C1858g.C1859a $r3140 = new C1858g.C1859a("customerName", "TEXT", true, 0, null, 1);
                $r217.put("customerName", $r3140);
                C1858g.C1859a $r3141 = new C1858g.C1859a("customerPictureId", "TEXT", true, 0, null, 1);
                $r217.put("customerPictureId", $r3141);
                C1858g.C1859a $r3142 = new C1858g.C1859a(TransactionField.STATUS, "TEXT", true, 0, null, 1);
                $r217.put(TransactionField.STATUS, $r3142);
                C1858g.C1859a $r3143 = new C1858g.C1859a(AttributeType.DATE, "INTEGER", true, 0, null, 1);
                $r217.put(AttributeType.DATE, $r3143);
                C1858g.C1859a $r3144 = new C1858g.C1859a("userId", "TEXT", true, 0, null, 1);
                $r217.put("userId", $r3144);
                HashSet $r416 = new HashSet(0);
                HashSet $r516 = new HashSet(0);
                C1858g $r616 = new C1858g("transactions", $r217, $r416, $r516);
                C1858g $r716 = C1858g.m34412a(interfaceC8093g, "transactions");
                boolean $z016 = $r616.equals($r716);
                if (!$z016) {
                    String $r1016 = "transactions(ai.kudi.agent.core.domain.room_entities.TransactionDatabaseModel).\n Expected:\n" + $r616 + "\n Found:\n" + $r716;
                    C1812q0.C1814b $r816 = new C1812q0.C1814b(false, $r1016);
                    return $r816;
                }
                HashMap $r218 = new HashMap(4);
                C1858g.C1859a $r3145 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r218.put("id", $r3145);
                C1858g.C1859a $r3146 = new C1858g.C1859a("type", "TEXT", true, 0, null, 1);
                $r218.put("type", $r3146);
                C1858g.C1859a $r3147 = new C1858g.C1859a("value", "TEXT", true, 0, null, 1);
                $r218.put("value", $r3147);
                C1858g.C1859a $r3148 = new C1858g.C1859a("userId", "TEXT", true, 0, null, 1);
                $r218.put("userId", $r3148);
                HashSet $r417 = new HashSet(0);
                HashSet $r517 = new HashSet(0);
                C1858g $r617 = new C1858g("transactions_summary", $r218, $r417, $r517);
                C1858g $r717 = C1858g.m34412a(interfaceC8093g, "transactions_summary");
                boolean $z017 = $r617.equals($r717);
                if (!$z017) {
                    String $r1017 = "transactions_summary(ai.kudi.agent.core.domain.room_entities.TransactionSummaryDatabaseModel).\n Expected:\n" + $r617 + "\n Found:\n" + $r717;
                    C1812q0.C1814b $r817 = new C1812q0.C1814b(false, $r1017);
                    return $r817;
                }
                HashMap $r219 = new HashMap(4);
                C1858g.C1859a $r3149 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r219.put("id", $r3149);
                C1858g.C1859a $r3150 = new C1858g.C1859a("availableLoanAmount", "INTEGER", false, 0, null, 1);
                $r219.put("availableLoanAmount", $r3150);
                C1858g.C1859a $r3151 = new C1858g.C1859a("maxLoanAmount", "INTEGER", false, 0, null, 1);
                $r219.put("maxLoanAmount", $r3151);
                C1858g.C1859a $r3152 = new C1858g.C1859a("tenure", "INTEGER", false, 0, null, 1);
                $r219.put("tenure", $r3152);
                HashSet $r418 = new HashSet(0);
                HashSet $r518 = new HashSet(0);
                C1858g $r618 = new C1858g("mini_kshock_details", $r219, $r418, $r518);
                C1858g $r718 = C1858g.m34412a(interfaceC8093g, "mini_kshock_details");
                boolean $z018 = $r618.equals($r718);
                if (!$z018) {
                    String $r1018 = "mini_kshock_details(ai.kudi.agent.core.domain.room_entities.MiniKshockDetails).\n Expected:\n" + $r618 + "\n Found:\n" + $r718;
                    C1812q0.C1814b $r818 = new C1812q0.C1814b(false, $r1018);
                    return $r818;
                }
                HashMap $r220 = new HashMap(6);
                C1858g.C1859a $r3153 = new C1858g.C1859a("id", "INTEGER", true, 1, null, 1);
                $r220.put("id", $r3153);
                C1858g.C1859a $r3154 = new C1858g.C1859a("monthlyWithdrawalLimit", "INTEGER", false, 0, null, 1);
                $r220.put("monthlyWithdrawalLimit", $r3154);
                C1858g.C1859a $r3155 = new C1858g.C1859a("monthlyTransferLimit", "INTEGER", false, 0, null, 1);
                $r220.put("monthlyTransferLimit", $r3155);
                C1858g.C1859a $r3156 = new C1858g.C1859a("monthlyWalletTopUpLimit", "TEXT", false, 0, null, 1);
                $r220.put("monthlyWalletTopUpLimit", $r3156);
                C1858g.C1859a $r3157 = new C1858g.C1859a("kycLevel", "TEXT", true, 0, null, 1);
                $r220.put("kycLevel", $r3157);
                C1858g.C1859a $r3158 = new C1858g.C1859a("name", "TEXT", false, 0, null, 1);
                $r220.put("name", $r3158);
                HashSet $r419 = new HashSet(0);
                HashSet $r519 = new HashSet(0);
                C1858g $r619 = new C1858g("kyc_level_data", $r220, $r419, $r519);
                C1858g $r719 = C1858g.m34412a(interfaceC8093g, "kyc_level_data");
                boolean $z019 = $r619.equals($r719);
                if ($z019) {
                    C1812q0.C1814b $r819 = new C1812q0.C1814b(true, null);
                    return $r819;
                }
                String $r1019 = "kyc_level_data(ai.kudi.agent.core.domain.room_entities.KycLevelsModel).\n Expected:\n" + $r619 + "\n Found:\n" + $r719;
                C1812q0.C1814b $r820 = new C1812q0.C1814b(false, $r1019);
                return $r820;
            }
        }, "67c3f24c038d2895f8eed47c29e5aa6c", "48990baced3083601ea17283690eace6");
        Context $r4 = c1851z.f5606b;
        InterfaceC8094h.C8096b.C8097a $r5 = InterfaceC8094h.C8096b.m16760a($r4);
        String $r6 = c1851z.f5607c;
        $r5.m16757c($r6);
        $r5.m16758b($r2);
        InterfaceC8094h.C8096b $r7 = $r5.m16759a();
        InterfaceC8094h.InterfaceC8098c $r8 = c1851z.f5605a;
        InterfaceC8094h $r9 = $r8.mo16742a($r7);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public AccountDao getAccountDao() {
        AccountDao $r1;
        AccountDao $r12 = this._accountDao;
        if ($r12 != null) {
            AccountDao $r13 = this._accountDao;
            return $r13;
        }
        synchronized (this) {
            AccountDao $r14 = this._accountDao;
            if ($r14 == null) {
                AccountDao_Impl $r2 = new AccountDao_Impl(this);
                this._accountDao = $r2;
            }
            $r1 = this._accountDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public AgentCustomerDao getAgentCustomerDao() {
        AgentCustomerDao $r1;
        AgentCustomerDao $r12 = this._agentCustomerDao;
        if ($r12 != null) {
            AgentCustomerDao $r13 = this._agentCustomerDao;
            return $r13;
        }
        synchronized (this) {
            AgentCustomerDao $r14 = this._agentCustomerDao;
            if ($r14 == null) {
                AgentCustomerDao_Impl $r2 = new AgentCustomerDao_Impl(this);
                this._agentCustomerDao = $r2;
            }
            $r1 = this._agentCustomerDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    public List getAutoMigrations(Map map) {
        AbstractC1850b[] $r3 = new AbstractC1850b[0];
        List $r1 = Arrays.asList($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public BanksDao getBanksDao() {
        BanksDao $r1;
        BanksDao $r12 = this._banksDao;
        if ($r12 != null) {
            BanksDao $r13 = this._banksDao;
            return $r13;
        }
        synchronized (this) {
            BanksDao $r14 = this._banksDao;
            if ($r14 == null) {
                BanksDao_Impl $r2 = new BanksDao_Impl(this);
                this._banksDao = $r2;
            }
            $r1 = this._banksDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public IdTypeDao getIdTypeDao() {
        IdTypeDao $r1;
        IdTypeDao $r12 = this._idTypeDao;
        if ($r12 != null) {
            IdTypeDao $r13 = this._idTypeDao;
            return $r13;
        }
        synchronized (this) {
            IdTypeDao $r14 = this._idTypeDao;
            if ($r14 == null) {
                IdTypeDao_Impl $r2 = new IdTypeDao_Impl(this);
                this._idTypeDao = $r2;
            }
            $r1 = this._idTypeDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public IssueResolutionDao getIssueResolutionDao() {
        IssueResolutionDao $r1;
        IssueResolutionDao $r12 = this._issueResolutionDao;
        if ($r12 != null) {
            IssueResolutionDao $r13 = this._issueResolutionDao;
            return $r13;
        }
        synchronized (this) {
            IssueResolutionDao $r14 = this._issueResolutionDao;
            if ($r14 == null) {
                IssueResolutionDao_Impl $r2 = new IssueResolutionDao_Impl(this);
                this._issueResolutionDao = $r2;
            }
            $r1 = this._issueResolutionDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public KycLevelsDao getKycLevelsDao() {
        KycLevelsDao $r1;
        KycLevelsDao $r12 = this._kycLevelsDao;
        if ($r12 != null) {
            KycLevelsDao $r13 = this._kycLevelsDao;
            return $r13;
        }
        synchronized (this) {
            KycLevelsDao $r14 = this._kycLevelsDao;
            if ($r14 == null) {
                KycLevelsDao_Impl $r2 = new KycLevelsDao_Impl(this);
                this._kycLevelsDao = $r2;
            }
            $r1 = this._kycLevelsDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public MiniKshockDetailsDao getMiniKshockDetailsDao() {
        MiniKshockDetailsDao $r1;
        MiniKshockDetailsDao $r12 = this._miniKshockDetailsDao;
        if ($r12 != null) {
            MiniKshockDetailsDao $r13 = this._miniKshockDetailsDao;
            return $r13;
        }
        synchronized (this) {
            MiniKshockDetailsDao $r14 = this._miniKshockDetailsDao;
            if ($r14 == null) {
                MiniKshockDetailsDao_Impl $r2 = new MiniKshockDetailsDao_Impl(this);
                this._miniKshockDetailsDao = $r2;
            }
            $r1 = this._miniKshockDetailsDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public PaymentMethodDao getPaymentMethodDao() {
        PaymentMethodDao $r1;
        PaymentMethodDao $r12 = this._paymentMethodDao;
        if ($r12 != null) {
            PaymentMethodDao $r13 = this._paymentMethodDao;
            return $r13;
        }
        synchronized (this) {
            PaymentMethodDao $r14 = this._paymentMethodDao;
            if ($r14 == null) {
                PaymentMethodDao_Impl $r2 = new PaymentMethodDao_Impl(this);
                this._paymentMethodDao = $r2;
            }
            $r1 = this._paymentMethodDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public PinCredentialsDao getPinCredentialsDao() {
        PinCredentialsDao $r1;
        PinCredentialsDao $r12 = this._pinCredentialsDao;
        if ($r12 != null) {
            PinCredentialsDao $r13 = this._pinCredentialsDao;
            return $r13;
        }
        synchronized (this) {
            PinCredentialsDao $r14 = this._pinCredentialsDao;
            if ($r14 == null) {
                PinCredentialsDao_Impl $r2 = new PinCredentialsDao_Impl(this);
                this._pinCredentialsDao = $r2;
            }
            $r1 = this._pinCredentialsDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public ProductSectorDao getProductSectorDao() {
        ProductSectorDao $r1;
        ProductSectorDao $r12 = this._productSectorDao;
        if ($r12 != null) {
            ProductSectorDao $r13 = this._productSectorDao;
            return $r13;
        }
        synchronized (this) {
            ProductSectorDao $r14 = this._productSectorDao;
            if ($r14 == null) {
                ProductSectorDao_Impl $r2 = new ProductSectorDao_Impl(this);
                this._productSectorDao = $r2;
            }
            $r1 = this._productSectorDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public RelationshipManagerDao getRelationshipManagerDao() {
        RelationshipManagerDao $r1;
        RelationshipManagerDao $r12 = this._relationshipManagerDao;
        if ($r12 != null) {
            RelationshipManagerDao $r13 = this._relationshipManagerDao;
            return $r13;
        }
        synchronized (this) {
            RelationshipManagerDao $r14 = this._relationshipManagerDao;
            if ($r14 == null) {
                RelationshipManagerDao_Impl $r2 = new RelationshipManagerDao_Impl(this);
                this._relationshipManagerDao = $r2;
            }
            $r1 = this._relationshipManagerDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    public Set getRequiredAutoMigrationSpecs() {
        HashSet $r1 = new HashSet();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.room.AbstractC1802o0
    protected Map getRequiredTypeConverters() {
        HashMap $r1 = new HashMap();
        List $r2 = UserProfileDao_Impl.getRequiredConverters();
        $r1.put(UserProfileDao.class, $r2);
        List $r22 = AgentCustomerDao_Impl.getRequiredConverters();
        $r1.put(AgentCustomerDao.class, $r22);
        List $r23 = PinCredentialsDao_Impl.getRequiredConverters();
        $r1.put(PinCredentialsDao.class, $r23);
        List $r24 = AccountDao_Impl.getRequiredConverters();
        $r1.put(AccountDao.class, $r24);
        List $r25 = IssueResolutionDao_Impl.getRequiredConverters();
        $r1.put(IssueResolutionDao.class, $r25);
        List $r26 = BillerDao_Impl.getRequiredConverters();
        $r1.put(BillerDao.class, $r26);
        List $r27 = ProductDao_Impl.getRequiredConverters();
        $r1.put(ProductDao.class, $r27);
        List $r28 = AnnouncementsDao_Impl.getRequiredConverters();
        $r1.put(AnnouncementsDao.class, $r28);
        List $r29 = UssdWithdrawalProviderDao_Impl.getRequiredConverters();
        $r1.put(UssdWithdrawalProviderDao.class, $r29);
        List $r210 = BanksDao_Impl.getRequiredConverters();
        $r1.put(BanksDao.class, $r210);
        List $r211 = RelationshipManagerDao_Impl.getRequiredConverters();
        $r1.put(RelationshipManagerDao.class, $r211);
        List $r212 = IdTypeDao_Impl.getRequiredConverters();
        $r1.put(IdTypeDao.class, $r212);
        List $r213 = PaymentMethodDao_Impl.getRequiredConverters();
        $r1.put(PaymentMethodDao.class, $r213);
        List $r214 = TransactionsDao_Impl.getRequiredConverters();
        $r1.put(TransactionsDao.class, $r214);
        List $r215 = TransactionsSummaryDao_Impl.getRequiredConverters();
        $r1.put(TransactionsSummaryDao.class, $r215);
        List $r216 = ProductSectorDao_Impl.getRequiredConverters();
        $r1.put(ProductSectorDao.class, $r216);
        List $r217 = KycLevelsDao_Impl.getRequiredConverters();
        $r1.put(KycLevelsDao.class, $r217);
        List $r218 = MiniKshockDetailsDao_Impl.getRequiredConverters();
        $r1.put(MiniKshockDetailsDao.class, $r218);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public TransactionsDao getTransactionsDao() {
        TransactionsDao $r1;
        TransactionsDao $r12 = this._transactionsDao;
        if ($r12 != null) {
            TransactionsDao $r13 = this._transactionsDao;
            return $r13;
        }
        synchronized (this) {
            TransactionsDao $r14 = this._transactionsDao;
            if ($r14 == null) {
                TransactionsDao_Impl $r2 = new TransactionsDao_Impl(this);
                this._transactionsDao = $r2;
            }
            $r1 = this._transactionsDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public TransactionsSummaryDao getTransactionsSummaryDao() {
        TransactionsSummaryDao $r1;
        TransactionsSummaryDao $r12 = this._transactionsSummaryDao;
        if ($r12 != null) {
            TransactionsSummaryDao $r13 = this._transactionsSummaryDao;
            return $r13;
        }
        synchronized (this) {
            TransactionsSummaryDao $r14 = this._transactionsSummaryDao;
            if ($r14 == null) {
                TransactionsSummaryDao_Impl $r2 = new TransactionsSummaryDao_Impl(this);
                this._transactionsSummaryDao = $r2;
            }
            $r1 = this._transactionsSummaryDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public UserProfileDao getUserProfileDao() {
        UserProfileDao $r1;
        UserProfileDao $r12 = this._userProfileDao;
        if ($r12 != null) {
            UserProfileDao $r13 = this._userProfileDao;
            return $r13;
        }
        synchronized (this) {
            UserProfileDao $r14 = this._userProfileDao;
            if ($r14 == null) {
                UserProfileDao_Impl $r2 = new UserProfileDao_Impl(this);
                this._userProfileDao = $r2;
            }
            $r1 = this._userProfileDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public UssdWithdrawalProviderDao getUssdWithdrawalProviderDao() {
        UssdWithdrawalProviderDao $r1;
        UssdWithdrawalProviderDao $r12 = this._ussdWithdrawalProviderDao;
        if ($r12 != null) {
            UssdWithdrawalProviderDao $r13 = this._ussdWithdrawalProviderDao;
            return $r13;
        }
        synchronized (this) {
            UssdWithdrawalProviderDao $r14 = this._ussdWithdrawalProviderDao;
            if ($r14 == null) {
                UssdWithdrawalProviderDao_Impl $r2 = new UssdWithdrawalProviderDao_Impl(this);
                this._ussdWithdrawalProviderDao = $r2;
            }
            $r1 = this._ussdWithdrawalProviderDao;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.CoreAppDatabase
    public ProductDao productDao() {
        ProductDao $r1;
        ProductDao $r12 = this._productDao;
        if ($r12 != null) {
            ProductDao $r13 = this._productDao;
            return $r13;
        }
        synchronized (this) {
            ProductDao $r14 = this._productDao;
            if ($r14 == null) {
                ProductDao_Impl $r2 = new ProductDao_Impl(this);
                this._productDao = $r2;
            }
            $r1 = this._productDao;
        }
        return $r1;
    }
}
