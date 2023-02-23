package ai.kudi.agent.register.data.sources;

import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: CacheDataSource.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/data/sources/CacheDataSource;", "Lai/kudi/agent/register/data/sources/DataSource;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getSharedPreference", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "load", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "save", "Lio/reactivex/Observable;", "agentInfo", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CacheDataSource implements DataSource {
    public static final Companion Companion;
    public static final String PREF_ACCOUNT_NAME = "pref_account_name";
    public static final String PREF_ACCOUNT_NO = "pref_account_no";
    public static final String PREF_AGENT_KYC = "pref_agent_kyc";
    public static final String PREF_BUSINESS_ADDR = "pref_business_address";
    public static final String PREF_BUSINESS_NAME = "pref_business_name";
    public static final String PREF_BVN = "pref_bvn";
    public static final String PREF_CAC = "pref_cac";
    public static final String PREF_CITY = "pref_city";
    public static final String PREF_CLOSEST_LANDMARK = "pref_closest_landmark";
    public static final String PREF_DOB = "pref_dob";
    public static final String PREF_EMAIL = "pref_email";
    public static final String PREF_ESTIMATED_TRANSACTION_RANGE = "pref_estimated_transaction_range";
    public static final String PREF_FIRST_NAME = "pref_first_name";
    public static final String PREF_GENDER = "pref_gender";
    public static final String PREF_HOME_ADDRESS = "pref_home_address";
    public static final String PREF_IDENTIFICATION_CARD_IMAGE_ID = "pref_identification_id_image_id";
    public static final String PREF_LAST_NAME = "pref_last_name";
    public static final String PREF_LATITUDE = "pref_latitude";
    public static final String PREF_LGA = "pref_lga";
    public static final String PREF_LGA_LATITUDE = "pref_lga_latitude";
    public static final String PREF_LGA_LONGITUDE = "pref_lga_longitude";
    public static final String PREF_LONGITUDE = "pref_longitude";
    public static final String PREF_MANAGER_ID = "pref_manager_id";
    public static final String PREF_PHONE_NUMBER = "pref_phone_number";
    public static final String PREF_PROFILE_PICS_ID = "pref_profile_pics_id";
    public static final String PREF_REFERRAL_TYPE = "pref_referral_type";
    public static final String PREF_REFFERER_PHONE = "pref_referrer_phone";
    public static final String PREF_REGISTRATION_ID = "pref_reg_id";
    public static final String PREF_RESIDENTIAL_ADDRESS = "pref_residential_address";
    public static final String PREF_STATE = "pref_state";
    public static final String PREF_USERNAME = "username";
    public static final String PREF_UTILITY_BILL_IMAGE_ID = "pref_utility_bill_image_id";
    public static final String SHARED_PREF_NAME = "RegistrationInfoPref";

    /* renamed from: a */
    private final Context f1007a;

    /* compiled from: CacheDataSource.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/register/data/sources/CacheDataSource$Companion;", "", "()V", "PREF_ACCOUNT_NAME", "", "PREF_ACCOUNT_NO", "PREF_AGENT_KYC", "PREF_BUSINESS_ADDR", "PREF_BUSINESS_NAME", "PREF_BVN", "PREF_CAC", "PREF_CITY", "PREF_CLOSEST_LANDMARK", "PREF_DOB", "PREF_EMAIL", "PREF_ESTIMATED_TRANSACTION_RANGE", "PREF_FIRST_NAME", "PREF_GENDER", "PREF_HOME_ADDRESS", "PREF_IDENTIFICATION_CARD_IMAGE_ID", "PREF_LAST_NAME", "PREF_LATITUDE", "PREF_LGA", "PREF_LGA_LATITUDE", "PREF_LGA_LONGITUDE", "PREF_LONGITUDE", "PREF_MANAGER_ID", "PREF_PHONE_NUMBER", "PREF_PROFILE_PICS_ID", "PREF_REFERRAL_TYPE", "PREF_REFFERER_PHONE", "PREF_REGISTRATION_ID", "PREF_RESIDENTIAL_ADDRESS", "PREF_STATE", "PREF_USERNAME", "PREF_UTILITY_BILL_IMAGE_ID", "SHARED_PREF_NAME", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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

    public CacheDataSource(Context context) {
        Log_OC.getArray(context, "ctx");
        this.f1007a = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final SharedPreferences getSharedPreference() {
        Context $r2 = this.f1007a;
        SharedPreferences $r1 = $r2.getSharedPreferences(SHARED_PREF_NAME, 0);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: save$lambda-6  reason: not valid java name */
    public static final RegistrationInfo m40308save$lambda6(CacheDataSource cacheDataSource, RegistrationInfo registrationInfo) {
        Log_OC.getArray(cacheDataSource, "this$0");
        Log_OC.getArray(registrationInfo, "$agentInfo");
        SharedPreferences $r2 = cacheDataSource.getSharedPreference();
        SharedPreferences.Editor $r3 = $r2.edit();
        String $r4 = registrationInfo.getRegistrationId();
        $r3.putString(PREF_REGISTRATION_ID, $r4);
        PersonalInfo $r5 = registrationInfo.getPersonalInfo();
        String $r42 = $r5.getFirstName();
        $r3.putString(PREF_FIRST_NAME, $r42);
        PersonalInfo $r52 = registrationInfo.getPersonalInfo();
        String $r43 = $r52.getLastName();
        $r3.putString(PREF_LAST_NAME, $r43);
        PersonalInfo $r53 = registrationInfo.getPersonalInfo();
        String $r44 = $r53.getEmail();
        $r3.putString(PREF_EMAIL, $r44);
        PersonalInfo $r54 = registrationInfo.getPersonalInfo();
        String $r45 = $r54.getUsername();
        $r3.putString(PREF_USERNAME, $r45);
        PersonalInfo $r55 = registrationInfo.getPersonalInfo();
        String $r46 = $r55.getGender();
        $r3.putString(PREF_GENDER, $r46);
        PersonalInfo $r56 = registrationInfo.getPersonalInfo();
        String $r47 = $r56.getPhoneNumber();
        $r3.putString(PREF_PHONE_NUMBER, $r47);
        PersonalInfo $r57 = registrationInfo.getPersonalInfo();
        String $r48 = $r57.getPersonalBusinessAddress();
        $r3.putString(PREF_HOME_ADDRESS, $r48);
        PersonalInfo $r58 = registrationInfo.getPersonalInfo();
        String $r49 = $r58.getBvn();
        $r3.putString(PREF_BVN, $r49);
        PersonalInfo $r59 = registrationInfo.getPersonalInfo();
        String $r410 = $r59.getBusinessName();
        $r3.putString(PREF_BUSINESS_NAME, $r410);
        PersonalInfo $r510 = registrationInfo.getPersonalInfo();
        String $r411 = $r510.getHomeAddress();
        $r3.putString(PREF_RESIDENTIAL_ADDRESS, $r411);
        PersonalInfo $r511 = registrationInfo.getPersonalInfo();
        String $r412 = $r511.getClosestLandmark();
        $r3.putString(PREF_CLOSEST_LANDMARK, $r412);
        PersonalInfo $r512 = registrationInfo.getPersonalInfo();
        String $r413 = $r512.getBusinessAddress();
        $r3.putString(PREF_BUSINESS_ADDR, $r413);
        PersonalInfo $r513 = registrationInfo.getPersonalInfo();
        String $r414 = $r513.getCacRegistrationNo();
        $r3.putString(PREF_CAC, $r414);
        $r3.putString(PREF_MANAGER_ID, null);
        $r3.putString(PREF_REFFERER_PHONE, null);
        PersonalInfo $r514 = registrationInfo.getPersonalInfo();
        String $r415 = $r514.getProfilePictureId();
        $r3.putString(PREF_PROFILE_PICS_ID, $r415);
        PersonalInfo $r515 = registrationInfo.getPersonalInfo();
        String $r416 = $r515.getState();
        $r3.putString(PREF_STATE, $r416);
        $r3.putString(PREF_CITY, null);
        PersonalInfo $r516 = registrationInfo.getPersonalInfo();
        String $r417 = $r516.getDob();
        $r3.putString(PREF_DOB, $r417);
        PersonalInfo $r517 = registrationInfo.getPersonalInfo();
        String $r418 = $r517.getAccountNumber();
        $r3.putString(PREF_ACCOUNT_NO, $r418);
        PersonalInfo $r518 = registrationInfo.getPersonalInfo();
        String $r419 = $r518.getAccountName();
        $r3.putString(PREF_ACCOUNT_NAME, $r419);
        PersonalInfo $r519 = registrationInfo.getPersonalInfo();
        String $r420 = $r519.getLocalGovernmentArea();
        $r3.putString(PREF_LGA, $r420);
        PersonalInfo $r520 = registrationInfo.getPersonalInfo();
        Float $r6 = $r520.getLgaLatitude();
        if ($r6 != null) {
            float $f0 = $r6.floatValue();
            $r3.putFloat(PREF_LGA_LATITUDE, $f0);
        }
        PersonalInfo $r521 = registrationInfo.getPersonalInfo();
        Float $r62 = $r521.getLgaLongitude();
        if ($r62 != null) {
            float $f02 = $r62.floatValue();
            $r3.putFloat(PREF_LGA_LONGITUDE, $f02);
        }
        PersonalInfo $r522 = registrationInfo.getPersonalInfo();
        Double $r7 = $r522.getLongitude();
        if ($r7 != null) {
            double $d0 = $r7.doubleValue();
            float $f03 = (float) $d0;
            $r3.putFloat(PREF_LONGITUDE, $f03);
        }
        PersonalInfo $r523 = registrationInfo.getPersonalInfo();
        Double $r72 = $r523.getLatitude();
        if ($r72 != null) {
            double $d02 = $r72.doubleValue();
            float $f04 = (float) $d02;
            $r3.putFloat(PREF_LATITUDE, $f04);
        }
        $r3.putString(PREF_REFERRAL_TYPE, null);
        $r3.putString(PREF_ESTIMATED_TRANSACTION_RANGE, null);
        PersonalInfo $r524 = registrationInfo.getPersonalInfo();
        String $r421 = $r524.getUtilityBillImageId();
        $r3.putString(PREF_UTILITY_BILL_IMAGE_ID, $r421);
        PersonalInfo $r525 = registrationInfo.getPersonalInfo();
        String $r422 = $r525.getIdentificationCardImageId();
        $r3.putString(PREF_IDENTIFICATION_CARD_IMAGE_ID, $r422);
        $r3.commit();
        return registrationInfo;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.sources.DataSource
    public RegistrationInfo load() {
        SharedPreferences $r2 = getSharedPreference();
        String $r3 = $r2.getString(PREF_REGISTRATION_ID, "");
        if ($r3 == null) {
            $r3 = "";
        }
        String $r4 = $r2.getString(PREF_PHONE_NUMBER, "");
        String $r5 = $r2.getString(PREF_FIRST_NAME, "");
        String $r6 = $r2.getString(PREF_LAST_NAME, "");
        String $r7 = $r2.getString(PREF_EMAIL, "");
        String $r8 = $r2.getString(PREF_USERNAME, "");
        String $r9 = $r2.getString(PREF_GENDER, "");
        float $f0 = $r2.getFloat(PREF_LATITUDE, 0.0f);
        double $d0 = $f0;
        float $f02 = $r2.getFloat(PREF_LONGITUDE, 0.0f);
        double $d1 = $f02;
        String $r10 = $r2.getString(PREF_PROFILE_PICS_ID, "");
        String $r11 = $r2.getString(PREF_BUSINESS_NAME, "");
        String $r12 = $r2.getString(PREF_RESIDENTIAL_ADDRESS, "");
        String $r13 = $r2.getString(PREF_CLOSEST_LANDMARK, "");
        String $r14 = $r2.getString(PREF_BUSINESS_ADDR, "");
        String $r15 = $r2.getString(PREF_CAC, "");
        String $r16 = $r2.getString(PREF_HOME_ADDRESS, "");
        String $r17 = $r2.getString(PREF_STATE, "");
        String $r18 = $r2.getString(PREF_LGA, "");
        float $f03 = $r2.getFloat(PREF_LGA_LONGITUDE, 0.0f);
        float $f1 = $r2.getFloat(PREF_LGA_LATITUDE, 0.0f);
        String $r19 = $r2.getString(PREF_DOB, "");
        String $r20 = $r2.getString(PREF_BVN, "");
        String $r21 = $r2.getString(PREF_ACCOUNT_NO, "");
        String $r22 = $r2.getString(PREF_ACCOUNT_NAME, "");
        String $r23 = $r2.getString(PREF_AGENT_KYC, "");
        Double $r25 = Double.valueOf($d0);
        Double $r26 = Double.valueOf($d1);
        Float $r27 = Float.valueOf($f1);
        Float $r28 = Float.valueOf($f03);
        PersonalInfo $r24 = new PersonalInfo(null, null, $r4, $r5, $r6, $r7, $r8, $r9, $r25, $r26, null, $r10, null, null, $r11, $r12, $r13, $r14, $r15, $r16, null, null, null, $r17, $r18, $r27, $r28, $r19, $r20, null, $r21, $r22, $r23, null, null, null, null, false, null, 536870915, 126, null);
        RegistrationInfo $r1 = new RegistrationInfo($r3, $r24, null, false, null, 28, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.data.sources.DataSource
    public AbstractC11688p save(final RegistrationInfo registrationInfo) {
        Log_OC.getArray(registrationInfo, "agentInfo");
        AbstractC11688p $r1 = AbstractC11688p.m10536J(new Callable() { // from class: ai.kudi.agent.register.data.sources.IntegerPolynomial$CombineTask
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CacheDataSource $r2 = CacheDataSource.this;
                RegistrationInfo $r12 = registrationInfo;
                return CacheDataSource.m40308save$lambda6($r2, $r12);
            }
        });
        Log_OC.loadImage($r1, "fromCallable {\n            val sharedPref = getSharedPreference()\n\n            with(sharedPref.edit()) {\n                with(agentInfo) {\n                    putString(PREF_REGISTRATION_ID, registrationId)\n                    putString(PREF_FIRST_NAME, personalInfo.firstName)\n                    putString(PREF_LAST_NAME, personalInfo.lastName)\n                    putString(PREF_EMAIL, personalInfo.email)\n                    putString(PREF_USERNAME, personalInfo.username)\n                    putString(PREF_GENDER, personalInfo.gender)\n                    putString(PREF_PHONE_NUMBER, personalInfo.phoneNumber)\n                    putString(PREF_HOME_ADDRESS, personalInfo.personalBusinessAddress)\n                    putString(PREF_BVN, personalInfo.bvn)\n                    putString(PREF_BUSINESS_NAME, personalInfo.businessName)\n                    putString(PREF_RESIDENTIAL_ADDRESS, personalInfo.homeAddress)\n                    putString(PREF_CLOSEST_LANDMARK, personalInfo.closestLandmark)\n                    putString(PREF_BUSINESS_ADDR, personalInfo.businessAddress)\n                    putString(PREF_CAC, personalInfo.cacRegistrationNo)\n                    putString(PREF_MANAGER_ID, null)\n                    putString(PREF_REFFERER_PHONE, null)\n                    putString(PREF_PROFILE_PICS_ID, personalInfo.profilePictureId)\n                    putString(PREF_STATE, personalInfo.state)\n                    putString(PREF_CITY, null)\n                    putString(PREF_DOB, personalInfo.dob)\n                    putString(PREF_ACCOUNT_NO, personalInfo.accountNumber)\n                    putString(PREF_ACCOUNT_NAME, personalInfo.accountName)\n                    putString(PREF_LGA, personalInfo.localGovernmentArea)\n                    personalInfo.lgaLatitude?.also { putFloat(PREF_LGA_LATITUDE, it) }\n                    personalInfo.lgaLongitude?.also { putFloat(PREF_LGA_LONGITUDE, it) }\n                    personalInfo.longitude?.also { putFloat(PREF_LONGITUDE, it.toFloat()) }\n                    personalInfo.latitude?.also { putFloat(PREF_LATITUDE, it.toFloat()) }\n                    putString(PREF_REFERRAL_TYPE, null)\n                    putString(PREF_ESTIMATED_TRANSACTION_RANGE, null)\n                    putString(PREF_UTILITY_BILL_IMAGE_ID, personalInfo.utilityBillImageId)\n                    putString(\n                        PREF_IDENTIFICATION_CARD_IMAGE_ID,\n                        personalInfo.identificationCardImageId\n                    )\n                    commit()\n                }\n            }\n\n            agentInfo\n        }");
        return $r1;
    }
}
