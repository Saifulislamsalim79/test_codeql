package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.LayoutDisputeIssueBinding;
import ai.kudi.agent.feature_issue_resolution.databinding.ResolutionDetailsViewBinding;
import ai.kudi.agent.feature_issue_resolution.databinding.ResolutionMessagesViewBinding;
import ai.kudi.agent.issues.adapters.ResolutionMessageAdapter;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.p008ui.RatingDialog;
import ai.kudi.agent.issues.presenters.DisputePresenter;
import ai.kudi.agent.issues.views.Disputeview;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: DisputeIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001BB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0096\u0001J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J$\u00100\u001a\u00020#2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0016J\u001a\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\t\u0010:\u001a\u00020\u0005H\u0096\u0001J\b\u0010;\u001a\u00020!H\u0002J\u0010\u0010<\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0012\u0010=\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010(H\u0016J\b\u0010?\u001a\u00020!H\u0016J\u0012\u0010@\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010A\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/issues/ui/DisputeIssueFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/issues/views/Disputeview;", "Lai/kudi/agent/issues/presenters/DisputePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/LayoutDisputeIssueBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/LayoutDisputeIssueBinding;", "globalNavigator", "Lai/kudi/agent/core/navigation/GlobalNavigator;", "getGlobalNavigator", "()Lai/kudi/agent/core/navigation/GlobalNavigator;", "setGlobalNavigator", "(Lai/kudi/agent/core/navigation/GlobalNavigator;)V", "isDisputeInitiatedFromInboxActivity", "", "ratingDialog", "Lai/kudi/agent/issues/ui/RatingDialog;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/issues/presenters/DisputePresenter;", "setThisPresenter", "(Lai/kudi/agent/issues/presenters/DisputePresenter;)V", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "getTicket", "()Lai/kudi/agent/issues/data/model/Issue$Ticket;", "setTicket", "(Lai/kudi/agent/issues/data/model/Issue$Ticket;)V", "createPresenter", "hideLoading", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "notifyUserAboutPendingTicket", MetricTracker.Object.MESSAGE, "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "requireBinding", "setTitle", "setUp", "showErrorMsg", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoading", "showRatingError", "showTicket", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.DisputeIssueFragment */
/* loaded from: classes.dex */
public final class DisputeIssueFragment extends AbstractC9412c<Disputeview, DisputePresenter> implements Disputeview, BaseViewBinder<LayoutDisputeIssueBinding> {
    public static final Companion Companion;
    public static final String DISPUTE_PREFERENCE = "DISPUTE_PREFERENCE";
    public static final String ISSUE_RESPONSE = "ISSUE_RESPONSE";
    public static final String IS_TICKET_FROM_DUPLICATE_ATTEMPT_CREATION = "DUPLICATE_ATTEMPT_CREATION";
    public static final String STARTING_POINT_NAVIGATION = "NAVIGATOR_STARTING_POINT";
    public static final String SUCCESS_SCREEN_TAG = "SUCCESS_SCREEN_TAG";
    public static final String TICKET_NUMBER = "TICKET_NUMBER";
    private final /* synthetic */ BaseViewBinderImpl<LayoutDisputeIssueBinding> $$delegate_0;
    public GlobalNavigator globalNavigator;
    private boolean isDisputeInitiatedFromInboxActivity;
    private RatingDialog ratingDialog;
    public DisputePresenter thisPresenter;
    public Issue.Ticket ticket;

