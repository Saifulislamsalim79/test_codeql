package io.intercom.android.sdk.activities;

import android.app.Activity;
import io.intercom.android.sdk.views.IntercomToolbar;
/* loaded from: classes.dex */
class InAppToolbarListener implements IntercomToolbar.Listener {
    private final Activity activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InAppToolbarListener(Activity activity) {
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        Activity $r1 = this.activity;
        $r1.onBackPressed();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
    }
}
