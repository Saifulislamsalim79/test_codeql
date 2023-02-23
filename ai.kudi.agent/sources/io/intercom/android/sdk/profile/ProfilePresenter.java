package io.intercom.android.sdk.profile;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.com.bumptech.glide.C10486i;
import java.io.IOException;
import java.util.List;
/* loaded from: classes3.dex */
public class ProfilePresenter {
    final AppBarLayout appBarLayout;
    private final Provider<AppConfig> appConfigProvider;
    private final MetricTracker metricTracker;
    private final TeamProfilePresenter teamProfilePresenter;
    private final TeammateProfilePresenter teammateProfilePresenter;
    private final ViewGroup titleLayoutCoordinator;
    private final View toolbar;
    private final WallpaperLoader wallpaperLoader;
    private final Twig twig = LumberMill.getLogger();
    private String conversationId = "";
    ProfileState currentState = ProfileState.IDLE;
    boolean isAnimating = false;
    private boolean didShowUnknown = false;
    private boolean wasClicked = false;
    private boolean autoOpened = false;
    private final AppBarLayout.InterfaceC4496e offsetListener = new AppBarLayout.InterfaceC4496e() { // from class: io.intercom.android.sdk.profile.ProfilePresenter.2
        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (i == 0) {
                ProfilePresenter profilePresenter = ProfilePresenter.this;
                if (profilePresenter.currentState != ProfileState.EXPANDED) {
                    profilePresenter.trackOpenMetric();
                    ((InputMethodManager) appBarLayout.getContext().getSystemService("input_method")).hideSoftInputFromWindow(appBarLayout.getWindowToken(), 0);
                }
                ProfilePresenter profilePresenter2 = ProfilePresenter.this;
                profilePresenter2.isAnimating = false;
                profilePresenter2.currentState = ProfileState.EXPANDED;
            } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                ProfilePresenter profilePresenter3 = ProfilePresenter.this;
                profilePresenter3.isAnimating = false;
                profilePresenter3.currentState = ProfileState.COLLAPSED;
            } else {
                ProfilePresenter.this.currentState = ProfileState.IDLE;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum ProfileState {
        COLLAPSED,
        EXPANDED,
        IDLE
    }

    /* loaded from: classes3.dex */
    public enum ProfileType {
        TEAMMATE,
        TEAM
    }

    public ProfilePresenter(CoordinatorLayout coordinatorLayout, MetricTracker metricTracker, Provider<AppConfig> provider, C10486i c10486i) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
        this.appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(C10110R.C10112id.app_bar_layout);
        View findViewById = coordinatorLayout.findViewById(C10110R.C10112id.profile_toolbar);
        this.toolbar = findViewById;
        this.toolbar.setLayoutParams(new CollapsingToolbarLayout.C4499c(-1, findViewById.getResources().getDimensionPixelSize(C10110R.dimen.intercom_toolbar_height) + WindowUtils.getStatusBarHeight(this.toolbar.getResources())));
        this.titleLayoutCoordinator = (FrameLayout) coordinatorLayout.findViewById(C10110R.C10112id.profile_toolbar_coordinator);
        this.wallpaperLoader = WallpaperLoader.create(coordinatorLayout.getContext(), provider, c10486i);
        this.teammateProfilePresenter = new TeammateProfilePresenter(coordinatorLayout, this, provider, c10486i);
        this.teamProfilePresenter = new TeamProfilePresenter(coordinatorLayout, this, provider);
    }

    private void openProfile() {
        this.appBarLayout.m27701r(true, true);
    }

    public void addListener(AppBarLayout.InterfaceC4496e interfaceC4496e) {
        this.appBarLayout.m27717b(interfaceC4496e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyOffsetChangedListener(final AppBarLayout.InterfaceC4496e interfaceC4496e) {
        this.appBarLayout.m27717b(interfaceC4496e);
        this.appBarLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: io.intercom.android.sdk.profile.ProfilePresenter.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ProfilePresenter.this.appBarLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                interfaceC4496e.onOffsetChanged(ProfilePresenter.this.appBarLayout, 0);
                return false;
            }
        });
    }

    public void cleanup() {
        try {
            this.wallpaperLoader.close();
        } catch (IOException e) {
            Twig twig = this.twig;
            twig.m13071d("Couldn't close LongTermImageLoader: " + e.getMessage(), new Object[0]);
        }
    }

    public void closeProfile() {
        this.appBarLayout.m27701r(false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDidShowUnknown() {
        return this.didShowUnknown;
    }

    public boolean isExpanded() {
        return this.currentState == ProfileState.EXPANDED;
    }

    public void loadWallpaperInto(ImageView imageView) {
        this.wallpaperLoader.loadWallpaperInto(imageView);
    }

    public void onStop() {
        this.teammateProfilePresenter.stopUpdatingTime();
    }

    public void profileAutoOpened() {
        this.autoOpened = true;
        openProfile();
    }

    public void profileClicked() {
        this.wasClicked = true;
        openProfile();
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDidShowUnknown(boolean z) {
        this.didShowUnknown = z;
    }

    public void setTeamPresence(TeamPresence teamPresence, int i, C10486i c10486i) {
        this.teamProfilePresenter.setTeamCollapsingTitle(this.appConfigProvider.get().getName());
        if (teamPresence.isEmpty()) {
            this.teammateProfilePresenter.setTeammateSubtitle(null);
            return;
        }
        this.toolbar.setBackgroundColor(0);
        this.appBarLayout.m27703p(this.teammateProfilePresenter.getToolbarBehavior());
        this.teamProfilePresenter.setPresence(teamPresence, i, this.appBarLayout, this.teammateProfilePresenter.getRootLayout(), this.titleLayoutCoordinator, c10486i);
    }

    public void setTeammatePresence(LastParticipatingAdmin lastParticipatingAdmin, List<Participant> list, CharSequence charSequence, int i) {
        this.toolbar.setBackgroundColor(0);
        this.appBarLayout.m27703p(this.teamProfilePresenter.getToolbarBehavior());
        this.teammateProfilePresenter.setPresence(lastParticipatingAdmin, list, charSequence, i, this.appBarLayout, this.currentState, this.teamProfilePresenter.getRootLayout(), this.titleLayoutCoordinator);
    }

    public void setUnknownPresence() {
        this.didShowUnknown = true;
        this.teammateProfilePresenter.getRootLayout().setAlpha(0.0f);
        this.teamProfilePresenter.getRootLayout().setAlpha(0.0f);
        this.toolbar.setBackgroundColor(this.appConfigProvider.get().getSecondaryColor());
        this.appBarLayout.m27703p(this.teamProfilePresenter.getToolbarBehavior());
        this.appBarLayout.m27703p(this.teammateProfilePresenter.getToolbarBehavior());
    }

    public void startOffsetListener() {
        this.appBarLayout.m27717b(this.offsetListener);
    }

    void trackOpenMetric() {
        ProfileType profileType = this.teamProfilePresenter.getRootLayout().getAlpha() == 0.0f ? ProfileType.TEAMMATE : ProfileType.TEAM;
        if (this.wasClicked) {
            this.metricTracker.profileClickedOpen(this.conversationId, profileType);
        } else if (this.autoOpened) {
            this.metricTracker.profileAutoOpen(this.conversationId, profileType);
        } else {
            this.metricTracker.profileScrolledOpen(this.conversationId, profileType);
        }
        this.wasClicked = false;
        this.autoOpened = false;
    }
}
