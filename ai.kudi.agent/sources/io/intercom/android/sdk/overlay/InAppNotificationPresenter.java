package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomMessengerActivity;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.overlay.InAppNotification;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class InAppNotificationPresenter implements InAppNotification.Listener, View.OnClickListener {
    private static final int MAX_DISPLAYED_NOTIFICATIONS = 3;
    private static final int PILL_START_OFFSET_DP = 66;
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final ContextLocaliser contextLocaliser;
    final Handler handler;
    private final LayoutInflater inflater;
    private final Listener listener;
    private final MetricTracker metricTracker;
    private float pillPosition;
    private final C10486i requestManager;
    private final Twig twig = LumberMill.getLogger();
    private final Map<String, InAppNotification> notifications = new HashMap();
    private final List<Conversation> lastDisplayedConversations = new ArrayList();
    private boolean hasAnimated = false;
    private int bottomPadding = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Listener {
        ViewGroup getRootView() throws Exception;

        void markAsDismissed(Conversation conversation);

        void openNotification(Conversation conversation);
    }

    public InAppNotificationPresenter(LayoutInflater layoutInflater, Handler handler, Listener listener, MetricTracker metricTracker, Provider<AppConfig> provider, ContextLocaliser contextLocaliser, C10486i c10486i, Activity activity) {
        this.inflater = layoutInflater;
        this.listener = listener;
        this.handler = handler;
        this.metricTracker = metricTracker;
        this.appConfigProvider = provider;
        this.contextLocaliser = contextLocaliser;
        this.requestManager = c10486i;
        this.activity = activity;
    }

    private void addNewNotifications(List<Conversation> list, ViewGroup viewGroup) {
        InAppNotification stackableSnippet;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Conversation conversation = list.get(i);
            Context createLocalisedContext = this.contextLocaliser.createLocalisedContext(viewGroup.getContext());
            Part lastPart = conversation.getLastPart();
            if (size < 2 && Part.CHAT_MESSAGE_STYLE.equals(lastPart.getMessageStyle())) {
                if (lastPart.getDeliveryOption() == Part.DeliveryOption.SUMMARY) {
                    stackableSnippet = new ChatSnippet(createLocalisedContext, conversation, i, viewGroup.getHeight(), this, this.appConfigProvider, this.requestManager);
                } else {
                    stackableSnippet = new ChatFull(createLocalisedContext, conversation, i, viewGroup.getHeight(), this, this.metricTracker, this.appConfigProvider, this.requestManager, this.activity);
                }
            } else {
                stackableSnippet = new StackableSnippet(createLocalisedContext, conversation, i, this.handler, viewGroup.getHeight(), this, this.appConfigProvider, this.requestManager);
            }
            this.notifications.put(conversation.getId(), stackableSnippet);
            if (i < 3) {
                stackableSnippet.display(viewGroup, this.inflater, !this.hasAnimated, this.bottomPadding);
            }
        }
    }

    private void animatePill(final View view) {
        this.handler.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.4
            @Override // java.lang.Runnable
            public void run() {
                view.setY(InAppNotificationPresenter.this.pillPosition + ScreenUtils.dpToPx(66.0f, view.getContext()));
                view.animate().setInterpolator(new OvershootInterpolator()).y(InAppNotificationPresenter.this.pillPosition).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
            }
        }, SystemSettings.getTransitionScale(view.getContext()) * 500.0f);
    }

    private void displayPill(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(C10110R.C10112id.notification_pill);
        if (this.notifications.size() <= 3) {
            if (textView != null) {
                viewGroup.removeView(textView);
                return;
            }
            return;
        }
        if (textView == null) {
            layoutInflater.inflate(C10110R.C10113layout.intercom_notification_pill, viewGroup, true);
            textView = (TextView) viewGroup.findViewById(C10110R.C10112id.notification_pill);
            textView.setAlpha(0.0f);
            textView.setScaleX(0.4f);
            textView.setScaleY(0.4f);
            textView.setY(this.pillPosition);
            textView.setOnClickListener(this);
            animatePill(textView);
        }
        Phrase.from(this.contextLocaliser.createLocalisedContext(textView.getContext()), C10110R.string.intercom_plus_x_more).put("n", this.notifications.size() - 3).into(textView);
    }

    private boolean isReply(Conversation conversation) {
        return !this.lastDisplayedConversations.isEmpty() && conversation.getId().equals(this.lastDisplayedConversations.get(0).getId());
    }

    private void updateNotifications(final List<Conversation> list, final Map<String, InAppNotification> map, final ViewGroup viewGroup) {
        InAppNotification inAppNotification;
        final Conversation conversation = list.get(0);
        Iterator<InAppNotification> it = map.values().iterator();
        InAppNotification next = it.next();
        loop0: while (true) {
            inAppNotification = next;
            while (it.hasNext()) {
                next = it.next();
                if (next.getPosition() < inAppNotification.getPosition()) {
                    break;
                }
            }
        }
        if (isReply(conversation)) {
            inAppNotification.update(conversation, new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    InAppNotificationPresenter.this.syncUpdates(list, map, viewGroup);
                }
            });
        } else if (map.size() == 1 && (inAppNotification instanceof ChatSnippet)) {
            inAppNotification.moveBackward(viewGroup, new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    InAppNotificationPresenter.this.addNewView(conversation, viewGroup, map);
                    InAppNotificationPresenter.this.handler.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C103793 c103793 = C103793.this;
                            InAppNotificationPresenter.this.syncUpdates(list, map, viewGroup);
                        }
                    }, 220L);
                }
            });
        } else {
            for (InAppNotification inAppNotification2 : map.values()) {
                if (inAppNotification2.getPosition() < 3) {
                    inAppNotification2.moveBackward(viewGroup);
                } else {
                    inAppNotification2.setPosition(inAppNotification2.getPosition() + 1);
                }
            }
            addNewView(conversation, viewGroup, map);
            syncUpdates(list, map, viewGroup);
        }
    }

    private void updatePillPosition(View view) {
        ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("y", view.getY(), this.pillPosition)).setDuration(300L).start();
    }

    void addNewView(Conversation conversation, ViewGroup viewGroup, Map<String, InAppNotification> map) {
        StackableSnippet stackableSnippet = new StackableSnippet(this.contextLocaliser.createLocalisedContext(viewGroup.getContext()), conversation, 0, this.handler, viewGroup.getHeight(), this, this.appConfigProvider, this.requestManager);
        stackableSnippet.display(viewGroup, this.inflater, true, this.bottomPadding);
        if (map.containsKey(conversation.getId())) {
            map.get(conversation.getId()).removeView();
        }
        map.put(conversation.getId(), stackableSnippet);
    }

    public void displayNotifications(final ViewGroup viewGroup, final List<Conversation> list) {
        ViewUtils.waitForViewAttachment(viewGroup, new Runnable() { // from class: io.intercom.android.sdk.overlay.InAppNotificationPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                InAppNotificationPresenter.this.displayNotificationsAfterAttach(list, viewGroup);
            }
        });
    }

    void displayNotificationsAfterAttach(List<Conversation> list, ViewGroup viewGroup) {
        boolean z = (this.lastDisplayedConversations.equals(list) || this.notifications.isEmpty()) ? false : true;
        HashMap hashMap = new HashMap(this.notifications);
        if (z) {
            updateNotifications(list, hashMap, viewGroup);
        } else if (!isDisplaying()) {
            addNewNotifications(list, viewGroup);
        }
        this.hasAnimated = true;
        Resources resources = viewGroup.getResources();
        this.pillPosition = ((viewGroup.getHeight() - resources.getDimensionPixelSize(C10110R.dimen.intercom_overlay_pill_bottom_margin)) - resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding)) - this.bottomPadding;
        displayPill(this.inflater, viewGroup);
        this.lastDisplayedConversations.clear();
        this.lastDisplayedConversations.addAll(list);
    }

    public boolean isDisplaying() {
        return !this.notifications.isEmpty();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getContext().startActivity(IntercomMessengerActivity.openInbox(view.getContext()));
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification.Listener
    public void onInAppNotificationDismiss(InAppNotification inAppNotification) {
        ViewGroup viewGroup;
        try {
            viewGroup = this.listener.getRootView();
        } catch (Exception e) {
            Twig twig = this.twig;
            twig.internal("Couldn't get root view: " + e.getMessage());
            viewGroup = null;
        }
        Conversation conversation = inAppNotification.getConversation();
        if (viewGroup != null) {
            this.listener.markAsDismissed(conversation);
            viewGroup.removeView(inAppNotification.getRootView());
            this.notifications.remove(conversation.getId());
            this.lastDisplayedConversations.remove(conversation);
            for (InAppNotification inAppNotification2 : this.notifications.values()) {
                inAppNotification2.moveForward(viewGroup, this.inflater);
            }
            displayPill(this.inflater, viewGroup);
            if (this.notifications.isEmpty()) {
                this.hasAnimated = false;
            }
        }
        Part lastAdminPart = conversation.getLastAdminPart();
        if (Part.CHAT_MESSAGE_STYLE.equals(lastAdminPart.getMessageStyle()) && Part.DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
            this.metricTracker.closedInAppFromFull(conversation.getId(), lastAdminPart.getId());
        } else if (lastAdminPart.isInitialMessage()) {
            this.metricTracker.dismissInAppMessageSnippet(conversation.getId(), lastAdminPart.getId());
        } else {
            this.metricTracker.dismissInAppCommentSnippet(conversation.getId(), lastAdminPart.getId());
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotification.Listener
    public void onInAppNotificationTap(Conversation conversation) {
        this.listener.openNotification(conversation);
    }

    public void reset(ViewGroup viewGroup) {
        for (InAppNotification inAppNotification : this.notifications.values()) {
            inAppNotification.removeView();
        }
        View findViewById = viewGroup.findViewById(C10110R.C10112id.notification_pill);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        this.notifications.clear();
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = i;
        if (isDisplaying()) {
            for (InAppNotification inAppNotification : this.notifications.values()) {
                inAppNotification.updateBottomPadding(this.inflater.getContext(), this.bottomPadding);
            }
            ViewGroup viewGroup = null;
            try {
                viewGroup = this.listener.getRootView();
            } catch (Exception e) {
                Twig twig = this.twig;
                twig.internal("Couldn't get root view: " + e.getMessage());
            }
            if (viewGroup != null) {
                Resources resources = viewGroup.getResources();
                this.pillPosition = ((viewGroup.getHeight() - resources.getDimensionPixelSize(C10110R.dimen.intercom_overlay_pill_bottom_margin)) - resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding)) - i;
                View findViewById = viewGroup.findViewById(C10110R.C10112id.notification_pill);
                if (findViewById != null) {
                    updatePillPosition(findViewById);
                }
            }
        }
    }

    void syncUpdates(List<Conversation> list, Map<String, InAppNotification> map, ViewGroup viewGroup) {
        for (int i = 0; i < list.size(); i++) {
            Conversation conversation = list.get(i);
            InAppNotification remove = map.remove(conversation.getId());
            if (((remove instanceof ChatSnippet) && i > 0) || remove == null) {
                if (remove != null) {
                    remove.removeView();
                }
                remove = new StackableSnippet(this.contextLocaliser.createLocalisedContext(viewGroup.getContext()), conversation, i, this.handler, viewGroup.getHeight(), this, this.appConfigProvider, this.requestManager);
            }
            if (i < 3) {
                remove.display(viewGroup, conversation, this.inflater, false, this.bottomPadding);
            } else {
                remove.removeView();
            }
            this.notifications.put(conversation.getId(), remove);
        }
        for (InAppNotification inAppNotification : map.values()) {
            inAppNotification.removeView();
        }
    }
}
