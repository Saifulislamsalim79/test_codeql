package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
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
public final class FragmentPickerBinding implements InterfaceC8209a {
    public final EmptySearchListBinding emptyState;
    public final ProgressBar idTypesProgressBar;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final EditText searchView;
    public final Toolbar toolbar;

    private FragmentPickerBinding(LinearLayout linearLayout, EmptySearchListBinding emptySearchListBinding, ProgressBar progressBar, RecyclerView recyclerView, EditText editText, Toolbar toolbar) {
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
    public static FragmentPickerBinding bind(View view) {
        int $i0 = C0038R.C0040id.emptyState;
        View $r1 = view.findViewById($i0);
        if ($r1 != null) {
            EmptySearchListBinding $r2 = EmptySearchListBinding.bind($r1);
            $i0 = C0038R.C0040id.idTypesProgressBar;
            ProgressBar $r3 = (ProgressBar) view.findViewById($i0);
            if ($r3 != null) {
                $i0 = C0038R.C0040id.recyclerView;
                RecyclerView $r4 = (RecyclerView) view.findViewById($i0);
                if ($r4 != null) {
                    $i0 = C0038R.C0040id.searchView;
                    EditText $r5 = (EditText) view.findViewById($i0);
                    if ($r5 != null) {
                        $i0 = C0038R.C0040id.toolbar;
                        Toolbar toolbar = (Toolbar) view.findViewById($i0);
                        if (toolbar != null) {
                            FragmentPickerBinding $r7 = new FragmentPickerBinding((LinearLayout) view, $r2, $r3, $r4, $r5, toolbar);
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
    public static FragmentPickerBinding inflate(LayoutInflater layoutInflater) {
        FragmentPickerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.fragment_picker;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPickerBinding $r3 = bind($r2);
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
