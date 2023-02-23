package io.intercom.android.sdk.homescreen;

import io.intercom.android.sdk.homescreen.ConversationCard;
import io.intercom.android.sdk.models.Conversation;
import java.util.List;
/* loaded from: classes.dex */
final class AutoValue_ConversationCard extends ConversationCard {
    private final boolean hasOlderConversations;
    private final boolean hasOlderUnreadConversations;
    private final boolean isLoading;
    private final List<Conversation> recentConversations;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Builder extends ConversationCard.Builder {
        private Boolean hasOlderConversations;
        private Boolean hasOlderUnreadConversations;
        private Boolean isLoading;
        private List<Conversation> recentConversations;

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
        @Override // io.intercom.android.sdk.homescreen.ConversationCard.Builder
        public ConversationCard build() {
            Boolean $r2 = this.isLoading;
            String $r3 = "";
            if ($r2 == null) {
                $r3 = " isLoading";
            }
            List $r1 = this.recentConversations;
            if ($r1 == null) {
                $r3 = $r3 + " recentConversations";
            }
            Boolean $r22 = this.hasOlderConversations;
            if ($r22 == null) {
                $r3 = $r3 + " hasOlderConversations";
            }
            Boolean $r23 = this.hasOlderUnreadConversations;
            if ($r23 == null) {
                $r3 = $r3 + " hasOlderUnreadConversations";
            }
            boolean $z0 = $r3.isEmpty();
            if (!$z0) {
                IllegalStateException $r6 = new IllegalStateException("Missing required properties:" + $r3);
                throw $r6;
            }
            Boolean $r24 = this.isLoading;
            boolean $z02 = $r24.booleanValue();
            List $r12 = this.recentConversations;
            Boolean $r25 = this.hasOlderConversations;
            boolean $z1 = $r25.booleanValue();
            Boolean $r26 = this.hasOlderUnreadConversations;
            boolean $z2 = $r26.booleanValue();
            AutoValue_ConversationCard $r5 = new AutoValue_ConversationCard($z02, $r12, $z1, $z2);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.homescreen.ConversationCard.Builder
        public ConversationCard.Builder hasOlderConversations(boolean z) {
            Boolean $r1 = Boolean.valueOf(z);
            this.hasOlderConversations = $r1;
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
        @Override // io.intercom.android.sdk.homescreen.ConversationCard.Builder
        public ConversationCard.Builder hasOlderUnreadConversations(boolean z) {
            Boolean $r1 = Boolean.valueOf(z);
            this.hasOlderUnreadConversations = $r1;
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
        @Override // io.intercom.android.sdk.homescreen.ConversationCard.Builder
        public ConversationCard.Builder isLoading(boolean z) {
            Boolean $r1 = Boolean.valueOf(z);
            this.isLoading = $r1;
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
        @Override // io.intercom.android.sdk.homescreen.ConversationCard.Builder
        public ConversationCard.Builder recentConversations(List list) {
            if (list != null) {
                this.recentConversations = list;
                return this;
            }
            NullPointerException $r2 = new NullPointerException("Null recentConversations");
            throw $r2;
        }
    }

    private AutoValue_ConversationCard(boolean z, List list, boolean z2, boolean z3) {
        this.isLoading = z;
        this.recentConversations = list;
        this.hasOlderConversations = z2;
        this.hasOlderUnreadConversations = z3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean $z0 = obj instanceof ConversationCard;
        if ($z0) {
            ConversationCard $r2 = (ConversationCard) obj;
            boolean $z02 = this.isLoading;
            boolean $z1 = $r2.isLoading();
            if ($z02 == $z1) {
                List $r3 = this.recentConversations;
                List $r4 = $r2.recentConversations();
                boolean $z03 = $r3.equals($r4);
                if ($z03) {
                    boolean $z04 = this.hasOlderConversations;
                    boolean $z12 = $r2.hasOlderConversations();
                    if ($z04 == $z12) {
                        boolean $z05 = this.hasOlderUnreadConversations;
                        boolean $z13 = $r2.hasOlderUnreadConversations();
                        return $z05 == $z13;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.android.sdk.homescreen.ConversationCard
    public boolean hasOlderConversations() {
        boolean z0 = this.hasOlderConversations;
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
    @Override // io.intercom.android.sdk.homescreen.ConversationCard
    public boolean hasOlderUnreadConversations() {
        boolean z0 = this.hasOlderUnreadConversations;
        return z0;
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
    public int hashCode() {
        boolean $z0 = this.isLoading;
        short $s2 = $z0 ? (short) 1231 : (short) 1237;
        int $i0 = $s2 ^ 1000003;
        int $i3 = $i0 * 1000003;
        List $r1 = this.recentConversations;
        int $i02 = $r1.hashCode();
        int $i03 = ($i3 ^ $i02) * 1000003;
        boolean $z02 = this.hasOlderConversations;
        short $s22 = $z02 ? (short) 1231 : (short) 1237;
        int $i04 = ($i03 ^ $s22) * 1000003;
        boolean $z03 = this.hasOlderUnreadConversations;
        short $s1 = $z03 ? (short) 1231 : (short) 1237;
        return $i04 ^ $s1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.android.sdk.homescreen.ConversationCard
    public boolean isLoading() {
        boolean z0 = this.isLoading;
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
    @Override // io.intercom.android.sdk.homescreen.ConversationCard
    public List recentConversations() {
        List r1 = this.recentConversations;
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
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ConversationCard{isLoading=");
        boolean $z0 = this.isLoading;
        $r2.append($z0);
        $r2.append(", recentConversations=");
        List $r3 = this.recentConversations;
        $r2.append($r3);
        $r2.append(", hasOlderConversations=");
        boolean $z02 = this.hasOlderConversations;
        $r2.append($z02);
        $r2.append(", hasOlderUnreadConversations=");
        boolean $z03 = this.hasOlderUnreadConversations;
        $r2.append($z03);
        $r2.append("}");
        String $r1 = $r2.toString();
        return $r1;
    }
}
