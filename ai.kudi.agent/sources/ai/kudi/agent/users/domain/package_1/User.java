package ai.kudi.agent.users.domain.package_1;

import java.io.Serializable;
import java.util.UUID;
/* loaded from: classes.dex */
public final class User implements Serializable {
    public String accountName;
    public String accountNumber;
    public String agentKyc;
    private final String androidAppId;
    public String area;
    public String bank;
    public String businessAddress;
    private final String businessName;
    public String cacDocumentId;
    public String cacRegistrationNo;
    public String city;
    public String closestLandmark;
    public String country;
    public String customerType;
    private final String deviceId;
    private final String deviceName;
    private final String email;
    private final String fcmToken;
    private final String firstName;
    public String gender;
    public Boolean hasPendingKycUpgrade;
    private final String homeAddress;

    /* renamed from: id */
    private final String f1857id;
    public String identificationCardImageId;
    public String identityNumberType;
    private final String imeI;
    public Boolean isBvnVerified;
    public boolean isC2C;
    public boolean isHq;
    public boolean isKCashEnabled;
    private final boolean isLoggedIn;
    public boolean isNewUser;
    public boolean isOutlet;
    public String keywords;
    public String kycLevel;
    private final String lastName;
    private final String mposVendor;
    private final String password;
    public String personalBusinessAddress;
    private final String phoneNumber;
    public boolean pinResetRequired;
    private final String posDeviceName;
    private final String primaryBusinessCategory;
    private final String profilePicUrl;
    public String profilePictureId;
    private final String savingsCategory;
    public String secret;
    private final String serialNumber;
    private final String sessionId;
    public String state;
    private final String terminalId;
    public String timeCreated;
    public String uplinePhoneNumber;
    private final String username;
    public String utilityBillImageId;
    public double walletBalance;

    /* loaded from: classes.dex */
    public class Builder {
        public String accountName;
        public String accountNumber;
        public String agentKyc;
        private String androidAppId;
        public String area;
        public String bank;
        public String businessAddress;
        private String businessName;
        public String cacDocumentId;
        public String cacRegistrationNo;
        public String city;
        public String closestLandmark;
        public String customerType;
        private String deviceId;
        private String deviceName;
        private String email;
        public String face;
        private String fcmToken;
        private String firstName;
        public String gender;
        public boolean hasPendingKycUpgrade;
        private String homeAddress;
        public String identificationCardImageId;
        public String identityNumberType;
        private String imeI;
        public boolean isBVnVerified;
        private boolean isC2C;
        public boolean isHq;
        private boolean isKCashEnabled;
        private boolean isLoggedIn;
        private boolean isNewUser;
        public boolean isOutlet;
        public String kycLevel;
        private String lastName;
        private String mId;
        private String mPin;
        private String mposVendor;
        public String personalBusinessAddress;
        private String phoneNumber;
        public boolean pinResetRequired;
        private String posDeviceName;
        private String primaryBusinessCategory;
        private String profilePicUrl;
        public String profilePictureId;
        public String region;
        public String savingsCategory;
        public String secret;
        private String serialNumber;
        public String sessionId;
        public String state;
        private String terminalId;
        public String timeCreated;
        public String uplinePhoneNumber;
        private String username;
        public String utilityBillImageId;
        private double walletBalance;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public User build() {
            User $r1 = new User(this);
            return $r1;
        }

        public Builder hasPendingKycUpgrade(boolean z) {
            this.hasPendingKycUpgrade = z;
            return this;
        }

        public Builder isC2C(boolean z) {
            this.isC2C = z;
            return this;
        }

        public Builder isKCashEnabled(boolean z) {
            this.isKCashEnabled = z;
            return this;
        }

        public Builder isLoggedIn(boolean z) {
            this.isLoggedIn = z;
            return this;
        }

        public Builder setAccountName(String str) {
            this.accountName = str;
            return this;
        }

        public Builder setAccountNumber(String str) {
            this.accountNumber = str;
            return this;
        }

        public Builder setAgentKyc(String str) {
            this.agentKyc = str;
            return this;
        }

        public Builder setAndroidAppId(String str) {
            this.androidAppId = str;
            return this;
        }

        public Builder setArea(String str) {
            this.area = str;
            return this;
        }

        public Builder setBank(String str) {
            this.bank = str;
            return this;
        }

        public Builder setBusinessAddress(String str) {
            this.businessAddress = str;
            return this;
        }

