package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.dip.library.SafeViewPager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewTransactionsBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding emptyHistoryView;
    public final AppCompatButton incompleteTransactionsButton;
    public final AppCompatImageView incompleteTransactionsIndicator;
    public final FrameLayout nextProgressBar;
    private final LinearLayout rootView;
    public final AppCompatEditText searchField;
    public final ShimmerFrameLayout summaryLoaderView;
    public final SafeViewPager summaryPager;
    public final FrameLayout summaryWrapper;
    public final RecyclerView transactionList;
    public final TextView warningText;

    private ViewTransactionsBinding(LinearLayout linearLayout, EmptyHistoryBinding emptyHistoryBinding, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatEditText appCompatEditText, ShimmerFrameLayout shimmerFrameLayout, SafeViewPager safeViewPager, FrameLayout frameLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.emptyHistoryView = emptyHistoryBinding;
        this.incompleteTransactionsButton = appCompatButton;
        this.incompleteTransactionsIndicator = appCompatImageView;
        this.nextProgressBar = frameLayout;
        this.searchField = appCompatEditText;
        this.summaryLoaderView = shimmerFrameLayout;
        this.summaryPager = safeViewPager;
        this.summaryWrapper = frameLayout2;
        this.transactionList = recyclerView;
        this.warningText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTransactionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.empty_history_view;
        View $r1 = view.findViewById(C0001R.C0003id.empty_history_view);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0001R.C0003id.incomplete_transactions_button;
            AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(C0001R.C0003id.incomplete_transactions_button);
            if (appCompatButton != null) {
                $i0 = C0001R.C0003id.incomplete_transactions_indicator;
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C0001R.C0003id.incomplete_transactions_indicator);
                if (appCompatImageView != null) {
                    $i0 = C0001R.C0003id.next_progress_bar;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(C0001R.C0003id.next_progress_bar);
                    if (frameLayout != null) {
                        $i0 = C0001R.C0003id.search_field;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) view.findViewById(C0001R.C0003id.search_field);
                        if (appCompatEditText != null) {
                            $i0 = C0001R.C0003id.summary_loader_view;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(C0001R.C0003id.summary_loader_view);
                            if (shimmerFrameLayout != null) {
                                $i0 = C0001R.C0003id.summary_pager;
                                SafeViewPager $r8 = (SafeViewPager) view.findViewById(C0001R.C0003id.summary_pager);
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.summary_wrapper;
                                    FrameLayout $r9 = (FrameLayout) view.findViewById(C0001R.C0003id.summary_wrapper);
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.transaction_list;
                                        RecyclerView $r10 = (RecyclerView) view.findViewById(C0001R.C0003id.transaction_list);
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.warning_text;
                                            TextView $r11 = (TextView) view.findViewById(C0001R.C0003id.warning_text);
                                            if ($r11 != null) {
                                                LinearLayout $r13 = (LinearLayout) view;
                                                ViewTransactionsBinding $r12 = new ViewTransactionsBinding($r13, $r2, appCompatButton, appCompatImageView, frameLayout, appCompatEditText, shimmerFrameLayout, $r8, $r9, $r10, $r11);
                                                return $r12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r14 = view.getResources();
        String $r15 = $r14.getResourceName($i0);
        NullPointerException $r16 = new NullPointerException("Missing required view with ID: ".concat($r15));
        throw $r16;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTransactionsBinding inflate(LayoutInflater layoutInflater) {
        ViewTransactionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewTransactionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.view_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewTransactionsBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
