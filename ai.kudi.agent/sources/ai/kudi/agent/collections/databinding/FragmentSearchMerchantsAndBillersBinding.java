package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import ai.kudi.agent.core.databinding.EmptySearchListBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentSearchMerchantsAndBillersBinding implements InterfaceC8209a {
    public final EmptySearchListBinding emptyState;
    public final ProgressBar idTypesProgressBar;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final EditText searchView;
    public final Toolbar toolbar;

    private FragmentSearchMerchantsAndBillersBinding(LinearLayout linearLayout, EmptySearchListBinding emptySearchListBinding, ProgressBar progressBar, RecyclerView recyclerView, EditText editText, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.emptyState = emptySearchListBinding;
        this.idTypesProgressBar = progressBar;
        this.recyclerView = recyclerView;
        this.searchView = editText;
        this.toolbar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSearchMerchantsAndBillersBinding bind(View view) {
        int $i0 = R$id.emptyState;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            EmptySearchListBinding $r2 = EmptySearchListBinding.bind($r1);
            $i0 = R$id.idTypesProgressBar;
            ProgressBar $r3 = (ProgressBar) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = R$id.recyclerView;
                RecyclerView $r4 = (RecyclerView) view.findViewById($i0);
                if ($r4 != null) {
                    $i0 = R$id.searchView;
                    EditText $r5 = (EditText) view.findViewById($i0);
                    if ($r5 != null) {
                        $i0 = R$id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById($i0);
                        if (toolbar != null) {
                            FragmentSearchMerchantsAndBillersBinding $r7 = new FragmentSearchMerchantsAndBillersBinding((LinearLayout) view, $r2, $r3, $r4, $r5, toolbar);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSearchMerchantsAndBillersBinding inflate(LayoutInflater layoutInflater) {
        FragmentSearchMerchantsAndBillersBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSearchMerchantsAndBillersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_search_merchants_and_billers;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSearchMerchantsAndBillersBinding $r3 = bind($r2);
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
