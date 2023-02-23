package io.intercom.android.sdk.experimental;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.ResetManager;
import io.intercom.android.sdk.UnreadConversationCountListener;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.IntercomHelpCenterActivity;
import io.intercom.android.sdk.activities.IntercomMessengerActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.UserUpdateBatcher;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusConfig;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.package_2.DeDuper;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.package_2.UserUpdateRequest;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.store.UnreadCountTracker;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class RealIntercom extends Intercom {
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Context context;
    private final MetricTracker metricTracker;
    private final NexusClient nexusClient;
    private final OverlayPresenter overlayPresenter;
    private final ResetManager resetManager;
    private final Store<State> store;
    private final DeDuper superDeDuper;
    private final SystemNotificationManager systemNotificationManager;
    private final Twig twig;
    private final UnreadCountTracker unreadCountTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserUpdateBatcher> userUpdateBatcher;

    /* renamed from: io.intercom.android.sdk.experimental.RealIntercom$2 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C102682 {

        /* renamed from: $SwitchMap$io$intercom$android$sdk$IntercomPushManager$IntercomPushIntegrationType */
        static final /* synthetic */ int[] f23892x159dfaf9;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            IntercomPushManager.IntercomPushIntegrationType[] $r1 = IntercomPushManager.IntercomPushIntegrationType.values();
            int $i0 = $r1.length;
            int[] $r2 = new int[$i0];
            f23892x159dfaf9 = $r2;
            try {
                Enum $r3 = IntercomPushManager.IntercomPushIntegrationType.FCM;
                Enum r4 = $r3;
                int $i02 = r4.ordinal();
                $r2[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    RealIntercom(DeDuper deDuper, Provider provider, NexusClient nexusClient, Store store, UnreadCountTracker unreadCountTracker, MetricTracker metricTracker, Context context, OverlayPresenter overlayPresenter, Provider provider2, UserIdentity userIdentity, SystemNotificationManager systemNotificationManager, Provider provider3, ResetManager resetManager, Twig twig, ActivityFinisher activityFinisher) {
        this.superDeDuper = deDuper;
        this.apiProvider = provider;
        this.nexusClient = nexusClient;
        this.store = store;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = context;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider2;
        this.userIdentity = userIdentity;
        this.systemNotificationManager = systemNotificationManager;
        this.userUpdateBatcher = provider3;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        int[] $r16 = C102682.f23892x159dfaf9;
        Enum $r17 = IntercomPushManager.getInstalledModuleType();
        Enum r19 = $r17;
        int $i0 = r19.ordinal();
        if ($r16[$i0] != 1) {
            systemNotificationManager.deleteNotificationChannels();
            twig.internal("No FCM integration detected");
            return;
        }
        Object[] $r18 = new Object[0];
        twig.m13065i("Enabling FCM for cloud messaging", $r18);
        systemNotificationManager.setUpNotificationChannelsIfSupported(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RealIntercom create(Application application, String str, String str2) {
        Injector.initWithAppCredentials(application, str, str2);
        Injector $r5 = Injector.get();
        UserIdentity $r6 = $r5.getUserIdentity();
        Store $r7 = $r5.getStore();
        DeDuper $r8 = $r5.getDeDuper();
        Provider $r9 = $r5.getApiProvider();
        NexusClient $r10 = $r5.getNexusClient();
        UnreadCountTracker $r3 = new UnreadCountTracker($r7);
        MetricTracker $r11 = $r5.getMetricTracker();
        OverlayPresenter $r12 = $r5.getOverlayPresenter();
        Provider $r13 = $r5.getAppConfigProvider();
        SystemNotificationManager $r14 = $r5.getSystemNotificationManager();
        Provider $r15 = $r5.getUserUpdateBatcherProvider();
        ResetManager $r16 = $r5.getResetManager();
        Twig $r17 = LumberMill.getLogger();
        ActivityFinisher $r18 = $r5.getActivityFinisher();
        RealIntercom $r4 = new RealIntercom($r8, $r9, $r10, $r7, $r3, $r11, application, $r12, $r13, $r6, $r14, $r15, $r16, $r17, $r18);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void logErrorAndOpenInbox(String str) {
        Twig $r2 = this.twig;
        Object[] $r3 = new Object[0];
        $r2.m13068e(str, $r3);
        displayConversationsList();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void logEventWithValidation(String str, Map map) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            Twig $r3 = this.twig;
            Object[] $r4 = new Object[0];
            $r3.m13068e("The event name is null or empty. We can't log an event with this string.", $r4);
            return;
        }
        Provider $r5 = this.userUpdateBatcher;
        Object $r6 = $r5.get();
        io.intercom.android.sdk.package_2.UserUpdateBatcher $r7 = (io.intercom.android.sdk.package_2.UserUpdateBatcher) $r6;
        $r7.submitPendingUpdate();
        Provider $r52 = this.apiProvider;
        Object $r62 = $r52.get();
        FeedbackDialog $r8 = (FeedbackDialog) $r62;
        $r8.logEvent(str, map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean noUserRegistered() {
        UserIdentity $r1 = this.userIdentity;
        boolean $z0 = $r1.identityExists();
        if ($z0) {
            UserIdentity $r12 = this.userIdentity;
            boolean $z02 = $r12.isSoftReset();
            return $z02;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void openIntercomChatPush(String str, TaskStackBuilder taskStackBuilder) {
        Intent $r4;
        boolean $z0 = str.equals(IntercomPushManager.MULTIPLE_NOTIFICATIONS);
        if ($z0) {
            Context $r3 = this.context;
            $r4 = IntercomMessengerActivity.openInbox($r3);
        } else {
            Context $r32 = this.context;
            LastParticipatingAdmin $r5 = LastParticipatingAdmin.NULL;
            $r4 = IntercomMessengerActivity.openConversation($r32, str, $r5);
        }
        if (taskStackBuilder != null) {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 16) {
                taskStackBuilder.addNextIntent($r4);
                Context $r33 = this.context;
                Intent[] $r6 = taskStackBuilder.getIntents();
                $r33.startActivities($r6);
                MetricTracker $r7 = this.metricTracker;
                $r7.viewedPushNotification(str);
                SystemNotificationManager $r8 = this.systemNotificationManager;
                $r8.clear();
            }
        }
        Context $r34 = this.context;
        $r34.startActivity($r4);
        MetricTracker $r72 = this.metricTracker;
        $r72.viewedPushNotification(str);
        SystemNotificationManager $r82 = this.systemNotificationManager;
        $r82.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void performUpdate(Map map) {
        DeDuper $r3 = this.superDeDuper;
        boolean $z0 = $r3.shouldUpdateUser(map);
        if (!$z0) {
            Twig $r10 = this.twig;
            $r10.internal("dupe", "dropped dupe");
            return;
        }
        DeDuper $r32 = this.superDeDuper;
        $r32.update(map);
        Store $r4 = this.store;
        Store.Selector $r5 = Selectors.APP_IS_BACKGROUNDED;
        Object $r6 = $r4.select($r5);
        Boolean $r7 = (Boolean) $r6;
        Provider $r8 = this.userUpdateBatcher;
        Object $r62 = $r8.get();
        io.intercom.android.sdk.package_2.UserUpdateBatcher $r9 = (io.intercom.android.sdk.package_2.UserUpdateBatcher) $r62;
        boolean $z02 = $r7.booleanValue();
        UserUpdateRequest $r1 = new UserUpdateRequest(false, $z02, map, false);
        $r9.updateUser($r1);
        Twig $r102 = this.twig;
        $r102.internal("dupe", "updated user");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void registerIdentifiedUser(Registration registration) {
        UserUpdateRequest $r13;
        if (registration == null) {
            Twig $r2 = this.twig;
            Object[] $r3 = new Object[0];
            $r2.m13068e("The registration object you passed to is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", $r3);
            return;
        }
        boolean $z0 = userIsRegistered(registration);
        if ($z0) {
            softRegister();
            return;
        }
        ResetManager $r4 = this.resetManager;
        $r4.hardReset();
        UserIdentity $r5 = this.userIdentity;
        boolean $z02 = $r5.canRegisterIdentifiedUser(registration);
        if (!$z02) {
            UserIdentity $r52 = this.userIdentity;
            boolean $z03 = $r52.registrationHasAttributes(registration);
            if ($z03) {
                UserAttributes $r12 = registration.getAttributes();
                if ($r12 != null) {
                    Twig $r22 = this.twig;
                    Object[] $r32 = new Object[0];
                    $r22.m13065i("We already have a registered user. Updating this user with the attributes provided.", $r32);
                    UserAttributes $r122 = registration.getAttributes();
                    Map $r14 = $r122.toMap();
                    performUpdate($r14);
                    return;
                }
            }
            Twig $r23 = this.twig;
            Object[] $r33 = new Object[0];
            $r23.m13065i("Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this.", $r33);
            return;
        }
        UserIdentity $r53 = this.userIdentity;
        $r53.registerIdentifiedUser(registration);
        NexusClient $r6 = this.nexusClient;
        $r6.disconnect();
        Store $r7 = this.store;
        Store.Selector $r8 = Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED;
        Object $r9 = $r7.select($r8);
        boolean $z04 = ((Boolean) $r9).booleanValue();
        Boolean $r10 = Boolean.valueOf(!$z04);
        Store $r72 = this.store;
        Store.Selector $r82 = Selectors.APP_IS_BACKGROUNDED;
        Object $r92 = $r72.select($r82);
        Boolean $r11 = (Boolean) $r92;
        UserAttributes $r123 = registration.getAttributes();
        if ($r123 != null) {
            boolean $z05 = $r10.booleanValue();
            boolean $z1 = $r11.booleanValue();
            UserAttributes $r124 = registration.getAttributes();
            Map $r142 = $r124.toMap();
            $r13 = new UserUpdateRequest($z05, $z1, $r142, true);
        } else {
            boolean $z06 = $r10.booleanValue();
            boolean $z12 = $r11.booleanValue();
            $r13 = new UserUpdateRequest($z06, $z12, true);
        }
        Provider $r15 = this.userUpdateBatcher;
        Object $r93 = $r15.get();
        io.intercom.android.sdk.package_2.UserUpdateBatcher $r16 = (io.intercom.android.sdk.package_2.UserUpdateBatcher) $r93;
        $r16.updateUser($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void registerUnidentifiedUser() {
        UserIdentity $r2 = this.userIdentity;
        boolean $z0 = $r2.canRegisterUnidentifiedUser();
        if (!$z0) {
            Twig $r12 = this.twig;
            Object[] $r13 = new Object[0];
            $r12.m13065i("Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)", $r13);
            return;
        }
        ResetManager $r3 = this.resetManager;
        $r3.hardReset();
        UserIdentity $r22 = this.userIdentity;
        $r22.registerUnidentifiedUser();
        NexusClient $r4 = this.nexusClient;
        $r4.disconnect();
        Store $r5 = this.store;
        Store.Selector $r6 = Selectors.APP_IS_BACKGROUNDED;
        Object $r7 = $r5.select($r6);
        Boolean $r8 = (Boolean) $r7;
        Store $r52 = this.store;
        Store.Selector $r62 = Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED;
        Object $r72 = $r52.select($r62);
        Boolean $r9 = (Boolean) $r72;
        boolean $z02 = $r9.booleanValue();
        Boolean $r92 = Boolean.valueOf(!$z02);
        Provider $r10 = this.userUpdateBatcher;
        Object $r73 = $r10.get();
        boolean $z03 = $r92.booleanValue();
        boolean $z1 = $r8.booleanValue();
        UserUpdateRequest $r1 = new UserUpdateRequest($z03, $z1, true);
        ((io.intercom.android.sdk.package_2.UserUpdateBatcher) $r73).updateUser($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void softRegister() {
        Context $r1 = this.context;
        String $r2 = DeviceData.getDeviceToken($r1);
        boolean $z0 = TextUtils.isEmpty($r2);
        if (!$z0) {
            Provider $r3 = this.apiProvider;
            Object $r4 = $r3.get();
            FeedbackDialog $r5 = (FeedbackDialog) $r4;
            $r5.setDeviceToken($r2);
        }
        NexusClient $r6 = this.nexusClient;
        Provider $r32 = this.appConfigProvider;
        Object $r42 = $r32.get();
        AppConfig $r7 = (AppConfig) $r42;
        NexusConfig $r8 = $r7.getRealTimeConfig();
        $r6.connect($r8, true);
        UserIdentity $r9 = this.userIdentity;
        $r9.softRestart();
        ResetManager $r10 = this.resetManager;
        $r10.clear();
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.experimental.RealIntercom.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                RealIntercom $r22 = RealIntercom.this;
                OverlayPresenter $r12 = $r22.overlayPresenter;
                $r12.refreshStateBecauseUserIdentityIsNotInStoreYet();
            }
        };
        Looper $r12 = Looper.myLooper();
        Looper $r13 = Looper.getMainLooper();
        if ($r12 == $r13) {
            runnable.run();
            return;
        }
        Looper $r122 = Looper.getMainLooper();
        Handler $r14 = new Handler($r122);
        $r14.post(runnable);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean userIsRegistered(Registration registration) {
        UserIdentity $r2 = this.userIdentity;
        boolean $z0 = $r2.isSoftReset();
        if ($z0) {
            UserIdentity $r22 = this.userIdentity;
            boolean $z02 = $r22.isSameUser(registration);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        if (unreadConversationCountListener != null) {
            UnreadCountTracker $r2 = this.unreadCountTracker;
            $r2.addListener(unreadConversationCountListener);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayConversationsList() {
        MetricTracker $r2 = this.metricTracker;
        LauncherOpenBehaviour.LauncherType $r3 = LauncherOpenBehaviour.LauncherType.CUSTOM;
        $r2.openedMessengerConversationList($r3);
        Context $r4 = this.context;
        Intent $r1 = IntercomMessengerActivity.openHomeScreen($r4);
        $r4.startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayHelpCenter() {
        Provider $r1 = this.appConfigProvider;
        Object $r2 = $r1.get();
        AppConfig $r3 = (AppConfig) $r2;
        String $r4 = $r3.getHelpCenterUrl();
        boolean $z0 = TextUtils.isEmpty($r4);
        if ($z0) {
            Twig $r5 = this.twig;
            Object[] $r6 = new Object[0];
            $r5.m13068e("Could not open Help Center. Please make sure you have turned on Help Center in Educate settings.", $r6);
            return;
        }
        Context $r7 = this.context;
        Provider $r12 = this.appConfigProvider;
        Object $r22 = $r12.get();
        AppConfig $r32 = (AppConfig) $r22;
        String $r42 = $r32.getHelpCenterUrl();
        Intent $r8 = IntercomHelpCenterActivity.buildIntent($r7, $r42, 1, "");
        Context $r72 = this.context;
        $r72.startActivity($r8);
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessageComposer() {
        displayMessageComposer("");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessageComposer(String str) {
        boolean $z0 = noUserRegistered();
        if ($z0) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        Provider $r3 = this.appConfigProvider;
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        boolean $z02 = $r5.isReceivedFromServer();
        if (!$z02) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check you are using the correct Android app ID and API Key from the Intercom settings.");
            return;
        }
        Provider $r32 = this.appConfigProvider;
        Object $r42 = $r32.get();
        AppConfig $r52 = (AppConfig) $r42;
        boolean $z03 = $r52.isInboundMessages();
        if (!$z03) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling displayConversationsList()");
            return;
        }
        MetricTracker $r6 = this.metricTracker;
        LauncherOpenBehaviour.LauncherType $r1 = LauncherOpenBehaviour.LauncherType.CUSTOM;
        $r6.openedMessengerNewConversation($r1);
        Context $r7 = this.context;
        Intent $r8 = IntercomMessengerActivity.openComposer($r7, str);
        $r7.startActivity($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void displayMessenger() {
        boolean $z0 = noUserRegistered();
        if ($z0) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        Store $r5 = this.store;
        LauncherOpenBehaviour.LauncherType $r1 = LauncherOpenBehaviour.LauncherType.CUSTOM;
        MetricTracker $r2 = this.metricTracker;
        Provider $r3 = this.appConfigProvider;
        LauncherOpenBehaviour $r4 = new LauncherOpenBehaviour($r5, $r1, $r2, $r3);
        Context $r6 = this.context;
        $r4.openMessenger($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public int getUnreadConversationCount() {
        Store $r1 = this.store;
        Object $r2 = $r1.state();
        State $r3 = (State) $r2;
        Set $r4 = $r3.unreadConversationIds();
        int $i0 = $r4.size();
        return $i0;
    }

    @Override // io.intercom.android.sdk.experimental.Intercom
    public void handlePushMessage() {
        handlePushMessage(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void handlePushMessage(TaskStackBuilder taskStackBuilder) {
        Context $r2 = this.context;
        SharedPreferences $r3 = $r2.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String $r4 = $r3.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        boolean $z0 = TextUtils.isEmpty($r4);
        if ($z0) {
            Twig $r5 = this.twig;
            $r5.internal("No Uri found");
            return;
        }
        openIntercomChatPush($r4, taskStackBuilder);
        SharedPreferences.Editor $r6 = $r3.edit();
        $r6.clear().apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void hideMessenger() {
        ActivityFinisher $r1 = this.activityFinisher;
        $r1.finishActivities();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void logEvent(String str) {
        Map $r2 = Collections.emptyMap();
        logEventWithValidation(str, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void logEvent(String str, Map map) {
        if (map == null) {
            Twig $r3 = this.twig;
            Object[] $r4 = new Object[0];
            $r3.m13065i("The metadata provided is null, logging event with no metadata", $r4);
            map = r5;
            HashMap r5 = new HashMap();
        } else {
            Map r6 = map;
            boolean $z0 = r6.isEmpty();
            if ($z0) {
                Twig $r32 = this.twig;
                Object[] $r42 = new Object[0];
                $r32.m13065i("The metadata provided is empty, logging event with no metadata", $r42);
            }
        }
        Map r62 = map;
        logEventWithValidation(str, r62);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void registerUser(IntercomSettings intercomSettings) {
        String $r2 = intercomSettings.getUserHash();
        boolean $z0 = TextUtils.isEmpty($r2);
        if (!$z0) {
            String $r22 = intercomSettings.getUserHash();
            setUserHash($r22);
        }
        boolean $z02 = intercomSettings.canIdentifyUser();
        if (!$z02) {
            registerUnidentifiedUser();
            return;
        }
        Registration $r3 = Registration.create();
        String $r23 = intercomSettings.getUserId();
        boolean $z03 = TextUtils.isEmpty($r23);
        if (!$z03) {
            String $r24 = intercomSettings.getUserId();
            $r3.withUserId($r24);
        }
        String $r25 = intercomSettings.getEmail();
        boolean $z04 = TextUtils.isEmpty($r25);
        if (!$z04) {
            String $r26 = intercomSettings.getEmail();
            $r3.withEmail($r26);
        }
        registerIdentifiedUser($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        UnreadCountTracker $r2 = this.unreadCountTracker;
        $r2.removeListener(unreadConversationCountListener);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setBottomPadding(int i) {
        Store $r1 = this.store;
        Action $r2 = Actions.setBottomPadding(i);
        $r1.dispatch($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setInAppMessageVisibility(Intercom.Visibility visibility) {
        Store $r1 = this.store;
        Action $r2 = Actions.setInAppNotificationVisibility(visibility);
        $r1.dispatch($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setLauncherVisibility(Intercom.Visibility visibility) {
        Store $r1 = this.store;
        Action $r2 = Actions.setLauncherVisibility(visibility);
        $r1.dispatch($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void setUserHash(String str) {
        boolean $z0 = TextUtils.isEmpty(str);
        if ($z0) {
            Twig $r2 = this.twig;
            Object[] $r3 = new Object[0];
            $r2.m13059w("The user hash you sent us to verify was either null or empty, we will not be able to authenticate your requests without a valid user hash.", $r3);
            return;
        }
        UserIdentity $r4 = this.userIdentity;
        String $r5 = $r4.getHmac();
        boolean $z02 = $r5.equals(str);
        if ($z02) {
            Twig $r22 = this.twig;
            Object[] $r32 = new Object[0];
            $r22.m13065i("The user hash set matches the existing user identity hash value", $r32);
            return;
        }
        UserIdentity $r42 = this.userIdentity;
        boolean $z03 = $r42.softUserIdentityHmacDiffers(str);
        if ($z03) {
            ResetManager $r6 = this.resetManager;
            $r6.hardReset();
        }
        UserIdentity $r43 = this.userIdentity;
        $r43.setUserHash(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void shutdown() {
        UserIdentity $r1 = this.userIdentity;
        boolean $z0 = $r1.isSoftReset();
        if ($z0) {
            return;
        }
        ResetManager $r2 = this.resetManager;
        $r2.softReset();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.experimental.Intercom
    public void updateUser(UserAttributes userAttributes) {
        if (userAttributes == null) {
            Twig $r2 = this.twig;
            Object[] $r3 = new Object[0];
            $r2.m13068e("updateUser method failed: the UserAttributes object provided is null", $r3);
            return;
        }
        UserIdentity $r4 = this.userIdentity;
        boolean $z0 = $r4.isUnidentified();
        if ($z0) {
            Map $r5 = userAttributes.toMap();
            boolean $z02 = UserMergeUtils.hasIdentificationData($r5);
            if ($z02) {
                Registration $r6 = new Registration();
                Map $r52 = userAttributes.toMap();
                UserMergeUtils.addIdentityDataToRegistration($r6, $r52);
                $r6.withUserAttributes(userAttributes);
                registerIdentifiedUser($r6);
                return;
            }
        }
        Map $r53 = userAttributes.toMap();
        performUpdate($r53);
    }
}
