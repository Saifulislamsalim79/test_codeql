package ai.kudi.agent.login.domain;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LoginParams.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#JJ\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020&J@\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/login/domain/LoginParams;", "", "()V", LoginParams.DASHBOARD_DATA, "", "DEVICE_ID_PERMISSION_REQUEST_CODE", "", "EXTRA_CUSTOMER_TYPE", "EXTRA_ENABLE_FINGERPRINT", "EXTRA_IS_C2C_ENABLED", "EXTRA_IS_HQ", "EXTRA_IS_KCASH_ENABLED", "EXTRA_IS_NEW_USER", "EXTRA_IS_OUTLET", "EXTRA_PHONE_NUMBER", "HAS_SEEN_INTRO", LoginParams.INSURANCE_STATUS, "IS_FROM", "LOGIN_STATUS_ALLOWED", "ONBOARDING_SUPPORT", "PERMISSION_REQUEST_CODE", LoginParams.POS_PURCHASED, LoginParams.PREF_FREQUENTLY_USED, "PREF_LAST_PHONE_NUMBER", "PREF_NEW_ONBOARDING_SUPPORT", "REFERRER_TYPE", "SHOULD_FORCE_KYC_UPGRADE", LoginParams.SHOW_TODO_LIST, LoginParams.UPLINE_TYPE, "buildAccountVerificationIntent", "", "context", "Landroid/content/Context;", TransactionField.STATUS, "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "buildLoginIntent", "isNewUser", "", "isKCashEnabled", "isC2C", "isHq", "isOutlet", "customerType", "showTodoList", "cacheFrequentlyUsedFlag", "kCashFlag", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginParams {
    public static final String DASHBOARD_DATA = "DASHBOARD_DATA";
    public static final int DEVICE_ID_PERMISSION_REQUEST_CODE = 30;
    public static final String EXTRA_CUSTOMER_TYPE = "customer_type";
    public static final String EXTRA_ENABLE_FINGERPRINT = "enable_finger_print";
    public static final String EXTRA_IS_C2C_ENABLED = "is_c2c_enabled";
    public static final String EXTRA_IS_HQ = "is_hq";
    public static final String EXTRA_IS_KCASH_ENABLED = "is_kcash_enabled";
    public static final String EXTRA_IS_NEW_USER = "is_new_user";
    public static final String EXTRA_IS_OUTLET = "is_outlet";
    public static final String EXTRA_PHONE_NUMBER = "loginActivity.extra.phone";
    public static final String HAS_SEEN_INTRO = "has_seen_intro";
    public static final LoginParams INSTANCE;
    public static final String INSURANCE_STATUS = "INSURANCE_STATUS";
    public static final String IS_FROM = "isFrom";
    public static final String LOGIN_STATUS_ALLOWED = "ALLOWED";
    public static final String ONBOARDING_SUPPORT = "018885008";
    public static final int PERMISSION_REQUEST_CODE = 1003;
    public static final String POS_PURCHASED = "POS_PURCHASED";
    public static final String PREF_FREQUENTLY_USED = "PREF_FREQUENTLY_USED";
    public static final String PREF_LAST_PHONE_NUMBER = "loginActivity.prefs";
    public static final String PREF_NEW_ONBOARDING_SUPPORT = "new_onboarding_support.prefs";
    public static final String REFERRER_TYPE = "ReferrerType";
    public static final String SHOULD_FORCE_KYC_UPGRADE = "forceKycUpgrade";
    public static final String SHOW_TODO_LIST = "SHOW_TODO_LIST";
    public static final String UPLINE_TYPE = "UPLINE_TYPE";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        LoginParams $r0 = new LoginParams();
        INSTANCE = $r0;
    }

    private LoginParams() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void buildLoginIntent$default(LoginParams loginParams, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String $r2, boolean $z5, int i, Object obj) {
        int $i1 = i & 64;
        if ($i1 != 0) {
            $r2 = "AGENT";
        }
        int $i0 = i & 128;
        if ($i0 != 0) {
            $z5 = false;
        }
        loginParams.buildLoginIntent(context, z, z2, z3, z4, z5, $r2, $z5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void cacheFrequentlyUsedFlag(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        SharedPreferences $r3 = context.getSharedPreferences(PREF_FREQUENTLY_USED, 0);
        SharedPreferences.Editor $r4 = $r3.edit();
        $r4.putBoolean(EXTRA_IS_C2C_ENABLED, z2).putBoolean(EXTRA_IS_KCASH_ENABLED, z).putBoolean(EXTRA_IS_NEW_USER, z3).putBoolean(EXTRA_IS_OUTLET, z5).putBoolean(EXTRA_IS_HQ, z4).putString(EXTRA_CUSTOMER_TYPE, str).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void buildAccountVerificationIntent(Context context, String str, OtpVerificationModel otpVerificationModel) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, TransactionField.STATUS);
        LoginParams$buildAccountVerificationIntent$1 $r4 = new LoginParams$buildAccountVerificationIntent$1(otpVerificationModel, str);
        ContextExtKt.launchActivity$default(context, false, AccountVerificationHolderActivity.class, (InterfaceC11767l) $r4, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        if (r11 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void buildLoginIntent(android.content.Context r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, java.lang.String r22, boolean r23) {
        /*
            r15 = this;
            r8 = r22
            java.lang.String r9 = "context"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r9)
            java.lang.String r9 = "customerType"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r9)
            r0 = r22
            int r10 = r0.length()
            if (r10 != 0) goto L1a
            r11 = 1
            goto L1b
        L1a:
            r11 = 0
        L1b:
            if (r11 != 0) goto L27
            java.lang.String r9 = "USER"
            r0 = r22
            boolean r11 = kotlin.p483e0.p485d.Log_OC.append(r0, r9)
            if (r11 != 0) goto L29
        L27:
            java.lang.String r8 = "AGENT"
        L29:
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r17
            r5 = r20
            r6 = r21
            r7 = r8
            r0.cacheFrequentlyUsedFlag(r1, r2, r3, r4, r5, r6, r7)
            ai.kudi.agent.login.domain.LoginParams$buildLoginIntent$1 r12 = new ai.kudi.agent.login.domain.LoginParams$buildLoginIntent$1
            r0 = r23
            r12.<init>(r0)
            r13 = 1
            java.lang.Class<ai.kudi.agent.home.HomeActivity> r14 = ai.kudi.agent.home.HomeActivity.class
            r0 = r16
            ai.kudi.agent.core.util.ContextExtKt.launchActivity(r0, r13, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.domain.LoginParams.buildLoginIntent(android.content.Context, boolean, boolean, boolean, boolean, boolean, java.lang.String, boolean):void");
    }
}
