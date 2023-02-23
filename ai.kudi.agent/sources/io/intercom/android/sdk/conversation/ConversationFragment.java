package io.intercom.android.sdk.conversation;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.Blocks;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.blocks.models.BlockAttachment;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.ConversationContentPresenter;
import io.intercom.android.sdk.conversation.ConversationPartAdapter;
import io.intercom.android.sdk.conversation.composer.ComposerPresenter;
import io.intercom.android.sdk.conversation.events.AdminIsTypingEvent;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.events.ConversationEvent;
import io.intercom.android.sdk.models.events.ReplyEvent;
import io.intercom.android.sdk.models.events.failure.ConversationFailedEvent;
import io.intercom.android.sdk.nexus.NexusClient;
import io.intercom.android.sdk.nexus.NexusEvent;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.profile.ProfilePresenter;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Selectors;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.StoreUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.android.sdk.views.IntercomLinkView;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class ConversationFragment extends Fragment implements ConversationPartAdapter.Listener, IntercomToolbar.Listener, Store.Subscriber2<Integer, TeamPresence>, ConversationContentPresenter.Host {
    private static final String ARG_CONVERSATION_ID = "conversationId";
    private static final String ARG_GROUP_PARTICIPANTS = "group_participants";
    private static final String ARG_INITIAL_MESSAGE = "initial_message";
    private static final String ARG_IS_READ = "intercomsdk-isRead";
    private static final String ARG_IS_TWO_PANE = "is_two_pane";
    private static final String ARG_LAST_PARTICIPANT = "last_participant";
    private static final int COMPOSER_LIGHTBOX_REQUEST_CODE = 25;
    private static final String EXTRA_GALLERY_IMAGE = "gallery_image";
    private static final String IMAGE_MIME_TYPE = "image";
    private static final int MAX_FILE_SIZE_BYTES = 41943040;
    Provider<AppConfig> appConfigProvider;
    private boolean canOpenProfile;
    private RelativeLayout composerHolder;
    private final ComposerPresenter.Listener composerListener;
    ComposerPresenter composerPresenter;
    private final NetworkConnectivityMonitor.ConnectivityEventListener connectivityEventListener;
    ConversationContentPresenter contentPresenter;
    Conversation conversation;
    String conversationId;
    private int currentOrientation;
    private C11129b eventBus;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private List<Participant> groupParticipants;
    private boolean hasLoadedConversation;
    private String initialMessage;
    private IntercomErrorView intercomErrorView;
    private IntercomLinkView intercomLinkView;
    private IntercomToolbar intercomToolbar;
    private boolean isTwoPane;
    private CharSequence lastActiveTime;
    private LastParticipatingAdmin lastParticipant;
    private Listener listener;
    private MetricTracker metricTracker;
    final NetworkConnectivityMonitor networkConnectivityMonitor;
    private NexusClient nexusClient;
    private OpsMetricTracker opsMetricTracker;
    boolean orientationChanged;
    private final ProfileExpansionLogic profileExpansionLogic;
    ProfilePresenter profilePresenter;
    private ReactionInputView reactionComposer;
    private C10486i requestManager;
    View rootView;
    boolean shouldStayAtBottom;
    Store<State> store;
    private Store.Subscription subscription;
    private UserIdentity userIdentity;

    /* loaded from: classes.dex */
    public interface Listener {
        void onBackClicked();

        void onToolbarCloseClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConversationFragment() {
        NetworkConnectivityMonitor $r1 = new NetworkConnectivityMonitor();
        this.networkConnectivityMonitor = $r1;
        ProfileExpansionLogic $r2 = new ProfileExpansionLogic();
        this.profileExpansionLogic = $r2;
        this.canOpenProfile = true;
        this.hasLoadedConversation = false;
        this.orientationChanged = false;
        this.shouldStayAtBottom = false;
        this.initialMessage = "";
        this.isTwoPane = false;
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.3
            private int previousHeight;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View $r22 = ConversationFragment.this.rootView;
                int $i0 = $r22.getHeight();
                int $i1 = this.previousHeight;
                if ($i1 != 0) {
                    ConversationFragment $r12 = ConversationFragment.this;
                    boolean $z0 = $r12.orientationChanged;
                    if (!$z0 && $i1 > $i0) {
                        ProfilePresenter $r3 = $r12.profilePresenter;
                        $r3.closeProfile();
                        ConversationFragment $r13 = ConversationFragment.this;
                        boolean $z02 = $r13.shouldStayAtBottom;
                        if ($z02) {
                            ConversationContentPresenter $r4 = $r13.contentPresenter;
                            $r4.scrollToBottom();
                            ConversationFragment.this.shouldStayAtBottom = false;
                        }
                    }
                }
                ConversationFragment $r14 = ConversationFragment.this;
                boolean $z03 = $r14.orientationChanged;
                if ($z03 && this.previousHeight != $i0) {
                    $r14.orientationChanged = false;
                }
                this.previousHeight = $i0;
                ConversationContentPresenter $r42 = ConversationFragment.this.contentPresenter;
                $r42.onGlobalLayout();
            }
        };
        this.connectivityEventListener = new NetworkConnectivityMonitor.ConnectivityEventListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
            public void onDisconnect() {
                ConversationFragment $r22 = ConversationFragment.this;
                View $r3 = $r22.rootView;
                int $i0 = C10110R.string.intercom_no_network_connection;
                Snackbar $r12 = Snackbar.m26607X($r3, $i0, -2);
                $r12.mo26610N();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
            public void onReconnect() {
                ConversationFragment $r12 = ConversationFragment.this;
                View $r22 = $r12.rootView;
                int $i0 = C10110R.string.intercom_connected;
                Snackbar $r3 = Snackbar.m26607X($r22, $i0, 0);
                ConversationFragment $r13 = ConversationFragment.this;
                Provider $r4 = $r13.appConfigProvider;
                Object $r5 = $r4.get();
                AppConfig $r6 = (AppConfig) $r5;
                int $i02 = $r6.getPrimaryColor();
                $r3.m26602c0($i02);
                int $i03 = C10110R.string.intercom_dismiss;
                $r3.m26604a0($i03, new View.OnClickListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.6.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
                $r3.mo26610N();
            }
        };
        this.composerListener = new ComposerPresenter.Listener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.8
            private final BlockFactory blockFactory;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            {
                TextSplittingStrategy $r12 = new TextSplittingStrategy();
                BlockFactory $r3 = new BlockFactory($r12);
                this.blockFactory = $r3;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private List createBlocks(GalleryImage galleryImage) {
                ArrayList $r12 = new ArrayList();
                String $r3 = galleryImage.getMimeType();
                boolean $z0 = $r3.contains(ConversationFragment.IMAGE_MIME_TYPE);
                if ($z0) {
                    Block.Builder $r4 = new Block.Builder();
                    String $r32 = galleryImage.getPath();
                    Block.Builder $r42 = $r4.withUrl($r32);
                    BlockType $r5 = BlockType.LOCALIMAGE;
                    String $r33 = $r5.name();
                    Block.Builder $r43 = $r42.withType($r33);
                    int $i0 = galleryImage.getImageWidth();
                    Block.Builder $r44 = $r43.withWidth($i0);
                    int $i02 = galleryImage.getImageHeight();
                    $r12.add($r44.withHeight($i02));
                    return $r12;
                }
                BlockAttachment.Builder $r6 = new BlockAttachment.Builder();
                String $r34 = galleryImage.getFileName();
                BlockAttachment.Builder $r62 = $r6.withName($r34);
                String $r35 = galleryImage.getPath();
                BlockAttachment.Builder $r63 = $r62.withUrl($r35);
                String $r36 = galleryImage.getMimeType();
                BlockAttachment $r7 = $r63.withContentType($r36).build();
                Block.Builder $r45 = new Block.Builder();
                List $r8 = Collections.singletonList($r7);
                Block.Builder $r46 = $r45.withAttachments($r8);
                BlockType $r52 = BlockType.LOCAL_ATTACHMENT;
                String $r37 = $r52.name();
                $r12.add($r46.withType($r37));
                return $r12;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private void showUploadError() {
                ConversationFragment $r22 = ConversationFragment.this;
                FragmentActivity $r3 = $r22.getActivity();
                DialogInterfaceC0936d.C0937a $r12 = new DialogInterfaceC0936d.C0937a($r3);
                int $i0 = C10110R.string.intercom_failed_to_send;
                DialogInterfaceC0936d.C0937a $r13 = $r12.setTitle($i0);
                int $i02 = C10110R.string.intercom_file_too_big;
                $r13.setMessage($i02).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.8.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.conversation.composer.ComposerPresenter.Listener
            public void onRemoteImageSelected(GalleryImage galleryImage) {
                ConversationFragment $r22 = ConversationFragment.this;
                ConversationContentPresenter $r3 = $r22.contentPresenter;
                Block.Builder $r4 = new Block.Builder();
                Block.Builder $r42 = $r4.withType(ConversationFragment.IMAGE_MIME_TYPE);
                String $r5 = galleryImage.getPath();
                Block.Builder $r43 = $r42.withUrl($r5);
                String $r52 = galleryImage.getAttribution();
                Block.Builder $r44 = $r43.withAttribution($r52);
                int $i0 = galleryImage.getImageHeight();
                Block.Builder $r45 = $r44.withHeight($i0);
                int $i02 = galleryImage.getImageWidth();
                List $r6 = Collections.singletonList($r45.withWidth($i02));
                $r3.sendPart($r6);
                ConversationFragment $r23 = ConversationFragment.this;
                ComposerPresenter $r7 = $r23.composerPresenter;
                $r7.returnToDefaultInput();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.conversation.composer.ComposerPresenter.Listener
            public void onSendButtonPressed(CharSequence charSequence) {
                String $r22 = charSequence.toString().trim();
                boolean $z0 = $r22.isEmpty();
                if ($z0) {
                    return;
                }
                ConversationFragment $r3 = ConversationFragment.this;
                OpsMetricTracker $r4 = $r3.opsMetricTracker;
                $r4.trackEvent(OpsMetricTracker.START, OpsMetricTracker.SEND_PART_TIME_TO_PROCESS_ACTION);
                ConversationFragment $r32 = ConversationFragment.this;
                ConversationContentPresenter $r5 = $r32.contentPresenter;
                BlockFactory $r6 = this.blockFactory;
                List $r7 = $r6.getBlocksForText($r22);
                $r5.sendPart($r7);
                ConversationFragment $r33 = ConversationFragment.this;
                boolean $z02 = TextUtils.isEmpty($r33.conversationId);
                if ($z02) {
                    ConversationFragment $r34 = ConversationFragment.this;
                    View $r8 = $r34.rootView;
                    int $i0 = C10110R.C10112id.disabled_view;
                    $r8.findViewById($i0).setVisibility(0);
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.conversation.composer.ComposerPresenter.Listener
            public void onUploadImageSelected(GalleryImage galleryImage) {
                int $i0 = galleryImage.getFileSize();
                if ($i0 > ConversationFragment.MAX_FILE_SIZE_BYTES) {
                    showUploadError();
                    return;
                }
                ConversationFragment $r22 = ConversationFragment.this;
                ConversationContentPresenter $r3 = $r22.contentPresenter;
                List $r4 = createBlocks(galleryImage);
                $r3.uploadImage($r4, galleryImage);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void animateComposerIn() {
        Context $r1 = getContext();
        int $i0 = C10110R.anim.intercom_composer_slide_up;
        Animation $r2 = AnimationUtils.loadAnimation($r1, $i0);
        RelativeLayout $r3 = this.composerHolder;
        $r3.setVisibility(0);
        TextView $r4 = this.intercomLinkView;
        TextView r5 = $r4;
        r5.startAnimation($r2);
        RelativeLayout $r32 = this.composerHolder;
        $r32.startAnimation($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void configureInputView(Conversation conversation) {
        Part $r4 = conversation.getLastPart();
        ReactionReply $r5 = $r4.getReactionReply();
        boolean $z0 = ReactionReply.isNull($r5);
        if ($z0) {
            ComposerState $r6 = conversation.getComposerState();
            boolean $z02 = $r6.isVisible();
            if ($z02) {
                ComposerPresenter $r7 = this.composerPresenter;
                $r7.showComposer();
                ComposerPresenter $r72 = this.composerPresenter;
                $r72.requestFocus();
                ReactionInputView $r8 = this.reactionComposer;
                $r8.setVisibility(8);
                return;
            }
        }
        MetricTracker.ReactionLocation $r9 = MetricTracker.ReactionLocation.CONVERSATION;
        String $r10 = $r4.getId();
        String $r11 = conversation.getId();
        Injector $r12 = Injector.get();
        FeedbackDialog $r13 = $r12.getApi();
        MetricTracker $r1 = this.metricTracker;
        ConversationReactionListener $r2 = new ConversationReactionListener($r9, $r10, $r11, $r13, $r1);
        ReactionInputView $r82 = this.reactionComposer;
        ReactionReply $r52 = $r4.getReactionReply();
        C10486i $r14 = this.requestManager;
        $r82.setUpReactions($r52, true, $r2, $r14);
        ComposerPresenter $r73 = this.composerPresenter;
        $r73.hideComposer();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private ConversationContentPresenter createContentPresenter(View view) {
        Injector $r3 = Injector.get();
        int $i0 = C10110R.C10112id.conversation_list;
        View $r1 = view.findViewById($i0);
        FragmentActivity $r6 = getActivity();
        Twig $r7 = LumberMill.getBlocksTwig();
        Blocks $r5 = new Blocks($r6, $r7);
        FeedbackDialog $r8 = $r3.getApi();
        ArrayList $r2 = new ArrayList();
        Provider $r10 = this.appConfigProvider;
        ContextLocaliser $r9 = new ContextLocaliser($r10);
        FragmentActivity $r62 = getActivity();
        Application $r11 = $r62.getApplication();
        Resources $r12 = $r11.getResources();
        Configuration $r13 = $r12.getConfiguration();
        Locale $r14 = $r13.locale;
        FragmentActivity $r63 = getActivity();
        String $r15 = this.conversationId;
        Provider $r102 = this.appConfigProvider;
        UserIdentity $r16 = this.userIdentity;
        TimeProvider $r17 = $r3.getTimeProvider();
        C10486i $r18 = this.requestManager;
        MetricTracker $r19 = this.metricTracker;
        ConversationPartAdapter $r20 = ConversationPartAdapter.create($r63, $r2, this, $r8, $r15, $r102, $r16, $r17, $r9, $r18, $r19, $r14);
        FragmentActivity $r64 = getActivity();
        Provider $r103 = this.appConfigProvider;
        SoundPlayer $r21 = new SoundPlayer($r64, $r103);
        IntercomLinkView $r22 = this.intercomLinkView;
        Provider $r104 = this.appConfigProvider;
        String $r152 = this.conversationId;
        UserIdentity $r162 = this.userIdentity;
        OpsMetricTracker $r23 = this.opsMetricTracker;
        C10486i $r182 = this.requestManager;
        FragmentActivity $r65 = getActivity();
        Store $r24 = this.store;
        NexusClient $r25 = this.nexusClient;
        ConversationContentPresenter $r26 = ConversationContentPresenter.create(this, (RecyclerView) $r1, $r20, $r22, $r104, $r8, $r2, $r152, $r21, $r5, $r162, $r23, $r182, $r65, $r24, $r25);
        return $r26;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void displayErrorView() {
        RelativeLayout $r1 = this.intercomErrorView;
        RelativeLayout $r2 = $r1;
        $r2.setVisibility(0);
        RelativeLayout $r22 = this.composerHolder;
        $r22.setVisibility(8);
        ConversationContentPresenter $r3 = this.contentPresenter;
        $r3.showErrorView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void expandProfileIfNeeded() {
        View $r1;
        if (!this.canOpenProfile || ($r1 = getView()) == null) {
            return;
        }
        ProfileExpansionLogic $r2 = this.profileExpansionLogic;
        Conversation $r3 = this.conversation;
        final boolean $z0 = $r2.shouldExpandProfile($r3);
        $r1.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                ConversationFragment $r22 = ConversationFragment.this;
                Context $r12 = $r22.getContext();
                if ($r12 == null) {
                    return;
                }
                boolean $z02 = $z0;
                if (!$z02) {
                    ConversationFragment $r23 = ConversationFragment.this;
                    ProfilePresenter $r32 = $r23.profilePresenter;
                    $r32.startOffsetListener();
                    return;
                }
                ConversationFragment $r24 = ConversationFragment.this;
                ProfilePresenter $r33 = $r24.profilePresenter;
                $r33.profileAutoOpened();
                ConversationFragment $r25 = ConversationFragment.this;
                ProfilePresenter $r34 = $r25.profilePresenter;
                $r34.startOffsetListener();
                ConversationFragment $r26 = ConversationFragment.this;
                ConversationContentPresenter $r4 = $r26.contentPresenter;
                $r4.smoothScrollToTop();
            }
        }, 50L);
        if ($z0) {
            ConversationContentPresenter $r5 = this.contentPresenter;
            $r5.scrollToTop();
        } else {
            ConversationContentPresenter $r52 = this.contentPresenter;
            $r52.scrollToBottom();
        }
        this.canOpenProfile = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void markConversationAsRead() {
        Injector $r1 = Injector.get();
        FeedbackDialog $r2 = $r1.getApi();
        String $r3 = this.conversationId;
        $r2.markConversationAsRead($r3);
        Store $r4 = this.store;
        String $r32 = this.conversationId;
        Action $r5 = Actions.conversationMarkedAsRead($r32);
        $r4.dispatch($r5);
        NexusClient $r6 = this.nexusClient;
        String $r33 = this.conversationId;
        UserIdentity $r7 = this.userIdentity;
        String $r8 = $r7.getIntercomId();
        NexusEvent $r9 = NexusEvent.getConversationSeenEvent($r33, $r8);
        $r6.fire($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ConversationFragment newInstance(String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z, boolean z2, String str2, List list) {
        ConversationFragment r9 = new ConversationFragment();
        Bundle r10 = new Bundle();
        r10.putString(ARG_CONVERSATION_ID, str);
        r10.putString(ARG_INITIAL_MESSAGE, str2);
        LastParticipatingAdmin r12 = lastParticipatingAdmin;
        r10.putParcelable(ARG_LAST_PARTICIPANT, r12);
        ArrayList r11 = new ArrayList(list);
        r10.putParcelableArrayList(ARG_GROUP_PARTICIPANTS, r11);
        r10.putBoolean(ARG_IS_READ, z);
        r10.putBoolean(ARG_IS_TWO_PANE, z2);
        ClassLoader $r4 = Part.class.getClassLoader();
        r10.setClassLoader($r4);
        r9.setArguments(r10);
        return r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void toggleProfile() {
        ProfilePresenter $r1 = this.profilePresenter;
        boolean $z0 = $r1.isExpanded();
        if ($z0) {
            ProfilePresenter $r12 = this.profilePresenter;
            $r12.closeProfile();
            return;
        }
        ProfilePresenter $r13 = this.profilePresenter;
        $r13.profileClicked();
        ConversationContentPresenter $r2 = this.contentPresenter;
        $r2.smoothScrollToTop();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void trackLastPart(Part part) {
        boolean $z0 = part.isLinkList();
        if ($z0) {
            MetricTracker $r3 = this.metricTracker;
            String $r1 = this.conversationId;
            $r3.receivedOperatorReply($r1);
            return;
        }
        MetricTracker $r32 = this.metricTracker;
        boolean $z02 = part.hasAttachments();
        boolean $z1 = part.isLinkCard();
        String $r4 = part.getId();
        String $r12 = this.conversationId;
        $r32.receivedReply($z02, $z1, $r4, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateLastActiveTime() {
        Conversation $r1 = this.conversation;
        LastParticipatingAdmin $r2 = $r1.getLastParticipatingAdmin();
        if ($r2 != null) {
            FragmentActivity $r3 = getActivity();
            if ($r3 != null) {
                FragmentActivity $r32 = getActivity();
                Injector $r5 = Injector.get();
                TimeProvider $r6 = $r5.getTimeProvider();
                TimeFormatter $r4 = new TimeFormatter($r32, $r6);
                LastParticipatingAdmin $r22 = this.lastParticipant;
                Provider $r7 = this.appConfigProvider;
                CharSequence $r8 = $r4.getAdminActiveStatus($r22, $r7);
                this.lastActiveTime = $r8;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void updateProfileToolbar(TeamPresence teamPresence) {
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            return;
        }
        LastParticipatingAdmin $r3 = this.lastParticipant;
        boolean $z0 = LastParticipatingAdmin.isNull($r3);
        if (!$z0) {
            LastParticipatingAdmin $r32 = this.lastParticipant;
            LastParticipatingAdmin $r4 = LastParticipatingAdmin.NONE;
            if ($r32 != $r4) {
                updateLastActiveTime();
                ProfilePresenter $r5 = this.profilePresenter;
                LastParticipatingAdmin $r33 = this.lastParticipant;
                List $r6 = this.groupParticipants;
                CharSequence $r7 = this.lastActiveTime;
                View $r8 = this.rootView;
                int $i0 = $r8.getWidth();
                $r5.setTeammatePresence($r33, $r6, $r7, $i0);
                return;
            }
        }
        Window $r9 = $r2.getWindow();
        View $r82 = $r9.getDecorView();
        int $i02 = $r82.getMeasuredWidth();
        ProfilePresenter $r52 = this.profilePresenter;
        C10486i $r10 = this.requestManager;
        $r52.setTeamPresence(teamPresence, $i02, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void adminIsTyping(AdminIsTypingEvent adminIsTypingEvent) {
        String $r2 = this.conversationId;
        String $r3 = adminIsTypingEvent.getConversationId();
        boolean $z0 = $r2.equals($r3);
        if ($z0) {
            ConversationContentPresenter $r4 = this.contentPresenter;
            $r4.onAdminStartedTyping(adminIsTypingEvent);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void conversationFailure(ConversationFailedEvent conversationFailedEvent) {
        boolean $z0 = isAdded();
        if ($z0) {
            displayErrorView();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void conversationSuccess(ConversationEvent conversationEvent) {
        Conversation $r3 = this.conversation;
        int $i0 = $r3.getParts().size();
        boolean $z1 = $i0 == 0;
        Conversation $r32 = conversationEvent.getResponse();
        List $r4 = $r32.getParts();
        int $i1 = $r4.size();
        boolean $z0 = $i1 > $i0;
        Conversation $r33 = conversationEvent.getResponse();
        String $r5 = $r33.getId();
        String $r1 = this.conversationId;
        boolean $z2 = $r5.equals($r1);
        if ($z2) {
            Conversation $r34 = conversationEvent.getResponse();
            this.conversation = $r34;
            boolean $z22 = isAdded();
            if ($z22) {
                ConversationContentPresenter $r6 = this.contentPresenter;
                $r6.onConversationFetched(conversationEvent, $z1);
                displayConversation();
            }
            Conversation $r35 = this.conversation;
            boolean $z23 = $r35.isRead();
            boolean $z24 = !$z23;
            if ($z24) {
                markConversationAsRead();
            }
            if ($z1) {
                animateComposerIn();
                Object $r7 = $r4.get($r4.size() - 1);
                Part $r8 = (Part) $r7;
                boolean $z02 = $r8.isReply();
                if ($z02 && $z24) {
                    trackLastPart($r8);
                }
                expandProfileIfNeeded();
            } else if ($z0) {
                int $i12 = $r4.size();
                List $r42 = $r4.subList($i0, $i12);
                ConversationContentPresenter $r62 = this.contentPresenter;
                $r62.playSoundForNewAdminPart($r42);
                ConversationContentPresenter $r63 = this.contentPresenter;
                $r63.onNewPartReceived();
                Object $r72 = $r42.get($r42.size() - 1);
                trackLastPart((Part) $r72);
            }
        }
        Conversation $r36 = this.conversation;
        LastParticipatingAdmin $r9 = $r36.getLastParticipatingAdmin();
        this.lastParticipant = $r9;
        Conversation $r37 = this.conversation;
        this.groupParticipants = $r37.getGroupConversationParticipants();
        LastParticipatingAdmin $r92 = this.lastParticipant;
        if ($r92 != null) {
            updateLastActiveTime();
        }
        Store $r10 = this.store;
        Store.Selector $r11 = Selectors.TEAM_PRESENCE;
        Object $r73 = $r10.select($r11);
        TeamPresence $r12 = (TeamPresence) $r73;
        updateProfileToolbar($r12);
        this.hasLoadedConversation = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void displayConversation() {
        boolean $z0 = isAdded();
        if ($z0) {
            RelativeLayout $r1 = this.intercomErrorView;
            RelativeLayout r4 = $r1;
            r4.setVisibility(8);
            ConversationContentPresenter $r2 = this.contentPresenter;
            $r2.showContentView();
            Conversation $r3 = this.conversation;
            configureInputView($r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void displayLoadingView() {
        boolean $z0 = isAdded();
        if ($z0) {
            RelativeLayout $r1 = this.intercomErrorView;
            RelativeLayout r4 = $r1;
            r4.setVisibility(8);
            ComposerPresenter $r2 = this.composerPresenter;
            $r2.hideComposer();
            ConversationContentPresenter $r3 = this.contentPresenter;
            $r3.showLoadingView();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ConversationContentPresenter.Host
    public Conversation getConversation() {
        Conversation r1 = this.conversation;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ConversationContentPresenter.Host
    public String getConversationId() {
        String r1 = this.conversationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void handleOnBackPressed() {
        ComposerPresenter $r1 = this.composerPresenter;
        $r1.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    boolean hasNotLoadedLastAdminForExistingConversation() {
        boolean $z0 = this.hasLoadedConversation;
        if ($z0) {
            return false;
        }
        String $r1 = this.conversationId;
        boolean $z02 = $r1.isEmpty();
        if ($z02) {
            return false;
        }
        LastParticipatingAdmin $r2 = this.lastParticipant;
        boolean $z03 = LastParticipatingAdmin.isNull($r2);
        return $z03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 25 && intent != null) {
            boolean $z0 = intent.hasExtra("gallery_image");
            if ($z0) {
                Parcelable $r2 = intent.getParcelableExtra("gallery_image");
                GalleryImage $r3 = (GalleryImage) $r2;
                ComposerPresenter.Listener $r4 = this.composerListener;
                $r4.onUploadImageSelected($r3);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            Listener $r5 = (Listener) context;
            this.listener = $r5;
        } catch (ClassCastException e) {
            String $r2 = context + " must implement ConversationFragment.Listener";
            ClassCastException $r3 = new ClassCastException($r2);
            throw $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onCloseClicked() {
        Listener $r1 = this.listener;
        $r1.onToolbarCloseClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int $i1 = configuration.orientation;
        int $i0 = this.currentOrientation;
        if ($i1 != $i0) {
            this.orientationChanged = true;
            ComposerPresenter $r2 = this.composerPresenter;
            $r2.updateMaxLines();
        }
        int $i02 = configuration.orientation;
        this.currentOrientation = $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ConversationContentPresenter.Host
    public void onConversationCreated(Conversation conversation) {
        View $r3 = this.rootView;
        int $i0 = C10110R.C10112id.disabled_view;
        $r3.findViewById($i0).setVisibility(8);
        this.conversation = conversation;
        String $r2 = conversation.getId();
        this.conversationId = $r2;
        ProfilePresenter $r4 = this.profilePresenter;
        $r4.setConversationId($r2);
        ComposerPresenter $r5 = this.composerPresenter;
        $r5.setConversationId(this.conversationId);
        ComposerPresenter $r52 = this.composerPresenter;
        int $i02 = C10110R.string.intercom_reply_to_conversation;
        $r52.setHint($i02);
        NexusClient $r6 = this.nexusClient;
        String $r22 = this.conversationId;
        UserIdentity $r7 = this.userIdentity;
        String $r8 = $r7.getIntercomId();
        NexusEvent $r9 = NexusEvent.getNewCommentEvent($r22, $r8);
        $r6.fire($r9);
        List $r10 = conversation.getParts();
        Object $r11 = $r10.get(0);
        Part part = (Part) $r11;
        MetricTracker $r13 = this.metricTracker;
        boolean $z0 = part.hasAttachments();
        boolean $z1 = part.isGifOnlyPart();
        String $r82 = part.getId();
        String $r23 = this.conversationId;
        Store $r14 = this.store;
        Store.Selector $r15 = Selectors.TEAM_PRESENCE;
        Object $r112 = $r14.select($r15);
        TeamPresence $r16 = (TeamPresence) $r112;
        String $r17 = $r16.getOfficeHours();
        boolean $z2 = $r17.isEmpty();
        $r13.sentInNewConversation($z0, $z1, $r82, $r23, $z2);
        MetricTracker $r132 = this.metricTracker;
        $r132.startConversation(this.conversationId);
        this.hasLoadedConversation = true;
        configureInputView(conversation);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10486i $r2 = ComponentCallbacks2C10478c.m13017t(this);
        this.requestManager = $r2;
        Injector $r3 = Injector.get();
        C11129b $r4 = $r3.getBus();
        this.eventBus = $r4;
        NexusClient $r5 = $r3.getNexusClient();
        this.nexusClient = $r5;
        Provider $r6 = $r3.getAppConfigProvider();
        this.appConfigProvider = $r6;
        UserIdentity $r7 = $r3.getUserIdentity();
        this.userIdentity = $r7;
        Store $r8 = $r3.getStore();
        this.store = $r8;
        MetricTracker $r9 = $r3.getMetricTracker();
        this.metricTracker = $r9;
        OpsMetricTracker $r10 = $r3.getOpsMetricTracker();
        this.opsMetricTracker = $r10;
        $r10.trackEvent(OpsMetricTracker.START, OpsMetricTracker.LOAD_CONVERSATION_TIME_TO_PROCESS_ACTION);
        Bundle $r1 = getArguments();
        if ($r1 != null) {
            ClassLoader $r12 = Part.class.getClassLoader();
            $r1.setClassLoader($r12);
            String $r13 = $r1.getString(ARG_CONVERSATION_ID, "");
            this.conversationId = $r13;
            String $r132 = $r1.getString(ARG_INITIAL_MESSAGE, "");
            this.initialMessage = $r132;
            Parcelable $r14 = $r1.getParcelable(ARG_LAST_PARTICIPANT);
            LastParticipatingAdmin $r15 = (LastParticipatingAdmin) $r14;
            this.lastParticipant = $r15;
            if ($r15 == null) {
                this.lastParticipant = LastParticipatingAdmin.NULL;
            }
            ArrayList $r16 = $r1.getParcelableArrayList(ARG_GROUP_PARTICIPANTS);
            this.groupParticipants = $r16;
            if ($r16 == null) {
                this.groupParticipants = new ArrayList();
            }
            boolean $z0 = $r1.getBoolean(ARG_IS_READ, false);
            if (!$z0) {
                Store $r82 = this.store;
                String $r133 = this.conversationId;
                Action $r17 = Actions.conversationMarkedAsRead($r133);
                $r82.dispatch($r17);
            }
            boolean $z02 = $r1.getBoolean(ARG_IS_TWO_PANE, false);
            this.isTwoPane = $z02;
            String $r134 = this.conversationId;
            boolean $z03 = TextUtils.isEmpty($r134);
            if ($z03) {
                Store $r83 = this.store;
                Action $r172 = Actions.composerOpened();
                $r83.dispatch($r172);
            } else {
                Store $r84 = this.store;
                String $r135 = this.conversationId;
                Action $r173 = Actions.conversationOpened($r135);
                $r84.dispatch($r173);
            }
        }
        Conversation $r18 = new Conversation();
        this.conversation = $r18;
        Resources $r19 = getResources();
        Configuration $r20 = $r19.getConfiguration();
        int $i0 = $r20.orientation;
        this.currentOrientation = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View $r6 = this.rootView;
        if ($r6 == null) {
            int $i1 = C10110R.C10113layout.intercom_fragment_conversation;
            this.rootView = layoutInflater.inflate($i1, viewGroup, false);
        } else {
            ViewParent $r7 = $r6.getParent();
            ViewGroup viewGroup2 = (ViewGroup) $r7;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.rootView);
            }
        }
        View $r62 = this.rootView;
        int $i12 = C10110R.C10112id.intercom_link;
        IntercomLinkView $r8 = (IntercomLinkView) $r62.findViewById($i12);
        this.intercomLinkView = $r8;
        View $r63 = this.rootView;
        int $i13 = C10110R.C10112id.composer_holder;
        RelativeLayout $r9 = (RelativeLayout) $r63.findViewById($i13);
        this.composerHolder = $r9;
        View $r64 = this.rootView;
        int $i14 = C10110R.C10112id.conversation_coordinator_layout;
        CoordinatorLayout $r10 = (CoordinatorLayout) $r64.findViewById($i14);
        MetricTracker $r12 = this.metricTracker;
        Provider $r1 = this.appConfigProvider;
        C10486i $r2 = this.requestManager;
        ProfilePresenter $r11 = new ProfilePresenter($r10, $r12, $r1, $r2);
        this.profilePresenter = $r11;
        String $r13 = this.conversationId;
        $r11.setConversationId($r13);
        View $r65 = this.rootView;
        int $i15 = C10110R.C10112id.error_layout_conversation;
        IntercomErrorView $r14 = (IntercomErrorView) $r65.findViewById($i15);
        this.intercomErrorView = $r14;
        Provider $r15 = this.appConfigProvider;
        Object $r152 = $r15.get();
        AppConfig $r16 = (AppConfig) $r152;
        int $i16 = $r16.getPrimaryColor();
        $r14.setActionButtonTextColor($i16);
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConversationFragment.this.displayLoadingView();
                ConversationFragment $r3 = ConversationFragment.this;
                ConversationContentPresenter $r17 = $r3.contentPresenter;
                String $r4 = $r3.conversationId;
                $r17.fetchConversation($r4);
            }
        });
        this.profilePresenter.addListener(new AppBarLayout.InterfaceC4496e() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                ConversationFragment $r22 = ConversationFragment.this;
                ConversationContentPresenter $r3 = $r22.contentPresenter;
                $r3.onProfileScrolled();
            }
        });
        View $r66 = this.rootView;
        int $i17 = C10110R.C10112id.reaction_input_view;
        ReactionInputView $r19 = (ReactionInputView) $r66.findViewById($i17);
        this.reactionComposer = $r19;
        View $r67 = this.rootView;
        int $i18 = C10110R.C10112id.intercom_toolbar;
        IntercomToolbar $r20 = (IntercomToolbar) $r67.findViewById($i18);
        this.intercomToolbar = $r20;
        Provider $r17 = this.appConfigProvider;
        Object $r153 = $r17.get();
        AppConfig $r162 = (AppConfig) $r153;
        $r20.updateToolbarColors($r162);
        this.intercomToolbar.updateToolbarSize();
        this.intercomToolbar.setListener(this);
        IntercomToolbar $r202 = this.intercomToolbar;
        boolean $z0 = this.isTwoPane;
        byte $b0 = $z0 ? (byte) 8 : (byte) 0;
        $r202.setLeftNavigationItemVisibility($b0);
        this.intercomToolbar.animateBackButton();
        ViewTreeObserver $r21 = this.rootView.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener $r22 = this.globalLayoutListener;
        $r21.addOnGlobalLayoutListener($r22);
        return this.rootView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Store $r1 = this.store;
        Action $r2 = Actions.conversationClosed();
        $r1.dispatch($r2);
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View $r2 = this.rootView;
        ViewTreeObserver.OnGlobalLayoutListener $r1 = this.globalLayoutListener;
        ViewUtils.removeGlobalLayoutListener($r2, $r1);
        ComposerPresenter $r3 = this.composerPresenter;
        $r3.cleanup();
        ConversationContentPresenter $r4 = this.contentPresenter;
        $r4.cleanup();
        ProfilePresenter $r5 = this.profilePresenter;
        $r5.cleanup();
        super.onDestroyView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onInboxClicked() {
        ComposerPresenter $r1 = this.composerPresenter;
        $r1.cleanup();
        Listener $r2 = this.listener;
        $r2.onBackClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ConversationPartAdapter.Listener
    public void onPartClicked(Part part) {
        ConversationContentPresenter $r2 = this.contentPresenter;
        $r2.onPartClicked(part);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.conversation.ConversationPartAdapter.Listener
    public void onPostCardClicked(Part part) {
        Context $r3 = getContext();
        LastParticipatingAdmin $r1 = this.lastParticipant;
        Intent $r4 = IntercomPostActivity.buildPostIntent($r3, part, "", $r1, false);
        startActivity($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        NetworkConnectivityMonitor $r2 = this.networkConnectivityMonitor;
        FragmentActivity $r3 = getActivity();
        $r2.startListening($r3);
        NetworkConnectivityMonitor $r22 = this.networkConnectivityMonitor;
        NetworkConnectivityMonitor.ConnectivityEventListener $r4 = this.connectivityEventListener;
        $r22.setListener($r4);
        Store $r5 = this.store;
        Store.Selector $r6 = Selectors.UNREAD_COUNT;
        Store.Selector $r1 = Selectors.TEAM_PRESENCE;
        Store.Subscription $r7 = $r5.subscribeToChanges($r6, $r1, this);
        this.subscription = $r7;
        C11129b $r8 = this.eventBus;
        $r8.register(this);
        C11129b $r82 = this.eventBus;
        ConversationContentPresenter $r9 = this.contentPresenter;
        $r82.register($r9);
        ConversationContentPresenter $r92 = this.contentPresenter;
        String $r10 = this.conversationId;
        $r92.fetchConversation($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onStateChange  reason: avoid collision after fix types in other method */
    public void onStateChange2(Integer num, TeamPresence teamPresence) {
        IntercomToolbar $r2 = this.intercomToolbar;
        $r2.setUnreadCount(num);
        boolean $z0 = hasNotLoadedLastAdminForExistingConversation();
        if (!$z0) {
            updateProfileToolbar(teamPresence);
            return;
        }
        ProfilePresenter $r4 = this.profilePresenter;
        $r4.setUnknownPresence();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.store.Store.Subscriber2
    public /* bridge */ /* synthetic */ void onStateChange(Integer num, TeamPresence teamPresence) {
        Integer $r3 = num;
        TeamPresence $r4 = teamPresence;
        onStateChange2($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        Store.Subscription $r2 = this.subscription;
        StoreUtils.safeUnsubscribe($r2);
        C11129b $r3 = this.eventBus;
        $r3.unregister(this);
        C11129b $r32 = this.eventBus;
        ConversationContentPresenter $r4 = this.contentPresenter;
        $r32.unregister($r4);
        NetworkConnectivityMonitor $r5 = this.networkConnectivityMonitor;
        $r5.setListener(null);
        NetworkConnectivityMonitor $r52 = this.networkConnectivityMonitor;
        FragmentActivity $r1 = getActivity();
        $r52.stopListening($r1);
        OpsMetricTracker $r6 = this.opsMetricTracker;
        $r6.clear();
        ProfilePresenter $r7 = this.profilePresenter;
        $r7.onStop();
        super.onStop();
    }

    @Override // io.intercom.android.sdk.views.IntercomToolbar.Listener
    public void onToolbarClicked() {
        toggleProfile();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ConversationContentPresenter $r10 = createContentPresenter(view);
        this.contentPresenter = $r10;
        View $r11 = this.rootView;
        int $i0 = C10110R.C10112id.composer_container;
        FrameLayout frameLayout = (FrameLayout) $r11.findViewById($i0);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConversationFragment $r2 = ConversationFragment.this;
                ConversationContentPresenter $r3 = $r2.contentPresenter;
                boolean $z0 = $r3.isAtBottom();
                if ($z0) {
                    ConversationFragment $r22 = ConversationFragment.this;
                    $r22.shouldStayAtBottom = true;
                }
            }
        });
        ComposerPresenter.Listener $r15 = this.composerListener;
        FragmentManager $r16 = getChildFragmentManager();
        Context $r17 = view.getContext();
        LayoutInflater $r18 = LayoutInflater.from($r17);
        NexusClient $r3 = this.nexusClient;
        UserIdentity $r4 = this.userIdentity;
        Provider $r5 = this.appConfigProvider;
        MetricTracker $r6 = this.metricTracker;
        String $r7 = this.conversationId;
        String $r8 = this.initialMessage;
        Store $r9 = this.store;
        FragmentActivity $r19 = getActivity();
        Provider $r20 = this.appConfigProvider;
        Object $r21 = $r20.get();
        AppConfig $r22 = (AppConfig) $r21;
        int $i02 = $r22.getPrimaryColor();
        ComposerPresenter $r14 = new ComposerPresenter($r15, frameLayout, $r16, $r18, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r19, $i02);
        this.composerPresenter = $r14;
        ConversationContentPresenter $r102 = this.contentPresenter;
        $r102.setup();
        ComposerPresenter $r142 = this.composerPresenter;
        $r142.requestFocus();
        Conversation $r23 = this.conversation;
        configureInputView($r23);
        String $r72 = this.conversationId;
        boolean $z0 = $r72.isEmpty();
        if ($z0) {
            ConversationContentPresenter $r103 = this.contentPresenter;
            Store $r92 = this.store;
            Store.Selector $r24 = Selectors.COMPOSER_SUGGESTIONS;
            Object $r212 = $r92.select($r24);
            ComposerSuggestions $r25 = (ComposerSuggestions) $r212;
            $r103.addComposerSuggestionsPart($r25);
            animateComposerIn();
            displayConversation();
        } else {
            ComposerPresenter $r143 = this.composerPresenter;
            String $r73 = this.conversationId;
            $r143.setConversationId($r73);
            displayLoadingView();
        }
        String $r74 = this.conversationId;
        boolean $z02 = $r74.isEmpty();
        if ($z02) {
            this.canOpenProfile = false;
            view.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.conversation.ConversationFragment.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public void run() {
                    ConversationFragment $r2 = ConversationFragment.this;
                    FragmentActivity $r1 = $r2.getActivity();
                    if ($r1 == null) {
                        return;
                    }
                    ConversationFragment $r26 = ConversationFragment.this;
                    ProfilePresenter $r32 = $r26.profilePresenter;
                    $r32.profileAutoOpened();
                    ConversationFragment $r27 = ConversationFragment.this;
                    ProfilePresenter $r33 = $r27.profilePresenter;
                    $r33.startOffsetListener();
                    ConversationFragment $r28 = ConversationFragment.this;
                    ConversationContentPresenter $r42 = $r28.contentPresenter;
                    $r42.smoothScrollToTop();
                }
            }, 50L);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void replySuccess(ReplyEvent replyEvent) {
        String $r1 = replyEvent.getConversationId();
        String $r3 = this.conversationId;
        boolean $z0 = $r1.equals($r3);
        if ($z0) {
            NexusClient $r4 = this.nexusClient;
            String $r12 = this.conversationId;
            UserIdentity $r5 = this.userIdentity;
            String $r32 = $r5.getIntercomId();
            NexusEvent $r6 = NexusEvent.getNewCommentEvent($r12, $r32);
            $r4.fire($r6);
            Part $r7 = replyEvent.getResponse();
            Conversation $r8 = this.conversation;
            String $r13 = $r7.getParticipantId();
            Participant $r9 = $r8.getParticipant($r13);
            Participant participant = $r9;
            Participant $r11 = Participant.NULL;
            if ($r9 == $r11) {
                Participant.Builder $r122 = new Participant.Builder();
                String $r14 = $r7.getParticipantId();
                Participant $r92 = $r122.withId($r14).build();
                participant = $r92;
                Conversation $r82 = this.conversation;
                Map $r132 = $r82.getParticipants();
                String $r15 = $r7.getParticipantId();
                $r132.put($r15, $r92);
            }
            $r7.setParticipant(participant);
            ConversationContentPresenter $r142 = this.contentPresenter;
            $r142.onReplyDelivered(replyEvent);
            FragmentActivity $r16 = getActivity();
            Injector $r17 = Injector.get();
            TimeProvider $r18 = $r17.getTimeProvider();
            TimeFormatter $r152 = new TimeFormatter($r16, $r18);
            MetricTracker $r19 = this.metricTracker;
            boolean $z02 = $r7.hasAttachments();
            boolean $z1 = $r7.isGifOnlyPart();
            String $r33 = $r7.getId();
            String $r110 = this.conversationId;
            Store $r20 = this.store;
            Store.Selector $r21 = Selectors.TEAM_PRESENCE;
            Object $r22 = $r20.select($r21);
            TeamPresence $r23 = (TeamPresence) $r22;
            String $r24 = $r23.getOfficeHours();
            boolean $z2 = $r24.isEmpty();
            LastParticipatingAdmin $r25 = this.lastParticipant;
            boolean $z3 = $r25.isActive();
            LastParticipatingAdmin $r252 = this.lastParticipant;
            long $l0 = $r252.getLastActiveAt();
            String $r242 = $r152.getLastActiveMinutes($l0);
            $r19.sentInConversation($z02, $z1, $r33, $r110, $z2, $z3, $r242);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void sdkWindowFinishedAnimating() {
        View $r2 = getView();
        if ($r2 != null) {
            ProfileExpansionLogic $r3 = this.profileExpansionLogic;
            Conversation $r1 = this.conversation;
            boolean $z0 = $r3.shouldExpandProfile($r1);
            if ($z0) {
                ProfilePresenter $r4 = this.profilePresenter;
                $r4.profileAutoOpened();
                ConversationContentPresenter $r5 = this.contentPresenter;
                $r5.smoothScrollToTop();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean shouldHandleOnBackPressed() {
        ComposerPresenter $r1 = this.composerPresenter;
        if ($r1 != null) {
            boolean $z0 = $r1.isOpen();
            return $z0;
        }
        return false;
    }
}
