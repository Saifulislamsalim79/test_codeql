package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.IntercomMessengerActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.events.ConfigUpdateEvent;
import io.intercom.android.sdk.overlay.InAppNotificationPresenter;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.state.OverlayState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.com.bumptech.glide.C10486i;
import j.b.a.a.a.h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes3.dex */
public class OverlayPresenter implements InAppNotificationPresenter.Listener, Store.Subscriber2<Integer, OverlayState> {
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final C10486i requestManager;
    private final Store<State> store;
    private final UserIdentity userIdentity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<String> viewedPartIds = new HashSet();

    public OverlayPresenter(Application application, C11129b c11129b, Store<State> store, Provider<AppConfig> provider, MetricTracker metricTracker, UserIdentity userIdentity, C10486i c10486i) {
        this.appConfigProvider = provider;
        this.store = store;
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.requestManager = c10486i;
        LayoutInflater from = LayoutInflater.from(application);
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(from, handler, this, metricTracker, provider, new ContextLocaliser(provider), c10486i, hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(from, new LauncherOpenBehaviour(store, LauncherOpenBehaviour.LauncherType.DEFAULT, metricTracker, provider), metricTracker);
        c11129b.register(this);
        store.subscribeToChanges(Selectors.UNREAD_COUNT, Selectors.OVERLAY, this);
    }

    private Activity hostActivity() {
        return ((OverlayState) this.store.select(Selectors.OVERLAY)).resumedHostActivity();
    }

    private void openMessenger(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            hostActivity.startActivity(IntercomMessengerActivity.openConversation(hostActivity, conversation.getId(), conversation.getLastParticipatingAdmin()));
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity hostActivity = hostActivity();
            if (hostActivity != null) {
                hostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(hostActivity, conversation.getLastPart(), conversation.getId(), conversation.getLastParticipatingAdmin()));
            }
        } catch (IllegalArgumentException e) {
            Twig twig = this.twig;
            twig.internal("Overlay", "Error loading the note " + e.getMessage());
        }
    }

    private void openPost(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            hostActivity.startActivity(IntercomPostActivity.buildPostIntent(hostActivity, conversation.getLastPart(), conversation.getId(), conversation.getLastParticipatingAdmin(), true));
        }
    }

    private void trackInAppView(String str, String str2, @MetricTracker.InAppMessageViewContext int i) {
        if (this.viewedPartIds.contains(str2)) {
            return;
        }
        this.viewedPartIds.add(str2);
        this.metricTracker.viewedInApp(str, str2, i);
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @h
    public void configUpdated(ConfigUpdateEvent configUpdateEvent) {
        OverlayState overlayState = (OverlayState) this.store.select(Selectors.OVERLAY);
        Activity resumedHostActivity = overlayState.resumedHostActivity();
        if (shouldDisplayLauncher(overlayState.conversations(), overlayState.notificationVisibility(), overlayState.launcherVisibility(), resumedHostActivity)) {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    int primaryColor = ((AppConfig) OverlayPresenter.this.appConfigProvider.get()).getPrimaryColor();
                    OverlayPresenter overlayPresenter = OverlayPresenter.this;
                    overlayPresenter.launcherPresenter.displayLauncherOnAttachedRoot(rootView, primaryColor, (AppConfig) overlayPresenter.appConfigProvider.get());
                }
            });
            return;
        }
        AppConfig appConfig = this.appConfigProvider.get();
        this.launcherPresenter.setLauncherBackgroundColor(appConfig, appConfig.getPrimaryColor());
    }

    void displayNotifications(final List<Conversation> list, Activity activity) {
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        String messageStyle = conversation.getLastPart().getMessageStyle();
        Part.DeliveryOption deliveryOption = conversation.getLastPart().getDeliveryOption();
        if (list.size() <= 1 && !this.inAppNotificationPresenter.isDisplaying() && deliveryOption != Part.DeliveryOption.SUMMARY && (deliveryOption != Part.DeliveryOption.FULL || !Part.CHAT_MESSAGE_STYLE.equals(messageStyle))) {
            if (deliveryOption == Part.DeliveryOption.FULL) {
                if (Part.POST_MESSAGE_STYLE.equals(messageStyle)) {
                    trackInAppView(conversation.getId(), conversation.getLastPart().getId(), 1);
                    openPost(conversation);
                } else if (Part.NOTE_MESSAGE_STYLE.equals(messageStyle)) {
                    trackInAppView(conversation.getId(), conversation.getLastPart().getId(), 1);
                    openNote(conversation);
                }
            }
        } else if (this.launcherPresenter.isDisplaying()) {
            final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
            if (list.size() == 1) {
                andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.5
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.5.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                andUnsetLauncher.removeView();
                            }
                        });
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
            } else {
                andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        andUnsetLauncher.removeView();
                        OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                    }
                });
            }
        } else {
            this.inAppNotificationPresenter.displayNotifications(rootView, list);
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public ViewGroup getRootView() throws Exception {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            return getRootView(hostActivity);
        }
        throw null;
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void markAsDismissed(Conversation conversation) {
        this.store.dispatch(Actions.conversationMarkedAsDismissed(conversation));
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        String messageStyle = lastAdminPart.getMessageStyle();
        if (Part.POST_MESSAGE_STYLE.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.getLastPart().getId(), 0);
            openPost(conversation);
        } else if (Part.NOTE_MESSAGE_STYLE.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.getLastPart().getId(), 0);
            openNote(conversation);
        } else {
            openMessenger(conversation);
            if (Part.CHAT_MESSAGE_STYLE.equals(messageStyle) && Part.DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    void preloadAvatarThenDisplayNotifications(final List<Conversation> list, final Intercom.Visibility visibility, final Activity activity, final String str) {
        AvatarUtils.preloadAvatar(list.get(0).getLastAdmin().getAvatar(), new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.4
            @Override // java.lang.Runnable
            public void run() {
                if (str.equals(OverlayPresenter.this.userIdentity.getFingerprint()) && OverlayPresenter.this.shouldDisplayNotifications(list, visibility, activity)) {
                    OverlayPresenter.this.displayNotifications(list, activity);
                }
            }
        }, this.requestManager);
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange((Integer) this.store.select(Selectors.UNREAD_COUNT), (OverlayState) this.store.select(Selectors.OVERLAY));
    }

    public void removeOverlaysIfPresent(Activity activity) {
        final View findViewById = activity.findViewById(C10110R.C10112id.intercom_overlay_root);
        activity.runOnUiThread(new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.3
            @Override // java.lang.Runnable
            public void run() {
                if (findViewById != null) {
                    OverlayPresenter.this.launcherPresenter.removeLauncher();
                    OverlayPresenter.this.inAppNotificationPresenter.reset((ViewGroup) findViewById);
                    if (findViewById.getParent() != null) {
                        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
                    }
                }
            }
        });
    }

    boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            for (Conversation conversation : list) {
                if (Part.DeliveryOption.BADGE != conversation.getLastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        return visibility2 == Intercom.Visibility.VISIBLE && !this.userIdentity.isSoftReset() && this.userIdentity.identityExists() && this.appConfigProvider.get().isReceivedFromServer() && activity != null;
    }

    boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity) {
        return (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) ? false : true;
    }

    public void softReset() {
        cancelAnimations();
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            removeOverlaysIfPresent(hostActivity);
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Subscriber2
    public void onStateChange(final Integer num, OverlayState overlayState) {
        Intercom.Visibility notificationVisibility = overlayState.notificationVisibility();
        Activity resumedHostActivity = overlayState.resumedHostActivity();
        List<Conversation> conversations = overlayState.conversations();
        this.launcherPresenter.setBottomPadding(overlayState.bottomPadding());
        this.inAppNotificationPresenter.setBottomPadding(overlayState.bottomPadding());
        if (resumedHostActivity == null || resumedHostActivity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 17 || !resumedHostActivity.isDestroyed()) {
            if (shouldDisplayNotifications(conversations, notificationVisibility, resumedHostActivity)) {
                preloadAvatarThenDisplayNotifications(conversations, notificationVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
            } else if (shouldDisplayLauncher(conversations, notificationVisibility, overlayState.launcherVisibility(), resumedHostActivity)) {
                final ViewGroup rootView = getRootView(resumedHostActivity);
                ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        OverlayPresenter.this.inAppNotificationPresenter.reset(rootView);
                        OverlayPresenter.this.launcherPresenter.setUnreadCount(num.intValue());
                        int primaryColor = ((AppConfig) OverlayPresenter.this.appConfigProvider.get()).getPrimaryColor();
                        OverlayPresenter overlayPresenter = OverlayPresenter.this;
                        overlayPresenter.launcherPresenter.displayLauncherOnAttachedRoot(rootView, primaryColor, (AppConfig) overlayPresenter.appConfigProvider.get());
                    }
                });
            } else {
                removeOverlaysIfPresent(resumedHostActivity);
            }
        }
    }

    private ViewGroup getRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(C10110R.C10112id.intercom_overlay_root);
        if (viewGroup == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setFitsSystemWindows(true);
            frameLayout.setId(C10110R.C10112id.intercom_overlay_root);
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 80));
            return frameLayout;
        }
        return viewGroup;
    }
}
