package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPosOrderHistoryBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding emptyHistoryView;
    public final AppCompatTextView filterDate;
    public final AppCompatTextView filterType;
    public final LinearLayout filterView;
    public final ListLoaderViewBinding listLoaderView;
    public final FrameLayout loadNextProgressBar;
    public final RecyclerView orderList;
    private final ConstraintLayout rootView;
    public final AppCompatEditText searchField;

    private FragmentPosOrderHistoryBinding(ConstraintLayout constraintLayout, EmptyHistoryBinding emptyHistoryBinding, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout, ListLoaderViewBinding listLoaderViewBinding, FrameLayout frameLayout, RecyclerView recyclerView, AppCompatEditText appCompatEditText) {
        this.rootView = constraintLayout;
        this.emptyHistoryView = emptyHistoryBinding;
        this.filterDate = appCompatTextView;
        this.filterType = appCompatTextView2;
        this.filterView = linearLayout;
        this.listLoaderView = listLoaderViewBinding;
        this.loadNextProgressBar = frameLayout;
        this.orderList = recyclerView;
        this.searchField = appCompatEditText;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderHistoryBinding bind(View view) {
        int $i0 = C0001R.C0003id.empty_history_view;
        View $r1 = view.findViewById(C0001R.C0003id.empty_history_view);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0001R.C0003id.filter_date;
            AppCompatTextView $r3 = (AppCompatTextView) view.findViewById(C0001R.C0003id.filter_date);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.filter_type;
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C0001R.C0003id.filter_type);
                if (appCompatTextView != null) {
                    $i0 = C0001R.C0003id.filter_view;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(C0001R.C0003id.filter_view);
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.list_loader_view;
                        View $r12 = view.findViewById(C0001R.C0003id.list_loader_view);
                        if ($r12 != null) {
                            ListLoaderViewBinding $r6 = ListLoaderViewBinding.bind($r12);
                            $i0 = C0001R.C0003id.load_next_progress_bar;
                            FrameLayout frameLayout = (FrameLayout) view.findViewById(C0001R.C0003id.load_next_progress_bar);
                            if (frameLayout != null) {
                                $i0 = C0001R.C0003id.order_list;
                                RecyclerView recyclerView = (RecyclerView) view.findViewById(C0001R.C0003id.order_list);
                                if (recyclerView != null) {
                                    $i0 = C0001R.C0003id.search_field;
                                    AppCompatEditText $r9 = (AppCompatEditText) view.findViewById(C0001R.C0003id.search_field);
                                    if ($r9 != null) {
                                        ConstraintLayout $r11 = (ConstraintLayout) view;
                                        FragmentPosOrderHistoryBinding $r10 = new FragmentPosOrderHistoryBinding($r11, $r2, $r3, appCompatTextView, linearLayout, $r6, frameLayout, recyclerView, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r13 = $r122.getResourceName($i0);
        NullPointerException $r14 = new NullPointerException("Missing required view with ID: ".concat($r13));
        throw $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderHistoryBinding inflate(LayoutInflater layoutInflater) {
        FragmentPosOrderHistoryBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPosOrderHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_order_history, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPosOrderHistoryBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