        public Builder setBusinessName(String str) {
            this.businessName = str;
            return this;
        }

        public Builder setBvn(String str) {
            this.face = str;
            return this;
        }

        public Builder setCacDocumentId(String str) {
            this.cacDocumentId = str;
            return this;
        }

        public Builder setCacRegistrationNo(String str) {
            this.cacRegistrationNo = str;
            return this;
        }

        public Builder setCity(String str) {
            this.city = str;
            return this;
        }

        public Builder setClosestLandmark(String str) {
            this.closestLandmark = str;
            return this;
        }

        public Builder setCustomerType(String str) {
            this.customerType = str;
            return this;
        }

        public Builder setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.deviceName = str;
            return this;
        }

        public Builder setDob(String str) {
            this.secret = str;
            return this;
        }

        public Builder setEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder setFcmToken(String str) {
            this.fcmToken = str;
            return this;
        }

        public Builder setFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder setGender(String str) {
            this.gender = str;
            return this;
        }

        public Builder setHomeAddress(String str) {
            this.homeAddress = str;
            return this;
        }

        public Builder setId(String str) {
            this.mId = str;
            return this;
        }

        public Builder setIdentificationCardImageId(String str) {
            this.identificationCardImageId = str;
            return this;
        }

        public Builder setIdentityNumberType(String str) {
            this.identityNumberType = str;
            return this;
        }

