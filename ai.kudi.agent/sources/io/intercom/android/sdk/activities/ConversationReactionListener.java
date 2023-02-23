package io.intercom.android.sdk.activities;

import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.package_2.FeedbackDialog;
/* loaded from: classes.dex */
public class ConversationReactionListener implements ReactionListener {
    private final String conversationId;
    private final FeedbackDialog hours;
    private final MetricTracker.ReactionLocation location;
    private final MetricTracker metricTracker;
    private final String partId;

    public ConversationReactionListener(MetricTracker.ReactionLocation reactionLocation, String str, String str2, FeedbackDialog feedbackDialog, MetricTracker metricTracker) {
        this.conversationId = str2;
        this.partId = str;
        this.location = reactionLocation;
        this.hours = feedbackDialog;
        this.metricTracker = metricTracker;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ReactionListener
    public void onReactionSelected(Reaction reaction) {
        FeedbackDialog $r3 = this.hours;
        String $r4 = this.conversationId;
        int $i0 = reaction.getIndex();
        $r3.reactToConversation($r4, $i0);
        MetricTracker $r5 = this.metricTracker;
        String $r42 = this.conversationId;
        String $r6 = this.partId;
        int $i02 = reaction.getIndex();
        MetricTracker.ReactionLocation $r1 = this.location;
        $r5.sentReaction($r42, $r6, $i02, $r1);
    }
}
