package ai.kudi.agent.users.data.repositories.mapper;

import ai.kudi.agent.core.domain.repositories.mapper.Mapper;
import ai.kudi.agent.core.domain.room_entities.UserProfile;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UserModelToUserMapper.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/users/data/repositories/mapper/UserModelToUserMapper;", "Lai/kudi/agent/core/domain/repositories/mapper/Mapper;", "Lai/kudi/agent/core/domain/room_entities/UserProfile;", "Lai/kudi/agent/users/domain/dto/User;", "()V", "map", "userModel", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UserModelToUserMapper implements Mapper<UserProfile, User> {
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
        UserProfile $r3 = (UserProfile) obj;
        ai.kudi.agent.users.domain.package_1.User $r1 = updateAddress($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public ai.kudi.agent.users.domain.package_1.User updateAddress(UserProfile userProfile) {
        Log_OC.getArray(userProfile, "userModel");
        User.Builder $r2 = new User.Builder();
        String $r3 = userProfile.getUserId();
        User.Builder $r22 = $r2.setId($r3);
        String $r32 = userProfile.getFirstName();
        User.Builder $r23 = $r22.setFirstName($r32);
        String $r33 = userProfile.getLastName();
        User.Builder $r24 = $r23.setLastName($r33);
        String $r34 = userProfile.getPhoneNumber();
        User.Builder $r25 = $r24.setPhoneNumber($r34);
        String $r35 = userProfile.getPicsUrl();
        User.Builder $r26 = $r25.setProfilePicUrl($r35);
        String $r36 = userProfile.getUserName();
        User.Builder $r27 = $r26.setUsername($r36);
        String $r37 = userProfile.getSourceId();
        User.Builder $r28 = $r27.setAndroidAppId($r37);
        boolean $z0 = userProfile.isLoggedIn();
        User.Builder $r29 = $r28.isLoggedIn($z0);
        String $r38 = userProfile.getFcmToken();
        User.Builder $r210 = $r29.setFcmToken($r38);
        String $r39 = userProfile.getEmail();
        User.Builder $r211 = $r210.setEmail($r39);
        String $r310 = userProfile.getSessionId();
        User.Builder $r212 = $r211.setSessionId($r310);
        String $r311 = userProfile.getGender();
        User.Builder $r213 = $r212.setGender($r311);
        String $r312 = userProfile.getBvn();
        User.Builder $r214 = $r213.setBvn($r312);
        String $r313 = userProfile.getProfileImage();
        User.Builder $r215 = $r214.setProfilePictureId($r313);
        String $r314 = userProfile.getCacDocumentId();
        User.Builder $r216 = $r215.setCacDocumentId($r314);
        String $r315 = userProfile.getUtilityBillImageId();
        User.Builder $r217 = $r216.setUtilityBillImageId($r315);
        String $r316 = userProfile.getIdentificationCardImageId();
        User.Builder $r218 = $r217.setIdentificationCardImageId($r316);
        String $r317 = userProfile.getDob();
        User.Builder $r219 = $r218.setDob($r317);
        String $r318 = userProfile.getState();
        User.Builder $r220 = $r219.setState($r318);
        String $r319 = userProfile.getCity();
        User.Builder $r221 = $r220.setCity($r319);
        String $r320 = userProfile.getLga();
        User.Builder $r222 = $r221.setLga($r320);
        String $r321 = userProfile.getAgentKyc();
        User.Builder $r223 = $r222.setAgentKyc($r321);
        String $r322 = userProfile.getBank();
        User.Builder $r224 = $r223.setBank($r322);
        String $r323 = userProfile.getAccountName();
        User.Builder $r225 = $r224.setAccountName($r323);
        String $r324 = userProfile.getAccountNumber();
        User.Builder $r226 = $r225.setAccountNumber($r324);
        String $r325 = userProfile.getBusinessAddress();
        User.Builder $r227 = $r226.setBusinessAddress($r325);
        String $r326 = userProfile.getPersonalBusinessAddress();
        User.Builder $r228 = $r227.setPersonalBusinessAddress($r326);
        String $r327 = userProfile.getBusinessName();
        User.Builder $r229 = $r228.setBusinessName($r327);
        String $r328 = userProfile.getCacRegistrationNo();
        User.Builder $r230 = $r229.setCacRegistrationNo($r328);
        String $r329 = userProfile.getTerminalId();
        User.Builder $r231 = $r230.setTerminalId($r329);
        String $r330 = userProfile.getSerialNumber();
        User.Builder $r232 = $r231.setSerialNumber($r330);
        String $r331 = userProfile.getMposVendor();
        User.Builder $r233 = $r232.setMposVendor($r331);
        String $r332 = userProfile.getPosDeviceName();
        User.Builder $r234 = $r233.setPosDeviceName($r332);
        String $r333 = userProfile.getTimeCreated();
        User.Builder $r235 = $r234.setTimeCreated($r333);
        boolean $z02 = userProfile.getBvnIsVerified();
        Boolean $r4 = Boolean.valueOf($z02);
        User.Builder $r236 = $r235.setIsBvnVerified($r4);
        String $r334 = userProfile.getKycLevel();
        User.Builder $r237 = $r236.setKycLevel($r334);
        String $r335 = userProfile.getArea();
        User.Builder $r238 = $r237.setArea($r335);
        String $r336 = userProfile.getUplinePhoneNumber();
        User.Builder $r239 = $r238.setUplinePhoneNumber($r336);
        String $r337 = userProfile.getHomeAddress();
        User.Builder $r240 = $r239.setHomeAddress($r337);
        String $r338 = userProfile.getClosestLandmark();
        User.Builder $r241 = $r240.setClosestLandmark($r338);
        String $r339 = userProfile.getIdentityNumberType();
        User.Builder $r242 = $r241.setIdentityNumberType($r339);
        String $r340 = userProfile.getPrimaryBusinessCategory();
        User.Builder $r243 = $r242.setPrimaryBusinessCategory($r340);
        String $r341 = userProfile.getCustomerType();
        User.Builder $r244 = $r243.setCustomerType($r341);
        String $r342 = userProfile.getSavingsCategory();
        ai.kudi.agent.users.domain.package_1.User $r5 = $r244.setSavingsCategory($r342).build();
        Log_OC.loadImage($r5, "Builder()\n            .setId(userModel.userId)\n            .setFirstName(userModel.firstName)\n            .setLastName(userModel.lastName)\n            .setPhoneNumber(userModel.phoneNumber)\n            .setProfilePicUrl(userModel.picsUrl)\n            .setUsername(userModel.userName)\n            .setAndroidAppId(userModel.sourceId)\n            .isLoggedIn(userModel.isLoggedIn)\n            .setFcmToken(userModel.fcmToken)\n            .setEmail(userModel.email)\n            .setSessionId(userModel.sessionId)\n            .setGender(userModel.gender)\n            .setBvn(userModel.bvn)\n            .setProfilePictureId(userModel.profileImage)\n            .setCacDocumentId(userModel.cacDocumentId)\n            .setUtilityBillImageId(userModel.utilityBillImageId)\n            .setIdentificationCardImageId(userModel.identificationCardImageId)\n            .setDob(userModel.dob)\n            .setState(userModel.state)\n            .setCity(userModel.city)\n            .setLga(userModel.lga)\n            .setAgentKyc(userModel.agentKyc)\n            .setBank(userModel.bank)\n            .setAccountName(userModel.accountName)\n            .setAccountNumber(userModel.accountNumber)\n            .setBusinessAddress(userModel.businessAddress)\n            .setPersonalBusinessAddress(userModel.personalBusinessAddress)\n            .setBusinessName(userModel.businessName)\n            .setCacRegistrationNo(userModel.cacRegistrationNo)\n            .setTerminalId(userModel.terminalId)\n            .setSerialNumber(userModel.serialNumber)\n            .setMposVendor(userModel.mposVendor)\n            .setPosDeviceName(userModel.posDeviceName)\n            .setTimeCreated(userModel.timeCreated)\n            .setIsBvnVerified(userModel.bvnIsVerified)\n            .setKycLevel(userModel.kycLevel)\n            .setArea(userModel.area)\n            .setUplinePhoneNumber(userModel.uplinePhoneNumber)\n            .setHomeAddress(userModel.homeAddress)\n            .setClosestLandmark(userModel.closestLandmark)\n            .setIdentityNumberType(userModel.identityNumberType)\n            .setPrimaryBusinessCategory(userModel.primaryBusinessCategory)\n            .setCustomerType(userModel.customerType)\n            .setSavingsCategory(userModel.savingsCategory)\n            .build()");
        return $r5;
    }
}
