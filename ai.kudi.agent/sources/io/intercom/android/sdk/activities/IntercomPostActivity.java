package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.blocks.BlocksViewHolder;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.google.gson.C10916e;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class IntercomPostActivity extends IntercomBaseActivity implements View.OnClickListener {
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    View composerLayout;
    String conversationId;
    private boolean isPreview;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    Part part;
    private FrameLayout postContainer;
    ContentAwareScrollView postView;
    private final FullScreenInAppPresenter presenter;
    ReactionInputView reactionComposer;
    private C10486i requestManager;
    private EditText textComposer;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IntercomPostActivity() {
        FullScreenInAppPresenter $r1 = new FullScreenInAppPresenter();
        this.presenter = $r1;
        this.isPreview = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildPostIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z) {
        Intent r7 = new Intent(context, IntercomPostActivity.class);
        Part r8 = part;
        LastParticipatingAdmin r82 = lastParticipatingAdmin;
        Intent $r2 = r7.putExtra(PARCEL_PART, r8).putExtra(LAST_PARTICIPANT, r82).putExtra(POST_PREVIEW, z);
        boolean $z0 = TextUtils.isEmpty(str);
        if (!$z0) {
            $r2.putExtra(PARCEL_CONVERSATION_ID, str);
        }
        ClassLoader $r6 = Part.class.getClassLoader();
        $r2.setExtrasClassLoader($r6);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void animateComposer() {
        View $r1 = this.composerLayout;
        float $f0 = $r1.getY();
        int $i0 = ScreenUtils.dpToPx(156.0f, this);
        float $f1 = $i0;
        $r1.setY($f0 + $f1);
        this.composerLayout.setVisibility(0);
        EditText $r2 = this.textComposer;
        $r2.setVisibility(0);
        ViewPropertyAnimator $r3 = this.composerLayout.animate();
        OvershootInterpolator $r4 = new OvershootInterpolator(0.6f);
        $r3.setInterpolator($r4).translationY(0.0f).setDuration(300L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void animateContent() {
        FrameLayout $r1 = this.postContainer;
        float $f0 = $r1.getY();
        int $i0 = ScreenUtils.dpToPx(400.0f, this);
        float $f1 = $i0;
        $r1.setY($f0 + $f1);
        this.postContainer.setVisibility(0);
        ViewPropertyAnimator $r2 = this.postContainer.animate();
        OvershootInterpolator $r3 = new OvershootInterpolator(0.6f);
        $r2.setInterpolator($r3).translationY(0.0f).setDuration(300L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void animateToolbar(IntercomToolbar intercomToolbar) {
        IntercomToolbar r5 = intercomToolbar;
        float $f0 = r5.getY();
        int $i0 = ScreenUtils.dpToPx(200.0f, this);
        float $f1 = $i0;
        IntercomToolbar r52 = intercomToolbar;
        r52.setY($f0 + $f1);
        IntercomToolbar r53 = intercomToolbar;
        r53.setVisibility(0);
        IntercomToolbar r54 = intercomToolbar;
        ViewPropertyAnimator $r2 = r54.animate();
        OvershootInterpolator r4 = new OvershootInterpolator(0.6f);
        $r2.setInterpolator(r4).translationY(0.0f).setDuration(300L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FullScreenInAppPresenter $r3 = this.presenter;
        $r3.closeWindow(this);
        boolean $z0 = this.isPreview;
        if ($z0) {
            MetricTracker $r4 = this.metricTracker;
            String $r1 = this.conversationId;
            Part $r5 = this.part;
            String $r2 = $r5.getId();
            $r4.closedInAppFromFull($r1, $r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int $i0 = view.getId();
        int $i1 = C10110R.C10112id.post_touch_target;
        if ($i0 == $i1) {
            FullScreenInAppPresenter $r2 = this.presenter;
            $r2.closeWindow(this);
            boolean $z0 = this.isPreview;
            if ($z0) {
                MetricTracker $r3 = this.metricTracker;
                String $r4 = this.conversationId;
                Part $r5 = this.part;
                String $r6 = $r5.getId();
                $r3.openedConversationFromFull($r4, $r6);
                String $r42 = this.conversationId;
                LastParticipatingAdmin $r7 = this.lastParticipatingAdmin;
                Intent $r8 = IntercomMessengerActivity.openConversation(this, $r42, $r7);
                startActivity($r8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        String $r20;
        super.onCreate(bundle);
        int $i0 = C10110R.C10113layout.intercom_activity_post;
        setContentView($i0);
        C10486i $r4 = ComponentCallbacks2C10478c.u(this);
        this.requestManager = $r4;
        Injector $r5 = Injector.get();
        FeedbackDialog $r6 = $r5.getApi();
        MetricTracker $r2 = $r5.getMetricTracker();
        this.metricTracker = $r2;
        Provider $r7 = $r5.getAppConfigProvider();
        int $i02 = C10110R.C10112id.intercom_toolbar;
        final IntercomToolbar intercomToolbar = (IntercomToolbar) findViewById($i02);
        InAppToolbarListener r49 = new InAppToolbarListener(this);
        intercomToolbar.setListener(r49);
        Part r50 = new Part();
        this.part = r50;
        LastParticipatingAdmin $r12 = LastParticipatingAdmin.NULL;
        this.lastParticipatingAdmin = $r12;
        TimeProvider $r14 = $r5.getTimeProvider();
        TimeFormatter r51 = new TimeFormatter(this, $r14);
        Intent $r15 = getIntent();
        Bundle $r1 = $r15.getExtras();
        if ($r1 != null) {
            ClassLoader $r17 = Part.class.getClassLoader();
            $r1.setClassLoader($r17);
            boolean $z0 = $r1.containsKey(PARCEL_PART);
            if ($z0) {
                Parcelable $r18 = $r1.getParcelable(PARCEL_PART);
                Part $r11 = (Part) $r18;
                this.part = $r11;
                if ($r11 != null) {
                    Participant $r19 = $r11.getParticipant();
                    if ($r19 != null) {
                        Part $r112 = this.part;
                        Participant $r192 = $r112.getParticipant();
                        $r20 = $r192.getForename();
                        Object $r21 = $r7.get();
                        AppConfig $r22 = (AppConfig) $r21;
                        String $r23 = $r22.getName();
                        int $i03 = C10110R.string.intercom_teammate_from_company;
                        Phrase $r24 = Phrase.from(this, $i03);
                        CharSequence $r25 = $r24.put("name", $r20).put("company", $r23).format();
                        intercomToolbar.setTitle($r25);
                    }
                }
                $r20 = "";
                Object $r212 = $r7.get();
                AppConfig $r222 = (AppConfig) $r212;
                String $r232 = $r222.getName();
                int $i032 = C10110R.string.intercom_teammate_from_company;
                Phrase $r242 = Phrase.from(this, $i032);
                CharSequence $r252 = $r242.put("name", $r20).put("company", $r232).format();
                intercomToolbar.setTitle($r252);
            }
            boolean $z02 = $r1.containsKey(PARCEL_CONVERSATION_ID);
            if ($z02) {
                String $r202 = $r1.getString(PARCEL_CONVERSATION_ID, "");
                this.conversationId = $r202;
                Store $r26 = $r5.getStore();
                String $r203 = this.conversationId;
                Action $r27 = Actions.conversationMarkedAsRead($r203);
                $r26.dispatch($r27);
                String $r204 = this.conversationId;
                $r6.markConversationAsRead($r204);
            }
            boolean $z03 = $r1.containsKey(POST_PREVIEW);
            if ($z03) {
                boolean $z04 = $r1.getBoolean(POST_PREVIEW, false);
                this.isPreview = $z04;
            }
            boolean $z05 = $r1.containsKey(LAST_PARTICIPANT);
            if ($z05) {
                Parcelable $r182 = $r1.getParcelable(LAST_PARTICIPANT);
                LastParticipatingAdmin $r122 = (LastParticipatingAdmin) $r182;
                this.lastParticipatingAdmin = $r122;
                boolean $z06 = LastParticipatingAdmin.isNull($r122);
                if (!$z06) {
                    LastParticipatingAdmin $r123 = this.lastParticipatingAdmin;
                    CharSequence $r253 = r51.getAdminActiveStatus($r123, $r7);
                    intercomToolbar.setSubtitle($r253);
                }
            }
        }
        IntercomToolbar r60 = intercomToolbar;
        r60.setVisibility(8);
        Part $r113 = this.part;
        Participant $r193 = $r113.getParticipant();
        LastParticipatingAdmin $r124 = this.lastParticipatingAdmin;
        boolean $z07 = $r124.isActive();
        ActiveStatePresenter r52 = new ActiveStatePresenter();
        Object $r213 = $r7.get();
        AppConfig $r223 = (AppConfig) $r213;
        C10486i $r42 = this.requestManager;
        intercomToolbar.setUpPostToolbar($r193, $z07, r52, $r223, $r42);
        Object $r214 = $r7.get();
        AppConfig $r224 = (AppConfig) $r214;
        int $i1 = $r224.getPrimaryColor();
        Window $r29 = getWindow();
        View $r8 = $r29.getDecorView();
        int $i04 = Color.red($i1);
        int $i2 = Color.green($i1);
        $r8.setBackgroundColor(Color.argb(153, $i04, $i2, Color.blue($i1)));
        UploadingImageCache r53 = new UploadingImageCache();
        String $r205 = this.conversationId;
        LightboxOpeningImageClickListener r54 = new LightboxOpeningImageClickListener($r6);
        LinkOpeningButtonClickListener r55 = new LinkOpeningButtonClickListener($r6);
        C10486i $r43 = this.requestManager;
        C10916e $r33 = $r5.getGson();
        C11129b $r34 = $r5.getBus();
        MetricTracker $r28 = this.metricTracker;
        ViewHolderGenerator r56 = new ViewHolderGenerator(r53, $r6, $r7, $r205, r54, r55, $r43, $r33, $r34, $r28, this);
        BlocksViewHolder $r35 = r56.getPostHolder();
        int $i05 = C10110R.C10112id.post_container;
        View $r36 = findViewById($i05);
        FrameLayout $r37 = (FrameLayout) $r36;
        this.postContainer = $r37;
        int $i06 = C10110R.C10112id.conversation_coordinator;
        View $r362 = findViewById($i06);
        this.composerLayout = $r362;
        int $i07 = C10110R.C10112id.composer_input_view;
        View $r363 = findViewById($i07);
        EditText $r38 = (EditText) $r363;
        this.textComposer = $r38;
        int $i08 = C10110R.C10112id.reaction_input_view;
        View $r364 = findViewById($i08);
        ReactionInputView $r39 = (ReactionInputView) $r364;
        this.reactionComposer = $r39;
        int $i09 = C10110R.C10112id.post_view;
        View $r365 = findViewById($i09);
        this.postView = (ContentAwareScrollView) $r365;
        Part $r114 = this.part;
        LinearLayout $r41 = ViewHolderGenerator.createPartsLayout($r35, $r114, this);
        ScrollView $r40 = this.postView;
        ScrollView r602 = $r40;
        View $r366 = BlockUtils.getBlockView(r602, $r41, this);
        ScrollView r61 = $r40;
        r61.addView($r366);
        boolean $z08 = this.isPreview;
        if ($z08) {
            Part $r115 = this.part;
            ReactionReply $r422 = $r115.getReactionReply();
            boolean $z09 = ReactionReply.isNull($r422);
            if (!$z09) {
                MetricTracker.ReactionLocation $r44 = MetricTracker.ReactionLocation.IN_APP;
                Part $r116 = this.part;
                String $r206 = $r116.getId();
                String $r233 = this.conversationId;
                FeedbackDialog $r62 = Injector.get().getApi();
                MetricTracker $r210 = this.metricTracker;
                final ConversationReactionListener r57 = new ConversationReactionListener($r44, $r206, $r233, $r62, $r210);
                this.postView.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.activities.IntercomPostActivity.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                    public void onBottomReached() {
                        IntercomPostActivity $r211 = IntercomPostActivity.this;
                        ContentAwareScrollView $r3 = $r211.postView;
                        $r3.setListener(null);
                        IntercomPostActivity $r215 = IntercomPostActivity.this;
                        View $r45 = $r215.composerLayout;
                        int $i010 = $r45.getVisibility();
                        if ($i010 != 0) {
                            IntercomPostActivity $r216 = IntercomPostActivity.this;
                            View $r46 = $r216.composerLayout;
                            $r46.setVisibility(0);
                            IntercomPostActivity $r217 = IntercomPostActivity.this;
                            ReactionInputView $r52 = $r217.reactionComposer;
                            Part $r63 = $r217.part;
                            ReactionReply $r72 = $r63.getReactionReply();
                            ReactionListener $r13 = r57;
                            IntercomPostActivity $r218 = IntercomPostActivity.this;
                            C10486i $r82 = $r218.requestManager;
                            $r52.setUpReactions($r72, true, $r13, $r82);
                        }
                    }

                    @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                    public void onScrollChanged(int i) {
                    }
                });
                ReactionInputView $r392 = this.reactionComposer;
                Part $r117 = this.part;
                ReactionReply $r423 = $r117.getReactionReply();
                C10486i $r45 = this.requestManager;
                $r392.preloadReactionImages($r423, $r45);
            }
        }
        boolean $z010 = openedFromConversation();
        if ($z010) {
            MetricTracker $r211 = this.metricTracker;
            Part $r118 = this.part;
            String $r207 = $r118.getMessageStyle();
            String $r234 = this.conversationId;
            Part $r119 = this.part;
            String $r46 = $r119.getId();
            $r211.viewedInAppFromMessenger($r207, $r234, $r46);
        }
        $r8.setAlpha(0.0f);
        ViewPropertyAnimator $r47 = $r8.animate();
        $r47.alpha(1.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomPostActivity.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomPostActivity $r215 = IntercomPostActivity.this;
                IntercomToolbar $r3 = intercomToolbar;
                $r215.animateToolbar($r3);
                IntercomPostActivity $r216 = IntercomPostActivity.this;
                $r216.animateContent();
                IntercomPostActivity $r217 = IntercomPostActivity.this;
                boolean $z011 = $r217.openedFromConversation();
                if ($z011) {
                    IntercomPostActivity $r218 = IntercomPostActivity.this;
                    View $r48 = $r218.composerLayout;
                    $r48.setVisibility(8);
                    return;
                }
                IntercomPostActivity $r219 = IntercomPostActivity.this;
                Part $r52 = $r219.part;
                ReactionReply $r63 = $r52.getReactionReply();
                boolean $z012 = ReactionReply.isNull($r63);
                if ($z012) {
                    IntercomPostActivity $r220 = IntercomPostActivity.this;
                    int $i010 = C10110R.C10112id.post_touch_target;
                    View $r49 = $r220.findViewById($i010);
                    IntercomPostActivity $r221 = IntercomPostActivity.this;
                    $r49.setOnClickListener($r221);
                    IntercomPostActivity $r225 = IntercomPostActivity.this;
                    $r225.animateComposer();
                }
            }
        }).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    boolean openedFromConversation() {
        boolean $z0 = this.isPreview;
        return !$z0;
    }
}
