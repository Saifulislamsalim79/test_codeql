package io.intercom.android.sdk.profile;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.utilities.ViewUtils;
/* loaded from: classes3.dex */
class TeammateProfileToolbarBehavior extends ProfileToolbarBehavior {
    private static final float CHANGE_IN_ACTIVE_STATE_SCALE = 0.6f;
    private static final float CHANGE_IN_AVATAR_SCALE = 0.85f;
    private View activeStateCircle;
    private View avatar1;
    private View avatar2;
    private View avatar3;
    private View bio;
    private final float headerTextAlpha;
    private View location;
    private final float profileTranslationY;
    private View role;
    private final ViewGroup rootLayout;
    private LinearLayout socialLayout;
    private View subtitle;
    private View title;
    private View titleNameOnly;
    private final float translate16dp;
    private final float translate28dp;
    private final float translate8dp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TeammateProfileToolbarBehavior(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.rootLayout = viewGroup;
        Context context = viewGroup.getContext();
        this.translate8dp = ScreenUtils.dpToPx(8.0f, context);
        this.profileTranslationY = context.getResources().getDimensionPixelSize(C10110R.dimen.intercom_team_profile_translation_y);
        this.translate28dp = ScreenUtils.dpToPx(28.0f, context);
        this.translate16dp = ScreenUtils.dpToPx(16.0f, context);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(C10110R.dimen.intercom_header_text_alpha, typedValue, true);
        this.headerTextAlpha = typedValue.getFloat();
    }

    private void translateY(View view, View view2, float f) {
        view.setTranslationY((int) Math.max(0.0f, (f / 100.0f) * getScrollPercentage(view2)));
    }

    private void updateAvatar(ViewGroup viewGroup, View view, float f) {
        if (this.avatar1 == null) {
            this.avatar1 = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_teammate_avatar1);
        }
        if (this.avatar2 == null) {
            this.avatar2 = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_teammate_avatar2);
        }
        if (this.avatar3 == null) {
            this.avatar3 = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_teammate_avatar3);
        }
        if (this.activeStateCircle == null) {
            this.activeStateCircle = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_teammate_active_state);
        }
        Resources resources = viewGroup.getContext().getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(C10110R.dimen.intercom_teammate_active_state_size) / resources.getDimensionPixelSize(C10110R.dimen.intercom_teammate_avatar_size);
        float f2 = (this.translate8dp / 100.0f) * f;
        this.avatar1.setTranslationX((int) Math.max(f2, 0.0f));
        this.activeStateCircle.setTranslationX((int) Math.max(f2 * (((1.0f - dimensionPixelSize) * 1.4166666f) + 1.0f), 0.0f));
        float f3 = (this.profileTranslationY / 100.0f) * f;
        this.avatar1.setTranslationY((int) Math.max(0.0f, f3));
        this.activeStateCircle.setTranslationY((int) Math.max(0.0f, f3 * ((dimensionPixelSize * 1.4166666f) + 1.0f)));
        float f4 = (0.0085f * f) + 1.0f;
        float f5 = (f * 0.006f) + 1.0f;
        this.avatar1.setScaleX(f4);
        this.avatar1.setScaleY(f4);
        this.activeStateCircle.setScaleX(f5);
        this.activeStateCircle.setScaleY(f5);
        setAlphaAsPercentageOfScroll(this.avatar2, view, 1.0f, true);
        setAlphaAsPercentageOfScroll(this.avatar3, view, 1.0f, true);
    }

    private void updateBio(ViewGroup viewGroup, View view) {
        if (this.bio == null) {
            this.bio = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_bio_layout);
        }
        translateY(this.bio, view, this.profileTranslationY);
        setAlphaAsPercentageOfScroll(this.bio, view, 1.0f, false);
    }

    private void updateLocation(ViewGroup viewGroup, View view) {
        if (this.location == null) {
            this.location = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_location_layout);
        }
        translateY(this.location, view, this.profileTranslationY);
        setAlphaAsPercentageOfScroll(this.location, view, 1.0f, false);
    }

    private void updateRole(ViewGroup viewGroup, View view) {
        if (this.role == null) {
            this.role = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_role_layout);
        }
        translateY(this.role, view, this.profileTranslationY);
        setAlphaAsPercentageOfScroll(this.role, view, 1.0f, false);
    }

    private void updateSocialButtons(ViewGroup viewGroup, View view) {
        if (this.socialLayout == null) {
            this.socialLayout = (LinearLayout) viewGroup.findViewById(C10110R.C10112id.social_button_layout);
        }
        translateY(this.socialLayout, view, this.profileTranslationY);
        setAlphaAsPercentageOfScroll(this.socialLayout, view, this.headerTextAlpha, false);
    }

    private void updateTitle(ViewGroup viewGroup, View view, float f) {
        if (this.title == null) {
            this.title = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_title);
        }
        if (this.titleNameOnly == null) {
            this.titleNameOnly = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_title_name_only);
        }
        if (this.subtitle == null) {
            this.subtitle = viewGroup.findViewById(C10110R.C10112id.intercom_collapsing_subtitle);
        }
        setAlphaAsPercentageOfScroll(this.subtitle, view, this.headerTextAlpha, false);
        float max = (int) Math.max(0.0f, (this.translate28dp / 100.0f) * f);
        if (max > 0.0f) {
            this.subtitle.setTranslationY(max);
        }
        float max2 = (int) Math.max(0.0f, (this.translate16dp / 100.0f) * f);
        if (max2 > 0.0f) {
            this.titleNameOnly.setTranslationY(max2);
            this.title.setTranslationY(max2);
        }
        setAlphaAsPercentageOfScroll(this.title, view, 1.0f, true);
        setAlphaAsPercentageOfScroll(this.titleNameOnly, view, 1.0f, false);
    }

    @Override // io.intercom.android.sdk.profile.ProfileToolbarBehavior, com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.getHeight() <= this.toolbarHeight) {
            return;
        }
        float scrollPercentage = getScrollPercentage(appBarLayout);
        this.rootLayout.getLayoutParams().height = appBarLayout.getBottom();
        updateAvatar(this.rootLayout, appBarLayout, scrollPercentage);
        updateTitle(this.rootLayout, appBarLayout, scrollPercentage);
        updateRole(this.rootLayout, appBarLayout);
        updateLocation(this.rootLayout, appBarLayout);
        updateBio(this.rootLayout, appBarLayout);
        updateSocialButtons(this.rootLayout, appBarLayout);
        ViewUtils.requestLayoutIfPossible(this.rootLayout);
    }
}
