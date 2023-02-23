package ai.kudi.agent.core.analytics;

import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: EventType.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType;", "", "()V", "AgentRegistrationParameters", "AgentRegistrationType", "DashboardParameters", "DashboardType", "IssueParameters", "IssueResolkutionParams", "IssueResolutionTypes", "IssueTypes", "LoginParameters", "LoginTypes", "NoticationType", "NotificationParameters", "TransactionParameters", "TransactionTypes", "UnAuthorizedInstallationTypes", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EventType {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$AgentRegistrationParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "AGENT_NAME", "AGENT_PHONE_NUMBER", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AgentRegistrationParameters {
        private static final /* synthetic */ AgentRegistrationParameters[] $VALUES;
        public static final AgentRegistrationParameters AGENT_NAME;
        public static final AgentRegistrationParameters AGENT_PHONE_NUMBER;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ AgentRegistrationParameters[] $values() {
            AgentRegistrationParameters $r1 = AGENT_NAME;
            AgentRegistrationParameters $r12 = AGENT_PHONE_NUMBER;
            AgentRegistrationParameters[] $r0 = {$r1, $r12};
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
            AgentRegistrationParameters $r1 = new AgentRegistrationParameters("AGENT_NAME", 0);
            AGENT_NAME = $r1;
            AgentRegistrationParameters $r12 = new AgentRegistrationParameters("AGENT_PHONE_NUMBER", 1);
            AGENT_PHONE_NUMBER = $r12;
            AgentRegistrationParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private AgentRegistrationParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static AgentRegistrationParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(AgentRegistrationParameters.class, str);
            AgentRegistrationParameters $r2 = (AgentRegistrationParameters) $r0;
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
        public static AgentRegistrationParameters[] values() {
            AgentRegistrationParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            AgentRegistrationParameters[] $r12 = (AgentRegistrationParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$AgentRegistrationType;", "", "(Ljava/lang/String;I)V", "toString", "", "AGENT_CREATION", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class AgentRegistrationType {
        private static final /* synthetic */ AgentRegistrationType[] $VALUES;
        public static final AgentRegistrationType AGENT_CREATION;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ AgentRegistrationType[] $values() {
            AgentRegistrationType $r0 = AGENT_CREATION;
            AgentRegistrationType[] $r1 = {$r0};
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
        static {
            AgentRegistrationType $r1 = new AgentRegistrationType("AGENT_CREATION", 0);
            AGENT_CREATION = $r1;
            AgentRegistrationType[] $r0 = $values();
            $VALUES = $r0;
        }

        private AgentRegistrationType(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static AgentRegistrationType valueOf(String str) {
            Enum $r0 = Enum.valueOf(AgentRegistrationType.class, str);
            AgentRegistrationType $r2 = (AgentRegistrationType) $r0;
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
        public static AgentRegistrationType[] values() {
            AgentRegistrationType[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            AgentRegistrationType[] $r12 = (AgentRegistrationType[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$DashboardParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "DASHBOARD_EVENT_TYPE", "APPLY_FILTER_DATE_BUTTON_CLICKED", "VIEW_BREAKDOWN_CLICKED", "DATE_TO_FILTER_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DashboardParameters {
        private static final /* synthetic */ DashboardParameters[] $VALUES;
        public static final DashboardParameters APPLY_FILTER_DATE_BUTTON_CLICKED;
        public static final DashboardParameters DASHBOARD_EVENT_TYPE;
        public static final DashboardParameters DATE_TO_FILTER_CLICKED;
        public static final DashboardParameters VIEW_BREAKDOWN_CLICKED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ DashboardParameters[] $values() {
            DashboardParameters $r1 = DASHBOARD_EVENT_TYPE;
            DashboardParameters $r12 = APPLY_FILTER_DATE_BUTTON_CLICKED;
            DashboardParameters $r13 = VIEW_BREAKDOWN_CLICKED;
            DashboardParameters $r14 = DATE_TO_FILTER_CLICKED;
            DashboardParameters[] $r0 = {$r1, $r12, $r13, $r14};
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
            DashboardParameters $r1 = new DashboardParameters("DASHBOARD_EVENT_TYPE", 0);
            DASHBOARD_EVENT_TYPE = $r1;
            DashboardParameters $r12 = new DashboardParameters("APPLY_FILTER_DATE_BUTTON_CLICKED", 1);
            APPLY_FILTER_DATE_BUTTON_CLICKED = $r12;
            DashboardParameters $r13 = new DashboardParameters("VIEW_BREAKDOWN_CLICKED", 2);
            VIEW_BREAKDOWN_CLICKED = $r13;
            DashboardParameters $r14 = new DashboardParameters("DATE_TO_FILTER_CLICKED", 3);
            DATE_TO_FILTER_CLICKED = $r14;
            DashboardParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private DashboardParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static DashboardParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(DashboardParameters.class, str);
            DashboardParameters $r2 = (DashboardParameters) $r0;
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
        public static DashboardParameters[] values() {
            DashboardParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            DashboardParameters[] $r12 = (DashboardParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$DashboardType;", "", "(Ljava/lang/String;I)V", "toString", "", "DASHBOARD", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DashboardType {
        private static final /* synthetic */ DashboardType[] $VALUES;
        public static final DashboardType DASHBOARD;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ DashboardType[] $values() {
            DashboardType $r0 = DASHBOARD;
            DashboardType[] $r1 = {$r0};
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
        static {
            DashboardType $r1 = new DashboardType("DASHBOARD", 0);
            DASHBOARD = $r1;
            DashboardType[] $r0 = $values();
            $VALUES = $r0;
        }

        private DashboardType(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static DashboardType valueOf(String str) {
            Enum $r0 = Enum.valueOf(DashboardType.class, str);
            DashboardType $r2 = (DashboardType) $r0;
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
        public static DashboardType[] values() {
            DashboardType[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            DashboardType[] $r12 = (DashboardType[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$IssueParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "REFERENCE", "KYC_LEVEL", "TYPE", "HELP_OPTION", PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, "COMMENT", "ISSUE_TITLE", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IssueParameters {
        private static final /* synthetic */ IssueParameters[] $VALUES;
        public static final IssueParameters AMOUNT;
        public static final IssueParameters COMMENT;
        public static final IssueParameters HELP_OPTION;
        public static final IssueParameters ISSUE_TITLE;
        public static final IssueParameters KYC_LEVEL;
        public static final IssueParameters REFERENCE;
        public static final IssueParameters TYPE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ IssueParameters[] $values() {
            IssueParameters $r1 = REFERENCE;
            IssueParameters $r12 = KYC_LEVEL;
            IssueParameters $r13 = TYPE;
            IssueParameters $r14 = HELP_OPTION;
            IssueParameters $r15 = AMOUNT;
            IssueParameters $r16 = COMMENT;
            IssueParameters $r17 = ISSUE_TITLE;
            IssueParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17};
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
            IssueParameters $r1 = new IssueParameters("REFERENCE", 0);
            REFERENCE = $r1;
            IssueParameters $r12 = new IssueParameters("KYC_LEVEL", 1);
            KYC_LEVEL = $r12;
            IssueParameters $r13 = new IssueParameters("TYPE", 2);
            TYPE = $r13;
            IssueParameters $r14 = new IssueParameters("HELP_OPTION", 3);
            HELP_OPTION = $r14;
            IssueParameters $r15 = new IssueParameters(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, 4);
            AMOUNT = $r15;
            IssueParameters $r16 = new IssueParameters("COMMENT", 5);
            COMMENT = $r16;
            IssueParameters $r17 = new IssueParameters("ISSUE_TITLE", 6);
            ISSUE_TITLE = $r17;
            IssueParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private IssueParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static IssueParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(IssueParameters.class, str);
            IssueParameters $r2 = (IssueParameters) $r0;
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
        public static IssueParameters[] values() {
            IssueParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            IssueParameters[] $r12 = (IssueParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$IssueResolkutionParams;", "", "(Ljava/lang/String;I)V", "toString", "", "ISSUE_TYPE", "ISSUE_DESCRIPTION", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IssueResolkutionParams {
        private static final /* synthetic */ IssueResolkutionParams[] $VALUES;
        public static final IssueResolkutionParams ISSUE_DESCRIPTION;
        public static final IssueResolkutionParams ISSUE_TYPE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ IssueResolkutionParams[] $values() {
            IssueResolkutionParams $r1 = ISSUE_TYPE;
            IssueResolkutionParams $r12 = ISSUE_DESCRIPTION;
            IssueResolkutionParams[] $r0 = {$r1, $r12};
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
            IssueResolkutionParams $r1 = new IssueResolkutionParams("ISSUE_TYPE", 0);
            ISSUE_TYPE = $r1;
            IssueResolkutionParams $r12 = new IssueResolkutionParams("ISSUE_DESCRIPTION", 1);
            ISSUE_DESCRIPTION = $r12;
            IssueResolkutionParams[] $r0 = $values();
            $VALUES = $r0;
        }

        private IssueResolkutionParams(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static IssueResolkutionParams valueOf(String str) {
            Enum $r0 = Enum.valueOf(IssueResolkutionParams.class, str);
            IssueResolkutionParams $r2 = (IssueResolkutionParams) $r0;
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
        public static IssueResolkutionParams[] values() {
            IssueResolkutionParams[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            IssueResolkutionParams[] $r12 = (IssueResolkutionParams[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$IssueResolutionTypes;", "", "(Ljava/lang/String;I)V", "HELPFUL", "NOT_HELPFUL", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IssueResolutionTypes {
        private static final /* synthetic */ IssueResolutionTypes[] $VALUES;
        public static final IssueResolutionTypes HELPFUL;
        public static final IssueResolutionTypes NOT_HELPFUL;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ IssueResolutionTypes[] $values() {
            IssueResolutionTypes $r1 = HELPFUL;
            IssueResolutionTypes $r12 = NOT_HELPFUL;
            IssueResolutionTypes[] $r0 = {$r1, $r12};
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
            IssueResolutionTypes $r1 = new IssueResolutionTypes("HELPFUL", 0);
            HELPFUL = $r1;
            IssueResolutionTypes $r12 = new IssueResolutionTypes("NOT_HELPFUL", 1);
            NOT_HELPFUL = $r12;
            IssueResolutionTypes[] $r0 = $values();
            $VALUES = $r0;
        }

        private IssueResolutionTypes(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static IssueResolutionTypes valueOf(String str) {
            Enum $r0 = Enum.valueOf(IssueResolutionTypes.class, str);
            IssueResolutionTypes $r2 = (IssueResolutionTypes) $r0;
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
        public static IssueResolutionTypes[] values() {
            IssueResolutionTypes[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            IssueResolutionTypes[] $r12 = (IssueResolutionTypes[]) $r0;
            return $r12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$IssueTypes;", "", "(Ljava/lang/String;I)V", "toString", "", "NEED_HELP_CLICKED", "HELP_TEXT_HELPFUL_CLICKED", "HELP_TEXT_UNHELPFUL_CLICKED", "ISSUE_SUBMITTED", "SEND_A_MESSAGE_CLICKED", "CHAT_WITH_US_CLICKED", "FAQ_CLICKED", "CALL_US_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IssueTypes {
        private static final /* synthetic */ IssueTypes[] $VALUES;
        public static final IssueTypes CALL_US_CLICKED;
        public static final IssueTypes CHAT_WITH_US_CLICKED;
        public static final IssueTypes FAQ_CLICKED;
        public static final IssueTypes HELP_TEXT_HELPFUL_CLICKED;
        public static final IssueTypes HELP_TEXT_UNHELPFUL_CLICKED;
        public static final IssueTypes ISSUE_SUBMITTED;
        public static final IssueTypes NEED_HELP_CLICKED;
        public static final IssueTypes SEND_A_MESSAGE_CLICKED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ IssueTypes[] $values() {
            IssueTypes $r1 = NEED_HELP_CLICKED;
            IssueTypes $r12 = HELP_TEXT_HELPFUL_CLICKED;
            IssueTypes $r13 = HELP_TEXT_UNHELPFUL_CLICKED;
            IssueTypes $r14 = ISSUE_SUBMITTED;
            IssueTypes $r15 = SEND_A_MESSAGE_CLICKED;
            IssueTypes $r16 = CHAT_WITH_US_CLICKED;
            IssueTypes $r17 = FAQ_CLICKED;
            IssueTypes $r18 = CALL_US_CLICKED;
            IssueTypes[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18};
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
            IssueTypes $r1 = new IssueTypes("NEED_HELP_CLICKED", 0);
            NEED_HELP_CLICKED = $r1;
            IssueTypes $r12 = new IssueTypes("HELP_TEXT_HELPFUL_CLICKED", 1);
            HELP_TEXT_HELPFUL_CLICKED = $r12;
            IssueTypes $r13 = new IssueTypes("HELP_TEXT_UNHELPFUL_CLICKED", 2);
            HELP_TEXT_UNHELPFUL_CLICKED = $r13;
            IssueTypes $r14 = new IssueTypes("ISSUE_SUBMITTED", 3);
            ISSUE_SUBMITTED = $r14;
            IssueTypes $r15 = new IssueTypes("SEND_A_MESSAGE_CLICKED", 4);
            SEND_A_MESSAGE_CLICKED = $r15;
            IssueTypes $r16 = new IssueTypes("CHAT_WITH_US_CLICKED", 5);
            CHAT_WITH_US_CLICKED = $r16;
            IssueTypes $r17 = new IssueTypes("FAQ_CLICKED", 6);
            FAQ_CLICKED = $r17;
            IssueTypes $r18 = new IssueTypes("CALL_US_CLICKED", 7);
            CALL_US_CLICKED = $r18;
            IssueTypes[] $r0 = $values();
            $VALUES = $r0;
        }

        private IssueTypes(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static IssueTypes valueOf(String str) {
            Enum $r0 = Enum.valueOf(IssueTypes.class, str);
            IssueTypes $r2 = (IssueTypes) $r0;
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
        public static IssueTypes[] values() {
            IssueTypes[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            IssueTypes[] $r12 = (IssueTypes[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$LoginParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "IS_LOGIN_SUCCESSFUL", "ERROR_MESSAGE", "PHONE_NUMBER", "DEVICE_NAME", "DEVICE_ID", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LoginParameters {
        private static final /* synthetic */ LoginParameters[] $VALUES;
        public static final LoginParameters DEVICE_ID;
        public static final LoginParameters DEVICE_NAME;
        public static final LoginParameters ERROR_MESSAGE;
        public static final LoginParameters IS_LOGIN_SUCCESSFUL;
        public static final LoginParameters PHONE_NUMBER;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ LoginParameters[] $values() {
            LoginParameters $r1 = IS_LOGIN_SUCCESSFUL;
            LoginParameters $r12 = ERROR_MESSAGE;
            LoginParameters $r13 = PHONE_NUMBER;
            LoginParameters $r14 = DEVICE_NAME;
            LoginParameters $r15 = DEVICE_ID;
            LoginParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15};
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
            LoginParameters $r1 = new LoginParameters("IS_LOGIN_SUCCESSFUL", 0);
            IS_LOGIN_SUCCESSFUL = $r1;
            LoginParameters $r12 = new LoginParameters("ERROR_MESSAGE", 1);
            ERROR_MESSAGE = $r12;
            LoginParameters $r13 = new LoginParameters("PHONE_NUMBER", 2);
            PHONE_NUMBER = $r13;
            LoginParameters $r14 = new LoginParameters("DEVICE_NAME", 3);
            DEVICE_NAME = $r14;
            LoginParameters $r15 = new LoginParameters("DEVICE_ID", 4);
            DEVICE_ID = $r15;
            LoginParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private LoginParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static LoginParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(LoginParameters.class, str);
            LoginParameters $r2 = (LoginParameters) $r0;
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
        public static LoginParameters[] values() {
            LoginParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            LoginParameters[] $r12 = (LoginParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$LoginTypes;", "", "(Ljava/lang/String;I)V", "toString", "", "LOGIN", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LoginTypes {
        private static final /* synthetic */ LoginTypes[] $VALUES;
        public static final LoginTypes LOGIN;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ LoginTypes[] $values() {
            LoginTypes $r0 = LOGIN;
            LoginTypes[] $r1 = {$r0};
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
        static {
            LoginTypes $r1 = new LoginTypes("LOGIN", 0);
            LOGIN = $r1;
            LoginTypes[] $r0 = $values();
            $VALUES = $r0;
        }

        private LoginTypes(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static LoginTypes valueOf(String str) {
            Enum $r0 = Enum.valueOf(LoginTypes.class, str);
            LoginTypes $r2 = (LoginTypes) $r0;
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
        public static LoginTypes[] values() {
            LoginTypes[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            LoginTypes[] $r12 = (LoginTypes[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$NoticationType;", "", "(Ljava/lang/String;I)V", "toString", "", "NOTIFICATION_ICON", "NOTIFICATION_MENU", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NoticationType {
        private static final /* synthetic */ NoticationType[] $VALUES;
        public static final NoticationType NOTIFICATION_ICON;
        public static final NoticationType NOTIFICATION_MENU;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ NoticationType[] $values() {
            NoticationType $r1 = NOTIFICATION_ICON;
            NoticationType $r12 = NOTIFICATION_MENU;
            NoticationType[] $r0 = {$r1, $r12};
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
            NoticationType $r1 = new NoticationType("NOTIFICATION_ICON", 0);
            NOTIFICATION_ICON = $r1;
            NoticationType $r12 = new NoticationType("NOTIFICATION_MENU", 1);
            NOTIFICATION_MENU = $r12;
            NoticationType[] $r0 = $values();
            $VALUES = $r0;
        }

        private NoticationType(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static NoticationType valueOf(String str) {
            Enum $r0 = Enum.valueOf(NoticationType.class, str);
            NoticationType $r2 = (NoticationType) $r0;
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
        public static NoticationType[] values() {
            NoticationType[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            NoticationType[] $r12 = (NoticationType[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$NotificationParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "NUMBER_OF_UNREAD_NOTIFICATION", "NUMBER_OF_READ_NOTIFICATION", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NotificationParameters {
        private static final /* synthetic */ NotificationParameters[] $VALUES;
        public static final NotificationParameters NUMBER_OF_READ_NOTIFICATION;
        public static final NotificationParameters NUMBER_OF_UNREAD_NOTIFICATION;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ NotificationParameters[] $values() {
            NotificationParameters $r1 = NUMBER_OF_UNREAD_NOTIFICATION;
            NotificationParameters $r12 = NUMBER_OF_READ_NOTIFICATION;
            NotificationParameters[] $r0 = {$r1, $r12};
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
            NotificationParameters $r1 = new NotificationParameters("NUMBER_OF_UNREAD_NOTIFICATION", 0);
            NUMBER_OF_UNREAD_NOTIFICATION = $r1;
            NotificationParameters $r12 = new NotificationParameters("NUMBER_OF_READ_NOTIFICATION", 1);
            NUMBER_OF_READ_NOTIFICATION = $r12;
            NotificationParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private NotificationParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static NotificationParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(NotificationParameters.class, str);
            NotificationParameters $r2 = (NotificationParameters) $r0;
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
        public static NotificationParameters[] values() {
            NotificationParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            NotificationParameters[] $r12 = (NotificationParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$TransactionParameters;", "", "(Ljava/lang/String;I)V", "toString", "", "REFERENCE", IssueTypeFragment.TRANSACTION_TYPE, "PRODUCT_ID", "TYPE", "STATUS", "TIME_FROM", "TIME_TO", "FEE", PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransactionParameters {
        private static final /* synthetic */ TransactionParameters[] $VALUES;
        public static final TransactionParameters AMOUNT;
        public static final TransactionParameters IOERR;
        public static final TransactionParameters PRODUCT_ID;
        public static final TransactionParameters REFERENCE;
        public static final TransactionParameters STATUS;
        public static final TransactionParameters TIME_FROM;
        public static final TransactionParameters TIME_TO;
        public static final TransactionParameters TRANSACTION_TYPE;
        public static final TransactionParameters TYPE;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ TransactionParameters[] $values() {
            TransactionParameters $r1 = REFERENCE;
            TransactionParameters $r12 = TRANSACTION_TYPE;
            TransactionParameters $r13 = PRODUCT_ID;
            TransactionParameters $r14 = TYPE;
            TransactionParameters $r15 = STATUS;
            TransactionParameters $r16 = TIME_FROM;
            TransactionParameters $r17 = TIME_TO;
            TransactionParameters $r18 = IOERR;
            TransactionParameters $r19 = AMOUNT;
            TransactionParameters[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19};
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
            TransactionParameters $r1 = new TransactionParameters("REFERENCE", 0);
            REFERENCE = $r1;
            TransactionParameters $r12 = new TransactionParameters(IssueTypeFragment.TRANSACTION_TYPE, 1);
            TRANSACTION_TYPE = $r12;
            TransactionParameters $r13 = new TransactionParameters("PRODUCT_ID", 2);
            PRODUCT_ID = $r13;
            TransactionParameters $r14 = new TransactionParameters("TYPE", 3);
            TYPE = $r14;
            TransactionParameters $r15 = new TransactionParameters("STATUS", 4);
            STATUS = $r15;
            TransactionParameters $r16 = new TransactionParameters("TIME_FROM", 5);
            TIME_FROM = $r16;
            TransactionParameters $r17 = new TransactionParameters("TIME_TO", 6);
            TIME_TO = $r17;
            TransactionParameters $r18 = new TransactionParameters("FEE", 7);
            IOERR = $r18;
            TransactionParameters $r19 = new TransactionParameters(PaybackLoanConfirmationDialog.SQL_UPDATE_6_4, 8);
            AMOUNT = $r19;
            TransactionParameters[] $r0 = $values();
            $VALUES = $r0;
        }

        private TransactionParameters(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static TransactionParameters valueOf(String str) {
            Enum $r0 = Enum.valueOf(TransactionParameters.class, str);
            TransactionParameters $r2 = (TransactionParameters) $r0;
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
        public static TransactionParameters[] values() {
            TransactionParameters[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            TransactionParameters[] $r12 = (TransactionParameters[]) $r0;
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
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$TransactionTypes;", "", "(Ljava/lang/String;I)V", "TRANSACTION_FILTERED_CLICKED", "SUBMIT_FILTER_CLICKED", "TRANSACTION_REFERESH", "TRANSACTION_CREATION", "TRANSACTION_PRICE_FETCH", "TRANSACTION_AUTHORIZATION", "TRANSACTION_INITIATED", "TRANSACTION_LOOKUP", "TRANSACTION_PRINTER_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransactionTypes {
        private static final /* synthetic */ TransactionTypes[] $VALUES;
        public static final TransactionTypes SUBMIT_FILTER_CLICKED;
        public static final TransactionTypes TRANSACTION_AUTHORIZATION;
        public static final TransactionTypes TRANSACTION_CREATION;
        public static final TransactionTypes TRANSACTION_FILTERED_CLICKED;
        public static final TransactionTypes TRANSACTION_INITIATED;
        public static final TransactionTypes TRANSACTION_LOOKUP;
        public static final TransactionTypes TRANSACTION_PRICE_FETCH;
        public static final TransactionTypes TRANSACTION_PRINTER_CLICKED;
        public static final TransactionTypes TRANSACTION_REFERESH;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ TransactionTypes[] $values() {
            TransactionTypes $r1 = TRANSACTION_FILTERED_CLICKED;
            TransactionTypes $r12 = SUBMIT_FILTER_CLICKED;
            TransactionTypes $r13 = TRANSACTION_REFERESH;
            TransactionTypes $r14 = TRANSACTION_CREATION;
            TransactionTypes $r15 = TRANSACTION_PRICE_FETCH;
            TransactionTypes $r16 = TRANSACTION_AUTHORIZATION;
            TransactionTypes $r17 = TRANSACTION_INITIATED;
            TransactionTypes $r18 = TRANSACTION_LOOKUP;
            TransactionTypes $r19 = TRANSACTION_PRINTER_CLICKED;
            TransactionTypes[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19};
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
            TransactionTypes $r1 = new TransactionTypes("TRANSACTION_FILTERED_CLICKED", 0);
            TRANSACTION_FILTERED_CLICKED = $r1;
            TransactionTypes $r12 = new TransactionTypes("SUBMIT_FILTER_CLICKED", 1);
            SUBMIT_FILTER_CLICKED = $r12;
            TransactionTypes $r13 = new TransactionTypes("TRANSACTION_REFERESH", 2);
            TRANSACTION_REFERESH = $r13;
            TransactionTypes $r14 = new TransactionTypes("TRANSACTION_CREATION", 3);
            TRANSACTION_CREATION = $r14;
            TransactionTypes $r15 = new TransactionTypes("TRANSACTION_PRICE_FETCH", 4);
            TRANSACTION_PRICE_FETCH = $r15;
            TransactionTypes $r16 = new TransactionTypes("TRANSACTION_AUTHORIZATION", 5);
            TRANSACTION_AUTHORIZATION = $r16;
            TransactionTypes $r17 = new TransactionTypes("TRANSACTION_INITIATED", 6);
            TRANSACTION_INITIATED = $r17;
            TransactionTypes $r18 = new TransactionTypes("TRANSACTION_LOOKUP", 7);
            TRANSACTION_LOOKUP = $r18;
            TransactionTypes $r19 = new TransactionTypes("TRANSACTION_PRINTER_CLICKED", 8);
            TRANSACTION_PRINTER_CLICKED = $r19;
            TransactionTypes[] $r0 = $values();
            $VALUES = $r0;
        }

        private TransactionTypes(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static TransactionTypes valueOf(String str) {
            Enum $r0 = Enum.valueOf(TransactionTypes.class, str);
            TransactionTypes $r2 = (TransactionTypes) $r0;
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
        public static TransactionTypes[] values() {
            TransactionTypes[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            TransactionTypes[] $r12 = (TransactionTypes[]) $r0;
            return $r12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventType.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/analytics/EventType$UnAuthorizedInstallationTypes;", "", "(Ljava/lang/String;I)V", "toString", "", "UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN", "UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED", "UNAUTHORIZED_INSTALLATON_EXIT_CLICKED", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class UnAuthorizedInstallationTypes {
        private static final /* synthetic */ UnAuthorizedInstallationTypes[] $VALUES;
        public static final UnAuthorizedInstallationTypes UNAUTHORIZED_INSTALLATON_EXIT_CLICKED;
        public static final UnAuthorizedInstallationTypes UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN;
        public static final UnAuthorizedInstallationTypes UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static final /* synthetic */ UnAuthorizedInstallationTypes[] $values() {
            UnAuthorizedInstallationTypes $r1 = UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN;
            UnAuthorizedInstallationTypes $r12 = UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED;
            UnAuthorizedInstallationTypes $r13 = UNAUTHORIZED_INSTALLATON_EXIT_CLICKED;
            UnAuthorizedInstallationTypes[] $r0 = {$r1, $r12, $r13};
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
            UnAuthorizedInstallationTypes $r1 = new UnAuthorizedInstallationTypes("UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN", 0);
            UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN = $r1;
            UnAuthorizedInstallationTypes $r12 = new UnAuthorizedInstallationTypes("UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED", 1);
            UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED = $r12;
            UnAuthorizedInstallationTypes $r13 = new UnAuthorizedInstallationTypes("UNAUTHORIZED_INSTALLATON_EXIT_CLICKED", 2);
            UNAUTHORIZED_INSTALLATON_EXIT_CLICKED = $r13;
            UnAuthorizedInstallationTypes[] $r0 = $values();
            $VALUES = $r0;
        }

        private UnAuthorizedInstallationTypes(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static UnAuthorizedInstallationTypes valueOf(String str) {
            Enum $r0 = Enum.valueOf(UnAuthorizedInstallationTypes.class, str);
            UnAuthorizedInstallationTypes $r2 = (UnAuthorizedInstallationTypes) $r0;
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
        public static UnAuthorizedInstallationTypes[] values() {
            UnAuthorizedInstallationTypes[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            UnAuthorizedInstallationTypes[] $r12 = (UnAuthorizedInstallationTypes[]) $r0;
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
