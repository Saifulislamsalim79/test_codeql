package io.intercom.android.sdk.homescreen;

import io.intercom.android.sdk.homescreen.AutoValue_ConversationCard;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ConversationCard {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract ConversationCard build();

        public abstract Builder hasOlderConversations(boolean z);

        public abstract Builder hasOlderUnreadConversations(boolean z);

        public abstract Builder isLoading(boolean z);

        public abstract Builder recentConversations(List list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Builder builder() {
        AutoValue_ConversationCard.Builder $r0 = new AutoValue_ConversationCard.Builder();
        ArrayList $r1 = new ArrayList();
        Builder $r2 = $r0.recentConversations($r1);
        return $r2.hasOlderConversations(false).hasOlderUnreadConversations(false).isLoading(false);
    }

    public abstract boolean hasOlderConversations();

    public abstract boolean hasOlderUnreadConversations();

    public abstract boolean isLoading();

    public abstract List recentConversations();
}
