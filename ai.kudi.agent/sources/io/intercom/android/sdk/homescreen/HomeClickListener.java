package io.intercom.android.sdk.homescreen;

import io.intercom.android.sdk.models.Conversation;
/* loaded from: classes.dex */
public interface HomeClickListener {
    void onCloseClicked();

    void onConversationClicked(Conversation conversation);

    void onNewConversationClicked();

    void onReloadClicked();

    void onSeePreviousClicked();
}
