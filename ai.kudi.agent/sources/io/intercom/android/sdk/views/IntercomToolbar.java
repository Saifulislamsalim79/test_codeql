package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.imageloader.WallpaperLoader;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.WindowUtils;
import io.intercom.com.bumptech.glide.C10486i;
import java.io.IOException;
/* loaded from: classes3.dex */
public class IntercomToolbar extends Toolbar implements View.OnTouchListener, View.OnClickListener {
    private static final int TITLE_FADE_DURATION_MS = 150;
    private final View activeStateView;
    private final ImageView avatar;
    private final ImageButton backButton;
    private final BackButtonCountDrawable backButtonCountDrawable;
    private final ImageView backgroundImage;
    private final ImageButton close;
    private Listener listener;
    private final TextView subtitle;
    final TextView title;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onCloseClicked();

        void onInboxClicked();

        void onToolbarClicked();
    }

    public IntercomToolbar(Context context) {
        this(context, null);
    }

    public void animateBackButton() {
        ImageButton imageButton = this.backButton;
        imageButton.startAnimation(AnimationUtils.loadAnimation(imageButton.getContext(), C10110R.anim.intercom_profile_slide_in));
    }

    public void closeWallpaperLoader(WallpaperLoader wallpaperLoader) {
        try {
            wallpaperLoader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fadeOutTitle(int i) {
        this.title.animate().alpha(0.0f).setDuration(i).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.views.IntercomToolbar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomToolbar.this.title.setText((CharSequence) null);
            }
        }).start();
    }

    public void loadWallpaper(WallpaperLoader wallpaperLoader) {
        wallpaperLoader.loadWallpaperInto(this.backgroundImage);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.listener == null) {
            return;
        }
        int id = view.getId();
        if (id == C10110R.C10112id.intercom_toolbar_close) {
            this.listener.onCloseClicked();
        } else if (id == C10110R.C10112id.intercom_toolbar_inbox) {
            this.listener.onInboxClicked();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.listener != null && motionEvent.getAction() == 1 && view.getId() == C10110R.C10112id.intercom_toolbar) {
            this.listener.onToolbarClicked();
        }
        return false;
    }

    public void setCloseButtonVisibility(int i) {
        this.close.setVisibility(i);
    }

    public void setLeftNavigationIcon(Drawable drawable) {
        this.backButton.setImageDrawable(drawable);
    }

    public void setLeftNavigationItemVisibility(int i) {
        this.backButton.setVisibility(i);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.subtitle.setAlpha(1.0f);
    }

    public void setSubtitleVisibility(int i) {
        this.subtitle.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            fadeOutTitle(TITLE_FADE_DURATION_MS);
            return;
        }
        this.title.setAlpha(1.0f);
        this.title.setText(charSequence);
    }

    public void setUnreadCount(Integer num) {
        this.backButtonCountDrawable.setText(num.intValue() > 0 ? Integer.toString(num.intValue()) : null);
    }

    public void setUpHelpCenterToolbar(AppConfig appConfig) {
        boolean helpCenterColorRenderDarkText = appConfig.helpCenterColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.title, helpCenterColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.subtitle, helpCenterColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.close, helpCenterColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.backButton, helpCenterColorRenderDarkText);
    }

    public void setUpNoteToolbar(Participant participant, boolean z, ActiveStatePresenter activeStatePresenter, AppConfig appConfig, C10486i c10486i) {
        this.title.setTextColor(C1335a.m36324d(getContext(), C10110R.color.intercom_note_title_grey));
        this.subtitle.setTextColor(C1335a.m36324d(getContext(), C10110R.color.intercom_note_grey));
        this.close.setColorFilter(C1335a.m36324d(getContext(), C10110R.color.intercom_grey_500));
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(1.0f);
        View findViewById = findViewById(C10110R.C10112id.intercom_toolbar_divider);
        findViewById.setVisibility(0);
        findViewById.setBackgroundColor(-16777216);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig, c10486i);
        activeStatePresenter.presentStateDot(z, this.activeStateView, appConfig);
    }

    public void setUpPostToolbar(Participant participant, boolean z, ActiveStatePresenter activeStatePresenter, AppConfig appConfig, C10486i c10486i) {
        setBackgroundColor(0);
        this.title.setTextColor(-1);
        this.close.setColorFilter(-1);
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(0.7f);
        findViewById(C10110R.C10112id.intercom_toolbar_divider).setVisibility(0);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig, c10486i);
        activeStatePresenter.presentStateDot(z, this.activeStateView, appConfig);
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean secondaryColorRenderDarkText = appConfig.secondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.title, secondaryColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.subtitle, secondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.close, secondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.backButton, secondaryColorRenderDarkText);
    }

    public void updateToolbarSize() {
        int statusBarHeight = WindowUtils.getStatusBarHeight(getResources());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C10110R.dimen.intercom_toolbar_height);
        View findViewById = findViewById(C10110R.C10112id.toolbar_content_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + statusBarHeight, layoutParams.rightMargin, layoutParams.bottomMargin);
        findViewById.setLayoutParams(layoutParams);
        getLayoutParams().height = dimensionPixelSize + statusBarHeight;
        requestLayout();
    }

    public IntercomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = ViewGroup.inflate(context, C10110R.C10113layout.intercom_toolbar, this);
        inflate.setOnTouchListener(this);
        this.title = (TextView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_title);
        this.subtitle = (TextView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_subtitle);
        this.close = (ImageButton) inflate.findViewById(C10110R.C10112id.intercom_toolbar_close);
        this.backButton = (ImageButton) inflate.findViewById(C10110R.C10112id.intercom_toolbar_inbox);
        this.avatar = (ImageView) inflate.findViewById(C10110R.C10112id.intercom_toolbar_avatar);
        this.activeStateView = inflate.findViewById(C10110R.C10112id.intercom_toolbar_avatar_active_state);
        this.backgroundImage = (ImageView) inflate.findViewById(C10110R.C10112id.wallpaper_image);
        BackButtonCountDrawable backButtonCountDrawable = new BackButtonCountDrawable(getContext(), null);
        this.backButtonCountDrawable = backButtonCountDrawable;
        this.backButton.setImageDrawable(backButtonCountDrawable);
        this.backButton.setOnClickListener(this);
        this.close.setOnClickListener(this);
    }
}
