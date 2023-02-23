package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.C1297b;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.activities.IntercomArticleActivity;
import io.intercom.android.sdk.blocks.blockInterfaces.LinkBlock;
import io.intercom.android.sdk.blocks.models.Author;
import io.intercom.android.sdk.blocks.models.Link;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LinkCard implements LinkBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final C10486i requestManager;
    private final StyleType style;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkCard(StyleType styleType, Provider provider, String str, C10486i c10486i) {
        this.style = styleType;
        this.appConfigProvider = provider;
        this.conversationId = str;
        this.requestManager = c10486i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addAuthorDetails(Link link, ImageView imageView, TextView textView, String str) {
        imageView.setVisibility(0);
        textView.setVisibility(0);
        SpannableString $r2 = new SpannableString(str);
        StyleSpan $r3 = new StyleSpan(1);
        int $i0 = str.length();
        $r2.setSpan($r3, 0, $i0, 33);
        String $r6 = "Written by " + ((Object) $r2);
        textView.setText($r6);
        Resources $r8 = imageView.getResources();
        int $i02 = C10110R.dimen.intercom_avatar_size;
        int $i03 = $r8.getDimensionPixelSize($i02);
        Author $r9 = link.getAuthor();
        String $r62 = $r9.getAvatar();
        Avatar $r10 = Avatar.create($r62, "");
        Provider $r11 = this.appConfigProvider;
        Object $r12 = $r11.get();
        AppConfig $r13 = (AppConfig) $r12;
        C10486i $r14 = this.requestManager;
        AvatarUtils.createAvatar($r10, imageView, $i03, $r13, $r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private View createLinkBlock(final Link link, ViewGroup viewGroup, boolean z, boolean z2) {
        Provider $r3 = this.appConfigProvider;
        Object $r4 = $r3.get();
        AppConfig $r5 = (AppConfig) $r4;
        final Context $r6 = viewGroup.getContext();
        LayoutInflater $r7 = LayoutInflater.from($r6);
        int $i0 = C10110R.C10113layout.intercom_link_block;
        View $r8 = $r7.inflate($i0, viewGroup, false);
        final LinearLayout $r9 = (LinearLayout) $r8;
        int $i02 = C10110R.C10112id.title;
        View $r82 = $r9.findViewById($i02);
        TextView $r10 = (TextView) $r82;
        ColorUtils.setTextColorPrimaryOrDark($r10, $r5);
        $r10.setText(link.getTitle());
        int $i03 = C10110R.C10112id.description;
        View $r83 = $r9.findViewById($i03);
        setUpDescription(link, (TextView) $r83);
        int $i04 = C10110R.C10112id.avatar;
        View $r84 = $r9.findViewById($i04);
        ImageView $r12 = (ImageView) $r84;
        int $i05 = C10110R.C10112id.author;
        View $r85 = $r9.findViewById($i05);
        TextView $r102 = (TextView) $r85;
        Author $r13 = link.getAuthor();
        String $r11 = $r13.getFirstName();
        boolean $z2 = TextUtils.isEmpty($r11);
        if ($z2) {
            $r12.setVisibility(8);
            $r102.setVisibility(8);
        } else {
            addAuthorDetails(link, $r12, $r102, $r11);
        }
        if (!z) {
            boolean $z1 = io.intercom.android.sdk.models.Link.ARTICLE_TYPE.equals(link.getLinkType());
            if ($z1) {
                $r9.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.LinkCard.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Context $r2 = $r6;
                        boolean $z0 = $r2 instanceof Activity;
                        if ($z0) {
                            Activity $r32 = (Activity) $r2;
                            Link $r42 = link;
                            String $r52 = $r42.getArticleId();
                            LinkCard $r62 = LinkCard.this;
                            String $r72 = $r62.conversationId;
                            Intent $r86 = IntercomArticleActivity.buildIntent($r32, $r52, $r72);
                            int $i06 = Build.VERSION.SDK_INT;
                            if ($i06 < 16) {
                                $r32.startActivity($r86);
                                return;
                            }
                            LinearLayout $r92 = $r9;
                            C1297b $r103 = C1297b.m36457b($r32, $r92, "link_background");
                            Bundle $r112 = $r103.mo36456c();
                            $r32.startActivity($r86, $r112);
                        }
                    }
                });
            }
            int $i06 = C10110R.C10111drawable.intercom_conversation_card_background;
            Drawable $r16 = C1335a.m36322f($r6, $i06);
            BackgroundUtils.setBackground($r9, $r16);
            BlockUtils.setMarginBottom($r9, 8);
            Resources $r17 = $r6.getResources();
            int $i07 = C10110R.dimen.intercom_link_padding;
            int $i08 = $r17.getDimensionPixelSize($i07);
            $r9.setPadding($i08, $i08, $i08, $i08);
            BlockUtils.setLayoutMarginsAndGravity($r9, 3, z2);
        }
        return $r9;
    }

    private boolean isOnlyBlock(boolean z, boolean z2) {
        return z && z2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setUpDescription(Link link, TextView textView) {
        String $r3 = link.getDescription();
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean shouldDisplayLink() {
        StyleType $r1 = StyleType.ADMIN;
        StyleType $r2 = this.style;
        boolean $z0 = $r1.equals($r2);
        if ($z0) {
            return true;
        }
        StyleType $r12 = StyleType.CHAT_FULL;
        StyleType $r22 = this.style;
        boolean $z02 = $r12.equals($r22);
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.LinkBlock
    public View addLinkBlock(Link link, boolean z, boolean z2, ViewGroup viewGroup) {
        boolean $z0 = isOnlyBlock(z, z2);
        boolean $z2 = shouldDisplayLink();
        if ($z2) {
            View $r3 = createLinkBlock(link, viewGroup, $z0, z2);
            return $r3;
        }
        Context $r5 = viewGroup.getContext();
        StyleType $r6 = StyleType.ADMIN;
        BlockAlignment $r7 = BlockAlignment.LEFT;
        Provider $r8 = this.appConfigProvider;
        Object $r9 = $r8.get();
        AppConfig $r10 = (AppConfig) $r9;
        View r13 = new ParagraphView($r5, $r6, $r7, $r10);
        String $r11 = link.getText();
        CharSequence $r12 = HtmlCompat.fromHtml($r11);
        TextView r14 = (TextView) r13;
        r14.setText($r12);
        View $r32 = r13;
        return $r32;
    }
}
