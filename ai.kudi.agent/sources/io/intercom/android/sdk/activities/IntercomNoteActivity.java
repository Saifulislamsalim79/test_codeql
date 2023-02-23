package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.LinearLayout;
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
public class IntercomNoteActivity extends IntercomBaseActivity implements View.OnClickListener {
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    View composerLayout;
    String conversationId;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    private LinearLayout noteLayout;
    Part part;
    private final FullScreenInAppPresenter presenter;
    ReactionInputView reactionComposer;
    private C10486i requestManager;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IntercomNoteActivity() {
        FullScreenInAppPresenter $r1 = new FullScreenInAppPresenter();
        this.presenter = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildNoteIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin) {
        Intent r7 = new Intent(context, IntercomNoteActivity.class);
        Part r8 = part;
        LastParticipatingAdmin r82 = lastParticipatingAdmin;
        Intent $r2 = r7.putExtra(PARCEL_PART, r8).putExtra(LAST_PARTICIPANT, r82);
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
    void animateContent() {
        LinearLayout $r1 = this.noteLayout;
        $r1.setScaleX(0.9f);
        LinearLayout $r12 = this.noteLayout;
        $r12.setScaleY(0.9f);
        LinearLayout $r13 = this.noteLayout;
        $r13.setAlpha(0.0f);
        LinearLayout $r14 = this.noteLayout;
        $r14.setVisibility(0);
        LinearLayout $r15 = this.noteLayout;
        ViewPropertyAnimator $r2 = $r15.animate();
        $r2.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FullScreenInAppPresenter $r3 = this.presenter;
        $r3.closeWindow(this);
        MetricTracker $r4 = this.metricTracker;
        String $r1 = this.conversationId;
        Part $r5 = this.part;
        String $r2 = $r5.getId();
        $r4.closedInAppFromFull($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int $i0 = view.getId();
        int $i1 = C10110R.C10112id.note_touch_target;
        if ($i0 == $i1) {
            FullScreenInAppPresenter $r2 = this.presenter;
            $r2.closeWindow(this);
            MetricTracker $r3 = this.metricTracker;
            String $r4 = this.conversationId;
            Part $r5 = this.part;
            String $r6 = $r5.getId();
            $r3.closedInAppFromFull($r4, $r6);
            String $r42 = this.conversationId;
            LastParticipatingAdmin $r7 = this.lastParticipatingAdmin;
            Intent $r8 = IntercomMessengerActivity.openConversation(this, $r42, $r7);
            startActivity($r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        String $r21;
        super.onCreate(bundle);
        int $i0 = C10110R.C10113layout.intercom_activity_note;
        setContentView($i0);
        C10486i $r2 = ComponentCallbacks2C10478c.u(this);
        this.requestManager = $r2;
        int $i02 = C10110R.C10112id.note_layout;
        View $r3 = findViewById($i02);
        LinearLayout linearLayout = (LinearLayout) $r3;
        this.noteLayout = linearLayout;
        linearLayout.setVisibility(4);
        int $i03 = C10110R.C10112id.reaction_input_view;
        View $r32 = findViewById($i03);
        this.reactionComposer = (ReactionInputView) $r32;
        int $i04 = C10110R.C10112id.intercom_toolbar;
        View $r33 = findViewById($i04);
        IntercomToolbar intercomToolbar = (IntercomToolbar) $r33;
        InAppToolbarListener r45 = new InAppToolbarListener(this);
        intercomToolbar.setListener(r45);
        Part r46 = new Part();
        this.part = r46;
        LastParticipatingAdmin $r9 = LastParticipatingAdmin.NULL;
        this.lastParticipatingAdmin = $r9;
        Injector $r10 = Injector.get();
        FeedbackDialog $r11 = $r10.getApi();
        MetricTracker $r12 = $r10.getMetricTracker();
        this.metricTracker = $r12;
        Provider $r13 = $r10.getAppConfigProvider();
        TimeProvider $r15 = $r10.getTimeProvider();
        TimeFormatter r47 = new TimeFormatter(this, $r15);
        Intent $r16 = getIntent();
        Bundle $r1 = $r16.getExtras();
        if ($r1 != null) {
            ClassLoader $r18 = Part.class.getClassLoader();
            $r1.setClassLoader($r18);
            boolean $z0 = $r1.containsKey(PARCEL_PART);
            if ($z0) {
                Parcelable $r19 = $r1.getParcelable(PARCEL_PART);
                Part $r8 = (Part) $r19;
                this.part = $r8;
                if ($r8 != null) {
                    Participant $r20 = $r8.getParticipant();
                    if ($r20 != null) {
                        Part $r82 = this.part;
                        Participant $r202 = $r82.getParticipant();
                        $r21 = $r202.getForename();
                        Object $r22 = $r13.get();
                        AppConfig $r23 = (AppConfig) $r22;
                        String $r24 = $r23.getName();
                        int $i05 = C10110R.string.intercom_teammate_from_company;
                        Phrase $r25 = Phrase.from(this, $i05);
                        CharSequence $r26 = $r25.put("name", $r21).put("company", $r24).format();
                        intercomToolbar.setTitle($r26);
                    }
                }
                $r21 = "";
                Object $r222 = $r13.get();
                AppConfig $r232 = (AppConfig) $r222;
                String $r242 = $r232.getName();
                int $i052 = C10110R.string.intercom_teammate_from_company;
                Phrase $r252 = Phrase.from(this, $i052);
                CharSequence $r262 = $r252.put("name", $r21).put("company", $r242).format();
                intercomToolbar.setTitle($r262);
            }
            boolean $z02 = $r1.containsKey(PARCEL_CONVERSATION_ID);
            if ($z02) {
                String $r212 = $r1.getString(PARCEL_CONVERSATION_ID);
                this.conversationId = $r212;
                Store $r27 = $r10.getStore();
                String $r213 = this.conversationId;
                Action $r28 = Actions.conversationMarkedAsRead($r213);
                $r27.dispatch($r28);
                String $r214 = this.conversationId;
                $r11.markConversationAsRead($r214);
            }
            boolean $z03 = $r1.containsKey(LAST_PARTICIPANT);
            if ($z03) {
                Parcelable $r192 = $r1.getParcelable(LAST_PARTICIPANT);
                LastParticipatingAdmin $r92 = (LastParticipatingAdmin) $r192;
                this.lastParticipatingAdmin = $r92;
                boolean $z04 = LastParticipatingAdmin.isNull($r92);
                if (!$z04) {
                    LastParticipatingAdmin $r93 = this.lastParticipatingAdmin;
                    CharSequence $r263 = r47.getAdminActiveStatus($r93, $r13);
                    intercomToolbar.setSubtitle($r263);
                }
            }
        }
        Part $r83 = this.part;
        Participant $r203 = $r83.getParticipant();
        LastParticipatingAdmin $r94 = this.lastParticipatingAdmin;
        boolean $z05 = $r94.isActive();
        ActiveStatePresenter r48 = new ActiveStatePresenter();
        Object $r223 = $r13.get();
        AppConfig $r233 = (AppConfig) $r223;
        C10486i $r29 = this.requestManager;
        intercomToolbar.setUpNoteToolbar($r203, $z05, r48, $r233, $r29);
        UploadingImageCache r49 = new UploadingImageCache();
        String $r215 = this.conversationId;
        LightboxOpeningImageClickListener r50 = new LightboxOpeningImageClickListener($r11);
        LinkOpeningButtonClickListener r51 = new LinkOpeningButtonClickListener($r11);
        C10486i $r210 = this.requestManager;
        C10916e $r34 = $r10.getGson();
        C11129b $r35 = $r10.getBus();
        MetricTracker $r122 = this.metricTracker;
        ViewHolderGenerator r52 = new ViewHolderGenerator(r49, $r11, $r13, $r215, r50, r51, $r210, $r34, $r35, $r122, this);
        BlocksViewHolder $r36 = r52.getNoteHolder();
        int $i06 = C10110R.C10112id.note_composer_container;
        View $r37 = findViewById($i06);
        this.composerLayout = $r37;
        int $i07 = C10110R.C10112id.note_view;
        View $r38 = findViewById($i07);
        final ContentAwareScrollView $r372 = (ContentAwareScrollView) $r38;
        Part $r84 = this.part;
        LinearLayout $r4 = ViewHolderGenerator.createPartsLayout($r36, $r84, this);
        ContentAwareScrollView r56 = $r372;
        View $r39 = BlockUtils.getBlockView(r56, $r4, this);
        ContentAwareScrollView r57 = $r372;
        r57.addView($r39);
        Part $r85 = this.part;
        ReactionReply $r382 = $r85.getReactionReply();
        boolean $z06 = ReactionReply.isNull($r382);
        if (!$z06) {
            MetricTracker.ReactionLocation $r40 = MetricTracker.ReactionLocation.IN_APP;
            Part $r86 = this.part;
            String $r216 = $r86.getId();
            String $r243 = this.conversationId;
            FeedbackDialog $r112 = Injector.get().getApi();
            MetricTracker $r123 = this.metricTracker;
            final ConversationReactionListener r53 = new ConversationReactionListener($r40, $r216, $r243, $r112, $r123);
            $r372.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.activities.IntercomNoteActivity.1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onBottomReached() {
                    ContentAwareScrollView $r211 = $r372;
                    $r211.setListener(null);
                    View $r42 = IntercomNoteActivity.this.composerLayout;
                    $r42.setVisibility(0);
                    IntercomNoteActivity $r310 = IntercomNoteActivity.this;
                    ReactionInputView $r5 = $r310.reactionComposer;
                    Part $r6 = $r310.part;
                    ReactionReply $r7 = $r6.getReactionReply();
                    ReactionListener $r14 = r53;
                    C10486i $r87 = IntercomNoteActivity.this.requestManager;
                    $r5.setUpReactions($r7, true, $r14, $r87);
                }

                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onScrollChanged(int i) {
                }
            });
            ReactionInputView $r5 = this.reactionComposer;
            Part $r87 = this.part;
            ReactionReply $r383 = $r87.getReactionReply();
            C10486i $r211 = this.requestManager;
            $r5.preloadReactionImages($r383, $r211);
        }
        Window $r42 = getWindow();
        View $r310 = $r42.getDecorView();
        $r310.setAlpha(0.0f);
        ViewPropertyAnimator $r43 = $r310.animate();
        $r43.alpha(1.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomNoteActivity.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomNoteActivity $r217 = IntercomNoteActivity.this;
                $r217.animateContent();
                IntercomNoteActivity $r218 = IntercomNoteActivity.this;
                Part $r311 = $r218.part;
                ReactionReply $r44 = $r311.getReactionReply();
                boolean $z07 = ReactionReply.isNull($r44);
                if ($z07) {
                    IntercomNoteActivity $r219 = IntercomNoteActivity.this;
                    View $r52 = $r219.composerLayout;
                    $r52.setVisibility(0);
                    IntercomNoteActivity $r220 = IntercomNoteActivity.this;
                    int $i08 = C10110R.C10112id.note_touch_target;
                    View $r53 = $r220.findViewById($i08);
                    IntercomNoteActivity $r221 = IntercomNoteActivity.this;
                    $r53.setOnClickListener($r221);
                    IntercomNoteActivity $r224 = IntercomNoteActivity.this;
                    int $i09 = C10110R.C10112id.composer_input_view;
                    View $r54 = $r224.findViewById($i09);
                    $r54.setVisibility(0);
                }
            }
        }).start();
    }
}