    /* compiled from: DisputeIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/issues/ui/DisputeIssueFragment$Companion;", "", "()V", DisputeIssueFragment.DISPUTE_PREFERENCE, "", DisputeIssueFragment.ISSUE_RESPONSE, "IS_TICKET_FROM_DUPLICATE_ATTEMPT_CREATION", "STARTING_POINT_NAVIGATION", DisputeIssueFragment.SUCCESS_SCREEN_TAG, DisputeIssueFragment.TICKET_NUMBER, "newInstance", "Lai/kudi/agent/issues/ui/DisputeIssueFragment;", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "isFromInbox", "", "isTicketFromDuplicateCreation", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.DisputeIssueFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ DisputeIssueFragment newInstance$default(Companion companion, Issue.Ticket ticket, boolean $z0, boolean $z1, int i, Object obj) {
            int $i1 = i & 2;
            if ($i1 != 0) {
                $z0 = false;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $z1 = false;
            }
            DisputeIssueFragment $r1 = companion.newInstance(ticket, $z0, $z1);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DisputeIssueFragment newInstance(Issue.Ticket ticket, boolean z, boolean z2) {
            DisputeIssueFragment r5 = new DisputeIssueFragment();
            Bundle r6 = new Bundle();
            r6.putSerializable(DisputeIssueFragment.ISSUE_RESPONSE, ticket);
            r6.putBoolean(DisputeIssueFragment.STARTING_POINT_NAVIGATION, z);
            r6.putBoolean(DisputeIssueFragment.IS_TICKET_FROM_DUPLICATE_ATTEMPT_CREATION, z2);
            C13666w c13666w = C13666w.f30112a;
            DisputeIssueFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DisputeIssueFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final DisputeIssueFragment newInstance(Issue.Ticket ticket, boolean z, boolean z2) {
        Companion $r0 = Companion;
        DisputeIssueFragment $r1 = $r0.newInstance(ticket, z, z2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setTitle() {
        boolean $z0 = this.isDisputeInitiatedFromInboxActivity;
        if ($z0) {
            DisputeIssueFragment r7 = this;
            FragmentActivity $r1 = r7.getActivity();
            if ($r1 == null) {
                return;
            }
            Issue.Ticket $r2 = getTicket();
            String $r3 = $r2.getId();
            $r1.setTitle(Log_OC.m10359a("Ticket #", (Object) $r3));
            return;
        }
        DisputeIssueFragment r72 = this;
        FragmentActivity $r12 = r72.getActivity();
        if ($r12 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.ui.IssueActivity");
            throw r6;
        }
        IssueActivity $r4 = (IssueActivity) $r12;
        Issue.Ticket $r22 = getTicket();
        String $r32 = $r22.getId();
        $r4.setTitle(Log_OC.m10359a("Ticket #", (Object) $r32));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUp(Issue.Ticket ticket) {
        Boolean $r4;
        String $r12;
        String $r5;
        List $r22;
        boolean $z0;
        LayoutDisputeIssueBinding $r2 = requireBinding();
        DisputeIssueFragment r46 = this;
        Bundle $r3 = r46.getArguments();
        if ($r3 == null) {
            $r4 = null;
        } else {
            boolean $z02 = $r3.getBoolean(IS_TICKET_FROM_DUPLICATE_ATTEMPT_CREATION, false);
            $r4 = Boolean.valueOf($z02);
        }
        if ($r4 == null) {
            NullPointerException r45 = new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            throw r45;
        }
        boolean $z03 = $r4.booleanValue();
        if ($z03) {
            boolean $z04 = Log_OC.append(ticket.getStatus(), "RESOLVED");
            if (!$z04) {
                DisputePresenter $r6 = createPresenter();
                DisputeIssueFragment r462 = this;
                Resources $r7 = r462.getResources();
                Log_OC.loadImage($r7, "resources");
                $r6.notifyUserAboutTicketUpdate($r7);
            }
        }
        HashMap $r8 = ticket.getMeta();
        Object $r9 = $r8.get("type");
        String $r52 = (String) $r9;
        if ($r52 == null) {
            $r52 = null;
        } else {
            int $i0 = $r52.length();
            boolean $z05 = $i0 > 0;
            if ($z05) {
                StringBuilder r39 = new StringBuilder();
                char $c1 = $r52.charAt(0);
                boolean $z06 = Character.isLowerCase($c1);
                if ($z06) {
                    Locale $r11 = Locale.getDefault();
                    Log_OC.loadImage($r11, "getDefault()");
                    $r12 = C13252b.m5546d($c1, $r11);
                } else {
                    $r12 = String.valueOf($c1);
                }
                r39.append($r12.toString());
                String $r53 = $r52.substring(1);
                Log_OC.loadImage($r53, "(this as java.lang.String).substring(startIndex)");
                r39.append($r53);
                $r52 = r39.toString();
            }
        }
        Issue.Rating $r13 = ticket.getRating();
        if ($r52 != null) {
            TextView $r14 = $r2.issueTypeTextView;
            $z0 = C13277t.m5421J($r52, "_", false, 2, null);
            if ($z0) {
                $r52 = C13276s.m5451A($r52, "_", " ", false, 4, null);
            }
            $r14.setText($r52);
        } else {
            TextView $r142 = $r2.issueTypeTextView;
            $r5 = C13276s.m5451A(ticket.getTitle(), "?", "", false, 4, null);
            $r142.setText($r5);
        }
        View $r15 = $r2.disputeIssueViewTransactionDetails;
        Log_OC.loadImage($r15, "disputeIssueViewTransactionDetails");
        View r47 = $r15;
        ViewExtKt.show(r47);
        String $r54 = ticket.getStatus();
        if ($r54 != null) {
            int $i02 = $r54.hashCode();
            if ($i02 == -1957249943) {
                boolean $z07 = $r54.equals("OPENED");
                if ($z07) {
                    TextView $r16 = $r2.textPhase1;
                    DisputeIssueFragment r463 = this;
                    Context $r17 = r463.requireContext();
                    int $i03 = C0214R.color.searchEditTextColor;
                    TextView $r143 = $r16;
                    $r143.setTextColor(C1335a.m36324d($r17, $i03));
                    TextView $r162 = $r2.textPhase2;
                    DisputeIssueFragment r464 = this;
                    Context $r172 = r464.requireContext();
                    int $i04 = C0214R.color.searchEditTextColor;
                    TextView $r144 = $r162;
                    $r144.setTextColor(C1335a.m36324d($r172, $i04));
                    TextView $r145 = $r2.indicatorPhase2;
                    int $i05 = C0214R.C0215drawable.ic_check_with_bg;
                    $r145.setBackgroundResource($i05);
                    TextView $r146 = $r2.indicatorPhase2;
                    $r146.setText("");
                    TextView $r147 = $r2.indicatorPhase1;
                    int $i06 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r147.setBackgroundResource($i06);
                    TextView $r148 = $r2.indicatorPhase3;
                    int $i07 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r148.setBackgroundResource($i07);
                }
            } else if ($i02 == 441297912) {
                boolean $z08 = $r54.equals("RESOLVED");
                if ($z08) {
                    if ($r13 != null) {
                        int $i08 = $r13.getPoint();
                        if ($i08 != 0) {
                            RatingDialog.Companion $r18 = RatingDialog.Companion;
                            String $r55 = ticket.getId();
                            int $i09 = $r13.getPoint();
                            RatingDialog $r19 = $r18.newInstance($r55, $i09);
                            this.ratingDialog = $r19;
                            int $i010 = C0214R.C0216id.ratingContainer;
                            DisputeIssueFragment r465 = this;
                            AppCompatActivityExtKt.startFragmentInFragment$default(r465, $r19, $i010, false, false, false, 28, null);
                            TextView $r163 = $r2.textPhase1;
                            DisputeIssueFragment r466 = this;
                            Context $r173 = r466.requireContext();
                            int $i011 = C0214R.color.searchEditTextColor;
                            TextView $r149 = $r163;
                            $r149.setTextColor(C1335a.m36324d($r173, $i011));
                            TextView $r164 = $r2.textPhase2;
                            DisputeIssueFragment r467 = this;
                            Context $r174 = r467.requireContext();
                            int $i012 = C0214R.color.searchEditTextColor;
                            TextView $r1410 = $r164;
                            $r1410.setTextColor(C1335a.m36324d($r174, $i012));
                            TextView $r165 = $r2.textPhase3;
                            DisputeIssueFragment r468 = this;
                            Context $r175 = r468.requireContext();
                            int $i013 = C0214R.color.searchEditTextColor;
                            TextView $r1411 = $r165;
                            $r1411.setTextColor(C1335a.m36324d($r175, $i013));
                            TextView $r1412 = $r2.indicatorPhase3;
                            int $i014 = C0214R.C0215drawable.ic_check_with_bg;
                            $r1412.setBackgroundResource($i014);
                            TextView $r1413 = $r2.indicatorPhase3;
                            $r1413.setText("");
                            TextView $r1414 = $r2.indicatorPhase2;
                            int $i015 = C0214R.C0215drawable.circular_fill_kudi_accent;
                            $r1414.setBackgroundResource($i015);
                            TextView $r1415 = $r2.indicatorPhase1;
                            int $i016 = C0214R.C0215drawable.circular_fill_kudi_accent;
                            $r1415.setBackgroundResource($i016);
                        }
                    }
                    RatingDialog.Companion $r182 = RatingDialog.Companion;
                    RatingDialog $r192 = RatingDialog.Companion.newInstance$default($r182, ticket.getId(), 0, 2, null);
                    this.ratingDialog = $r192;
                    if ($r192 != null) {
                        DisputeIssueFragment r469 = this;
                        FragmentManager $r20 = r469.getChildFragmentManager();
                        $r192.show($r20, RatingDialog.class.getCanonicalName());
                    }
                    TextView $r1632 = $r2.textPhase1;
                    DisputeIssueFragment r4662 = this;
                    Context $r1732 = r4662.requireContext();
                    int $i0112 = C0214R.color.searchEditTextColor;
                    TextView $r1492 = $r1632;
                    $r1492.setTextColor(C1335a.m36324d($r1732, $i0112));
                    TextView $r1642 = $r2.textPhase2;
                    DisputeIssueFragment r4672 = this;
                    Context $r1742 = r4672.requireContext();
                    int $i0122 = C0214R.color.searchEditTextColor;
                    TextView $r14102 = $r1642;
                    $r14102.setTextColor(C1335a.m36324d($r1742, $i0122));
                    TextView $r1652 = $r2.textPhase3;
                    DisputeIssueFragment r4682 = this;
                    Context $r1752 = r4682.requireContext();
                    int $i0132 = C0214R.color.searchEditTextColor;
                    TextView $r14112 = $r1652;
                    $r14112.setTextColor(C1335a.m36324d($r1752, $i0132));
                    TextView $r14122 = $r2.indicatorPhase3;
                    int $i0142 = C0214R.C0215drawable.ic_check_with_bg;
                    $r14122.setBackgroundResource($i0142);
                    TextView $r14132 = $r2.indicatorPhase3;
                    $r14132.setText("");
                    TextView $r14142 = $r2.indicatorPhase2;
                    int $i0152 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r14142.setBackgroundResource($i0152);
                    TextView $r14152 = $r2.indicatorPhase1;
                    int $i0162 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r14152.setBackgroundResource($i0162);
                }
            } else if ($i02 == 1669991825) {
                boolean $z09 = $r54.equals("UNRESOLVED");
                if ($z09) {
                    TextView $r166 = $r2.textPhase2;
                    DisputeIssueFragment r4610 = this;
                    Context $r176 = r4610.requireContext();
                    int $i017 = C0214R.color.searchEditTextColor;
                    TextView $r1416 = $r166;
                    $r1416.setTextColor(C1335a.m36324d($r176, $i017));
                    TextView $r1417 = $r2.indicatorPhase1;
                    int $i018 = C0214R.C0215drawable.ic_check_with_bg;
                    $r1417.setBackgroundResource($i018);
                    TextView $r1418 = $r2.indicatorPhase1;
                    $r1418.setText("");
                    TextView $r1419 = $r2.indicatorPhase2;
                    int $i019 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r1419.setBackgroundResource($i019);
                    TextView $r1420 = $r2.indicatorPhase3;
                    int $i020 = C0214R.C0215drawable.circular_fill_kudi_accent;
                    $r1420.setBackgroundResource($i020);
                }
            }
        }
        if (ticket.getComment() == null) {
            ResolutionMessagesViewBinding $r23 = $r2.resolutionMessagesView;
            View $r24 = $r23.getRoot();
            Log_OC.loadImage($r24, "resolutionMessagesView.root");
            View r472 = $r24;
            ViewExtKt.show(r472);
            ResolutionMessagesViewBinding $r232 = $r2.resolutionMessagesView;
            ImageView $r25 = $r232.emptyResolutionView;
            Log_OC.loadImage($r25, "resolutionMessagesView.emptyResolutionView");
            ViewExtKt.show($r25);
            ResolutionMessagesViewBinding $r233 = $r2.resolutionMessagesView;
            View $r167 = $r233.emptyResolutionText;
            Log_OC.loadImage($r167, "resolutionMessagesView.emptyResolutionText");
            View r473 = $r167;
            ViewExtKt.show(r473);
            ResolutionMessagesViewBinding $r234 = $r2.resolutionMessagesView;
            View $r26 = $r234.resolutionMessagesRecyclerView;
            Log_OC.loadImage($r26, "resolutionMessagesView.resolutionMessagesRecyclerView");
            View r474 = $r26;
            ViewExtKt.hide$default(r474, false, 1, null);
        } else {
            List $r222 = ticket.getComment();
            Log_OC.append($r222);
            boolean $z010 = $r222.isEmpty();
            if ($z010) {
                ResolutionMessagesViewBinding $r235 = $r2.resolutionMessagesView;
                ImageView $r252 = $r235.emptyResolutionView;
                Log_OC.loadImage($r252, "resolutionMessagesView.emptyResolutionView");
                ViewExtKt.show($r252);
                ResolutionMessagesViewBinding $r236 = $r2.resolutionMessagesView;
                View $r168 = $r236.emptyResolutionText;
                Log_OC.loadImage($r168, "resolutionMessagesView.emptyResolutionText");
                View r475 = $r168;
                ViewExtKt.show(r475);
                ResolutionMessagesViewBinding $r237 = $r2.resolutionMessagesView;
                View $r262 = $r237.resolutionMessagesRecyclerView;
                Log_OC.loadImage($r262, "resolutionMessagesView.resolutionMessagesRecyclerView");
                View r476 = $r262;
                ViewExtKt.hide$default(r476, false, 1, null);
            } else {
                ResolutionMessagesViewBinding $r238 = $r2.resolutionMessagesView;
                ImageView $r253 = $r238.emptyResolutionView;
                Log_OC.loadImage($r253, "resolutionMessagesView.emptyResolutionView");
                ViewExtKt.hide$default($r253, false, 1, null);
                ResolutionMessagesViewBinding $r239 = $r2.resolutionMessagesView;
                View $r169 = $r239.emptyResolutionText;
                Log_OC.loadImage($r169, "resolutionMessagesView.emptyResolutionText");
                View r477 = $r169;
                ViewExtKt.hide$default(r477, false, 1, null);
                ResolutionMessagesViewBinding $r2310 = $r2.resolutionMessagesView;
                View $r242 = $r2310.getRoot();
                Log_OC.loadImage($r242, "resolutionMessagesView.root");
                View r478 = $r242;
                ViewExtKt.show(r478);
                ResolutionMessagesViewBinding $r2311 = $r2.resolutionMessagesView;
                View $r263 = $r2311.resolutionMessagesRecyclerView;
                Log_OC.loadImage($r263, "resolutionMessagesView.resolutionMessagesRecyclerView");
                View r479 = $r263;
                ViewExtKt.show(r479);
                ResolutionDetailsViewBinding $r27 = $r2.issueDetailsView;
                View $r243 = $r27.getRoot();
                Log_OC.loadImage($r243, "issueDetailsView.root");
                View r4710 = $r243;
                ViewExtKt.show(r4710);
                DisputeIssueFragment r4611 = this;
                Context $r177 = r4611.requireContext();
                Log_OC.loadImage($r177, "requireContext()");
                ResolutionMessageAdapter r40 = new ResolutionMessageAdapter($r177);
                DisputeIssueFragment r4612 = this;
                LinearLayoutManager r41 = new LinearLayoutManager(r4612.requireContext());
                ResolutionMessagesViewBinding $r2312 = $r2.resolutionMessagesView;
                $r2312.resolutionMessagesRecyclerView.setAdapter(r40);
                ResolutionMessagesViewBinding $r2313 = $r2.resolutionMessagesView;
                $r2313.resolutionMessagesRecyclerView.setLayoutManager(r41);
                List $r223 = ticket.getComment();
                Log_OC.append($r223);
                r40.setCommentsList($r223);
            }
        }
        HashMap $r82 = ticket.getMeta();
        Object $r92 = $r82.get("tx_id");
        final String $r56 = (String) $r92;
        String $r122 = ticket.getTimeCreated();
        Date $r30 = StringExtKt.formatKudiDateAlt3($r122);
        TimeZone $r31 = TimeZone.getTimeZone("GMT+1");
        Log_OC.loadImage($r31, "getTimeZone(\"GMT+1\")");
        String $r123 = DateExtKt.formatWithStyle($r30, "hh:mm a-MMM d, yyyy", $r31);
        ViewGroup r48 = $r2.disputeIssueViewTransactionDetails;
        r48.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.BaseActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DisputeIssueFragment $r28 = DisputeIssueFragment.this;
                String $r32 = $r56;
                DisputeIssueFragment.m39480setUp$lambda6$lambda5($r28, $r32, view);
            }
        });
        TwoColumnTableAdapter r43 = new TwoColumnTableAdapter();
        ResolutionDetailsViewBinding $r272 = $r2.issueDetailsView;
        RecyclerView $r264 = $r272.recyclerViewIssueDetail;
        DisputeIssueFragment r4613 = this;
        FragmentActivity $r34 = r4613.getActivity();
        LinearLayoutManager r412 = new LinearLayoutManager($r34);
        $r264.setLayoutManager(r412);
        TwoColumnItem.SimpleItem r44 = new TwoColumnItem.SimpleItem("Date", $r123);
        TwoColumnItem.SimpleItem r442 = new TwoColumnItem.SimpleItem("Transaction Reference", $r56);
        TwoColumnItem[] $r35 = {r44, r442};
        $r22 = C13726r.m3885k($r35);
        r43.setData($r22);
        ResolutionDetailsViewBinding $r273 = $r2.issueDetailsView;
        $r273.recyclerViewIssueDetail.setAdapter(r43);
        HashMap $r83 = ticket.getMeta();
        Object $r93 = $r83.get(TransactionField.AMOUNT);
        String $r57 = (String) $r93;
        TextView $r1610 = $r2.amountTextView;
        Log_OC.append($r57);
        boolean $z011 = StringExtKt.isDigit($r57);
        if ($z011) {
            int $i021 = C0214R.string.naira_symbol;
            DisputeIssueFragment r4614 = this;
            String $r124 = r4614.getString($i021);
            NumberFormat $r37 = NumberFormat.getNumberInstance(Locale.US);
            double $d0 = Double.parseDouble($r57);
            $r57 = Log_OC.m10359a($r124, (Object) $r37.format($d0));
        } else {
            boolean $z012 = StringExtKt.isNumber($r57);
            if ($z012) {
                StringBuilder r392 = new StringBuilder();
                int $i022 = C0214R.string.naira_symbol;
                DisputeIssueFragment r4615 = this;
                String $r125 = r4615.getString($i022);
                r392.append($r125);
                r392.append((Object) $r57);
                r392.append('0');
                $r57 = r392.toString();
            }
        }
        TextView $r1421 = $r1610;
        $r1421.setText($r57);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUp$lambda-6$lambda-5 */
    public static final void m39480setUp$lambda6$lambda5(DisputeIssueFragment disputeIssueFragment, String str, View view) {
        Log_OC.getArray(disputeIssueFragment, "this$0");
        GlobalNavigator $r3 = disputeIssueFragment.getGlobalNavigator();
        DisputeIssueFragment r5 = disputeIssueFragment;
        Context $r4 = r5.requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        $r3.navigateToTransactionDetailsActivity($r4, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public DisputePresenter createPresenter() {
        DisputePresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public LayoutDisputeIssueBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        LayoutDisputeIssueBinding $r3 = (LayoutDisputeIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        LayoutDisputeIssueBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GlobalNavigator getGlobalNavigator() {
        GlobalNavigator $r1 = this.globalNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("globalNavigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DisputePresenter getThisPresenter() {
        DisputePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Issue.Ticket getTicket() {
        Issue.Ticket $r1 = this.ticket;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("ticket");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.Disputeview
    public void hideLoading() {
        LayoutDisputeIssueBinding $r1 = requireBinding();
        $r1.shimmerLoader.m32964d();
        View $r2 = $r1.shimmerLoader;
        Log_OC.loadImage($r2, "shimmerLoader");
        View r3 = $r2;
        ViewExtKt.hide$default(r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(LayoutDisputeIssueBinding layoutDisputeIssueBinding, Fragment fragment) {
        Log_OC.getArray(layoutDisputeIssueBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(layoutDisputeIssueBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        LayoutDisputeIssueBinding $r4 = (LayoutDisputeIssueBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    @Override // ai.kudi.agent.issues.views.Disputeview
    public void notifyUserAboutPendingTicket(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DisputePresenter $r2 = createPresenter();
        Issue.Ticket $r3 = getTicket();
        String $r4 = $r3.getId();
        $r2.getTicketDetails($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        DisputeIssueFragment r3 = this;
        C7429a.m18752b(r3);
        DisputeIssueFragment r32 = this;
        super.onAttach(context);
        DisputeIssueFragment r33 = this;
        Bundle $r2 = r33.requireArguments();
        boolean $z0 = $r2.getBoolean(STARTING_POINT_NAVIGATION);
        this.isDisputeInitiatedFromInboxActivity = $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisputeIssueFragment r6 = this;
        FragmentActivity $r2 = r6.getActivity();
        boolean $z0 = $r2 instanceof IssueActivity;
        if ($z0) {
            DisputeIssueFragment r62 = this;
            r62.setHasOptionsMenu(true);
        }
        boolean $z02 = this.isDisputeInitiatedFromInboxActivity;
        DisputeIssueFragment r63 = this;
        Context $r3 = r63.requireContext();
        SharedPreferences $r4 = $r3.getSharedPreferences(DISPUTE_PREFERENCE, 0);
        Log_OC.loadImage($r4, "requireContext().getSharedPreferences(\n            DISPUTE_PREFERENCE, 0\n        )");
        SharedPreferences.Editor $r5 = $r4.edit();
        $r5.putBoolean(STARTING_POINT_NAVIGATION, !$z02);
        $r5.apply();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutDisputeIssueBinding $r4 = LayoutDisputeIssueBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        DisputeIssueFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Log_OC.getArray(menu, "menu");
        DisputeIssueFragment r4 = this;
        super.onPrepareOptionsMenu(menu);
        DisputeIssueFragment r42 = this;
        FragmentActivity $r2 = r42.getActivity();
        boolean $z0 = $r2 instanceof IssueActivity;
        if ($z0) {
            int $i0 = C0214R.C0216id.search_menu;
            MenuItem $r3 = menu.findItem($i0);
            $r3.setVisible(false);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        DisputeIssueFragment r8 = this;
        Bundle $r2 = r8.getArguments();
        Serializable $r3 = $r2 == null ? null : $r2.getSerializable(ISSUE_RESPONSE);
        if ($r3 == null) {
            NullPointerException r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.data.model.Issue.Ticket");
            throw r7;
        }
        Issue.Ticket $r4 = $r3;
        setTicket($r4);
        setTitle();
        DisputePresenter $r5 = getThisPresenter();
        $r5.logIssueCheckStatusReached();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public LayoutDisputeIssueBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        LayoutDisputeIssueBinding $r3 = (LayoutDisputeIssueBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        LayoutDisputeIssueBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setGlobalNavigator(GlobalNavigator globalNavigator) {
        Log_OC.getArray(globalNavigator, "<set-?>");
        this.globalNavigator = globalNavigator;
    }

    public final void setThisPresenter(DisputePresenter disputePresenter) {
        Log_OC.getArray(disputePresenter, "<set-?>");
        this.thisPresenter = disputePresenter;
    }

    public final void setTicket(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "<set-?>");
        this.ticket = ticket;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.Disputeview
    public void showErrorMsg(String str) {
        LayoutDisputeIssueBinding $r2 = requireBinding();
        ResolutionMessagesViewBinding $r3 = $r2.resolutionMessagesView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "resolutionMessagesView.root");
        View r6 = $r4;
        ViewExtKt.hide$default(r6, false, 1, null);
        $r2.errorTextView.setText(str);
        TextView $r5 = $r2.errorTextView;
        Log_OC.loadImage($r5, "errorTextView");
        ViewExtKt.show($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.Disputeview
    public void showLoading() {
        LayoutDisputeIssueBinding $r1 = requireBinding();
        $r1.shimmerLoader.m32965c();
        View $r2 = $r1.shimmerLoader;
        Log_OC.loadImage($r2, "shimmerLoader");
        View r3 = $r2;
        ViewExtKt.show(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.views.Disputeview
    public void showRatingError(String str) {
        DisputeIssueFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    @Override // ai.kudi.agent.issues.views.Disputeview
    public void showTicket(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "ticket");
        setUp(ticket);
    }
}