        public Builder setImei(String str) {
            this.imeI = str;
            return this;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public Builder setIsBvnVerified(Boolean bool) {
            boolean $z0 = bool.booleanValue();
            this.isBVnVerified = $z0;
            return this;
        }

        public Builder setIsHq(boolean z) {
            this.isHq = z;
            return this;
        }

        public Builder setIsOutlet(boolean z) {
            this.isOutlet = z;
            return this;
        }

        public Builder setKycLevel(String str) {
            this.kycLevel = str;
            return this;
        }

        public Builder setLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder setLga(String str) {
            this.region = str;
            return this;
        }

        public Builder setMposVendor(String str) {
            this.mposVendor = str;
            return this;
        }

        public Builder setNewUser(boolean z) {
            this.isNewUser = z;
            return this;
        }

        public Builder setPersonalBusinessAddress(String str) {
            this.personalBusinessAddress = str;
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder setPin(String str) {
            this.mPin = str;
            return this;
        }

        public Builder setPinResetRequired(boolean z) {
            this.pinResetRequired = z;
            return this;
        }

        public Builder setPosDeviceName(String str) {
            this.posDeviceName = str;
            return this;
        }

        public Builder setPrimaryBusinessCategory(String str) {
            this.primaryBusinessCategory = str;
            return this;
        }

        public Builder setProfilePicUrl(String str) {
            this.profilePicUrl = str;
            return this;
        }

        public Builder setProfilePictureId(String str) {
            this.profilePictureId = str;
            return this;
        }

        public Builder setSavingsCategory(String str) {
            this.savingsCategory = str;
            return this;
        }

        public Builder setSerialNumber(String str) {
            this.serialNumber = str;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setState(String str) {
            this.state = str;
            return this;
        }

        public Builder setTerminalId(String str) {
            this.terminalId = str;
            return this;
        }

        public Builder setTimeCreated(String str) {
            this.timeCreated = str;
            return this;
        }

        public Builder setUplinePhoneNumber(String str) {
            this.uplinePhoneNumber = str;
            return this;
        }

        public Builder setUsername(String str) {
            this.username = str;
            return this;
        }

        public Builder setUtilityBillImageId(String str) {
            this.utilityBillImageId = str;
            return this;
        }

        public Builder setWalletBalance(double d) {
            this.walletBalance = d;
            return this;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private User(Builder builder) {
        String $r2 = builder.mId;
        this.f1857id = $r2;
        String $r22 = builder.firstName;
        this.firstName = $r22;
        String $r23 = builder.lastName;
        this.lastName = $r23;
        String $r24 = builder.phoneNumber;
        this.phoneNumber = $r24;
        String $r25 = builder.profilePicUrl;
        this.profilePicUrl = $r25;
        String $r26 = builder.username;
        this.username = $r26;
        String $r27 = builder.mPin;
        this.password = $r27;
        String $r28 = builder.androidAppId;
        this.androidAppId = $r28;
        boolean $z0 = builder.isLoggedIn;
        this.isLoggedIn = $z0;
        String $r29 = builder.fcmToken;
        this.fcmToken = $r29;
        String $r210 = builder.email;
        this.email = $r210;
        String $r211 = builder.sessionId;
        this.sessionId = $r211;
        String $r212 = builder.homeAddress;
        this.homeAddress = $r212;
        String $r213 = builder.deviceId;
        this.deviceId = $r213;
        String $r214 = builder.deviceName;
        this.deviceName = $r214;
        String $r215 = builder.posDeviceName;
        this.posDeviceName = $r215;
        String $r216 = builder.serialNumber;
        this.serialNumber = $r216;
        String $r217 = builder.terminalId;
        this.terminalId = $r217;
        String $r218 = builder.mposVendor;
        this.mposVendor = $r218;
        String $r219 = builder.gender;
        this.gender = $r219;
        String $r220 = builder.face;
        this.keywords = $r220;
        String $r221 = builder.cacDocumentId;
        this.cacDocumentId = $r221;
        String $r222 = builder.utilityBillImageId;
        this.utilityBillImageId = $r222;
        String $r223 = builder.profilePictureId;
        this.profilePictureId = $r223;
        String $r224 = builder.identificationCardImageId;
        this.identificationCardImageId = $r224;
        String $r225 = builder.secret;
        this.secret = $r225;
        String $r226 = builder.state;
        this.state = $r226;
        String $r227 = builder.city;
        this.city = $r227;
        String $r228 = builder.region;
        this.country = $r228;
        String $r229 = builder.agentKyc;
        this.agentKyc = $r229;
        String $r230 = builder.bank;
        this.bank = $r230;
        String $r231 = builder.accountName;
        this.accountName = $r231;
        String $r232 = builder.accountNumber;
        this.accountNumber = $r232;
        String $r233 = builder.businessAddress;
        this.businessAddress = $r233;
        String $r234 = builder.personalBusinessAddress;
        this.personalBusinessAddress = $r234;
        String $r235 = builder.businessName;
        this.businessName = $r235;
        String $r236 = builder.cacRegistrationNo;
        this.cacRegistrationNo = $r236;
        double $d0 = builder.walletBalance;
        this.walletBalance = $d0;
        boolean $z02 = builder.isNewUser;
        this.isNewUser = $z02;
        String $r237 = builder.imeI;
        this.imeI = $r237;
        boolean $z03 = builder.isKCashEnabled;
        this.isKCashEnabled = $z03;
        boolean $z04 = builder.isC2C;
        this.isC2C = $z04;
        boolean $z05 = builder.isOutlet;
        this.isOutlet = $z05;
        boolean $z06 = builder.isHq;
        this.isHq = $z06;
        boolean $z07 = builder.hasPendingKycUpgrade;
        Boolean $r3 = Boolean.valueOf($z07);
        this.hasPendingKycUpgrade = $r3;
        String $r238 = builder.timeCreated;
        this.timeCreated = $r238;
        boolean $z08 = builder.isBVnVerified;
        Boolean $r32 = Boolean.valueOf($z08);
        this.isBvnVerified = $r32;
        String $r239 = builder.kycLevel;
        this.kycLevel = $r239;
        String $r240 = builder.uplinePhoneNumber;
        this.uplinePhoneNumber = $r240;
        String $r241 = builder.area;
        this.area = $r241;
        String $r242 = builder.customerType;
        this.customerType = $r242;
        boolean $z09 = builder.pinResetRequired;
        this.pinResetRequired = $z09;
        String $r243 = builder.closestLandmark;
        this.closestLandmark = $r243;
        String $r244 = builder.identityNumberType;
        this.identityNumberType = $r244;
        String $r245 = builder.primaryBusinessCategory;
        this.primaryBusinessCategory = $r245;
        String $r246 = builder.savingsCategory;
        this.savingsCategory = $r246;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static String generateAndroidAppId() {
        UUID $r0 = UUID.randomUUID();
        String $r1 = $r0.toString();
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
    public String getAndroidAppId() {
        String r1 = this.androidAppId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getArea() {
        String r1 = this.area;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getBusinessName() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getClosestLandmark() {
        String r1 = this.closestLandmark;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getCustomerType() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getDeviceId() {
        String r1 = this.deviceId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getDeviceName() {
        String r1 = this.deviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getEmail() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getFcmToken() {
        String r1 = this.fcmToken;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getFirstName() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getHomeAddress() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getId() {
        String r1 = this.f1857id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getIdentityNumberType() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getImeI() {
        String r1 = this.imeI;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Boolean getIsBvnVerified() {
        Boolean r1 = this.isBvnVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getIsHq() {
        boolean z0 = this.isHq;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getIsOutlet() {
        boolean z0 = this.isOutlet;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getKycLevel() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLastName() {
        String $r1 = this.lastName;
        return $r1 == null ? "" : $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getMposVendor() {
        String r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getPin() {
        String r1 = this.password;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getPosDeviceName() {
        String r1 = this.posDeviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getPrimaryBusinessCategory() {
        String r1 = this.primaryBusinessCategory;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getProfilePicUrl() {
        String r1 = this.profilePicUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSavingsCategory() {
        String r1 = this.savingsCategory;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSerialNumber() {
        String r1 = this.serialNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSessionId() {
        String r1 = this.sessionId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getTerminalId() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getTimeCreated() {
        String r1 = this.timeCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUplinePhoneNumber() {
        String r1 = this.uplinePhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUsername() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isLoggedIn() {
        boolean z0 = this.isLoggedIn;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isPinResetRequired() {
        boolean z0 = this.pinResetRequired;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Builder toBuilder() {
        Builder $r1 = new Builder();
        String $r2 = this.f1857id;
        $r1.setId($r2);
        String $r22 = this.firstName;
        $r1.setFirstName($r22);
        String $r23 = this.lastName;
        $r1.setLastName($r23);
        String $r24 = this.phoneNumber;
        $r1.setPhoneNumber($r24);
        String $r25 = this.profilePicUrl;
        $r1.setProfilePicUrl($r25);
        String $r26 = this.username;
        $r1.setUsername($r26);
        String $r27 = this.password;
        $r1.setPin($r27);
        String $r28 = this.androidAppId;
        $r1.setAndroidAppId($r28);
        String $r29 = this.fcmToken;
        $r1.setFcmToken($r29);
        String $r210 = this.email;
        $r1.setEmail($r210);
        boolean $z0 = this.isLoggedIn;
        $r1.isLoggedIn($z0);
        String $r211 = this.sessionId;
        $r1.setSessionId($r211);
        String $r212 = this.homeAddress;
        $r1.setHomeAddress($r212);
        String $r213 = this.businessName;
        $r1.setBusinessName($r213);
        String $r214 = this.serialNumber;
        $r1.setSerialNumber($r214);
        String $r215 = this.posDeviceName;
        $r1.setPosDeviceName($r215);
        String $r216 = this.terminalId;
        $r1.setTerminalId($r216);
        String $r217 = this.mposVendor;
        $r1.setMposVendor($r217);
        String $r218 = this.keywords;
        $r1.setBvn($r218);
        String $r219 = this.gender;
        $r1.setGender($r219);
        String $r220 = this.keywords;
        $r1.setBvn($r220);
        String $r221 = this.profilePictureId;
        $r1.setProfilePictureId($r221);
        String $r222 = this.cacDocumentId;
        $r1.setCacDocumentId($r222);
        String $r223 = this.utilityBillImageId;
        $r1.setUtilityBillImageId($r223);
        String $r224 = this.identificationCardImageId;
        $r1.setIdentificationCardImageId($r224);
        String $r225 = this.secret;
        $r1.setDob($r225);
        String $r226 = this.state;
        $r1.setState($r226);
        String $r227 = this.city;
        $r1.setCity($r227);
        String $r228 = this.country;
        $r1.setLga($r228);
        String $r229 = this.agentKyc;
        $r1.setAgentKyc($r229);
        String $r230 = this.bank;
        $r1.setBank($r230);
        String $r231 = this.accountName;
        $r1.setAccountName($r231);
        String $r232 = this.accountNumber;
        $r1.setAccountNumber($r232);
        String $r233 = this.businessAddress;
        $r1.setBusinessAddress($r233);
        String $r234 = this.personalBusinessAddress;
        $r1.setPersonalBusinessAddress($r234);
        String $r235 = this.cacRegistrationNo;
        $r1.setCacRegistrationNo($r235);
        boolean $z02 = this.isNewUser;
        $r1.setNewUser($z02);
        double $d0 = this.walletBalance;
        $r1.setWalletBalance($d0);
        String $r236 = this.imeI;
        $r1.setImei($r236);
        boolean $z03 = this.isC2C;
        $r1.isC2C($z03);
        boolean $z04 = this.isHq;
        $r1.setIsHq($z04);
        Boolean $r3 = this.hasPendingKycUpgrade;
        boolean $z05 = $r3.booleanValue();
        $r1.hasPendingKycUpgrade($z05);
        String $r237 = this.timeCreated;
        $r1.setTimeCreated($r237);
        Boolean $r32 = this.isBvnVerified;
        $r1.setIsBvnVerified($r32);
        String $r238 = this.kycLevel;
        $r1.setKycLevel($r238);
        String $r239 = this.area;
        $r1.setArea($r239);
        String $r240 = this.uplinePhoneNumber;
        $r1.setUplinePhoneNumber($r240);
        String $r241 = this.customerType;
        $r1.setCustomerType($r241);
        String $r242 = this.closestLandmark;
        $r1.setClosestLandmark($r242);
        String $r243 = this.identityNumberType;
        $r1.setIdentityNumberType($r243);
        String $r244 = this.primaryBusinessCategory;
        $r1.setPrimaryBusinessCategory($r244);
        String $r245 = this.savingsCategory;
        $r1.setSavingsCategory($r245);
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
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("User{gender='");
        String $r1 = this.gender;
        $r2.append($r1);
        $r2.append('\'');
        $r2.append(", bvn='");
        String $r12 = this.keywords;
        $r2.append($r12);
        $r2.append('\'');
        $r2.append(", profilePictureId='");
        String $r13 = this.profilePictureId;
        $r2.append($r13);
        $r2.append('\'');
        $r2.append(", cacDocumentId='");
        String $r14 = this.cacDocumentId;
        $r2.append($r14);
        $r2.append('\'');
        $r2.append(", utilityBillImageId='");
        String $r15 = this.utilityBillImageId;
        $r2.append($r15);
        $r2.append('\'');
        $r2.append(", identificationCardImageId='");
        String $r16 = this.identificationCardImageId;
        $r2.append($r16);
        $r2.append('\'');
        $r2.append(", dob='");
        String $r17 = this.secret;
        $r2.append($r17);
        $r2.append('\'');
        $r2.append(", state='");
        String $r18 = this.state;
        $r2.append($r18);
        $r2.append('\'');
        $r2.append(", city='");
        String $r19 = this.city;
        $r2.append($r19);
        $r2.append('\'');
        $r2.append(", lga='");
        String $r110 = this.country;
        $r2.append($r110);
        $r2.append('\'');
        $r2.append(", agentKyc='");
        String $r111 = this.agentKyc;
        $r2.append($r111);
        $r2.append('\'');
        $r2.append(", bank='");
        String $r112 = this.bank;
        $r2.append($r112);
        $r2.append('\'');
        $r2.append(", accountName='");
        String $r113 = this.accountName;
        $r2.append($r113);
        $r2.append('\'');
        $r2.append(", accountNumber='");
        String $r114 = this.accountNumber;
        $r2.append($r114);
        $r2.append('\'');
        $r2.append(", businessAddress='");
        String $r115 = this.businessAddress;
        $r2.append($r115);
        $r2.append('\'');
        $r2.append(", personalBusinessAddress='");
        String $r116 = this.personalBusinessAddress;
        $r2.append($r116);
        $r2.append('\'');
        $r2.append(", cacRegistrationNo='");
        String $r117 = this.cacRegistrationNo;
        $r2.append($r117);
        $r2.append('\'');
        $r2.append(", id='");
        String $r118 = this.f1857id;
        $r2.append($r118);
        $r2.append('\'');
        $r2.append(", firstName='");
        String $r119 = this.firstName;
        $r2.append($r119);
        $r2.append('\'');
        $r2.append(", lastName='");
        String $r120 = this.lastName;
        $r2.append($r120);
        $r2.append('\'');
        $r2.append(", phoneNo='");
        String $r121 = this.phoneNumber;
        $r2.append($r121);
        $r2.append('\'');
        $r2.append(", profilePicUrl='");
        String $r122 = this.profilePicUrl;
        $r2.append($r122);
        $r2.append('\'');
        $r2.append(", username='");
        String $r123 = this.username;
        $r2.append($r123);
        $r2.append('\'');
        $r2.append(", pin='");
        String $r124 = this.password;
        $r2.append($r124);
        $r2.append('\'');
        $r2.append(", androidAppId='");
        String $r125 = this.androidAppId;
        $r2.append($r125);
        $r2.append('\'');
        $r2.append(", isLoggedIn=");
        boolean $z0 = this.isLoggedIn;
        $r2.append($z0);
        $r2.append(", fcmToken='");
        String $r126 = this.fcmToken;
        $r2.append($r126);
        $r2.append('\'');
        $r2.append(", email='");
        String $r127 = this.email;
        $r2.append($r127);
        $r2.append('\'');
        $r2.append(", sessionId='");
        String $r128 = this.sessionId;
        $r2.append($r128);
        $r2.append('\'');
        $r2.append(", homeAddress='");
        String $r129 = this.homeAddress;
        $r2.append($r129);
        $r2.append('\'');
        $r2.append(", businessName='");
        String $r130 = this.businessName;
        $r2.append($r130);
        $r2.append('\'');
        $r2.append(", deviceName='");
        String $r131 = this.deviceName;
        $r2.append($r131);
        $r2.append('\'');
        $r2.append(", deviceId='");
        String $r132 = this.deviceId;
        $r2.append($r132);
        $r2.append('\'');
        $r2.append(", posDeviceName='");
        String $r133 = this.posDeviceName;
        $r2.append($r133);
        $r2.append('\'');
        $r2.append(", serialNumber='");
        String $r134 = this.serialNumber;
        $r2.append($r134);
        $r2.append('\'');
        $r2.append(", terminalId='");
        String $r135 = this.terminalId;
        $r2.append($r135);
        $r2.append('\'');
        $r2.append(", mposVendor='");
        String $r136 = this.mposVendor;
        $r2.append($r136);
        $r2.append('\'');
        $r2.append(", walletBalance='");
        double $d0 = this.walletBalance;
        $r2.append($d0);
        $r2.append('\'');
        $r2.append(", isNewUser='");
        boolean $z02 = this.isNewUser;
        $r2.append($z02);
        $r2.append('\'');
        $r2.append(", imei='");
        String $r137 = this.imeI;
        $r2.append($r137);
        $r2.append('\'');
        $r2.append(", isOutlet='");
        boolean $z03 = this.isOutlet;
        $r2.append($z03);
        $r2.append('\'');
        $r2.append(", isHq='");
        boolean $z04 = this.isHq;
        $r2.append($z04);
        $r2.append('\'');
        $r2.append(", hasPendingKycUpgrade='");
        Boolean $r3 = this.hasPendingKycUpgrade;
        $r2.append($r3);
        $r2.append('\'');
        $r2.append(", timeCreated='");
        String $r138 = this.timeCreated;
        $r2.append($r138);
        $r2.append('\'');
        $r2.append(", isBvnVerified='");
        Boolean $r32 = this.isBvnVerified;
        $r2.append($r32);
        $r2.append('\'');
        $r2.append(", kycLevel='");
        String $r139 = this.kycLevel;
        $r2.append($r139);
        $r2.append('\'');
        $r2.append(", area='");
        String $r140 = this.area;
        $r2.append($r140);
        $r2.append('\'');
        $r2.append(", uplinePhoneNumber=");
        String $r141 = this.uplinePhoneNumber;
        $r2.append($r141);
        $r2.append('\'');
        $r2.append(", homeAddress=");
        String $r142 = this.homeAddress;
        $r2.append($r142);
        $r2.append('\'');
        $r2.append(", closestLandmark=");
        String $r143 = this.closestLandmark;
        $r2.append($r143);
        $r2.append('\'');
        $r2.append(", customerType=");
        String $r144 = this.customerType;
        $r2.append($r144);
        $r2.append('\'');
        $r2.append(", isPinResetRequired=");
        boolean $z05 = this.pinResetRequired;
        $r2.append($z05);
        $r2.append('\'');
        $r2.append(", customerType=");
        String $r145 = this.customerType;
        $r2.append($r145);
        $r2.append('\'');
        $r2.append(", identityNumberType=");
        String $r146 = this.identityNumberType;
        $r2.append($r146);
        $r2.append('\'');
        $r2.append(", primaryBusinessCategory=");
        String $r147 = this.primaryBusinessCategory;
        $r2.append($r147);
        $r2.append('\'');
        $r2.append(", savingsCategory=");
        String $r148 = this.savingsCategory;
        $r2.append($r148);
        $r2.append('\'');
        $r2.append('}');
        String $r149 = $r2.toString();
        return $r149;
    }
}
