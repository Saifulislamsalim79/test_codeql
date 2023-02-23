package ai.kudi.agent.core.domain.p004db.migrations;

import androidx.room.p062y0.AbstractC1850b;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p262t.p263a.InterfaceC8093g;
/* compiled from: RoomMigration.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0003\"\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0003\"\u0011\u0010 \u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0003\"\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0003\"\u0011\u0010$\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0003\"\u0011\u0010&\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0003\"\u0011\u0010(\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0003\"\u0011\u0010*\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0003\"\u0011\u0010,\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0003\"\u0011\u0010.\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0003¨\u00060"}, m10421d2 = {"MIGRATION_10_11", "Landroidx/room/migration/Migration;", "getMIGRATION_10_11", "()Landroidx/room/migration/Migration;", "MIGRATION_11_12", "getMIGRATION_11_12", "MIGRATION_12_13", "getMIGRATION_12_13", "MIGRATION_13_14", "getMIGRATION_13_14", "MIGRATION_14_15", "getMIGRATION_14_15", "MIGRATION_15_16", "getMIGRATION_15_16", "MIGRATION_16_17", "getMIGRATION_16_17", "MIGRATION_17_18", "getMIGRATION_17_18", "MIGRATION_18_19", "getMIGRATION_18_19", "MIGRATION_19_20", "getMIGRATION_19_20", "MIGRATION_1_2", "getMIGRATION_1_2", "MIGRATION_20_21", "getMIGRATION_20_21", "MIGRATION_21_22", "getMIGRATION_21_22", "MIGRATION_22_23", "getMIGRATION_22_23", "MIGRATION_23_24", "getMIGRATION_23_24", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "MIGRATION_4_5", "getMIGRATION_4_5", "MIGRATION_5_6", "getMIGRATION_5_6", "MIGRATION_6_7", "getMIGRATION_6_7", "MIGRATION_7_8", "getMIGRATION_7_8", "MIGRATION_8_9", "getMIGRATION_8_9", "MIGRATION_9_10", "getMIGRATION_9_10", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt */
/* loaded from: classes.dex */
public final class RoomMigrationKt {
    private static final AbstractC1850b MIGRATION_1_2 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_1_2$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "db");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `Biller` (`lookupId` TEXT NOT NULL, `name` TEXT NOT NULL, `namePrompt` TEXT NOT NULL, `image` TEXT NOT NULL, `header` TEXT NOT NULL, `availability` INTEGER NOT NULL, `usageFrequency` INTEGER NOT NULL, PRIMARY KEY(`lookupId`))");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `Product` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `amount` INTEGER, `type` TEXT NOT NULL, `types` TEXT NOT NULL, `requiresPhone` INTEGER NOT NULL, `billerId` TEXT, `localId` TEXT NOT NULL, `availability` INTEGER NOT NULL, PRIMARY KEY(`localId`, `type`))");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `insurance_status` (`id` TEXT NOT NULL, `status` TEXT NOT NULL, `phoneNumber` TEXT NOT NULL, PRIMARY KEY(`phoneNumber`))");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `issue_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `category` TEXT NOT NULL, `categoryName` TEXT NOT NULL, `hasChildren` INTEGER NOT NULL, `index` INTEGER NOT NULL, `parentIndex` INTEGER NOT NULL, `transactionCentric` INTEGER NOT NULL, `transactionTypeKey` TEXT)");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `issue_details` (`description` TEXT, `globalIndex` INTEGER, `id` TEXT NOT NULL, `index` INTEGER, `label` TEXT, `prettyName` TEXT, `slaInHours` INTEGER, `timeCreated` TEXT, `timeUpdated` TEXT, `type` TEXT, `body` TEXT, `typeSlug` TEXT, PRIMARY KEY(`id`))");
        }
    };
    private static final AbstractC1850b MIGRATION_2_3 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_2_3$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `ussd_withdrawal_provider`(`api_bank_name` TEXT NOT NULL, `bank_name` TEXT NOT NULL,`bank_code` TEXT NOT NULL PRIMARY KEY,`enable` INTEGER NOT NULL,`processor` TEXT NOT NULL,`prompt` TEXT NOT NULL,`ussd_code` TEXT NOT NULL)");
            interfaceC8093g.execSQL("ALTER TABLE `account_details` ADD COLUMN `accountPurpose` TEXT NOT NULL DEFAULT 'CASH_OUT'");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `account_details_temp` (`accountName` TEXT NOT NULL, `accountNumber` TEXT NOT NULL, `bankName` TEXT NOT NULL, `bankCode` TEXT NOT NULL, `dateAdded` TEXT NOT NULL, `agentId` TEXT NOT NULL, `accountPurpose` TEXT NOT NULL, PRIMARY KEY(accountNumber,accountPurpose,agentId))");
            interfaceC8093g.execSQL("INSERT OR IGNORE INTO account_details_temp(accountName,accountNumber,bankName,bankCode,dateAdded,agentId,accountPurpose) SELECT accountName,accountNumber,bankName,bankCode,dateAdded,agentId,accountPurpose FROM account_details");
            interfaceC8093g.execSQL("DROP TABLE account_details");
            interfaceC8093g.execSQL("ALTER TABLE account_details_temp RENAME TO account_details");
        }
    };
    private static final AbstractC1850b MIGRATION_3_4 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_3_4$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `issue_data_temp` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `category` TEXT, `categoryName` TEXT, `hasChildren` INTEGER, `index` INTEGER NOT NULL, `parentIndex` INTEGER NOT NULL, `transactionCentric` INTEGER NOT NULL, `transactionTypeKey` TEXT)");
            interfaceC8093g.execSQL("INSERT OR REPLACE INTO issue_data_temp (id,category,categoryName,hasChildren,`index`,parentIndex,transactionCentric,transactionTypeKey) SELECT id,category,categoryName,hasChildren,`index`,parentIndex,transactionCentric,transactionTypeKey FROM issue_data");
            interfaceC8093g.execSQL("DROP TABLE issue_data");
            interfaceC8093g.execSQL("ALTER TABLE issue_data_temp RENAME TO issue_data");
        }
    };
    private static final AbstractC1850b MIGRATION_4_5 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_4_5$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN secondaryPhoneNumber TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_5_6 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_5_6$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `announcements` (\n`id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n`title` TEXT NOT NULL, \n`message` TEXT NOT NULL,\n`type` TEXT NOT NULL\n )");
        }
    };
    private static final AbstractC1850b MIGRATION_6_7 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_6_7$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `bank` (`name` TEXT NOT NULL, `bankCode` TEXT NOT NULL, PRIMARY KEY(`bankCode`))");
        }
    };
    private static final AbstractC1850b MIGRATION_7_8 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_7_8$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN managerId TEXT");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `relationship_manager` (`contactPhoneNumber` TEXT, `firstName` TEXT, `lastName` TEXT, `managerAccountPhone` TEXT, `managerId` TEXT NOT NULL, `officialEmail` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    };
    private static final AbstractC1850b MIGRATION_8_9 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_8_9$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `idType` (`name` TEXT NOT NULL, `id` TEXT NOT NULL, `validLength` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        }
    };
    private static final AbstractC1850b MIGRATION_9_10 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_9_10$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE idType ADD COLUMN `isAvailable` INTEGER DEFAULT 0 NOT NULL");
        }
    };
    private static final AbstractC1850b MIGRATION_10_11 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_10_11$1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Incorrect condition in loop: B:4:0x0085 */
        @Override // androidx.room.p062y0.AbstractC1850b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void migrate(p201g.p262t.p263a.InterfaceC8093g r11) {
            /*
                r10 = this;
                java.lang.String r0 = "database"
                kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
                r2 = 20
                java.lang.String[] r1 = new java.lang.String[r2]
                r2 = 0
                java.lang.String r0 = "sessionId"
                r1[r2] = r0
                r2 = 1
                java.lang.String r0 = "userName"
                r1[r2] = r0
                r2 = 2
                java.lang.String r0 = "picsUrl"
                r1[r2] = r0
                r2 = 3
                java.lang.String r0 = "cacDocumentId"
                r1[r2] = r0
                r2 = 4
                java.lang.String r0 = "utilityBillImageId"
                r1[r2] = r0
                r2 = 5
                java.lang.String r0 = "city"
                r1[r2] = r0
                r2 = 6
                java.lang.String r0 = "agentKyc"
                r1[r2] = r0
                r2 = 7
                java.lang.String r0 = "bank"
                r1[r2] = r0
                r2 = 8
                java.lang.String r0 = "accountName"
                r1[r2] = r0
                r2 = 9
                java.lang.String r0 = "accountNumber"
                r1[r2] = r0
                r2 = 10
                java.lang.String r0 = "personalBusinessAddress"
                r1[r2] = r0
                r2 = 11
                java.lang.String r0 = "cacRegistrationNo"
                r1[r2] = r0
                r2 = 12
                java.lang.String r0 = "terminalId"
                r1[r2] = r0
                r2 = 13
                java.lang.String r0 = "mposVendor"
                r1[r2] = r0
                r2 = 14
                java.lang.String r0 = "serialNumber"
                r1[r2] = r0
                r2 = 15
                java.lang.String r0 = "posDeviceName"
                r1[r2] = r0
                r2 = 16
                java.lang.String r0 = "timeCreated"
                r1[r2] = r0
                r2 = 17
                java.lang.String r0 = "sourceId"
                r1[r2] = r0
                r2 = 18
                java.lang.String r0 = "fcmToken"
                r1[r2] = r0
                r2 = 19
                java.lang.String r0 = "identificationCardImageId"
                r1[r2] = r0
                java.util.List r3 = kotlin.p557z.C13722p.m3935h(r1)
                java.util.Iterator r4 = r3.iterator()
            L81:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto La9
                java.lang.Object r6 = r4.next()
                r8 = r6
                java.lang.String r8 = (java.lang.String) r8
                r7 = r8
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "ALTER TABLE user_profile ADD COLUMN "
                r9.append(r0)
                r9.append(r7)
                java.lang.String r0 = " TEXT"
                r9.append(r0)
                java.lang.String r7 = r9.toString()
                r11.execSQL(r7)
                goto L81
            La9:
                java.lang.String r0 = "ALTER TABLE user_profile ADD COLUMN isActive INTEGER DEFAULT 1 NOT NULL"
                r11.execSQL(r0)
                java.lang.String r0 = "ALTER TABLE user_profile ADD COLUMN isLoggedIn INTEGER DEFAULT 0 NOT NULL"
                r11.execSQL(r0)
                java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `payment_method` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `cardNo` TEXT, `token` TEXT, `amount` INTEGER, PRIMARY KEY(`id`))"
                r11.execSQL(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.migrations.RoomMigrationKt$MIGRATION_10_11$1.migrate(g.t.a.g):void");
        }
    };
    private static final AbstractC1850b MIGRATION_11_12 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_11_12$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN area TEXT");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN uplinePhoneNumber TEXT");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (\n`id` TEXT NOT NULL PRIMARY KEY,\n`transactionType` TEXT NOT NULL,\n`accountBalance` TEXT NOT NULL, \n`amount` TEXT NOT NULL, \n`kind` TEXT, \n`customerPhone` TEXT NOT NULL, \n`customerName` TEXT NOT NULL, \n`customerPictureId` TEXT NOT NULL,\n`status` TEXT NOT NULL,\n`date` INTEGER NOT NULL,\n`userId` TEXT NOT NULL\n )");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `transactions_summary` (\n`id` INTEGER NOT NULL PRIMARY KEY,\n`type` TEXT NOT NULL, \n`value` TEXT NOT NULL,\n`userId` TEXT NOT NULL\n )");
        }
    };
    private static final AbstractC1850b MIGRATION_12_13 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_12_13$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("DROP TABLE insurance_status");
        }
    };
    private static final AbstractC1850b MIGRATION_13_14 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_13_14$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `product_sectors` (`id` INTEGER, `name` TEXT, `nameSlugified` TEXT, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
            interfaceC8093g.execSQL("CREATE INDEX index_product_sectors_id ON product_sectors (id)");
        }
    };
    private static final AbstractC1850b MIGRATION_14_15 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_14_15$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN closestLandmark TEXT");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN homeAddress TEXT");
            interfaceC8093g.execSQL("ALTER TABLE announcements ADD COLUMN customerType TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_15_16 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_15_16$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN identityNumberType TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_16_17 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_16_17$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `mini_kshock_details` (`id` INTEGER NOT NULL, `availableLoanAmount` INTEGER, `maxLoanAmount` INTEGER, `tenure` INTEGER, PRIMARY KEY(`id`))");
        }
    };
    private static final AbstractC1850b MIGRATION_17_18 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_17_18$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE announcements ADD COLUMN preview TEXT");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `kyc_level_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dailyTopUpLimit` INTEGER NOT NULL, `dailyTransferLimit` INTEGER NOT NULL, `dailyWalletTopUpLimit` INTEGER NOT NULL, `kycLevel` TEXT NOT NULL, `cashOutAcctNosCount` INTEGER NOT NULL, `name` TEXT NOT NULL)");
        }
    };
    private static final AbstractC1850b MIGRATION_18_19 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_18_19$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE biller ADD COLUMN promptType TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_19_20 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_19_20$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("CREATE TABLE IF NOT EXISTS `kyc_level_data_bk` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `monthlyWithdrawalLimit` INTEGER, `monthlyTransferLimit` INTEGER, `monthlyWalletTopUpLimit` TEXT, `kycLevel` TEXT NOT NULL, `name` TEXT)");
            interfaceC8093g.execSQL("INSERT OR IGNORE INTO kyc_level_data_bk(id,monthlyWithdrawalLimit,monthlyTransferLimit,monthlyWalletTopUpLimit,kycLevel,name) SELECT id,dailyTopUpLimit,dailyTransferLimit,dailyWalletTopUpLimit,kycLevel,name FROM kyc_level_data");
            interfaceC8093g.execSQL("DROP TABLE kyc_level_data");
            interfaceC8093g.execSQL("ALTER TABLE kyc_level_data_bk RENAME TO kyc_level_data");
        }
    };
    private static final AbstractC1850b MIGRATION_20_21 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_20_21$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN primaryBusinessCategory TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_21_22 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_21_22$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE biller ADD COLUMN shouldUseProductForLookUp INTEGER DEFAULT 0 NOT NULL");
        }
    };
    private static final AbstractC1850b MIGRATION_22_23 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_22_23$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN customerType TEXT");
        }
    };
    private static final AbstractC1850b MIGRATION_23_24 = new AbstractC1850b() { // from class: ai.kudi.agent.core.domain.db.migrations.RoomMigrationKt$MIGRATION_23_24$1
        @Override // androidx.room.p062y0.AbstractC1850b
        public void migrate(InterfaceC8093g interfaceC8093g) {
            Log_OC.getArray(interfaceC8093g, "database");
            interfaceC8093g.execSQL("ALTER TABLE user_profile ADD COLUMN savingsCategory TEXT");
        }
    };

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_10_11() {
        AbstractC1850b r0 = MIGRATION_10_11;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_11_12() {
        AbstractC1850b r0 = MIGRATION_11_12;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_12_13() {
        AbstractC1850b r0 = MIGRATION_12_13;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_13_14() {
        AbstractC1850b r0 = MIGRATION_13_14;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_14_15() {
        AbstractC1850b r0 = MIGRATION_14_15;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_15_16() {
        AbstractC1850b r0 = MIGRATION_15_16;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_16_17() {
        AbstractC1850b r0 = MIGRATION_16_17;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_17_18() {
        AbstractC1850b r0 = MIGRATION_17_18;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_18_19() {
        AbstractC1850b r0 = MIGRATION_18_19;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_19_20() {
        AbstractC1850b r0 = MIGRATION_19_20;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_1_2() {
        AbstractC1850b r0 = MIGRATION_1_2;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_20_21() {
        AbstractC1850b r0 = MIGRATION_20_21;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_21_22() {
        AbstractC1850b r0 = MIGRATION_21_22;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_22_23() {
        AbstractC1850b r0 = MIGRATION_22_23;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_23_24() {
        AbstractC1850b r0 = MIGRATION_23_24;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_2_3() {
        AbstractC1850b r0 = MIGRATION_2_3;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_3_4() {
        AbstractC1850b r0 = MIGRATION_3_4;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_4_5() {
        AbstractC1850b r0 = MIGRATION_4_5;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_5_6() {
        AbstractC1850b r0 = MIGRATION_5_6;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_6_7() {
        AbstractC1850b r0 = MIGRATION_6_7;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_7_8() {
        AbstractC1850b r0 = MIGRATION_7_8;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_8_9() {
        AbstractC1850b r0 = MIGRATION_8_9;
        return r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final AbstractC1850b getMIGRATION_9_10() {
        AbstractC1850b r0 = MIGRATION_9_10;
        return r0;
    }
}
