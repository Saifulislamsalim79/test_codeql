package ai.kudi.agent.users.data.repositories;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.UserProfileDao;
import ai.kudi.agent.core.domain.repositories.mapper.Mapper;
import ai.kudi.agent.core.domain.repositories.specs.Specs;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.settings.domain.package_4.UserProfileResponse;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.mapper.UserModelToUserMapper;
import ai.kudi.agent.users.data.repositories.mapper.UserToUserModelMapper;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.package_1.UpdateSourceInfoRequest;
import ai.kudi.agent.users.domain.package_1.UpdateSourceInfoResponse;
import ai.kudi.agent.users.domain.package_1.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13724q;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p450e0.InterfaceC11291f;
import p590o.p591a.Timber;
/* compiled from: RoomUserRepository.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010 \u001a\u00020\u001eH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0#0\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/users/data/repositories/RoomUserRepository;", "Lai/kudi/agent/users/data/repositories/UserRepository;", "appRoomDatabase", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "networkService", "Lai/kudi/agent/users/data/network/UserService;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;Lai/kudi/agent/users/data/network/UserService;)V", "currentUser", "Lio/reactivex/Single;", "Lai/kudi/agent/users/domain/dto/User;", "getCurrentUser", "()Lio/reactivex/Single;", "toUserMapper", "Lai/kudi/agent/core/domain/repositories/mapper/Mapper;", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "toUserModelMapper", "delete", "", "specs", "Lai/kudi/agent/core/domain/repositories/specs/Specs;", "model", "deleteAll", "fetchUserProfile", "Lio/reactivex/Observable;", "user", "insert", "models", "", "isEmailAvailable", CacheDataSource.PREF_USERNAME, "", "isPhoneAvailable", "phoneNumber", "isUsernameAvailable", "query", "", "querySingle", "saveFCMForCurrentUser", "fcm", "update", "updateUser", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RoomUserRepository implements UserRepository {
    public static final Companion Companion;
    private static final String TAG;
    private final CoreAppDatabase appRoomDatabase;
    private final UserService networkService;
    private final Mapper<UserProfile, User> toUserMapper;
    private final Mapper<User, UserProfile> toUserModelMapper;

    /* compiled from: RoomUserRepository.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/users/data/repositories/RoomUserRepository$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        Companion $r1 = new Companion(null);
        Companion = $r1;
        String $r0 = RoomUserRepository.class.getCanonicalName();
        TAG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RoomUserRepository(CoreAppDatabase coreAppDatabase, UserService userService) {
        Log_OC.getArray(coreAppDatabase, "appRoomDatabase");
        Log_OC.getArray(userService, "networkService");
        this.appRoomDatabase = coreAppDatabase;
        this.networkService = userService;
        UserModelToUserMapper $r3 = new UserModelToUserMapper();
        this.toUserMapper = $r3;
        UserToUserModelMapper $r4 = new UserToUserModelMapper();
        this.toUserModelMapper = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _get_currentUser_$lambda-0  reason: not valid java name */
    public static final ai.kudi.agent.users.domain.package_1.User m41416_get_currentUser_$lambda0(RoomUserRepository roomUserRepository, UserProfile userProfile) {
        Log_OC.getArray(roomUserRepository, "this$0");
        Object[] $r3 = new Object[0];
        Timber.wtf("this current user is called", $r3);
        Mapper $r4 = roomUserRepository.toUserMapper;
        Object $r1 = $r4.toString(userProfile);
        ai.kudi.agent.users.domain.package_1.User $r5 = (ai.kudi.agent.users.domain.package_1.User) $r1;
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUserProfile$lambda-4  reason: not valid java name */
    public static final UserProfile m41417fetchUserProfile$lambda4(UserProfile userProfile, RoomUserRepository roomUserRepository, UserProfileResponse userProfileResponse) {
        Log_OC.getArray(roomUserRepository, "this$0");
        Log_OC.getArray(userProfileResponse, "userProfileResponse");
        String $r3 = userProfileResponse.getId();
        String $r4 = userProfileResponse.getProfilePictureId();
        String $r5 = userProfileResponse.getPhoneNumber();
        String $r6 = userProfileResponse.getKycLevel();
        Boolean $r7 = userProfileResponse.getBvnVerified();
        Log_OC.append($r7);
        boolean $z0 = $r7.booleanValue();
        String $r8 = userProfileResponse.getGender();
        String $r9 = userProfileResponse.getEmail();
        String $r10 = userProfileResponse.getDob();
        String $r11 = userProfileResponse.getBusinessName();
        String $r12 = userProfileResponse.getHomeAddress();
        String $r13 = userProfileResponse.getState();
        String $r14 = userProfileResponse.getLocalGovernmentArea();
        String $r15 = userProfileResponse.getFirstName();
        String $r16 = userProfileResponse.getLastName();
        String $r17 = userProfileResponse.getBusinessAddress();
        String $r18 = userProfileResponse.getBvn();
        String $r19 = userProfileResponse.getManagerId();
        String $r20 = userProfileResponse.getSecondaryPhoneNumber();
        String $r21 = userProfile.getSessionId();
        String $r22 = userProfile.getIdentityNumberType();
        String $r23 = userProfile.getSavingsCategory();
        Log_OC.loadImage(userProfile, "local");
        UserProfile $r0 = UserProfile.copy$default(userProfile, $r3, $r4, $r5, $r6, $z0, $r9, $r10, $r8, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r20, $r19, $r21, null, null, false, false, null, null, null, null, null, null, null, null, null, null, $r22, null, null, null, null, null, null, null, null, null, null, null, null, null, $r23, 0, -524288, 98301, null);
        Mapper $r24 = roomUserRepository.toUserMapper;
        Object $r25 = $r24.toString($r0);
        Log_OC.loadImage($r25, "toUserMapper.map(userProfile)");
        ai.kudi.agent.users.domain.package_1.User $r26 = (ai.kudi.agent.users.domain.package_1.User) $r25;
        roomUserRepository.insert($r26);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveFCMForCurrentUser$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41418saveFCMForCurrentUser$lambda3(final RoomUserRepository roomUserRepository, final String str, final ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(roomUserRepository, "this$0");
        Log_OC.getArray(str, "$fcm");
        Log_OC.getArray(user, "user");
        String $r3 = user.getFcmToken();
        if ($r3 != null) {
            AbstractC11688p $r4 = AbstractC11688p.m10532N(user);
            return $r4;
        }
        String $r32 = user.getAndroidAppId();
        String $r33 = $r32 == null ? ai.kudi.agent.users.domain.package_1.User.generateAndroidAppId() : user.getAndroidAppId();
        UserService $r5 = roomUserRepository.networkService;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "user.sessionId");
        Log_OC.loadImage($r33, "newSourceId");
        UpdateSourceInfoRequest $r7 = new UpdateSourceInfoRequest($r33, str);
        AbstractC11688p $r42 = $r5.updateSourceInfo($r6, $r7);
        return $r42.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.users.data.repositories.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RoomUserRepository $r1 = RoomUserRepository.this;
                ai.kudi.agent.users.domain.package_1.User $r2 = user;
                String $r34 = str;
                UpdateSourceInfoResponse $r62 = (UpdateSourceInfoResponse) obj;
                InterfaceC11692s $r43 = RoomUserRepository.m41419saveFCMForCurrentUser$lambda3$lambda2($r1, $r2, $r34, $r62);
                return $r43;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveFCMForCurrentUser$lambda-3$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m41419saveFCMForCurrentUser$lambda3$lambda2(RoomUserRepository roomUserRepository, ai.kudi.agent.users.domain.package_1.User user, String str, UpdateSourceInfoResponse updateSourceInfoResponse) {
        Log_OC.getArray(roomUserRepository, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(str, "$fcm");
        Log_OC.getArray(updateSourceInfoResponse, "it");
        User.Builder $r4 = user.toBuilder();
        ai.kudi.agent.users.domain.package_1.User $r2 = $r4.setFcmToken(str).build();
        Log_OC.loadImage($r2, "user.toBuilder()\n                                    .setFcmToken(fcm)\n                                    .build()");
        AbstractC11688p $r5 = roomUserRepository.updateUser($r2);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateUser$lambda-1  reason: not valid java name */
    public static final ai.kudi.agent.users.domain.package_1.User m41420updateUser$lambda1(RoomUserRepository roomUserRepository, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(roomUserRepository, "this$0");
        Log_OC.getArray(user, "user1");
        CoreAppDatabase $r2 = roomUserRepository.appRoomDatabase;
        UserProfileDao $r3 = $r2.getUserProfileDao();
        Mapper $r4 = roomUserRepository.toUserModelMapper;
        Object $r5 = $r4.toString(user);
        Log_OC.loadImage($r5, "toUserModelMapper.map(user1)");
        UserProfile $r6 = (UserProfile) $r5;
        $r3.insertUserProfile($r6);
        return user;
    }

    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public void delete(Specs specs) {
        Log_OC.getArray(specs, "specs");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void delete(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "model");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        UserProfileDao $r3 = $r2.getUserProfileDao();
        Mapper $r4 = this.toUserModelMapper;
        Object $r5 = $r4.toString(user);
        Log_OC.loadImage($r5, "toUserModelMapper.map(model)");
        UserProfile $r6 = (UserProfile) $r5;
        $r3.deleteUser($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public /* bridge */ /* synthetic */ void delete(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r2 = (ai.kudi.agent.users.domain.package_1.User) obj;
        delete($r2);
    }

    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public void deleteAll() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p fetchUserProfile(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "user");
        Mapper $r2 = this.toUserModelMapper;
        Object $r3 = $r2.toString(user);
        final UserProfile $r4 = (UserProfile) $r3;
        Object[] $r5 = new InterfaceC11692s[2];
        AbstractC11688p $r6 = AbstractC11688p.m10532N($r4);
        Item $r7 = p425j.p444e.p470j0.ClassWriter.LogError();
        $r5[0] = $r6.h0($r7);
        UserService $r8 = this.networkService;
        String $r9 = $r4.getSessionId();
        String $r10 = $r9;
        if ($r9 == null) {
            $r10 = "";
        }
        AbstractC11688p $r62 = $r8.getUserProfile($r10);
        AbstractC11688p $r63 = $r62.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.users.data.repositories.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                UserProfile $r1 = UserProfile.this;
                RoomUserRepository $r22 = this;
                UserProfileResponse $r42 = (UserProfileResponse) obj;
                return RoomUserRepository.m41417fetchUserProfile$lambda4($r1, $r22, $r42);
            }
        });
        Item $r72 = p425j.p444e.p470j0.ClassWriter.LogError();
        $r5[1] = $r63.h0($r72);
        InterfaceC11692s[] r13 = (InterfaceC11692s[]) $r5;
        AbstractC11688p $r64 = AbstractC11688p.m10500n(r13);
        Item $r73 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r65 = $r64.h0($r73);
        Log_OC.loadImage($r65, "concatArrayEager(\n            Observable.just(local).subscribeOn(Schedulers.io()),\n            networkService.getUserProfile(local.sessionId ?: \"\").map { userProfileResponse ->\n                val userProfile = local.copy(\n                    userId = userProfileResponse.id,\n                    profileImage = userProfileResponse.profilePictureId,\n                    phoneNumber = userProfileResponse.phoneNumber,\n                    kycLevel = userProfileResponse.kycLevel,\n                    bvnIsVerified = userProfileResponse.bvnVerified!!,\n                    gender = userProfileResponse.gender,\n                    email = userProfileResponse.email,\n                    dob = userProfileResponse.dob,\n                    businessName = userProfileResponse.businessName,\n                    address = userProfileResponse.homeAddress,\n                    state = userProfileResponse.state,\n                    lga = userProfileResponse.localGovernmentArea,\n                    firstName = userProfileResponse.firstName,\n                    lastName = userProfileResponse.lastName,\n                    businessAddress = userProfileResponse.businessAddress,\n                    bvn = userProfileResponse.bvn,\n                    managerId = userProfileResponse.managerId,\n                    secondaryPhoneNumber = userProfileResponse.secondaryPhoneNumber,\n                    sessionId = local.sessionId,\n                    identityNumberType = local.identityNumberType,\n                    savingsCategory = local.savingsCategory\n                )\n                insert(toUserMapper.map(userProfile))\n                userProfile\n            }.subscribeOn(Schedulers.io())\n        ).subscribeOn(Schedulers.io())");
        return $r65;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11696w getCurrentUser() {
        CoreAppDatabase $r1 = this.appRoomDatabase;
        UserProfileDao $r2 = $r1.getUserProfileDao();
        AbstractC11696w $r3 = $r2.getUserProfile().m10437m(new InterfaceC11291f() { // from class: ai.kudi.agent.users.data.repositories.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RoomUserRepository $r12 = RoomUserRepository.this;
                UserProfile $r4 = (UserProfile) obj;
                ai.kudi.agent.users.domain.package_1.User $r22 = RoomUserRepository.m41416_get_currentUser_$lambda0($r12, $r4);
                return $r22;
            }
        });
        Log_OC.loadImage($r3, "appRoomDatabase.userProfileDao.getUserProfile()\n            .map { from: UserProfile? ->\n                Timber.d(\"this current user is called\")\n                toUserMapper.map(from)\n            }");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void insert(ai.kudi.agent.users.domain.package_1.User user) {
        List $r1;
        Log_OC.getArray(user, "model");
        $r1 = C13724q.m3901b(user);
        insert((Iterable) $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0010 */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void insert(java.lang.Iterable r12) {
        /*
            r11 = this;
            java.lang.String r0 = "models"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            r11.deleteAll()
            java.util.Iterator r1 = r12.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.users.domain.package_1.User r5 = (ai.kudi.agent.users.domain.package_1.User) r5
            r4 = r5
            ai.kudi.agent.core.domain.repositories.mapper.Mapper<ai.kudi.agent.users.domain.dto.User, ai.kudi.agent.core.domain.room_entities.UserProfile> r6 = r11.toUserModelMapper
            java.lang.Object r3 = r6.toString(r4)
            r8 = r3
            ai.kudi.agent.core.domain.room_entities.UserProfile r8 = (ai.kudi.agent.core.domain.room_entities.UserProfile) r8
            r7 = r8
            ai.kudi.agent.core.domain.db.CoreAppDatabase r9 = r11.appRoomDatabase
            ai.kudi.agent.core.domain.db.room_dao.UserProfileDao r10 = r9.getUserProfileDao()
            java.lang.String r0 = "userProfile"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r0)
            r10.insertUserProfile(r7)
            goto Lc
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.data.repositories.RoomUserRepository.insert(java.lang.Iterable):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public /* bridge */ /* synthetic */ void insert(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r2 = (ai.kudi.agent.users.domain.package_1.User) obj;
        insert($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p isEmailAvailable(String str) {
        Log_OC.getArray(str, CacheDataSource.PREF_USERNAME);
        UserService $r3 = this.networkService;
        AbstractC11688p $r1 = $r3.checkEmail(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p isPhoneAvailable(String str) {
        Log_OC.getArray(str, "phoneNumber");
        UserService $r3 = this.networkService;
        AbstractC11688p $r1 = $r3.checkPhone(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p isUsernameAvailable(String str) {
        Log_OC.getArray(str, CacheDataSource.PREF_USERNAME);
        UserService $r3 = this.networkService;
        AbstractC11688p $r1 = $r3.checkUsername(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public AbstractC11688p query(Specs specs) {
        List $r5;
        Log_OC.getArray(specs, "specs");
        Mapper $r2 = this.toUserMapper;
        UserProfile $r3 = new UserProfile(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, -1, 131071, null);
        Object $r4 = $r2.toString($r3);
        $r5 = C13724q.m3901b($r4);
        AbstractC11688p $r6 = AbstractC11688p.m10532N($r5);
        Log_OC.loadImage($r6, "just(userModels)");
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public AbstractC11688p querySingle(Specs specs) {
        Log_OC.getArray(specs, "specs");
        Object $r2 = new UserProfile(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, -1, 131071, null);
        Mapper $r3 = this.toUserMapper;
        Object $r4 = $r3.toString($r2);
        AbstractC11688p $r5 = AbstractC11688p.m10532N($r4);
        Log_OC.loadImage($r5, "just(toUserMapper.map(userModel))");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p saveFCMForCurrentUser(final String str) {
        Log_OC.getArray(str, "fcm");
        AbstractC11696w $r3 = getCurrentUser();
        AbstractC11688p $r4 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.users.data.repositories.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RoomUserRepository $r1 = RoomUserRepository.this;
                String $r2 = str;
                ai.kudi.agent.users.domain.package_1.User $r5 = (ai.kudi.agent.users.domain.package_1.User) obj;
                InterfaceC11692s $r32 = RoomUserRepository.m41418saveFCMForCurrentUser$lambda3($r1, $r2, $r5);
                return $r32;
            }
        });
        Log_OC.loadImage($r4, "currentUser\n            .flatMapObservable { user: User ->\n                if (user.fcmToken != null) {\n                    Observable.just(user)\n                } else {\n                    val newSourceId =\n                        if (user.androidAppId == null) User.generateAndroidAppId() else user.androidAppId\n                    networkService\n                        .updateSourceInfo(\n                            user.sessionId,\n                            UpdateSourceInfoRequest(newSourceId, fcm)\n                        )\n                        .flatMap {\n                            updateUser(\n                                user.toBuilder()\n                                    .setFcmToken(fcm)\n                                    .build()\n                            )\n                        }\n                }\n            }");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void update(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "model");
        CoreAppDatabase $r2 = this.appRoomDatabase;
        UserProfileDao $r3 = $r2.getUserProfileDao();
        Mapper $r4 = this.toUserModelMapper;
        Object $r5 = $r4.toString(user);
        Log_OC.loadImage($r5, "toUserModelMapper.map(model)");
        UserProfile $r6 = (UserProfile) $r5;
        $r3.insertUserProfile($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.repositories.Repository
    public /* bridge */ /* synthetic */ void update(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r2 = (ai.kudi.agent.users.domain.package_1.User) obj;
        update($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.data.repositories.UserRepository
    public AbstractC11688p updateUser(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "user");
        AbstractC11688p $r2 = AbstractC11688p.m10532N(user).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.users.data.repositories.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RoomUserRepository $r1 = RoomUserRepository.this;
                ai.kudi.agent.users.domain.package_1.User $r22 = (ai.kudi.agent.users.domain.package_1.User) obj;
                return RoomUserRepository.m41420updateUser$lambda1($r1, $r22);
            }
        });
        Log_OC.loadImage($r2, "just(user)\n            .map { user1: User ->\n                appRoomDatabase.userProfileDao.insertUserProfile(toUserModelMapper.map(user1))\n                user1\n            }");
        return $r2;
    }
}
