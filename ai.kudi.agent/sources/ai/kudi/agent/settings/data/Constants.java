package ai.kudi.agent.settings.data;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: Constants.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/settings/data/Constants;", "", "()V", "ACCT_COUNT", "", "", "getACCT_COUNT", "()Ljava/util/List;", "IS_BVN_VERIFIED", "", "IS_NEW_USER", Pref.KYC_IN_REVIEW_PARAM, "KYC_LEVEL", "KYC_LEVELS", "getKYC_LEVELS", Constants.MANAGER_ID, "PARAM_CURRENT_KYC_LEVEL", "PARAM_RELATIONSHIP_MANAGER", "PHONE_NO_PARAM", "PIC_URL", "getPIC_URL", "()Ljava/lang/String;", "setPIC_URL", "(Ljava/lang/String;)V", Constants.PIN_RESET_REQUIRED, "SETTINGS_PARAM", "SETTINGS_PARAM_ABOUT_KYC", "SETTINGS_PARAM_ACTIVATE_POS", "SETTINGS_PARAM_ADD_BANK_ACCT", "SETTINGS_PARAM_EDIT_PROFILE", "SETTINGS_PARAM_RESET_PIN", "SETTINGS_PARAM_UPGRADE_KYC", "SETTINGS_PARAM_VERIFY_SECONDARY_DETAILS", "SETTING_PARAM_COMPLETE_PROFILE", "TRUSTED_DEVICES_SETTINGS_PARAM", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Constants {
    private static final List<Integer> ACCT_COUNT;
    public static final Constants INSTANCE;
    public static final String IS_BVN_VERIFIED = "BVN";
    public static final String IS_NEW_USER = "VERIFY_BVN";
    public static final String KYC_IN_REVIEW_PARAM = "isReviewingKycUpgradeLevel";
    public static final String KYC_LEVEL = "KycLevel";
    private static final List<String> KYC_LEVELS;
    public static final String MANAGER_ID = "MANAGER_ID";
    public static final String PARAM_CURRENT_KYC_LEVEL = "param_current_kyc_level";
    public static final String PARAM_RELATIONSHIP_MANAGER = "RELATIONSHIP_MANAGER";
    public static final String PHONE_NO_PARAM = "phoneNo";
    private static String PIC_URL = null;
    public static final String PIN_RESET_REQUIRED = "PIN_RESET_REQUIRED";
    public static final String SETTINGS_PARAM = "PARAM_SETTINGS";
    public static final String SETTINGS_PARAM_ABOUT_KYC = "AboutKyc";
    public static final String SETTINGS_PARAM_ACTIVATE_POS = "Activate pos";
    public static final String SETTINGS_PARAM_ADD_BANK_ACCT = "Add Bank account";
    public static final String SETTINGS_PARAM_EDIT_PROFILE = "EditProfile";
    public static final String SETTINGS_PARAM_RESET_PIN = "Reset pin";
    public static final String SETTINGS_PARAM_UPGRADE_KYC = "UpgradeKyc";
    public static final String SETTINGS_PARAM_VERIFY_SECONDARY_DETAILS = "Verify Secondary Phone Number";
    public static final String SETTING_PARAM_COMPLETE_PROFILE = "VerifyBvnOrCompleteKyc";
    public static final String TRUSTED_DEVICES_SETTINGS_PARAM = "TRUSTED_DEVICES_SETTINGS";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r2;
        List $r22;
        Constants $r0 = new Constants();
        INSTANCE = $r0;
        String[] $r1 = {KycLevelRemoteDataSource.LEVEL_ONE, KycLevelRemoteDataSource.LEVEL_TWO, KycLevelRemoteDataSource.LEVEL_THREE};
        $r2 = C13726r.m3888h($r1);
        KYC_LEVELS = $r2;
        Integer[] $r3 = {1, 2, 3};
        $r22 = C13726r.m3888h($r3);
        ACCT_COUNT = $r22;
        PIC_URL = "Pic url";
    }

    private Constants() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getACCT_COUNT() {
        List r1 = ACCT_COUNT;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getKYC_LEVELS() {
        List r1 = KYC_LEVELS;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPIC_URL() {
        String r1 = PIC_URL;
        return r1;
    }

    public final void setPIC_URL(String str) {
        Log_OC.getArray(str, "<set-?>");
        PIC_URL = str;
    }
}
