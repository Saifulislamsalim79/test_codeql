package io.intercom.android.sdk.views.holder;

import android.view.View;
import io.intercom.android.sdk.conversation.attribute.AttributeInputListener;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Suggestion;
/* loaded from: classes3.dex */
public interface ConversationListener {
    String getConversationId();

    int getCount();

    Part getPart(int i);

    Part getSelectedPart();

    void onComposerSuggestionClicked(Part part, Suggestion suggestion);

    void onContainerCardClicked(int i, ContainerCardViewHolder containerCardViewHolder);

    void onDateAttributeClicked(String str, String str2, String str3, AttributeInputListener attributeInputListener);

    void onLinkClicked(int i, View view);

    void onListAttributeClicked(String str, Attribute attribute, AttributeInputListener attributeInputListener);

    void onPartClicked(int i, PartViewHolder partViewHolder);

    void onQuickReplyClicked(Participant participant, Part part, ReplyOption replyOption);

    void onSubmitAttribute(String str, String str2, Object obj, String str3);
}
