package io.intercom.android.sdk.blocks;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.blockInterfaces.AttachmentListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.ButtonBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.CodeBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.FacebookBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.HeadingBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.ImageBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LightWeightReplyBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LinkBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LinkListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LocalAttachmentBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.LocalImageBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.MessengerCardBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.NotificationChannelsCardBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.OrderedListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.ParagraphBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.SubheadingBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.TwitterBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.UnorderedListBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.VideoBlock;
import io.intercom.android.sdk.blocks.blockInterfaces.VideoFileBlock;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.blocks.models.BlockAttachment;
import io.intercom.android.sdk.blocks.models.ConversationRating;
import io.intercom.android.sdk.blocks.models.Link;
import io.intercom.android.sdk.blocks.models.LinkList;
import io.intercom.android.sdk.blocks.models.NotificationChannelsCard;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import java.util.List;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class BlockType {
    private static final /* synthetic */ BlockType[] $VALUES;
    public static final BlockType UNKNOWN;
    private final String serializedName;
    public static final BlockType PARAGRAPH = new BlockType("PARAGRAPH", 0, "paragraph") { // from class: io.intercom.android.sdk.blocks.BlockType.1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            ParagraphBlock $r4 = blocksViewHolder.getParagraph();
            String $r5 = block.getText();
            Spanned $r6 = HtmlCompat.fromHtml($r5);
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addParagraph($r6, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType HEADING = new BlockType("HEADING", 1, "heading") { // from class: io.intercom.android.sdk.blocks.BlockType.2
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            HeadingBlock $r4 = blocksViewHolder.getHeading();
            String $r5 = block.getText();
            Spanned $r6 = HtmlCompat.fromHtml($r5);
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addHeading($r6, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType SUBHEADING = new BlockType("SUBHEADING", 2, "subheading") { // from class: io.intercom.android.sdk.blocks.BlockType.3
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            SubheadingBlock $r4 = blocksViewHolder.getSubheading();
            String $r5 = block.getText();
            Spanned $r6 = HtmlCompat.fromHtml($r5);
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addSubheading($r6, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType CODE = new BlockType("CODE", 3, "code") { // from class: io.intercom.android.sdk.blocks.BlockType.4
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            CodeBlock $r4 = blocksViewHolder.getCode();
            String $r5 = block.getText();
            Spanned $r6 = HtmlCompat.fromHtml($r5);
            View $r7 = $r4.addCode($r6, z, z2, viewGroup);
            return $r7;
        }
    };
    public static final BlockType LINK = new BlockType("LINK", 4, "link") { // from class: io.intercom.android.sdk.blocks.BlockType.5
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            LinkBlock $r4 = blocksViewHolder.getLink();
            Link $r5 = Link.fromBlock(block);
            View $r6 = $r4.addLinkBlock($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType CONVERSATIONRATING = new BlockType("CONVERSATIONRATING", 5, "conversationRating") { // from class: io.intercom.android.sdk.blocks.BlockType.6
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            ConversationRatingBlock $r4 = blocksViewHolder.getConversationRating();
            ConversationRating $r5 = ConversationRating.fromBlock(block);
            View $r6 = $r4.addConversationRatingBlock($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType NOTIFICATIONCHANNELSCARD = new BlockType("NOTIFICATIONCHANNELSCARD", 6, "notificationChannelCard") { // from class: io.intercom.android.sdk.blocks.BlockType.7
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            NotificationChannelsCardBlock $r4 = blocksViewHolder.getNotificationChannelsCard();
            NotificationChannelsCard $r5 = NotificationChannelsCard.fromBlock(block);
            View $r6 = $r4.addNotificationChannelsCardBlock($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType LINKLIST = new BlockType("LINKLIST", 7, "linkList") { // from class: io.intercom.android.sdk.blocks.BlockType.8
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            LinkListBlock $r4 = blocksViewHolder.getLinkList();
            LinkList $r5 = LinkList.fromBlock(block);
            View $r6 = $r4.addLinkListBlock($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType UNORDEREDLIST = new BlockType("UNORDEREDLIST", 8, "unorderedList") { // from class: io.intercom.android.sdk.blocks.BlockType.9
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            UnorderedListBlock $r4 = blocksViewHolder.getUnorderedList();
            List $r5 = block.getItems();
            View $r6 = $r4.addUnorderedList($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType ORDEREDLIST = new BlockType("ORDEREDLIST", 9, "orderedList") { // from class: io.intercom.android.sdk.blocks.BlockType.10
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            OrderedListBlock $r4 = blocksViewHolder.getOrderedList();
            List $r5 = block.getItems();
            View $r6 = $r4.addOrderedList($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType ATTACHMENTLIST = new BlockType("ATTACHMENTLIST", 10, "attachmentList") { // from class: io.intercom.android.sdk.blocks.BlockType.11
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            AttachmentListBlock $r4 = blocksViewHolder.getAttachmentList();
            List $r5 = block.getAttachments();
            View $r6 = $r4.addAttachmentList($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType IMAGE = new BlockType("IMAGE", 11, "image") { // from class: io.intercom.android.sdk.blocks.BlockType.12
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            ImageBlock $r4 = blocksViewHolder.getImage();
            String $r5 = block.getUrl();
            String $r6 = BlockType.getUrl(block);
            int $i0 = block.getWidth();
            int $i1 = block.getHeight();
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addImage($r5, $r6, $i0, $i1, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType TEXT = new BlockType("LWR", 12, "lwr") { // from class: io.intercom.android.sdk.blocks.BlockType.13
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            LightWeightReplyBlock $r4 = blocksViewHolder.getLwr();
            String $r5 = block.getText();
            View $r6 = $r4.addLWR($r5, z, z2, viewGroup);
            return $r6;
        }
    };
    public static final BlockType BUTTON = new BlockType("BUTTON", 13, "button") { // from class: io.intercom.android.sdk.blocks.BlockType.14
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            ButtonBlock $r4 = blocksViewHolder.getButton();
            String $r5 = block.getText();
            String $r6 = BlockType.getUrl(block);
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addButton($r5, $r6, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType FACEBOOKLIKEBUTTON = new BlockType("FACEBOOKLIKEBUTTON", 14, "facebookLikeButton") { // from class: io.intercom.android.sdk.blocks.BlockType.15
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            FacebookBlock $r4 = blocksViewHolder.getFacebookButton();
            String $r5 = block.getUrl();
            BlockAlignment $r6 = block.getAlign();
            View $r7 = $r4.addFacebookButton($r5, $r6, z, z2, viewGroup);
            return $r7;
        }
    };
    public static final BlockType TWITTERFOLLOWBUTTON = new BlockType("TWITTERFOLLOWBUTTON", 15, "twitterFollowButton") { // from class: io.intercom.android.sdk.blocks.BlockType.16
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            TwitterBlock $r4 = blocksViewHolder.getTwitterButton();
            StringBuilder $r5 = new StringBuilder();
            $r5.append("https://twitter.com/");
            String $r6 = block.getUsername();
            $r5.append($r6);
            String $r62 = $r5.toString();
            BlockAlignment $r7 = block.getAlign();
            View $r8 = $r4.addTwitterButton($r62, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType VIDEO = new BlockType("VIDEO", 16, "video") { // from class: io.intercom.android.sdk.blocks.BlockType.17
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            VideoBlock $r4 = blocksViewHolder.getVideo();
            String $r5 = block.getText();
            String $r6 = block.getProvider();
            VideoProvider $r7 = VideoProvider.videoValueOf($r6);
            String $r62 = block.getId();
            View $r8 = $r4.addVideo($r5, $r7, $r62, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType VIDEOFILE = new BlockType("VIDEOFILE", 17, "videoFile") { // from class: io.intercom.android.sdk.blocks.BlockType.18
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            VideoFileBlock $r4 = blocksViewHolder.getVideoFile();
            String $r5 = block.getText();
            String $r6 = block.getUrl();
            String $r7 = block.getThumbnailUrl();
            View $r8 = $r4.addVideoFile($r5, $r6, $r7, z, z2, viewGroup);
            return $r8;
        }
    };
    public static final BlockType MESSENGERCARD = new BlockType("MESSENGERCARD", 18, "messengerCard") { // from class: io.intercom.android.sdk.blocks.BlockType.19
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            MessengerCardBlock $r4 = blocksViewHolder.getMessengerCardBlock();
            String $r5 = block.getText();
            String $r6 = block.getFallbackUrl();
            View $r7 = $r4.addCard($r5, $r6, z, z2, viewGroup);
            return $r7;
        }
    };
    public static final BlockType LOCALIMAGE = new BlockType("LOCALIMAGE", 19, "localImage") { // from class: io.intercom.android.sdk.blocks.BlockType.20
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            LocalImageBlock $r4 = blocksViewHolder.getLocalImage();
            String $r5 = block.getUrl();
            int $i0 = block.getWidth();
            int $i1 = block.getHeight();
            BlockAlignment $r6 = block.getAlign();
            View $r7 = $r4.addImage($r5, $i0, $i1, $r6, z, z2, viewGroup);
            return $r7;
        }
    };
    public static final BlockType LOCAL_ATTACHMENT = new BlockType("LOCAL_ATTACHMENT", 20, "local_attachment") { // from class: io.intercom.android.sdk.blocks.BlockType.21
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // io.intercom.android.sdk.blocks.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
            LocalAttachmentBlock $r4 = blocksViewHolder.getLocalAttachment();
            List $r5 = block.getAttachments();
            Object $r6 = $r5.get(0);
            BlockAttachment $r7 = (BlockAttachment) $r6;
            View $r8 = $r4.addAttachment($r7, z, z2, viewGroup);
            return $r8;
        }
    };

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        BlockType blockType = new BlockType("UNKNOWN", 21, "unknown") { // from class: io.intercom.android.sdk.blocks.BlockType.22
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // io.intercom.android.sdk.blocks.BlockType
            public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) {
                String $r5 = block.getText();
                boolean $z2 = $r5.isEmpty();
                if (!$z2) {
                    ParagraphBlock $r6 = blocksViewHolder.getParagraph();
                    if ($r6 != null) {
                        BlockType $r3 = BlockType.PARAGRAPH;
                        View $r7 = $r3.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, z, z2);
                        return $r7;
                    }
                }
                BlockTypeNotImplementedException $r8 = new BlockTypeNotImplementedException();
                throw $r8;
            }
        };
        UNKNOWN = blockType;
        BlockType $r23 = PARAGRAPH;
        BlockType $r232 = HEADING;
        BlockType $r233 = SUBHEADING;
        BlockType $r234 = CODE;
        BlockType $r235 = LINK;
        BlockType $r236 = CONVERSATIONRATING;
        BlockType $r237 = NOTIFICATIONCHANNELSCARD;
        BlockType $r238 = LINKLIST;
        BlockType $r239 = UNORDEREDLIST;
        BlockType $r2310 = ORDEREDLIST;
        BlockType $r2311 = ATTACHMENTLIST;
        BlockType $r2312 = IMAGE;
        BlockType $r2313 = TEXT;
        BlockType $r2314 = BUTTON;
        BlockType $r2315 = FACEBOOKLIKEBUTTON;
        BlockType $r2316 = TWITTERFOLLOWBUTTON;
        BlockType $r2317 = VIDEO;
        BlockType $r2318 = VIDEOFILE;
        BlockType $r2319 = MESSENGERCARD;
        BlockType $r2320 = LOCALIMAGE;
        BlockType $r2321 = LOCAL_ATTACHMENT;
        BlockType[] $r22 = {$r23, $r232, $r233, $r234, $r235, $r236, $r237, $r238, $r239, $r2310, $r2311, $r2312, $r2313, $r2314, $r2315, $r2316, $r2317, $r2318, $r2319, $r2320, $r2321, blockType};
        $VALUES = $r22;
    }

    private BlockType(String str, int i, String str2) {
        this.serializedName = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected static String getUrl(Block block) {
        String $r1 = block.getTrackingUrl();
        boolean $z0 = $r1.isEmpty();
        if ($z0) {
            String $r12 = block.getLinkUrl();
            return $r12;
        }
        String $r13 = block.getTrackingUrl();
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static BlockType typeValueOf(String str) {
        BlockType $r4 = UNKNOWN;
        Locale $r0 = Locale.ENGLISH;
        try {
            String $r3 = str.toUpperCase($r0);
            return valueOf($r3);
        } catch (IllegalArgumentException e) {
            return $r4;
        } catch (NullPointerException e2) {
            return $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static BlockType valueOf(String str) {
        Enum $r0 = Enum.valueOf(BlockType.class, str);
        BlockType $r2 = (BlockType) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static BlockType[] values() {
        BlockType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        BlockType[] $r12 = (BlockType[]) $r0;
        return $r12;
    }

    abstract View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSerializedName() {
        String r1 = this.serializedName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public View getView(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, boolean z, boolean z2) throws BlockTypeNotImplementedException {
        try {
            View $r7 = generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, z, z2);
            return $r7;
        } catch (NullPointerException e) {
            BlockType $r0 = UNKNOWN;
            try {
                View $r72 = $r0.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, z, z2);
                return $r72;
            } catch (BlockTypeNotImplementedException e2) {
                BlockTypeNotImplementedException $r5 = new BlockTypeNotImplementedException();
                throw $r5;
            } catch (NullPointerException e3) {
                BlockTypeNotImplementedException $r52 = new BlockTypeNotImplementedException();
                throw $r52;
            }
        }
    }
}
