package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.IssueRatingViewBinding;
import ai.kudi.agent.issues.p008ui.viewModels.RatingViewModel;
import ai.kudi.agent.issues.p008ui.viewModels.data.RatingViewData;
import ai.kudi.dip.library.p047k.C0830b;
import ai.kudi.dip.library.p047k.C0832c;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: RatingDialog.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001.B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\u001a\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\t\u0010-\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/issues/ui/RatingDialog;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/IssueRatingViewBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/IssueRatingViewBinding;", "disposable", "Lio/reactivex/disposables/Disposable;", "issueRatingViewModel", "Lai/kudi/agent/issues/ui/viewModels/RatingViewModel;", "getIssueRatingViewModel", "()Lai/kudi/agent/issues/ui/viewModels/RatingViewModel;", "setIssueRatingViewModel", "(Lai/kudi/agent/issues/ui/viewModels/RatingViewModel;)V", "point", "", "ratingAdapter", "Lai/kudi/dip/library/ratingBar/RatingBarAdapter;", "ticketId", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToDisputeConclusion", "", "rating", "observe", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onStart", "onViewCreated", "view", "requireBinding", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.RatingDialog */
/* loaded from: classes.dex */
public final class RatingDialog extends h implements BaseViewBinder<IssueRatingViewBinding> {
    public static final Companion Companion;
    public static final String POINT = "POINT";
    public static final String TICKET_ID = "TICKET_ID";
    private final /* synthetic */ BaseViewBinderImpl<IssueRatingViewBinding> $$delegate_0;
    private FavoritesArrayAdapter disposable;
    public RatingViewModel issueRatingViewModel;
    private int point;
    private C0830b ratingAdapter;
    private String ticketId;

