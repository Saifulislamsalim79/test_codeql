package io.intercom.android.sdk.conversation.attribute;

import android.animation.Animator;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.events.ConversationEvent;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class AttributeAnimateEndListener implements Animator.AnimatorListener {
    private final Conversation conversation;
    private final C11129b mFolderIcon;

    public AttributeAnimateEndListener(Conversation conversation, C11129b c11129b) {
        this.conversation = conversation;
        this.mFolderIcon = c11129b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Conversation $r3 = this.conversation;
        ConversationEvent.Builder $r2 = new ConversationEvent.Builder($r3);
        ConversationEvent $r4 = $r2.isAttributeUpdated(true).build();
        C11129b $r5 = this.mFolderIcon;
        $r5.post($r4);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
