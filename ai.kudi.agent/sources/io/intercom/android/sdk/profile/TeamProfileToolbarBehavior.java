package io.intercom.android.sdk.profile;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.utilities.ViewUtils;
/* loaded from: classes3.dex */
class TeamProfileToolbarBehavior extends ProfileToolbarBehavior {
    private ImageView avatarMini1;
    private ImageView avatarMini2;
    private ImageView avatarMini3;
    private TextView bio;
    private TextView officeHours;
    private final ViewGroup rootLayout;
    private LinearLayout teamProfiles;
    private final float translate16dp;

    public TeamProfileToolbarBehavior(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.rootLayout = viewGroup;
        this.translate16dp = ScreenUtils.dpToPx(16.0f, viewGroup.getContext());
    }

    private void updateCollapsedAvatars(ViewGroup viewGroup) {
        if (this.avatarMini1 == null) {
            this.avatarMini1 = (ImageView) viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar1);
        }
        if (this.avatarMini2 == null) {
            this.avatarMini2 = (ImageView) viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar2);
        }
        if (this.avatarMini3 == null) {
            this.avatarMini3 = (ImageView) viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_team_avatar3);
        }
    }

    private void updateCollapsedBio(ViewGroup viewGroup, View view) {
        if (this.bio == null) {
            this.bio = (TextView) viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_team_bio);
        }
        TypedValue typedValue = new TypedValue();
        this.bio.getContext().getResources().getValue(C10110R.dimen.intercom_header_text_alpha, typedValue, true);
        setAlphaAsPercentageOfScroll(this.bio, view, typedValue.getFloat(), false);
    }

    private void updateOfficeHours(ViewGroup viewGroup, View view, float f) {
        if (this.officeHours == null) {
            this.officeHours = (TextView) viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_office_hours);
        }
        setAlphaAsPercentageOfScroll(this.officeHours, view, 1.0f, false);
        this.officeHours.setTranslationY((int) Math.max(0.0f, (this.translate16dp / 100.0f) * f));
    }

    private void updateTeamProfile(ViewGroup viewGroup, View view, float f) {
        if (this.teamProfiles == null) {
            this.teamProfiles = (LinearLayout) viewGroup.findViewById(C10110R.C10112id.intercom_team_profiles_layout);
        }
        setAlphaAsPercentageOfScroll(this.teamProfiles, view, 1.0f, false);
        this.teamProfiles.setTranslationY((int) Math.max(0.0f, (this.translate16dp / 100.0f) * f));
    }

    @Override // io.intercom.android.sdk.profile.ProfileToolbarBehavior, com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.getHeight() <= this.toolbarHeight) {
            return;
        }
        float scrollPercentage = getScrollPercentage(appBarLayout);
        this.rootLayout.getLayoutParams().height = appBarLayout.getBottom();
        updateCollapsedAvatars(this.rootLayout);
        updateTeamProfile(this.rootLayout, appBarLayout, scrollPercentage);
        updateCollapsedBio(this.rootLayout, appBarLayout);
        updateOfficeHours(this.rootLayout, appBarLayout, scrollPercentage);
        ViewUtils.requestLayoutIfPossible(this.rootLayout);
    }
}
