package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.LinkListBlock;
import io.intercom.android.sdk.blocks.models.Link;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.package_2.FeedbackDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LinkListRenderer implements LinkListBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private final FeedbackDialog outputStream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkListRenderer(FeedbackDialog feedbackDialog, Provider provider, String str) {
        this.outputStream = feedbackDialog;
        this.appConfigProvider = provider;
        this.conversationId = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void addLinkToLayout(final LinearLayout linearLayout, final Link link, int i, final Context context, boolean z) {
        FrameLayout $r2 = new FrameLayout(context);
        $r2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView $r6 = new TextView(context);
        FrameLayout.LayoutParams $r5 = new FrameLayout.LayoutParams(-2, -1);
        if (z) {
            $r5.gravity = 17;
        }
        $r6.setLayoutParams($r5);
        $r6.setTextColor(i);
        $r6.setTextSize(16.0f);
        String $r7 = link.getTitle();
        $r6.setText($r7);
        $r6.setMaxLines(2);
        TextUtils.TruncateAt $r8 = TextUtils.TruncateAt.END;
        $r6.setEllipsize($r8);
        int $i1 = ScreenUtils.dpToPx(24.0f, context);
        int $i2 = ScreenUtils.dpToPx(16.0f, context);
        int $i3 = ScreenUtils.dpToPx(16.0f, context);
        int $i4 = ScreenUtils.dpToPx(16.0f, context);
        $r6.setPadding($i1, $i2, $i3, $i4);
        String $r72 = link.getLinkType();
        boolean $z0 = io.intercom.android.sdk.models.Link.HELP_CENTER_TYPE.equals($r72);
        if ($z0) {
            int $i12 = C10110R.C10111drawable.intercom_open_help_center;
            Drawable $r10 = C1335a.m36322f(context, $i12);
            PorterDuff.Mode $r11 = PorterDuff.Mode.SRC_IN;
            $r10.setColorFilter(i, $r11);
            $r6.setCompoundDrawablesWithIntrinsicBounds($r10, (Drawable) null, (Drawable) null, (Drawable) null);
            int $i0 = ScreenUtils.dpToPx(8.0f, context);
            $r6.setCompoundDrawablePadding($i0);
        }
        $r2.addView($r6);
        $r2.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.LinkListRenderer.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
                if (r4 != false) goto L18;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r19) {
                /*
                    r18 = this;
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getLinkType()
                    java.lang.String r3 = "educate.article"
                    boolean r4 = r3.equals(r2)
                    if (r4 != 0) goto L24
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getLinkType()
                    java.lang.String r3 = "educate.suggestion"
                    boolean r4 = r3.equals(r2)
                    if (r4 == 0) goto L62
                L24:
                    r0 = r18
                    android.content.Context r5 = r3
                    boolean r4 = r5 instanceof android.app.Activity
                    if (r4 == 0) goto L62
                    r7 = r5
                    android.app.Activity r7 = (android.app.Activity) r7
                    r6 = r7
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getArticleId()
                    r0 = r18
                    io.intercom.android.sdk.blocks.LinkListRenderer r8 = io.intercom.android.sdk.blocks.LinkListRenderer.this
                    java.lang.String r3 = io.intercom.android.sdk.blocks.LinkListRenderer.access$000(r8)
                    android.content.Intent r9 = io.intercom.android.sdk.activities.IntercomArticleActivity.buildIntent(r6, r2, r3)
                    int r10 = android.os.Build.VERSION.SDK_INT
                    r11 = 16
                    if (r10 < r11) goto L5e
                    r0 = r18
                    android.widget.LinearLayout r12 = r4
                    java.lang.String r14 = "link_background"
                    androidx.core.app.b r13 = androidx.core.app.C1297b.m36457b(r6, r12, r14)
                    android.os.Bundle r15 = r13.mo36456c()
                    r6.startActivity(r9, r15)
                    return
                L5e:
                    r6.startActivity(r9)
                    return
                L62:
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getLinkType()
                    java.lang.String r3 = "educate.help_center"
                    boolean r4 = r3.equals(r2)
                    if (r4 == 0) goto Lb5
                    r0 = r18
                    android.content.Context r5 = r3
                    boolean r4 = r5 instanceof android.app.Activity
                    if (r4 == 0) goto Lb5
                    r16 = r5
                    android.app.Activity r16 = (android.app.Activity) r16
                    r6 = r16
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getUrl()
                    r0 = r18
                    io.intercom.android.sdk.blocks.LinkListRenderer r8 = io.intercom.android.sdk.blocks.LinkListRenderer.this
                    java.lang.String r3 = io.intercom.android.sdk.blocks.LinkListRenderer.access$000(r8)
                    r11 = 0
                    android.content.Intent r9 = io.intercom.android.sdk.activities.IntercomHelpCenterActivity.buildIntent(r6, r2, r11, r3)
                    int r10 = android.os.Build.VERSION.SDK_INT
                    r11 = 16
                    if (r10 < r11) goto Lb1
                    r0 = r18
                    android.widget.LinearLayout r12 = r4
                    java.lang.String r14 = "link_background"
                    androidx.core.app.b r13 = androidx.core.app.C1297b.m36457b(r6, r12, r14)
                    android.os.Bundle r15 = r13.mo36456c()
                    r6.startActivity(r9, r15)
                    return
                Lb1:
                    r6.startActivity(r9)
                    return
                Lb5:
                    r0 = r18
                    io.intercom.android.sdk.blocks.models.Link r1 = r2
                    r18 = r0
                    java.lang.String r2 = r1.getUrl()
                    r0 = r18
                    android.content.Context r5 = r3
                    r0 = r18
                    io.intercom.android.sdk.blocks.LinkListRenderer r8 = io.intercom.android.sdk.blocks.LinkListRenderer.this
                    io.intercom.android.sdk.package_2.FeedbackDialog r17 = io.intercom.android.sdk.blocks.LinkListRenderer.access$100(r8)
                    r0 = r17
                    io.intercom.android.sdk.utilities.LinkOpener.handleUrl(r2, r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.LinkListRenderer.View$OnClickListenerC101841.onClick(android.view.View):void");
            }
        });
        TypedValue $r13 = new TypedValue();
        Resources.Theme $r14 = context.getTheme();
        $r14.resolveAttribute(16843534, $r13, true);
        int $i02 = $r13.resourceId;
        $r2.setBackgroundResource($i02);
        linearLayout.addView($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x007e */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.LinkListBlock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View addLinkListBlock(io.intercom.android.sdk.blocks.models.LinkList r28, boolean r29, boolean r30, android.view.ViewGroup r31) {
        /*
            r27 = this;
            r0 = r31
            android.content.Context r6 = r0.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r6)
            int r8 = io.intercom.android.sdk.C10110R.C10113layout.intercom_card_list_block
            r10 = 0
            r0 = r31
            android.view.View r9 = r7.inflate(r8, r0, r10)
            r12 = r9
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r11 = r12
            r0 = r27
            io.intercom.android.sdk.Provider<io.intercom.android.sdk.identity.AppConfig> r13 = r0.appConfigProvider
            java.lang.Object r14 = r13.get()
            r16 = r14
            io.intercom.android.sdk.identity.AppConfig r16 = (io.intercom.android.sdk.identity.AppConfig) r16
            r15 = r16
            int r8 = io.intercom.android.sdk.utilities.ColorUtils.primaryOrDarkColor(r6, r15)
            r0 = r27
            io.intercom.android.sdk.Provider<io.intercom.android.sdk.identity.AppConfig> r13 = r0.appConfigProvider
            java.lang.Object r14 = r13.get()
            r17 = r14
            io.intercom.android.sdk.identity.AppConfig r17 = (io.intercom.android.sdk.identity.AppConfig) r17
            r15 = r17
            io.intercom.android.sdk.utilities.ColorUtils.updateInnerBorderColor(r15, r11)
            int r18 = io.intercom.android.sdk.C10110R.C10112id.card_links
            r0 = r18
            android.view.View r9 = r11.findViewById(r0)
            r20 = r9
            android.widget.LinearLayout r20 = (android.widget.LinearLayout) r20
            r19 = r20
            r10 = 2
            r0 = r19
            r0.setShowDividers(r10)
            int r18 = io.intercom.android.sdk.C10110R.color.intercom_container_border
            r0 = r18
            int r18 = androidx.core.content.C1335a.m36324d(r6, r0)
            android.graphics.drawable.ColorDrawable r21 = new android.graphics.drawable.ColorDrawable
            r0 = r21
            r1 = r18
            r0.<init>(r1)
            r0 = r19
            r1 = r21
            r0.setDividerDrawable(r1)
            r10 = 1
            r0 = r19
            r0.setOrientation(r10)
            r0 = r28
            java.util.List r22 = r0.getLinks()
            r0 = r22
            java.util.Iterator r23 = r0.iterator()
        L78:
            r0 = r23
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L9a
            r0 = r23
            java.lang.Object r14 = r0.next()
            r25 = r14
            io.intercom.android.sdk.blocks.models.Link r25 = (io.intercom.android.sdk.blocks.models.Link) r25
            r24 = r25
            r10 = 0
            r0 = r27
            r1 = r19
            r2 = r24
            r3 = r8
            r4 = r6
            r5 = r10
            r0.addLinkToLayout(r1, r2, r3, r4, r5)
            goto L78
        L9a:
            r0 = r28
            io.intercom.android.sdk.blocks.models.Link r24 = r0.getFooterLink()
            r0 = r24
            java.lang.String r26 = r0.getText()
            r0 = r26
            boolean r29 = r0.isEmpty()
            if (r29 != 0) goto Lbb
            r10 = 1
            r0 = r27
            r1 = r19
            r2 = r24
            r3 = r8
            r4 = r6
            r5 = r10
            r0.addLinkToLayout(r1, r2, r3, r4, r5)
        Lbb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.LinkListRenderer.addLinkListBlock(io.intercom.android.sdk.blocks.models.LinkList, boolean, boolean, android.view.ViewGroup):android.view.View");
    }
}