    /* compiled from: RatingDialog.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/RatingDialog$Companion;", "", "()V", RatingDialog.POINT, "", RatingDialog.TICKET_ID, "newInstance", "Lai/kudi/agent/issues/ui/RatingDialog;", "ticketId", "point", "", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.RatingDialog$Companion */
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
        public static /* synthetic */ RatingDialog newInstance$default(Companion companion, String str, int $i0, int i, Object obj) {
            int $i1 = i & 2;
            if ($i1 != 0) {
                $i0 = 0;
            }
            RatingDialog $r2 = companion.newInstance(str, $i0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final RatingDialog newInstance(String str, int i) {
            Log_OC.getArray(str, "ticketId");
            RatingDialog $r3 = new RatingDialog();
            Bundle $r1 = new Bundle();
            $r1.putString(RatingDialog.TICKET_ID, str);
            $r1.putInt(RatingDialog.POINT, i);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
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
    public RatingDialog() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.ticketId = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void navigateToDisputeConclusion(int i) {
        SuccessScreenDialogFragment $r6;
        if (i == 1) {
            SuccessScreenDialogFragment.Companion $r1 = SuccessScreenDialogFragment.Companion;
            int $i0 = C0214R.string.this_bad_we_are_sorry;
            String $r3 = getString($i0);
            Log_OC.loadImage($r3, "getString(R.string.this_bad_we_are_sorry)");
            int $i02 = C0214R.string.manager_waiting;
            String $r4 = getString($i02);
            Log_OC.loadImage($r4, "getString(R.string.manager_waiting)");
            int $i03 = C0214R.string.chat_now;
            String $r8 = getString($i03);
            Log_OC.loadImage($r8, "getString(R.string.chat_now)");
            int $i04 = C0214R.C0215drawable.ic_very_sad;
            SuccessScreenCustomOption $r2 = new SuccessScreenCustomOption($r3, $r4, $r8, false, false, false, 0, 0, 0, 0, $i04, 0, false, 7160, null);
            C0265x4d7f83e8 $r11 = C0265x4d7f83e8.INSTANCE;
            $r6 = $r1.newInstance($r2, $r11);
        } else if (i == 2) {
            SuccessScreenDialogFragment.Companion $r12 = SuccessScreenDialogFragment.Companion;
            int $i05 = C0214R.string.maybee_next_time_text;
            String $r32 = getString($i05);
            Log_OC.loadImage($r32, "getString(R.string.maybee_next_time_text)");
            int $i06 = C0214R.string.manager_waiting;
            String $r42 = getString($i06);
            Log_OC.loadImage($r42, "getString(R.string.manager_waiting)");
            int $i07 = C0214R.string.chat_now;
            String $r82 = getString($i07);
            Log_OC.loadImage($r82, "getString(R.string.chat_now)");
            int $i08 = C0214R.C0215drawable.ic_sad;
            SuccessScreenCustomOption $r22 = new SuccessScreenCustomOption($r32, $r42, $r82, false, false, false, 0, 0, 0, 0, $i08, 0, false, 7160, null);
            C0266x4d7f83e9 $r10 = C0266x4d7f83e9.INSTANCE;
            $r6 = $r12.newInstance($r22, $r10);
        } else if (i == 3) {
            SuccessScreenDialogFragment.Companion $r13 = SuccessScreenDialogFragment.Companion;
            int $i09 = C0214R.string.really_wanted_to_impress;
            String $r33 = getString($i09);
            Log_OC.loadImage($r33, "getString(R.string.really_wanted_to_impress)");
            int $i010 = C0214R.string.manager_waiting;
            String $r43 = getString($i010);
            Log_OC.loadImage($r43, "getString(R.string.manager_waiting)");
            int $i011 = C0214R.string.chat_now;
            String $r83 = getString($i011);
            Log_OC.loadImage($r83, "getString(R.string.chat_now)");
            int $i012 = C0214R.C0215drawable.ic_mid_happy;
            SuccessScreenCustomOption $r23 = new SuccessScreenCustomOption($r33, $r43, $r83, false, false, false, 0, 0, 0, 0, $i012, 0, false, 7160, null);
            C0267x4d7f83ea $r9 = C0267x4d7f83ea.INSTANCE;
            $r6 = $r13.newInstance($r23, $r9);
        } else if (i != 4) {
            SuccessScreenDialogFragment.Companion $r14 = SuccessScreenDialogFragment.Companion;
            int $i013 = C0214R.string.happy_you_loved_it;
            String $r34 = getString($i013);
            Log_OC.loadImage($r34, "getString(R.string.happy_you_loved_it)");
            int $i014 = C0214R.string.close;
            String $r44 = getString($i014);
            Log_OC.loadImage($r44, "getString(R.string.close)");
            int $i015 = C0214R.C0215drawable.ic_happy;
            SuccessScreenCustomOption $r24 = new SuccessScreenCustomOption($r34, "", $r44, false, false, false, 0, 0, 0, 0, $i015, 0, false, 7160, null);
            C0269x4d7f83ec $r5 = new C0269x4d7f83ec(this);
            $r6 = $r14.newInstance($r24, $r5);
        } else {
            SuccessScreenDialogFragment.Companion $r15 = SuccessScreenDialogFragment.Companion;
            int $i016 = C0214R.string.so_glad_text;
            String $r35 = getString($i016);
            Log_OC.loadImage($r35, "getString(R.string.so_glad_text)");
            int $i017 = C0214R.string.close;
            String $r45 = getString($i017);
            Log_OC.loadImage($r45, "getString(R.string.close)");
            int $i018 = C0214R.C0215drawable.ic_happy;
            SuccessScreenCustomOption $r25 = new SuccessScreenCustomOption($r35, "", $r45, false, false, false, 0, 0, 0, 0, $i018, 0, false, 7160, null);
            C0268x4d7f83eb $r7 = new C0268x4d7f83eb(this);
            $r6 = $r15.newInstance($r25, $r7);
        }
        FragmentManager $r122 = getChildFragmentManager();
        $r6.show($r122, DisputeIssueFragment.SUCCESS_SCREEN_TAG);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observe() {
        final IssueRatingViewBinding $r1 = requireBinding();
        RatingViewModel $r2 = getIssueRatingViewModel();
        C11680b $r3 = $r2.getIssueRatingViewData();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        Log_OC.loadImage($r4, "viewLifecycleOwner");
        AbstractC11688p $r5 = C7390a.a($r3, $r4);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueRatingViewBinding $r12 = IssueRatingViewBinding.this;
                RatingDialog $r22 = this;
                RatingViewData $r42 = (RatingViewData) obj;
                RatingDialog.m39501observe$lambda5$lambda3($r12, $r22, $r42);
            }
        };
        Function $r7 = Function.LEN;
        FavoritesArrayAdapter $r8 = $r5.e0(object, $r7);
        this.disposable = $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observe$lambda-5$lambda-3 */
    public static final void m39501observe$lambda5$lambda3(IssueRatingViewBinding issueRatingViewBinding, RatingDialog ratingDialog, RatingViewData ratingViewData) {
        Log_OC.getArray(issueRatingViewBinding, "$this_apply");
        Log_OC.getArray(ratingDialog, "this$0");
        boolean $z0 = ratingViewData instanceof RatingViewData.Loading;
        if ($z0) {
            ProgressBar $r3 = issueRatingViewBinding.issueRatingProgressBar;
            Log_OC.loadImage($r3, "issueRatingProgressBar");
            ViewExtKt.show($r3);
            View $r4 = issueRatingViewBinding.ratingBar;
            Log_OC.loadImage($r4, "ratingBar");
            View r9 = $r4;
            ViewExtKt.hide(r9, true);
            return;
        }
        boolean $z02 = ratingViewData instanceof RatingViewData.IssueRated;
        if (!$z02) {
            boolean $z03 = ratingViewData instanceof RatingViewData.Error;
            if ($z03) {
                Context $r6 = ratingDialog.requireContext();
                Log_OC.loadImage($r6, "requireContext()");
                RatingViewData.Error $r7 = (RatingViewData.Error) ratingViewData;
                String $r8 = $r7.getMessage();
                ContextExtKt.toast$default($r6, $r8, 0, 2, (Object) null);
                return;
            }
            return;
        }
        View $r42 = issueRatingViewBinding.ratingBar;
        Log_OC.loadImage($r42, "ratingBar");
        View r92 = $r42;
        ViewExtKt.show(r92);
        ProgressBar $r32 = issueRatingViewBinding.issueRatingProgressBar;
        Log_OC.loadImage($r32, "issueRatingProgressBar");
        ViewExtKt.hide$default($r32, false, 1, null);
        RatingViewData.IssueRated $r5 = (RatingViewData.IssueRated) ratingViewData;
        int $i0 = $r5.getPoint();
        ratingDialog.navigateToDisputeConclusion($i0);
    }

    /* renamed from: onViewCreated$lambda-2$lambda-1 */
    public static final void m39503onViewCreated$lambda2$lambda1(RatingDialog ratingDialog, View view) {
        Log_OC.getArray(ratingDialog, "this$0");
        ratingDialog.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public IssueRatingViewBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        IssueRatingViewBinding $r3 = (IssueRatingViewBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        IssueRatingViewBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RatingViewModel getIssueRatingViewModel() {
        RatingViewModel $r1 = this.issueRatingViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueRatingViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(IssueRatingViewBinding issueRatingViewBinding, Fragment fragment) {
        Log_OC.getArray(issueRatingViewBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(issueRatingViewBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        IssueRatingViewBinding $r4 = (IssueRatingViewBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(TICKET_ID);
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "";
        }
        this.ticketId = $r3;
        int $i0 = $r1.getInt(POINT);
        this.point = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        IssueRatingViewBinding $r4 = IssueRatingViewBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onDestroy() {
        super.onDestroy();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onStart() {
        Window $r2;
        Window $r22;
        super.onStart();
        Dialog $r1 = getDialog();
        if ($r1 != null && ($r22 = $r1.getWindow()) != null) {
            $r22.setLayout(-1, -2);
        }
        Dialog $r12 = getDialog();
        if ($r12 == null || ($r2 = $r12.getWindow()) == null) {
            return;
        }
        ColorDrawable $r3 = new ColorDrawable(0);
        $r2.setBackgroundDrawable($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        List $r10;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        IssueRatingViewBinding $r3 = requireBinding();
        RecyclerView $r4 = $r3.ratingBar;
        LinearLayoutManager $r5 = new LinearLayoutManager(getContext(), 0, false);
        $r4.setLayoutManager($r5);
        RecyclerView $r42 = $r3.ratingBar;
        $r42.setHasFixedSize(true);
        C0832c $r9 = new C0832c(1);
        C0832c $r92 = new C0832c(2);
        C0832c $r93 = new C0832c(3);
        C0832c $r94 = new C0832c(4);
        C0832c $r95 = new C0832c(5);
        C0832c[] $r8 = {$r9, $r92, $r93, $r94, $r95};
        $r10 = C13726r.m3888h($r8);
        Context $r6 = requireContext();
        Log_OC.loadImage($r6, "requireContext()");
        RatingDialog$onViewCreated$1$1 $r11 = new RatingDialog$onViewCreated$1$1(this);
        C0830b $r7 = new C0830b($r10, $r6, $r11);
        this.ratingAdapter = $r7;
        RecyclerView $r43 = $r3.ratingBar;
        $r43.setAdapter($r7);
        int $i0 = this.point;
        if ($i0 > 0) {
            ImageView $r12 = $r3.closeDialogButton;
            Log_OC.loadImage($r12, "closeDialogButton");
            ViewExtKt.hide$default($r12, false, 1, null);
            C0830b $r72 = this.ratingAdapter;
            if ($r72 != null) {
                int $i02 = this.point;
                $r72.m37912f($i02 - 1, true);
            }
        }
        $r3.closeDialogButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RatingDialog $r2 = RatingDialog.this;
                RatingDialog.m39503onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
        observe();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public IssueRatingViewBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        IssueRatingViewBinding $r3 = (IssueRatingViewBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        IssueRatingViewBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setIssueRatingViewModel(RatingViewModel ratingViewModel) {
        Log_OC.getArray(ratingViewModel, "<set-?>");
        this.issueRatingViewModel = ratingViewModel;
    }
}
