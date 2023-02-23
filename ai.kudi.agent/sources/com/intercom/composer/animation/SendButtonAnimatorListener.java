package com.intercom.composer.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.ComposerAnimationStateListener;
import com.intercom.composer.input.Input;
import com.intercom.composer.input.empty.EmptyInput;
import com.intercom.composer.pager.ComposerPagerAdapter;
import java.util.List;
/* loaded from: classes2.dex */
abstract class SendButtonAnimatorListener extends AnimatorListenerAdapter {
    boolean animationCanceled;
    final ComposerAnimationStateListener animationStateListener;
    final ComposerPagerAdapter composerPagerAdapter;
    protected final List<Input> inputs;
    final RecyclerView.AbstractC1623h recyclerAdapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendButtonAnimatorListener(List<Input> list, ComposerPagerAdapter composerPagerAdapter, RecyclerView.AbstractC1623h abstractC1623h, ComposerAnimationStateListener composerAnimationStateListener) {
        this.inputs = list;
        this.composerPagerAdapter = composerPagerAdapter;
        this.recyclerAdapter = abstractC1623h;
        this.animationStateListener = composerAnimationStateListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean emptyInputAdded() {
        for (Input input : this.inputs) {
            if (input instanceof EmptyInput) {
                return true;
            }
        }
        return false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.animationCanceled = true;
    }
}
