package io.intercom.android.sdk.video;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.widget.MediaController;
import io.intercom.android.sdk.views.IntercomToolbar;
/* loaded from: classes3.dex */
public class IntercomMediaController extends MediaController {
    private static final int ANIMATE_DURATION = 200;
    private Animator.AnimatorListener animateInListener;
    private Animator.AnimatorListener animateOutListener;
    private final IntercomToolbar intercomToolbar;

    public IntercomMediaController(Context context, IntercomToolbar intercomToolbar) {
        super(context);
        this.animateInListener = new Animator.AnimatorListener() { // from class: io.intercom.android.sdk.video.IntercomMediaController.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomMediaController.this.showMediaPlayer();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        };
        this.animateOutListener = new Animator.AnimatorListener() { // from class: io.intercom.android.sdk.video.IntercomMediaController.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomMediaController.this.hideMediaPlayer();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        };
        this.intercomToolbar = intercomToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMediaPlayer() {
        if (((Activity) getContext()).isFinishing()) {
            return;
        }
        this.intercomToolbar.setVisibility(8);
        super.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaPlayer() {
        if (((Activity) getContext()).isFinishing()) {
            return;
        }
        this.intercomToolbar.setVisibility(0);
        super.show(0);
    }

    public void animateToolbarToAlpha(float f) {
        this.intercomToolbar.animate().alpha(f).setDuration(200L).start();
    }

    @Override // android.widget.MediaController
    public void hide() {
        animateToolbarToAlpha(0.0f);
        animate().alpha(0.0f).setDuration(200L).setListener(this.animateOutListener).start();
    }

    @Override // android.widget.MediaController
    public void show() {
        animateToolbarToAlpha(1.0f);
        animate().alpha(1.0f).setDuration(200L).setListener(this.animateInListener).start();
    }
}
