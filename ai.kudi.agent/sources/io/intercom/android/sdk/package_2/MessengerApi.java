package io.intercom.android.sdk.package_2;

import io.intercom.retrofit2.Call;
import java.util.Map;
/* loaded from: classes.dex */
interface MessengerApi {
    Call addConversationQuickReply(String str, Map map);

    Call addConversationRatingRemark(String str, Map map);

    Call deleteDeviceToken(Map map);

    Call getConversation(String str, Map map);

    Call getConversations(Map map);

    Call getGifs(Map map);

    Call getHomeCards(Map map);

    Call getLink(String str, Map map);

    Call getSheet(Map map);

    Call getUnreadConversations(Map map);

    Call logEvent(Map map);

    Call markAsDismissed(Map map);

    Call markAsRead(String str, Map map);

    Call markPushAsOpened(Map map);

    Call rateConversation(String str, Map map);

    Call reactToConversation(String str, Map map);

    Call reactToLink(String str, Map map);

    Call replyToConversation(String str, Map map);

    Call reportError(Map map);

    Call satisfyCondition(String str, Map map);

    Call sendMetrics(Map map);

    Call setDeviceToken(Map map);

    Call startNewConversation(Map map);

    Call submitForm(String str, Map map);

    Call submitSheet(Map map);

    Call triggerInboundConversation(Map map);

    Call updateUser(Map map);

    Call uploadFile(Map map);
}
