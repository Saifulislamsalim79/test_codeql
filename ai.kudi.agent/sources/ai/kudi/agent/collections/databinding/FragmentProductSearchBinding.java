package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProductSearchBinding implements InterfaceC8209a {
    public final AutoCompleteTextView editTextSearchbar;
    public final LayoutProductRecyclerviewBinding inRecyclerViewProductSearchContainer;
    public final LinearLayout llFragmentProductSearchWrapper;
    private final FrameLayout rootView;
    public final TextView textViewCancelSearch;
    public final View viewDivider;

    private FragmentProductSearchBinding(FrameLayout frameLayout, AutoCompleteTextView autoCompleteTextView, LayoutProductRecyclerviewBinding layoutProductRecyclerviewBinding, LinearLayout linearLayout, TextView textView, View view) {
        this.rootView = frameLayout;
        this.editTextSearchbar = autoCompleteTextView;
        this.inRecyclerViewProductSearchContainer = layoutProductRecyclerviewBinding;
        this.llFragmentProductSearchWrapper = linearLayout;
        this.textViewCancelSearch = textView;
        this.viewDivider = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSearchBinding bind(View view) {
        View $r1;
        View $r12;
        int $i0 = R$id.editText_searchbar;
        AutoCompleteTextView $r2 = (AutoCompleteTextView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = R$id.in_recyclerView_product_search_container))) != null) {
            LayoutProductRecyclerviewBinding $r3 = LayoutProductRecyclerviewBinding.bind($r1);
            $i0 = R$id.ll_fragment_product_search_wrapper;
            LinearLayout $r4 = (LinearLayout) view.findViewById($i0);
            if ($r4 != null) {
                $i0 = R$id.textView__cancel_search;
                TextView $r5 = (TextView) view.findViewById($i0);
                if ($r5 != null && ($r12 = view.findViewById(($i0 = R$id.view_divider))) != null) {
                    FragmentProductSearchBinding $r6 = new FragmentProductSearchBinding((FrameLayout) view, $r2, $r3, $r4, $r5, $r12);
                    return $r6;
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSearchBinding inflate(LayoutInflater layoutInflater) {
        FragmentProductSearchBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProductSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.fragment_product_search;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProductSearchBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        FrameLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public FrameLayout getRoot() {
        FrameLayout r1 = this.rootView;
        return r1;
    }
}
