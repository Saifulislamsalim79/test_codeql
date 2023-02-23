package io.intercom.android.sdk.package_2;

import android.content.Context;
import android.text.TextUtils;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.errorreporting.ErrorReport;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.UpdateUserResponse;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.events.UploadEvent;
import io.intercom.android.sdk.models.events.failure.UploadFailedEvent;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.com.google.gson.C10916e;
import io.intercom.okhttp3.Dispatcher;
import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.MultipartBody;
import io.intercom.okhttp3.OkHttpClient;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.ResponseBody;
import io.intercom.retrofit2.Call;
import io.intercom.retrofit2.Callback;
import io.intercom.retrofit2.Response;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* compiled from: Api.java */
/* loaded from: classes.dex */
public class FeedbackDialog {
    private static final String BATCH_SIZE = "batch_size";
    private static final String DATA = "data";
    private static final String DEVICE_DATA = "device_data";
    private static final String DEVICE_TOKEN = "device_token";
    private static final String HMAC = "hmac";
    private static final String NEW_SESSION = "new_session";
    private static final String SENT_FROM_BACKGROUND = "sent_from_background";
    private static final Twig TWIG;
    private static final String UPLOAD = "upload";
    private static final String USER = "user";
    private static final String USER_ATTRIBUTES = "user_attributes";
    private final OkHttpClient apiHttpClient;
    private final Provider<AppConfig> appConfigProvider;
    private final AppIdentity appIdentity;
    final CallbackHolder callbacks;
    private final Context context;
    private final int defaultOkHttpMaxRequests;
    private final Callback<Void> emptyCallback;
    private C10916e gson;
    final OkHttpClient httpClient;
    private final MessengerApi messengerApi;
    private final RateLimiter rateLimiter;
    private final Store<State> store;
    final UserIdentity userIdentity;
    final C11129b val$handler;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Twig $r0 = LumberMill.getLogger();
        TWIG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FeedbackDialog(Context context, AppIdentity appIdentity, UserIdentity userIdentity, C11129b c11129b, OkHttpClient okHttpClient, MessengerApi messengerApi, CallbackHolder callbackHolder, RateLimiter rateLimiter, Store store, Provider provider, C10916e c10916e) {
        OkHttpClient $r12 = new OkHttpClient();
        this.httpClient = $r12;
        this.emptyCallback = new Callback<Void>() { // from class: io.intercom.android.sdk.package_2.Api$4
            @Override // io.intercom.retrofit2.Callback
            public void onFailure(Call<Void> call, Throwable th) {
            }

            @Override // io.intercom.retrofit2.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
            }
        };
        this.context = context;
        this.appIdentity = appIdentity;
        this.userIdentity = userIdentity;
        this.val$handler = c11129b;
        this.messengerApi = messengerApi;
        this.callbacks = callbackHolder;
        this.rateLimiter = rateLimiter;
        this.store = store;
        this.appConfigProvider = provider;
        this.gson = c10916e;
        this.apiHttpClient = okHttpClient;
        Dispatcher $r14 = okHttpClient.dispatcher();
        int $i0 = $r14.getMaxRequests();
        this.defaultOkHttpMaxRequests = $i0;
        updateMaxRequests();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addSecureHash(Map map) {
        UserIdentity $r2 = this.userIdentity;
        String $r3 = $r2.getData();
        UserIdentity $r22 = this.userIdentity;
        String $r4 = $r22.getHmac();
        boolean $z0 = TextUtils.isEmpty($r3);
        if (!$z0) {
            map.put("data", $r3);
        }
        boolean $z02 = TextUtils.isEmpty($r4);
        if ($z02) {
            return;
        }
        map.put(HMAC, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Map baseNewConversationParams() {
        HashMap $r1 = new HashMap();
        AppIdentity $r2 = this.appIdentity;
        String $r3 = $r2.appId();
        $r1.put("app_id", $r3);
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r1.put(USER, $r5);
        addSecureHash($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Map createBaseReplyParams() {
        HashMap $r1 = new HashMap();
        AppIdentity $r2 = this.appIdentity;
        String $r3 = $r2.appId();
        $r1.put("app_id", $r3);
        $r1.put("type", USER);
        $r1.put("message_type", "comment");
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r1.put(USER, $r5);
        addSecureHash($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Map generateUpdateUserParams(UserUpdateRequest userUpdateRequest) {
        HashMap $r1 = new HashMap();
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r1.put(USER, $r4);
        Context $r5 = this.context;
        Map $r42 = DeviceData.generateDeviceData($r5);
        $r1.put(DEVICE_DATA, $r42);
        boolean $z0 = userUpdateRequest.isNewSession();
        Boolean $r6 = Boolean.valueOf($z0);
        $r1.put(NEW_SESSION, $r6);
        boolean $z02 = userUpdateRequest.isSentFromBackground();
        Boolean $r62 = Boolean.valueOf($z02);
        $r1.put(SENT_FROM_BACKGROUND, $r62);
        int $i0 = userUpdateRequest.getBatchSize();
        Integer $r7 = Integer.valueOf($i0);
        $r1.put(BATCH_SIZE, $r7);
        Map $r43 = userUpdateRequest.getAttributes();
        $r1.put(USER_ATTRIBUTES, $r43);
        addSecureHash($r1);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static boolean isUserNotFound(ErrorObject errorObject, Map map) {
        boolean $z0 = errorObject.hasErrorBody();
        if ($z0) {
            int $i0 = errorObject.getStatusCode();
            if ($i0 != 404 || map == null) {
                return false;
            }
            Object $r3 = map.get(UserIdentity.INTERCOM_ID);
            if ($r3 != null) {
                int $i02 = map.size();
                if ($i02 > 1) {
                    try {
                        String $r5 = errorObject.getErrorBody();
                        JSONObject $r4 = new JSONObject($r5);
                        JSONArray $r6 = $r4.getJSONArray("errors");
                        JSONObject $r42 = $r6.getJSONObject(0);
                        String $r52 = $r42.getString("code");
                        boolean $z02 = $r52.equals("not_found");
                        return $z02;
                    } catch (Exception e) {
                        Twig $r7 = TWIG;
                        $r7.internal("Could not parse error response");
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void logBackgroundDisabledError() {
        Twig $r1 = TWIG;
        Object[] $r2 = new Object[0];
        $r1.m13068e("Your request was not sent because the app is in the background. Please contact Intercom to enable background requests.", $r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void retriableUpdateUser(final Map map, final String str) {
        MessengerApi $r5 = this.messengerApi;
        Call $r4 = $r5.updateUser(map);
        $r4.enqueue(new io.intercom.android.sdk.api.BaseCallback<UpdateUserResponse.Builder>() { // from class: io.intercom.android.sdk.package_2.Api$1
            void logFailure(String str2, ErrorObject errorObject) {
                super.logFailure("Failed to register or update user", errorObject);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                Object $r3 = map.get("user");
                Map $r2 = (Map) $r3;
                boolean $z0 = FeedbackDialog.isUserNotFound(errorObject, $r2);
                if ($z0) {
                    $r2.remove(UserIdentity.INTERCOM_ID);
                    Map $r42 = map;
                    $r42.put("user", $r2);
                    FeedbackDialog $r52 = FeedbackDialog.this;
                    Map $r22 = map;
                    String $r6 = str;
                    $r52.retriableUpdateUser($r22, $r6);
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(UpdateUserResponse.Builder builder) {
                String $r2 = str;
                FeedbackDialog $r3 = FeedbackDialog.this;
                UserIdentity $r42 = $r3.userIdentity;
                String $r52 = $r42.getFingerprint();
                boolean $z0 = $r2.equals($r52);
                if ($z0) {
                    Twig $r6 = FeedbackDialog.TWIG;
                    Object[] $r7 = new Object[0];
                    $r6.m13065i("Successfully registered or updated user", $r7);
                    FeedbackDialog $r32 = FeedbackDialog.this;
                    CallbackHolder $r8 = $r32.callbacks;
                    BaseCallback $r9 = $r8.unreadCallback();
                    $r9.onSuccess(builder);
                    UpdateUserResponse $r10 = builder.build();
                    TeamPresence $r11 = $r10.getTeamPresence();
                    FeedbackDialog $r33 = FeedbackDialog.this;
                    Store $r12 = $r33.store;
                    Action $r13 = Actions.teamPresenceUpdated($r11);
                    $r12.dispatch($r13);
                    UpdateUserResponse $r102 = builder.build();
                    ComposerSuggestions $r14 = $r102.getComposerSuggestions();
                    FeedbackDialog $r34 = FeedbackDialog.this;
                    Store $r122 = $r34.store;
                    Action $r132 = Actions.composerSuggestionsUpdated($r14);
                    $r122.dispatch($r132);
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                UpdateUserResponse.Builder $r2 = (UpdateUserResponse.Builder) obj;
                onSuccess($r2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean shouldStopBackgroundRequest(boolean z) {
        if (z) {
            Provider $r1 = this.appConfigProvider;
            Object $r2 = $r1.get();
            AppConfig $r3 = (AppConfig) $r2;
            boolean $z0 = $r3.backgroundRequestsDisabled();
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addConversationQuickReply(String str, Part part, String str2, int i, String str3) {
        HashMap $r5 = new HashMap();
        UserIdentity $r6 = this.userIdentity;
        Map $r7 = $r6.toMap();
        $r5.put(USER, $r7);
        String $r8 = part.getId();
        boolean $z0 = part.isInitialMessage();
        if (!$z0) {
            $r5.put("quick_reply_part_id", $r8);
        }
        $r5.put("reply_option_uuid", str2);
        addSecureHash($r5);
        MessengerApi $r9 = this.messengerApi;
        Call $r10 = $r9.addConversationQuickReply(str, $r5);
        CallbackHolder $r11 = this.callbacks;
        Callback $r12 = $r11.replyCallback(i, false, str3, str);
        $r10.enqueue($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addConversationRatingRemark(String str, String str2) {
        HashMap $r3 = new HashMap();
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r3.put(USER, $r5);
        $r3.put("remark", str2);
        addSecureHash($r3);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.addConversationRatingRemark(str, $r3);
        CallbackHolder $r8 = this.callbacks;
        Callback $r9 = $r8.loggingCallback("adding remark to conversation");
        $r7.enqueue($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void fetchDefaultGifs(Callback callback) {
        MessengerApi $r2 = this.messengerApi;
        Map $r3 = Collections.emptyMap();
        Call $r4 = $r2.getGifs($r3);
        $r4.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void fetchGifs(String str, Callback callback) {
        Map $r3 = Collections.singletonMap("query", str);
        MessengerApi $r4 = this.messengerApi;
        Call $r5 = $r4.getGifs($r3);
        $r5.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void fetchHomeCards(Callback callback) {
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        addSecureHash($r4);
        MessengerApi $r2 = this.messengerApi;
        Call $r5 = $r2.getHomeCards($r4);
        $r5.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void fetchSheet(HashMap hashMap, Callback callback) {
        HashMap $r2 = new HashMap();
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r2.put(USER, $r5);
        addSecureHash($r2);
        $r2.putAll(hashMap);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.getSheet($r2);
        $r7.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getConversation(String str, String str2) {
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        addSecureHash($r5);
        MessengerApi $r1 = this.messengerApi;
        Call $r6 = $r1.getConversation(str, $r5);
        CallbackHolder $r7 = this.callbacks;
        Callback $r8 = $r7.conversationCallback(str2);
        $r6.enqueue($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getInbox() {
        UserIdentity $r1 = this.userIdentity;
        Map $r2 = $r1.toMap();
        $r2.put("per_page", "20");
        addSecureHash($r2);
        MessengerApi $r3 = this.messengerApi;
        Call $r4 = $r3.getConversations($r2);
        CallbackHolder $r5 = this.callbacks;
        Callback $r6 = $r5.inboxCallback();
        $r4.enqueue($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getInboxBefore(long j) {
        UserIdentity $r1 = this.userIdentity;
        Map $r2 = $r1.toMap();
        String $r3 = String.valueOf(j);
        $r2.put("before", $r3);
        $r2.put("per_page", "20");
        addSecureHash($r2);
        MessengerApi $r4 = this.messengerApi;
        Call $r5 = $r4.getConversations($r2);
        CallbackHolder $r6 = this.callbacks;
        Callback $r7 = $r6.inboxCallback();
        $r5.enqueue($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getLink(String str, Callback callback) {
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        addSecureHash($r5);
        MessengerApi $r2 = this.messengerApi;
        Call $r6 = $r2.getLink(str, $r5);
        $r6.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getUnreadConversations() {
        UserIdentity $r1 = this.userIdentity;
        Map $r2 = $r1.toMap();
        $r2.put("per_page", "20");
        addSecureHash($r2);
        MessengerApi $r3 = this.messengerApi;
        Call $r4 = $r3.getUnreadConversations($r2);
        CallbackHolder $r5 = this.callbacks;
        BaseCallback $r6 = $r5.unreadCallback();
        $r4.enqueue($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void getVideo(String str, io.intercom.okhttp3.Callback callback) {
        OkHttpClient $r2 = this.httpClient;
        Request.Builder $r3 = new Request.Builder();
        Request $r5 = $r3.url(str).build();
        io.intercom.okhttp3.Call $r6 = $r2.newCall($r5);
        $r6.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void hitTrackingUrl(String str) {
        OkHttpClient $r3 = this.httpClient;
        Request.Builder $r1 = new Request.Builder();
        Request $r4 = $r1.url(str).build();
        io.intercom.okhttp3.Call $r5 = $r3.newCall($r4);
        $r5.enqueue(new io.intercom.okhttp3.Callback() { // from class: io.intercom.android.sdk.package_2.Api$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.okhttp3.Callback
            public void onFailure(io.intercom.okhttp3.Call call, IOException iOException) {
                Twig $r12 = FeedbackDialog.TWIG;
                $r12.internal("Tracking Url", "Failed tracking url request");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.okhttp3.Callback
            public void onResponse(io.intercom.okhttp3.Call call, io.intercom.okhttp3.Response response) throws IOException {
                Twig $r32 = FeedbackDialog.TWIG;
                $r32.internal("Tracking Url", "success");
                ResponseBody $r42 = response.body();
                $r42.close();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isIdle() {
        OkHttpClient $r1 = this.apiHttpClient;
        Dispatcher $r2 = $r1.dispatcher();
        int $i0 = $r2.runningCallsCount();
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    boolean isSynchronous() {
        OkHttpClient $r1 = this.apiHttpClient;
        Dispatcher $r2 = $r1.dispatcher();
        int $i0 = $r2.getMaxRequests();
        return $i0 == 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void logEvent(String str, Map map) {
        RateLimiter $r3 = this.rateLimiter;
        if ($r3.isLimited()) {
            RateLimiter $r32 = this.rateLimiter;
            $r32.logError();
            return;
        }
        Store $r4 = this.store;
        Store.Selector $r5 = Selectors.APP_IS_BACKGROUNDED;
        Object $r6 = $r4.select($r5);
        Boolean $r7 = (Boolean) $r6;
        boolean $z0 = $r7.booleanValue();
        boolean $z1 = shouldStopBackgroundRequest($z0);
        if ($z1) {
            logBackgroundDisabledError();
            return;
        }
        RateLimiter $r33 = this.rateLimiter;
        $r33.recordRequest();
        HashMap $r8 = new HashMap();
        $r8.put("event_name", str);
        boolean $z12 = map.isEmpty();
        if (!$z12) {
            $r8.put("metadata", map);
        }
        HashMap $r9 = new HashMap();
        $r9.put("event", $r8);
        Boolean $r72 = Boolean.valueOf($z0);
        $r9.put(SENT_FROM_BACKGROUND, $r72);
        UserIdentity $r10 = this.userIdentity;
        Map $r2 = $r10.toMap();
        $r9.put(USER, $r2);
        addSecureHash($r9);
        MessengerApi $r11 = this.messengerApi;
        Call $r12 = $r11.logEvent($r9);
        CallbackHolder $r13 = this.callbacks;
        BaseCallback $r14 = $r13.unreadCallback();
        $r12.enqueue($r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void markConversationAsDismissed(String str) {
        HashMap $r2 = new HashMap();
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r2.put(USER, $r4);
        String[] $r5 = {str};
        $r2.put("conversation_ids", $r5);
        addSecureHash($r2);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.markAsDismissed($r2);
        Callback $r8 = this.emptyCallback;
        $r7.enqueue($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void markConversationAsRead(String str) {
        HashMap $r2 = new HashMap();
        AppIdentity $r3 = this.appIdentity;
        String $r4 = $r3.appId();
        $r2.put("app_id", $r4);
        UserIdentity $r5 = this.userIdentity;
        Map $r6 = $r5.toMap();
        $r2.put(USER, $r6);
        addSecureHash($r2);
        MessengerApi $r7 = this.messengerApi;
        Call $r8 = $r7.markAsRead(str, $r2);
        Callback $r9 = this.emptyCallback;
        $r8.enqueue($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void markPushAsOpened(String str) {
        HashMap $r2 = new HashMap();
        $r2.put("instance_id", str);
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r2.put(USER, $r4);
        addSecureHash($r2);
        MessengerApi $r5 = this.messengerApi;
        Call $r6 = $r5.markPushAsOpened($r2);
        Callback $r7 = this.emptyCallback;
        $r6.enqueue($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void rateConversation(String str, int i) {
        HashMap $r2 = new HashMap();
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r2.put(USER, $r4);
        Integer $r5 = Integer.valueOf(i);
        $r2.put("rating_index", $r5);
        addSecureHash($r2);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.rateConversation(str, $r2);
        CallbackHolder $r8 = this.callbacks;
        Callback $r9 = $r8.loggingCallback("conversation rating");
        $r7.enqueue($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void reactToConversation(String str, int i) {
        HashMap $r2 = new HashMap();
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r2.put(USER, $r4);
        Integer $r5 = Integer.valueOf(i);
        $r2.put("reaction_index", $r5);
        addSecureHash($r2);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.reactToConversation(str, $r2);
        CallbackHolder $r8 = this.callbacks;
        Callback $r9 = $r8.loggingCallback("add reaction to conversation");
        $r7.enqueue($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void reactToLink(String str, String str2, int i, boolean z) {
        HashMap $r1 = new HashMap();
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r1.put(USER, $r5);
        $r1.put("article_content_id", str2);
        Integer $r6 = Integer.valueOf(i);
        $r1.put("reaction_index", $r6);
        Boolean $r7 = Boolean.valueOf(z);
        $r1.put("allow_auto_responses", $r7);
        addSecureHash($r1);
        MessengerApi $r8 = this.messengerApi;
        Call $r9 = $r8.reactToLink(str, $r1);
        CallbackHolder $r10 = this.callbacks;
        Callback $r11 = $r10.loggingCallback("add reaction to link");
        $r9.enqueue($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void removeDeviceToken(String str, UserIdentity userIdentity) {
        HashMap $r1 = new HashMap();
        Map $r4 = userIdentity.toMap();
        $r1.put(USER, $r4);
        $r1.put(DEVICE_TOKEN, str);
        addSecureHash($r1);
        MessengerApi $r5 = this.messengerApi;
        Call $r6 = $r5.deleteDeviceToken($r1);
        Callback $r7 = this.emptyCallback;
        $r6.enqueue($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void replyToConversation(String str, List list, int i, String str2, boolean z) {
        Map $r4 = createBaseReplyParams();
        $r4.put("blocks", list);
        MessengerApi $r5 = this.messengerApi;
        Call $r6 = $r5.replyToConversation(str, $r4);
        CallbackHolder $r7 = this.callbacks;
        Callback $r8 = $r7.replyCallback(i, z, str2, str);
        $r6.enqueue($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void retriableUpdateUser(Map map) {
        UserIdentity $r3 = this.userIdentity;
        String $r2 = $r3.getFingerprint();
        retriableUpdateUser(map, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void satisfyOperatorCondition(String str, String str2) {
        HashMap $r1 = new HashMap();
        UserIdentity $r4 = this.userIdentity;
        Map $r5 = $r4.toMap();
        $r1.put(USER, $r5);
        $r1.put("transition_id", str2);
        addSecureHash($r1);
        MessengerApi $r6 = this.messengerApi;
        Call $r7 = $r6.satisfyCondition(str, $r1);
        Callback $r8 = this.emptyCallback;
        $r7.enqueue($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void sendErrorReport(ErrorReport errorReport) {
        HashMap $r2 = new HashMap();
        UserIdentity $r3 = this.userIdentity;
        Map $r4 = $r3.toMap();
        $r2.put(USER, $r4);
        $r2.put("error_report", errorReport);
        addSecureHash($r2);
        MessengerApi $r5 = this.messengerApi;
        Call $r6 = $r5.reportError($r2);
        CallbackHolder $r7 = this.callbacks;
        Callback $r8 = $r7.loggingCallback("report error");
        $r6.enqueue($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void sendMetrics(List list, List list2, Callback callback) {
        HashMap $r3 = new HashMap();
        $r3.put("metrics", list);
        $r3.put("op_metrics", list2);
        MessengerApi $r6 = this.messengerApi;
        Call $r4 = $r6.sendMetrics($r3);
        $r4.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setDeviceToken(String str) {
        Context $r2 = this.context;
        Map $r3 = DeviceData.generateDeviceData($r2);
        $r3.put(DEVICE_TOKEN, str);
        HashMap $r4 = new HashMap();
        UserIdentity $r5 = this.userIdentity;
        Map $r6 = $r5.toMap();
        $r4.put(USER, $r6);
        $r4.put(DEVICE_DATA, $r3);
        addSecureHash($r4);
        MessengerApi $r7 = this.messengerApi;
        Call $r8 = $r7.setDeviceToken($r4);
        Callback $r9 = this.emptyCallback;
        $r8.enqueue($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setIdleCallback(Runnable runnable) {
        OkHttpClient $r3 = this.apiHttpClient;
        Dispatcher $r2 = $r3.dispatcher();
        $r2.setIdleCallback(runnable);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void startNewConversation(List list, int i, String str, List list2) {
        Map $r4 = baseNewConversationParams();
        $r4.put("blocks", list);
        C10916e $r5 = this.gson;
        String $r6 = $r5.m11952s(list2);
        $r4.put(MetricTracker.Object.COMPOSER_SUGGESTIONS, $r6);
        MessengerApi $r7 = this.messengerApi;
        Call $r8 = $r7.startNewConversation($r4);
        CallbackHolder $r9 = this.callbacks;
        Callback $r10 = $r9.newConversationCallback(i, str);
        $r8.enqueue($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void submitForm(String str, String str2, String str3, Object obj, String str4) {
        UserIdentity $r7 = this.userIdentity;
        Map $r8 = $r7.toMap();
        addSecureHash($r8);
        HashMap $r3 = new HashMap();
        $r3.put("conversation_part_id", str2);
        $r3.put("identifier", str3);
        $r3.put("value", obj);
        $r3.put("type", str4);
        $r8.put("form_params", $r3);
        MessengerApi $r9 = this.messengerApi;
        Call $r10 = $r9.submitForm(str, $r8);
        CallbackHolder $r11 = this.callbacks;
        Callback $r12 = $r11.submitFormCallback(str2, str3);
        $r10.enqueue($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void submitSheet(String str, Map map, Callback callback) {
        HashMap $r3 = new HashMap();
        UserIdentity $r5 = this.userIdentity;
        Map $r6 = $r5.toMap();
        $r3.put(USER, $r6);
        addSecureHash($r3);
        $r3.put("uri", str);
        $r3.put("sheet_values", map);
        MessengerApi $r7 = this.messengerApi;
        Call $r8 = $r7.submitSheet($r3);
        $r8.enqueue(callback);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void triggerInboundCustomBot(Part part, String str, int i, String str2) {
        HashMap $r1 = new HashMap();
        UserIdentity $r5 = this.userIdentity;
        Map $r6 = $r5.toMap();
        $r1.put(USER, $r6);
        $r1.put("id", str);
        $r1.put("client_assigned_uuid", str2);
        addSecureHash($r1);
        MessengerApi $r7 = this.messengerApi;
        Call $r8 = $r7.triggerInboundConversation($r1);
        CallbackHolder $r9 = this.callbacks;
        String $r3 = part.getId();
        Callback $r10 = $r9.triggeredInboundBotCallback(i, $r3);
        $r8.enqueue($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateMaxRequests() {
        UserIdentity $r1 = this.userIdentity;
        boolean $z0 = $r1.hasIntercomId();
        int $i0 = $z0 ? this.defaultOkHttpMaxRequests : 1;
        OkHttpClient $r2 = this.apiHttpClient;
        Dispatcher $r3 = $r2.dispatcher();
        int $i1 = $r3.getMaxRequests();
        if ($i1 != $i0) {
            $r3.setMaxRequests($i0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateUser(UserUpdateRequest userUpdateRequest) {
        boolean $z0 = userUpdateRequest.isInternalUpdate();
        if (!$z0) {
            RateLimiter $r2 = this.rateLimiter;
            boolean $z02 = $r2.isLimited();
            if ($z02) {
                RateLimiter $r22 = this.rateLimiter;
                $r22.logError();
                return;
            }
            boolean $z03 = userUpdateRequest.isSentFromBackground();
            if (shouldStopBackgroundRequest($z03)) {
                logBackgroundDisabledError();
                return;
            } else {
                RateLimiter $r23 = this.rateLimiter;
                $r23.recordRequest();
            }
        }
        Map $r3 = generateUpdateUserParams(userUpdateRequest);
        retriableUpdateUser($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void uploadFile(final GalleryImage galleryImage, final int i, final String str, final UploadingImageCache uploadingImageCache, final UploadProgressListener uploadProgressListener) {
        final String $r6 = galleryImage.getFileName();
        final String $r7 = galleryImage.getMimeType();
        HashMap $r8 = new HashMap();
        HashMap $r9 = new HashMap();
        $r9.put("original_filename", $r6);
        int $i1 = galleryImage.getFileSize();
        Integer $r10 = Integer.valueOf($i1);
        $r9.put("size_in_bytes", $r10);
        $r9.put("content_type", $r7);
        int $i12 = galleryImage.getImageWidth();
        Integer $r102 = Integer.valueOf($i12);
        $r9.put("width", $r102);
        int $i13 = galleryImage.getImageHeight();
        Integer $r103 = Integer.valueOf($i13);
        $r9.put("height", $r103);
        $r8.put(UPLOAD, $r9);
        UserIdentity $r11 = this.userIdentity;
        Map $r12 = $r11.toMap();
        $r8.put(USER, $r12);
        addSecureHash($r8);
        MessengerApi $r13 = this.messengerApi;
        Call $r14 = $r13.uploadFile($r8);
        $r14.enqueue(new io.intercom.android.sdk.api.BaseCallback<Upload.Builder>() { // from class: io.intercom.android.sdk.package_2.Api$2
            void logFailure(String str2, ErrorObject errorObject) {
                super.logFailure("Upload failed", errorObject);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onError(ErrorObject errorObject) {
                FeedbackDialog $r4 = FeedbackDialog.this;
                C11129b $r5 = $r4.val$handler;
                int $i0 = i;
                String $r2 = str;
                UploadFailedEvent $r1 = new UploadFailedEvent($i0, $r2);
                $r5.post($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public void onSuccess(Upload.Builder builder) {
                final Upload $r3 = builder.build();
                UploadingImageCache $r4 = uploadingImageCache;
                GalleryImage $r5 = galleryImage;
                $r4.url($r3, $r5);
                MultipartBody.Builder $r62 = new MultipartBody.Builder();
                MediaType $r72 = MultipartBody.FORM;
                MultipartBody.Builder $r63 = $r62.setType($r72);
                String $r82 = $r3.getKey();
                MultipartBody.Builder $r64 = $r63.addFormDataPart("key", $r82);
                String $r83 = $r3.getAcl();
                MultipartBody.Builder $r65 = $r64.addFormDataPart("acl", $r83);
                String $r84 = $r3.getContentType();
                MultipartBody.Builder $r66 = $r65.addFormDataPart("Content-Type", $r84);
                String $r85 = $r3.getAwsAccessKey();
                MultipartBody.Builder $r67 = $r66.addFormDataPart("AWSAccessKeyId", $r85);
                String $r86 = $r3.getPolicy();
                MultipartBody.Builder $r68 = $r67.addFormDataPart("policy", $r86);
                String $r87 = $r3.getSignature();
                MultipartBody.Builder $r69 = $r68.addFormDataPart("signature", $r87);
                String $r88 = $r3.getSuccessActionStatus();
                MultipartBody.Builder $r610 = $r69.addFormDataPart("success_action_status", $r88);
                String $r89 = $r6;
                String $r104 = $r7;
                MediaType $r73 = MediaType.parse($r104);
                GalleryImage $r52 = galleryImage;
                File $r112 = $r52.buildFile();
                UploadProgressListener $r1 = uploadProgressListener;
                ProgressRequestBody $r92 = new ProgressRequestBody($r73, $r112, $r1);
                MultipartBody $r122 = $r610.addFormDataPart("file", $r89, $r92).build();
                FeedbackDialog $r132 = FeedbackDialog.this;
                OkHttpClient $r142 = $r132.httpClient;
                Request.Builder $r15 = new Request.Builder();
                String $r810 = $r3.getUploadDestination();
                Request $r16 = $r15.url($r810).post($r122).build();
                io.intercom.okhttp3.Call $r17 = $r142.newCall($r16);
                $r17.enqueue(new io.intercom.okhttp3.Callback() { // from class: io.intercom.android.sdk.package_2.Api$2.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // io.intercom.okhttp3.Callback
                    public void onFailure(io.intercom.okhttp3.Call call, IOException iOException) {
                        Twig $r32 = FeedbackDialog.TWIG;
                        StringBuilder $r42 = new StringBuilder();
                        $r42.append("Upload failed: ");
                        String $r53 = iOException.getMessage();
                        $r42.append($r53);
                        String $r54 = $r42.toString();
                        Object[] $r611 = new Object[0];
                        $r32.m13068e($r54, $r611);
                        Api$2 $r74 = Api$2.this;
                        FeedbackDialog $r811 = FeedbackDialog.this;
                        C11129b $r93 = $r811.val$handler;
                        int $i0 = i;
                        String $r55 = str;
                        UploadFailedEvent $r105 = new UploadFailedEvent($i0, $r55);
                        $r93.post($r105);
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // io.intercom.okhttp3.Callback
                    public void onResponse(io.intercom.okhttp3.Call call, io.intercom.okhttp3.Response response) throws IOException {
                        Twig $r53 = FeedbackDialog.TWIG;
                        $r53.internal("API Success", "Successfully uploaded");
                        boolean $z0 = response.isSuccessful();
                        if ($z0) {
                            Api$2 $r611 = Api$2.this;
                            FeedbackDialog $r74 = FeedbackDialog.this;
                            C11129b $r811 = $r74.val$handler;
                            Upload $r93 = $r3;
                            GalleryImage $r105 = galleryImage;
                            int $i14 = $r105.getFileSize();
                            long $l0 = $i14;
                            Api$2 $r612 = Api$2.this;
                            int $i15 = i;
                            String $r2 = str;
                            UploadEvent $r32 = new UploadEvent($r93, $l0, $i15, $r2);
                            $r811.post($r32);
                        } else {
                            Twig $r54 = FeedbackDialog.TWIG;
                            StringBuilder $r113 = new StringBuilder();
                            $r113.append("Upload failed: request body ");
                            ResponseBody $r123 = response.body();
                            $r113.append($r123);
                            String $r22 = $r113.toString();
                            Object[] $r133 = new Object[0];
                            $r54.m13068e($r22, $r133);
                            Api$2 $r613 = Api$2.this;
                            FeedbackDialog $r75 = FeedbackDialog.this;
                            C11129b $r812 = $r75.val$handler;
                            int $i16 = i;
                            String $r23 = str;
                            UploadFailedEvent $r143 = new UploadFailedEvent($i16, $r23);
                            $r812.post($r143);
                        }
                        ResponseBody $r124 = response.body();
                        $r124.close();
                    }
                });
                Twig $r19 = FeedbackDialog.TWIG;
                $r19.internal("API Success", "Successfully uploaded");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                Upload.Builder $r2 = (Upload.Builder) obj;
                onSuccess($r2);
            }
        });
    }
}
