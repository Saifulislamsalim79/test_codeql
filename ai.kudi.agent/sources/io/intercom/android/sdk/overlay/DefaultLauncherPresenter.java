package io.intercom.android.sdk.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.overlay.DefaultLauncher;
/* loaded from: classes3.dex */
public class DefaultLauncherPresenter implements DefaultLauncher.Listener {
    private int bottomPadding;
    DefaultLauncher defaultLauncher;
    private final LayoutInflater inflater;
    private final MetricTracker metricTracker;
    private final LauncherOpenBehaviour openBehaviour;
    private int previousUnreadCount = 0;

    public DefaultLauncherPresenter(LayoutInflater layoutInflater, LauncherOpenBehaviour launcherOpenBehaviour, MetricTracker metricTracker) {
        this.bottomPadding = 0;
        this.inflater = layoutInflater;
        this.openBehaviour = launcherOpenBehaviour;
        this.metricTracker = metricTracker;
        this.bottomPadding = getDefaultPadding(layoutInflater.getContext().getResources());
    }

    private int getDefaultPadding(Resources resources) {
        return resources.getDimensionPixelSize(C10110R.dimen.intercom_launcher_padding_bottom) + resources.getDimensionPixelSize(C10110R.dimen.intercom_bottom_padding);
    }

    public void displayLauncherOnAttachedRoot(ViewGroup viewGroup, int i, AppConfig appConfig) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null && !defaultLauncher.isAttachedToRoot(viewGroup)) {
            this.defaultLauncher.removeView();
            this.defaultLauncher = null;
        }
        if (this.defaultLauncher == null) {
            DefaultLauncher defaultLauncher2 = new DefaultLauncher(viewGroup, this.inflater, this, this.bottomPadding);
            this.defaultLauncher = defaultLauncher2;
            defaultLauncher2.fadeOnScreen();
        }
        setLauncherBackgroundColor(appConfig, i);
        setUnreadCount(this.previousUnreadCount);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultLauncher getAndUnsetLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        this.defaultLauncher = null;
        return defaultLauncher;
    }

    public boolean isDisplaying() {
        return this.defaultLauncher != null;
    }

    @Override // io.intercom.android.sdk.overlay.DefaultLauncher.Listener
    public void onLauncherClicked(Context context) {
        this.openBehaviour.openMessenger(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeLauncher() {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.fadeOffScreen(null);
            this.defaultLauncher = null;
        }
    }

    public void setBottomPadding(int i) {
        this.bottomPadding = getDefaultPadding(this.inflater.getContext().getResources()) + i;
        if (isDisplaying()) {
            this.defaultLauncher.updateBottomPadding(this.bottomPadding);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLauncherBackgroundColor(AppConfig appConfig, int i) {
        DefaultLauncher defaultLauncher = this.defaultLauncher;
        if (defaultLauncher != null) {
            defaultLauncher.setLauncherColor(appConfig, i);
        }
    }

    public void setUnreadCount(int i) {
        if (isDisplaying()) {
            String valueOf = String.valueOf(i);
            if (i > this.previousUnreadCount) {
                this.metricTracker.receivedNotificationFromBadgeWhenMessengerClosed(valueOf);
            }
            if (i > 0) {
                this.defaultLauncher.setBadgeCount(valueOf);
            } else {
                this.defaultLauncher.hideBadgeCount();
            }
        }
        this.previousUnreadCount = i;
    }
}
