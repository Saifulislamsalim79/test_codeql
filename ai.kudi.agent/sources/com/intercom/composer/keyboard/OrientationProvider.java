package com.intercom.composer.keyboard;

import android.content.Context;
/* loaded from: classes2.dex */
public class OrientationProvider {
    private final Context context;

    public OrientationProvider(Context context) {
        this.context = context;
    }

    public int getOrientation() {
        return this.context.getResources().getConfiguration().orientation;
    }
}
