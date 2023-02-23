package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.BaseCallback;
import io.intercom.android.sdk.blocks.BlocksViewHolder;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.models.Author;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Link;
import io.intercom.android.sdk.models.LinkResponse;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.package_2.ErrorObject;
import io.intercom.android.sdk.package_2.FeedbackDialog;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.ViewUtils;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomErrorView;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.google.gson.C10916e;
import java.util.List;
import p201g.p249m.p250a.p251a.C7805b;
import p425j.p429b.p430a.p431a.p432a.C11129b;
/* loaded from: classes.dex */
public class IntercomArticleActivity extends IntercomBaseActivity {
    private static final int ENTRANCE_ANIMATION_TIME_MS = 300;
    private static final int EXIT_ANIMATION_TIME_MS = 150;
    public static final String LINK_TRANSITION_KEY = "link_background";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_LINK_ID = "parcel_link_id";
    private static final String PARCEL_PART_ID = "parcel_part_id";
    private Provider<AppConfig> appConfigProvider;
    private BlocksViewHolder articleHolder;
    private TextView author;
    private ImageView avatar;
    private int avatarSize;
    private View composerLayout;
    private TextView description;
    FeedbackDialog fileInfo;
    private IntercomErrorView intercomErrorView;
    private LinearLayout linkContainer;
    FrameLayout linkView;
    ProgressBar loadingView;
    MetricTracker metricTracker;
    private ReactionInputView reactionComposer;
    private C10486i requestManager;
    ContentAwareScrollView scrollView;
    private TimeFormatter timeFormatter;
    private TextView title;
    FrameLayout titleBar;
    TextView titleBarText;
    private TextView updated;
    String conversationId = "";
    private String partId = "";
    String linkId = "";
    int titleSize = 0;
    boolean titleBarEnabled = false;
    private final BaseCallback<LinkResponse.Builder> apiCallback = new BaseCallback<LinkResponse.Builder>() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.3
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected void onError(ErrorObject errorObject) {
            IntercomArticleActivity $r3 = IntercomArticleActivity.this;
            RelativeLayout $r1 = $r3.intercomErrorView;
            RelativeLayout r6 = $r1;
            r6.setVisibility(0);
            IntercomArticleActivity $r32 = IntercomArticleActivity.this;
            ProgressBar $r4 = $r32.loadingView;
            $r4.setVisibility(8);
            IntercomArticleActivity $r33 = IntercomArticleActivity.this;
            ScrollView $r5 = $r33.scrollView;
            ScrollView r7 = $r5;
            r7.setVisibility(8);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected void onSuccess(LinkResponse.Builder builder) {
            IntercomArticleActivity $r2 = IntercomArticleActivity.this;
            ScrollView $r3 = $r2.scrollView;
            ScrollView r11 = $r3;
            r11.setVisibility(0);
            IntercomArticleActivity $r22 = IntercomArticleActivity.this;
            ProgressBar $r4 = $r22.loadingView;
            $r4.setVisibility(8);
            IntercomArticleActivity $r23 = IntercomArticleActivity.this;
            RelativeLayout $r5 = $r23.intercomErrorView;
            RelativeLayout r12 = $r5;
            r12.setVisibility(8);
            IntercomArticleActivity $r24 = IntercomArticleActivity.this;
            LinkResponse $r6 = builder.build();
            Link $r7 = $r6.getLink();
            $r24.updateContent($r7);
            IntercomArticleActivity $r25 = IntercomArticleActivity.this;
            MetricTracker $r8 = $r25.metricTracker;
            String $r9 = $r25.conversationId;
            String $r10 = $r25.linkId;
            $r8.viewedArticle($r9, $r10);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            LinkResponse.Builder $r2 = (LinkResponse.Builder) obj;
            onSuccess($r2);
        }
    };

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildIntent(Context context, String str, String str2) {
        Intent $r2 = buildIntent(context, str, null, str2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent buildIntent(Context context, String str, String str2, String str3) {
        Intent $r3 = new Intent(context, IntercomArticleActivity.class);
        $r3.putExtra(PARCEL_LINK_ID, str);
        if (str2 != null) {
            $r3.putExtra(PARCEL_PART_ID, str2);
        }
        $r3.putExtra(PARCEL_CONVERSATION_ID, str3);
        $r3.setFlags(268435456);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Transition enterTransition() {
        ChangeBounds r3 = new ChangeBounds();
        TimeInterpolator r4 = new C7805b();
        TimeInterpolator r5 = r4;
        r3.setInterpolator(r5);
        r3.setDuration(300L);
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void fadeOutView(View view) {
        ViewPropertyAnimator $r2 = view.animate();
        $r2.alpha(0.0f).setDuration(150L).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private Transition returnTransition() {
        ChangeBounds r3 = new ChangeBounds();
        TimeInterpolator r4 = new C7805b();
        TimeInterpolator r5 = r4;
        r3.setInterpolator(r5);
        r3.setDuration(150L);
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void setAuthorSpannable(String str) {
        String $r4 = "Written by " + str;
        SpannableStringBuilder $r1 = new SpannableStringBuilder($r4);
        int $i0 = $r1.length();
        int $i1 = str.length();
        StyleSpan $r5 = new StyleSpan(1);
        $r1.setSpan($r5, $i0 - $i1, $i0, 33);
        TextView $r6 = this.author;
        $r6.setText($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateContent(final Link link) {
        Author $r2 = link.getAuthor();
        Avatar $r4 = Avatar.create($r2.getAvatar(), "");
        ImageView $r5 = this.avatar;
        int $i0 = this.avatarSize;
        Provider $r6 = this.appConfigProvider;
        Object $r7 = $r6.get();
        AppConfig $r8 = (AppConfig) $r7;
        C10486i $r9 = this.requestManager;
        AvatarUtils.createAvatar($r4, $r5, $i0, $r8, $r9);
        String $r3 = link.getDescription();
        boolean $z0 = TextUtils.isEmpty($r3);
        if ($z0) {
            TextView $r10 = this.description;
            $r10.setVisibility(8);
        } else {
            TextView $r102 = this.description;
            $r102.setVisibility(0);
            TextView $r103 = this.description;
            $r103.setText($r3);
        }
        String $r32 = link.getTitle();
        TextView $r104 = this.title;
        $r104.setText($r32);
        TextView $r105 = this.titleBarText;
        $r105.setText($r32);
        Author $r22 = link.getAuthor();
        setAuthorSpannable($r22.getFirstName());
        TextView $r106 = this.updated;
        TimeFormatter $r11 = this.timeFormatter;
        long $l1 = link.getUpdatedAt();
        CharSequence $r12 = $r11.getUpdated($l1);
        $r106.setText($r12);
        BlocksViewHolder $r13 = this.articleHolder;
        List $r14 = link.getBlocks();
        LinearLayout $r15 = ViewHolderGenerator.createLayoutFromBlocks($r13, $r14, this);
        LinearLayout $r16 = this.linkContainer;
        View $r17 = BlockUtils.getBlockView($r16, $r15, this);
        $r16.addView($r17);
        TextView $r107 = this.title;
        int $i02 = $r107.getMeasuredHeight();
        this.titleSize = $i02;
        ContentAwareScrollView $r18 = this.scrollView;
        $r18.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.4
            @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
            public void onBottomReached() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
            public void onScrollChanged(int i) {
                IntercomArticleActivity $r1 = IntercomArticleActivity.this;
                boolean $z02 = $r1.titleBarEnabled;
                if ($z02) {
                    int $i1 = i - $r1.titleSize;
                    FrameLayout $r23 = $r1.titleBar;
                    float $f0 = $i1;
                    $r23.setAlpha($f0 / 100.0f);
                    IntercomArticleActivity $r19 = IntercomArticleActivity.this;
                    TextView $r33 = $r19.titleBarText;
                    FrameLayout $r24 = $r19.titleBar;
                    int $i03 = $r24.getHeight();
                    float $f02 = $i1 - $i03;
                    $r33.setAlpha($f02 / 100.0f);
                }
            }
        });
        ScrollView $r182 = this.scrollView;
        ScrollView r36 = $r182;
        r36.setAlpha(0.0f);
        ScrollView $r183 = this.scrollView;
        ScrollView r362 = $r183;
        ViewPropertyAnimator $r20 = r362.animate();
        $r20.alpha(1.0f).setDuration(300L).start();
        boolean $z02 = ReactionReply.isNull(link.getReactionReply());
        if (!$z02) {
            ReactionReply $r21 = link.getReactionReply();
            Resources $r222 = getResources();
            int $i03 = C10110R.dimen.intercom_link_reaction_height;
            int $i04 = $r222.getDimensionPixelSize($i03);
            ScrollView $r184 = this.scrollView;
            ScrollView r363 = $r184;
            int $i2 = r363.getPaddingLeft();
            ScrollView $r23 = this.scrollView;
            ScrollView r364 = $r23;
            int $i3 = r364.getPaddingTop();
            ScrollView $r232 = this.scrollView;
            ScrollView r365 = $r232;
            int $i4 = r365.getPaddingRight();
            ScrollView r366 = $r184;
            r366.setPadding($i2, $i3, $i4, $i04);
            ReactionInputView $r24 = this.reactionComposer;
            C10486i $r92 = this.requestManager;
            $r24.preloadReactionImages($r21, $r92);
            ReactionInputView $r242 = this.reactionComposer;
            ReactionListener reactionListener = new ReactionListener() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // io.intercom.android.sdk.conversation.ReactionListener
                public void onReactionSelected(Reaction reaction) {
                    Injector $r25 = Injector.get();
                    FeedbackDialog $r33 = $r25.getApi();
                    Link $r42 = link;
                    String $r52 = $r42.getId();
                    int $i05 = reaction.getIndex();
                    $r33.reactToLink($r52, null, $i05, false);
                    IntercomArticleActivity $r62 = IntercomArticleActivity.this;
                    MetricTracker $r72 = $r62.metricTracker;
                    String $r53 = $r62.conversationId;
                    String $r82 = $r62.partId;
                    int $i06 = reaction.getIndex();
                    MetricTracker.ReactionLocation $r93 = MetricTracker.ReactionLocation.LINK;
                    $r72.sentReaction($r53, $r82, $i06, $r93);
                    IntercomArticleActivity $r63 = IntercomArticleActivity.this;
                    int $i07 = C10110R.C10112id.reaction_text;
                    View $r108 = $r63.findViewById($i07);
                    TextView $r112 = (TextView) $r108;
                    int $i08 = C10110R.string.intercom_article_response;
                    $r112.setText($i08);
                }
            };
            C10486i $r93 = this.requestManager;
            $r242.setUpReactions($r21, false, reactionListener, $r93);
            View $r172 = this.composerLayout;
            $r172.setVisibility(0);
            View $r173 = this.composerLayout;
            float $f0 = $r173.getY();
            float $f1 = $i04;
            $r173.setY($f0 + $f1);
            View $r174 = this.composerLayout;
            ViewPropertyAnimator $r202 = $r174.animate();
            OvershootInterpolator r33 = new OvershootInterpolator(1.0f);
            $r202.setInterpolator(r33).translationY(0.0f).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.6
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IntercomArticleActivity $r25 = IntercomArticleActivity.this;
                    FrameLayout $r33 = $r25.linkView;
                    $r33.setClipChildren(false);
                }
            }).start();
            Integer $r28 = $r21.getReactionIndex();
            if ($r28 != null) {
                int $i05 = C10110R.C10112id.reaction_text;
                View $r175 = findViewById($i05);
                TextView $r108 = (TextView) $r175;
                int $i06 = C10110R.string.intercom_article_response;
                $r108.setText($i06);
            }
        }
        ScrollView $r185 = this.scrollView;
        ScrollView r367 = $r185;
        ViewTreeObserver $r29 = r367.getViewTreeObserver();
        $r29.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.7
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IntercomArticleActivity $r1 = IntercomArticleActivity.this;
                View $r25 = $r1.scrollView;
                View $r42 = $r25;
                ViewUtils.removeGlobalLayoutListener($r42, this);
                IntercomArticleActivity $r19 = IntercomArticleActivity.this;
                FrameLayout $r33 = $r19.linkView;
                int $i07 = $r33.getMeasuredHeight();
                float $f02 = $i07;
                IntercomArticleActivity $r110 = IntercomArticleActivity.this;
                ScrollView $r26 = $r110.scrollView;
                ScrollView r5 = $r26;
                View $r43 = r5.getChildAt(0);
                int $i08 = $r43.getMeasuredHeight();
                float $f12 = $i08;
                if ($f12 > $f02 * 1.5f) {
                    IntercomArticleActivity $r111 = IntercomArticleActivity.this;
                    $r111.titleBarEnabled = true;
                }
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void closeLink() {
        this.titleBarEnabled = false;
        View $r1 = this.scrollView;
        View $r2 = $r1;
        fadeOutView($r2);
        View $r22 = this.composerLayout;
        fadeOutView($r22);
        FrameLayout $r3 = this.titleBar;
        fadeOutView($r3);
        supportFinishAfterTransition();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        MetricTracker $r1 = this.metricTracker;
        String $r2 = this.conversationId;
        String $r3 = this.linkId;
        $r1.closedArticle($r2, $r3, 1);
        closeLink();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10110R.C10113layout.intercom_activity_article);
        Intent $r10 = getIntent();
        Bundle $r9 = $r10.getExtras();
        if ($r9 != null) {
            String $r4 = $r9.getString(PARCEL_CONVERSATION_ID, "");
            this.conversationId = $r4;
            String $r42 = $r9.getString(PARCEL_PART_ID, "");
            this.partId = $r42;
            String $r43 = $r9.getString(PARCEL_LINK_ID, "");
            this.linkId = $r43;
        }
        C10486i $r7 = ComponentCallbacks2C10478c.u(this);
        this.requestManager = $r7;
        Injector $r11 = Injector.get();
        Provider $r3 = $r11.getAppConfigProvider();
        this.appConfigProvider = $r3;
        FeedbackDialog $r2 = $r11.getApi();
        this.fileInfo = $r2;
        String $r44 = this.linkId;
        $r2.getLink($r44, this.apiCallback);
        MetricTracker $r8 = $r11.getMetricTracker();
        this.metricTracker = $r8;
        Provider $r32 = this.appConfigProvider;
        Object $r13 = $r32.get();
        int $i0 = ColorUtils.primaryOrDarkColor(this, (AppConfig) $r13);
        TimeProvider $r16 = $r11.getTimeProvider();
        TimeFormatter $r15 = new TimeFormatter(this, $r16);
        this.timeFormatter = $r15;
        int $i1 = C10110R.C10112id.link_view;
        View $r17 = findViewById($i1);
        FrameLayout $r18 = (FrameLayout) $r17;
        this.linkView = $r18;
        int $i12 = C10110R.C10112id.link_title_bar;
        View $r172 = findViewById($i12);
        FrameLayout $r182 = (FrameLayout) $r172;
        this.titleBar = $r182;
        int $i13 = C10110R.C10112id.title_bar_text;
        View $r173 = findViewById($i13);
        TextView $r19 = (TextView) $r173;
        this.titleBarText = $r19;
        $r19.setTextColor($i0);
        int $i14 = C10110R.C10112id.loading_view;
        View $r174 = findViewById($i14);
        ProgressBar $r20 = (ProgressBar) $r174;
        this.loadingView = $r20;
        int $i15 = C10110R.C10112id.title;
        View $r175 = findViewById($i15);
        TextView $r192 = (TextView) $r175;
        this.title = $r192;
        $r192.setTextColor($i0);
        int $i16 = C10110R.C10112id.description;
        View $r176 = findViewById($i16);
        this.description = (TextView) $r176;
        int $i17 = C10110R.C10112id.reaction_input_view;
        View $r177 = findViewById($i17);
        ReactionInputView $r21 = (ReactionInputView) $r177;
        this.reactionComposer = $r21;
        int $i18 = C10110R.C10112id.link_composer_container;
        View $r178 = findViewById($i18);
        this.composerLayout = $r178;
        int $i19 = C10110R.C10112id.author;
        View $r179 = findViewById($i19);
        this.author = (TextView) $r179;
        int $i110 = C10110R.C10112id.updated;
        View $r1710 = findViewById($i110);
        this.updated = (TextView) $r1710;
        Resources $r22 = getResources();
        int $i111 = C10110R.dimen.intercom_avatar_size;
        this.avatarSize = $r22.getDimensionPixelSize($i111);
        int $i112 = C10110R.C10112id.avatar_view;
        View $r1711 = findViewById($i112);
        ImageView $r23 = (ImageView) $r1711;
        this.avatar = $r23;
        UploadingImageCache $r1 = new UploadingImageCache();
        FeedbackDialog $r24 = this.fileInfo;
        Provider $r33 = this.appConfigProvider;
        String $r45 = this.conversationId;
        LightboxOpeningImageClickListener $r5 = new LightboxOpeningImageClickListener($r24);
        FeedbackDialog $r25 = this.fileInfo;
        LinkOpeningButtonClickListener $r6 = new LinkOpeningButtonClickListener($r25);
        C10486i $r72 = this.requestManager;
        C10916e $r26 = $r11.getGson();
        C11129b $r27 = $r11.getBus();
        MetricTracker $r82 = this.metricTracker;
        ViewHolderGenerator $r242 = new ViewHolderGenerator($r1, $r24, $r33, $r45, $r5, $r6, $r72, $r26, $r27, $r82, this);
        BlocksViewHolder $r28 = $r242.getArticleHolder();
        this.articleHolder = $r28;
        int $i113 = C10110R.C10112id.error_layout_article;
        View $r1712 = findViewById($i113);
        IntercomErrorView $r29 = (IntercomErrorView) $r1712;
        this.intercomErrorView = $r29;
        $r29.setActionButtonTextColor($i0);
        this.intercomErrorView.setActionButtonClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ProgressBar $r52 = IntercomArticleActivity.this.loadingView;
                $r52.setVisibility(0);
                IntercomArticleActivity $r46 = IntercomArticleActivity.this;
                FeedbackDialog $r62 = $r46.fileInfo;
                String $r12 = $r46.linkId;
                io.intercom.android.sdk.package_2.BaseCallback $r210 = $r46.apiCallback;
                $r62.getLink($r12, $r210);
            }
        });
        View $r1713 = findViewById(C10110R.C10112id.link_container);
        LinearLayout $r31 = (LinearLayout) $r1713;
        this.linkContainer = $r31;
        View $r1714 = findViewById(C10110R.C10112id.scroll_view);
        ContentAwareScrollView $r322 = (ContentAwareScrollView) $r1714;
        this.scrollView = $r322;
        View $r1715 = findViewById(C10110R.C10112id.dismiss);
        $r1715.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.activities.IntercomArticleActivity.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IntercomArticleActivity $r46 = IntercomArticleActivity.this;
                MetricTracker $r12 = $r46.metricTracker;
                String $r210 = $r46.conversationId;
                String $r52 = $r46.linkId;
                $r12.closedArticle($r210, $r52, 0);
                IntercomArticleActivity.this.closeLink();
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            Window $r34 = getWindow();
            Transition $r35 = enterTransition();
            $r34.setSharedElementEnterTransition($r35);
            Window $r342 = getWindow();
            Transition $r352 = returnTransition();
            $r342.setSharedElementReturnTransition($r352);
            View $r1716 = findViewById(C10110R.C10112id.link_view);
            $r1716.setTransitionName("link_background");
        }
    }
}
