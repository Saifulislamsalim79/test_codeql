package ai.kudi.agent.core.analytics.contracts;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueResolutionAnalytics.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/IssueResolutionAnalytics;", "", "()V", "Actions", "Events", "Parameters", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueResolutionAnalytics {

    /* compiled from: IssueResolutionAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/IssueResolutionAnalytics$Actions;", "", "onAttachmentAdded", "", "phoneNumber", "", "count", "", "onCallUsClicked", "onCheckAppBuildClicked", "onContactUsReached", "onIssueHistoryClicked", "onIssueHistoryFilterClicked", "onIssueHistorySelected", "onIssueRated", "rating", "onIssueStatusCheckClicked", "onIssueSummaryPageReached", "onIssueTypeClicked", "issueType", TransactionField.STATUS, "onSocialNetworkClicked", "socialNetwork", "onSubmitIssueClicked", "onSupportButtonClicked", "onVisitWebsiteClicked", "reviewOurAppClicked", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Actions {
        void onAttachmentAdded(String str, int i);

        void onCallUsClicked(String str);

        void onCheckAppBuildClicked(String str);

        void onContactUsReached(String str);

        void onIssueHistoryClicked(String str);

        void onIssueHistoryFilterClicked(String str);

        void onIssueHistorySelected(String str);

        void onIssueRated(String str, int i);

        void onIssueStatusCheckClicked(String str);

        void onIssueSummaryPageReached(String str);

        void onIssueTypeClicked(String str, String str2, String str3);

        void onSocialNetworkClicked(String str, String str2);

        void onSubmitIssueClicked(String str, String str2);

        void onSupportButtonClicked(String str, String str2);

        void onVisitWebsiteClicked(String str);

        void reviewOurAppClicked(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IssueResolutionAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/IssueResolutionAnalytics$Events;", "", "(Ljava/lang/String;I)V", "toString", "", "SUPPORT_MENU_CLICKED", "ISSUE_TYPE_CLICKED", "CALL_US_CLICKED", "CHECK_APP_BUILD_CLICKED", "REVIEW_APP_CLICKED", "VISIT_WEBSITE_CLICKED", "SOCIAL_NETWORK_CLICKED", "ISSUE_SUMMARY_REACHED", "SUBMIT_ISSUE_CLICKED", "ISSUE_RATED", "ISSUE_STATUS_CLICKED", "ON_CONTACT_US_REACHED", "ATTACHMENT_ADDED", "ISSUE_HISTORY", "ISSUE_SELECTION", "ISSUE_FILTER", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Events {
        private static final /* synthetic */ Events[] $VALUES;
        public static final Events ATTACHMENT_ADDED;
        public static final Events CALL_US_CLICKED;
        public static final Events CHECK_APP_BUILD_CLICKED;
        public static final Events ISSUE_FILTER;
        public static final Events ISSUE_HISTORY;
        public static final Events ISSUE_RATED;
        public static final Events ISSUE_SELECTION;
        public static final Events ISSUE_STATUS_CLICKED;
        public static final Events ISSUE_SUMMARY_REACHED;
        public static final Events ISSUE_TYPE_CLICKED;
        public static final Events ON_CONTACT_US_REACHED;
        public static final Events REVIEW_APP_CLICKED;
        public static final Events SOCIAL_NETWORK_CLICKED;
        public static final Events SUBMIT_ISSUE_CLICKED;
        public static final Events SUPPORT_MENU_CLICKED;
        public static final Events VISIT_WEBSITE_CLICKED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Events[] $values() {
            Events $r1 = SUPPORT_MENU_CLICKED;
            Events $r12 = ISSUE_TYPE_CLICKED;
            Events $r13 = CALL_US_CLICKED;
            Events $r14 = CHECK_APP_BUILD_CLICKED;
            Events $r15 = REVIEW_APP_CLICKED;
            Events $r16 = VISIT_WEBSITE_CLICKED;
            Events $r17 = SOCIAL_NETWORK_CLICKED;
            Events $r18 = ISSUE_SUMMARY_REACHED;
            Events $r19 = SUBMIT_ISSUE_CLICKED;
            Events $r110 = ISSUE_RATED;
            Events $r111 = ISSUE_STATUS_CLICKED;
            Events $r112 = ON_CONTACT_US_REACHED;
            Events $r113 = ATTACHMENT_ADDED;
            Events $r114 = ISSUE_HISTORY;
            Events $r115 = ISSUE_SELECTION;
            Events $r116 = ISSUE_FILTER;
            Events[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116};
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
            Events $r1 = new Events("SUPPORT_MENU_CLICKED", 0);
            SUPPORT_MENU_CLICKED = $r1;
            Events $r12 = new Events("ISSUE_TYPE_CLICKED", 1);
            ISSUE_TYPE_CLICKED = $r12;
            Events $r13 = new Events("CALL_US_CLICKED", 2);
            CALL_US_CLICKED = $r13;
            Events $r14 = new Events("CHECK_APP_BUILD_CLICKED", 3);
            CHECK_APP_BUILD_CLICKED = $r14;
            Events $r15 = new Events("REVIEW_APP_CLICKED", 4);
            REVIEW_APP_CLICKED = $r15;
            Events $r16 = new Events("VISIT_WEBSITE_CLICKED", 5);
            VISIT_WEBSITE_CLICKED = $r16;
            Events $r17 = new Events("SOCIAL_NETWORK_CLICKED", 6);
            SOCIAL_NETWORK_CLICKED = $r17;
            Events $r18 = new Events("ISSUE_SUMMARY_REACHED", 7);
            ISSUE_SUMMARY_REACHED = $r18;
            Events $r19 = new Events("SUBMIT_ISSUE_CLICKED", 8);
            SUBMIT_ISSUE_CLICKED = $r19;
            Events $r110 = new Events("ISSUE_RATED", 9);
            ISSUE_RATED = $r110;
            Events $r111 = new Events("ISSUE_STATUS_CLICKED", 10);
            ISSUE_STATUS_CLICKED = $r111;
            Events $r112 = new Events("ON_CONTACT_US_REACHED", 11);
            ON_CONTACT_US_REACHED = $r112;
            Events $r113 = new Events("ATTACHMENT_ADDED", 12);
            ATTACHMENT_ADDED = $r113;
            Events $r114 = new Events("ISSUE_HISTORY", 13);
            ISSUE_HISTORY = $r114;
            Events $r115 = new Events("ISSUE_SELECTION", 14);
            ISSUE_SELECTION = $r115;
            Events $r116 = new Events("ISSUE_FILTER", 15);
            ISSUE_FILTER = $r116;
            Events[] $r0 = $values();
            $VALUES = $r0;
        }

        private Events(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static Events valueOf(String str) {
            Enum $r0 = Enum.valueOf(Events.class, str);
            Events $r2 = (Events) $r0;
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
        public static Events[] values() {
            Events[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            Events[] $r12 = (Events[]) $r0;
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
            Locale $r2 = Locale.getDefault();
            Log_OC.loadImage($r2, "getDefault()");
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r3;
            }
            String $r12 = $r1.toLowerCase($r2);
            Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase(locale)");
            return $r12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IssueResolutionAnalytics.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/contracts/IssueResolutionAnalytics$Parameters;", "", "(Ljava/lang/String;I)V", "toString", "", "COUNT", "PHONE_NUMBER", "STATUS", "ISSUE_TYPE", "RATING", "SOCIAL_NETWORK", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private static final /* synthetic */ Parameters[] $VALUES;
        public static final Parameters COUNT;
        public static final Parameters ISSUE_TYPE;
        public static final Parameters PHONE_NUMBER;
        public static final Parameters RATING;
        public static final Parameters SOCIAL_NETWORK;
        public static final Parameters STATUS;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ Parameters[] $values() {
            Parameters $r1 = COUNT;
            Parameters $r12 = PHONE_NUMBER;
            Parameters $r13 = STATUS;
            Parameters $r14 = ISSUE_TYPE;
            Parameters $r15 = RATING;
            Parameters $r16 = SOCIAL_NETWORK;
            Parameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16};
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
            Parameters $r1 = new Parameters("COUNT", 0);
            COUNT = $r1;
            Parameters $r12 = new Parameters("PHONE_NUMBER", 1);
            PHONE_NUMBER = $r12;
            Parameters $r13 = new Parameters("STATUS", 2);
            STATUS = $r13;
            Parameters $r14 = new Parameters("ISSUE_TYPE", 3);
            ISSUE_TYPE = $r14;
            Parameters $r15 = new Parameters("RATING", 4);
            RATING = $r15;
            Parameters $r16 = new Parameters("SOCIAL_NETWORK", 5);
            SOCIAL_NETWORK = $r16;
            Parameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private Parameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static Parameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(Parameters.class, str);
            Parameters $r2 = (Parameters) $r0;
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
        public static Parameters[] values() {
            Parameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            Parameters[] $r12 = (Parameters[]) $r0;
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
            Locale $r2 = Locale.getDefault();
            Log_OC.loadImage($r2, "getDefault()");
            if ($r1 == null) {
                NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r3;
            }
            String $r12 = $r1.toLowerCase($r2);
            Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase(locale)");
            return $r12;
        }
    }
}
