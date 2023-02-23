package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.core.usecases.OneInputUseCase;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.domain.wiki.CashoutAccount;
import ai.kudi.agent.login.domain.wiki.LoginRequest;
import ai.kudi.agent.login.domain.wiki.LoginResponse;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.UserRepository;
import ai.kudi.agent.users.domain.dto.User;
import ai.kudi.agent.users.domain.package_1.User;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.auth.FirebaseAuth;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.InterfaceC11291f;
import p590o.p591a.Timber;
/* compiled from: LoginUser.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u001dH\u0002J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0010H\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0010H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0002X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/users/domain/usecases/LoginUser;", "Lai/kudi/agent/core/usecases/OneInputUseCase;", "Lai/kudi/agent/users/domain/dto/User;", "Lai/kudi/agent/users/domain/usecases/LoginInput;", "networkService", "Lai/kudi/agent/users/data/network/UserService;", "userRepo", "Lai/kudi/agent/users/data/repositories/UserRepository;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "accountRepository", "Lai/kudi/agent/settings/domain/repositories/AccountRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lai/kudi/agent/users/data/network/UserService;Lai/kudi/agent/users/data/repositories/UserRepository;Lcom/google/firebase/auth/FirebaseAuth;Lai/kudi/agent/settings/domain/repositories/AccountRepository;Landroid/content/SharedPreferences;)V", "firebaseToken", "", "loggedInUser", "getLoggedInUser", "()Lai/kudi/agent/users/domain/dto/User;", "setLoggedInUser", "(Lai/kudi/agent/users/domain/dto/User;)V", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", TransactionField.STATUS, "buildUser", "response", "Lai/kudi/agent/login/domain/dto/LoginResponse;", "cacheCashOutAccounts", "", "cashoutAccounts", "", "Lai/kudi/agent/login/domain/dto/CashoutAccount;", "cacheUpLineType", "uplineType", "execute", "Lio/reactivex/Observable;", MetricTracker.Object.INPUT, "handleDeviceNotPermitted", "registerUserForIntercom", "user", "saveInsuranceStatus", "insuranceStatus", "saveReferrerType", "referrerType", "saveShouldForceKycUpgrade", "it", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginUser implements OneInputUseCase<User, LoginInput> {
    private final AccountRepository accountRepository;
    private final FirebaseAuth firebaseAuth;
    private String firebaseToken;
    public ai.kudi.agent.users.domain.package_1.User loggedInUser;
    private final UserService networkService;
    private OtpVerificationModel otpVerificationModel;
    private final SharedPreferences sharedPreferences;
    private String status;
    private final UserRepository userRepo;

    public LoginUser(UserService userService, UserRepository userRepository, FirebaseAuth firebaseAuth, AccountRepository accountRepository, SharedPreferences sharedPreferences) {
        Log_OC.getArray(userService, "networkService");
        Log_OC.getArray(userRepository, "userRepo");
        Log_OC.getArray(firebaseAuth, "firebaseAuth");
        Log_OC.getArray(accountRepository, "accountRepository");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.networkService = userService;
        this.userRepo = userRepository;
        this.firebaseAuth = firebaseAuth;
        this.accountRepository = accountRepository;
        this.sharedPreferences = sharedPreferences;
        this.status = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ai.kudi.agent.users.domain.package_1.User buildUser(LoginResponse loginResponse) {
        User.Builder $r2 = new User.Builder();
        String $r3 = loginResponse.getUserId();
        User.Builder $r22 = $r2.setId($r3);
        String $r32 = loginResponse.getFirstName();
        User.Builder $r23 = $r22.setFirstName($r32);
        String $r33 = loginResponse.getLastName();
        User.Builder $r24 = $r23.setLastName($r33);
        String $r34 = loginResponse.getUsername();
        User.Builder $r25 = $r24.setUsername($r34);
        String $r35 = loginResponse.getPhoneNumber();
        User.Builder $r26 = $r25.setPhoneNumber($r35);
        String $r36 = loginResponse.getEmail();
        User.Builder $r27 = $r26.setEmail($r36);
        String $r37 = loginResponse.getSessionId();
        User.Builder $r28 = $r27.setSessionId($r37).isLoggedIn(true);
        String $r38 = loginResponse.getBvn();
        User.Builder $r29 = $r28.setBvn($r38);
        String $r39 = loginResponse.getGender();
        User.Builder $r210 = $r29.setGender($r39);
        String $r310 = loginResponse.getBvn();
        User.Builder $r211 = $r210.setBvn($r310);
        String $r311 = loginResponse.getProfilePictureId();
        User.Builder $r212 = $r211.setProfilePictureId($r311);
        String $r312 = loginResponse.getCacDocumentId();
        User.Builder $r213 = $r212.setCacDocumentId($r312);
        String $r313 = loginResponse.getUtilityBillImageId();
        User.Builder $r214 = $r213.setUtilityBillImageId($r313);
        String $r314 = loginResponse.getIdentificationCardImageId();
        User.Builder $r215 = $r214.setIdentificationCardImageId($r314);
        String $r315 = loginResponse.getDob();
        User.Builder $r216 = $r215.setDob($r315);
        String $r316 = loginResponse.getState();
        User.Builder $r217 = $r216.setState($r316);
        String $r317 = loginResponse.getCity();
        User.Builder $r218 = $r217.setCity($r317);
        String $r318 = loginResponse.getLocalGovernmentArea();
        User.Builder $r219 = $r218.setLga($r318);
        String $r319 = loginResponse.getKycLevel();
        User.Builder $r220 = $r219.setAgentKyc($r319);
        String $r320 = loginResponse.getBank();
        User.Builder $r221 = $r220.setBank($r320);
        String $r321 = loginResponse.getAccountName();
        User.Builder $r222 = $r221.setAccountName($r321);
        String $r322 = loginResponse.getAccountNumber();
        User.Builder $r223 = $r222.setAccountNumber($r322);
        String $r323 = loginResponse.getBusinessName();
        User.Builder $r224 = $r223.setBusinessName($r323);
        String $r324 = loginResponse.getCacRegistrationNo();
        User.Builder $r225 = $r224.setCacRegistrationNo($r324);
        String $r325 = loginResponse.getBusinessAddress();
        User.Builder $r226 = $r225.setBusinessAddress($r325);
        String $r326 = loginResponse.getPersonalBusinessAddress();
        User.Builder $r227 = $r226.setPersonalBusinessAddress($r326);
        String $r327 = loginResponse.getTerminalId();
        User.Builder $r228 = $r227.setTerminalId($r327);
        String $r328 = loginResponse.getPosDeviceName();
        User.Builder $r229 = $r228.setPosDeviceName($r328);
        String $r329 = loginResponse.getMposVendor();
        User.Builder $r230 = $r229.setMposVendor($r329);
        String $r330 = loginResponse.getSerialNumber();
        User.Builder $r231 = $r230.setSerialNumber($r330);
        double $d0 = loginResponse.getWalletBalance();
        User.Builder $r232 = $r231.setWalletBalance($d0);
        boolean $z0 = loginResponse.isNewUser();
        User.Builder $r233 = $r232.setNewUser($z0);
        Boolean $r4 = loginResponse.isKCashEnabled();
        boolean $z1 = $r4 == null ? false : $r4.booleanValue();
        User.Builder $r234 = $r233.isKCashEnabled($z1);
        Boolean $r42 = loginResponse.isC2C();
        boolean $z12 = $r42 == null ? false : $r42.booleanValue();
        User.Builder $r235 = $r234.isC2C($z12);
        Boolean $r43 = loginResponse.isHq();
        boolean $z13 = $r43 == null ? false : $r43.booleanValue();
        User.Builder $r236 = $r235.setIsHq($z13);
        Boolean $r44 = loginResponse.isOutlet();
        boolean $z14 = $r44 == null ? false : $r44.booleanValue();
        User.Builder $r237 = $r236.setIsOutlet($z14);
        String $r331 = loginResponse.getTimeCreated();
        User.Builder $r238 = $r237.setTimeCreated($r331).setIsBvnVerified(loginResponse.isBvnVerified());
        String $r332 = loginResponse.getKycLevel();
        User.Builder $r239 = $r238.setKycLevel($r332);
        String $r333 = loginResponse.getUplinePhone();
        User.Builder $r240 = $r239.setUplinePhoneNumber($r333);
        String $r334 = loginResponse.getArea();
        User.Builder $r241 = $r240.setArea($r334);
        String $r335 = loginResponse.getHomeAddress();
        User.Builder $r242 = $r241.setHomeAddress($r335);
        String $r336 = loginResponse.getCustomerType();
        User.Builder $r243 = $r242.setCustomerType($r336);
        Boolean $r45 = loginResponse.getPinResetRequired();
        boolean $z02 = $r45 != null ? $r45.booleanValue() : false;
        User.Builder $r244 = $r243.setPinResetRequired($z02);
        String $r337 = loginResponse.getClosestLandmark();
        User.Builder $r245 = $r244.setClosestLandmark($r337);
        String $r338 = loginResponse.getIdentityNumberType();
        User.Builder $r246 = $r245.setIdentityNumberType($r338);
        String $r339 = loginResponse.getPrimaryBusinessCategory();
        User.Builder $r247 = $r246.setPrimaryBusinessCategory($r339);
        String $r340 = loginResponse.getSavingsCategory();
        ai.kudi.agent.users.domain.package_1.User $r5 = $r247.setSavingsCategory($r340).build();
        Log_OC.loadImage($r5, "Builder()\n            .setId(response.userId)\n            .setFirstName(response.firstName)\n            .setLastName(response.lastName)\n            .setUsername(response.username)\n            .setPhoneNumber(response.phoneNumber)\n            .setEmail(response.email)\n            .setSessionId(response.sessionId)\n            .isLoggedIn(true)\n            .setBvn(response.bvn)\n            .setGender(response.gender)\n            .setBvn(response.bvn)\n            .setProfilePictureId(response.profilePictureId)\n            .setCacDocumentId(response.cacDocumentId)\n            .setUtilityBillImageId(response.utilityBillImageId)\n            .setIdentificationCardImageId(response.identificationCardImageId)\n            .setDob(response.dob)\n            .setState(response.state)\n            .setCity(response.city)\n            .setLga(response.localGovernmentArea)\n            .setAgentKyc(response.kycLevel)\n            .setBank(response.bank)\n            .setAccountName(response.accountName)\n            .setAccountNumber(response.accountNumber)\n            .setBusinessName(response.businessName)\n            .setCacRegistrationNo(response.cacRegistrationNo)\n            .setBusinessAddress(response.businessAddress)\n            .setPersonalBusinessAddress(response.personalBusinessAddress)\n            .setTerminalId(response.terminalId)\n            .setPosDeviceName(response.posDeviceName)\n            .setMposVendor(response.mposVendor)\n            .setSerialNumber(response.serialNumber)\n            .setWalletBalance(response.walletBalance)\n            .setNewUser(response.isNewUser)\n            .isKCashEnabled(response.isKCashEnabled ?: false)\n            .isC2C(response.isC2C ?: false)\n            .setIsHq(response.isHq ?: false)\n            .setIsOutlet(response.isOutlet ?: false)\n            .setTimeCreated(response.timeCreated)\n            .setIsBvnVerified(response.isBvnVerified)\n            .setKycLevel(response.kycLevel)\n            .setUplinePhoneNumber(response.uplinePhone)\n            .setArea(response.area)\n            .setHomeAddress(response.homeAddress)\n            .setCustomerType(response.customerType)\n            .setPinResetRequired(response.pinResetRequired ?: false)\n            .setClosestLandmark(response.closestLandmark)\n            .setIdentityNumberType(response.identityNumberType)\n            .setPrimaryBusinessCategory(response.primaryBusinessCategory)\n            .setSavingsCategory(response.savingsCategory)\n            .build()");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void cacheCashOutAccounts(List list) {
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            Object $r2 = list.get(0);
            CashoutAccount $r3 = (CashoutAccount) $r2;
            AccountRepository $r4 = this.accountRepository;
            String $r5 = $r3.getAccountName();
            String $r6 = $r3.getAccountNumber();
            String $r7 = $r3.getBankCode();
            String $r8 = $r3.getBankName();
            String $r9 = $r3.getDateAdded();
            String $r10 = $r3.getAgentId();
            String $r11 = $r3.getAccountPurpose();
            BankAccount $r12 = new BankAccount($r5, $r6, $r8, $r7, $r9, $r10, $r11);
            AbstractC11696w $r13 = $r4.cacheAccountDetails($r12);
            Token $r14 = Token.FUNCTION;
            Chunk $r15 = Chunk.NEWLINE;
            $r13.s($r14, $r15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cacheCashOutAccounts$lambda-3  reason: not valid java name */
    public static final void m41446cacheCashOutAccounts$lambda3(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: cacheCashOutAccounts$lambda-4  reason: not valid java name */
    public static final void m41447cacheCashOutAccounts$lambda4(Throwable th) {
        String $r0 = Log_OC.m10359a(" error caching ", th);
        Object[] $r2 = new Object[0];
        Timber.tag($r0, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void cacheUpLineType(String str) {
        if (str != null) {
            SharedPreferences $r2 = this.sharedPreferences;
            SharedPreferences.Editor $r3 = $r2.edit();
            $r3.putString(LoginParams.UPLINE_TYPE, str).apply();
            return;
        }
        SharedPreferences $r22 = this.sharedPreferences;
        SharedPreferences.Editor $r32 = $r22.edit();
        $r32.remove(LoginParams.UPLINE_TYPE).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r22 != false) goto L37;
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p425j.p444e.InterfaceC11692s m41448execute$lambda0(ai.kudi.agent.users.domain.usecases.LoginUser r50, ai.kudi.agent.users.domain.package_1.User r51, ai.kudi.agent.login.domain.wiki.LoginResponse r52) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.domain.usecases.LoginUser.m41448execute$lambda0(ai.kudi.agent.users.domain.usecases.LoginUser, ai.kudi.agent.users.domain.package_1.User, ai.kudi.agent.login.domain.wiki.LoginResponse):j.e.s");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-2  reason: not valid java name */
    public static final ai.kudi.agent.users.domain.package_1.User m41449execute$lambda2(LoginUser loginUser, ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(loginUser, "this$0");
        Log_OC.getArray(user, "it");
        String $r3 = loginUser.firebaseToken;
        if ($r3 != null) {
            FirebaseAuth $r2 = loginUser.firebaseAuth;
            $r2.m25409h($r3);
        }
        loginUser.registerUserForIntercom(user);
        return user;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleDeviceNotPermitted() {
        String $r2 = this.status;
        OtpVerificationModel $r3 = this.otpVerificationModel;
        DeviceNotPermittedException $r1 = new DeviceNotPermittedException($r2, $r3);
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void registerUserForIntercom(ai.kudi.agent.users.domain.package_1.User r11) {
        /*
            r10 = this;
            io.intercom.android.sdk.identity.Registration r0 = io.intercom.android.sdk.identity.Registration.create()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getPhoneNumber()
            r1.append(r2)
            r3 = 45
            r1.append(r3)
            java.lang.String r2 = r11.getId()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            io.intercom.android.sdk.identity.Registration r0 = r0.withUserId(r2)
            io.intercom.android.sdk.UserAttributes$Builder r4 = new io.intercom.android.sdk.UserAttributes$Builder
            r4.<init>()
            java.lang.String r2 = r11.getPhoneNumber()
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withPhone(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getFirstName()
            r1.append(r2)
            r3 = 32
            r1.append(r3)
            java.lang.String r2 = r11.getLastName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withName(r2)
            java.lang.String r2 = r11.getEmail()
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withEmail(r2)
            io.intercom.android.sdk.UserAttributes r5 = r4.build()
            io.intercom.android.sdk.identity.Registration r0 = r0.withUserAttributes(r5)
            io.intercom.android.sdk.Intercom r6 = io.intercom.android.sdk.Intercom.client()
            r6.registerIdentifiedUser(r0)
            java.lang.String r2 = r11.getTerminalId()
            if (r2 == 0) goto L77
            boolean r7 = kotlin.p549l0.C13265j.m5470u(r2)
            if (r7 == 0) goto L75
            goto L77
        L75:
            r7 = 0
            goto L78
        L77:
            r7 = 1
        L78:
            r3 = 1
            r7 = r7 ^ r3
            io.intercom.android.sdk.UserAttributes$Builder r4 = new io.intercom.android.sdk.UserAttributes$Builder
            r4.<init>()
            java.lang.String r2 = r11.agentKyc
            java.lang.String r8 = "kyc_level"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            java.lang.String r2 = r11.getId()
            java.lang.String r8 = "user_id"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            java.lang.String r2 = r11.getTerminalId()
            java.lang.String r8 = "terminal_id"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            java.lang.String r2 = r11.getUsername()
            java.lang.String r8 = "username"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            java.lang.String r2 = r11.getMposVendor()
            java.lang.String r8 = "pos_vendor"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "agent_has_terminal"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r9)
            java.lang.String r2 = r11.customerType
            if (r2 != 0) goto Lbf
            java.lang.String r2 = "AGENT"
        Lbf:
            java.lang.String r8 = "customer_type"
            io.intercom.android.sdk.UserAttributes$Builder r4 = r4.withCustomAttribute(r8, r2)
            io.intercom.android.sdk.UserAttributes r5 = r4.build()
            io.intercom.android.sdk.Intercom r6 = io.intercom.android.sdk.Intercom.client()
            r6.updateUser(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.domain.usecases.LoginUser.registerUserForIntercom(ai.kudi.agent.users.domain.package_1.User):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveInsuranceStatus(String str) {
        SharedPreferences $r2 = this.sharedPreferences;
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putString(LoginParams.INSURANCE_STATUS, str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveReferrerType(String str) {
        SharedPreferences $r2 = this.sharedPreferences;
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putString(LoginParams.REFERRER_TYPE, str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void saveShouldForceKycUpgrade(LoginResponse loginResponse) {
        SharedPreferences $r2 = this.sharedPreferences;
        SharedPreferences.Editor $r3 = $r2.edit();
        Boolean $r4 = loginResponse.getForceKycUpgrade();
        boolean $z0 = $r4 == null ? false : $r4.booleanValue();
        $r3.putBoolean(LoginParams.SHOULD_FORCE_KYC_UPGRADE, $z0).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(LoginInput loginInput) {
        Log_OC.getArray(loginInput, MetricTracker.Object.INPUT);
        final ai.kudi.agent.users.domain.package_1.User $r3 = loginInput.getUser();
        UserService $r4 = this.networkService;
        String $r6 = $r3.getPhoneNumber();
        Log_OC.loadImage($r6, "user.phoneNumber");
        String $r7 = $r3.getPin();
        Log_OC.loadImage($r7, "user.pin");
        String $r8 = $r3.getDeviceName();
        Log_OC.loadImage($r8, "user.deviceName");
        String $r9 = $r3.getDeviceId();
        Log_OC.loadImage($r9, "user.deviceId");
        String $r10 = $r3.getImeI();
        String $r2 = Build.VERSION.RELEASE;
        Log_OC.loadImage($r2, "RELEASE");
        double $d0 = loginInput.getLat();
        Double $r11 = Double.valueOf($d0);
        double $d02 = loginInput.getLon();
        Double $r12 = Double.valueOf($d02);
        LoginRequest $r5 = new LoginRequest($r6, $r7, $r8, $r9, $r10, $r2, null, false, $r11, $r12, 192, null);
        AbstractC11688p $r13 = $r4.secureLogin($r5);
        AbstractC11688p $r132 = $r13.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoginUser $r1 = LoginUser.this;
                ai.kudi.agent.users.domain.package_1.User $r22 = $r3;
                LoginResponse $r52 = (LoginResponse) obj;
                InterfaceC11692s $r32 = LoginUser.m41448execute$lambda0($r1, $r22, $r52);
                return $r32;
            }
        }).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.users.domain.usecases.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoginUser $r1 = LoginUser.this;
                ai.kudi.agent.users.domain.package_1.User $r22 = (ai.kudi.agent.users.domain.package_1.User) obj;
                return LoginUser.m41449execute$lambda2($r1, $r22);
            }
        });
        p425j.p444e.Item $r16 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11688p $r133 = $r132.h0($r16);
        p425j.p444e.Item $r162 = ContextUtils.LogError();
        AbstractC11688p $r134 = $r133.R($r162);
        Log_OC.loadImage($r134, "networkService.secureLogin(\n            LoginRequest(\n                user.phoneNumber,\n                user.pin,\n                user.deviceName,\n                user.deviceId,\n                user.imeI,\n                Build.VERSION.RELEASE,\n                latitude = input.lat,\n                longitude = input.lon\n            )\n        ).flatMap {\n            status = it.status\n\n            if (status == RegistrationStatus.FACE_VERIFICATION_NEEDED.name ||\n                status == RegistrationStatus.OTP_VERIFICATION_NEEDED.name\n            ) {\n                otpVerificationModel = OtpVerificationModel(\n                    phoneNumber = user.phoneNumber, pin = user.pin,\n                    expiresInSeconds = (if (it.expiresInSeconds == 0.toLong()) 600 else it.expiresInSeconds),\n                    expiresInMinutes = it.expiresInMinutes,\n                    imeiId = user.imeI,\n                    deviceName = user.deviceName,\n                    deviceId = user.deviceId,\n                    loginAttemptId = it.loginAttemptId\n                )\n                handleDeviceNotPermitted()\n            }\n\n            if (status != LOGIN_STATUS_ALLOWED) {\n                handleDeviceNotPermitted()\n            }\n            if (it.role.lowercase(Locale.getDefault()) != \"agent\") {\n                throw NotAnAgentException()\n            }\n            firebaseToken = it.firebaseToken\n            if (it.cashoutAccounts != null) {\n                cacheCashOutAccounts(it.cashoutAccounts.orEmpty())\n            }\n            if (it.insuranceStatus != null) {\n                saveInsuranceStatus(it.insuranceStatus?.status.orEmpty())\n            }\n            saveShouldForceKycUpgrade(it)\n            saveReferrerType(it.referrerType ?: \"\")\n\n            cacheUpLineType(it.uplineType)\n\n            loggedInUser = buildUser(it)\n            userRepo.updateUser(loggedInUser)\n        }.map {\n            firebaseToken?.also { token ->\n                firebaseAuth.signInWithCustomToken(token)\n            }\n            registerUserForIntercom(it)\n            it\n        }.subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r134;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        LoginInput $r3 = (LoginInput) obj;
        AbstractC11688p $r1 = execute($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ai.kudi.agent.users.domain.package_1.User getLoggedInUser() {
        ai.kudi.agent.users.domain.package_1.User $r1 = this.loggedInUser;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("loggedInUser");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    public final void setLoggedInUser(ai.kudi.agent.users.domain.package_1.User user) {
        Log_OC.getArray(user, "<set-?>");
        this.loggedInUser = user;
    }
}
