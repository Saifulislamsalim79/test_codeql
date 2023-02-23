package ai.kudi.agent.users.data.repositories.mapper;

import ai.kudi.agent.core.domain.repositories.mapper.Mapper;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.users.domain.dto.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UserToUserModelMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/users/data/repositories/mapper/UserToUserModelMapper;", "Lai/kudi/agent/core/domain/repositories/mapper/Mapper;", "Lai/kudi/agent/users/domain/dto/User;", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "()V", "map", "user", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UserToUserModelMapper implements Mapper<User, UserProfile> {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public UserProfile loadProfile(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "user");
        String $r3 = user.getId();
        UserProfile $r2 = new UserProfile($r3, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, -2, 131071, null);
        String $r32 = user.getFirstName();
        $r2.setFirstName($r32);
        String $r33 = user.getLastName();
        $r2.setLastName($r33);
        String $r34 = user.getPhoneNumber();
        $r2.setPhoneNumber($r34);
        String $r35 = user.getProfilePicUrl();
        $r2.setPicsUrl($r35);
        String $r36 = user.getUsername();
        $r2.setUserName($r36);
        String $r37 = user.getAndroidAppId();
        $r2.setSourceId($r37);
        boolean $z0 = user.isLoggedIn();
        $r2.setLoggedIn($z0);
        String $r38 = user.getFcmToken();
        $r2.setFcmToken($r38);
        String $r39 = user.getEmail();
        $r2.setEmail($r39);
        String $r310 = user.getSessionId();
        $r2.setSessionId($r310);
        String $r311 = user.gender;
        $r2.setGender($r311);
        String $r312 = user.keywords;
        $r2.setBvn($r312);
        String $r313 = user.profilePictureId;
        $r2.setProfileImage($r313);
        String $r314 = user.cacDocumentId;
        $r2.setCacDocumentId($r314);
        String $r315 = user.utilityBillImageId;
        $r2.setUtilityBillImageId($r315);
        String $r316 = user.identificationCardImageId;
        $r2.setIdentificationCardImageId($r316);
        String $r317 = user.secret;
        $r2.setDob($r317);
        String $r318 = user.state;
        $r2.setState($r318);
        String $r319 = user.city;
        $r2.setCity($r319);
        String $r320 = user.country;
        $r2.setLga($r320);
        String $r321 = user.agentKyc;
        $r2.setAgentKyc($r321);
        String $r322 = user.bank;
        $r2.setBank($r322);
        String $r323 = user.accountName;
        $r2.setAccountName($r323);
        String $r324 = user.accountNumber;
        $r2.setAccountNumber($r324);
        String $r325 = user.businessAddress;
        $r2.setBusinessAddress($r325);
        String $r326 = user.personalBusinessAddress;
        $r2.setPersonalBusinessAddress($r326);
        String $r327 = user.getBusinessName();
        $r2.setBusinessName($r327);
        String $r328 = user.cacRegistrationNo;
        $r2.setCacRegistrationNo($r328);
        String $r329 = user.getTerminalId();
        $r2.setTerminalId($r329);
        String $r330 = user.getPosDeviceName();
        $r2.setPosDeviceName($r330);
        String $r331 = user.getSerialNumber();
        $r2.setSerialNumber($r331);
        String $r332 = user.getMposVendor();
        $r2.setMposVendor($r332);
        String $r333 = user.timeCreated;
        $r2.setTimeCreated($r333);
        Boolean $r4 = user.isBvnVerified;
        Log_OC.loadImage($r4, "user.isBvnVerified");
        boolean $z02 = $r4.booleanValue();
        $r2.setBvnIsVerified($z02);
        String $r334 = user.kycLevel;
        $r2.setKycLevel($r334);
        String $r335 = user.area;
        $r2.setArea($r335);
        String $r336 = user.uplinePhoneNumber;
        $r2.setUplinePhoneNumber($r336);
        String $r337 = user.getHomeAddress();
        $r2.setHomeAddress($r337);
        String $r338 = user.closestLandmark;
        $r2.setClosestLandmark($r338);
        String $r339 = user.identityNumberType;
        $r2.setIdentityNumberType($r339);
        String $r340 = user.getPrimaryBusinessCategory();
        $r2.setPrimaryBusinessCategory($r340);
        String $r341 = user.customerType;
        $r2.setCustomerType($r341);
        String $r342 = user.getSavingsCategory();
        $r2.setSavingsCategory($r342);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.core.domain.repositories.mapper.Mapper
    public /* bridge */ /* synthetic */ Object toString(Object obj) {
        ai.kudi.agent.users.domain.package_1.User $r3 = (ai.kudi.agent.users.domain.package_1.User) obj;
        UserProfile $r1 = loadProfile($r3);
        return $r1;
    }
}
