package io.intercom.android.sdk.experimental;

import android.app.TaskStackBuilder;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UnreadConversationCountListener;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import java.util.Map;
/* loaded from: classes.dex */
class InvalidIntercom extends Intercom {
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InvalidIntercom() {
        Twig $r1 = LumberMill.getLogger();
        this.twig = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void logIncorrectInitialisationWarning() {
        Twig $r1 = this.twig;
        Object[] $r2 = new Object[0];
        $r1.m13068e("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key", $r2);
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayConversationsList() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayHelpCenter() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessageComposer() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessageComposer(String str) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessenger() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public int getUnreadConversationCount() {
        logIncorrectInitialisationWarning();
        return 0;
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void handlePushMessage() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void handlePushMessage(TaskStackBuilder taskStackBuilder) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void hideMessenger() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void logEvent(String str) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void logEvent(String str, Map map) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setBottomPadding(int i) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setInAppMessageVisibility(Intercom.Visibility visibility) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setLauncherVisibility(Intercom.Visibility visibility) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setUserHash(String str) {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void shutdown() {
        logIncorrectInitialisationWarning();
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void updateUser(UserAttributes userAttributes) {
        logIncorrectInitialisationWarning();
    }
}
