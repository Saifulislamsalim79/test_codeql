package io.intercom.android.sdk.blocks;

import android.view.View;
/* loaded from: classes.dex */
public interface ButtonClickListener {
    void onButtonClicked(View view, String str);

    boolean shouldHandleClicks();
}
