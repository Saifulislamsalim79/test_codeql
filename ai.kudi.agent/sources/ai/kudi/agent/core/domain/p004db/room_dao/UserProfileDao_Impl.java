package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.UserProfile;
import androidx.room.AbstractC1761b0;
import androidx.room.AbstractC1763c0;
import androidx.room.AbstractC1802o0;
import androidx.room.C1816r0;
import androidx.room.C1823t0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p201g.p262t.p263a.InterfaceC8101k;
import p425j.p444e.AbstractC11696w;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao_Impl */
/* loaded from: classes.dex */
public final class UserProfileDao_Impl implements UserProfileDao {
    private final AbstractC1802o0 __db;
    private final AbstractC1761b0<UserProfile> __deletionAdapterOfUserProfile;
    private final AbstractC1763c0<UserProfile> __insertionAdapterOfUserProfile;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UserProfileDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
        this.__insertionAdapterOfUserProfile = new AbstractC1763c0<UserProfile>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, UserProfile userProfile) {
                String $r3 = userProfile.getUserId();
                if ($r3 == null) {
                    interfaceC8101k.bindNull(1);
                } else {
                    String $r32 = userProfile.getUserId();
                    interfaceC8101k.bindString(1, $r32);
                }
                String $r33 = userProfile.getProfileImage();
                if ($r33 == null) {
                    interfaceC8101k.bindNull(2);
                } else {
                    String $r34 = userProfile.getProfileImage();
                    interfaceC8101k.bindString(2, $r34);
                }
                String $r35 = userProfile.getPhoneNumber();
                if ($r35 == null) {
                    interfaceC8101k.bindNull(3);
                } else {
                    String $r36 = userProfile.getPhoneNumber();
                    interfaceC8101k.bindString(3, $r36);
                }
                String $r37 = userProfile.getKycLevel();
                if ($r37 == null) {
                    interfaceC8101k.bindNull(4);
                } else {
                    String $r38 = userProfile.getKycLevel();
                    interfaceC8101k.bindString(4, $r38);
                }
                long $l0 = userProfile.getBvnIsVerified() ? 1L : 0L;
                interfaceC8101k.bindLong(5, $l0);
                String $r39 = userProfile.getEmail();
                if ($r39 == null) {
                    interfaceC8101k.bindNull(6);
                } else {
                    String $r310 = userProfile.getEmail();
                    interfaceC8101k.bindString(6, $r310);
                }
                String $r311 = userProfile.getDob();
                if ($r311 == null) {
                    interfaceC8101k.bindNull(7);
                } else {
                    String $r312 = userProfile.getDob();
                    interfaceC8101k.bindString(7, $r312);
                }
                String $r313 = userProfile.getGender();
                if ($r313 == null) {
                    interfaceC8101k.bindNull(8);
                } else {
                    String $r314 = userProfile.getGender();
                    interfaceC8101k.bindString(8, $r314);
                }
                String $r315 = userProfile.getBusinessName();
                if ($r315 == null) {
                    interfaceC8101k.bindNull(9);
                } else {
                    String $r316 = userProfile.getBusinessName();
                    interfaceC8101k.bindString(9, $r316);
                }
                String $r317 = userProfile.getAddress();
                if ($r317 == null) {
                    interfaceC8101k.bindNull(10);
                } else {
                    String $r318 = userProfile.getAddress();
                    interfaceC8101k.bindString(10, $r318);
                }
                String $r319 = userProfile.getState();
                if ($r319 == null) {
                    interfaceC8101k.bindNull(11);
                } else {
                    String $r320 = userProfile.getState();
                    interfaceC8101k.bindString(11, $r320);
                }
                String $r321 = userProfile.getLga();
                if ($r321 == null) {
                    interfaceC8101k.bindNull(12);
                } else {
                    String $r322 = userProfile.getLga();
                    interfaceC8101k.bindString(12, $r322);
                }
                String $r323 = userProfile.getFirstName();
                if ($r323 == null) {
                    interfaceC8101k.bindNull(13);
                } else {
                    String $r324 = userProfile.getFirstName();
                    interfaceC8101k.bindString(13, $r324);
                }
                String $r325 = userProfile.getLastName();
                if ($r325 == null) {
                    interfaceC8101k.bindNull(14);
                } else {
                    String $r326 = userProfile.getLastName();
                    interfaceC8101k.bindString(14, $r326);
                }
                String $r327 = userProfile.getBusinessAddress();
                if ($r327 == null) {
                    interfaceC8101k.bindNull(15);
                } else {
                    String $r328 = userProfile.getBusinessAddress();
                    interfaceC8101k.bindString(15, $r328);
                }
                String $r329 = userProfile.getBvn();
                if ($r329 == null) {
                    interfaceC8101k.bindNull(16);
                } else {
                    String $r330 = userProfile.getBvn();
                    interfaceC8101k.bindString(16, $r330);
                }
                String $r331 = userProfile.getSecondaryPhoneNumber();
                if ($r331 == null) {
                    interfaceC8101k.bindNull(17);
                } else {
                    String $r332 = userProfile.getSecondaryPhoneNumber();
                    interfaceC8101k.bindString(17, $r332);
                }
                String $r333 = userProfile.getManagerId();
                if ($r333 == null) {
                    interfaceC8101k.bindNull(18);
                } else {
                    String $r334 = userProfile.getManagerId();
                    interfaceC8101k.bindString(18, $r334);
                }
                String $r335 = userProfile.getSessionId();
                if ($r335 == null) {
                    interfaceC8101k.bindNull(19);
                } else {
                    String $r336 = userProfile.getSessionId();
                    interfaceC8101k.bindString(19, $r336);
                }
                String $r337 = userProfile.getUserName();
                if ($r337 == null) {
                    interfaceC8101k.bindNull(20);
                } else {
                    String $r338 = userProfile.getUserName();
                    interfaceC8101k.bindString(20, $r338);
                }
                String $r339 = userProfile.getPicsUrl();
                if ($r339 == null) {
                    interfaceC8101k.bindNull(21);
                } else {
                    String $r340 = userProfile.getPicsUrl();
                    interfaceC8101k.bindString(21, $r340);
                }
                boolean $z0 = userProfile.isActive();
                long $l02 = $z0 ? 1L : 0L;
                interfaceC8101k.bindLong(22, $l02);
                boolean $z02 = userProfile.isLoggedIn();
                long $l03 = $z02 ? 1L : 0L;
                interfaceC8101k.bindLong(23, $l03);
                String $r341 = userProfile.getCacDocumentId();
                if ($r341 == null) {
                    interfaceC8101k.bindNull(24);
                } else {
                    String $r342 = userProfile.getCacDocumentId();
                    interfaceC8101k.bindString(24, $r342);
                }
                String $r343 = userProfile.getUtilityBillImageId();
                if ($r343 == null) {
                    interfaceC8101k.bindNull(25);
                } else {
                    String $r344 = userProfile.getUtilityBillImageId();
                    interfaceC8101k.bindString(25, $r344);
                }
                String $r345 = userProfile.getCity();
                if ($r345 == null) {
                    interfaceC8101k.bindNull(26);
                } else {
                    String $r346 = userProfile.getCity();
                    interfaceC8101k.bindString(26, $r346);
                }
                String $r347 = userProfile.getAgentKyc();
                if ($r347 == null) {
                    interfaceC8101k.bindNull(27);
                } else {
                    String $r348 = userProfile.getAgentKyc();
                    interfaceC8101k.bindString(27, $r348);
                }
                String $r349 = userProfile.getBank();
                if ($r349 == null) {
                    interfaceC8101k.bindNull(28);
                } else {
                    String $r350 = userProfile.getBank();
                    interfaceC8101k.bindString(28, $r350);
                }
                String $r351 = userProfile.getAccountName();
                if ($r351 == null) {
                    interfaceC8101k.bindNull(29);
                } else {
                    String $r352 = userProfile.getAccountName();
                    interfaceC8101k.bindString(29, $r352);
                }
                String $r353 = userProfile.getAccountNumber();
                if ($r353 == null) {
                    interfaceC8101k.bindNull(30);
                } else {
                    String $r354 = userProfile.getAccountNumber();
                    interfaceC8101k.bindString(30, $r354);
                }
                String $r355 = userProfile.getPersonalBusinessAddress();
                if ($r355 == null) {
                    interfaceC8101k.bindNull(31);
                } else {
                    String $r356 = userProfile.getPersonalBusinessAddress();
                    interfaceC8101k.bindString(31, $r356);
                }
                String $r357 = userProfile.getHomeAddress();
                if ($r357 == null) {
                    interfaceC8101k.bindNull(32);
                } else {
                    String $r358 = userProfile.getHomeAddress();
                    interfaceC8101k.bindString(32, $r358);
                }
                String $r359 = userProfile.getClosestLandmark();
                if ($r359 == null) {
                    interfaceC8101k.bindNull(33);
                } else {
                    String $r360 = userProfile.getClosestLandmark();
                    interfaceC8101k.bindString(33, $r360);
                }
                String $r361 = userProfile.getIdentityNumberType();
                if ($r361 == null) {
                    interfaceC8101k.bindNull(34);
                } else {
                    String $r362 = userProfile.getIdentityNumberType();
                    interfaceC8101k.bindString(34, $r362);
                }
                String $r363 = userProfile.getCacRegistrationNo();
                if ($r363 == null) {
                    interfaceC8101k.bindNull(35);
                } else {
                    String $r364 = userProfile.getCacRegistrationNo();
                    interfaceC8101k.bindString(35, $r364);
                }
                String $r365 = userProfile.getTerminalId();
                if ($r365 == null) {
                    interfaceC8101k.bindNull(36);
                } else {
                    String $r366 = userProfile.getTerminalId();
                    interfaceC8101k.bindString(36, $r366);
                }
                String $r367 = userProfile.getMposVendor();
                if ($r367 == null) {
                    interfaceC8101k.bindNull(37);
                } else {
                    String $r368 = userProfile.getMposVendor();
                    interfaceC8101k.bindString(37, $r368);
                }
                String $r369 = userProfile.getSerialNumber();
                if ($r369 == null) {
                    interfaceC8101k.bindNull(38);
                } else {
                    String $r370 = userProfile.getSerialNumber();
                    interfaceC8101k.bindString(38, $r370);
                }
                String $r371 = userProfile.getPosDeviceName();
                if ($r371 == null) {
                    interfaceC8101k.bindNull(39);
                } else {
                    String $r372 = userProfile.getPosDeviceName();
                    interfaceC8101k.bindString(39, $r372);
                }
                String $r373 = userProfile.getTimeCreated();
                if ($r373 == null) {
                    interfaceC8101k.bindNull(40);
                } else {
                    String $r374 = userProfile.getTimeCreated();
                    interfaceC8101k.bindString(40, $r374);
                }
                String $r375 = userProfile.getSourceId();
                if ($r375 == null) {
                    interfaceC8101k.bindNull(41);
                } else {
                    String $r376 = userProfile.getSourceId();
                    interfaceC8101k.bindString(41, $r376);
                }
                String $r377 = userProfile.getFcmToken();
                if ($r377 == null) {
                    interfaceC8101k.bindNull(42);
                } else {
                    String $r378 = userProfile.getFcmToken();
                    interfaceC8101k.bindString(42, $r378);
                }
                String $r379 = userProfile.getIdentificationCardImageId();
                if ($r379 == null) {
                    interfaceC8101k.bindNull(43);
                } else {
                    String $r380 = userProfile.getIdentificationCardImageId();
                    interfaceC8101k.bindString(43, $r380);
                }
                String $r381 = userProfile.getUplinePhoneNumber();
                if ($r381 == null) {
                    interfaceC8101k.bindNull(44);
                } else {
                    String $r382 = userProfile.getUplinePhoneNumber();
                    interfaceC8101k.bindString(44, $r382);
                }
                String $r383 = userProfile.getArea();
                if ($r383 == null) {
                    interfaceC8101k.bindNull(45);
                } else {
                    String $r384 = userProfile.getArea();
                    interfaceC8101k.bindString(45, $r384);
                }
                String $r385 = userProfile.getPrimaryBusinessCategory();
                if ($r385 == null) {
                    interfaceC8101k.bindNull(46);
                } else {
                    String $r386 = userProfile.getPrimaryBusinessCategory();
                    interfaceC8101k.bindString(46, $r386);
                }
                String $r387 = userProfile.getCustomerType();
                if ($r387 == null) {
                    interfaceC8101k.bindNull(47);
                } else {
                    String $r388 = userProfile.getCustomerType();
                    interfaceC8101k.bindString(47, $r388);
                }
                String $r389 = userProfile.getSavingsCategory();
                if ($r389 == null) {
                    interfaceC8101k.bindNull(48);
                } else {
                    String $r390 = userProfile.getSavingsCategory();
                    interfaceC8101k.bindString(48, $r390);
                }
                int $i1 = userProfile.getId();
                long $l04 = $i1;
                interfaceC8101k.bindLong(49, $l04);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1763c0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, UserProfile userProfile) {
                UserProfile $r3 = userProfile;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1841w0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `user_profile` (`userId`,`profileImage`,`phoneNumber`,`kycLevel`,`bvnIsVerified`,`email`,`dob`,`gender`,`businessName`,`address`,`state`,`lga`,`firstName`,`lastName`,`businessAddress`,`bvn`,`secondaryPhoneNumber`,`managerId`,`sessionId`,`userName`,`picsUrl`,`isActive`,`isLoggedIn`,`cacDocumentId`,`utilityBillImageId`,`city`,`agentKyc`,`bank`,`accountName`,`accountNumber`,`personalBusinessAddress`,`homeAddress`,`closestLandmark`,`identityNumberType`,`cacRegistrationNo`,`terminalId`,`mposVendor`,`serialNumber`,`posDeviceName`,`timeCreated`,`sourceId`,`fcmToken`,`identificationCardImageId`,`uplinePhoneNumber`,`area`,`primaryBusinessCategory`,`customerType`,`savingsCategory`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__deletionAdapterOfUserProfile = new AbstractC1761b0<UserProfile>(abstractC1802o0) { // from class: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao_Impl.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: bind  reason: avoid collision after fix types in other method */
            public void bind2(InterfaceC8101k interfaceC8101k, UserProfile userProfile) {
                int $i1 = userProfile.getId();
                long $l0 = $i1;
                interfaceC8101k.bindLong(1, $l0);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.room.AbstractC1761b0
            public /* bridge */ /* synthetic */ void bind(InterfaceC8101k interfaceC8101k, UserProfile userProfile) {
                UserProfile $r3 = userProfile;
                bind2(interfaceC8101k, $r3);
            }

            @Override // androidx.room.AbstractC1761b0, androidx.room.AbstractC1841w0
            public String createQuery() {
                return "DELETE FROM `user_profile` WHERE `id` = ?";
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ AbstractC1802o0 access$000(UserProfileDao_Impl userProfileDao_Impl) {
        AbstractC1802o0 r1 = userProfileDao_Impl.__db;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static List getRequiredConverters() {
        List $r0 = Collections.emptyList();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao
    public void deleteUser(UserProfile userProfile) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1761b0 $r3 = this.__deletionAdapterOfUserProfile;
            $r3.handle(userProfile);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao
    public AbstractC11696w getUserProfile() {
        final C1816r0 $r1 = C1816r0.m34466m("SELECT * FROM user_profile WHERE id=0", 0);
        AbstractC11696w $r3 = C1823t0.m34459e(new Callable<UserProfile>() { // from class: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao_Impl.3
            /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
                java.lang.IndexOutOfBoundsException: bitIndex < 0: -127
                	at java.util.BitSet.get(BitSet.java:623)
                	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
                	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
                	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
                	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
                */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ai.kudi.agent.core.domain.room_entities.UserProfile call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 1720
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao_Impl.CallableC01093.call():ai.kudi.agent.core.domain.room_entities.UserProfile");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ UserProfile call() throws Exception {
                UserProfile $r12 = call();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r12 = $r1;
                $r12.m34467J();
            }
        });
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao
    public AbstractC11696w getUserProfileSingle() {
        final C1816r0 $r1 = C1816r0.m34466m("SELECT * FROM user_profile WHERE id=0", 0);
        AbstractC11696w $r3 = C1823t0.m34459e(new Callable<UserProfile>() { // from class: ai.kudi.agent.core.domain.db.room_dao.UserProfileDao_Impl.4
            /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
                java.lang.IndexOutOfBoundsException: bitIndex < 0: -127
                	at java.util.BitSet.get(BitSet.java:623)
                	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
                	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
                	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
                	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
                */
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ai.kudi.agent.core.domain.room_entities.UserProfile call() throws java.lang.Exception {
                /*
                    Method dump skipped, instructions count: 1720
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao_Impl.CallableC01104.call():ai.kudi.agent.core.domain.room_entities.UserProfile");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ UserProfile call() throws Exception {
                UserProfile $r12 = call();
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r12 = $r1;
                $r12.m34467J();
            }
        });
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao
    public void insertUserProfile(UserProfile userProfile) {
        AbstractC1802o0 $r2 = this.__db;
        $r2.assertNotSuspendingTransaction();
        AbstractC1802o0 $r22 = this.__db;
        $r22.beginTransaction();
        try {
            AbstractC1763c0 $r3 = this.__insertionAdapterOfUserProfile;
            $r3.insert((AbstractC1763c0) userProfile);
            AbstractC1802o0 $r23 = this.__db;
            $r23.setTransactionSuccessful();
        } finally {
            AbstractC1802o0 $r24 = this.__db;
            $r24.endTransaction();
        }
    }
}
