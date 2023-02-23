package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.conversation.ConversationFragment;
import io.intercom.android.sdk.homescreen.HomeClickListener;
import io.intercom.android.sdk.homescreen.HomeFragment;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.inbox.InboxFragment;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.state.InboxState;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class IntercomMessengerActivity extends IntercomBaseActivity implements InboxFragment.Listener, ConversationFragment.Listener, HomeClickListener {
    static final String LAST_PARTICIPANT = "last_participant";
    static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    static final String PARCEL_INITIAL_MESSAGE = "parcel_initial_message";
    static final String SHOW_HOME_SCREEN = "showHomeScreen";
    static final String SHOW_INBOX = "showInbox";
    private ActivityFinisher activityFinisher;
    private Provider<AppConfig> appConfigProvider;
    View background;
    ValueAnimator colorAnimation;
    private View containerView;
    private HomeFragment homeFragment;
    private InboxFragment inboxFragment;
    private boolean isTwoPane;
    private MetricTracker metricTracker;
    private final Twig twig;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IntercomMessengerActivity() {
        Twig $r1 = LumberMill.getLogger();
        this.twig = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void animateBackgroundColor() {
        Window $r3 = getWindow();
        View $r1 = $r3.getDecorView();
        this.background = $r1;
        int $i0 = C1335a.m36324d(this, 17170445);
        int $i1 = C10110R.color.intercom_transparent_black;
        int $i12 = C1335a.m36324d(this, $i1);
        View $r12 = this.background;
        BackgroundUtils.animateBackground($i0, $i12, 200, $r12, new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomMessengerActivity.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomMessengerActivity $r32 = IntercomMessengerActivity.this;
                View $r4 = $r32.background;
                $r4.post(new Runnable() { // from class: io.intercom.android.sdk.activities.IntercomMessengerActivity.1.1
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public void run() {
                        C101281 $r13 = C101281.this;
                        IntercomMessengerActivity $r2 = IntercomMessengerActivity.this;
                        $r2.animateSdkWindowIn();
                    }
                });
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void applyBackOrCloseMessenger() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 == 0) {
            MetricTracker $r2 = this.metricTracker;
            $r2.closedMessengerBackButton();
            closeMessenger();
            return;
        }
        trackMoveToConversationListMetric();
        hideKeyboard();
        super.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void closeMessenger() {
        hideKeyboard();
        showBackgroundColour();
        View $r1 = this.containerView;
        ViewPropertyAnimator $r2 = $r1.animate();
        Window $r3 = getWindow();
        View $r12 = $r3.getDecorView();
        int $i0 = $r12.getHeight();
        float $f0 = $i0;
        ViewPropertyAnimator $r22 = $r2.y($f0);
        OvershootInterpolator $r4 = new OvershootInterpolator();
        $r22.setInterpolator($r4).setDuration(600L).start();
        fadeOutBackground();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void displayConversation(String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z, boolean z2, String str2) {
        List $r4 = Collections.emptyList();
        displayConversation(str, lastParticipatingAdmin, z, z2, str2, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void displayConversation(String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z, boolean z2, String str2, List list) {
        boolean $z2 = this.isTwoPane;
        ConversationFragment $r5 = ConversationFragment.newInstance(str, lastParticipatingAdmin, z, $z2, str2, list);
        String $r3 = ConversationFragment.class.getName();
        displayFragment($r5, $r3, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void displayFragment(androidx.fragment.app.Fragment r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            io.intercom.android.sdk.twig.Twig r0 = r8.twig
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "displaying "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = "frag"
            r0.internal(r2, r3)
            androidx.fragment.app.FragmentManager r4 = r8.getSupportFragmentManager()
            androidx.fragment.app.b0 r5 = r4.m35924l()
            boolean r6 = r9 instanceof io.intercom.android.sdk.conversation.ConversationFragment
            if (r6 == 0) goto L2b
            boolean r6 = r8.isTwoPane
            if (r6 == 0) goto L2b
            int r7 = io.intercom.android.sdk.C10110R.C10112id.conversation_fragment
            goto L2d
        L2b:
            int r7 = io.intercom.android.sdk.C10110R.C10112id.inbox_fragment
        L2d:
            r5.m35820s(r7, r9, r10)
            if (r11 == 0) goto L52
            io.intercom.android.sdk.twig.Twig r0 = r8.twig
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "adding "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = " to the back stack"
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = "frag"
            r0.internal(r2, r3)
            r5.m35824g(r10)
        L52:
            r5.mo35804j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.activities.IntercomMessengerActivity.displayFragment(androidx.fragment.app.Fragment, java.lang.String, boolean):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void fadeOutBackground() {
        int $i0 = C1335a.m36324d(this, 17170445);
        int $i1 = C10110R.color.intercom_transparent_black;
        int $i12 = C1335a.m36324d(this, $i1);
        ArgbEvaluator $r1 = new ArgbEvaluator();
        Integer $r3 = Integer.valueOf($i12);
        Integer $r32 = Integer.valueOf($i0);
        Object[] $r2 = {$r3, $r32};
        ValueAnimator $r4 = ValueAnimator.ofObject($r1, $r2);
        this.colorAnimation = $r4;
        $r4.setDuration(300L);
        this.colorAnimation.setStartDelay(100L);
        this.colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.activities.IntercomMessengerActivity.3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IntercomMessengerActivity $r22 = IntercomMessengerActivity.this;
                View $r33 = $r22.background;
                Object $r42 = valueAnimator.getAnimatedValue();
                Integer $r5 = (Integer) $r42;
                int $i02 = $r5.intValue();
                $r33.setBackgroundColor($i02);
            }
        });
        this.colorAnimation.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomMessengerActivity.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomMessengerActivity $r22 = IntercomMessengerActivity.this;
                $r22.finish();
                IntercomMessengerActivity $r23 = IntercomMessengerActivity.this;
                $r23.overridePendingTransition(0, 0);
            }
        });
        this.colorAnimation.start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private LastParticipatingAdmin getLastParticipatingAdmin(Conversation conversation) {
        LastParticipatingAdmin $r2 = conversation.getLastParticipatingAdmin();
        boolean $z0 = LastParticipatingAdmin.isNull($r2);
        return $z0 ? LastParticipatingAdmin.NONE : $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private int getScreenHeight() {
        View $r1 = findViewById(16908290);
        int $i0 = $r1.getMeasuredHeight();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean hasLoadedFragment(String str) {
        FragmentManager $r2 = getSupportFragmentManager();
        Fragment $r3 = $r2.m35938g0(str);
        return $r3 != null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void hideKeyboard() {
        View $r1 = getCurrentFocus();
        if ($r1 != null) {
            Object $r2 = getSystemService("input_method");
            InputMethodManager $r3 = (InputMethodManager) $r2;
            IBinder $r4 = $r1.getWindowToken();
            $r3.hideSoftInputFromWindow($r4, 0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent openComposer(Context context, String str) {
        Intent $r2 = new Intent(context, IntercomMessengerActivity.class).setFlags(268435456).putExtra(SHOW_INBOX, false);
        boolean $z0 = TextUtils.isEmpty(str);
        if (!$z0) {
            $r2.putExtra(PARCEL_INITIAL_MESSAGE, str);
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent openConversation(Context context, String str, LastParticipatingAdmin lastParticipatingAdmin) {
        Intent r6 = new Intent(context, IntercomMessengerActivity.class);
        Intent $r3 = r6.setFlags(268435456).putExtra(SHOW_INBOX, false);
        boolean $z0 = TextUtils.isEmpty(str);
        if (!$z0) {
            $r3.putExtra(PARCEL_CONVERSATION_ID, str);
        }
        boolean $z02 = LastParticipatingAdmin.isNull(lastParticipatingAdmin);
        if (!$z02) {
            LastParticipatingAdmin r7 = lastParticipatingAdmin;
            $r3.putExtra(LAST_PARTICIPANT, r7);
        }
        ClassLoader $r5 = LastParticipatingAdmin.class.getClassLoader();
        $r3.setExtrasClassLoader($r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent openHomeScreen(Context context) {
        Intent $r1 = new Intent(context, IntercomMessengerActivity.class);
        return $r1.setFlags(268435456).putExtra(SHOW_HOME_SCREEN, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static Intent openInbox(Context context) {
        Intent $r1 = new Intent(context, IntercomMessengerActivity.class);
        return $r1.setFlags(268435456).putExtra(SHOW_INBOX, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void showBackgroundColour() {
        View $r1 = this.background;
        int $i0 = C10110R.color.intercom_transparent_black;
        $r1.setBackgroundResource($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void showMessenger() {
        String $r6;
        String $r7;
        boolean $z0;
        boolean $z1;
        Intent $r1 = getIntent();
        Bundle $r2 = $r1.getExtras();
        LastParticipatingAdmin $r3 = LastParticipatingAdmin.NULL;
        if ($r2 != null) {
            ClassLoader $r5 = Part.class.getClassLoader();
            $r2.setClassLoader($r5);
            $r6 = $r2.getString(PARCEL_CONVERSATION_ID, "");
            $r7 = $r2.getString(PARCEL_INITIAL_MESSAGE, "");
            $z0 = $r2.getBoolean(SHOW_HOME_SCREEN);
            $z1 = $r2.getBoolean(SHOW_INBOX);
            boolean $z2 = $r2.containsKey(LAST_PARTICIPANT);
            if ($z2) {
                Parcelable $r8 = $r2.getParcelable(LAST_PARTICIPANT);
                $r3 = (LastParticipatingAdmin) $r8;
            }
        } else {
            $r6 = "";
            $r7 = "";
            $z0 = false;
            $z1 = false;
        }
        if ($z0) {
            HomeFragment $r9 = this.homeFragment;
            String $r72 = HomeFragment.class.getName();
            displayFragment($r9, $r72, false);
        } else {
            boolean $z02 = this.isTwoPane;
            if ($z02) {
                Fragment $r10 = this.inboxFragment;
                String $r11 = InboxFragment.class.getName();
                Fragment r12 = $r10;
                displayFragment(r12, $r11, false);
                boolean $z03 = $r6.isEmpty();
                boolean $z04 = !$z03;
                boolean $z12 = $r7.isEmpty();
                boolean $z13 = !$z12;
                if ($z04 || $z13) {
                    displayConversation($r6, $r3, false, false, $r7);
                }
            } else if ($z1) {
                Fragment $r102 = this.inboxFragment;
                String $r73 = InboxFragment.class.getName();
                Fragment r122 = $r102;
                displayFragment(r122, $r73, false);
            } else {
                displayConversation($r6, $r3, false, false, $r7);
            }
        }
        animateBackgroundColor();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void trackMoveToConversationListMetric() {
        ConversationFragment $r1 = getExistingConversationFragment();
        if ($r1 != null) {
            String $r2 = $r1.getConversationId();
            boolean $z0 = TextUtils.isEmpty($r2);
            if ($z0) {
                MetricTracker $r3 = this.metricTracker;
                $r3.openConversationsListFromNewConversation();
                return;
            }
            MetricTracker $r32 = this.metricTracker;
            $r32.openConversationsListFromConversation($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void animateSdkWindowIn() {
        View $r1 = this.containerView;
        $r1.setVisibility(0);
        View $r12 = this.containerView;
        int $i0 = getScreenHeight();
        float $f0 = $i0;
        $r12.setY($f0);
        View $r13 = this.containerView;
        ViewPropertyAnimator $r2 = $r13.animate();
        ViewPropertyAnimator $r22 = $r2.y(0.0f);
        OvershootInterpolator $r3 = new OvershootInterpolator(0.6f);
        $r22.setInterpolator($r3).setDuration(350L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomMessengerActivity.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomMessengerActivity $r32 = IntercomMessengerActivity.this;
                $r32.hideBackgroundColor();
                IntercomMessengerActivity $r33 = IntercomMessengerActivity.this;
                ConversationFragment $r14 = $r33.getExistingConversationFragment();
                if ($r14 != null) {
                    $r14.sdkWindowFinishedAnimating();
                }
            }
        }).start();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    ConversationFragment getExistingConversationFragment() {
        String $r2 = ConversationFragment.class.getName();
        FragmentManager $r3 = getSupportFragmentManager();
        Fragment $r4 = $r3.m35938g0($r2);
        ConversationFragment $r5 = (ConversationFragment) $r4;
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void hideBackgroundColor() {
        View $r1 = this.background;
        int $i0 = C10110R.color.intercom_full_transparent_full_black;
        $r1.setBackgroundResource($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener, io.intercom.android.sdk.conversation.ConversationFragment.Listener
    public void onBackClicked() {
        String $r2 = HomeFragment.class.getName();
        boolean $z0 = hasLoadedFragment($r2);
        if ($z0) {
            applyBackOrCloseMessenger();
            return;
        }
        trackMoveToConversationListMetric();
        hideKeyboard();
        HomeFragment $r3 = this.homeFragment;
        String $r22 = HomeFragment.class.getName();
        displayFragment($r3, $r22, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ConversationFragment $r1 = getExistingConversationFragment();
        if ($r1 != null) {
            boolean $z0 = $r1.shouldHandleOnBackPressed();
            if ($z0) {
                $r1.handleOnBackPressed();
                return;
            }
        }
        applyBackOrCloseMessenger();
    }

    @Override // io.intercom.android.sdk.homescreen.HomeClickListener
    public void onCloseClicked() {
        finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
    public void onComposerSelected() {
        LastParticipatingAdmin $r1 = LastParticipatingAdmin.NONE;
        boolean $z0 = this.isTwoPane;
        displayConversation("", $r1, true, !$z0, "");
        MetricTracker $r2 = this.metricTracker;
        Injector $r3 = Injector.get();
        Store $r4 = $r3.getStore();
        Object $r5 = $r4.state();
        TeamPresence $r7 = ((State) $r5).teamPresence();
        String $r8 = $r7.getOfficeHours();
        boolean $z02 = $r8.isEmpty();
        $r2.newConversationFromComposeButton($z02);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View $r3 = this.containerView;
        $r3.setY(0.0f);
        View $r32 = this.containerView;
        ViewGroup.LayoutParams $r1 = $r32.getLayoutParams();
        $r1.height = -1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.homescreen.HomeClickListener
    public void onConversationClicked(Conversation conversation) {
        MetricTracker $r2 = this.metricTracker;
        String $r3 = conversation.getId();
        $r2.openedConversationFromHomeScreen($r3);
        String $r32 = conversation.getId();
        LastParticipatingAdmin $r4 = getLastParticipatingAdmin(conversation);
        boolean $z1 = conversation.isRead();
        boolean $z0 = this.isTwoPane;
        List $r5 = conversation.getGroupConversationParticipants();
        ConversationFragment $r6 = ConversationFragment.newInstance($r32, $r4, $z1, $z0, "", $r5);
        String $r33 = ConversationFragment.class.getName();
        displayFragment($r6, $r33, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
    public void onConversationSelected(Conversation conversation) {
        LastParticipatingAdmin $r3 = getLastParticipatingAdmin(conversation);
        Injector $r4 = Injector.get();
        TimeProvider $r5 = $r4.getTimeProvider();
        TimeFormatter $r1 = new TimeFormatter(this, $r5);
        String $r6 = conversation.getId();
        boolean $z1 = conversation.isRead();
        boolean $z0 = this.isTwoPane;
        List $r7 = conversation.getGroupConversationParticipants();
        displayConversation($r6, $r3, $z1, !$z0, "", $r7);
        MetricTracker $r8 = this.metricTracker;
        String $r62 = conversation.getId();
        Injector $r42 = Injector.get();
        Store $r9 = $r42.getStore();
        Object $r10 = $r9.state();
        State $r11 = (State) $r10;
        TeamPresence $r12 = $r11.teamPresence();
        String $r13 = $r12.getOfficeHours();
        boolean $z12 = $r13.isEmpty();
        boolean $z02 = $r3.isActive();
        long $l0 = $r3.getLastActiveAt();
        String $r132 = $r1.getLastActiveMinutes($l0);
        $r8.openConversationFromConversationList($r62, $z12, $z02, $r132);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener
    public void onConversationsLoaded(List list, InboxState.Status status) {
        boolean $z0 = this.isTwoPane;
        if ($z0) {
            InboxState.Status $r3 = InboxState.Status.SUCCESS;
            if (status == $r3) {
                ConversationFragment $r4 = getExistingConversationFragment();
                if ($r4 != null) {
                    return;
                }
                boolean $z02 = list.isEmpty();
                if (!$z02) {
                    Object $r5 = list.get(0);
                    Conversation $r6 = (Conversation) $r5;
                    onConversationSelected($r6);
                    return;
                }
                Provider $r7 = this.appConfigProvider;
                Object $r52 = $r7.get();
                AppConfig $r8 = (AppConfig) $r52;
                boolean $z03 = $r8.isInboundMessages();
                if ($z03) {
                    onComposerSelected();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int $i0 = C10110R.C10113layout.intercom_messenger_activity_layout;
        setContentView($i0);
        Resources $r2 = getResources();
        int $i02 = C10110R.bool.intercom_is_two_pane;
        boolean $z0 = $r2.getBoolean($i02);
        this.isTwoPane = $z0;
        HomeFragment $r3 = HomeFragment.newInstance();
        this.homeFragment = $r3;
        boolean $z02 = this.isTwoPane;
        InboxFragment $r4 = InboxFragment.newInstance($z02);
        this.inboxFragment = $r4;
        int $i03 = C10110R.C10112id.messenger_container;
        View $r5 = findViewById($i03);
        this.containerView = $r5;
        if ($r5 != null) {
            $r5.setVisibility(8);
        }
        android.app.FragmentManager $r6 = getFragmentManager();
        $r6.executePendingTransactions();
        showMessenger();
        Injector $r7 = Injector.get();
        ActivityFinisher $r8 = $r7.getActivityFinisher();
        this.activityFinisher = $r8;
        $r8.register(this);
        MetricTracker $r9 = $r7.getMetricTracker();
        this.metricTracker = $r9;
        Provider $r10 = $r7.getAppConfigProvider();
        this.appConfigProvider = $r10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ActivityFinisher $r1 = this.activityFinisher;
        $r1.unregister(this);
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.homescreen.HomeClickListener
    public void onNewConversationClicked() {
        MetricTracker $r1 = this.metricTracker;
        $r1.openedNewConversationFromHomeScreen();
        LastParticipatingAdmin $r2 = LastParticipatingAdmin.NULL;
        boolean $z0 = this.isTwoPane;
        List $r3 = Collections.emptyList();
        ConversationFragment $r4 = ConversationFragment.newInstance("", $r2, false, $z0, "", $r3);
        String $r6 = ConversationFragment.class.getName();
        displayFragment($r4, $r6, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.homescreen.HomeClickListener
    public void onReloadClicked() {
        String $r2 = HomeFragment.class.getName();
        boolean $z0 = hasLoadedFragment($r2);
        if ($z0) {
            HomeFragment $r3 = this.homeFragment;
            $r3.reload();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.homescreen.HomeClickListener
    public void onSeePreviousClicked() {
        Fragment $r1 = this.inboxFragment;
        String $r2 = InboxFragment.class.getName();
        Fragment r4 = $r1;
        displayFragment(r4, $r2, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.inbox.InboxFragment.Listener, io.intercom.android.sdk.conversation.ConversationFragment.Listener
    public void onToolbarCloseClicked() {
        MetricTracker $r1 = this.metricTracker;
        $r1.closedMessengerCloseButton();
        closeMessenger();
    }
}
