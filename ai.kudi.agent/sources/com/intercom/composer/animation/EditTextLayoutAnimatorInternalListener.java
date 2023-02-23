package com.intercom.composer.animation;

import android.app.Activity;
/* loaded from: classes2.dex */
public class EditTextLayoutAnimatorInternalListener {
    private final Activity activity;

    public EditTextLayoutAnimatorInternalListener(Activity activity) {
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEditTextLayoutAnimationEnd(AnimationStatus animationStatus) {
        Activity activity = this.activity;
        if (activity instanceof EditTextLayoutAnimatorListener) {
            ((EditTextLayoutAnimatorListener) activity).onEditTextLayoutAnimationEnd(animationStatus);
        }
    }
}
