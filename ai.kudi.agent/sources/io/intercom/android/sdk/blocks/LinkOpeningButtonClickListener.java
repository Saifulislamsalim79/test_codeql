package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.view.View;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.LinkOpener;
/* loaded from: classes.dex */
public class LinkOpeningButtonClickListener implements ButtonClickListener {
    private final FeedbackDialog this$0;

    public LinkOpeningButtonClickListener(FeedbackDialog feedbackDialog) {
        this.this$0 = feedbackDialog;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public void onButtonClicked(View view, String str) {
        Context $r3 = view.getContext();
        FeedbackDialog $r2 = this.this$0;
        LinkOpener.handleUrl(str, $r3, $r2);
    }

    @Override // io.intercom.android.sdk.blocks.ButtonClickListener
    public boolean shouldHandleClicks() {
        return true;
    }
}
