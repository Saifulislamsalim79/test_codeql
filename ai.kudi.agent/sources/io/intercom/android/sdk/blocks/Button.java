package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.ButtonBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.FacebookBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
import io.intercom.android.sdk.views.ButtonSelector;
/* loaded from: classes.dex */
class Button implements ButtonBlock, FacebookBlock, TwitterBlock {
    private static final int FACEBOOK_LOGO_PADDING_LEFT_DP = 20;
    private static final int TWITTER_LOGO_PADDING_LEFT_DP = 16;
    private final Provider<AppConfig> appConfigProvider;
    private final ButtonClickListener buttonClickListener;
    private final StyleType style;

    public Button(StyleType styleType, Provider provider, ButtonClickListener buttonClickListener) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.buttonClickListener = buttonClickListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View createButtonWithLogo(Context context, String str, int i, int i2) {
        FrameLayout r12 = new FrameLayout(context);
        int $i2 = ScreenUtils.dpToPx(44.0f, context);
        BlockUtils.createLayoutParams(r12, -1, $i2);
        BlockUtils.setDefaultMarginBottom(r12);
        Provider $r4 = this.appConfigProvider;
        Object $r5 = $r4.get();
        AppConfig $r6 = (AppConfig) $r5;
        int $i22 = $r6.getPrimaryColor();
        int $i3 = C10110R.C10111drawable.intercom_border;
        Drawable r13 = new ButtonSelector(context, $i3, $i22);
        Drawable r16 = r13;
        BackgroundUtils.setBackground(r12, r16);
        ViewGroup.LayoutParams $r8 = r12.getLayoutParams();
        LinearLayout.LayoutParams $r9 = (LinearLayout.LayoutParams) $r8;
        $r9.gravity = 17;
        ImageView r14 = new ImageView(context);
        BlockUtils.createLayoutParams(r14, -2, -1);
        r14.setImageResource(i2);
        int $i1 = C10110R.color.intercom_full_transparent_full_black;
        r14.setBackgroundResource($i1);
        r14.setPadding(i, 0, 0, 0);
        ViewGroup.LayoutParams $r82 = r14.getLayoutParams();
        LinearLayout.LayoutParams $r92 = (LinearLayout.LayoutParams) $r82;
        $r92.gravity = 19;
        TextView r15 = new TextView(context);
        BlockUtils.createLayoutParams(r15, -1, -1);
        r15.setText(str);
        r15.setTextSize(16.0f);
        int $i0 = C10110R.color.intercom_white;
        r15.setTextColor(C1335a.m36324d(context, $i0));
        int $i02 = C10110R.color.intercom_full_transparent_full_black;
        r15.setBackgroundResource($i02);
        r15.setGravity(17);
        FontUtils.setRobotoMediumTypeface(r15);
        r12.addView(r14);
        r12.addView(r15);
        return r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private TextView createDefaultTextView(Context context, String str, BlockAlignment blockAlignment) {
        Provider $r6 = this.appConfigProvider;
        Object $r7 = $r6.get();
        AppConfig $r8 = (AppConfig) $r7;
        StyleType $r4 = this.style;
        TextView r9 = new ParagraphView(context, $r4, blockAlignment, $r8);
        int $i0 = $r8.getPrimaryColor();
        TextView r10 = r9;
        r10.setTextColor($i0);
        TextView r102 = r9;
        int $i02 = r102.getPaintFlags();
        TextView r103 = r9;
        r103.setPaintFlags($i02 | 8);
        int $i03 = blockAlignment.getGravity();
        TextView r104 = r9;
        r104.setGravity($i03);
        TextView r105 = r9;
        r105.setText(str);
        TextView r106 = r9;
        return r106;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private android.widget.Button createFullWidthButton(Context context, String str) {
        Provider $r4 = this.appConfigProvider;
        Object $r5 = $r4.get();
        AppConfig $r6 = (AppConfig) $r5;
        android.widget.Button r8 = new android.widget.Button(context);
        r8.setTextSize(16.0f);
        boolean $z0 = $r6.primaryColorRenderDarkText();
        int $i0 = ColorUtils.whiteOrDarkColor(context, $z0);
        r8.setTextColor($i0);
        r8.setAllCaps(false);
        r8.setGravity(17);
        r8.setText(str);
        BlockUtils.createLayoutParams(r8, -1, -2);
        BlockUtils.setDefaultMarginBottom(r8);
        int $i02 = $r6.getPrimaryColor();
        int $i1 = C10110R.C10111drawable.intercom_border;
        Drawable r9 = new ButtonSelector(context, $i1, $i02);
        Drawable r10 = r9;
        BackgroundUtils.setBackground(r8, r10);
        FontUtils.setRobotoMediumTypeface(r8);
        return r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View setButtonDefaults(View view, final String str, BlockAlignment blockAlignment, boolean z) {
        ButtonClickListener $r4 = this.buttonClickListener;
        boolean $z1 = $r4.shouldHandleClicks();
        if ($z1) {
            view.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Button.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Button $r42 = Button.this;
                    ButtonClickListener $r3 = $r42.buttonClickListener;
                    String $r2 = str;
                    $r3.onButtonClicked(view2, $r2);
                }
            });
        }
        int $i0 = blockAlignment.getGravity();
        BlockUtils.setLayoutMarginsAndGravity(view, $i0, z);
        return view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.ButtonBlock
    public View addButton(String str, String str2, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        TextView $r8;
        Context $r5 = viewGroup.getContext();
        StyleType $r6 = this.style;
        StyleType $r7 = StyleType.NOTE;
        if ($r6 != $r7) {
            StyleType $r72 = StyleType.ARTICLE;
            if ($r6 != $r72) {
                StyleType $r73 = StyleType.POST;
                if ($r6 != $r73) {
                    StyleType $r74 = StyleType.CONTAINER_CARD;
                    if ($r6 != $r74) {
                        $r8 = createDefaultTextView($r5, str, blockAlignment);
                        View $r10 = setButtonDefaults($r8, str2, blockAlignment, z2);
                        return $r10;
                    }
                }
            }
        }
        $r8 = createFullWidthButton($r5, str);
        View $r102 = setButtonDefaults($r8, str2, blockAlignment, z2);
        return $r102;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.FacebookBlock
    public View addFacebookButton(String str, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        View $r9;
        Context $r4 = viewGroup.getContext();
        int $i0 = C10110R.string.intercom_facebook_like;
        String $r5 = $r4.getString($i0);
        StyleType $r6 = this.style;
        StyleType $r7 = StyleType.NOTE;
        if ($r6 != $r7) {
            StyleType $r72 = StyleType.ARTICLE;
            if ($r6 != $r72) {
                StyleType $r73 = StyleType.POST;
                if ($r6 != $r73) {
                    StyleType $r74 = StyleType.CONTAINER_CARD;
                    if ($r6 != $r74) {
                        $r9 = createDefaultTextView($r4, $r5, blockAlignment);
                        return setButtonDefaults($r9, str, blockAlignment, z2);
                    }
                }
            }
        }
        int $i02 = ScreenUtils.dpToPx(20.0f, $r4);
        int $i1 = C10110R.C10111drawable.intercom_icn_fb;
        $r9 = createButtonWithLogo($r4, $r5, $i02, $i1);
        return setButtonDefaults($r9, str, blockAlignment, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.TwitterBlock
    public View addTwitterButton(String str, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        View $r9;
        Context $r4 = viewGroup.getContext();
        int $i0 = C10110R.string.intercom_twitter_follow;
        String $r5 = $r4.getString($i0);
        StyleType $r6 = this.style;
        StyleType $r7 = StyleType.NOTE;
        if ($r6 != $r7) {
            StyleType $r72 = StyleType.ARTICLE;
            if ($r6 != $r72) {
                StyleType $r73 = StyleType.POST;
                if ($r6 != $r73) {
                    StyleType $r74 = StyleType.CONTAINER_CARD;
                    if ($r6 != $r74) {
                        $r9 = createDefaultTextView($r4, $r5, blockAlignment);
                        return setButtonDefaults($r9, str, blockAlignment, z2);
                    }
                }
            }
        }
        int $i02 = ScreenUtils.dpToPx(16.0f, $r4);
        int $i1 = C10110R.C10111drawable.intercom_icn_twitter;
        $r9 = createButtonWithLogo($r4, $r5, $i02, $i1);
        return setButtonDefaults($r9, str, blockAlignment, z2);
    }
}
