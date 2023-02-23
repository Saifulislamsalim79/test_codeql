package com.intercom.composer.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.intercom.composer.C7163R;
import com.intercom.composer.input.InputFragment;
/* loaded from: classes2.dex */
public abstract class Input<T extends InputFragment> {
    private String fragmentTag;
    private final IconProvider iconProvider;
    private final String uniqueIdentifier;

    /* JADX INFO: Access modifiers changed from: protected */
    public Input(String str, IconProvider iconProvider) {
        this.uniqueIdentifier = str;
        this.iconProvider = iconProvider;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Inputs must have a non-empty unique identifier.");
        }
    }

    public abstract T createFragment();

    public T findFragment(FragmentManager fragmentManager) {
        return (T) fragmentManager.m35938g0(this.fragmentTag);
    }

    public int getBackgroundColor() {
        return C7163R.color.intercom_composer_white;
    }

    public int getBorderColor() {
        return C7163R.color.intercom_composer_border;
    }

    public Drawable getIconDrawable(Context context) {
        return this.iconProvider.getIconDrawable(this.uniqueIdentifier, context);
    }

    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public void setFragmentTag(String str) {
        this.fragmentTag = str;
    }
}
