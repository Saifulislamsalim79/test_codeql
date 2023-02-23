package ai.kudi.agent.core.util;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.transfer.domain.models.TransactionRecipient;
import android.content.SharedPreferences;
import com.google.gson.C6784f;
import com.google.gson.p184v.C6916a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: Pref.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0011\u001a\u00020\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0014\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/core/util/Pref;", "", "()V", "appPref", "Landroid/content/SharedPreferences;", "value", "", "incompleteTransactionCount", "getIncompleteTransactionCount", "()I", "setIncompleteTransactionCount", "(I)V", "kycCheckPref", "mposPref", "clearAllPrefs", "", "clearLastTransferLookUpResult", "clearSessionSpecificData", "fetchLastTransferLookUpResult", "", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "getKycInReview", "", "isMPosDeviceActivated", "isMPosDeviceInitialized", "saveTransferLookUpResult", AttributeType.LIST, "setFlagForKycCheckFor", "transactionReference", "", "setKycInReview", "setMPosDeviceActivated", "setMPosDeviceInitialized", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Pref {
    public static final Companion Companion;
    public static final String KYC_CHECK_PREF = "KYC_CHECK_PREF";
    public static final String KYC_IN_REVIEW_PARAM = "KYC_IN_REVIEW_PARAM";
    public static final String PREF_APP = "pref_app";
    public static final String PREF_IS_MPOS_ACTIVATED = "pref_is_mpos_activated";
    public static final String PREF_IS_MPOS_INITIALIZED = "pref_is_mpos_initialized";
    public static final String PREF_KEY_INCOMPLETE_TRANSACTION_COUNT = "incomplete_transactions";
    public static final String PREF_LAST_TRANSFER_LOOK_UP_RESULT = "pref_last_transfer_look_up_result";
    public static final String PREF_MPOS = "pref_mpos";
    private static Pref pref;
    private SharedPreferences appPref;
    private SharedPreferences kycCheckPref;
    private SharedPreferences mposPref;

    /* compiled from: Pref.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/core/util/Pref$Companion;", "", "()V", Pref.KYC_CHECK_PREF, "", Pref.KYC_IN_REVIEW_PARAM, "PREF_APP", "PREF_IS_MPOS_ACTIVATED", "PREF_IS_MPOS_INITIALIZED", "PREF_KEY_INCOMPLETE_TRANSACTION_COUNT", "PREF_LAST_TRANSFER_LOOK_UP_RESULT", "PREF_MPOS", "pref", "Lai/kudi/agent/core/util/Pref;", "getInstance", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Pref getInstance() {
            if (Pref.pref == null) {
                Pref.pref = new Pref(null);
            }
            Pref $r1 = Pref.pref;
            return $r1 == null ? new Pref(null) : $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Pref() {
        BaseApplication.Companion $r1 = BaseApplication.Companion;
        BaseApplication $r2 = $r1.getBaseApplication();
        SharedPreferences $r3 = $r2.getSharedPreferences(PREF_APP, 0);
        Log_OC.loadImage($r3, "context.getSharedPreferences(PREF_APP, MODE_PRIVATE)");
        this.appPref = $r3;
        SharedPreferences $r32 = $r2.getSharedPreferences(PREF_MPOS, 0);
        Log_OC.loadImage($r32, "context.getSharedPreferences(PREF_MPOS, MODE_PRIVATE)");
        this.mposPref = $r32;
        SharedPreferences $r33 = $r2.getSharedPreferences(KYC_CHECK_PREF, 0);
        Log_OC.loadImage($r33, "context.getSharedPreferences(KYC_CHECK_PREF, MODE_PRIVATE)");
        this.kycCheckPref = $r33;
    }

    public /* synthetic */ Pref(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void clearLastTransferLookUpResult() {
        SharedPreferences $r1 = this.appPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.remove(PREF_LAST_TRANSFER_LOOK_UP_RESULT).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clearAllPrefs() {
        SharedPreferences $r1 = this.appPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.clear().apply();
    }

    public final void clearSessionSpecificData() {
        clearLastTransferLookUpResult();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List fetchLastTransferLookUpResult() {
        /*
            r12 = this;
            android.content.SharedPreferences r0 = r12.appPref
            java.lang.String r2 = "pref_last_transfer_look_up_result"
            r3 = 0
            java.lang.String r1 = r0.getString(r2, r3)
            if (r1 == 0) goto L14
            int r4 = r1.length()
            if (r4 != 0) goto L12
            goto L14
        L12:
            r5 = 0
            goto L15
        L14:
            r5 = 1
        L15:
            if (r5 == 0) goto L1c
            java.util.List r6 = kotlin.p557z.C13722p.m3941e()
            return r6
        L1c:
            com.google.gson.f r7 = new com.google.gson.f
            r7.<init>()
            ai.kudi.agent.core.util.Pref$fetchLastTransferLookUpResult$1 r8 = new ai.kudi.agent.core.util.Pref$fetchLastTransferLookUpResult$1
            r8.<init>()
            java.lang.reflect.Type r9 = r8.getType()
            java.lang.Object r10 = r7.m20759m(r1, r9)
            java.lang.String r2 = "Gson().fromJson(jsonString, object : TypeToken<List<TransactionRecipient>>() {}.type)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r10, r2)
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            r6 = r11
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.Pref.fetchLastTransferLookUpResult():java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getIncompleteTransactionCount() {
        SharedPreferences $r1 = this.appPref;
        int $i0 = $r1.getInt(PREF_KEY_INCOMPLETE_TRANSACTION_COUNT, 0);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getKycInReview() {
        SharedPreferences $r1 = this.appPref;
        boolean $z0 = $r1.getBoolean(ai.kudi.agent.settings.data.Constants.KYC_IN_REVIEW_PARAM, false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isMPosDeviceActivated() {
        SharedPreferences $r1 = this.mposPref;
        boolean $z0 = $r1.getBoolean(PREF_IS_MPOS_ACTIVATED, false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isMPosDeviceInitialized() {
        SharedPreferences $r1 = this.mposPref;
        boolean $z0 = $r1.getBoolean(PREF_IS_MPOS_INITIALIZED, false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void saveTransferLookUpResult(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return;
        }
        C6784f $r2 = new C6784f();
        Type $r4 = new C6916a<List<? extends TransactionRecipient>>() { // from class: ai.kudi.agent.core.util.Pref$saveTransferLookUpResult$jsonString$1
        }.getType();
        String $r5 = $r2.m20750v(list, $r4);
        SharedPreferences $r6 = this.appPref;
        SharedPreferences.Editor $r7 = $r6.edit();
        $r7.putString(PREF_LAST_TRANSFER_LOOK_UP_RESULT, $r5).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFlagForKycCheckFor(String str) {
        Log_OC.getArray(str, "transactionReference");
        SharedPreferences $r2 = this.kycCheckPref;
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putBoolean(str, true).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setIncompleteTransactionCount(int i) {
        SharedPreferences $r1 = this.appPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putInt(PREF_KEY_INCOMPLETE_TRANSACTION_COUNT, i).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setKycInReview(boolean z) {
        SharedPreferences $r1 = this.appPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(ai.kudi.agent.settings.data.Constants.KYC_IN_REVIEW_PARAM, z).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMPosDeviceActivated() {
        SharedPreferences $r1 = this.mposPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(PREF_IS_MPOS_ACTIVATED, true).apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMPosDeviceInitialized() {
        SharedPreferences $r1 = this.mposPref;
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.putBoolean(PREF_IS_MPOS_INITIALIZED, true).apply();
    }
}
