package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ImageViewExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentLoanStatusBinding;
import ai.kudi.agent.feature_kshock.databinding.LayoutLoanStatusItemBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanStatusType;
import ai.kudi.agent.kshock.presentation.LoanStatusViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.LoanStatusViewData;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.users.domain.package_1.User;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: LoanStatusFragment.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0005J(\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J\u001e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001e\u0010\"\u001a\u00020#2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u001e\u0010$\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001e\u0010%\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u001e\u0010&\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020\u0010H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanStatusFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/LoanStatusViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanStatusViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentLoanStatusBinding;", "()V", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "loanStatusViewModel", "getLoanStatusViewModel", "()Lai/kudi/agent/kshock/presentation/LoanStatusViewModel;", "setLoanStatusViewModel", "(Lai/kudi/agent/kshock/presentation/LoanStatusViewModel;)V", "twoColumnTableAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "addStandardFourForLoan", "", AttributeType.LIST, "", "Lai/kudi/agent/settings/data/models/TwoColumnItem;", "it", "dueDate", "", "addStandardThreeForLoanRequests", "applyViewData", "viewData", "createViewModel", "displayLoanDetails", "(Lai/kudi/agent/kshock/data/model/Loan;)Lkotlin/Unit;", "getVMType", "Ljava/lang/Class;", "handleLoanApproved", "handleLoanCancelled", "handleLoanDeclined", "handleLoanOverdue", "", "handleLoanPendingPayback", "handleLoanSettled", "handlePendingApproval", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUpRv", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanStatusFragment */
/* loaded from: classes.dex */
public final class LoanStatusFragment extends BaseMVVMViewBindingFragment<LoanStatusViewModel, LoanStatusViewData, FragmentLoanStatusBinding> {
    public static final Companion Companion;
    public static final String LOAN = "LOAN";
    private Loan loan;
    public LoanStatusViewModel loanStatusViewModel;
    private TwoColumnTableAdapter twoColumnTableAdapter;

    /* compiled from: LoanStatusFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanStatusFragment$Companion;", "", "()V", "LOAN", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/LoanStatusFragment;", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.LoanStatusFragment$Companion */
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
        public final LoanStatusFragment newInstance(Loan loan) {
            Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
            LoanStatusFragment $r3 = new LoanStatusFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("LOAN", loan);
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
    private final void addStandardFourForLoan(List list, Loan loan, String str) {
        List $r10;
        TwoColumnItem.SimpleItem[] $r4 = new TwoColumnItem.SimpleItem[4];
        int $i0 = C0220R.string.amount_requested;
        String $r6 = getString($i0);
        Double $r7 = loan.getAmountRequested();
        String $r9 = $r7 == null ? null : StringExtKt.formatAmount($r7);
        TwoColumnItem.SimpleItem $r5 = new TwoColumnItem.SimpleItem($r6, $r9);
        $r4[0] = $r5;
        int $i02 = C0220R.string.amount_disbursed;
        String $r62 = getString($i02);
        Double $r72 = loan.getAmountDisbursed();
        String $r92 = $r72 == null ? null : StringExtKt.formatAmount($r72);
        TwoColumnItem.SimpleItem $r52 = new TwoColumnItem.SimpleItem($r62, $r92);
        $r4[1] = $r52;
        int $i03 = C0220R.string.charge;
        String $r63 = getString($i03);
        Double $r73 = loan.getInitialInterest();
        String $r93 = $r73 == null ? null : StringExtKt.formatAmount($r73);
        TwoColumnItem.SimpleItem $r53 = new TwoColumnItem.SimpleItem($r63, $r93);
        $r4[2] = $r53;
        int $i04 = C0220R.string.due_date;
        String $r64 = getString($i04);
        String $r8 = str != null ? StringExtKt.formatDateWithTime(str, "T") : null;
        TwoColumnItem.SimpleItem $r54 = new TwoColumnItem.SimpleItem($r64, $r8);
        $r4[3] = $r54;
        $r10 = C13726r.m3888h($r4);
        list.addAll($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void addStandardThreeForLoanRequests(List list, Loan loan) {
        List $r9;
        TwoColumnItem.SimpleItem[] $r3 = new TwoColumnItem.SimpleItem[3];
        int $i0 = C0220R.string.amount_requested;
        String $r5 = getString($i0);
        Double $r6 = loan.getAmountRequested();
        String $r8 = $r6 == null ? null : StringExtKt.formatAmount($r6);
        TwoColumnItem.SimpleItem $r4 = new TwoColumnItem.SimpleItem($r5, $r8);
        $r3[0] = $r4;
        int $i02 = C0220R.string.charge;
        String $r52 = getString($i02);
        Double $r62 = loan.getInitialInterest();
        String $r7 = $r62 != null ? StringExtKt.formatAmount($r62) : null;
        TwoColumnItem.SimpleItem $r42 = new TwoColumnItem.SimpleItem($r52, $r7);
        $r3[1] = $r42;
        int $i03 = C0220R.string.duration;
        String $r72 = getString($i03);
        int $i04 = C0220R.string.one_day;
        String $r53 = getString($i04);
        TwoColumnItem.SimpleItem $r43 = new TwoColumnItem.SimpleItem($r72, $r53);
        $r3[2] = $r43;
        $r9 = C13726r.m3888h($r3);
        list.addAll($r9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.C13666w displayLoanDetails(ai.kudi.agent.kshock.data.model.Loan r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r15.getStatus()
            if (r1 == 0) goto L6f
            int r2 = r1.hashCode()
            switch(r2) {
                case -1591040935: goto L62;
                case -1400920053: goto L55;
                case -1031784143: goto L48;
                case -373312384: goto L3b;
                case 930677415: goto L2e;
                case 1350822958: goto L21;
                case 1967871671: goto L14;
                default: goto L12;
            }
        L12:
            goto L13
        L13:
            goto L6f
        L14:
            java.lang.String r4 = "APPROVED"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L1d
            goto L6f
        L1d:
            r14.handleLoanApproved(r15, r0)
            goto L8e
        L21:
            java.lang.String r4 = "DECLINED"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L2a
            goto L6f
        L2a:
            r14.handleLoanDeclined(r15, r0)
            goto L8e
        L2e:
            java.lang.String r4 = "PENDING_PAYBACK"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L37
            goto L6f
        L37:
            r14.handleLoanPendingPayback(r15, r0)
            goto L8e
        L3b:
            java.lang.String r4 = "OVERDUE"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L44
            goto L6f
        L44:
            r14.handleLoanOverdue(r0, r15)
            goto L8e
        L48:
            java.lang.String r4 = "CANCELLED"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L51
            goto L6f
        L51:
            r14.handleLoanCancelled(r15, r0)
            goto L8e
        L55:
            java.lang.String r4 = "PENDING_APPROVAL"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L5e
            goto L6f
        L5e:
            r14.handlePendingApproval(r15, r0)
            goto L8e
        L62:
            java.lang.String r4 = "SETTLED"
            boolean r3 = r1.equals(r4)
            if (r3 != 0) goto L6b
            goto L6f
        L6b:
            r14.handleLoanSettled(r0, r15)
            goto L8e
        L6f:
            g.x.a r5 = r14.requireBinding()
            r7 = r5
            ai.kudi.agent.feature_kshock.databinding.FragmentLoanStatusBinding r7 = (ai.kudi.agent.feature_kshock.databinding.FragmentLoanStatusBinding) r7
            r6 = r7
            ai.kudi.agent.feature_kshock.databinding.LayoutLoanStatusItemBinding r8 = r6.loanStatusItem
            android.widget.TextView r9 = r8.loanStatus
            java.lang.String r1 = r15.getStatus()
            r10 = r1
            if (r1 != 0) goto L84
            java.lang.String r10 = ""
        L84:
            r9.setText(r10)
            java.lang.String r1 = r15.getDueDate()
            r14.addStandardFourForLoan(r0, r15, r1)
        L8e:
            ai.kudi.agent.settings.ui.adapters.TwoColumnTableAdapter r11 = r14.twoColumnTableAdapter
            if (r11 != 0) goto L94
            r12 = 0
            return r12
        L94:
            r11.setData(r0)
            kotlin.w r13 = kotlin.C13666w.f30112a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment.displayLoanDetails(ai.kudi.agent.kshock.data.model.Loan):kotlin.w");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleLoanApproved(Loan loan, List list) {
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        LayoutLoanStatusItemBinding $r5 = $r4.loanStatusItem;
        TextView $r6 = $r5.loanStatus;
        Log_OC.loadImage($r6, "requireBinding().loanStatusItem.loanStatus");
        int $i0 = C0220R.string.approved;
        String $r7 = getString($i0);
        $r6.setText($r7);
        Context $r8 = requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        int $i02 = C0220R.color.kudiBadgeLightBlue;
        $r6.setBackgroundColor(ContextExtKt.getKudiColor($r8, $i02));
        Context $r82 = requireContext();
        Log_OC.loadImage($r82, "requireContext()");
        int $i03 = C0220R.color.kudiBadgeDarkBlue;
        $r6.setTextColor(ContextExtKt.getKudiColor($r82, $i03));
        String $r72 = loan.getDueDate();
        addStandardFourForLoan(list, loan, $r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleLoanCancelled(Loan loan, List list) {
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        LayoutLoanStatusItemBinding $r5 = $r4.loanStatusItem;
        TextView $r6 = $r5.loanStatus;
        Log_OC.loadImage($r6, "requireBinding().loanStatusItem.loanStatus");
        int $i0 = C0220R.string.cancelled;
        String $r7 = getString($i0);
        $r6.setText($r7);
        Context $r8 = requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        int $i02 = C0220R.color.kudiBadgeLightRed;
        $r6.setBackgroundColor(ContextExtKt.getKudiColor($r8, $i02));
        Context $r82 = requireContext();
        Log_OC.loadImage($r82, "requireContext()");
        int $i03 = C0220R.color.kudiBadgeDarkRed;
        $r6.setTextColor(ContextExtKt.getKudiColor($r82, $i03));
        addStandardThreeForLoanRequests(list, loan);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleLoanDeclined(Loan loan, List list) {
        addStandardThreeForLoanRequests(list, loan);
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        LayoutLoanStatusItemBinding $r5 = $r4.loanStatusItem;
        TextView $r6 = $r5.loanStatus;
        Log_OC.loadImage($r6, "requireBinding().loanStatusItem.loanStatus");
        int $i0 = C0220R.string.declined;
        String $r7 = getString($i0);
        $r6.setText($r7);
        Context $r8 = requireContext();
        Log_OC.loadImage($r8, "requireContext()");
        int $i02 = C0220R.color.kudiBadgeLightRed;
        $r6.setBackgroundColor(ContextExtKt.getKudiColor($r8, $i02));
        Context $r82 = requireContext();
        Log_OC.loadImage($r82, "requireContext()");
        int $i03 = C0220R.color.kudiBadgeDarkRed;
        $r6.setTextColor(ContextExtKt.getKudiColor($r82, $i03));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean handleLoanOverdue(List list, Loan loan) {
        List $r16;
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        LayoutLoanStatusItemBinding $r5 = $r4.loanStatusItem;
        TextView $r6 = $r5.loanStatus;
        Log_OC.loadImage($r6, "requireBinding().loanStatusItem.loanStatus");
        int $i1 = C0220R.string.overdue;
        String $r7 = getString($i1);
        $r6.setText($r7);
        InterfaceC8209a $r32 = requireBinding();
        FragmentLoanStatusBinding $r42 = (FragmentLoanStatusBinding) $r32;
        TextView $r8 = $r42.loanStatusSummary;
        Log_OC.loadImage($r8, "requireBinding().loanStatusSummary");
        ViewExtKt.show($r8);
        InterfaceC8209a $r33 = requireBinding();
        FragmentLoanStatusBinding $r43 = (FragmentLoanStatusBinding) $r33;
        TextView $r82 = $r43.loanStatusSummary;
        int $i12 = C0220R.string.overdue_loan_status_summary;
        String $r72 = getString($i12);
        $r82.setText($r72);
        InterfaceC8209a $r34 = requireBinding();
        FragmentLoanStatusBinding $r44 = (FragmentLoanStatusBinding) $r34;
        TextView $r83 = $r44.loanStatusSummary;
        Context $r9 = requireContext();
        Log_OC.loadImage($r9, "requireContext()");
        int $i13 = C0220R.color.kudiBadgeDarkRed;
        $r83.setTextColor(ContextExtKt.getKudiColor($r9, $i13));
        InterfaceC8209a $r35 = requireBinding();
        FragmentLoanStatusBinding $r45 = (FragmentLoanStatusBinding) $r35;
        TextView $r84 = $r45.loanStatusSummary;
        Context $r92 = requireContext();
        Log_OC.loadImage($r92, "requireContext()");
        int $i14 = C0220R.color.kudiBadgeLightRed;
        $r84.setBackgroundColor(ContextExtKt.getKudiColor($r92, $i14));
        Context $r93 = requireContext();
        Log_OC.loadImage($r93, "requireContext()");
        int $i15 = C0220R.color.kudiBadgeLightRed;
        $r6.setBackgroundColor(ContextExtKt.getKudiColor($r93, $i15));
        Context $r94 = requireContext();
        Log_OC.loadImage($r94, "requireContext()");
        int $i16 = C0220R.color.kudiBadgeDarkRed;
        $r6.setTextColor(ContextExtKt.getKudiColor($r94, $i16));
        int $i17 = C0220R.C0221drawable.ic_error;
        Resources $r10 = getResources();
        int $i0 = C0220R.dimen.dimen_10dp;
        float $f0 = $r10.getDimension($i0);
        int $i02 = (int) $f0;
        ViewExtKt.setCompoundKudiDrawables$default($r6, $i17, 0, 0, 0, $i02, 14, null);
        String $r73 = loan.getDueDate();
        addStandardFourForLoan(list, loan, $r73);
        TwoColumnItem.SimpleItem[] $r11 = new TwoColumnItem.SimpleItem[3];
        int $i18 = C0220R.string.amount_paid;
        String $r13 = getString($i18);
        Double $r14 = loan.getAmountPaidBack();
        String $r15 = $r14 == null ? null : StringExtKt.formatAmount($r14);
        TwoColumnItem.SimpleItem $r12 = new TwoColumnItem.SimpleItem($r13, $r15);
        $r11[0] = $r12;
        int $i19 = C0220R.string.accrued_daily_charge;
        String $r132 = getString($i19);
        Double $r142 = loan.getAccruedOverdueInterest();
        String $r152 = $r142 == null ? null : StringExtKt.formatAmount($r142);
        TwoColumnItem.SimpleItem $r122 = new TwoColumnItem.SimpleItem($r132, $r152);
        $r11[1] = $r122;
        int $i110 = C0220R.string.amount_payable;
        String $r133 = getString($i110);
        Double $r143 = loan.getAmountOwed();
        String $r74 = $r143 != null ? StringExtKt.formatAmount($r143) : null;
        TwoColumnItem.SimpleItem $r123 = new TwoColumnItem.SimpleItem($r133, $r74);
        $r11[2] = $r123;
        $r16 = C13726r.m3888h($r11);
        boolean $z0 = list.addAll($r16);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleLoanPendingPayback(final Loan loan, List list) {
        String $r13;
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        LayoutLoanStatusItemBinding $r5 = $r4.loanStatusItem;
        TextView $r6 = $r5.loanStatus;
        Log_OC.loadImage($r6, "requireBinding().loanStatusItem.loanStatus");
        InterfaceC8209a $r32 = requireBinding();
        FragmentLoanStatusBinding $r42 = (FragmentLoanStatusBinding) $r32;
        TextView $r7 = $r42.loanStatusSummary;
        Log_OC.loadImage($r7, "requireBinding().loanStatusSummary");
        InterfaceC8209a $r33 = requireBinding();
        FragmentLoanStatusBinding $r43 = (FragmentLoanStatusBinding) $r33;
        LayoutLoanStatusItemBinding $r52 = $r43.loanStatusItem;
        LinearLayout $r8 = $r52.actionView;
        Log_OC.loadImage($r8, "requireBinding().loanStatusItem.actionView");
        int $i0 = C0220R.string.pending_payback;
        String $r9 = getString($i0);
        $r6.setText($r9);
        Context $r10 = requireContext();
        Log_OC.loadImage($r10, "requireContext()");
        int $i02 = C0220R.color.kudiBadgeLightBlue;
        $r6.setBackgroundColor(ContextExtKt.getKudiColor($r10, $i02));
        Context $r102 = requireContext();
        Log_OC.loadImage($r102, "requireContext()");
        int $i03 = C0220R.color.kudiBadgeDarkBlue;
        $r6.setTextColor(ContextExtKt.getKudiColor($r102, $i03));
        ViewExtKt.hide$default($r7, false, 1, null);
        String $r92 = loan.getDueDate();
        addStandardFourForLoan(list, loan, $r92);
        int $i04 = C0220R.string.amount_paid;
        String $r93 = getString($i04);
        Double $r12 = loan.getAmountPaidBack();
        String $r132 = $r12 == null ? null : StringExtKt.formatAmount($r12);
        TwoColumnItem.SimpleItem r16 = new TwoColumnItem.SimpleItem($r93, $r132);
        list.add(r16);
        int $i05 = C0220R.string.amount_payable;
        String $r94 = getString($i05);
        Double $r122 = loan.getAmountOwed();
        String $r133 = $r122 == null ? null : StringExtKt.formatAmount($r122);
        TwoColumnItem.SimpleItem r162 = new TwoColumnItem.SimpleItem($r94, $r133);
        list.add(r162);
        int $i06 = C0220R.string.payback_amount;
        String $r95 = getString($i06);
        Double $r123 = loan.getAmountPaidBack();
        if ($r123 == null) {
            $r13 = null;
        } else {
            double $d0 = $r123.doubleValue();
            Double $r124 = loan.getAmountOwed();
            double $d1 = $r124 == null ? 0.0d : $r124.doubleValue();
            $r13 = StringExtKt.formatAmount(Double.valueOf($d0 + $d1));
        }
        TwoColumnItem.SimpleItem r163 = new TwoColumnItem.SimpleItem($r95, $r13);
        list.add(2, r163);
        ViewExtKt.show($r8);
        InterfaceC8209a $r34 = requireBinding();
        FragmentLoanStatusBinding $r44 = (FragmentLoanStatusBinding) $r34;
        LayoutLoanStatusItemBinding $r53 = $r44.loanStatusItem;
        TextView $r62 = $r53.actionTextView;
        int $i07 = C0220R.string.payback_manually;
        String $r96 = getString($i07);
        $r62.setText($r96);
        InterfaceC8209a $r35 = requireBinding();
        FragmentLoanStatusBinding $r45 = (FragmentLoanStatusBinding) $r35;
        LayoutLoanStatusItemBinding $r54 = $r45.loanStatusItem;
        View $r14 = $r54.cancelImage;
        Log_OC.loadImage($r14, "requireBinding().loanStatusItem.cancelImage");
        View r18 = $r14;
        ViewExtKt.hide$default(r18, false, 1, null);
        $r8.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Loan $r2 = Loan.this;
                LoanStatusFragment $r36 = this;
                LoanStatusFragment.m39660handleLoanPendingPayback$lambda3($r2, $r36, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r5 == null) goto L3;
     */
    /* renamed from: handleLoanPendingPayback$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39660handleLoanPendingPayback$lambda3(ai.kudi.agent.kshock.data.model.Loan r10, ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment r11, android.view.View r12) {
        /*
            java.lang.String r0 = "$loan"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog$Companion r1 = ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog.Companion
            java.lang.Double r2 = r10.getAmountOwed()
            java.lang.String r3 = ""
            if (r2 != 0) goto L17
        L14:
            java.lang.String r4 = ""
            goto L1f
        L17:
            java.lang.String r5 = ai.kudi.agent.core.util.StringExtKt.formatAmount(r2)
            r4 = r5
            if (r5 != 0) goto L1f
            goto L14
        L1f:
            ai.kudi.agent.kshock.ui.views.LoanStatusFragment$handleLoanPendingPayback$1$1 r6 = new ai.kudi.agent.kshock.ui.views.LoanStatusFragment$handleLoanPendingPayback$1$1
            r6.<init>(r11, r10)
            ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog r7 = r1.newInstance(r4, r6)
            androidx.fragment.app.FragmentManager r8 = r11.getChildFragmentManager()
            java.lang.String r0 = "childFragmentManager"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r0)
            java.lang.Class<ai.kudi.agent.kshock.ui.views.PaybackLoanConfirmationDialog> r9 = ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog.class
            java.lang.String r4 = r9.getCanonicalName()
            if (r4 == 0) goto L3a
            r3 = r4
        L3a:
            ai.kudi.agent.core.util.FragmentExtensionKt.showDialogWhenResumed(r7, r8, r3, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment.m39660handleLoanPendingPayback$lambda3(ai.kudi.agent.kshock.data.model.Loan, ai.kudi.agent.kshock.ui.views.LoanStatusFragment, android.view.View):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleLoanSettled(List list, Loan loan) {
        String $r3 = loan.getDueDate();
        addStandardFourForLoan(list, loan, $r3);
        int $i0 = C0220R.string.amount_repaid;
        String $r32 = getString($i0);
        Double $r5 = loan.getAmountPaidBack();
        String $r6 = $r5 == null ? null : StringExtKt.formatAmount($r5);
        TwoColumnItem.SimpleItem r13 = new TwoColumnItem.SimpleItem($r32, $r6);
        list.add(r13);
        InterfaceC8209a $r7 = requireBinding();
        LayoutLoanStatusItemBinding $r9 = ((FragmentLoanStatusBinding) $r7).loanStatusItem;
        TextView $r10 = $r9.loanStatus;
        Log_OC.loadImage($r10, "requireBinding().loanStatusItem.loanStatus");
        int $i02 = C0220R.string.settled;
        String $r33 = getString($i02);
        $r10.setText($r33);
        Context $r11 = requireContext();
        Log_OC.loadImage($r11, "requireContext()");
        int $i03 = C0220R.color.kudiBadgeLightGreen;
        $r10.setBackgroundColor(ContextExtKt.getKudiColor($r11, $i03));
        Context $r112 = requireContext();
        Log_OC.loadImage($r112, "requireContext()");
        int $i04 = C0220R.color.kudiBadgeDarkGreen;
        $r10.setTextColor(ContextExtKt.getKudiColor($r112, $i04));
        InterfaceC8209a $r72 = requireBinding();
        FragmentLoanStatusBinding $r8 = (FragmentLoanStatusBinding) $r72;
        TextView $r102 = $r8.loanSetteledText;
        Log_OC.loadImage($r102, "loanSetteledText");
        ViewExtKt.show($r102);
        View $r12 = $r8.userPicture;
        Log_OC.loadImage($r12, "userPicture");
        View r14 = $r12;
        ViewExtKt.show(r14);
        TextView $r103 = $r8.nameText;
        Log_OC.loadImage($r103, "nameText");
        ViewExtKt.show($r103);
        TextView $r104 = $r8.phoneText;
        Log_OC.loadImage($r104, "phoneText");
        ViewExtKt.show($r104);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handlePendingApproval(final Loan loan, List list) {
        InterfaceC8209a $r3 = requireBinding();
        FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r3;
        TextView $r5 = $r4.loanStatusSummary;
        Log_OC.loadImage($r5, "requireBinding().loanStatusSummary");
        ViewExtKt.show($r5);
        InterfaceC8209a $r32 = requireBinding();
        FragmentLoanStatusBinding $r42 = (FragmentLoanStatusBinding) $r32;
        LayoutLoanStatusItemBinding $r6 = $r42.loanStatusItem;
        LinearLayout $r7 = $r6.actionView;
        Log_OC.loadImage($r7, "requireBinding().loanStatusItem.actionView");
        ViewExtKt.show($r7);
        InterfaceC8209a $r33 = requireBinding();
        FragmentLoanStatusBinding $r43 = (FragmentLoanStatusBinding) $r33;
        LayoutLoanStatusItemBinding $r62 = $r43.loanStatusItem;
        $r62.actionView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoanStatusFragment $r2 = LoanStatusFragment.this;
                Loan $r34 = loan;
                LoanStatusFragment.m39661handlePendingApproval$lambda2($r2, $r34, view);
            }
        });
        addStandardThreeForLoanRequests(list, loan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handlePendingApproval$lambda-2  reason: not valid java name */
    public static final void m39661handlePendingApproval$lambda2(LoanStatusFragment loanStatusFragment, Loan loan, View view) {
        Log_OC.getArray(loanStatusFragment, "this$0");
        Log_OC.getArray(loan, "$it");
        LoanStatusViewModel $r3 = loanStatusFragment.getLoanStatusViewModel();
        String $r4 = loan.getId();
        $r3.cancelLoanRequest($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final LoanStatusFragment newInstance(Loan loan) {
        Companion $r0 = Companion;
        LoanStatusFragment $r1 = $r0.newInstance(loan);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpRv() {
        Context $r3 = getContext();
        LinearLayoutManager r10 = new LinearLayoutManager($r3);
        InterfaceC8209a $r4 = requireBinding();
        FragmentLoanStatusBinding $r5 = (FragmentLoanStatusBinding) $r4;
        LayoutLoanStatusItemBinding $r6 = $r5.loanStatusItem;
        RecyclerView $r7 = $r6.loanStatusRv;
        $r7.setLayoutManager(r10);
        RecyclerView r12 = $r7;
        Context $r32 = r12.getContext();
        int $i0 = r10.m35389v2();
        C1723k r11 = new C1723k($r32, $i0);
        Context $r33 = requireContext();
        Log_OC.loadImage($r33, "requireContext()");
        int $i02 = C0220R.C0221drawable.transactions_divider;
        Drawable $r8 = ContextExtKt.getKudiDrawable($r33, $i02);
        if ($r8 != null) {
            r11.m34703f($r8);
            $r7.m35294h(r11);
        }
        TwoColumnTableAdapter $r9 = this.twoColumnTableAdapter;
        $r7.setAdapter($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        LoanStatusViewData $r2 = (LoanStatusViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(LoanStatusViewData loanStatusViewData) {
        Log_OC.getArray(loanStatusViewData, "viewData");
        boolean $z0 = loanStatusViewData instanceof LoanStatusViewData.Loading;
        String $r2 = null;
        if ($z0) {
            InterfaceC8209a $r3 = requireBinding();
            FragmentLoanStatusBinding fragmentLoanStatusBinding = (FragmentLoanStatusBinding) $r3;
            LayoutLoanStatusItemBinding $r5 = fragmentLoanStatusBinding.loanStatusItem;
            TextView $r6 = $r5.actionTextView;
            Log_OC.loadImage($r6, "loanStatusItem.actionTextView");
            ViewExtKt.hide$default($r6, false, 1, null);
            LayoutLoanStatusItemBinding $r52 = fragmentLoanStatusBinding.loanStatusItem;
            AppCompatImageView $r7 = $r52.cancelImage;
            Log_OC.loadImage($r7, "loanStatusItem.cancelImage");
            ViewExtKt.hide$default($r7, false, 1, null);
            LayoutLoanStatusItemBinding $r53 = fragmentLoanStatusBinding.loanStatusItem;
            ProgressBar $r8 = $r53.cancelLoanProgress;
            Log_OC.loadImage($r8, "loanStatusItem.cancelLoanProgress");
            ViewExtKt.show($r8);
            return;
        }
        boolean $z02 = loanStatusViewData instanceof LoanStatusViewData.CurrentUser;
        if ($z02) {
            Loan $r9 = this.loan;
            boolean $z03 = Log_OC.append($r9 == null ? null : $r9.getStatus(), LoanStatusType.SETTLED);
            if ($z03) {
                InterfaceC8209a $r32 = requireBinding();
                TextView $r62 = ((FragmentLoanStatusBinding) $r32).nameText;
                Log_OC.loadImage($r62, "requireBinding().nameText");
                ViewExtKt.show($r62);
                InterfaceC8209a $r33 = requireBinding();
                TextView $r63 = ((FragmentLoanStatusBinding) $r33).phoneText;
                Log_OC.loadImage($r63, "requireBinding().phoneText");
                ViewExtKt.show($r63);
                InterfaceC8209a $r34 = requireBinding();
                View $r11 = ((FragmentLoanStatusBinding) $r34).userPicture;
                Log_OC.loadImage($r11, "requireBinding().userPicture");
                View r26 = $r11;
                ViewExtKt.show(r26);
                LoanStatusViewData.CurrentUser $r12 = (LoanStatusViewData.CurrentUser) loanStatusViewData;
                User $r13 = $r12.getUser();
                InterfaceC8209a $r35 = requireBinding();
                TextView $r64 = ((FragmentLoanStatusBinding) $r35).nameText;
                int $i0 = C0220R.string.user_name;
                Object[] $r14 = new Object[2];
                $r14[0] = $r13 == null ? null : $r13.getFirstName();
                $r14[1] = $r13 == null ? null : $r13.getLastName();
                $r64.setText(getString($i0, $r14));
                InterfaceC8209a $r36 = requireBinding();
                ((FragmentLoanStatusBinding) $r36).phoneText.setText($r13 == null ? null : $r13.getPhoneNumber());
                InterfaceC8209a $r37 = requireBinding();
                ImageView $r112 = ((FragmentLoanStatusBinding) $r37).userPicture;
                Log_OC.loadImage($r112, "requireBinding().userPicture");
                Context $r15 = requireContext();
                Log_OC.loadImage($r15, "requireContext()");
                ImageUtil.Companion $r16 = ImageUtil.Companion;
                if ($r13 != null) {
                    String $r22 = $r13.profilePictureId;
                    $r2 = $r22;
                }
                if ($r2 == null) {
                    $r2 = "";
                }
                ImageView r27 = $r112;
                ImageViewExtKt.load(r27, $r15, $r16.getRemotePathImageId($r2));
                return;
            }
            return;
        }
        boolean $z04 = loanStatusViewData instanceof LoanStatusViewData.CancelLoan;
        if ($z04) {
            InterfaceC8209a $r38 = requireBinding();
            LayoutLoanStatusItemBinding $r54 = ((FragmentLoanStatusBinding) $r38).loanStatusItem;
            ProgressBar $r82 = $r54.cancelLoanProgress;
            Log_OC.loadImage($r82, "requireBinding().loanStatusItem.cancelLoanProgress");
            ViewExtKt.hide$default($r82, false, 1, null);
            Context $r152 = requireContext();
            Log_OC.loadImage($r152, "requireContext()");
            int $i02 = C0220R.string.loan_application_cancelled;
            String $r23 = getString($i02);
            ContextExtKt.toast$default($r152, $r23, 0, 2, (Object) null);
            InterfaceC8209a $r39 = requireBinding();
            LayoutLoanStatusItemBinding $r55 = ((FragmentLoanStatusBinding) $r39).loanStatusItem;
            TextView $r65 = $r55.loanStatus;
            int $i03 = C0220R.string.cancelled;
            String $r24 = getString($i03);
            $r65.setText($r24);
            InterfaceC8209a $r310 = requireBinding();
            LayoutLoanStatusItemBinding $r56 = ((FragmentLoanStatusBinding) $r310).loanStatusItem;
            TextView $r66 = $r56.loanStatus;
            Context $r153 = requireContext();
            Log_OC.loadImage($r153, "requireContext()");
            int $i04 = C0220R.color.kudiBadgeDarkRed;
            $r66.setTextColor(ContextExtKt.getKudiColor($r153, $i04));
            InterfaceC8209a $r311 = requireBinding();
            LayoutLoanStatusItemBinding $r57 = ((FragmentLoanStatusBinding) $r311).loanStatusItem;
            TextView $r67 = $r57.loanStatus;
            Context $r154 = requireContext();
            Log_OC.loadImage($r154, "requireContext()");
            int $i05 = C0220R.color.kudiBadgeLightRed;
            $r67.setBackgroundColor(ContextExtKt.getKudiColor($r154, $i05));
            InterfaceC8209a $r312 = requireBinding();
            LayoutLoanStatusItemBinding $r58 = ((FragmentLoanStatusBinding) $r312).loanStatusItem;
            LinearLayout $r17 = $r58.actionView;
            Log_OC.loadImage($r17, "requireBinding().loanStatusItem.actionView");
            ViewExtKt.hide$default($r17, false, 1, null);
            InterfaceC8209a $r313 = requireBinding();
            TextView $r68 = ((FragmentLoanStatusBinding) $r313).loanStatusSummary;
            Log_OC.loadImage($r68, "requireBinding().loanStatusSummary");
            ViewExtKt.hide$default($r68, false, 1, null);
            return;
        }
        boolean $z05 = loanStatusViewData instanceof LoanStatusViewData.Payback;
        if (!$z05) {
            boolean $z06 = loanStatusViewData instanceof LoanStatusViewData.Error;
            if ($z06) {
                InterfaceC8209a $r314 = requireBinding();
                FragmentLoanStatusBinding $r4 = (FragmentLoanStatusBinding) $r314;
                LayoutLoanStatusItemBinding $r59 = $r4.loanStatusItem;
                TextView $r69 = $r59.actionTextView;
                Log_OC.loadImage($r69, "loanStatusItem.actionTextView");
                ViewExtKt.show($r69);
                LayoutLoanStatusItemBinding $r510 = $r4.loanStatusItem;
                View $r72 = $r510.cancelImage;
                Log_OC.loadImage($r72, "loanStatusItem.cancelImage");
                View r262 = $r72;
                ViewExtKt.show(r262);
                LayoutLoanStatusItemBinding $r511 = $r4.loanStatusItem;
                ProgressBar $r83 = $r511.cancelLoanProgress;
                Log_OC.loadImage($r83, "loanStatusItem.cancelLoanProgress");
                ViewExtKt.hide$default($r83, false, 1, null);
                Context $r155 = requireContext();
                Log_OC.loadImage($r155, "requireContext()");
                LoanStatusViewData.Error $r242 = (LoanStatusViewData.Error) loanStatusViewData;
                String $r25 = $r242.getMessage();
                ContextExtKt.toast$default($r155, $r25, 0, 2, (Object) null);
                return;
            }
            return;
        }
        InterfaceC8209a $r315 = requireBinding();
        LayoutLoanStatusItemBinding $r512 = ((FragmentLoanStatusBinding) $r315).loanStatusItem;
        LinearLayout $r172 = $r512.actionView;
        Log_OC.loadImage($r172, "requireBinding().loanStatusItem.actionView");
        ViewExtKt.hide$default($r172, false, 1, null);
        InterfaceC8209a $r316 = requireBinding();
        TextView $r610 = ((FragmentLoanStatusBinding) $r316).loanStatusSummary;
        Log_OC.loadImage($r610, "requireBinding().loanStatusSummary");
        ViewExtKt.hide$default($r610, false, 1, null);
        LoanStatusViewData.Payback $r18 = (LoanStatusViewData.Payback) loanStatusViewData;
        Loan $r92 = $r18.getLoan();
        this.loan = $r92;
        Loan $r93 = $r18.getLoan();
        displayLoanDetails($r93);
        SuccessScreenDialogFragment.Companion $r19 = SuccessScreenDialogFragment.Companion;
        int $i06 = C0220R.string.transaction_successful;
        String $r26 = getString($i06);
        int $i07 = C0220R.string.close;
        String $r10 = getString($i07);
        int $i08 = C0220R.C0221drawable.ic_successful_transaction_status;
        Log_OC.loadImage($r26, "getString(R.string.transaction_successful)");
        Log_OC.loadImage($r10, "getString(R.string.close)");
        SuccessScreenCustomOption r25 = new SuccessScreenCustomOption($r26, "", $r10, true, false, false, 0, 0, 0, 0, $i08, 0, false, 7152, null);
        LoanStatusFragment$applyViewData$2 $r21 = LoanStatusFragment$applyViewData$2.INSTANCE;
        SuccessScreenDialogFragment $r222 = $r19.newInstance(r25, $r21);
        FragmentManager $r232 = getChildFragmentManager();
        $r222.show($r232, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        LoanStatusViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public LoanStatusViewModel createViewModel() {
        LoanStatusViewModel $r1 = getLoanStatusViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LoanStatusViewModel getLoanStatusViewModel() {
        LoanStatusViewModel $r1 = this.loanStatusViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("loanStatusViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return LoanStatusViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable("LOAN");
        Loan $r3 = (Loan) $r2;
        this.loan = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentLoanStatusBinding $r4 = FragmentLoanStatusBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r11;
        }
        AppCompatActivity $r4 = (AppCompatActivity) $r3;
        AbstractC0925a $r5 = $r4.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37629E();
        }
        TwoColumnTableAdapter $r6 = new TwoColumnTableAdapter();
        this.twoColumnTableAdapter = $r6;
        setUpRv();
        Loan $r7 = this.loan;
        if ($r7 != null) {
            LoanStatusViewModel $r8 = getLoanStatusViewModel();
            String $r9 = $r7.getStatus();
            String $r10 = $r9;
            if ($r9 == null) {
                $r10 = "";
            }
            $r8.loanStatusAnanlytics($r10);
            displayLoanDetails($r7);
        }
        LoanStatusViewModel $r82 = getLoanStatusViewModel();
        $r82.fetchCurrentUser();
    }

    public final void setLoanStatusViewModel(LoanStatusViewModel loanStatusViewModel) {
        Log_OC.getArray(loanStatusViewModel, "<set-?>");
        this.loanStatusViewModel = loanStatusViewModel;
    }
}
