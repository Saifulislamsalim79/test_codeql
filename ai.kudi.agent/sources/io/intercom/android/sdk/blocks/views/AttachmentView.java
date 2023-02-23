package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.blocks.models.BlockAttachment;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
/* loaded from: classes.dex */
public class AttachmentView extends LinearLayout implements View.OnClickListener {
    static final int ATTACHMENT_ICON_WIDTH_DP = 20;
    static final int DIVIDER_MARGIN_DP = 6;
    static final int DIVIDER_WIDTH_DP = 1;
    private final String mUrl;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AttachmentView(Context context, StyleType styleType, int i, BlockAttachment blockAttachment) {
        super(context);
        String $r4 = blockAttachment.getUrl();
        this.mUrl = $r4;
        setOrientation(0);
        ImageView $r5 = setupIcon(context, styleType, i);
        addView($r5);
        boolean $z0 = isUserMessage(styleType);
        if ($z0) {
            View $r6 = setupDivider(context);
            addView($r6);
        }
        String $r42 = blockAttachment.getName();
        TextView $r7 = setupName(context, styleType, i, $r42);
        addView($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isUserMessage(StyleType styleType) {
        StyleType $r2 = StyleType.PREVIEW;
        if ($r2 != styleType) {
            StyleType $r22 = StyleType.USER;
            return $r22 == styleType;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View setupDivider(Context context) {
        View $r1 = new View(context);
        int $i0 = ScreenUtils.dpToPx(1.0f, context);
        int $i1 = ScreenUtils.dpToPx(6.0f, context);
        LinearLayout.LayoutParams $r3 = new LinearLayout.LayoutParams($i0, -1);
        $r3.setMargins($i1, 0, $i1, 0);
        $r1.setLayoutParams($r3);
        int $i02 = C10110R.color.intercom_white;
        $r1.setBackgroundResource($i02);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ImageView setupIcon(Context context, StyleType styleType, int i) {
        ImageView $r2 = new ImageView(context);
        int $i1 = ScreenUtils.dpToPx(20.0f, context);
        LinearLayout.LayoutParams $r4 = new LinearLayout.LayoutParams($i1, -2);
        $r4.gravity = 19;
        $r2.setLayoutParams($r4);
        int $i12 = C10110R.C10111drawable.intercom_icn_attachment;
        $r2.setImageResource($i12);
        boolean $z0 = isUserMessage(styleType);
        if (!$z0) {
            $r2.setColorFilter(i);
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TextView setupName(Context context, StyleType styleType, int $i0, String str) {
        TextView $r2 = new TextView(context);
        LinearLayout.LayoutParams $r5 = new LinearLayout.LayoutParams(-2, -2);
        $r5.gravity = 19;
        $r2.setLayoutParams($r5);
        TextUtils.TruncateAt $r6 = TextUtils.TruncateAt.END;
        $r2.setEllipsize($r6);
        int $i1 = C10110R.color.intercom_full_transparent_full_black;
        $r2.setBackgroundResource($i1);
        $r2.setGravity(19);
        $r2.setTextSize(15.0f);
        $r2.setText(str);
        $r2.setOnClickListener(this);
        boolean $z0 = isUserMessage(styleType);
        if (!$z0) {
            $r2.setTextColor($i0);
            return $r2;
        }
        int $i02 = C10110R.color.intercom_white;
        $r2.setTextColor(C1335a.m36324d(context, $i02));
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String $r2 = this.mUrl;
        Uri $r3 = Uri.parse($r2);
        Uri $r4 = Uri.EMPTY;
        boolean $z0 = $r4.equals($r3);
        if ($z0) {
            return;
        }
        Intent $r5 = new Intent("android.intent.action.VIEW", $r3);
        $r5.setFlags(268435456);
        Context $r6 = getContext();
        IntentUtils.safelyOpenIntent($r6, $r5);
    }
}
