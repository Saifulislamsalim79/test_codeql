package io.intercom.android.sdk.conversation;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.recyclerview.widget.AbstractC1752y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.Blocks;
import io.intercom.android.sdk.blocks.BlocksViewHolder;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.function.TimestampAdder;
import io.intercom.android.sdk.blocks.models.Author;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.blocks.models.BlockAttachment;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.IntercomLinkPresenter;
import io.intercom.android.sdk.conversation.attribute.AttributeAnimateEndListener;
import io.intercom.android.sdk.conversation.events.AdminIsTypingEvent;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Suggestion;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.models.events.ConversationEvent;
import io.intercom.android.sdk.models.events.FormSubmitSuccessEvent;
import io.intercom.android.sdk.models.events.NewConversationEvent;
import io.intercom.android.sdk.models.events.NewTriggerConversationEvent;
import io.intercom.android.sdk.models.events.ReplyEvent;
import io.intercom.android.sdk.models.events.UploadEvent;
import io.intercom.android.sdk.models.events.failure.FormSubmitFailedEvent;
import io.intercom.android.sdk.models.events.failure.NewConversationFailedEvent;
import io.intercom.android.sdk.models.events.failure.ReplyFailedEvent;
import io.intercom.android.sdk.models.events.failure.UploadFailedEvent;
import io.intercom.android.sdk.models.events.realtime.UserContentSeenByAdminEvent;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusEvent;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.KeyboardUtils;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.android.sdk.views.AdminIsTypingView;
import io.intercom.android.sdk.views.AttributeCollectorCardView;
import io.intercom.android.sdk.views.BaseAttributeView;
import io.intercom.android.sdk.views.IntercomLinkView;
import io.intercom.android.sdk.views.decoration.ConversationItemDecoration;
import io.intercom.android.sdk.views.holder.QuickReplyClickListener;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.google.gson.C10916e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p201g.p218e.C7521a;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ConversationContentPresenter implements IntercomLinkPresenter.IntercomLinkHost, QuickReplyClickListener, SuggestionsClickListener {
    private static final String IMAGE_MIME_TYPE = "image";
    private static final long PART_DISPLAY_DELIVERED_TIMEOUT;
    private final ConversationPartAdapter adapter;
    private final FeedbackDialog bitmapCache;
    private final Blocks blocks;
    private final BlocksViewHolder blocksAdminViewHolder;
    private final BlocksViewHolder blocksAnnouncementViewHolder;
    private final BlocksViewHolder blocksConversationRatingViewHolder;
    private final BlocksViewHolder blocksLinkListHolder;
    private final BlocksViewHolder blocksLinkViewHolder;
    private final BlocksViewHolder blocksPreviewViewHolder;
    private final BlocksViewHolder blocksUserViewHolder;
    private final C11129b callbackHandler;
    private final Context context;
    private String conversationId;
    private final RecyclerView conversationList;
    private final Host host;
    private final IntercomLinkPresenter intercomLinkPresenter;
    private final Map<String, AdminIsTypingView> isTypingViews;
    private final LinearLayoutManager layoutManager;
    private final Part loadingPart;
    private final MetricTracker metricTracker;
    private final NexusClient nexusClient;
    private final OpsMetricTracker opsMetricTracker;
    private final List<Part> parts;
    private Runnable replyDeliveredUpdater;
    final List<Part> sendingParts;
    private final SoundPlayer soundPlayer;
    private final Store<State> store;
    private final TimestampAdder timestampAdder;
    private final UploadingImageCache uploadingImageCache;
    private final UserIdentity userIdentity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Host {
        Conversation getConversation();

        String getConversationId();

        void onConversationCreated(Conversation conversation);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        TimeUnit $r0 = TimeUnit.MINUTES;
        long $l0 = $r0.toMillis(1L);
        PART_DISPLAY_DELIVERED_TIMEOUT = $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    ConversationContentPresenter(Host host, RecyclerView recyclerView, ConversationPartAdapter conversationPartAdapter, LinearLayoutManager linearLayoutManager, IntercomLinkPresenter intercomLinkPresenter, List list, SoundPlayer soundPlayer, Blocks blocks, ViewHolderGenerator viewHolderGenerator, UserIdentity userIdentity, FeedbackDialog feedbackDialog, OpsMetricTracker opsMetricTracker, UploadingImageCache uploadingImageCache, Context context, String str, MetricTracker metricTracker, C11129b c11129b, Store store, NexusClient nexusClient) {
        Part.Builder r26 = new Part.Builder();
        Part.Builder $r20 = r26.withStyle(Part.LOADING_LAYOUT);
        Part $r21 = $r20.build();
        this.loadingPart = $r21;
        TimestampAdder $r22 = TimestampAdder.create();
        this.timestampAdder = $r22;
        ArrayList r27 = new ArrayList();
        this.sendingParts = r27;
        Map r28 = new C7521a();
        Map r29 = r28;
        this.isTypingViews = r29;
        this.host = host;
        this.conversationList = recyclerView;
        this.adapter = conversationPartAdapter;
        this.layoutManager = linearLayoutManager;
        this.intercomLinkPresenter = intercomLinkPresenter;
        this.parts = list;
        this.soundPlayer = soundPlayer;
        this.blocks = blocks;
        this.userIdentity = userIdentity;
        this.bitmapCache = feedbackDialog;
        this.opsMetricTracker = opsMetricTracker;
        this.uploadingImageCache = uploadingImageCache;
        this.context = context;
        this.conversationId = str;
        this.metricTracker = metricTracker;
        this.callbackHandler = c11129b;
        this.store = store;
        this.nexusClient = nexusClient;
        BlocksViewHolder $r25 = viewHolderGenerator.getUserHolder();
        this.blocksUserViewHolder = $r25;
        BlocksViewHolder $r252 = viewHolderGenerator.getContainerCardHolder();
        this.blocksAnnouncementViewHolder = $r252;
        BlocksViewHolder $r253 = viewHolderGenerator.getAdminHolder();
        this.blocksAdminViewHolder = $r253;
        BlocksViewHolder $r254 = viewHolderGenerator.getLinkHolder();
        this.blocksLinkViewHolder = $r254;
        BlocksViewHolder $r255 = viewHolderGenerator.getConversationRatingHolder();
        this.blocksConversationRatingViewHolder = $r255;
        BlocksViewHolder $r256 = viewHolderGenerator.getPreviewHolder();
        this.blocksPreviewViewHolder = $r256;
        BlocksViewHolder $r257 = viewHolderGenerator.getLinkListHolder();
        this.blocksLinkListHolder = $r257;
        conversationPartAdapter.setQuickReplyClickListener(this);
        conversationPartAdapter.setSuggesstionsClickListener(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Part addSendingPart(List list) {
        Part $r2 = createSendingPart(list);
        List $r1 = this.sendingParts;
        $r1.add($r2);
        displaySendingPart($r2);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConversationContentPresenter create(Host host, RecyclerView recyclerView, ConversationPartAdapter conversationPartAdapter, IntercomLinkView intercomLinkView, Provider provider, FeedbackDialog feedbackDialog, List list, String str, SoundPlayer soundPlayer, Blocks blocks, UserIdentity userIdentity, OpsMetricTracker opsMetricTracker, C10486i c10486i, Activity activity, Store store, NexusClient nexusClient) {
        Injector $r16 = Injector.get();
        RecyclerView r39 = recyclerView;
        Context $r18 = r39.getContext();
        LinearLayoutManager r32 = new LinearLayoutManager($r18);
        AppIdentity $r20 = $r16.getAppIdentity();
        String $r21 = $r20.appId();
        UserIdentity $r22 = $r16.getUserIdentity();
        String $r23 = $r22.getIntercomId();
        IntercomLinkPresenter r33 = new IntercomLinkPresenter(intercomLinkView, provider, feedbackDialog, str, $r21, $r23, false);
        UploadingImageCache r34 = new UploadingImageCache();
        LightboxOpeningImageClickListener r35 = new LightboxOpeningImageClickListener(feedbackDialog);
        LinkOpeningButtonClickListener r36 = new LinkOpeningButtonClickListener(feedbackDialog);
        C10916e $r28 = $r16.getGson();
        C11129b $r29 = $r16.getBus();
        MetricTracker $r30 = $r16.getMetricTracker();
        ViewHolderGenerator r37 = new ViewHolderGenerator(r34, feedbackDialog, provider, str, r35, r36, c10486i, $r28, $r29, $r30, activity);
        MetricTracker $r302 = $r16.getMetricTracker();
        C11129b $r292 = $r16.getBus();
        ConversationContentPresenter r38 = new ConversationContentPresenter(host, recyclerView, conversationPartAdapter, r32, r33, list, soundPlayer, blocks, r37, userIdentity, feedbackDialog, opsMetricTracker, r34, activity, str, $r302, $r292, store, nexusClient);
        return r38;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private List createBlocksForUpload(UploadEvent uploadEvent, Block block) {
        Upload $r3 = uploadEvent.getUpload();
        String $r4 = $r3.getContentType();
        boolean $z0 = $r4.contains(IMAGE_MIME_TYPE);
        if ($z0) {
            Block.Builder $r5 = block.toBuilder();
            BlockType $r6 = BlockType.IMAGE;
            String $r42 = $r6.getSerializedName();
            Block.Builder $r52 = $r5.withType($r42);
            Upload $r32 = uploadEvent.getUpload();
            String $r43 = $r32.getPublicUrl();
            return Collections.singletonList($r52.withUrl($r43));
        }
        List $r7 = block.getAttachments();
        boolean $z02 = $r7.isEmpty();
        if ($z02) {
            return Collections.emptyList();
        }
        Object $r8 = $r7.get(0);
        BlockAttachment $r9 = (BlockAttachment) $r8;
        BlockAttachment.Builder $r10 = $r9.toBuilder();
        long $l0 = uploadEvent.getSize();
        BlockAttachment.Builder $r102 = $r10.withSize($l0);
        Upload $r33 = uploadEvent.getUpload();
        int $i1 = $r33.getId();
        BlockAttachment $r92 = $r102.withId($i1).build();
        Block.Builder $r53 = block.toBuilder();
        Block.Builder $r54 = $r53.withAttachments(Collections.singletonList($r92));
        BlockType $r62 = BlockType.ATTACHMENTLIST;
        String $r44 = $r62.getSerializedName();
        return Collections.singletonList($r54.withType($r44));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Part createComposerSuggestionsPart(ComposerSuggestions composerSuggestions) {
        Part.Builder $r2 = new Part.Builder();
        TimeUnit $r3 = TimeUnit.MILLISECONDS;
        TimeProvider $r4 = TimeProvider.SYSTEM;
        long $l0 = $r4.currentTimeMillis();
        Part $r5 = $r2.withCreatedAt($r3.toSeconds($l0)).withStyle(Part.COMPOSER_SUGGESTIONS_STYLE).build();
        $r5.setComposerSuggestions(composerSuggestions);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Part createSendingPart(List list) {
        Part.Builder $r2 = new Part.Builder();
        TimeUnit $r3 = TimeUnit.MILLISECONDS;
        TimeProvider $r4 = TimeProvider.SYSTEM;
        long $l0 = $r4.currentTimeMillis();
        Part $r5 = $r2.withCreatedAt($r3.toSeconds($l0)).withStyle(Part.CHAT_MESSAGE_STYLE).withBlocks(list).build();
        Part.MessageState $r6 = Part.MessageState.SENDING;
        $r5.setMessageState($r6);
        Participant $r7 = getUserParticipant();
        $r5.setParticipant($r7);
        $r5.setEntranceAnimation(true);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void displaySendingPart(Part part) {
        SoundPlayer $r3 = this.soundPlayer;
        $r3.playReplySentSound();
        List $r4 = this.parts;
        $r4.add(part);
        ConversationPartAdapter $r5 = this.adapter;
        Blocks $r6 = this.blocks;
        List $r42 = part.getBlocks();
        BlocksViewHolder $r1 = this.blocksPreviewViewHolder;
        LinearLayout $r7 = $r6.createBlocks($r42, $r1);
        $r5.setViewForPart(part, $r7);
        ConversationPartAdapter $r52 = this.adapter;
        $r52.notifyDataSetChanged();
        smoothScrollToBottom();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void hideLoadingIndicator() {
        List $r1 = this.parts;
        Part $r2 = this.loadingPart;
        int $i0 = $r1.indexOf($r2);
        if ($i0 >= 0) {
            List $r12 = this.parts;
            $r12.remove($i0);
            ConversationPartAdapter $r3 = this.adapter;
            $r3.notifyItemRemoved($i0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void markAsFailed(int i, String str, boolean z) {
        int $i0 = positionOfPart(i, str);
        if ($i0 >= 0) {
            List $r2 = this.parts;
            Object $r3 = $r2.get($i0);
            Part $r4 = (Part) $r3;
            ConversationPartAdapter $r5 = this.adapter;
            ViewGroup $r6 = $r5.getViewForPart($r4);
            View $r7 = $r6.getChildAt(0);
            boolean $z1 = $r7 instanceof UploadProgressListener;
            if ($z1) {
                UploadProgressListener $r8 = (UploadProgressListener) $r7;
                $r8.uploadStopped();
            }
            Part.MessageState $r9 = z ? Part.MessageState.UPLOAD_FAILED : Part.MessageState.FAILED;
            $r4.setMessageState($r9);
            ConversationPartAdapter $r52 = this.adapter;
            $r52.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int positionOfPart(int i, String str) {
        if (i >= 0) {
            List $r2 = this.parts;
            int $i1 = $r2.size();
            if (i < $i1) {
                List $r22 = this.parts;
                Object $r3 = $r22.get(i);
                Part $r4 = (Part) $r3;
                String $r5 = $r4.getId();
                boolean $z0 = $r5.equals(str);
                if ($z0) {
                    return i;
                }
                int $i0 = positionOfPartById(str);
                return $i0;
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int positionOfPartById(String str) {
        List $r2 = this.parts;
        int $i0 = $r2.size();
        for (int $i02 = $i0 - 1; $i02 >= 0; $i02--) {
            List $r22 = this.parts;
            Object $r3 = $r22.get($i02);
            Part $r4 = (Part) $r3;
            String $r5 = $r4.getId();
            boolean $z0 = $r5.equals(str);
            if ($z0) {
                return $i02;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void removeSendingPartsIfNeeded() {
        /*
            r7 = this;
            java.util.List<io.intercom.android.sdk.models.Part> r0 = r7.sendingParts
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r3 = r1.next()
            r5 = r3
            io.intercom.android.sdk.models.Part r5 = (io.intercom.android.sdk.models.Part) r5
            r4 = r5
            com.intercom.input.gallery.GalleryImage r6 = r4.getUpload()
            if (r6 != 0) goto L1e
            r1.remove()
            goto L6
        L1e:
            java.util.List<io.intercom.android.sdk.models.Part> r0 = r7.parts
            r0.add(r4)
            goto L6
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ConversationContentPresenter.removeSendingPartsIfNeeded():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void retryFailedUpload(Part part) {
        UploadProgressListener uploadProgressListener;
        int $i0 = this.parts.size();
        String $r5 = part.getId();
        int $i02 = positionOfPart($i0 - 1, $r5);
        if ($i02 >= 0) {
            ConversationPartAdapter $r6 = this.adapter;
            Object $r7 = this.parts.get($i02);
            Part $r8 = (Part) $r7;
            ViewGroup $r9 = $r6.getViewForPart($r8);
            View $r10 = $r9.getChildAt(0);
            uploadProgressListener = (UploadProgressListener) $r10;
            uploadProgressListener.uploadStarted();
        } else {
            uploadProgressListener = r18;
            UploadProgressListener uploadProgressListener2 = new UploadProgressListener() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.4
                @Override // io.intercom.android.sdk.conversation.UploadProgressListener
                public void uploadNotice(byte b) {
                }

                @Override // io.intercom.android.sdk.conversation.UploadProgressListener
                public void uploadStarted() {
                }

                @Override // io.intercom.android.sdk.conversation.UploadProgressListener
                public void uploadStopped() {
                }
            };
        }
        Part.MessageState $r12 = Part.MessageState.SENDING;
        part.setMessageState($r12);
        List $r4 = this.parts;
        int $i1 = $r4.indexOf(part);
        $r4.remove($i1);
        this.parts.add(part);
        ConversationPartAdapter $r62 = this.adapter;
        $r62.notifyDataSetChanged();
        FeedbackDialog $r2 = this.bitmapCache;
        GalleryImage $r13 = part.getUpload();
        String $r52 = part.getId();
        UploadingImageCache $r3 = this.uploadingImageCache;
        $r2.uploadFile($r13, $i02, $r52, $r3, uploadProgressListener);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void showLoadingIndicator() {
        List $r2 = this.parts;
        Part $r1 = this.loadingPart;
        $r2.add(0, $r1);
        ConversationPartAdapter $r3 = this.adapter;
        $r3.notifyItemInserted(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void showRetryDialog(final Part part) {
        ViewGroup $r4 = this.conversationList;
        ViewGroup r8 = $r4;
        Context $r5 = r8.getContext();
        DialogInterfaceC0936d.C0937a r6 = new DialogInterfaceC0936d.C0937a($r5);
        int $i0 = C10110R.string.intercom_inbox_error_state_title;
        DialogInterfaceC0936d.C0937a $r3 = r6.setTitle($i0);
        int $i02 = C10110R.string.intercom_failed_delivery;
        DialogInterfaceC0936d.C0937a $r32 = $r3.setMessage($i02);
        int $i03 = C10110R.string.intercom_retry;
        $r32.setPositiveButton($i03, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ConversationContentPresenter $r2 = ConversationContentPresenter.this;
                Part $r33 = part;
                $r2.retryTapped($r33);
            }
        }).show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void smoothScrollToBottom() {
        RecyclerView $r1 = this.conversationList;
        ConversationPartAdapter $r2 = this.adapter;
        int $i0 = $r2.getCount();
        $r1.m35253u1($i0 - 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateSendPartOpsMetric() {
        OpsMetricTracker $r2 = this.opsMetricTracker;
        $r2.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.SEND_PART_TIME_TO_COMPLETE_REQUEST);
        OpsMetricTracker $r22 = this.opsMetricTracker;
        $r22.trackEvent(OpsMetricTracker.START, OpsMetricTracker.SEND_PART_TIME_TO_RENDER_RESULT);
        ViewGroup $r3 = this.conversationList;
        ViewGroup r6 = $r3;
        ViewTreeObserver $r1 = r6.getViewTreeObserver();
        $r1.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ConversationContentPresenter $r12 = ConversationContentPresenter.this;
                OpsMetricTracker $r23 = $r12.opsMetricTracker;
                $r23.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.SEND_PART_TIME_TO_RENDER_RESULT);
                ConversationContentPresenter $r13 = ConversationContentPresenter.this;
                View $r32 = $r13.conversationList;
                View r4 = $r32;
                ViewUtils.removeGlobalLayoutListener(r4, this);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.IntercomLinkPresenter.IntercomLinkHost
    public void addBottomPadding(int i) {
        ViewGroup $r1 = this.conversationList;
        ViewGroup r3 = $r1;
        int $i1 = r3.getPaddingLeft();
        ViewGroup $r2 = this.conversationList;
        ViewGroup r32 = $r2;
        int $i2 = r32.getPaddingTop();
        ViewGroup $r22 = this.conversationList;
        ViewGroup r33 = $r22;
        int $i3 = r33.getPaddingRight();
        ViewGroup $r23 = this.conversationList;
        ViewGroup r34 = $r23;
        int $i4 = r34.getPaddingBottom();
        int $i0 = $i4 + i;
        ViewGroup r35 = $r1;
        r35.setPadding($i1, $i2, $i3, $i0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addComposerSuggestionsPart(ComposerSuggestions composerSuggestions) {
        ComposerSuggestions $r2 = ComposerSuggestions.NULL;
        boolean $z0 = $r2.equals(composerSuggestions);
        if ($z0) {
            return;
        }
        Part $r3 = createComposerSuggestionsPart(composerSuggestions);
        List $r4 = this.parts;
        $r4.add(0, $r3);
        ConversationPartAdapter $r5 = this.adapter;
        $r5.notifyItemInserted(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:11:0x0042 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void addViewForPart(io.intercom.android.sdk.models.Part r27) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ConversationContentPresenter.addViewForPart(io.intercom.android.sdk.models.Part):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void cleanup() {
        ViewGroup $r1 = this.conversationList;
        Runnable $r2 = this.replyDeliveredUpdater;
        ViewGroup r3 = $r1;
        r3.removeCallbacks($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void fetchConversation(final String str) {
        boolean $z0 = str.isEmpty();
        if ($z0) {
            return;
        }
        OpsMetricTracker $r2 = this.opsMetricTracker;
        $r2.trackEvent(OpsMetricTracker.START, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_COMPLETE_REQUEST);
        this.conversationId = str;
        Executor $r3 = AsyncTask.THREAD_POOL_EXECUTOR;
        $r3.execute(new Runnable() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                ConversationContentPresenter $r32 = ConversationContentPresenter.this;
                FeedbackDialog $r22 = $r32.bitmapCache;
                String $r1 = str;
                $r22.getConversation($r1, null);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void formSubmitFailed(FormSubmitFailedEvent formSubmitFailedEvent) {
        String $r2 = formSubmitFailedEvent.getPartId();
        int $i0 = positionOfPartById($r2);
        if ($i0 < 0) {
            return;
        }
        ConversationPartAdapter $r3 = this.adapter;
        List $r4 = this.parts;
        Object $r5 = $r4.get($i0);
        Part $r6 = (Part) $r5;
        ViewGroup $r7 = $r3.getViewForPart($r6);
        if ($r7 == null || $r7.getChildCount() <= 0) {
            return;
        }
        int $i02 = $r7.getChildCount();
        for (int $i1 = 0; $i1 < $i02; $i1++) {
            View $r8 = $r7.getChildAt($i1);
            Context $r9 = this.context;
            Resources $r10 = $r9.getResources();
            int $i2 = C10110R.string.intercom_something_went_wrong_try_again;
            String $r22 = $r10.getString($i2);
            BaseAttributeView $r11 = (BaseAttributeView) $r8;
            Attribute $r12 = $r11.getAttribute();
            String $r13 = $r12.getIdentifier();
            String $r14 = formSubmitFailedEvent.getAttributeIdentifier();
            boolean $z0 = $r13.equals($r14);
            if ($z0) {
                $r11.displayEmptyState();
                $r11.displayErrorState($r22);
                return;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void formSubmitSuccess(FormSubmitSuccessEvent formSubmitSuccessEvent) {
        String $r2 = formSubmitSuccessEvent.getPartId();
        int $i0 = positionOfPartById($r2);
        if ($i0 < 0) {
            return;
        }
        ConversationPartAdapter $r3 = this.adapter;
        List $r4 = this.parts;
        Object $r5 = $r4.get($i0);
        Part $r6 = (Part) $r5;
        ViewGroup $r7 = $r3.getViewForPart($r6);
        if ($r7 == null || $r7.getParent() == null) {
            return;
        }
        ViewParent $r8 = $r7.getParent();
        boolean $z0 = $r8 instanceof AttributeCollectorCardView;
        if ($z0) {
            AttributeCollectorCardView $r9 = (AttributeCollectorCardView) $r8;
            boolean $z02 = $r9.isExpanded();
            if ($z02) {
                Conversation $r11 = formSubmitSuccessEvent.getConversation();
                C11129b $r12 = this.callbackHandler;
                AttributeAnimateEndListener r15 = new AttributeAnimateEndListener($r11, $r12);
                $r9.animateBack(r15);
                AttributeCollectorCardView r17 = $r9;
                KeyboardUtils.hideKeyboard(r17);
                return;
            }
            Conversation $r112 = formSubmitSuccessEvent.getConversation();
            ConversationEvent.Builder r16 = new ConversationEvent.Builder($r112);
            ConversationEvent.Builder $r13 = r16.isAttributeUpdated(true);
            ConversationEvent $r14 = $r13.build();
            C11129b $r122 = this.callbackHandler;
            $r122.post($r14);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    Participant getUserParticipant() {
        UserIdentity $r2 = this.userIdentity;
        String $r3 = $r2.getIntercomId();
        Host $r4 = this.host;
        Conversation $r5 = $r4.getConversation();
        Participant $r6 = $r5.getParticipant($r3);
        Participant $r1 = Participant.NULL;
        if ($r6 == $r1) {
            Participant.Builder $r7 = new Participant.Builder();
            Participant $r12 = $r7.withId($r3).build();
            return $r12;
        }
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.IntercomLinkPresenter.IntercomLinkHost
    public boolean isAtBottom() {
        ViewGroup $r1 = this.conversationList;
        ViewGroup r2 = $r1;
        boolean $z0 = r2.canScrollVertically(1);
        return !$z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void newConversationFailure(NewConversationFailedEvent newConversationFailedEvent) {
        int $i0 = newConversationFailedEvent.getPosition();
        String $r2 = newConversationFailedEvent.getPartId();
        markAsFailed($i0, $r2, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void newConversationSuccess(NewConversationEvent newConversationEvent) {
        boolean $z0 = this.parts.isEmpty();
        if ($z0) {
            return;
        }
        List $r2 = this.parts;
        int $i0 = $r2.size();
        Object $r3 = $r2.get($i0 - 1);
        Part $r4 = (Part) $r3;
        String $r5 = $r4.getId();
        String $r6 = newConversationEvent.getPartId();
        boolean $z02 = $r5.equals($r6);
        if ($z02) {
            onNewConversation(newConversationEvent);
            Host $r7 = this.host;
            Conversation $r8 = newConversationEvent.getConversation();
            $r7.onConversationCreated($r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void newTriggerConversationSuccess(NewTriggerConversationEvent newTriggerConversationEvent) {
        updateSendPartOpsMetric();
        Conversation $r2 = newTriggerConversationEvent.getConversation();
        String $r3 = $r2.getId();
        this.conversationId = $r3;
        List $r4 = this.parts;
        $r4.clear();
        List $r42 = this.sendingParts;
        $r42.clear();
        int $i0 = 0;
        while (true) {
            List $r43 = $r2.getParts();
            int $i1 = $r43.size();
            if ($i0 >= $i1) {
                ConversationPartAdapter $r8 = this.adapter;
                $r8.notifyDataSetChanged();
                IntercomLinkPresenter $r9 = this.intercomLinkPresenter;
                String $r32 = $r2.getIntercomLinkSolution();
                $r9.setSolution($r32);
                Host $r10 = this.host;
                $r10.onConversationCreated(newTriggerConversationEvent.getConversation());
                Store $r11 = this.store;
                String $r33 = this.conversationId;
                Action $r12 = Actions.conversationMarkedAsRead($r33);
                $r11.dispatch($r12);
                NexusClient $r13 = this.nexusClient;
                String $r34 = this.conversationId;
                UserIdentity $r14 = this.userIdentity;
                String $r15 = $r14.getIntercomId();
                NexusEvent $r16 = NexusEvent.getConversationSeenEvent($r34, $r15);
                $r13.fire($r16);
                return;
            }
            List $r44 = $r2.getParts();
            Object $r5 = $r44.get($i0);
            Part $r6 = (Part) $r5;
            addViewForPart($r6);
            List $r45 = this.parts;
            List $r7 = $r2.getParts();
            $r45.add($r7.get($i0));
            $i0++;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public synchronized void onAdminStartedTyping(AdminIsTypingEvent adminIsTypingEvent) {
        final String $r3 = adminIsTypingEvent.getAdminId();
        Map $r4 = this.isTypingViews;
        boolean $z0 = $r4.containsKey($r3);
        if ($z0) {
            Map $r42 = this.isTypingViews;
            Object $r5 = $r42.get($r3);
            AdminIsTypingView $r6 = (AdminIsTypingView) $r5;
            $r6.renewTypingAnimation();
            return;
        }
        Part.Builder r25 = new Part.Builder();
        Part.Builder $r7 = r25.withParticipantIsAdmin(true);
        final Part $r8 = $r7.withStyle(Part.ADMIN_IS_TYPING_STYLE).build();
        Host $r9 = this.host;
        Conversation $r10 = $r9.getConversation();
        Participant $r11 = $r10.getParticipant($r3);
        Participant $r12 = $r11;
        Participant $r13 = Participant.NULL;
        if ($r11 == $r13) {
            String $r14 = adminIsTypingEvent.getAdminName();
            String $r15 = adminIsTypingEvent.getAdminAvatarUrl();
            Avatar $r16 = Avatar.create($r15, "");
            Boolean $r1 = Boolean.FALSE;
            $r12 = Participant.create($r3, $r14, Participant.ADMIN_TYPE, "", $r16, $r1);
        }
        $r8.setParticipant($r12);
        $r8.setEntranceAnimation(true);
        boolean $z02 = isAtBottom();
        List $r17 = this.parts;
        $r17.add($r8);
        ViewGroup $r18 = this.conversationList;
        ViewGroup r28 = $r18;
        Context $r19 = r28.getContext();
        int $i0 = C10110R.C10113layout.intercom_blocks_admin_layout;
        View $r20 = View.inflate($r19, $i0, null);
        LinearLayout $r21 = (LinearLayout) $r20;
        AdminIsTypingView r26 = new AdminIsTypingView($r19);
        r26.setListener(new AdminIsTypingView.Listener() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.views.AdminIsTypingView.Listener
            public void onAdminTypingAnimationEnded(AdminIsTypingView adminIsTypingView) {
                ConversationContentPresenter $r43 = ConversationContentPresenter.this;
                String $r110 = $r3;
                Part $r52 = $r8;
                String $r2 = $r52.getId();
                $r43.onAdminStoppedTyping($r110, $r2);
            }
        });
        AdminIsTypingView $r202 = r26;
        $r21.addView($r202);
        Map $r43 = this.isTypingViews;
        $r43.put($r3, r26);
        ConversationPartAdapter $r23 = this.adapter;
        $r23.setViewForPart($r8, $r21);
        ConversationPartAdapter $r232 = this.adapter;
        $r232.notifyDataSetChanged();
        if ($z02) {
            smoothScrollToBottom();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void onAdminStoppedTyping(String str, String str2) {
        Map $r1 = this.isTypingViews;
        $r1.remove(str);
        List $r4 = this.parts;
        int $i0 = positionOfPart($r4.size() - 1, str2);
        if ($i0 >= 0) {
            List $r42 = this.parts;
            $r42.remove($i0);
            ConversationPartAdapter $r5 = this.adapter;
            $r5.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onConversationFetched(ConversationEvent conversationEvent, boolean z) {
        int $i0;
        OpsMetricTracker $r2 = this.opsMetricTracker;
        $r2.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_COMPLETE_REQUEST);
        OpsMetricTracker $r22 = this.opsMetricTracker;
        $r22.trackEvent(OpsMetricTracker.START, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_RENDER_RESULT);
        Conversation $r3 = conversationEvent.getResponse();
        List $r4 = this.parts;
        $r4.clear();
        if (z) {
            ViewGroup $r5 = this.conversationList;
            ViewGroup $r13 = $r5;
            Context $r6 = $r13.getContext();
            Animation $r7 = AnimationUtils.loadAnimation($r6, C10110R.anim.intercom_conversation_slide_in);
            ViewGroup $r132 = $r5;
            $r132.startAnimation($r7);
        }
        while (true) {
            List $r42 = $r3.getParts();
            int $i1 = $r42.size();
            if ($i0 >= $i1) {
                removeSendingPartsIfNeeded();
                TimestampAdder $r14 = this.timestampAdder;
                List $r43 = this.parts;
                $r14.addDayDividers($r43);
                ConversationPartAdapter $r12 = this.adapter;
                $r12.notifyDataSetChanged();
                IntercomLinkPresenter $r15 = this.intercomLinkPresenter;
                String $r10 = $r3.getIntercomLinkSolution();
                $r15.setSolution($r10);
                ViewGroup $r133 = this.conversationList;
                ViewTreeObserver $r16 = $r133.getViewTreeObserver();
                $r16.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.8
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        ConversationContentPresenter $r1 = ConversationContentPresenter.this;
                        OpsMetricTracker $r23 = $r1.opsMetricTracker;
                        $r23.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_RENDER_RESULT);
                        ConversationContentPresenter $r17 = ConversationContentPresenter.this;
                        View $r32 = $r17.conversationList;
                        View r4 = $r32;
                        ViewUtils.removeGlobalLayoutListener(r4, this);
                    }
                });
                return;
            }
            List $r44 = $r3.getParts();
            Object $r8 = $r44.get($i0);
            Part $r9 = (Part) $r8;
            List $r45 = $r3.getParts();
            int $i12 = $r45.size();
            if ($i0 < $i12 - 1) {
                String $r102 = $r9.getMessageStyle();
                boolean $z0 = "quick_reply".equals($r102);
                $i0 = $z0 ? $i0 + 1 : 0;
            }
            ConversationPartAdapter $r122 = this.adapter;
            ViewGroup $r134 = $r122.getViewForPart($r9);
            if ($r134 == null) {
                addViewForPart($r9);
            }
            List $r46 = this.parts;
            $r46.add($r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onGlobalLayout() {
        IntercomLinkPresenter $r1 = this.intercomLinkPresenter;
        $r1.updateIntercomLink(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onNewConversation(NewConversationEvent newConversationEvent) {
        updateSendPartOpsMetric();
        Conversation $r2 = newConversationEvent.getConversation();
        Conversation $r3 = newConversationEvent.getConversation();
        Object $r5 = $r3.getParts().get(0);
        Part $r6 = (Part) $r5;
        String $r7 = $r2.getId();
        this.conversationId = $r7;
        List $r4 = this.parts;
        int $i0 = $r4.size();
        $r4.remove($i0 - 1);
        this.sendingParts.clear();
        addViewForPart($r6);
        this.parts.add($r6);
        ConversationPartAdapter $r8 = this.adapter;
        $r8.notifyDataSetChanged();
        IntercomLinkPresenter $r9 = this.intercomLinkPresenter;
        String $r72 = $r2.getIntercomLinkSolution();
        $r9.setSolution($r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNewPartReceived() {
        /*
            r7 = this;
            java.util.Map<java.lang.String, io.intercom.android.sdk.views.AdminIsTypingView> r0 = r7.isTypingViews
            java.util.Collection r1 = r0.values()
            java.util.Iterator r2 = r1.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r4 = r2.next()
            r6 = r4
            io.intercom.android.sdk.views.AdminIsTypingView r6 = (io.intercom.android.sdk.views.AdminIsTypingView) r6
            r5 = r6
            if (r5 == 0) goto La
            r5.cancelTypingAnimation()
            goto La
        L1e:
            r7.smoothScrollToBottom()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ConversationContentPresenter.onNewPartReceived():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onPartClicked(Part part) {
        Part.MessageState $r2 = part.getMessageState();
        Part.MessageState $r3 = Part.MessageState.FAILED;
        if ($r2 == $r3) {
            showRetryDialog(part);
            return;
        }
        Part.MessageState $r22 = part.getMessageState();
        Part.MessageState $r32 = Part.MessageState.UPLOAD_FAILED;
        if ($r22 == $r32) {
            retryFailedUpload(part);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onProfileScrolled() {
        View $r3;
        ConversationPartAdapter $r1 = this.adapter;
        int $i0 = $r1.getCount() - 1;
        if ($i0 > 0) {
            ViewGroup $r2 = this.conversationList;
            ViewGroup r5 = $r2;
            $r3 = r5.getChildAt($i0);
        } else {
            $r3 = null;
        }
        IntercomLinkPresenter $r4 = this.intercomLinkPresenter;
        $r4.onProfileScrolled($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.holder.QuickReplyClickListener
    public void onQuickReplyClicked(Participant participant, Part part, ReplyOption replyOption) {
        Author.Builder $r5 = new Author.Builder();
        String $r1 = participant.getForename();
        Author.Builder $r6 = $r5.withFirstName($r1);
        String $r12 = participant.getName();
        Author.Builder $r62 = $r6.withName($r12);
        Avatar $r7 = participant.getAvatar();
        String $r13 = $r7.getImageUrl();
        $r62.withAvatar($r13);
        Block.Builder $r8 = new Block.Builder();
        String $r14 = replyOption.text();
        Block.Builder $r9 = $r8.withText($r14);
        Author $r10 = $r5.build();
        $r9.withAuthor($r10);
        ArrayList $r11 = new ArrayList();
        $r11.add($r8);
        Part $r122 = addSendingPart($r11);
        List $r132 = this.parts;
        int $i0 = $r132.size();
        String $r15 = $r122.getId();
        int $i02 = positionOfPart($i0 - 1, $r15);
        FeedbackDialog $r142 = this.bitmapCache;
        String $r16 = this.conversationId;
        String $r152 = replyOption.uuid();
        String $r162 = $r122.getId();
        $r142.addConversationQuickReply($r16, part, $r152, $i02, $r162);
        MetricTracker $r17 = this.metricTracker;
        String $r18 = replyOption.uuid();
        String $r153 = this.conversationId;
        String $r163 = part.getId();
        $r17.clickedQuickReply($r18, $r153, $r163);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onReplyDelivered(ReplyEvent replyEvent) {
        updateSendPartOpsMetric();
        final Part $r3 = replyEvent.getResponse();
        int $i0 = replyEvent.getPosition();
        String $r4 = replyEvent.getPartId();
        int $i02 = positionOfPart($i0, $r4);
        if ($i02 >= 0) {
            List $r1 = this.parts;
            Object $r5 = $r1.get($i02);
            Part $r6 = (Part) $r5;
            boolean $z0 = $r6.isSendingPart();
            if ($z0) {
                List $r7 = this.sendingParts;
                List $r12 = this.parts;
                Object $r52 = $r12.remove($i02);
                $r7.remove($r52);
            }
        }
        List $r13 = this.parts;
        boolean $z02 = $r13.contains($r3);
        if (!$z02) {
            addViewForPart($r3);
            $r3.setDisplayDelivered(true);
            List $r14 = this.parts;
            $r14.add($r3);
            ConversationPartAdapter $r8 = this.adapter;
            $r8.notifyDataSetChanged();
        }
        ViewGroup $r9 = this.conversationList;
        Runnable $r10 = this.replyDeliveredUpdater;
        ViewGroup r13 = $r9;
        r13.removeCallbacks($r10);
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                Part $r2 = $r3;
                $r2.setDisplayDelivered(false);
                ConversationContentPresenter $r32 = ConversationContentPresenter.this;
                ConversationPartAdapter $r15 = $r32.adapter;
                $r15.notifyDataSetChanged();
            }
        };
        this.replyDeliveredUpdater = runnable;
        ViewGroup $r92 = this.conversationList;
        long $l1 = PART_DISPLAY_DELIVERED_TIMEOUT;
        ViewGroup r132 = $r92;
        r132.postDelayed(runnable, $l1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.SuggestionsClickListener
    public void onSuggestionClicked(Part part, Suggestion suggestion) {
        Block.Builder $r3 = new Block.Builder();
        $r3.withText(suggestion.getText());
        List $r5 = this.parts;
        $r5.clear();
        ArrayList $r6 = new ArrayList();
        $r6.add($r3);
        Part $r7 = addSendingPart($r6);
        UUID $r8 = UUID.randomUUID();
        String $r4 = $r8.toString();
        Store $r9 = this.store;
        Action $r10 = Actions.composerSuggestionSelected($r4);
        $r9.dispatch($r10);
        List $r52 = this.parts;
        int $i0 = $r52.size();
        String $r11 = $r7.getId();
        int $i02 = positionOfPart($i0 - 1, $r11);
        FeedbackDialog $r12 = this.bitmapCache;
        String $r112 = suggestion.getUuid();
        $r12.triggerInboundCustomBot($r7, $r112, $i02, $r4);
        MetricTracker $r13 = this.metricTracker;
        String $r42 = suggestion.getUuid();
        String $r113 = this.conversationId;
        String $r14 = part.getId();
        $r13.clickedComposerSuggestion($r42, $r113, $r14);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onUserContentSeenByAdmin(UserContentSeenByAdminEvent userContentSeenByAdminEvent) {
        String $r2 = userContentSeenByAdminEvent.getConversationId();
        String $r3 = this.conversationId;
        boolean $z0 = $r2.equals($r3);
        if ($z0) {
            List $r4 = this.parts;
            boolean $z02 = $r4.isEmpty();
            if ($z02) {
                return;
            }
            boolean $z03 = false;
            List $r42 = this.parts;
            int $i0 = $r42.size();
            for (int $i02 = $i0 - 1; $i02 >= 0; $i02--) {
                List $r43 = this.parts;
                Object $r5 = $r43.get($i02);
                Part $r6 = (Part) $r5;
                if (!$z03) {
                    boolean $z1 = $r6.isAdmin();
                    if (!$z1) {
                        $r6.setSeenByAdmin(SeenState.SEEN);
                        $z03 = true;
                    }
                }
                $r6.setSeenByAdmin(SeenState.HIDE);
            }
            ConversationPartAdapter $r7 = this.adapter;
            $r7.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void playSoundForNewAdminPart(java.util.List r9) {
        /*
            r8 = this;
            java.util.Iterator r0 = r9.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r2 = r0.next()
            r4 = r2
            io.intercom.android.sdk.models.Part r4 = (io.intercom.android.sdk.models.Part) r4
            r3 = r4
            boolean r1 = r3.isAdmin()
            if (r1 == 0) goto L4
            io.intercom.android.sdk.models.Participant r5 = r3.getParticipant()
            java.lang.Boolean r6 = r5.isBot()
            boolean r1 = r6.booleanValue()
            if (r1 == 0) goto L2c
            io.intercom.android.sdk.conversation.SoundPlayer r7 = r8.soundPlayer
            r7.playOperatorReceivedSound()
            return
        L2c:
            io.intercom.android.sdk.conversation.SoundPlayer r7 = r8.soundPlayer
            r7.playMessageReceivedSound()
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.conversation.ConversationContentPresenter.playSoundForNewAdminPart(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void replyFailure(ReplyFailedEvent replyFailedEvent) {
        int $i0 = replyFailedEvent.getPosition();
        String $r2 = replyFailedEvent.getPartId();
        boolean $z0 = replyFailedEvent.isUpload();
        markAsFailed($i0, $r2, $z0);
        SoundPlayer $r3 = this.soundPlayer;
        $r3.playReplyFailedSound();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void retryTapped(Part part) {
        Part.MessageState $r3 = Part.MessageState.SENDING;
        part.setMessageState($r3);
        List $r4 = this.parts;
        $r4.remove(part);
        List $r42 = this.parts;
        $r42.add(part);
        ConversationPartAdapter $r5 = this.adapter;
        $r5.notifyDataSetChanged();
        List $r43 = part.getBlocks();
        int $i0 = $r43.size();
        int $i1 = $r43.size();
        ArrayList $r1 = new ArrayList($i1);
        for (int $i12 = 0; $i12 < $i0; $i12++) {
            Object $r6 = $r43.get($i12);
            Block $r7 = (Block) $r6;
            Block.Builder $r8 = $r7.toBuilder();
            $r1.add($r8);
        }
        sendPart($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void scrollToBottom() {
        RecyclerView $r1 = this.conversationList;
        ConversationPartAdapter $r2 = this.adapter;
        int $i0 = $r2.getCount();
        $r1.m35277m1($i0 - 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void scrollToTop() {
        RecyclerView $r1 = this.conversationList;
        $r1.m35277m1(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void sendPart(List list) {
        OpsMetricTracker $r3 = this.opsMetricTracker;
        $r3.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.SEND_PART_TIME_TO_PROCESS_ACTION);
        OpsMetricTracker $r32 = this.opsMetricTracker;
        $r32.trackEvent(OpsMetricTracker.START, OpsMetricTracker.SEND_PART_TIME_TO_COMPLETE_REQUEST);
        Part $r4 = addSendingPart(list);
        String $r2 = this.conversationId;
        boolean $z0 = TextUtils.isEmpty($r2);
        if (!$z0) {
            FeedbackDialog $r5 = this.bitmapCache;
            String $r22 = this.conversationId;
            List $r6 = this.parts;
            int $i0 = $r6.size();
            String $r11 = $r4.getId();
            $r5.replyToConversation($r22, list, $i0 - 1, $r11, false);
            return;
        }
        FeedbackDialog $r52 = this.bitmapCache;
        List $r62 = this.parts;
        int $i02 = $r62.size();
        String $r23 = $r4.getId();
        Store $r7 = this.store;
        Store.Selector $r8 = Selectors.COMPOSER_SUGGESTIONS;
        Object $r9 = $r7.select($r8);
        List $r63 = ((ComposerSuggestions) $r9).getSuggestions();
        $r52.startNewConversation(list, $i02 - 1, $r23, $r63);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setup() {
        OpsMetricTracker $r2 = this.opsMetricTracker;
        $r2.trackEvent(OpsMetricTracker.FINISH, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_PROCESS_ACTION);
        RecyclerView $r3 = this.conversationList;
        LinearLayoutManager $r4 = this.layoutManager;
        $r3.setLayoutManager($r4);
        RecyclerView $r32 = this.conversationList;
        ConversationPartAdapter $r5 = this.adapter;
        $r32.setAdapter($r5);
        RecyclerView $r33 = this.conversationList;
        RecyclerView r14 = $r33;
        Context $r7 = r14.getContext();
        List $r1 = this.parts;
        ConversationItemDecoration r12 = new ConversationItemDecoration($r7, $r1);
        $r33.m35294h(r12);
        RecyclerView $r34 = this.conversationList;
        RecyclerView.AbstractC1629m $r8 = $r34.getItemAnimator();
        AbstractC1752y $r9 = (AbstractC1752y) $r8;
        $r9.m34570Q(false);
        RecyclerView $r35 = this.conversationList;
        $r35.setNestedScrollingEnabled(true);
        ViewGroup $r36 = this.conversationList;
        ViewGroup r142 = $r36;
        r142.setVisibility(0);
        RecyclerView $r37 = this.conversationList;
        $r37.m35282l(new RecyclerView.AbstractC1644u() { // from class: io.intercom.android.sdk.conversation.ConversationContentPresenter.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1644u
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ConversationContentPresenter $r38 = ConversationContentPresenter.this;
                IntercomLinkPresenter $r12 = $r38.intercomLinkPresenter;
                ConversationContentPresenter $r39 = ConversationContentPresenter.this;
                $r12.updateIntercomLink($r39);
            }
        });
        IntercomLinkPresenter $r11 = this.intercomLinkPresenter;
        $r11.setup(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showContentView() {
        hideLoadingIndicator();
        ViewGroup $r1 = this.conversationList;
        ViewGroup r2 = $r1;
        r2.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showErrorView() {
        hideLoadingIndicator();
        ViewGroup $r1 = this.conversationList;
        ViewGroup r2 = $r1;
        r2.setVisibility(8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void showLoadingView() {
        showLoadingIndicator();
        ViewGroup $r1 = this.conversationList;
        ViewGroup r2 = $r1;
        r2.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void smoothScrollToTop() {
        RecyclerView $r1 = this.conversationList;
        $r1.m35253u1(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void uploadFailure(UploadFailedEvent uploadFailedEvent) {
        int $i0 = uploadFailedEvent.getPosition();
        String $r2 = uploadFailedEvent.getPartId();
        markAsFailed($i0, $r2, true);
        SoundPlayer $r3 = this.soundPlayer;
        $r3.playReplyFailedSound();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void uploadImage(List list, GalleryImage galleryImage) {
        Part $r5 = addSendingPart(list);
        $r5.setUpload(galleryImage);
        FeedbackDialog $r2 = this.bitmapCache;
        List $r4 = this.parts;
        int $i0 = $r4.size();
        String $r6 = $r5.getId();
        UploadingImageCache $r3 = this.uploadingImageCache;
        ConversationPartAdapter $r7 = this.adapter;
        ViewGroup $r8 = $r7.getViewForPart($r5);
        View $r9 = $r8.getChildAt(0);
        $r2.uploadFile(galleryImage, $i0 - 1, $r6, $r3, (UploadProgressListener) $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void uploadSuccess(UploadEvent uploadEvent) {
        String $r2 = uploadEvent.getTempPartId();
        int $i0 = positionOfPart(uploadEvent.getTempPartPosition(), $r2);
        if ($i0 < 0) {
            return;
        }
        List $r3 = this.parts;
        Object $r4 = $r3.get($i0);
        Part $r5 = (Part) $r4;
        List $r32 = $r5.getBlocks();
        boolean $z0 = $r32.isEmpty();
        if ($z0) {
            return;
        }
        String $r6 = $r5.getId();
        boolean $z02 = $r2.equals($r6);
        if ($z02) {
            List $r33 = $r5.getBlocks();
            Object $r42 = $r33.get(0);
            List $r34 = createBlocksForUpload(uploadEvent, (Block) $r42);
            String $r62 = this.conversationId;
            boolean $z03 = TextUtils.isEmpty($r62);
            if (!$z03) {
                FeedbackDialog $r8 = this.bitmapCache;
                String $r22 = this.conversationId;
                String $r63 = $r5.getId();
                $r8.replyToConversation($r22, $r34, $i0, $r63, true);
                return;
            }
            FeedbackDialog $r82 = this.bitmapCache;
            List $r9 = this.parts;
            Store $r10 = this.store;
            Store.Selector $r11 = Selectors.COMPOSER_SUGGESTIONS;
            Object $r43 = $r10.select($r11);
            ComposerSuggestions $r12 = (ComposerSuggestions) $r43;
            List $r92 = $r12.getSuggestions();
            $r82.startNewConversation($r34, $r9.size() - 1, $r2, $r92);
        }
    }
}
