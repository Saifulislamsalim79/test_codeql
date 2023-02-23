package com.intercom.composer.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
/* loaded from: classes2.dex */
public class ResourceIconProvider implements IconProvider {
    private final int resId;

    public ResourceIconProvider(int i) {
        this.resId = i;
    }

    @Override // com.intercom.composer.input.IconProvider
    public Drawable getIconDrawable(String str, Context context) {
        return C1335a.m36322f(context, this.resId);
    }
}
