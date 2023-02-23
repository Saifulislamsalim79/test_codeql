package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.List;
/* loaded from: classes3.dex */
public class AuthorAvatarView extends FrameLayout {
    private final ActiveStatePresenter activeStatePresenter;
    private final int activeStateSize;
    private final View activeStateView;
    private final int imageViewSize;
    private final ImageView leftImageView;
    private final ImageView rightImageView;
    private final int teamAvatarPadding;
    private final ImageView topImageView;

    public AuthorAvatarView(Context context) {
        this(context, null);
    }

    private void loadDefaultDrawable(AppConfig appConfig) {
        this.leftImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.leftImageView.setPadding(0, 0, 0, 0);
        setNumberOfVisibleAvatars(1);
        this.activeStateView.setVisibility(8);
        requestLayout();
        ImageView imageView = this.leftImageView;
        imageView.setImageDrawable(AvatarUtils.getDefaultDrawable(imageView.getContext(), appConfig));
    }

    private void loadThreeAvatars(Participant participant, Participant participant2, Participant participant3, AppConfig appConfig, C10486i c10486i) {
        ImageView imageView = this.leftImageView;
        int i = this.imageViewSize;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i, 83));
        ImageView imageView2 = this.leftImageView;
        int i2 = this.teamAvatarPadding;
        imageView2.setPadding(i2, i2, i2, i2);
        ImageView imageView3 = this.rightImageView;
        int i3 = this.imageViewSize;
        imageView3.setLayoutParams(new FrameLayout.LayoutParams(i3, i3, 85));
        ImageView imageView4 = this.topImageView;
        int i4 = this.imageViewSize;
        imageView4.setLayoutParams(new FrameLayout.LayoutParams(i4, i4, 49));
        this.activeStateView.setVisibility(8);
        setNumberOfVisibleAvatars(3);
        requestLayout();
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.leftImageView, appConfig, c10486i);
        AvatarUtils.loadAvatarIntoView(participant2.getAvatar(), this.rightImageView, appConfig, c10486i);
        AvatarUtils.loadAvatarIntoView(participant3.getAvatar(), this.topImageView, appConfig, c10486i);
    }

    private void loadTwoAvatars(Participant participant, Participant participant2, AppConfig appConfig, C10486i c10486i) {
        ImageView imageView = this.leftImageView;
        int i = this.imageViewSize;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i, 19));
        ImageView imageView2 = this.leftImageView;
        int i2 = this.teamAvatarPadding;
        imageView2.setPadding(i2, i2, i2, i2);
        ImageView imageView3 = this.rightImageView;
        int i3 = this.imageViewSize;
        imageView3.setLayoutParams(new FrameLayout.LayoutParams(i3, i3, 21));
        setNumberOfVisibleAvatars(2);
        this.activeStateView.setVisibility(8);
        requestLayout();
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.leftImageView, appConfig, c10486i);
        AvatarUtils.loadAvatarIntoView(participant2.getAvatar(), this.rightImageView, appConfig, c10486i);
    }

    private void setNumberOfVisibleAvatars(int i) {
        this.leftImageView.setVisibility(i >= 1 ? 0 : 8);
        this.rightImageView.setVisibility(i >= 2 ? 0 : 8);
        this.topImageView.setVisibility(i < 3 ? 8 : 0);
    }

    public void loadAvatar(Avatar avatar, AppConfig appConfig, C10486i c10486i) {
        this.leftImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.leftImageView.setPadding(0, 0, 0, 0);
        setNumberOfVisibleAvatars(1);
        this.activeStateView.setVisibility(8);
        requestLayout();
        AvatarUtils.loadAvatarIntoView(avatar, this.leftImageView, appConfig, c10486i);
    }

    public void loadAvatarWithActiveState(Avatar avatar, boolean z, AppConfig appConfig, C10486i c10486i) {
        this.leftImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.leftImageView.setPadding(0, 0, 0, 0);
        setNumberOfVisibleAvatars(1);
        this.activeStatePresenter.presentStateDot(z, this.activeStateView, appConfig);
        this.activeStateView.setVisibility(0);
        requestLayout();
        AvatarUtils.loadAvatarIntoView(avatar, this.leftImageView, appConfig, c10486i);
    }

    public void loadAvatars(List<Participant> list, AppConfig appConfig, C10486i c10486i) {
        int size = list.size();
        if (size == 0) {
            loadDefaultDrawable(appConfig);
        } else if (size == 1) {
            loadAvatar(list.get(0).getAvatar(), appConfig, c10486i);
        } else if (size != 2) {
            loadThreeAvatars(list.get(0), list.get(1), list.get(2), appConfig, c10486i);
        } else {
            loadTwoAvatars(list.get(0), list.get(1), appConfig, c10486i);
        }
    }

    public AuthorAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activeStatePresenter = new ActiveStatePresenter();
        this.rightImageView = new ImageView(context);
        this.topImageView = new ImageView(context);
        this.leftImageView = new ImageView(context);
        this.activeStateView = new View(context);
        addView(this.rightImageView);
        addView(this.topImageView);
        addView(this.leftImageView);
        addView(this.activeStateView);
        this.leftImageView.setBackgroundResource(C10110R.C10111drawable.intercom_solid_circle);
        this.rightImageView.setBackgroundResource(C10110R.C10111drawable.intercom_solid_circle);
        this.topImageView.setBackgroundResource(C10110R.C10111drawable.intercom_solid_circle);
        this.activeStateView.setVisibility(8);
        int dpToPx = ScreenUtils.dpToPx(1.0f, context);
        this.teamAvatarPadding = dpToPx;
        this.leftImageView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        ImageView imageView = this.rightImageView;
        int i = this.teamAvatarPadding;
        imageView.setPadding(i, i, i, i);
        ImageView imageView2 = this.topImageView;
        int i2 = this.teamAvatarPadding;
        imageView2.setPadding(i2, i2, i2, i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10110R.styleable.AuthorAvatarView, 0, 0);
        try {
            this.imageViewSize = obtainStyledAttributes.getDimensionPixelSize(C10110R.styleable.AuthorAvatarView_avatarSize, 0);
            this.activeStateSize = obtainStyledAttributes.getDimensionPixelSize(C10110R.styleable.AuthorAvatarView_activeStateSize, 0);
            obtainStyledAttributes.recycle();
            View view = this.activeStateView;
            int i3 = this.activeStateSize;
            view.setLayoutParams(new FrameLayout.LayoutParams(i3, i3, 85));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
