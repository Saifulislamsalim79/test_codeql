package io.intercom.android.sdk;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.IntercomHelpCenterActivity;
import io.intercom.android.sdk.activities.IntercomMessengerActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateBatcher;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.store.UnreadCountTracker;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RealIntercom extends Intercom {
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Context context;
    private final ErrorReporter errorReporter;
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

    /* renamed from: io.intercom.android.sdk.RealIntercom$2 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C101152 {

        /* renamed from: $SwitchMap$io$intercom$android$sdk$IntercomPushManager$IntercomPushIntegrationType */
        static final /* synthetic */ int[] f23887x159dfaf9;

        static {
            int[] iArr = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            f23887x159dfaf9 = iArr;
            try {
                iArr[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    RealIntercom(DeDuper deDuper, Provider<Api> provider, NexusClient nexusClient, Store<State> store, UnreadCountTracker unreadCountTracker, MetricTracker metricTracker, ErrorReporter errorReporter, Context context, OverlayPresenter overlayPresenter, Provider<AppConfig> provider2, UserIdentity userIdentity, SystemNotificationManager systemNotificationManager, Provider<UserUpdateBatcher> provider3, ResetManager resetManager, Twig twig, ActivityFinisher activityFinisher) {
        this.superDeDuper = deDuper;
        this.apiProvider = provider;
        this.nexusClient = nexusClient;
        this.store = store;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.errorReporter = errorReporter;
        this.context = context;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = provider2;
        this.userIdentity = userIdentity;
        this.systemNotificationManager = systemNotificationManager;
        this.userUpdateBatcher = provider3;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        if (C101152.f23887x159dfaf9[IntercomPushManager.getInstalledModuleType().ordinal()] != 1) {
            systemNotificationManager.deleteNotificationChannels();
            twig.internal("No FCM integration detected");
        } else {
            twig.m13065i("Enabling FCM for cloud messaging", new Object[0]);
            systemNotificationManager.setUpNotificationChannelsIfSupported(context);
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intercom create(Application application, String str, String str2) {
        Injector.initWithAppCredentials(application, str, str2);
        Injector injector = Injector.get();
        UserIdentity userIdentity = injector.getUserIdentity();
        Store<State> store = injector.getStore();
        return new RealIntercom(injector.getDeDuper(), injector.getApiProvider(), injector.getNexusClient(), store, new UnreadCountTracker(store), injector.getMetricTracker(), injector.getErrorReporter(), application, injector.getOverlayPresenter(), injector.getAppConfigProvider(), userIdentity, injector.getSystemNotificationManager(), injector.getUserUpdateBatcherProvider(), injector.getResetManager(), LumberMill.getLogger(), injector.getActivityFinisher());
    }

    private void logErrorAndOpenInbox(String str) {
        this.twig.m13068e(str, new Object[0]);
        displayConversationsList();
    }

    private void logEventWithValidation(String str, Map<String, ?> map) {
        if (TextUtils.isEmpty(str)) {
            this.twig.m13068e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
            return;
        }
        this.userUpdateBatcher.get().submitPendingUpdate();
        this.apiProvider.get().logEvent(str, map);
    }

    private boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private void openIntercomChatPush(String str, TaskStackBuilder taskStackBuilder) {
        Intent openConversation;
        if (str.equals(IntercomPushManager.MULTIPLE_NOTIFICATIONS)) {
            openConversation = IntercomMessengerActivity.openInbox(this.context);
        } else {
            openConversation = IntercomMessengerActivity.openConversation(this.context, str, LastParticipatingAdmin.NULL);
        }
        if (taskStackBuilder != null && Build.VERSION.SDK_INT >= 16) {
            taskStackBuilder.addNextIntent(openConversation);
            this.context.startActivities(taskStackBuilder.getIntents());
        } else {
            this.context.startActivity(openConversation);
        }
        this.metricTracker.viewedPushNotification(str);
        this.systemNotificationManager.clear();
    }

    private void performUpdate(Map<String, Object> map) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(map);
        }
        if (this.superDeDuper.shouldUpdateUser(map)) {
            this.superDeDuper.update(map);
            this.userUpdateBatcher.get().updateUser(new UserUpdateRequest(false, ((Boolean) this.store.select(Selectors.APP_IS_BACKGROUNDED)).booleanValue(), map, false));
            this.twig.internal("dupe", "updated user");
            return;
        }
        this.twig.internal("dupe", "dropped dupe");
    }

    private boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_ERROR_REPORTING);
    }

    private void softRegister() {
        String deviceToken = DeviceData.getDeviceToken(this.context);
        if (!TextUtils.isEmpty(deviceToken)) {
            this.apiProvider.get().setDeviceToken(deviceToken);
        }
        this.nexusClient.connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.RealIntercom.1
            @Override // java.lang.Runnable
            public void run() {
                RealIntercom.this.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private boolean userIsRegistered(Registration registration) {
        return this.userIdentity.isSoftReset() && this.userIdentity.isSameUser(registration);
    }

    @Override // io.intercom.android.sdk.Intercom
    public void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        if (unreadConversationCountListener != null) {
            this.unreadCountTracker.addListener(unreadConversationCountListener);
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public void displayConversationsList() {
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        Context context = this.context;
        context.startActivity(IntercomMessengerActivity.openHomeScreen(context));
    }

    @Override // io.intercom.android.sdk.Intercom
    public void displayHelpCenter() {
        if (TextUtils.isEmpty(this.appConfigProvider.get().getHelpCenterUrl())) {
            if (noUserRegistered()) {
                this.twig.m13068e("The app config has not been retrieved, please call registerUnidentifiedUser() or registerIdentifiedUser(Registration) before calling displayHelpCenter().", new Object[0]);
                return;
            } else {
                this.twig.m13068e("Could not open Help Center. Please make sure you have turned on Help Center in Educate settings.", new Object[0]);
                return;
            }
        }
        this.context.startActivity(IntercomHelpCenterActivity.buildIntent(this.context, this.appConfigProvider.get().getHelpCenterUrl(), 1, ""));
    }

    @Override // io.intercom.android.sdk.Intercom
    public void displayMessageComposer() {
        displayMessageComposer("");
    }

    @Override // io.intercom.android.sdk.Intercom
    public void displayMessenger() {
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour(this.store, LauncherOpenBehaviour.LauncherType.CUSTOM, this.metricTracker, this.appConfigProvider).openMessenger(this.context);
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public int getUnreadConversationCount() {
        return this.store.state().unreadConversationIds().size();
    }

    @Override // io.intercom.android.sdk.Intercom
    public void handlePushMessage() {
        handlePushMessage(null);
    }

    @Override // io.intercom.android.sdk.Intercom
    public void hideMessenger() {
        this.activityFinisher.finishActivities();
    }

    @Override // io.intercom.android.sdk.Intercom
    public void logEvent(String str) {
        logEventWithValidation(str, Collections.emptyMap());
    }

    @Override // io.intercom.android.sdk.Intercom
    public void logout() {
        if (this.userIdentity.isSoftReset()) {
            return;
        }
        this.resetManager.softReset();
    }

    @Override // io.intercom.android.sdk.Intercom
    public void registerIdentifiedUser(Registration registration) {
        UserUpdateRequest userUpdateRequest;
        if (registration == null) {
            this.twig.m13068e("The registration object you passed to is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
        } else if (userIsRegistered(registration)) {
            softRegister();
        } else {
            this.resetManager.hardReset();
            if (this.userIdentity.canRegisterIdentifiedUser(registration)) {
                this.userIdentity.registerIdentifiedUser(registration);
                this.nexusClient.disconnect();
                Boolean valueOf = Boolean.valueOf(!((Boolean) this.store.select(Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED)).booleanValue());
                Boolean bool = (Boolean) this.store.select(Selectors.APP_IS_BACKGROUNDED);
                if (registration.getAttributes() != null) {
                    userUpdateRequest = new UserUpdateRequest(valueOf.booleanValue(), bool.booleanValue(), registration.getAttributes().toMap(), true);
                } else {
                    userUpdateRequest = new UserUpdateRequest(valueOf.booleanValue(), bool.booleanValue(), true);
                }
                this.userUpdateBatcher.get().updateUser(userUpdateRequest);
            } else if (this.userIdentity.registrationHasAttributes(registration)) {
                this.twig.m13065i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
                updateUser(registration.getAttributes());
            } else {
                this.twig.m13065i("Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this.", new Object[0]);
            }
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public void registerUnidentifiedUser() {
        if (this.userIdentity.canRegisterUnidentifiedUser()) {
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClient.disconnect();
            this.userUpdateBatcher.get().updateUser(new UserUpdateRequest(Boolean.valueOf(!((Boolean) this.store.select(Selectors.SESSION_STARTED_SINCE_LAST_BACKGROUNDED)).booleanValue()).booleanValue(), ((Boolean) this.store.select(Selectors.APP_IS_BACKGROUNDED)).booleanValue(), true));
            return;
        }
        this.twig.m13065i("Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)", new Object[0]);
    }

    @Override // io.intercom.android.sdk.Intercom
    public void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener) {
        this.unreadCountTracker.removeListener(unreadConversationCountListener);
    }

    @Override // io.intercom.android.sdk.Intercom
    public void reset() {
        logout();
    }

    @Override // io.intercom.android.sdk.Intercom
    public void setBottomPadding(int i) {
        this.store.dispatch(Actions.setBottomPadding(i));
    }

    @Override // io.intercom.android.sdk.Intercom
    public void setInAppMessageVisibility(Intercom.Visibility visibility) {
        this.store.dispatch(Actions.setInAppNotificationVisibility(visibility));
    }

    @Override // io.intercom.android.sdk.Intercom
    public void setLauncherVisibility(Intercom.Visibility visibility) {
        this.store.dispatch(Actions.setLauncherVisibility(visibility));
    }

    @Override // io.intercom.android.sdk.Intercom
    public void setUserHash(String str) {
        if (TextUtils.isEmpty(str)) {
            this.twig.m13059w("The user hash you sent us to verify was either null or empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else if (this.userIdentity.getHmac().equals(str)) {
            this.twig.m13065i("The user hash set matches the existing user identity hash value", new Object[0]);
        } else {
            if (this.userIdentity.softUserIdentityHmacDiffers(str)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(str);
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public void updateUser(UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.twig.m13068e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            performUpdate(userAttributes.toMap());
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public void displayMessageComposer(String str) {
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check you are using the correct Android app ID and API Key from the Intercom settings.");
        } else if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling displayConversationsList()");
        } else {
            this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
            Context context = this.context;
            context.startActivity(IntercomMessengerActivity.openComposer(context, str));
        }
    }

    @Override // io.intercom.android.sdk.Intercom
    public void handlePushMessage(TaskStackBuilder taskStackBuilder) {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String string = sharedPreferences.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        if (TextUtils.isEmpty(string)) {
            this.twig.internal("No Uri found");
            return;
        }
        openIntercomChatPush(string, taskStackBuilder);
        sharedPreferences.edit().clear().apply();
    }

    @Override // io.intercom.android.sdk.Intercom
    public void logEvent(String str, Map<String, ?> map) {
        if (map == null) {
            this.twig.m13065i("The metadata provided is null, logging event with no metadata", new Object[0]);
            map = new HashMap<>();
        } else if (map.isEmpty()) {
            this.twig.m13065i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        logEventWithValidation(str, map);
    }
}
