package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.profile.ProfilePresenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes3.dex */
public class MetricTracker {
    static final String METADATA_BADGE_VALUE = "badge_value";
    static final String METADATA_COMMENT_ID = "comment_id";
    static final String METADATA_CONVERSATION_ID = "conversation_id";
    static final String METADATA_HAS_ARTICLE_CARD = "has_article_card";
    static final String METADATA_IS_ATTACHMENT = "is_attachment";
    static final String METADATA_IS_GIF = "is_gif";
    static final String METADATA_MESSAGE_ID = "message_id";
    static final String METADATA_MESSAGE_TYPE = "message_type";
    static final String METADATA_PART_ID = "part_id";
    static final String METADATA_PUSH_INSTANCE_ID = "instance_id";
    static final String METADATA_PUSH_TYPE = "push_type";
    static final String METADATA_QUICK_REPLY_ID = "quick_reply_id";
    static final String METADATA_REACTION_INDEX = "reaction_index";
    static final String METADATA_SEARCH_QUERY = "search_query";
    static final String METADATA_SUGGESTION_ID = "suggestion_id";
    static final String METADATA_TEAMMATE_STATUS = "teammate_status";
    static final String METADATA_TIME_SINCE_LAST_ACTIVE = "time_since_last_active";
    static final String METADATA_URL = "url";
    static final String METADATA_VIDEO_HEIGHT = "video_height";
    static final String METADATA_VIDEO_URL = "video_url";
    static final String METADATA_VIDEO_WIDTH = "video_width";
    static final String METADATA_WITHIN_OFFICE_HOURS = "within_office_hours";
    static final String VALUE_ACTIVE = "active";
    static final String VALUE_AWAY = "away";
    static final String VALUE_MESSAGE = "message";
    static final String VALUE_NOTIFICATION = "notification";
    private final String appVersion;
    private final String sdkVersion;
    private final MetricsStore store;
    private final TimeProvider timeProvider;
    private final UserIdentity userIdentity;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Action {
        public static final String CLICKED = "clicked";
        public static final String CLOSED = "closed";
        public static final String COMPLETED = "completed";
        public static final String DISMISSED = "dismissed";
        public static final String FAILED = "failed";
        public static final String LOADED = "loaded";
        public static final String OPENED = "opened";
        public static final String RECEIVED = "received";
        public static final String SEARCHED = "searched";
        public static final String SENT = "sent";
        public static final String STARTED = "started";
        public static final String TYPED = "typed";
        public static final String VIEWED = "viewed";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface CloseActionContext {
        public static final int BACK_BUTTON = 1;
        public static final int CLOSE_BUTTON = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Context {
        public static final String CONVERSATION = "conversation";
        public static final String FROM_ANDROID_BACK_BUTTON = "from_android_back_button";
        public static final String FROM_AUTO = "from_auto";
        public static final String FROM_CLICKING = "from_clicking";
        public static final String FROM_CLOSE_BUTTON = "from_close_button";
        public static final String FROM_CONVERSATION = "from_conversation";
        public static final String FROM_CONVERSATION_LIST = "from_conversation_list";
        public static final String FROM_CUSTOM_LAUNCHER = "from_custom_launcher";
        public static final String FROM_FULL = "from_full";
        public static final String FROM_HELP_CENTER_WEBVIEW = "from_help_center_webview";
        public static final String FROM_LAUNCHER = "from_launcher";
        public static final String FROM_NEW_CONVERSATION = "from_new_conversation";
        public static final String FROM_PUSH = "from_push";
        public static final String FROM_SCROLLING = "from_scrolling";
        public static final String FROM_SNIPPET = "from_snippet";
        public static final String HOME_SCREEN = "home_screen";
        public static final String IN_CONVERSATION = "in_conversation";
        public static final String IN_NEW_CONVERSATION = "in_new_conversation";
        public static final String ON_ARTICLE = "on_article";
    }

    /* loaded from: classes.dex */
    public @interface InAppMessageViewContext {
        public static final int FULL = 1;
        public static final int SNIPPET = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Name {
        public static final String EDUCATE = "educate_event";
        public static final String MESSENGER = "mv4_metric";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Object {
        public static final String ARTICLE = "article";
        public static final String BADGE = "badge";
        public static final String COMPOSER_SUGGESTIONS = "composer_suggestions";
        public static final String CONVERSATION = "conversation";
        public static final String CONVERSATION_LIST = "conversation_list";
        public static final String EXPANDED_GIF_INPUT = "expanded_gif_input";
        public static final String EXPANDED_IMAGE_INPUT = "expanded_image_input";
        public static final String GIF_INPUT = "gif_input";
        public static final String HELP_CENTER = "help_center";
        public static final String HOME_SCREEN = "home_screen";
        public static final String IMAGE_INPUT = "image_input";
        public static final String INPUT = "input";
        public static final String MESSAGE = "message";
        public static final String MESSENGER = "messenger";
        public static final String MESSENGER_SHEET = "messenger_sheet";
        public static final String NEW_CONVERSATION = "new_conversation";
        public static final String OPERATOR_REPLY = "operator_reply";
        public static final String QUICK_REPLIES = "quick_replies";
        public static final String QUICK_REPLY = "quick_reply";
        public static final String REACTION = "reaction";
        public static final String REPLY = "reply";
        public static final String SUGGESTION = "suggestion";
        public static final String TEAMMATE_PROFILE = "teammate_profile";
        public static final String TEAM_PROFILE = "team_profile";
        public static final String VIDEO_MESSAGE = "video_auto_message";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Owner {
        public static final String EDUCATE = "educate";
        public static final String MESSENGER = "messenger";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Place {
        public static final String IN_APP = "in_app";
        public static final String MESSENGER = "messenger";
        public static final String MESSENGER_CARD = "messenger_card";
        public static final String PUSH = "push";
    }

    /* loaded from: classes3.dex */
    public enum ReactionLocation {
        CONVERSATION,
        IN_APP,
        LINK
    }

    public MetricTracker(UserIdentity userIdentity, MetricsStore metricsStore, android.content.Context context) {
        this(userIdentity, metricsStore, TimeProvider.SYSTEM, context);
    }

    private void addMetadataToMetricObject(MetricObject metricObject, Map<String, java.lang.Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            metricObject.addMetaData(str, map.get(str));
        }
    }

    private static String contextForInApp(@InAppMessageViewContext int i) {
        return i == 0 ? Context.FROM_SNIPPET : Context.FROM_FULL;
    }

    private static String contextFrom(LauncherOpenBehaviour.LauncherType launcherType) {
        return LauncherOpenBehaviour.LauncherType.DEFAULT == launcherType ? Context.FROM_LAUNCHER : Context.FROM_CUSTOM_LAUNCHER;
    }

    private MetricObject createMetric(String str, String str2, String str3, String str4, String str5, String str6) {
        return new MetricObject(str, str2, UUID.randomUUID().toString(), this.userIdentity.getIntercomId(), str3, str4, str5, str6, this.timeProvider, this.appVersion, this.sdkVersion);
    }

    private MetricObject newEducateMetric(String str, String str2, String str3, String str4) {
        return createMetric(Name.EDUCATE, Owner.EDUCATE, str, str2, str3, str4);
    }

    private MetricObject newMetric(String str, String str2, String str3, String str4) {
        return createMetric(Name.MESSENGER, "messenger", str, str2, str3, str4);
    }

    private static String objectFrom(ProfilePresenter.ProfileType profileType) {
        return ProfilePresenter.ProfileType.TEAMMATE == profileType ? Object.TEAMMATE_PROFILE : Object.TEAM_PROFILE;
    }

    private void track(MetricObject metricObject) {
        this.store.track(metricObject);
    }

    public void clickedComposerSuggestion(String str, String str2, String str3) {
        track(newMetric(Action.CLICKED, Object.SUGGESTION, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_SUGGESTION_ID, str));
    }

    public void clickedInput(String str, String str2) {
        track(newMetric(Action.CLICKED, str2, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void clickedQuickReply(String str, String str2, String str3) {
        track(newMetric(Action.CLICKED, "quick_reply", "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_QUICK_REPLY_ID, str));
    }

    public void closedArticle(String str, String str2, int i) {
        track(newEducateMetric(Action.CLOSED, Object.ARTICLE, "messenger", i == 0 ? Context.FROM_CLOSE_BUTTON : Context.FROM_ANDROID_BACK_BUTTON).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void closedHelpCenter(String str, int i) {
        track(newEducateMetric(Action.CLOSED, Object.HELP_CENTER, "messenger", i == 0 ? Context.FROM_CLOSE_BUTTON : Context.FROM_ANDROID_BACK_BUTTON).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void closedInAppFromFull(String str, String str2) {
        track(newMetric(Action.CLOSED, "message", Place.IN_APP, Context.FROM_FULL).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void closedMessengerBackButton() {
        track(newMetric(Action.CLOSED, "messenger", "messenger", Context.FROM_ANDROID_BACK_BUTTON));
    }

    public void closedMessengerCloseButton() {
        track(newMetric(Action.CLOSED, "messenger", "messenger", Context.FROM_CLOSE_BUTTON));
    }

    public void closedMessengerSheet(String str, String str2, boolean z) {
        track(newMetric(Action.CLOSED, Object.MESSENGER_SHEET, "messenger", z ? "home_screen" : "conversation").addMetaData("url", str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void completedVideo() {
        track(newMetric(Action.COMPLETED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation"));
    }

    public void dismissInAppCommentSnippet(String str, String str2) {
        track(newMetric(Action.DISMISSED, Object.REPLY, Place.IN_APP, Context.FROM_SNIPPET).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_COMMENT_ID, str2));
    }

    public void dismissInAppMessageSnippet(String str, String str2) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_SNIPPET).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_MESSAGE_ID, str2));
    }

    public void dismissedPushNotification(String str) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_TYPE, "notification"));
    }

    public void dismissedPushOnlyNotification(String str, String str2) {
        track(newMetric(Action.DISMISSED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_INSTANCE_ID, str2).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void educateWebviewMetric(String str, String str2, String str3, Map<String, java.lang.Object> map) {
        MetricObject newEducateMetric = newEducateMetric(str, str2, str3, Context.FROM_HELP_CENTER_WEBVIEW);
        addMetadataToMetricObject(newEducateMetric, map);
        track(newEducateMetric);
    }

    public void expandedInput(String str, String str2) {
        track(newMetric(Action.OPENED, Object.EXPANDED_GIF_INPUT, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void failedToPlayVideo(String str) {
        track(newMetric("failed", Object.VIDEO_MESSAGE, Place.IN_APP, "conversation").addMetaData(METADATA_VIDEO_URL, str));
    }

    public void loadedVideo(String str, int i, int i2) {
        track(newMetric(Action.LOADED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation").addMetaData(METADATA_VIDEO_URL, str).addMetaData(METADATA_VIDEO_WIDTH, Integer.valueOf(i)).addMetaData(METADATA_VIDEO_HEIGHT, Integer.valueOf(i2)));
    }

    public void messengerCardWebViewEvent(String str, String str2, String str3, Map<String, java.lang.Object> map, boolean z) {
        MetricObject newEducateMetric = newEducateMetric(str, str2, str3, z ? "home_screen" : "conversation");
        addMetadataToMetricObject(newEducateMetric, map);
        track(newEducateMetric);
    }

    public void newConversationFromComposeButton(boolean z) {
        track(newMetric(Action.OPENED, Object.NEW_CONVERSATION, "messenger", Context.FROM_CONVERSATION_LIST).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z)));
    }

    public void openConversationFromConversationList(String str, boolean z, boolean z2, String str2) {
        track(newMetric(Action.OPENED, "conversation", "messenger", Context.FROM_CONVERSATION_LIST).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z)).addMetaData(METADATA_TEAMMATE_STATUS, z2 ? VALUE_ACTIVE : VALUE_AWAY).addMetaData(METADATA_TIME_SINCE_LAST_ACTIVE, str2));
    }

    public void openConversationsListFromConversation(String str) {
        track(newMetric(Action.OPENED, Object.CONVERSATION_LIST, "messenger", Context.FROM_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void openConversationsListFromNewConversation() {
        track(newMetric(Action.OPENED, Object.CONVERSATION_LIST, "messenger", Context.FROM_NEW_CONVERSATION));
    }

    public void openedConversationFromFull(String str, String str2) {
        track(newMetric(Action.OPENED, "conversation", "messenger", Context.FROM_FULL).addMetaData(METADATA_COMMENT_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void openedConversationFromHomeScreen(String str) {
        track(newMetric(Action.OPENED, "conversation", "messenger", "home_screen").addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void openedConversationFromSnippet(String str, String str2) {
        track(newMetric(Action.OPENED, "conversation", "messenger", Context.FROM_SNIPPET).addMetaData(METADATA_COMMENT_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void openedHomeScreen(LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric(Action.OPENED, "home_screen", "messenger", contextFrom(launcherType)));
    }

    public void openedMessengerConversation(String str, LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric(Action.OPENED, "conversation", "messenger", contextFrom(launcherType)).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void openedMessengerConversationList(LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric(Action.OPENED, Object.CONVERSATION_LIST, "messenger", contextFrom(launcherType)));
    }

    public void openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType launcherType) {
        track(newMetric(Action.OPENED, Object.NEW_CONVERSATION, "messenger", contextFrom(launcherType)));
    }

    public void openedNewConversationFromHomeScreen() {
        track(newMetric(Action.OPENED, Object.NEW_CONVERSATION, "messenger", "home_screen"));
    }

    public void openedPushOnlyNotification(String str) {
        track(newMetric(Action.OPENED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void profileAutoOpen(String str, ProfilePresenter.ProfileType profileType) {
        track(newMetric(Action.OPENED, objectFrom(profileType), "messenger", Context.FROM_AUTO).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void profileClickedOpen(String str, ProfilePresenter.ProfileType profileType) {
        track(newMetric(Action.OPENED, objectFrom(profileType), "messenger", Context.FROM_CLICKING).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void profileScrolledOpen(String str, ProfilePresenter.ProfileType profileType) {
        track(newMetric(Action.OPENED, objectFrom(profileType), "messenger", Context.FROM_SCROLLING).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void receivedComposerSuggestions(String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, Object.COMPOSER_SUGGESTIONS, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_SUGGESTION_ID, str));
    }

    public void receivedMessageFromFullWhenClosed(boolean z, boolean z2, String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, "message", Place.IN_APP, Context.FROM_FULL).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_MESSAGE_TYPE, str3).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void receivedMessageFromSnippetWhenClosed(boolean z, boolean z2, String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, "message", Place.IN_APP, Context.FROM_SNIPPET).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_MESSAGE_TYPE, str3).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void receivedNotificationFromBadgeWhenMessengerClosed(String str) {
        track(newMetric(Action.RECEIVED, Object.BADGE, Place.IN_APP, Context.FROM_LAUNCHER).addMetaData(METADATA_BADGE_VALUE, str));
    }

    public void receivedOperatorReply(String str) {
        track(newEducateMetric(Action.RECEIVED, Object.OPERATOR_REPLY, "messenger", Context.FROM_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void receivedPushNotification(String str) {
        track(newMetric(Action.RECEIVED, "message", Place.PUSH, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_TYPE, "notification"));
    }

    public void receivedPushOnlyNotification(String str, String str2) {
        track(newMetric(Action.RECEIVED, "message", Place.PUSH, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_INSTANCE_ID, str2).addMetaData(METADATA_PUSH_TYPE, "message"));
    }

    public void receivedQuickReply(String str, String str2, String str3) {
        track(newMetric(Action.RECEIVED, Object.QUICK_REPLIES, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_PART_ID, str3).addMetaData(METADATA_QUICK_REPLY_ID, str));
    }

    public void receivedReply(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.RECEIVED, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)).addMetaData(METADATA_COMMENT_ID, str).addMetaData(METADATA_CONVERSATION_ID, str2));
    }

    public void receivedReplyFromSnippetWhenClosed(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.RECEIVED, Object.REPLY, Place.IN_APP, Context.FROM_SNIPPET).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_COMMENT_ID, str2).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)));
    }

    public void searchedGifInput(String str) {
        track(newMetric(Action.SEARCHED, Object.EXPANDED_GIF_INPUT, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_SEARCH_QUERY, str));
    }

    public void sentInConversation(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3) {
        track(newMetric(Action.SENT, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_IS_GIF, Boolean.valueOf(z2)).addMetaData(METADATA_MESSAGE_ID, str).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z3)).addMetaData(METADATA_TEAMMATE_STATUS, z4 ? VALUE_ACTIVE : VALUE_AWAY).addMetaData(METADATA_TIME_SINCE_LAST_ACTIVE, str3));
    }

    public void sentInNewConversation(boolean z, boolean z2, String str, String str2, boolean z3) {
        track(newMetric(Action.SENT, "message", "messenger", Context.IN_NEW_CONVERSATION).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_IS_GIF, Boolean.valueOf(z2)).addMetaData(METADATA_MESSAGE_ID, str).addMetaData(METADATA_CONVERSATION_ID, str2).addMetaData(METADATA_WITHIN_OFFICE_HOURS, Boolean.valueOf(z3)));
    }

    public void sentReaction(String str, String str2, int i, ReactionLocation reactionLocation) {
        if (ReactionLocation.CONVERSATION == reactionLocation) {
            track(newMetric(Action.SENT, Object.REACTION, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_REACTION_INDEX, Integer.valueOf(i)).addMetaData(METADATA_CONVERSATION_ID, str));
        } else if (ReactionLocation.LINK == reactionLocation) {
            track(newEducateMetric(Action.SENT, Object.REACTION, "messenger", Context.ON_ARTICLE).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
        } else {
            track(newMetric(Action.SENT, Object.REACTION, Place.IN_APP, Context.FROM_FULL).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
        }
    }

    public void startConversation(String str) {
        track(newMetric(Action.OPENED, "conversation", "messenger", Context.FROM_NEW_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void startedToPlayVideo() {
        track(newMetric(Action.STARTED, Object.VIDEO_MESSAGE, Place.IN_APP, "conversation"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void typeInConversation(String str) {
        track(newMetric(Action.TYPED, Object.REPLY, "messenger", Context.IN_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void typeInNewConversation() {
        track(newMetric(Action.TYPED, "message", "messenger", Context.IN_NEW_CONVERSATION));
    }

    public void viewedArticle(String str, String str2) {
        track(newEducateMetric(Action.VIEWED, Object.ARTICLE, "messenger", Context.FROM_CONVERSATION).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void viewedHelpCenter(String str) {
        track(newEducateMetric(Action.VIEWED, Object.HELP_CENTER, "messenger", Context.FROM_CONVERSATION).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void viewedInApp(String str, String str2, @InAppMessageViewContext int i) {
        track(newMetric(Action.VIEWED, "message", Place.IN_APP, contextForInApp(i)).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void viewedInAppFromMessenger(String str, String str2, String str3) {
        track(newMetric(Action.VIEWED, "message", "messenger", Context.FROM_FULL).addMetaData(METADATA_MESSAGE_TYPE, str3).addMetaData(METADATA_MESSAGE_ID, str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void viewedMessengerSheet(String str, String str2, boolean z) {
        track(newMetric(Action.VIEWED, Object.MESSENGER_SHEET, "messenger", z ? "home_screen" : "conversation").addMetaData("url", str2).addMetaData(METADATA_CONVERSATION_ID, str));
    }

    public void viewedPushNotification(String str) {
        track(newMetric(Action.VIEWED, "message", Place.IN_APP, Context.FROM_PUSH).addMetaData(METADATA_CONVERSATION_ID, str).addMetaData(METADATA_PUSH_TYPE, "notification"));
    }

    public void viewedReply(boolean z, boolean z2, String str, String str2) {
        track(newMetric(Action.VIEWED, Object.REPLY, "messenger", Context.FROM_SNIPPET).addMetaData(METADATA_IS_ATTACHMENT, Boolean.valueOf(z)).addMetaData(METADATA_HAS_ARTICLE_CARD, Boolean.valueOf(z2)).addMetaData(METADATA_COMMENT_ID, str).addMetaData(METADATA_CONVERSATION_ID, str2));
    }

    MetricTracker(UserIdentity userIdentity, MetricsStore metricsStore, TimeProvider timeProvider, android.content.Context context) {
        this.userIdentity = userIdentity;
        this.timeProvider = timeProvider;
        this.store = metricsStore;
        this.sdkVersion = "5.5.0";
        this.appVersion = DeviceUtils.getAppVersion(context);
    }
}
