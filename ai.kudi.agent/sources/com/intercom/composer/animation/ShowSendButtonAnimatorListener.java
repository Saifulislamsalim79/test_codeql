package com.intercom.composer.animation;

import android.animation.Animator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.ComposerAnimationStateListener;
import com.intercom.composer.input.Input;
import com.intercom.composer.input.empty.EmptyInput;
import com.intercom.composer.pager.ComposerPagerAdapter;
import java.util.List;
/* loaded from: classes2.dex */
public class ShowSendButtonAnimatorListener extends SendButtonAnimatorListener {
    private final LinearLayoutManager layoutManager;

    public ShowSendButtonAnimatorListener(List<Input> list, ComposerPagerAdapter composerPagerAdapter, RecyclerView.AbstractC1623h abstractC1623h, LinearLayoutManager linearLayoutManager, ComposerAnimationStateListener composerAnimationStateListener) {
        super(list, composerPagerAdapter, abstractC1623h, composerAnimationStateListener);
        this.layoutManager = linearLayoutManager;
    }

    @Override // com.intercom.composer.animation.SendButtonAnimatorListener, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public /* bridge */ /* synthetic */ void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.animationCanceled || emptyInputAdded()) {
            return;
        }
        this.animationStateListener.onAnimationStateChanged(AnimationStatus.SHOWN);
        this.inputs.add(new EmptyInput());
        this.composerPagerAdapter.notifyDataSetChanged();
        int size = this.inputs.size() - 1;
        this.recyclerAdapter.notifyItemInserted(size);
        if (this.layoutManager.m35400k2() == size - 1) {
            this.layoutManager.mo32365F1(size);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.animationStateListener.onAnimationStateChanged(AnimationStatus.SHOWING);
        this.animationStateListener.setSendButtonVisibility(0);
    }
}
