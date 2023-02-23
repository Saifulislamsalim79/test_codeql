package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.core.app.C1297b;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.LinkOpener;
/* loaded from: classes.dex */
public class LightboxOpeningImageClickListener implements ImageClickListener {
    private final FeedbackDialog ipv6;

    public LightboxOpeningImageClickListener(FeedbackDialog feedbackDialog) {
        this.ipv6 = feedbackDialog;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String str, String str2, ImageView imageView, int i, int i2) {
        Context $r4 = imageView.getContext();
        boolean $z0 = TextUtils.isEmpty(str2);
        if (!$z0) {
            FeedbackDialog $r5 = this.ipv6;
            LinkOpener.handleUrl(str2, $r4, $r5);
            return;
        }
        boolean $z02 = $r4 instanceof Activity;
        if (!$z02) {
            $r4.startActivity(LightBoxActivity.imageIntent($r4, str, false));
            return;
        }
        Activity $r6 = (Activity) $r4;
        Window $r7 = $r6.getWindow();
        WindowManager.LayoutParams $r8 = $r7.getAttributes();
        int $i0 = $r8.flags;
        boolean $z1 = ($i0 & 1024) != 0;
        Intent $r9 = LightBoxActivity.imageIntent($r6, str, $z1);
        int $i02 = Build.VERSION.SDK_INT;
        if ($i02 < 16) {
            $r6.startActivity($r9);
            return;
        }
        C1297b $r10 = C1297b.m36457b($r6, imageView, LightBoxActivity.TRANSITION_KEY);
        Bundle $r11 = $r10.mo36456c();
        $r6.startActivity($r9, $r11);
    }
}
