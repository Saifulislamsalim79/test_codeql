package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.AttachmentListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LocalAttachmentBlock;
import io.intercom.android.sdk.blocks.models.BlockAttachment;
import io.intercom.android.sdk.blocks.views.AttachmentView;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.views.ProgressLinearLayout;
import io.intercom.android.sdk.views.UploadProgressBar;
import java.util.List;
/* loaded from: classes.dex */
class Attachment implements AttachmentListBlock, LocalAttachmentBlock {
    private static final int ATTACHMENT_LINE_SPACING_DP = 12;
    private static final int DIVIDER_MARGIN_DP = 6;
    private static final int DIVIDER_WIDTH_DP = 1;
    private static final int LOCAL_ICON_SIZE_DP = 20;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    public Attachment(StyleType styleType, Provider provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ImageView getAttachmentIcon(Context context) {
        ImageView $r1 = new ImageView(context);
        FrameLayout.LayoutParams $r3 = new FrameLayout.LayoutParams(-1, -1);
        $r1.setLayoutParams($r3);
        $r1.setVisibility(8);
        int $i0 = C10110R.C10111drawable.intercom_icn_attachment;
        $r1.setImageResource($i0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private LinearLayout getAttachmentListView(Context context) {
        LinearLayout $r1 = new LinearLayout(context);
        $r1.setOrientation(1);
        int $i0 = C10110R.color.intercom_full_transparent_full_black;
        $r1.setBackgroundResource($i0);
        BlockUtils.createLayoutParams($r1, -2, -2);
        BlockUtils.setDefaultMarginBottom($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View getDivider(Context context) {
        int $i0 = ScreenUtils.dpToPx(6.0f, context);
        int $i1 = ScreenUtils.dpToPx(1.0f, context);
        View $r1 = new View(context);
        int $i2 = C10110R.color.intercom_white;
        $r1.setBackgroundResource($i2);
        BlockUtils.createLayoutParams($r1, $i1, -1);
        ViewGroup.LayoutParams $r3 = $r1.getLayoutParams();
        LinearLayout.LayoutParams $r4 = (LinearLayout.LayoutParams) $r3;
        ((ViewGroup.MarginLayoutParams) $r4).leftMargin = $i0;
        ((ViewGroup.MarginLayoutParams) $r4).rightMargin = $i0;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private FrameLayout getIconHolder(Context context) {
        int $i0 = ScreenUtils.dpToPx(20.0f, context);
        FrameLayout $r1 = new FrameLayout(context);
        BlockUtils.createLayoutParams($r1, $i0, $i0);
        ViewGroup.LayoutParams $r3 = $r1.getLayoutParams();
        LinearLayout.LayoutParams $r4 = (LinearLayout.LayoutParams) $r3;
        $r4.gravity = 19;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ProgressLinearLayout getLocalAttachmentView(Context context) {
        ProgressLinearLayout r3 = new ProgressLinearLayout(context);
        ProgressLinearLayout r4 = r3;
        BlockUtils.createLayoutParams(r4, -2, -2);
        ProgressLinearLayout r42 = r3;
        BlockUtils.setDefaultMarginBottom(r42);
        ProgressLinearLayout r5 = r3;
        r5.setOrientation(0);
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TextView getTextView(String str, Context context) {
        TextView $r2 = new TextView(context);
        BlockUtils.createLayoutParams($r2, -2, -2);
        BlockUtils.setSmallLineSpacing($r2);
        $r2.setGravity(19);
        TextUtils.TruncateAt $r4 = TextUtils.TruncateAt.END;
        $r2.setEllipsize($r4);
        $r2.setTextSize(15.0f);
        int $i0 = C10110R.color.intercom_white;
        $r2.setTextColor(C1335a.m36324d(context, $i0));
        int $i02 = C10110R.color.intercom_full_transparent_full_black;
        $r2.setBackgroundResource($i02);
        $r2.setText(str);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private UploadProgressBar getUploadProgressBar(Context context) {
        UploadProgressBar r4 = new UploadProgressBar(context);
        ViewGroup.LayoutParams r5 = new FrameLayout.LayoutParams(-1, -1);
        UploadProgressBar r6 = r4;
        r6.setLayoutParams(r5);
        return r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.LocalAttachmentBlock
    public View addAttachment(BlockAttachment blockAttachment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r3 = viewGroup.getContext();
        ProgressLinearLayout $r4 = getLocalAttachmentView($r3);
        FrameLayout $r5 = getIconHolder($r3);
        ImageView $r6 = getAttachmentIcon($r3);
        UploadProgressBar $r7 = getUploadProgressBar($r3);
        View $r8 = getDivider($r3);
        String $r9 = blockAttachment.getName();
        View $r10 = getTextView($r9, $r3);
        UploadProgressBar r11 = $r7;
        $r5.addView(r11);
        $r5.addView($r6);
        $r4.setUploadProgressBar($r7);
        $r4.setAttachmentIcon($r6);
        ProgressLinearLayout r12 = $r4;
        r12.addView($r5);
        ProgressLinearLayout r122 = $r4;
        r122.addView($r8);
        ProgressLinearLayout r123 = $r4;
        r123.addView($r10);
        ProgressLinearLayout $r82 = $r4;
        BlockUtils.setLayoutMarginsAndGravity($r82, 3, z2);
        ProgressLinearLayout $r83 = $r4;
        return $r83;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.AttachmentListBlock
    public View addAttachmentList(List list, boolean z, boolean z2, ViewGroup viewGroup) {
        Provider $r4 = this.appConfigProvider;
        Object $r5 = $r4.get();
        AppConfig $r6 = (AppConfig) $r5;
        int $i0 = $r6.getPrimaryColor();
        Context $r7 = viewGroup.getContext();
        LinearLayout $r8 = getAttachmentListView($r7);
        int $i1 = list.size();
        for (int $i2 = 0; $i2 < $i1; $i2++) {
            StyleType $r9 = this.style;
            Object $r52 = list.get($i2);
            BlockAttachment $r10 = (BlockAttachment) $r52;
            AttachmentView $r1 = new AttachmentView($r7, $r9, $i0, $r10);
            int $i3 = $i1 - 1;
            if ($i2 < $i3) {
                int $i32 = $r1.getPaddingLeft();
                int $i4 = $r1.getPaddingTop();
                int $i5 = $r1.getPaddingRight();
                int $i6 = ScreenUtils.dpToPx(12.0f, $r7);
                $r1.setPadding($i32, $i4, $i5, $i6);
            }
            $r8.addView($r1);
        }
        BlockUtils.setLayoutMarginsAndGravity($r8, 3, z2);
        return $r8;
    }
}
