package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class KudiTypeListLayoutBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final ListLoaderViewBinding getPosListLoaderView;
    public final EmptyHistoryBinding posListEmptyState;
    private final NestedScrollView rootView;
    public final RecyclerView rvOptions;
    public final Toolbar toolbar;
    public final TextView tvDesc;

    private KudiTypeListLayoutBinding(NestedScrollView nestedScrollView, AppBarLayout appBarLayout, ListLoaderViewBinding listLoaderViewBinding, EmptyHistoryBinding emptyHistoryBinding, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.rootView = nestedScrollView;
        this.appBarLayout = appBarLayout;
        this.getPosListLoaderView = listLoaderViewBinding;
        this.posListEmptyState = emptyHistoryBinding;
        this.rvOptions = recyclerView;
        this.toolbar = toolbar;
        this.tvDesc = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiTypeListLayoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        AppBarLayout $r2 = (AppBarLayout) view.findViewById(C0001R.C0003id.app_bar_layout);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.getPosListLoaderView;
            View $r1 = view.findViewById(C0001R.C0003id.getPosListLoaderView);
            if ($r1 != null) {
                ListLoaderViewBinding $r3 = ListLoaderViewBinding.bind($r1);
                $i0 = C0001R.C0003id.posListEmptyState;
                View $r12 = view.findViewById(C0001R.C0003id.posListEmptyState);
                if ($r12 != null) {
                    EmptyHistoryBinding $r4 = EmptyHistoryBinding.bind($r12);
                    $i0 = C0001R.C0003id.rv_options;
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(C0001R.C0003id.rv_options);
                    if (recyclerView != null) {
                        $i0 = C0001R.C0003id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                        if (toolbar != null) {
                            $i0 = C0001R.C0003id.tv_desc;
                            TextView textView = (TextView) view.findViewById(C0001R.C0003id.tv_desc);
                            if (textView != null) {
                                NestedScrollView $r9 = (NestedScrollView) view;
                                KudiTypeListLayoutBinding $r8 = new KudiTypeListLayoutBinding($r9, $r2, $r3, $r4, recyclerView, toolbar, textView);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiTypeListLayoutBinding inflate(LayoutInflater layoutInflater) {
        KudiTypeListLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KudiTypeListLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.kudi_type_list_layout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        KudiTypeListLayoutBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
