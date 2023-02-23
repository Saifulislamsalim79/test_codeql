package io.intercom.android.sdk.profile;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.android.sdk.views.OfficeHoursTextView;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TeamProfilePresenter {
    private final List<TextView> adminNameViews;
    private final Provider<AppConfig> appConfigProvider;
    private final LinearLayout avatarLayout;
    private final List<ImageView> avatarViews;
    private final TextView bioView;
    private final OfficeHoursTextView collapsedOfficeHours;
    private final TextView collapsedToolbarTitle;
    private final ViewGroup contentView;
    private final ProfilePresenter profilePresenter;
    private final ViewGroup rootLayout;
    private boolean shouldAddTransformHeight = true;
    private final ProfileToolbarBehavior toolbarBehavior;
    private final ImageView wallpaperImageView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TeamProfilePresenter(CoordinatorLayout coordinatorLayout, ProfilePresenter profilePresenter, Provider<AppConfig> provider) {
        this.profilePresenter = profilePresenter;
        ViewGroup viewGroup = (ViewGroup) coordinatorLayout.findViewById(C10110R.C10112id.intercom_team_profile);
        this.rootLayout = viewGroup;
        this.contentView = (ViewGroup) viewGroup.findViewById(C10110R.C10112id.toolbar_content_container);
        this.appConfigProvider = provider;
        this.rootLayout.setBackgroundColor(provider.get().getSecondaryColor());
        this.rootLayout.setAlpha(0.0f);
        this.collapsedToolbarTitle = (TextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_title);
        this.collapsedOfficeHours = (OfficeHoursTextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_office_hours);
        this.avatarLayout = (LinearLayout) this.rootLayout.findViewById(C10110R.C10112id.intercom_team_profiles_layout);
        this.avatarViews = Arrays.asList((ImageView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar1), (ImageView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar2), (ImageView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar3));
        this.adminNameViews = Arrays.asList((TextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_name_1), (TextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_name_2), (TextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_name_3));
        this.bioView = (TextView) this.rootLayout.findViewById(C10110R.C10112id.intercom_collapsing_team_bio);
        this.toolbarBehavior = new TeamProfileToolbarBehavior(this.rootLayout);
        ImageView imageView = (ImageView) this.rootLayout.findViewById(C10110R.C10112id.team_wallpaper_image);
        this.wallpaperImageView = imageView;
        profilePresenter.loadWallpaperInto(imageView);
        updateColors(provider.get().secondaryColorRenderDarkText());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + WindowUtils.getStatusBarHeight(this.contentView.getResources()), layoutParams.rightMargin, layoutParams.bottomMargin);
        this.contentView.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = this.contentView;
        viewGroup2.startAnimation(AnimationUtils.loadAnimation(viewGroup2.getContext(), C10110R.anim.intercom_profile_slide_in));
    }

    private void setAvatar(Avatar avatar, ImageView imageView, C10486i c10486i) {
        imageView.setVisibility(0);
        AvatarUtils.loadAvatarIntoView(avatar, imageView, this.appConfigProvider.get(), c10486i);
    }

    private void setProfileTextView(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }

    private void updateColors(boolean z) {
        ColorUtils.setTextColorWhiteOrBlack(this.collapsedToolbarTitle, z);
        ColorUtils.setTextColorWhiteOrBlack(this.collapsedOfficeHours, z);
        ColorUtils.setTextColorWhiteOrBlack(this.bioView, z);
        for (TextView textView : this.adminNameViews) {
            ColorUtils.setTextColorWhiteOrBlack(textView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroup getRootLayout() {
        return this.rootLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProfileToolbarBehavior getToolbarBehavior() {
        return this.toolbarBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPresence(TeamPresence teamPresence, int i, AppBarLayout appBarLayout, View view, View view2, C10486i c10486i) {
        Context context = this.rootLayout.getContext();
        appBarLayout.m27703p(this.toolbarBehavior);
        if (this.rootLayout.getAlpha() < 1.0f || this.avatarLayout.getVisibility() == 8) {
            view.setAlpha(0.0f);
            this.rootLayout.setAlpha(1.0f);
            if (this.profilePresenter.isDidShowUnknown()) {
                view2.requestLayout();
                appBarLayout.m27701r(true, true);
                this.profilePresenter.setDidShowUnknown(false);
            }
        }
        List<Participant> activeAdmins = teamPresence.getActiveAdmins();
        if (activeAdmins.isEmpty()) {
            this.avatarLayout.setVisibility(8);
        } else {
            this.avatarLayout.setVisibility(0);
            String officeHours = teamPresence.getOfficeHours();
            if (TextUtils.isEmpty(officeHours)) {
                this.collapsedOfficeHours.setText(teamPresence.getExpectedResponseDelay());
            } else {
                this.collapsedOfficeHours.setText(officeHours);
                this.collapsedOfficeHours.setOfficeHoursDrawable(ColorUtils.whiteOrBlackColor(context, this.appConfigProvider.get().secondaryColorRenderDarkText()));
            }
            for (int i2 = 0; i2 < this.avatarViews.size() && i2 < activeAdmins.size(); i2++) {
                ImageView imageView = this.avatarViews.get(i2);
                TextView textView = this.adminNameViews.get(i2);
                Participant participant = activeAdmins.get(i2);
                setAvatar(participant.getAvatar(), imageView, c10486i);
                imageView.setVisibility(0);
                textView.setText(participant.getForename());
                textView.setVisibility(0);
            }
        }
        setProfileTextView(this.bioView, this.appConfigProvider.get().getTeamProfileBio());
        if (i == 0) {
            i = ScreenUtils.getScreenDimensions(context).x;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.collapsedOfficeHours.getMaxLines() : 1;
        this.rootLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
        Resources resources = context.getResources();
        int measuredHeight = this.rootLayout.getMeasuredHeight();
        if (this.shouldAddTransformHeight) {
            measuredHeight += resources.getDimensionPixelSize(C10110R.dimen.intercom_team_profile_translation_y);
            this.shouldAddTransformHeight = false;
        }
        view2.getLayoutParams().height = measuredHeight;
        this.rootLayout.getLayoutParams().height = resources.getDimensionPixelSize(C10110R.dimen.intercom_toolbar_height);
        view2.requestLayout();
        this.collapsedOfficeHours.setMaxLines(maxLines);
        this.wallpaperImageView.getLayoutParams().height = measuredHeight;
        this.rootLayout.requestLayout();
        this.profilePresenter.applyOffsetChangedListener(this.toolbarBehavior);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTeamCollapsingTitle(CharSequence charSequence) {
        this.collapsedToolbarTitle.setText(charSequence);
    }
}
