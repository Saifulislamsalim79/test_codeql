package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.messengercard.MessengerCard;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.google.gson.C10916e;
import java.util.List;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class ViewHolderGenerator {
    private final Activity activity;
    private final Provider<AppConfig> appConfigProvider;
    private final ButtonClickListener buttonClickListener;
    private final C11129b clazz;
    private final String conversationId;
    private final C10916e gson;
    private final ImageClickListener imageListener;
    private final FeedbackDialog languageIndex;
    private final MetricTracker metricTracker;
    private final C10486i requestManager;
    private final UploadingImageCache uploadingImageCache;

    public ViewHolderGenerator(UploadingImageCache uploadingImageCache, FeedbackDialog feedbackDialog, Provider provider, String str, ImageClickListener imageClickListener, ButtonClickListener buttonClickListener, C10486i c10486i, C10916e c10916e, C11129b c11129b, MetricTracker metricTracker, Activity activity) {
        this.uploadingImageCache = uploadingImageCache;
        this.languageIndex = feedbackDialog;
        this.appConfigProvider = provider;
        this.conversationId = str;
        this.imageListener = imageClickListener;
        this.buttonClickListener = buttonClickListener;
        this.requestManager = c10486i;
        this.gson = c10916e;
        this.clazz = c11129b;
        this.metricTracker = metricTracker;
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static LinearLayout createLayoutFromBlocks(BlocksViewHolder blocksViewHolder, List list, Context context) {
        Twig $r4 = LumberMill.getBlocksTwig();
        Blocks $r2 = new Blocks(context, $r4);
        LinearLayout $r5 = $r2.createBlocks(list, blocksViewHolder);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.widget.LinearLayout createPartsLayout(io.intercom.android.sdk.blocks.BlocksViewHolder r20, io.intercom.android.sdk.models.Part r21, android.content.Context r22) {
        /*
            r0 = r21
            java.util.List r3 = r0.getBlocks()
            r0 = r21
            java.util.List r4 = r0.getAttachments()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L68
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = r21
            java.util.List r4 = r0.getAttachments()
            java.util.Iterator r7 = r4.iterator()
        L21:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r8 = r7.next()
            r10 = r8
            io.intercom.android.sdk.models.Attachments r10 = (io.intercom.android.sdk.models.Attachments) r10
            r9 = r10
            io.intercom.android.sdk.blocks.models.BlockAttachment$Builder r11 = new io.intercom.android.sdk.blocks.models.BlockAttachment$Builder
            r11.<init>()
            java.lang.String r12 = r9.getName()
            io.intercom.android.sdk.blocks.models.BlockAttachment$Builder r11 = r11.withName(r12)
            java.lang.String r12 = r9.getUrl()
            io.intercom.android.sdk.blocks.models.BlockAttachment$Builder r11 = r11.withUrl(r12)
            io.intercom.android.sdk.blocks.models.BlockAttachment r13 = r11.build()
            r6.add(r13)
            goto L21
        L4c:
            io.intercom.android.sdk.blocks.models.Block$Builder r14 = new io.intercom.android.sdk.blocks.models.Block$Builder
            r14.<init>()
            io.intercom.android.sdk.blocks.BlockType r15 = io.intercom.android.sdk.blocks.BlockType.ATTACHMENTLIST
            java.lang.String r12 = r15.name()
            io.intercom.android.sdk.blocks.models.Block$Builder r14 = r14.withType(r12)
            io.intercom.android.sdk.blocks.models.Block$Builder r14 = r14.withAttachments(r6)
            io.intercom.android.sdk.blocks.models.Block r16 = r14.build()
            r0 = r16
            r3.add(r0)
        L68:
            io.intercom.android.sdk.blocks.Blocks r17 = new io.intercom.android.sdk.blocks.Blocks
            io.intercom.android.sdk.twig.Twig r18 = io.intercom.android.sdk.logger.LumberMill.getBlocksTwig()
            r0 = r17
            r1 = r22
            r2 = r18
            r0.<init>(r1, r2)
            r0 = r17
            r1 = r20
            android.widget.LinearLayout r19 = r0.createBlocks(r3, r1)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.ViewHolderGenerator.createPartsLayout(io.intercom.android.sdk.blocks.BlocksViewHolder, io.intercom.android.sdk.models.Part, android.content.Context):android.widget.LinearLayout");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private BlocksViewHolder generateHolder(int i, StyleType styleType) {
        BlocksViewHolder $r2 = new BlocksViewHolder();
        Provider $r6 = this.appConfigProvider;
        ButtonClickListener $r7 = this.buttonClickListener;
        Button $r5 = new Button(styleType, $r6, $r7);
        Provider $r62 = this.appConfigProvider;
        Heading $r8 = new Heading(styleType, $r62);
        Provider $r63 = this.appConfigProvider;
        ListBlock $r9 = new ListBlock(styleType, $r63);
        Provider $r64 = this.appConfigProvider;
        Attachment $r10 = new Attachment(styleType, $r64);
        $r2.setLayout(i);
        Provider $r65 = this.appConfigProvider;
        Paragraph $r11 = new Paragraph(styleType, $r65);
        $r2.setParagraph($r11);
        $r2.setHeading($r8);
        $r2.setSubheading($r8);
        Code $r12 = new Code();
        $r2.setCode($r12);
        $r2.setUnorderedList($r9);
        $r2.setOrderedList($r9);
        UploadingImageCache $r14 = this.uploadingImageCache;
        ImageClickListener $r15 = this.imageListener;
        C10486i $r16 = this.requestManager;
        NetworkImage $r13 = new NetworkImage(styleType, $r14, $r15, $r16);
        $r2.setImage($r13);
        C10486i $r162 = this.requestManager;
        LocalImage $r17 = new LocalImage(styleType, $r162);
        $r2.setLocalImage($r17);
        $r2.setButton($r5);
        $r2.setAttachmentList($r10);
        $r2.setLocalAttachment($r10);
        $r2.setTwitterButton($r5);
        $r2.setFacebookButton($r5);
        FeedbackDialog $r19 = this.languageIndex;
        Provider $r66 = this.appConfigProvider;
        C10486i $r163 = this.requestManager;
        Video $r18 = new Video(styleType, $r19, $r66, $r163);
        $r2.setVideo($r18);
        Provider $r67 = this.appConfigProvider;
        C10486i $r164 = this.requestManager;
        MetricTracker $r21 = this.metricTracker;
        VideoFile $r20 = new VideoFile(styleType, $r67, $r164, $r21);
        $r2.setVideoFile($r20);
        Provider $r68 = this.appConfigProvider;
        String $r3 = this.conversationId;
        C10486i $r165 = this.requestManager;
        LinkCard $r22 = new LinkCard(styleType, $r68, $r3, $r165);
        $r2.setLink($r22);
        FeedbackDialog $r192 = this.languageIndex;
        String $r32 = this.conversationId;
        Provider $r69 = this.appConfigProvider;
        C10486i $r166 = this.requestManager;
        ConversationRatingCard $r23 = new ConversationRatingCard($r192, $r32, $r69, $r166);
        $r2.setConversationRating($r23);
        FeedbackDialog $r193 = this.languageIndex;
        Provider $r610 = this.appConfigProvider;
        String $r33 = this.conversationId;
        LinkListRenderer $r24 = new LinkListRenderer($r193, $r610, $r33);
        $r2.setLinkList($r24);
        StyleType $r25 = StyleType.CHAT_FULL;
        boolean $z0 = styleType.equals($r25);
        if (!$z0) {
            Provider $r611 = this.appConfigProvider;
            C10916e $r27 = this.gson;
            C11129b $r28 = this.clazz;
            MetricTracker $r212 = this.metricTracker;
            String $r34 = this.conversationId;
            Activity $r4 = this.activity;
            MessengerCard $r26 = new MessengerCard($r611, $r27, $r28, $r212, $r34, styleType, $r4);
            $r2.setMessengerCardBlock($r26);
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getAdminHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_admin_layout;
        StyleType $r1 = StyleType.ADMIN;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getArticleHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_article_layout;
        StyleType $r1 = StyleType.ARTICLE;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getChatFullHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_admin_layout;
        StyleType $r1 = StyleType.CHAT_FULL;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getContainerCardHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_container_card_layout;
        StyleType $r1 = StyleType.CONTAINER_CARD;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getConversationRatingHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_container_layout;
        StyleType $r1 = StyleType.CHAT_FULL;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getLinkHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_container_layout;
        StyleType $r1 = StyleType.CHAT_FULL;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getLinkListHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_container_card_layout;
        StyleType $r1 = StyleType.CHAT_FULL;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getNoteHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_note_layout;
        StyleType $r1 = StyleType.NOTE;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getPostHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_container_layout;
        StyleType $r1 = StyleType.POST;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getPreviewHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_user_layout;
        StyleType $r1 = StyleType.PREVIEW;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BlocksViewHolder getUserHolder() {
        int $i0 = C10110R.C10113layout.intercom_blocks_user_layout;
        StyleType $r1 = StyleType.USER;
        BlocksViewHolder $r2 = generateHolder($i0, $r1);
        return $r2;
    }
}
