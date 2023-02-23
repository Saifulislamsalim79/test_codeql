package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OnboardingAnalytics.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001:\u0001#J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J4\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J,\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H&J,\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J,\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OnboardingAnalytics;", "", "bvnVerification", "", AttributeType.PHONE, "", PhoneFragment.ARG_BVN, TransactionField.STATUS, "", "userType", "errorMessage", "createAccountClicked", "enableFingerPrintClicked", "fundWalletOnWelcomeScreenClicked", "learnMoreAboutBVN", "onAgentHavingPendingKyc", "onAgentKycCompleted", "onGetStartedClicked", "onOtpSentForBvnVerification", "score", "", "onPhoneNumberEntered", "onSecondaryPhoneNumberProvided", "onSecondaryPhoneNumberVerified", "onSplashScreenReached", "onWelcomeScreenReached", "outletDetailsSubmitted", "personalDetailsSubmitted", "phoneNumberAndBvnSubmitted", "pinSubmitted", "profilePictureCaptured", "profilePictureUploaded", "skipFingerPrintClicked", "skipOnWelcomeScreenClicked", "verifyPhoneNumber", "EventType", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OnboardingAnalytics {

    /* compiled from: OnboardingAnalytics.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void bvnVerification$default(OnboardingAnalytics onboardingAnalytics, String str, String str2, boolean z, String str3, String $r5, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bvnVerification");
                throw $r6;
            }
            int $i0 = i & 16;
            if ($i0 != 0) {
                $r5 = null;
            }
            onboardingAnalytics.bvnVerification(str, str2, z, str3, $r5);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void outletDetailsSubmitted$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String str2, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: outletDetailsSubmitted");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            onboardingAnalytics.outletDetailsSubmitted(str, z, str2, $r4);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void personalDetailsSubmitted$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String str2, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: personalDetailsSubmitted");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            onboardingAnalytics.personalDetailsSubmitted(str, z, str2, $r4);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void phoneNumberAndBvnSubmitted$default(OnboardingAnalytics onboardingAnalytics, String str, String str2, boolean z, String str3, String $r5, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: phoneNumberAndBvnSubmitted");
                throw $r6;
            }
            int $i0 = i & 16;
            if ($i0 != 0) {
                $r5 = null;
            }
            onboardingAnalytics.phoneNumberAndBvnSubmitted(str, str2, z, str3, $r5);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void pinSubmitted$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String $r3, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pinSubmitted");
                throw $r4;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = null;
            }
            onboardingAnalytics.pinSubmitted(str, z, $r3);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void profilePictureCaptured$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String $r4, String str2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profilePictureCaptured");
                throw $r5;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            onboardingAnalytics.profilePictureCaptured(str, z, $r4, str2);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void profilePictureUploaded$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String $r4, String str2, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profilePictureUploaded");
                throw $r5;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            onboardingAnalytics.profilePictureUploaded(str, z, $r4, str2);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void verifyPhoneNumber$default(OnboardingAnalytics onboardingAnalytics, String str, boolean z, String str2, String $r4, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyPhoneNumber");
                throw $r5;
            }
            int $i0 = i & 8;
            if ($i0 != 0) {
                $r4 = null;
            }
            onboardingAnalytics.verifyPhoneNumber(str, z, str2, $r4);
        }
    }

    /* compiled from: OnboardingAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OnboardingAnalytics$EventType;", "", "()V", "OnboardingFlowEvents", "OnboardingParameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class EventType {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OnboardingAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OnboardingAnalytics$EventType$OnboardingFlowEvents;", "", "(Ljava/lang/String;I)V", "toString", "", "WELCOME_SCREEN_SKIP_CLICKED", "CREATE_ACCOUNT", "LEARN_MORE_BVN", "SUBMIT_PHONE_BVN_SUBMIT", "VERIFY_PHONE_NUMBER", "SUBMIT_PERSONAL_DETAILS", "BVN_VERIFICATION_SUCCESSFUL", "PROFILE_PICTURE_CAPTURED", "PROFILE_PICTURE_UPLOADED", "SUBMIT_OUTLET_DETAILS", "CREATE_PIN", "ONBOARDING_ENABLE_FINGERPRINT_CLICKED", "ONBOARDING_SKIP_FINGERPRINT_CLICKED", "WELCOME_SCREEN_FUND_WALLET_CLICKED", "AGENT_PENDING_KYC", "AGENT_COMPLETED_KYC", "PHONE_NO_ENTERED", "SPLASH_SCREEN_REACHED", "GET_STARTED_CLICKED", "SECONDARY_PHONE_PROVIDED", "SECONDARY_PHONE_VERIFIED", "WELCOME_SCREEN_REACHED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class OnboardingFlowEvents {
            private static final /* synthetic */ OnboardingFlowEvents[] $VALUES;
            public static final OnboardingFlowEvents AGENT_COMPLETED_KYC;
            public static final OnboardingFlowEvents AGENT_PENDING_KYC;
            public static final OnboardingFlowEvents BVN_VERIFICATION_SUCCESSFUL;
            public static final OnboardingFlowEvents CREATE_ACCOUNT;
            public static final OnboardingFlowEvents CREATE_PIN;
            public static final OnboardingFlowEvents GET_STARTED_CLICKED;
            public static final OnboardingFlowEvents LEARN_MORE_BVN;
            public static final OnboardingFlowEvents ONBOARDING_ENABLE_FINGERPRINT_CLICKED;
            public static final OnboardingFlowEvents ONBOARDING_SKIP_FINGERPRINT_CLICKED;
            public static final OnboardingFlowEvents PHONE_NO_ENTERED;
            public static final OnboardingFlowEvents PROFILE_PICTURE_CAPTURED;
            public static final OnboardingFlowEvents PROFILE_PICTURE_UPLOADED;
            public static final OnboardingFlowEvents SECONDARY_PHONE_PROVIDED;
            public static final OnboardingFlowEvents SECONDARY_PHONE_VERIFIED;
            public static final OnboardingFlowEvents SPLASH_SCREEN_REACHED;
            public static final OnboardingFlowEvents SUBMIT_OUTLET_DETAILS;
            public static final OnboardingFlowEvents SUBMIT_PERSONAL_DETAILS;
            public static final OnboardingFlowEvents SUBMIT_PHONE_BVN_SUBMIT;
            public static final OnboardingFlowEvents VERIFY_PHONE_NUMBER;
            public static final OnboardingFlowEvents WELCOME_SCREEN_FUND_WALLET_CLICKED;
            public static final OnboardingFlowEvents WELCOME_SCREEN_REACHED;
            public static final OnboardingFlowEvents WELCOME_SCREEN_SKIP_CLICKED;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ OnboardingFlowEvents[] $values() {
                OnboardingFlowEvents $r1 = WELCOME_SCREEN_SKIP_CLICKED;
                OnboardingFlowEvents $r12 = CREATE_ACCOUNT;
                OnboardingFlowEvents $r13 = LEARN_MORE_BVN;
                OnboardingFlowEvents $r14 = SUBMIT_PHONE_BVN_SUBMIT;
                OnboardingFlowEvents $r15 = VERIFY_PHONE_NUMBER;
                OnboardingFlowEvents $r16 = SUBMIT_PERSONAL_DETAILS;
                OnboardingFlowEvents $r17 = BVN_VERIFICATION_SUCCESSFUL;
                OnboardingFlowEvents $r18 = PROFILE_PICTURE_CAPTURED;
                OnboardingFlowEvents $r19 = PROFILE_PICTURE_UPLOADED;
                OnboardingFlowEvents $r110 = SUBMIT_OUTLET_DETAILS;
                OnboardingFlowEvents $r111 = CREATE_PIN;
                OnboardingFlowEvents $r112 = ONBOARDING_ENABLE_FINGERPRINT_CLICKED;
                OnboardingFlowEvents $r113 = ONBOARDING_SKIP_FINGERPRINT_CLICKED;
                OnboardingFlowEvents $r114 = WELCOME_SCREEN_FUND_WALLET_CLICKED;
                OnboardingFlowEvents $r115 = AGENT_PENDING_KYC;
                OnboardingFlowEvents $r116 = AGENT_COMPLETED_KYC;
                OnboardingFlowEvents $r117 = PHONE_NO_ENTERED;
                OnboardingFlowEvents $r118 = SPLASH_SCREEN_REACHED;
                OnboardingFlowEvents $r119 = GET_STARTED_CLICKED;
                OnboardingFlowEvents $r120 = SECONDARY_PHONE_PROVIDED;
                OnboardingFlowEvents $r121 = SECONDARY_PHONE_VERIFIED;
                OnboardingFlowEvents $r122 = WELCOME_SCREEN_REACHED;
                OnboardingFlowEvents[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117, $r118, $r119, $r120, $r121, $r122};
                return $r0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            static {
                OnboardingFlowEvents $r1 = new OnboardingFlowEvents("WELCOME_SCREEN_SKIP_CLICKED", 0);
                WELCOME_SCREEN_SKIP_CLICKED = $r1;
                OnboardingFlowEvents $r12 = new OnboardingFlowEvents("CREATE_ACCOUNT", 1);
                CREATE_ACCOUNT = $r12;
                OnboardingFlowEvents $r13 = new OnboardingFlowEvents("LEARN_MORE_BVN", 2);
                LEARN_MORE_BVN = $r13;
                OnboardingFlowEvents $r14 = new OnboardingFlowEvents("SUBMIT_PHONE_BVN_SUBMIT", 3);
                SUBMIT_PHONE_BVN_SUBMIT = $r14;
                OnboardingFlowEvents $r15 = new OnboardingFlowEvents("VERIFY_PHONE_NUMBER", 4);
                VERIFY_PHONE_NUMBER = $r15;
                OnboardingFlowEvents $r16 = new OnboardingFlowEvents("SUBMIT_PERSONAL_DETAILS", 5);
                SUBMIT_PERSONAL_DETAILS = $r16;
                OnboardingFlowEvents $r17 = new OnboardingFlowEvents("BVN_VERIFICATION_SUCCESSFUL", 6);
                BVN_VERIFICATION_SUCCESSFUL = $r17;
                OnboardingFlowEvents $r18 = new OnboardingFlowEvents("PROFILE_PICTURE_CAPTURED", 7);
                PROFILE_PICTURE_CAPTURED = $r18;
                OnboardingFlowEvents $r19 = new OnboardingFlowEvents("PROFILE_PICTURE_UPLOADED", 8);
                PROFILE_PICTURE_UPLOADED = $r19;
                OnboardingFlowEvents $r110 = new OnboardingFlowEvents("SUBMIT_OUTLET_DETAILS", 9);
                SUBMIT_OUTLET_DETAILS = $r110;
                OnboardingFlowEvents $r111 = new OnboardingFlowEvents("CREATE_PIN", 10);
                CREATE_PIN = $r111;
                OnboardingFlowEvents $r112 = new OnboardingFlowEvents("ONBOARDING_ENABLE_FINGERPRINT_CLICKED", 11);
                ONBOARDING_ENABLE_FINGERPRINT_CLICKED = $r112;
                OnboardingFlowEvents $r113 = new OnboardingFlowEvents("ONBOARDING_SKIP_FINGERPRINT_CLICKED", 12);
                ONBOARDING_SKIP_FINGERPRINT_CLICKED = $r113;
                OnboardingFlowEvents $r114 = new OnboardingFlowEvents("WELCOME_SCREEN_FUND_WALLET_CLICKED", 13);
                WELCOME_SCREEN_FUND_WALLET_CLICKED = $r114;
                OnboardingFlowEvents $r115 = new OnboardingFlowEvents("AGENT_PENDING_KYC", 14);
                AGENT_PENDING_KYC = $r115;
                OnboardingFlowEvents $r116 = new OnboardingFlowEvents("AGENT_COMPLETED_KYC", 15);
                AGENT_COMPLETED_KYC = $r116;
                OnboardingFlowEvents $r117 = new OnboardingFlowEvents("PHONE_NO_ENTERED", 16);
                PHONE_NO_ENTERED = $r117;
                OnboardingFlowEvents $r118 = new OnboardingFlowEvents("SPLASH_SCREEN_REACHED", 17);
                SPLASH_SCREEN_REACHED = $r118;
                OnboardingFlowEvents $r119 = new OnboardingFlowEvents("GET_STARTED_CLICKED", 18);
                GET_STARTED_CLICKED = $r119;
                OnboardingFlowEvents $r120 = new OnboardingFlowEvents("SECONDARY_PHONE_PROVIDED", 19);
                SECONDARY_PHONE_PROVIDED = $r120;
                OnboardingFlowEvents $r121 = new OnboardingFlowEvents("SECONDARY_PHONE_VERIFIED", 20);
                SECONDARY_PHONE_VERIFIED = $r121;
                OnboardingFlowEvents $r122 = new OnboardingFlowEvents("WELCOME_SCREEN_REACHED", 21);
                WELCOME_SCREEN_REACHED = $r122;
                OnboardingFlowEvents[] $r0 = $values();
                $VALUES = $r0;
            }

            private OnboardingFlowEvents(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static OnboardingFlowEvents valueOf(String str) {
                Enum $r0 = Enum.valueOf(OnboardingFlowEvents.class, str);
                OnboardingFlowEvents $r2 = (OnboardingFlowEvents) $r0;
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
            public static OnboardingFlowEvents[] values() {
                OnboardingFlowEvents[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                OnboardingFlowEvents[] $r12 = (OnboardingFlowEvents[]) $r0;
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // java.lang.Enum
            public String toString() {
                String $r1 = name();
                if ($r1 == null) {
                    NullPointerException $r2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r2;
                }
                String $r12 = $r1.toLowerCase();
                Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase()");
                return $r12;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OnboardingAnalytics.kt */
        @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/OnboardingAnalytics$EventType$OnboardingParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "PHONE_NUMBER", Constants.IS_BVN_VERIFIED, "SCORE", "STATUS", "USERTYPE", "ERROR_MESSAGE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class OnboardingParameters {
            private static final /* synthetic */ OnboardingParameters[] $VALUES;
            public static final OnboardingParameters ERROR_MESSAGE;
            public static final OnboardingParameters IS_CLOSED;
            public static final OnboardingParameters PHONE_NUMBER;
            public static final OnboardingParameters SCORE;
            public static final OnboardingParameters STATUS;
            public static final OnboardingParameters USERTYPE;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            private static final /* synthetic */ OnboardingParameters[] $values() {
                OnboardingParameters $r1 = PHONE_NUMBER;
                OnboardingParameters $r12 = IS_CLOSED;
                OnboardingParameters $r13 = SCORE;
                OnboardingParameters $r14 = STATUS;
                OnboardingParameters $r15 = USERTYPE;
                OnboardingParameters $r16 = ERROR_MESSAGE;
                OnboardingParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16};
                return $r0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            static {
                OnboardingParameters $r1 = new OnboardingParameters("PHONE_NUMBER", 0);
                PHONE_NUMBER = $r1;
                OnboardingParameters $r12 = new OnboardingParameters(Constants.IS_BVN_VERIFIED, 1);
                IS_CLOSED = $r12;
                OnboardingParameters $r13 = new OnboardingParameters("SCORE", 2);
                SCORE = $r13;
                OnboardingParameters $r14 = new OnboardingParameters("STATUS", 3);
                STATUS = $r14;
                OnboardingParameters $r15 = new OnboardingParameters("USERTYPE", 4);
                USERTYPE = $r15;
                OnboardingParameters $r16 = new OnboardingParameters("ERROR_MESSAGE", 5);
                ERROR_MESSAGE = $r16;
                OnboardingParameters[] $r0 = $values();
                $VALUES = $r0;
            }

            private OnboardingParameters(String str, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            public static OnboardingParameters valueOf(String str) {
                Enum $r0 = Enum.valueOf(OnboardingParameters.class, str);
                OnboardingParameters $r2 = (OnboardingParameters) $r0;
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
            public static OnboardingParameters[] values() {
                OnboardingParameters[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                OnboardingParameters[] $r12 = (OnboardingParameters[]) $r0;
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // java.lang.Enum
            public String toString() {
                String $r1 = name();
                if ($r1 == null) {
                    NullPointerException $r2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    throw $r2;
                }
                String $r12 = $r1.toLowerCase();
                Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase()");
                return $r12;
            }
        }
    }

    void bvnVerification(String str, String str2, boolean z, String str3, String str4);

    void createAccountClicked();

    void enableFingerPrintClicked(String str);

    void fundWalletOnWelcomeScreenClicked(String str, String str2);

    void learnMoreAboutBVN(String str);

    void onAgentHavingPendingKyc(String str);

    void onAgentKycCompleted(String str);

    void onGetStartedClicked();

    void onOtpSentForBvnVerification(String str, int i);

    void onPhoneNumberEntered(String str);

    void onSecondaryPhoneNumberProvided(String str);

    void onSecondaryPhoneNumberVerified(String str);

    void onSplashScreenReached();

    void onWelcomeScreenReached(String str);

    void outletDetailsSubmitted(String str, boolean z, String str2, String str3);

    void personalDetailsSubmitted(String str, boolean z, String str2, String str3);

    void phoneNumberAndBvnSubmitted(String str, String str2, boolean z, String str3, String str4);

    void pinSubmitted(String str, boolean z, String str2);

    void profilePictureCaptured(String str, boolean z, String str2, String str3);

    void profilePictureUploaded(String str, boolean z, String str2, String str3);

    void skipFingerPrintClicked(String str);

    void skipOnWelcomeScreenClicked(String str, String str2);

    void verifyPhoneNumber(String str, boolean z, String str2, String str3);
}
