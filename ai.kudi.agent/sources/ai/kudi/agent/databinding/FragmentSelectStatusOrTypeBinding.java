package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
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
public final class FragmentSelectStatusOrTypeBinding implements InterfaceC8209a {
    public final EmptySearchListBinding emptyState;
    public final ProgressBar idTypesProgressBar;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final EditText searchView;
    public final Toolbar toolbar;

    private FragmentSelectStatusOrTypeBinding(LinearLayout linearLayout, EmptySearchListBinding emptySearchListBinding, ProgressBar progressBar, RecyclerView recyclerView, EditText editText, Toolbar toolbar) {
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
    public static FragmentSelectStatusOrTypeBinding bind(View view) {
        int $i0 = C0001R.C0003id.emptyState;
        View $r1 = view.findViewById(C0001R.C0003id.emptyState);
        if ($r1 != null) {
            EmptySearchListBinding $r2 = EmptySearchListBinding.bind($r1);
            $i0 = C0001R.C0003id.idTypesProgressBar;
            ProgressBar $r3 = (ProgressBar) view.findViewById(C0001R.C0003id.idTypesProgressBar);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.recyclerView;
                RecyclerView $r4 = (RecyclerView) view.findViewById(C0001R.C0003id.recyclerView);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.searchView;
                    EditText editText = (EditText) view.findViewById(C0001R.C0003id.searchView);
                    if (editText != null) {
                        $i0 = C0001R.C0003id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById(C0001R.C0003id.toolbar);
                        if (toolbar != null) {
                            FragmentSelectStatusOrTypeBinding $r7 = new FragmentSelectStatusOrTypeBinding((LinearLayout) view, $r2, $r3, $r4, editText, toolbar);
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
    public static FragmentSelectStatusOrTypeBinding inflate(LayoutInflater layoutInflater) {
        FragmentSelectStatusOrTypeBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentSelectStatusOrTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_select_status_or_type, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentSelectStatusOrTypeBinding $r3 = bind($r2);
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
