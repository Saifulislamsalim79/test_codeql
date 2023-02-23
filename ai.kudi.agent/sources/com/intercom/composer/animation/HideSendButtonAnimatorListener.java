package com.intercom.composer.animation;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.ComposerAnimationStateListener;
import com.intercom.composer.input.Input;
import com.intercom.composer.pager.ComposerPagerAdapter;
import java.util.List;
/* loaded from: classes2.dex */
public class HideSendButtonAnimatorListener extends SendButtonAnimatorListener {
    public HideSendButtonAnimatorListener(List<Input> list, ComposerPagerAdapter composerPagerAdapter, RecyclerView.AbstractC1623h abstractC1623h, ComposerAnimationStateListener composerAnimationStateListener) {
        super(list, composerPagerAdapter, abstractC1623h, composerAnimationStateListener);
    }

    @Override // com.intercom.composer.animation.SendButtonAnimatorListener, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public /* bridge */ /* synthetic */ void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.animationStateListener.setSendButtonVisibility(8);
        if (this.animationCanceled || !emptyInputAdded()) {
            return;
        }
        this.animationStateListener.onAnimationStateChanged(AnimationStatus.HIDDEN);
        List<Input> list = this.inputs;
        list.remove(list.size() - 1);
        this.composerPagerAdapter.notifyDataSetChanged();
        this.recyclerAdapter.notifyItemRemoved(this.inputs.size());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.animationStateListener.onAnimationStateChanged(AnimationStatus.HIDING);
    }
}
